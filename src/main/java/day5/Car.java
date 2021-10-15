package day5;

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

