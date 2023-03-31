import java.util.Scanner;
public class Task_7 {
    public static void main(String[] args) {
        // В чемпионате по футболу команде за выигрыш дается 3 очка, за проигрыш — 0,
        //за ничью — 1. Известно количество очков, полученных командой за игру.
        //Определить словесный результат игры (выигрыш, проигрыш или ничья).
        System.out.println("Please, enter how many bonus the team got");
        Scanner sc = new Scanner(System.in);
        byte bonus = sc.nextByte();
        sc.close();

        byte win = 3;
        byte loss = 0;
        byte draw = 1;

        if (bonus == win) {
            System.out.println("Congratulation! You are winner!");
        } else if (bonus==loss) {
            System.out.println("Sorry! You lost!");
        } else if (bonus==draw) {
            System.out.println("It`s a draw! Get ready for new competitions!");
        } else {
            System.out.println("Sorry, this value is wrong!");
        }

    }
}
