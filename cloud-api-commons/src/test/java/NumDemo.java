public class NumDemo {
    /**
     *    i++先赋值再运算，例如 a=i++,先赋值a=i,后运算i=i+1,所以结果是a==1
     *    ++i先运算再赋值，例如 a=++i,先运算i=i+1,后赋值a=i,所以结果是a==2;
     *    赋值操作，最后计算
     *    =右边的从左到右加载值依次压入操作数栈
     *    实际先算哪个，看运算符优先级
     *    自增、自减操作都是直接修改变量的值，不经过操作数栈
     *    最后的赋值之前，临时结果也是存储在操作数栈中
     */

    public static void main(String[] args) {
        int i=1;
        i=i++; //i=1;i=i+1
        System.out.println("i===="+i);//i=1因为i先赋值等于1,然后再进行+1操作
        int j=i++;//j=1,i=i+1
        System.out.println("i====-===="+i);
        int k=i+ ++i *i++;// 2+3*3
        System.out.println("i="+i);
        System.out.println("j="+j);
        System.out.println("k="+k);

        //i=i++;先把i=1放入操作栈中，然后i++,此时局部变量i=2,最后进行赋值操作，1覆盖掉2
        //int j=i++;先是i=1放入啊操作栈中，i自增等于2，此时局部变量i=2,最后进行赋值操作，将i=1赋值给j
    }
}
