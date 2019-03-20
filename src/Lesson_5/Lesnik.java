package Lesson_5;

import java.util.Scanner;

public class Lesnik {

    public static void inputMassiveCheck (int[] massive){
        for (int i = 0; i <= massive.length - 1; i++){
            massive[i]=i+1;}
    }

    public static int[] inputMassiveMain (){
        // вводим массив
        Scanner scanner = new Scanner(System.in);
        String[] mass = scanner.nextLine().split(" ");
        scanner.close();

        // преобразование строчного массива в числовой?
        int[] lineInt = new int[mass.length];
        for (int i = 0; i <= lineInt.length - 1; i++) {
            lineInt[i] = Integer.parseInt(mass[i]);
        }
        return  lineInt;
    }

    public static void checkInputMassive (int [] mass, int [] counts, int [] checks){
        for (int i = 0; i <= mass.length - 1; i++) {
            for(int j=0; j <= counts.length - 1; j++){
                if (mass[i] == checks[j]) {
                    counts[j]++;
                }
            }
        }
    }

    public static void printResult (int [] checks, int [] counts ){

        // печать массива чисел от 1 до N
        System.out.println();
        System.out.print("Число:      ");
        for (int i = 0; i <= checks.length - 1; i++) {
            System.out.print("|" + checks[i] + "| " );
        }

        // печать массива счетчиков совпадений
        System.out.println();
        System.out.print("Совпадения: ");
        for (int i = 0, j = 0; i <= counts.length - 1 && j <= checks.length - 1; i++, j++) {
            if (checks[i] <= 10) {
                System.out.print("|" + counts[i] + "| ");
            } else
                System.out.print(" |" + counts[i] + " |");
        }
    }

    public static void main(String[] args) {
        int n = 5;                  // число максимальных чисел от 1 до N. Можно поставить любое число до 20, как сказано в задаче.
        int[] counts = new int[n];  // массив для счетчиков
        int[] checks = new int[n];  // массив ддя проверки (печатается массив от 1 до N)

        // заполняем массив  от 1 до n
        inputMassiveCheck(checks);

        System.out.println("Проверка совпадений цифр от 1 до " + n + " в введенном Вами массиве.");
        System.out.println("Введите любое количество цифр через пробел в любом порядке:");

       // ввод массива и преобразование в числовой
       int [] mass = inputMassiveMain();

       // проверка совпадений чисел и запись в счетчики
       checkInputMassive(mass,counts,checks);

       // печать результата совпадений
       printResult(checks,counts);
    }
}
// Массив вводных данных для задачи:
// 5 1 5 2 2 4 1 4 5 1 5 3 2 4 4 4 5 1 3 4 2 2 1 2 4 4 4 5 4 3 5 4 4 5 5 1 4 1 5 3 1 4 5 3 3 4 2 2 4 4 5 5 1 1 1 4 5 5 4 4 2 4 3 1 3 3 1 1 3 1 3 4 4 3 2 2 1 3 4 4 2 3 4 2 4 4 1 4 4 4 2 1 2 4 1 5 2 2 5 4 2 2 3 1 5 5 3 5 3 1 4 5 4 2 1 3 1 2 1 4 1 3 4 2 2 5 2 3 1 1 2 3 3 4 4 2 4 1 2 2 2 5 1 5 1 2 2 1 3 3 4 3 5 3 5 1 2 1 3 3 2 4 1 4 3 5 1 2 1 2 3 2 1 3 2 2 4 3 2 1 5 1 4 5 4 4 5 5 4 2 3 5 1 3 4 3 2 4 5 2 5 2 4 1 4 5 2 3 3 4 4 3 5 2 2 3 5 1 2 4 3 4 4 3 2 2 1 4 5 5 1 5 2 4 5 5 4 2 2 1 5 1 3 4 2 4 2 2 4 3 5 2 2 4 4 4 5 5 2 5 5 2 5 1 1 5 5 4 1 2 4 1 2 2 5 4 5 1 5 4 4 5 5 5 3 3 4 3 3 5 3 2 2 2 2 2 1 2 5 2 3 4 3 5 5 2 4 5 3 4 3 1 3 2 1 1 5 4 4 2 3 1 3 4 2 4 1 3 5 1 5 3 5 2 3 4 4 1 3 1 5 5 1 2 2 1 3 1 5 1 2 2 1 5 1 3 3 2 1 3 2 5 1 1 2 3 5 5 4 3 1 3 3 1 5 4 2 3 4
