public class Car {
  String model;
  Integer year;
 
  public Car(String model, Integer year) {
    this.model = model;
    this.year = year;
  }

  @Override
  public String toString() {
    return "Car [model=" + model + ", year=" + year + "]";
  }  
}
