package ru.geekbrains.lesson5;

public class Homework5 {
    public static void main(String[] args) {
        Employee[] staff = new Employee[5];
        staff[0] = new Employee("Иванов Кирилл Игоревич", "Главный конструктор", 41, "+7(999)111-11-11", "mail1@mail.com", 100000);
        staff[1] = new Employee("Сорокин Сергей Петрович", "Конструктор", 36, "+7(999)222-22-22", "mail2@mail.com", 65000);
        staff[2] = new Employee("Петров Игорь Николаевич", "Главный инженер", 58, "+7(999)333-33-33", "mail3@mail.com", 110000);
        staff[3] = new Employee("Литвин Аркадий Михайлович", "Инженер-проектировщик", 46, "+7(999)444-44-44", "mail4@mail.com", 70000);
        staff[4] = new Employee("Аверин Петр Анатольевич", "Техник-сборщик", 27, "+7(999)555-55-55", "mail5@mail.com", 50000);

        for (Employee x : staff){
            if (x.getAge() > 40){
                x.info();
            }
        }
    }
}
