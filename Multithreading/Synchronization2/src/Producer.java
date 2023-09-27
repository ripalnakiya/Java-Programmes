public class Producer extends Thread{
    private MyData d;

    public Producer(MyData d) {
        this.d = d;
    }

    public void run() {
        int i = 1;
        while ( i < 21) {
            d.set(i);
            System.out.println("Producer " + i);
            i++;
        }
    }
}
