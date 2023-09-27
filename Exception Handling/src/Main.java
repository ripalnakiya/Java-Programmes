public class Main {
    static int area(int a, int b) throws NegativeDimensionException {
        if (a < 0 || b < 0) {
            throw new NegativeDimensionException();
        }
        return a * b;
    }

    static void method1() throws NegativeDimensionException{
        System.out.println("Area is " + area(10, -5));
    }
    public static void main(String[] args) {
        try{
            method1();
        }
        catch (NegativeDimensionException e)
        {
            System.out.println(e);
        }
    }
}