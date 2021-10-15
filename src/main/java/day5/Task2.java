package day5;


import java.sql.ShardingKey;

public class Task2 {
    public static void main(String[] args) {
        Motorbike Harley = new Motorbike();

    }
}
class Motorbike {
    private String model;
    private String color;
    private int year;

    public Motorbike() {
        this.model = "\"Harley\"";//Прочитал все методы в классе String  и не  нашел... среда разработки помогла//
        this.color = "White";
        this.year = 1901;
        System.out.println("Nice bike model "+GetModel() + " in "+ GetColor() + " color, was born in " + GetYear() + " year !!! Sanx for this we say from 2 best guys William Harley and Arthur Davidson!");
    }


    public String GetModel() {
        return model;
    }

    public String GetColor() {
        return color;
    }

    public int GetYear() {
        return year;
    }
}