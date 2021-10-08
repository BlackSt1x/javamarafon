package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            double a = s.nextDouble();
            double b = s.nextDouble();
            if (b == 0){
                break;
            }
            System.out.println(a / b);
        }



    }
}
