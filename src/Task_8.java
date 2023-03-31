import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        //Найти длину окружности радиуса 4.
        // L= 2Pir
     Short rad = 4;
     float L = (float) (rad * 2 * Math.PI);
     System.out.println("Circumference of radius 4 = "+L);
     System.out.println("Please, enter your value of radius");
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        sc.close();
        float circum = (float) (radius * 2 * Math.PI);
        System.out.println("Circumference your value of radius = "+ circum);
    }
}
