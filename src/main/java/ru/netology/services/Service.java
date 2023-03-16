package ru.netology.services;
public class Service {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        int vacationPay = expenses * 3;
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = money - expenses - vacationPay;
                System.out.println("Месяц " + month + ". " + "Денег в кармане " + money + ". Отдыхаю. Затраты -" + (expenses+vacationPay));
            } else {
                money = money + income - expenses;
                System.out.println("Месяц " + month + ". " + "Денег в кармане " + money + ". Работаю. Доход +" + income + ". Затраты -" + expenses);
            }

        }
        return count;
    }
}
