import java.time.Instant;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.LongAdder;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DateTest {
    public static void main(String[] args) {
        System.out.println(Instant.now());
        AtomicInteger count = new AtomicInteger();
        count.addAndGet(1);
        LongAdder longAdder=new LongAdder();
        Lock lock=new ReentrantLock();
        boolean isLocked=lock.tryLock();
        if(isLocked){
            try{

            }catch (Exception e){

            }finally {
                lock.unlock();
            }

        }
    }
}
