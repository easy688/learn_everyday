import java.sql.SQLOutput;
import java.util.concurrent.atomic.AtomicInteger;

public class CasDemo {

    public static void main(String[] args) {

        AtomicInteger atomicInteger = new AtomicInteger(5);
        /**
         *  compareAndSet比较并交换，如果现在的值和期望的（第一个参数）相等，则将其更新为新的值（第二个参数是更新后的值），
         *  如果不相等,则返回false,并且不做修改
         */
        System.out.println(atomicInteger.compareAndSet(5, 2019) + ":" + atomicInteger.get());
        System.out.println(atomicInteger.compareAndSet(5, 2020) + ":" + atomicInteger.get());

    }
}
