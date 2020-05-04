import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubListTest {
    /**
     *     ArrayList的subList结果不可强转成ArrayList，否则会抛出 ClassCastException异 常，
     *     即 java.util.RandomAccessSubList cannot be cast to java.util.ArrayList。
     *     说明：subList 返回的是ArrayList 的内部类 SubList，并不是 ArrayList 而是ArrayList
     *     的一个视图，对 于 SubList 子列表的所有操作最终会反映到原列表上。
     */
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("1");
        list.add("2");
        List<String> subList=list.subList(0,1);
        subList.add("3");
        System.out.println(subList);
        System.out.println(subList.get(0));
        System.out.println(list);
    }
}
