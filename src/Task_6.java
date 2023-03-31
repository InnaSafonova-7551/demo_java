import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        /* Составить программу, которая в зависимости от порядкового дня недели (1,2..)
        выводит на экран его название (Понедельник, вторник..)
         */
        System.out.println("Please, enter the number of week day");
        Scanner sc = new Scanner(System.in);
        byte day = sc.nextByte();
        sc.close();
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("You've entered a value that doesn't indicate the day of the week");
        }
    }
}
