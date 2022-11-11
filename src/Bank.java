import java.util.Scanner;

public class Bank {
    public static void recursion (int a, int sum){
        int last = sum - a;

        if (last <= 0) {
            System.out.println("Ви погасили весь борг, сума переплати становить: " + (a - sum));
        } else {
            System.out.println("Сума боргу становить " + last);
                  recursion(a, last);
        }
    }
    public static void main(String[] args) {
        System.out.println("Введіть суму проплати");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int sum = 700;
        recursion (a,sum);

    }
}
