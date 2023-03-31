import java.util.Scanner;

public class Task_1 {
    //TASK_1
//   С некоторого момента прошло 234 дня
//   Сколько полных недель прошло за этотпериод? А месяцев?
    public static void main(String[] args) {

        short days = 234;
        System.out.println("С некоторого момента прошло 234 дня");
        float weeks = (float) (days / 7);
        System.out.println("234 дня это " + weeks + " недели");
        float mounths = (float) (days / 30);
        System.out.println(weeks + " недели это " + mounths + "месяцев");

    }
}