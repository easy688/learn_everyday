import java.util.concurrent.CountDownLatch;

public class CountDownDemo {


    public static void main(String[] args) {
        CountDownLatch countDownLatch=new CountDownLatch(6);
        for (int i = 1; i < 7; i++) {
            new Thread(()->{
                System.out.println(Thread.currentThread().getName()+"灭");
                countDownLatch.countDown();
            },DataDemo.getDataDemo(i).getName()).start();
        }
        try {
            countDownLatch.await();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("统一");
    }
}
