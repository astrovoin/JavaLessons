package Lesson_1;

public class MainClass {
    public static void main(String[] args) {
        byte bi = 65;
        short si = 655;
        int ii = 1000000;
        long li = 1234563L;
        float fi = 110.0F;
        double di = 429.5D;
        boolean booli = true;
        char ci = 59;
        String str = "String";

        int result = schetFormula(2, 2, 2, 2);
        boolean resbool = prouvTwoNumber(5, 6);
        boolean resnegative = prouvNegative(-1);

        System.out.println("Метод вычисления a*(b+(c/d)): " + result);
        System.out.println("Метод gроверки суммы двух чисел от 10 до 20: " + resbool);
        prouvPlusOrMinus(-1);
        prouvPlusOrMinus(8);
        System.out.println("Метод проверки на отрицательность v2: " + resnegative);
        shooseName("Вадим");
        prouvYear(2000);
        prouvYear(1999);
    }

    public static int schetFormula(int a, int b, int c, int d) {
        return a * (b + c / d);
    }

    public static boolean prouvTwoNumber(int first, int second) {
        int result = first + second;
        return result >= 10 && result <= 20;
    }

    public static void prouvPlusOrMinus(int a) {
        System.out.print("Метод проверки на отрицательность v1: ");
        if (a < 0) System.out.println("Число " + a + " отрицательное.");
         else if (a >= 0) System.out.println("Число " + a + " положительное.");
        }

    public static boolean prouvNegative(int a) {
        return a < 0;
    }

    public static void shooseName(String name) {
        System.out.println("Метод вывода имени: Привет, " + name + "!");
    }

    public static void prouvYear(int year) {
        if ((year % 100 == 0 || year % 4 != 0) && year % 400 != 0) {
            System.out.println("Метод проверки високосного года: " + year + "й год не високосный!");
        } else {
            System.out.println("Метод проверки високосного года: " + year + "й год високосный!");
        }
    }
}
