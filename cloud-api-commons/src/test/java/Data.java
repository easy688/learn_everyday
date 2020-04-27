import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.concurrent.atomic.AtomicInteger;

@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
public class Data {
    private  volatile  Integer number=0;
    private AtomicInteger atomicInteger=new AtomicInteger();

    public void add(){
        this.setNumber(60);
    }
    public void addOne(){
        this.setNumber(this.getNumber().intValue()+1);;
    }
    public void addAgain(){
        atomicInteger.getAndIncrement();
    }
}
