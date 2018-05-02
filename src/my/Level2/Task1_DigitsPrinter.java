package my.Level2;

import java.util.Scanner;

/*Вывод в консоль цифр целого числа.  Если число отрицательное, вывести знак «-».
Использование преобразования числа в строку запрещено.
void outputDigits(int n)
Входные аргументы: int. Тип результата: Вывод на экран
Пример
Входные аргументы |  Результат
------------------|----------------
       147292	  |   1 4 7 2 9 2
------------------|----------------
      -147292	  | - 1 4 7 2 9 2

*/
public class Task1_DigitsPrinter {
    public static int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int n = scanner.nextInt();
        return n;
    }

    /* Как включить эти два метода в код, чтобы scanner не вызывался повторно
       при сохранении условия: void outputDigits(int n)

      public static int numberOfCharacters (int numbers){
         int numberOfCharacters=0;
         for (int i = numbers; i>0; i=i/10){
            numberOfCharacters++;
         }
         return numberOfCharacters;
     }
     public  static int zeroMultiplier (int numberOfCharacters){
         int zeroMultiplier = 10;
         for (int i = 1; i< numberOfCharacters; i++){
             zeroMultiplier = zeroMultiplier*10;
         }
         return zeroMultiplier; // int n;
     }*/
    public static void outputDigits(int n) {
        if (n < 0) {
            n = -1 * n;
            System.out.print("- ");
        }
        int numberOfCharacters = 0;
        int zeroMultiplier = 10;
        for (int i = n; i > 0; i = i / 10) {//число знаков
            numberOfCharacters++;
        }
        for (int i = 1; i < numberOfCharacters; i++) {//10^числа знаков
            zeroMultiplier = zeroMultiplier * 10;
        }
        if (n < 0) {
            System.out.print("- ");
        }
        for (int i = 10; i <= zeroMultiplier; i = i * 10) {
            int numberOne = n / (zeroMultiplier / i);
            System.out.print(numberOne + " ");
            int numberLast = numberOne * zeroMultiplier / i;
            n = n - numberLast;
        }
        System.out.println(" end");
    }

    public static void main(String[] args) {
        int n = inputNumber();
        System.out.println("You entered a number: " + n);
        outputDigits(n);
    }
}