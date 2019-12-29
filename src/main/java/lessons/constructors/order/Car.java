package lessons.constructors.order;

public class Car extends Vehicle {

  public Car(String typeVeh, String typeCar) {
    super(typeVeh);
    System.out.println("Car has been created with: " + typeCar);
  }
}
