import java.util.Scanner;
public class Delivery {
    static int factorialMethod (int a) {
        if (a == 0)
        return 1;
        else {
            return a * factorialMethod(a - 1);
        }
    }
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть число - кількість клієнтів");
        int N = input.nextInt();
        int factorial = factorialMethod (N);
        System.out.print("Кількість можливих варіантів доставлення товару для " + N + " клієнтів = " + factorial);

// На кожний рекурсивний виклик потрібна досить значна кількість оперативної пам'яті, особливо при великій глибині рекурсії.
// За надмірно великої глибини рекурсії, як наприклад при обчисленні факторіалу числа, може настати переповнення стека викликів.
// Тому рекурсивний метож недоцільно використовувати, краще скористатись звичайним циклом.
// Як на мене, рекурсія має перевагу в тому, що цей метод є більш читабельним і легшим для аналізу.

    }
}
