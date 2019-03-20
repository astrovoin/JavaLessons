package Lesson_5;

public class Main {
    public static void main(String[] args) {

        int age = 40;

       Worker[] persArray = new Worker[5];
       persArray[0] = new Worker("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
       persArray[1] = new Worker("BoB Marlin", "Manager", "bob@mail.ru", "89787", 30000, 35 );
       persArray[2] = new Worker("Tim Star", "Cleaner", "cleanclean@mail.ru", "+79156849844", 24500, 46);
       persArray[3] = new Worker("Rob Yester", "Director", "gravmen@mail.ru", "89500000001", 35000, 41);
       persArray[4] = new Worker("Ronda Black", "GlavBuh", "buhbuh@mail.ru", "89500000002", 35500, 26);

        for (int i = 0; i < persArray.length; i++){
            if (persArray[i].age >= age) {
                persArray[i].info();
            }
        }
    }
}
