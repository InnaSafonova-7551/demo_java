import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        /* Напишите метод, который бы возвращал в консоль
        true, если число число больше 5
        false, если число меньше 5
         */
        System.out.println("Enter you number, please");
        Scanner sc = new Scanner(System.in);
        byte num1 = sc.nextByte();
        sc.close();
        System.out.println(num2(num1));
    }
    public static boolean num2 (byte num) {
        boolean result = true;
        if (num > 5) {
            return true;
        }
        if (num < 5) {
            return false;
        }
        return result;
    }
    }

