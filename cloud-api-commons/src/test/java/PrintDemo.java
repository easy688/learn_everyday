import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrintDemo {
    Lock lock=new ReentrantLock();
    Condition c1=lock.newCondition();
    Condition c2=lock.newCondition();
    Condition c3=lock.newCondition();
    Integer number=1;

    public  void  print5(){
        lock.lock();
        try{
            while(number!=1){
                c1.await();
            }
            for (int i = 0; i <5 ; i++) {
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
            number=2;
            c2.signal();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public  void  print10(){
        lock.lock();
        try{
            while(number!=2){
                c2.await();
            }
            for (int i = 0; i <10 ; i++) {
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
            number=3;
            c3.signal();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public  void  print15(){
        lock.lock();
        try{
            while(number!=3){
                c3.await();
            }
            for (int i = 0; i <15 ; i++) {
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
            number=1;
            c1.signal();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        PrintDemo printDemo=new PrintDemo();
        for (int i = 0; i < 3; i++) {
            new Thread(()->{
                printDemo.print5();
            },"AAA").start();
            new Thread(()->{
                printDemo.print10();
            },"BBB").start();
            new Thread(()->{
                printDemo.print15();
            },"CCC").start();
        }

    }

}
