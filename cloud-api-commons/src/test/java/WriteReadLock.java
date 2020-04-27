import org.springframework.boot.origin.SystemEnvironmentOrigin;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 读写锁，写互斥，读不互斥
 */
public class WriteReadLock {
    Map<String,String> map=new HashMap<>(16);
    ReadWriteLock lock=new ReentrantReadWriteLock();
    public void put(String key,String value){
        lock.writeLock().lock();
        try{
            System.out.println(Thread.currentThread().getName()+":正在写入");
            map.put(key,value);
            System.out.println(Thread.currentThread().getName()+"写入完成");
        }finally {
            lock.writeLock().unlock();
        }


    }
    public void get(String key){
        lock.readLock().lock();
        try{
            System.out.println(Thread.currentThread().getName()+":正在读取");
            map.get(key);
            System.out.println(Thread.currentThread().getName()+"读取完成");
        }finally {
            lock.readLock().unlock();
        }

    }

    public static void main(String[] args) {
        WriteReadLock writeReadLock=new WriteReadLock();
        for (int i = 0; i < 4; i++) {
            String a=String.valueOf(i);
            new Thread(()->{
                writeReadLock.put(a,a);
                writeReadLock.get(a);
            },a).start();
        }
    }
}
