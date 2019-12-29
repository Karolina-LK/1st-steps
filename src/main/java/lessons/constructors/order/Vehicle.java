package lessons.constructors.order;

public class Vehicle {

  private  String typeVeh;

  public Vehicle(String type) {
    this.typeVeh = type;
    System.out.println("Vehicle has been created with: " + type);
  }
}
