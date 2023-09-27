public class MyThread extends Thread{
    public MyThread(String name) {
        // calling super class constructor i.e. Thread(String name)
        super(name);

        // Priority can be set in the main() also, using the Thread object
        setPriority(MIN_PRIORITY);

    }

    public void run() {
        int counter = 1;
        while (true) {
            System.out.println(counter);
            counter++;
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
