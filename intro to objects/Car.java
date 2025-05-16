public class Car {
    String color;
    int year;
    void drive() {
        System.out.println("The car is driving.");
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "Red";
        myCar.year = 2022;
        myCar.drive();
        System.out.println("Color: " + myCar.color);
        System.out.println("Year: " + myCar.year);
    }
} 