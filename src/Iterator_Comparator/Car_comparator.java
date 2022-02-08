package Iterator_Comparator;

import java.util.Arrays;

public class Car_comparator implements Comparable<Car_comparator>{
    int speed;
    int price;
    String color;
    String model;

    public Car_comparator(int speed, int price, String color, String model) {
        this.speed = speed;
        this.price = price;
        this.color = color;
        this.model = model;
    }

    @Override
    public int compareTo(Car_comparator o) {
        int temp =this.speed-o.speed;
        if(temp==0){
            return this.price-o.price;
        }
        return temp;
    }

    @Override
    public String toString() {
        return this.speed+" "+this.price+" "+this.color+" "+this.model;
    }
}

class mainq{
    public static void main(String[] args) {
        Car_comparator car1 = new Car_comparator(120,10000,"oreng","BMW");
        Car_comparator car2 = new Car_comparator(120,1000,"Black","Shcoda");
        Car_comparator car3 = new Car_comparator(90,8000,"White","Lada");
        Car_comparator car4 = new Car_comparator(80,100,"Green","BMW");
        Car_comparator car []={car1,car2,car3,car4};
        Arrays.sort(car);
        for (Car_comparator temp:car) {
            System.out.println(temp);
        }
    }
}