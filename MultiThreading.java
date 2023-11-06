class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getId() + " Value " + i);
        }
    }
}
public class MultiThreading {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        MyThread t2 = new MyThread();
        t2.start();
        Runnable myRunnable = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getId() + " Runnable Value " + i);
            }
        };
        Thread t3 = new Thread(myRunnable);
        t3.start();
    }
}