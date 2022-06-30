import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // your code here
        List<Car> cars = new ArrayList<Car>();
        Car car1 = new Car("Camaro", 2020);
        Car car2 = new Car("Prius", 2022);

        Garage garage = new Garage(cars);
        garage.addCar(car1);
        garage.addCar(car2);
        Car firstCar = garage.getCar(0);
        garage.setCar(1, firstCar);

        System.out.println(garage);
    }
}
