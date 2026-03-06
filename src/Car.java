import javax.print.attribute.standard.MediaSize;

public class Car {
    public String car;
    public String color;
    public int maxSpeed;
    public String brand;
    public int date;


    Car(String car, int date, String color, int maxSpeed, String brand) {
        this.car = car;
        this.date = date;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.brand = brand;
    }

    Car(Car other) {
        this.car = other.car;
        this.date = other.date;
        this.color = other.color;
        this.maxSpeed = other.maxSpeed;
        this.brand = other.brand;
    }

    Car(String car, int date, String color, Car other) {
        this.car = other.car;
        this.date = other.date;
        this.color = other.color;
    }
    Car(){
       this(" )
    }
    Car(String color, String brand, int date){
        this.color = color;
        this.brand = brand;
        this.date = date;
    }
}
