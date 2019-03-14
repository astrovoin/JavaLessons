package Lesson_5;

public class Worker {

    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    int age;


    public Worker(String name, String position, String email, String phone, int salary,  int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }


    public void info() {
        System.out.println("ФИО: "+ name + ", Должность: " + position + ", E-mail: " + email + ", Телефон: " +  phone + ", Зарплата: " + salary  + "руб., Возраст: " + age + ".");
    }
}
