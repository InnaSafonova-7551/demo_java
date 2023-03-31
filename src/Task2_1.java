import java.util.Scanner;

public class Task2_1 {
    public static void main(String[] args) {
         /* Дано трехзначное число. Найти:
        - Сколько в нем единиц, десяток, сотен
        - Сумму его цифр, произведение его цифр */

        System.out.println("Введите ваше трехзначное число ");
        Scanner sc = new Scanner(System.in);
        short num = sc.nextShort();
        sc.close();

        short unit  = (short) (num % 10);
        System.out.println("There are "+ unit + " units in your three-digit number");

        short dozens = (short) ((num / 10)%10);
        System.out.println("There are "+ dozens + " dozens in your three-digit number");
        short hund = (short) (num / 100);
        System.out.println("There are "+ hund + " hundrets in your three-digit number");
        short sum = (short) (unit + dozens + hund);
        System.out.println("Sum of numbers of your three-digit number = " + sum);
        int mult = (int) (unit * dozens * hund);
        System.out.println("Multiplication of numbers of your three-digit number = " + mult);
    }
}
