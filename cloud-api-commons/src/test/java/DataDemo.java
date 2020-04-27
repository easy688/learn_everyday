import lombok.AllArgsConstructor;
import lombok.Getter;
@AllArgsConstructor
public enum DataDemo {
     ONE(1,"赵国"),TWO(2,"齐国"),THREE(3,"燕国"),FOUR(4,"魏国"),FIVE(5,"楚国"),SIX(6,"韩国");
     @Getter private int num;
     @Getter private String name;

    public static DataDemo getDataDemo(int index){
        DataDemo[] dataDemos=DataDemo.values();
        for(DataDemo dataDemo:dataDemos){
            if(dataDemo.getNum()==index){
                return dataDemo;
            }
        }
        return null;
    }
}
