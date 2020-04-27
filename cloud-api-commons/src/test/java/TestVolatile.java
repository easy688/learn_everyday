import java.util.concurrent.TimeUnit;

public class TestVolatile {

    public static void main(String[] args) {
        Data data=new Data();
        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"before number value:"+data.getNumber());
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            data.add();
            System.out.println(Thread.currentThread().getName()+"after number value:"+data.getNumber());

        },"AAA").start();
        while(data.getNumber().intValue()==0){

        }
        System.out.println(Thread.currentThread().getName()+"number value:"+data.getNumber());

    }

}
