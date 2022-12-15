package thread.status;

public class WaitNotifyExample {

    public static void main(String[] args) {

        WorkObject sharedObject = new WorkObject();

        Thread1 thread1 = new Thread1(sharedObject);
        Thread2 thread2 = new Thread2(sharedObject);

        thread1.start();
        thread2.start();
    }
}
