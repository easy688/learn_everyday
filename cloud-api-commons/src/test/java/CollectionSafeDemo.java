
import cn.hutool.core.util.IdUtil;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionSafeDemo {
    public static void main(String[] args) {
        //List<String> list = new ArrayList<>();
        //List<String> list = new Vector<>();
        //List<String> list = Collections.synchronizedList(new ArrayList<>());
        List<String> list =new CopyOnWriteArrayList<>();//写时复制
        for (int i = 0; i < 100; i++) {
           new Thread(() ->{
                String simpleUUID = IdUtil.simpleUUID();
                list.add(simpleUUID);
            }, String.valueOf(i)).start();
        }
    }
}
