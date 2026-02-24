package y26.ex1;

public class CarApp {
    void main() {
        Car myCar = new Car("VW UP", "White", "AB 12.345", 50000);
        IO.println("Test: " + myCar);
        IO.println();

        String brand = myCar.getBrand();
        IO.println("Brand: " + brand);
        IO.println("My car: " + myCar.getBrand() + ", " +
                myCar.getColor() + ", " + myCar.getRegNo()
        );

        myCar.setKm(65000);
        IO.println("Km nu: " + myCar.getKm());
    }
}
