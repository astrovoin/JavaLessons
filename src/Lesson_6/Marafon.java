package Lesson_6;

public class Marafon {
    public static void main(String[] args) {
        Animal[] arr = {new Cat("Мурка", 1, 100, 1),
                new Dog("Рекс", 5, 550, 9)};

        float toJump = 3.9f;
        float toRun = 400;
        float toSwim = 7;

        for (int i = 0; i < arr.length; i++) {
            String nameString = arr[i].getType() + " " + arr[i].getName() + " может ";

            String statusName = String.format("прыгнуть на %.2fm. Пытается прыгнуть на ", arr[i].getMaxJump());
            String statusResult = (arr[i].jump(toJump)) ? "удалось" : "не удалось";
            System.out.println(nameString + statusName + toJump + "m ему " + statusResult + ".");

            statusName = String.format("пробежать %.2fm. Пытается пробежать ", arr[i].getMaxRun());
            statusResult = arr[i].run(toRun) ? "удалось" : "не удалось";
            System.out.println(nameString + statusName + toRun + "m и ему " + statusResult + ".");

           int swimResult = arr[i].swim(toSwim);
            statusName = String.format("проплыть %.2fm. Пытается проплыть ", arr[i].getMaxSwim());
            statusResult = (swimResult == Animal.SWIM_TRUE) ? "удалось" : "не удалось";
            if (swimResult == Animal.SWIM_NO) {
                statusResult = "не хочется лезть в воду";
                System.out.println(nameString + statusName + toSwim + "m и ему " + statusResult + ".");
            }
        }
    }
}