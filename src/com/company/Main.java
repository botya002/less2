package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int age = generateRandomAge();//random number
        temp(21, 34);
        temp(age,45 );
    }
//home work 1
    private static int temp (int age, int temp) {
        if (age > 20 && age < 45 && temp > 30) {
            System.out.println("Можно идти гулять");
        } else if (age < 20 && temp <= 28) {
            System.out.println("Можно идти гулять 2");
        } else if (age > 45 && temp < 25) {
            System.out.println("Можно идти гулять 3");
        } else {
            System.out.println("Оставайтесь дома");
        }
        return temp;
    }

//home work 2
    private static int generateRandomAge() {
        Random num = new Random();
        int age = num.nextInt(50);
        System.out.println(age);
        return age;
    }
}
