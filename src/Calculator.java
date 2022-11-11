import java.util.Scanner;

public class Calculator {
     static String calculate (int a1, int b1, int c1) {

         int a =  a1 / 5;
         int b = b1 / 5;
         int c = c1 / 5;
         return (a + "," + b + "," + c);
     }
    public static void main(String[] args) {
        System.out.println("Введіть три цілих числа");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        System.out.println(calculate(a,b,c));
    }

}
