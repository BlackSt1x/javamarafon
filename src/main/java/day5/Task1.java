package day5;

public class Task1 {
    public static void main(String[] args) {
        Car Porshe = new Car();
        Porshe.SetModel("Porshe 911");
        Porshe.SetColor("Black");
        Porshe.SetYear(1963);
        Porshe.setInfo();


    }
}
class Car {

    private String  model;
    private String color;
    private int year;


    public void SetModel(String model){
        this.model = model;
    }
    public String GetModel(){
        return model;
    }
    public void SetColor(String color){
        this.color = color;
    }
    public String GetColor(){
        return color;
    }
    public void  SetYear(int year){
        this.year = year;
    }
    public int GetYear() {
        return year;
    }
    public void setInfo(){
        System.out.println("BEST CAR IN WORLD " +GetModel() + " in " +GetColor() + " color " + "was born " +GetYear()+ " year !!!");
    }
}
