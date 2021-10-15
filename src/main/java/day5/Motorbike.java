package day5;

class Motorbike {

        private String  model;
        private String color;
        private int year;

    public Motorbike(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public String GetModel(){
            return model;
        }
        public String GetColor(){
            return color;
        }
        public int GetYear() {
            return year;
        }
        }

