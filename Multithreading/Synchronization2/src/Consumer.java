public class Consumer extends Thread{
    private MyData d;

    public Consumer(MyData d) {
        this.d = d;
    }

    public void run() {
        int i = 1;
        while (i < 21) {
            System.out.println("Consumer " + d.get());
            i++;
        }
    }
}
