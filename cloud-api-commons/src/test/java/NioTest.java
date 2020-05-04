import cn.hutool.socket.nio.NioServer;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.Objects;

public class NioTest extends NioServer {
    private ByteBuffer buf=ByteBuffer.allocate(1024);
    public NioTest(int port) {
        super(port);
    }

    @Override
    protected void read(SocketChannel socketChannel) {
        try{
            while(socketChannel.read(buf)>0){
                buf.flip();
                System.out.println("接收到："+new String(buf.array()));
                buf.clear();
            }
        }catch(IOException e){
             e.printStackTrace();
        }

    }

    @Override
    protected void write(SocketChannel socketChannel) {
        try{
            buf.put("服务端接收数据成功".getBytes());
            buf.flip();
            socketChannel.write(buf);
            buf.clear();
        }catch(IOException e){
            e.printStackTrace();
        }


    }


    public static void main(String[] args) throws  Exception{
        String name="123";
        String oldName=new String("123");
        System.out.println(name==oldName);
        boolean b=Objects.equals(name,oldName);//比较两个对象是否相等
        System.out.println(b);
        System.out.println(InterTest.num);
        NioServer nioTest = new NioTest(9388);
        nioTest.listen();
        nioTest.close();


    }
}
