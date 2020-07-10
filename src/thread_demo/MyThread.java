package thread_demo;

public class MyThread extends Thread {
    public  MyThread(String name){
        super(name);
    }

    @Override
    public void run() {
        super.run();
        for (int i = 0;i<20;i++){
            //getname方法 来自父类
            System.out.println(getName()+i);
        }
    }
}
