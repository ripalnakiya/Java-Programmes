public class VariableArguments {

    static int sum(int... A) {
        int s = 0;
        System.out.println(A.length);
        for (int x : A) {
            s += x;
        }
        return s;
    }

    public static void main(String[] args) {
        int val = sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(val);
    }
}
