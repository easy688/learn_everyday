public class SingletonDemo {
    private static volatile SingletonDemo singletonDemo = null;

    private SingletonDemo() {
        System.out.println("构造方法");
    }

    public static SingletonDemo getInstance() {
        if (singletonDemo == null) {
            synchronized (SingletonDemo.class) {
                if (singletonDemo == null) {
                    singletonDemo = new SingletonDemo();
                }
            }

        }
        return singletonDemo;
    }

    public static void main(String[] args) {
 /*       System.out.println(SingletonDemo.getInstance()==SingletonDemo.getInstance());
        System.out.println(SingletonDemo.getInstance()==SingletonDemo.getInstance());
        System.out.println(SingletonDemo.getInstance()==SingletonDemo.getInstance());*/
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                SingletonDemo.getInstance();
            }, Thread.currentThread().getName() + ":" + i).start();
        }
    }
}
