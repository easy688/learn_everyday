import sun.rmi.runtime.NewThreadAction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicStampedReference;

public class AtomicReferceDemo {
    public static void main(String[] args) {
        AtomicReference<Data> atomicReference=new AtomicReference<>();
        Data data=new Data(1,new AtomicInteger(2));
        Data data2=new Data(3,new AtomicInteger(4));
        atomicReference.set(data);
        System.out.println("before:"+atomicReference.get());
        atomicReference.compareAndSet(data,data2);
        System.out.println("after:"+atomicReference.get());


        AtomicStampedReference<Integer> atomicStampedReference=new AtomicStampedReference<>(10,1);

        new Thread(()->{
            int stamp=atomicStampedReference.getStamp();
            atomicStampedReference.compareAndSet(10,11,stamp,stamp+1);
            atomicStampedReference.compareAndSet(11,10,stamp+1,stamp+2);
            System.out.println(atomicStampedReference.getReference()+":"+atomicStampedReference.getStamp());
        },"1").start();
        new HashMap<String,String>(16);
        List list=new ArrayList<Map<String,String>>(10);


    }
}
