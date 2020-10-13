package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");
        scan();
        scan();
        scan();
        scan();
        scan();
    }

    public static void scan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру - ");
        int num = scanner.nextInt();
        System.out.println(temp(generateRandomAge(), num));
    }

    public static String temp(int old, int temp) {
        if (old >= 20 && old <= 45 && temp >= -20 && temp <= 30) {
            System.out.println("Можно идти гулять");
        } else if (old < 20 && temp >= 0 && temp <= 28) {
            System.out.println("Можно идти гулять");
        } else if (old >= 45 && temp >= -10 && temp <= 25) {
            System.out.println("Можно идти гулять");
        } else {
            System.out.println("Оставайтесь дома");
        }
        return "End";
    }

    public static int generateRandomAge() {
        Random rand = new Random();
        int ix = rand.nextInt(60);
        System.out.println(ix);
        return ix;
    }
}