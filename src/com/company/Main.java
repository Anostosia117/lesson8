package com.company;

public class Main {
    public static void main(String[] args) {

        // Задание 1 и 2

        String firstName = "Ivan ";
        String middleName = "Ivanovich";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        String s1 = fullName.toUpperCase();
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + s1);

        // Задание 3
        String fullName1 = "Иванов Семён Семёнович";
        fullName1 = fullName1.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + fullName1);

    }
}
