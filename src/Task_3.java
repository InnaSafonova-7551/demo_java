import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
              /*Дано натуральное число.
        Нужно определить является ли оно четным.
        Оканчивается ли цифрой 7.
         */
        System.out.println("Please, enter your number here:");
        Scanner num = new Scanner(System.in);
        int num1 = num.nextInt();
        num.close();
       if (num1%2==0) {
           System.out.println("Number is even");
       } else {
           System.out.println("Number is uneven");
       }

        if (num1%10==7) {
        System.out.println("The number is ending in 7");
        } else {
        System.out.println("The number isn't ending in 7");
        }

    }

}
