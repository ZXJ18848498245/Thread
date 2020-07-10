import thread_demo.MyRunnable;

public class MyRunnable_test {
    public static void main(String[] args) {
        System.out.println("这是main线程");
        MyRunnable mr = new MyRunnable();
        Thread t = new Thread(mr,"小强");
        Thread t2 = new Thread(mr,"小米");

        t.start();
        t2.start();
        for (int i = 0;i < 20;i++){
            System.out.println("小花"+i);
        }
    }
}
