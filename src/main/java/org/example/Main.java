package org.example;

import ru.netology.services.Service;

public class Main {
    public static void main(String[] args) {
        Service vacationTime = new Service();
        System.out.println("В следуещем году отдыхать можно " + vacationTime.calculate(100000, 40000, 300000) + " месеца");

    }

}