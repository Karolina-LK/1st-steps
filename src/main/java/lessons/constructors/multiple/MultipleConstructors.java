package lessons.constructors.multiple;

public class MultipleConstructors {
  private String pole1;
  private String pole2;
  private String pole3;
  private String pole4;

  public MultipleConstructors(String pole1, String pole2, String pole3) {
    this.pole1 = pole1;
    this.pole2 = pole2;
    this.pole3 = pole3;
    this.pole4 = this.pole2 + pole3;

  }

  public MultipleConstructors(String pole1, String pole2) {

    this(pole1, pole2, " ");
  }

  public MultipleConstructors(String pole1) {

    this(pole1, null);
  }

  public MultipleConstructors() {

    this("aa");
  }

  public String getPole1() {
    return pole1;
  }

  public String getPole2() {
    return pole2;
  }

  public String getPole3() {
    return pole3;
  }

  public String getPole4() {
    return pole4;
  }

  public static void main(String[] args) {
    //localReference();

//    MultipleConstructors myType = new MultipleConstructors("a", "b");
//    System.out.println(myType.getPole4());
    System.out.println(new MultipleConstructors("1", "2").getPole4());
  }

  private static void localReference() {
    MultipleConstructors kebab = new MultipleConstructors("a", "b", "c");

    System.out.println(kebab.getPole4());
    System.out.println(kebab.getPole2());
    System.out.println(new MultipleConstructors("aA", "aB", "aC").getPole4());
  }
}

/*
conclusions to be expected:
1. lancuchowe wykorzystanie konstruktorow -> zmiana domyslnej wartosci parametru w jednym miejscu
2. polimorfizm

 */
