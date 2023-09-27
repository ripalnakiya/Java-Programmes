public class Main {
    public static void main(String[] args) {
        MyData data = new MyData();

        MyThread1 thd1 = new MyThread1(data);
        MyThread2 thd2 = new MyThread2(data);

        thd2.start();
        thd1.start();
    }
}