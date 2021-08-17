package ru.geekbrains.lesson5;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    Employee(String fullName, String position, int age, String phoneNumber, String email, int salary){
        this.fullName = fullName;
        this.position = position;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ФИО: " + fullName  +", "+
                "Возраст: " + age  +", "+
                "Должность: " + position  +", "+
                "email: " + email  +", "+
                "Номер телефона=: " + phoneNumber  +", "+
                "Размер з/п: " + salary;
    }

    public void info () {
        System.out.println(toString());;
    }

}
