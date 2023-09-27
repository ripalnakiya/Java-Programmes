public class Main {
    public static void main(String[] args) {
        MyThread t = new MyThread("Thread 1");

        System.out.println("Thread Id: " + t.getId());
        System.out.println("Thread name: " + t.getName());
        System.out.println("Thread Priority: " + t.getPriority());
        System.out.println("Thread State: " + t.getState());
        t.start();
        System.out.println("Now, Thread State: " + t.getState());
        t.interrupt();
    }
}