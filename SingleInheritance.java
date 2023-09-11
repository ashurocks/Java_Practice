public class SingleInheritance {
    public static void main(String[] args) {
        Swift swiftCar = new Swift("Blue"); // Provide the color when creating the Swift instance
        swiftCar.show();
    }
}

class Car {
    String color = "blue";

    public Car(String color) {
        this.color = color;
    }

    public void display() {
        System.out.println("Color: " + color);
    }
}

class Swift extends Car {

public Swift(String color) {
        super(color); // Call the constructor of the parent class
    }

    public void show() {
        System.out.println("Swift");
        display(); // Call the display method from the parent class
    }
}