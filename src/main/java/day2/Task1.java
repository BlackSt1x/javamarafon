package day2;


import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Добрый день, введите число этажа исходя из дома  Малоэтажный дом 1-4, Среднеэтажный дом 5-8, Многоэтажный дом 9 и более.");
        int x = s.nextInt();
        if (x >= 1 && x <= 4) {
            System.out.println("Вы ввели " +x + " - это Малоэтажный дом");
        }
        else if(x > 4 && x<=8) {
            System.out.println("Вы ввели " +x + " - это Среднеэтажный дом");
        }
        else if(x >= 9) {
            System.out.println("Вы ввели " +x + " - это Многоэтажный дом");
        }
        else{
            System.out.println("Некоректный ввод");
        }
    }
}