import cn.hutool.socket.nio.NioClient;

import java.nio.ByteBuffer;

public class Hutool {
    private String ip;
    private int port;
    private NioClient nioClient = null;
    private ByteBuffer buf =null;


    public Hutool(String ip, int port) {
        this.ip = ip;
        this.port = port;
        nioClient=new NioClient(ip, port);
        buf= ByteBuffer.allocate(1024);
    }

    public void clientWrite(String data) {
        buf.put(data.getBytes());
        buf.flip();
        nioClient.write(buf);
        buf.clear();
    }
    public void clientRead() {
        nioClient.read(buf);
        buf.flip();
        System.out.println("客户端接收到："+new String(buf.array()));
        buf.clear();
    }
    public void close(){
        nioClient.close();
    }

    public static void main(String[] args) {
        Hutool hutool = new Hutool( "127.0.0.1",9388);
        hutool.clientWrite("你好啊");
        while(true){
            hutool.clientRead();
        }


    }
}
