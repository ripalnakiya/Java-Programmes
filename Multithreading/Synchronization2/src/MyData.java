public class MyData {
    private int value;
    private boolean flag = true;
    synchronized public void set(int value) {
        while (flag != true)
            try {
                wait();
            }catch (Exception e) { }

        this.value = value;
        flag = false;
        notify();
    }

    synchronized public int get() {
        int x = 0;
        while (flag != false)
            try{
                wait();
            } catch (Exception e) {}
        x = value;
        flag = true;
        notify();
        return x;
    }
}
