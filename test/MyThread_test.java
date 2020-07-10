import thread_demo.MyThread;

public class MyThread_test {
    public static void main(String[] args) {
        System.out.println("这是main线程");
        MyThread mt = new MyThread("小强");
        mt.start();
        for (int i = 0;i < 20;i++){
            System.out.println("小明"+i);
        }
    }
}
