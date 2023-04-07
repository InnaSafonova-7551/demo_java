public class Task_10 {
    public static void main(String[] args) {
        /* Напечатать числа в виде следующей таблицы
        5 5 5 5 5 5
        5 5 5 5 5 5
        5 5 5 5 5 5
        5 5 5 5 5 5
         */
        printNumbers(5);
        printNumbers(5);
        printNumbers(5);
        printNumbers(5);

    }
    public static void printNumbers(int a) {
        System.out.printf("%d %d %d %d %d %d\n", a, a, a, a, a, a);
    }
}
