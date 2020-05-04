import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>(16);
        map.put("1","aaa");
        map.put("2","bbb");
        map.forEach((k,v)-> System.out.println(k+":"+v));


    }
}
