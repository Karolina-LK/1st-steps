package lessons.constructors.order;

public class Fiat extends Car {

  private Vehicle parent = new Vehicle("jam");

  public Fiat(String typeCar) {


    super("Fiat", typeCar);
    System.out.println("Fiat has been created together with: " + typeCar );
    String parent;
    this.parent = new Vehicle("x");
  }

  public Fiat(String typeVeh, String typeCar, Vehicle parent) {
    super(typeVeh, typeCar);
    this.parent = parent;
  }
}

//papier: co sie wyswietli w konsoli