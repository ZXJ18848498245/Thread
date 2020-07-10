public class LambdaRunnable {
    public static void main(String[] args) {
        new Thread(()-> System.out.println("多线程任务执行！")).start();
    }
}
