public class Task_9 {
    public static void main(String[] args) {
  /* Известно значение температуры по шкале Цельсия.
  Необходимо найти:
  - Значение температуры по шкале Фаренгейта (*1,8+32)
  - Значение температуры по шкале Кельвина (273,15 К = 0 С)
   */
        float TempC = 36.6f;
        float TempF = (float)(TempC * 1.8+32);
        float TempK = (float) (TempC + 273.15);
        System.out.println("Degrees fahrenheit = "+ TempF );
        System.out.println("Degrees Kelvin = " + TempK );

    }
}
