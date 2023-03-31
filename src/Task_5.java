import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args){
        /* Известен вес боксера-любителя.
         Известно. что вес таков, что боксер может быть отнесен к одной из 4х весовых категорий:
            1 категория - лёгкий вес (до 60 кг)
            2 категория - средний вес (от 60 до 75 кг)
            3 категория - тяжелый вес (от 75 до 91 кг)
            4 категория - супертяжелый вес (от 91 кг)    */
        System.out.println("Please, enter your weight");
        Scanner sc = new Scanner(System.in);
        short weight = sc.nextShort();
        sc.close();
        if (weight>=91) {
            System.out.println("You are at the 4 category");
        } else if (weight >=75) {
            System.out.println("You are at the 3 category");
        } else if (weight>=60) {
            System.out.println("You are at the 2 category");
        } else {
            System.out.println("You are at the 1 category");
        }
    }
}
