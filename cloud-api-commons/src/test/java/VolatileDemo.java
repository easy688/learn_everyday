public class VolatileDemo {

    public static void main(String[] args) {
        Data data=new Data();
        for(int i=0;i<10;i++){
            new Thread(()->{
                for(int j=0;j<2000;j++){
                    data.addOne();
                    data.addAgain();
                }
            },Thread.currentThread().getName()+":"+i).start();
        }
        while(Thread.activeCount()>2){
            Thread.yield();
        }
        System.out.println(Thread.currentThread().getName()+"intValue:"+data.getNumber());
        System.out.println(Thread.currentThread().getName()+"atomicInteger:"+data.getAtomicInteger());
    }




}
