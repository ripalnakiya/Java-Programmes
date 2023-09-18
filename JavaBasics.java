import java.util.Scanner;

public class JavaBasics
{
    public static void main(String[] args)
    {
        System.out.print("Hello World!\n");

        int a = 10;
        int b = 5;
        System.out.println(a);
        System.out.println(a + b);

        String str = "Captain Jack";
        System.out.println(str + "\n");

        Scanner sc = new Scanner(System.in);
        
        String name = sc.nextLine();            // Multiples Words
        System.out.println("Hello " + name);

        sc.close();
    }
}
