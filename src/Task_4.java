import java.util.Scanner;

public class Task_4 {
    /* Составить программу, которая уменьшает первое введенное число в 2 раза,
    если оно больше второго введеного числа по абсолютной величине
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter your first number");
        int num1 = sc.nextInt();
        System.out.println("Please, enter your second number");
        int num2 = sc.nextInt();
        sc.close();
        
        if (num1> Math.abs(num2)) {
            num1/=2;}
        System.out.println("Now, the first number = "+num1);
    }

}
