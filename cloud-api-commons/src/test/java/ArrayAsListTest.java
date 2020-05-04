import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
public class ArrayAsListTest{
    public static void main(String[] args) {
        /**
         * 使用工具类Arrays.asList()把数组转换成集合时，
         * 不能使用其修改集合相关的方 法，它的add/remove/clear
         * 方法会抛出UnsupportedOperationException 异常
         */
        String[] array=new String[]{"1","2","3"};
        List<String> list= Arrays.asList(array);
        list.set(0,"6");
        System.out.println(array+":"+list);
        //list.add("4");

       /* List<String> list=new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        System.out.println(list);
        Data data=null;
        Data d=new Data();
        d.setNumber(1);
        Data data1=Optional.ofNullable(d).orElse(data);
        System.out.println(data1);
        Integer a=1;
        Integer b=1;
        System.out.println(a==b);
        Integer c=128;
        Integer e=128;
        System.out.println(c==e);*/


    }
}
