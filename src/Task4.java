import java.util.Scanner;

public class Task4 {
    static int arithmeticMethod (int a1, int b1, int c1) {
        int mid = 0;
        mid = (a1+b1+c1)/3;
        return mid;
    }
    static int arithmeticMethod (int a1, int b1, int c1, int d1) {
        int mid = 0;
        mid = (a1+b1+c1+d1)/4;
        return mid;
    }
    static int  arithmeticMethod (int a1, int b1, int c1, int d1, int f1) {
        int mid = 0;
        mid = (a1+b1+c1+d1+f1)/5;
        return mid;
    }
    static void Method (int mid1, int mid2, int mid3) {
        int middle = (mid1+mid2+mid3)/3;
        System.out.println("Середнє значення для отриманих значень з трьх методів: " + middle);
        int max = (mid1>mid2) ?  mid1  : mid2;
        int maximum = (max > mid3) ? max : mid3;
        System.out.println("Найбільше число серез отриманих значень з трьх методів: " + maximum);
        int min = (mid1<mid2) ?  mid1  : mid2;
        int minimum = (min < mid3) ? min : mid3;
        System.out.println("Найменше число серез отриманих значень з трьх методів: " + minimum);
    }

    public static void main(String[] args) {
        System.out.println("Введіть п'ять чисел");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int f = input.nextInt();
        System.out.println("Середнє значення для трьох змінних: "  + arithmeticMethod (a,b,c));
        System.out.println("Середнє значення для чотирьох змінних: " + arithmeticMethod (a,b,c,d));
        System.out.println("Середнє значення для п'яти змінних: " + arithmeticMethod (a,b,c,d,f));
        Method(arithmeticMethod (a,b,c), arithmeticMethod (a,b,c,d), arithmeticMethod (a,b,c,d,f) );
    }
}
