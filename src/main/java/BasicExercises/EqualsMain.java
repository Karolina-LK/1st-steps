package BasicExercises;

public class EqualsMain {

  public static void main(String[] args) {

    withNoEquals();
    withEquals();
  }

  private static void withNoEquals() {
    final ObjectWithNoEquals first = new ObjectWithNoEquals("first");
    final ObjectWithNoEquals second = new ObjectWithNoEquals("first");
    final ObjectWithNoEquals third = new ObjectWithNoEquals("third");
    final ObjectWithNoEquals fourth = first;

    System.out.println(first == second);
    System.out.println(first == fourth);
    System.out.println(first.equals(second));
    System.out.println(first.equals(third));
  }

  private static void withEquals() {
    final ObjectWithEquals first = new ObjectWithEquals("first",1);
    final ObjectWithEquals second = new ObjectWithEquals("first",1);
    final ObjectWithEquals third = new ObjectWithEquals("third",1);
    final ObjectWithEquals fourth = first;

    System.out.println(first == second);
    System.out.println(first == fourth);
    System.out.println(first.equals(second));
    System.out.println(first.equals(third));

  }

  //dorzezbic wyswietlenie tak, by komentarz byl niepotrzebny

}
