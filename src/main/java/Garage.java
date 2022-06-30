import java.util.List;

public class Garage {
  private List<Car> cars;

  public Garage(List<Car> cars) {
    this.cars = cars;
  }
  public Car getCar(int index) {
    return cars.get(index);
  }
  public void setCar(int index, Car car) {
    cars.set(index, car);
  }

  public void addCar(Car car){
    this.cars.add(car);
  }
  @Override
  public String toString() {
    return "Garage [cars=" + cars + "]";
  }
}
