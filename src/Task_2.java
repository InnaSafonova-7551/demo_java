import java.util.Scanner;

public class Task_2 {
    //  2.Дано двузначное число 39.
    //  Найти:
//        число десятков в нем;
//        число единиц в нем;
//        сумму его цифр;
//        произведение его цифр.

    public static void main(String[] args) {

        short num1 = 39;
        short dozens = (short) (num1 / 10);
        System.out.println("This number have " + dozens + " dozens");

        short units = (byte) (num1 % 10);
        System.out.println("And this number have " + units + " units");

        short sum = (short) (dozens + units);
        System.out.println("Sum of its numbers is " + sum);

        short mult = (short) (dozens * units);
        System.out.println("Multiplication of its numbers is " + mult);

    }



}
