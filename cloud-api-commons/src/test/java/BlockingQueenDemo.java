import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class BlockingQueenDemo {
   /* private volatile boolean flag=true;
    private BlockingQueue blockingQueue=null;
    private AtomicInteger atomicInteger=new AtomicInteger();
    public BlockingQueenDemo ( BlockingQueue blockingQueue){
        this.blockingQueue=blockingQueue;
    }
    public void provide(){
        int data;
        boolean retFlag;
        while(flag){
            data=atomicInteger.incrementAndGet();
            try {
                retFlag=blockingQueue.offer(data,2L, TimeUnit.SECONDS);
                if(retFlag){
                    System.out.println(Thread.currentThread().getName()+"插入成功");
                }else{
                    System.out.println(Thread.currentThread().getName()+"插入失败");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void consume(){
        int data;

        while(flag){
            data=atomicInteger.decrementAndGet();
            try {
                data=blockingQueue.poll(2L, TimeUnit.SECONDS);
                if(retFlag){
                    System.out.println(Thread.currentThread().getName()+"插入成功");
                }else{
                    System.out.println(Thread.currentThread().getName()+"插入失败");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }*/

}
