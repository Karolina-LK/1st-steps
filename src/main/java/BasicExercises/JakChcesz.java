package BasicExercises;

import java.net.ServerSocket;

public class JakChcesz {
  JakChcesz innerJakChcesz;
  String nazwa;


  public JakChcesz(String nazwa) {
    this.nazwa = nazwa;
  }

  public void zrobCos() {
    //do pola innerJakchcesz przypisujesz referencje obecnego obiektu (czyli do samego siebie)
    this.innerJakChcesz = this;
  }

  /**
   * metoda do pokazania zmiany wartosci przypisanej do zmiennej
   */
  public static void changeableVariable() {
    String variable = "A";
    System.out.println("1a: zmienna variable w metodzie changeableVariable ma wartosc: " + variable);
    variable = "B";
    System.out.println("1b: zmienna variable w metodzie changeableVariable ma wartosc: " + variable);
  }

  /**
   * metoda do pokazania, ze final blokuje mozliwosc zmiany wartosci zmiennej
   */
  public static void unchangeableVariable() {
    final String variable = "A";
    System.out.println("2. zmienna variable w metodzie unchangeableVariable ma wartosc: " + variable);
    //tu kompilator da blad:
    //variable = "B";
  }

  /**
   * metoda do pokazania, ze w klasie moze istniec pole typu klasy
   */
  public static void classTypeField() {
    JakChcesz field = new JakChcesz("obiekt1");
    JakChcesz outer = new JakChcesz("obiekt2");

    //odniesienie do pola innerJakChcesz w obiekcie outer i przypisanie obektu typu JakChcesz (field)- by zachowac zasade jednosci typow pola i przypisywanej wartosc/przypisywanej referencji
    System.out.println("3a: obecna wartosc pola (innerJakChcesz) to: " + outer.innerJakChcesz);
   // dlatego wywolanie metody da null pointer exception
   // outer.innerJakChcesz.wyswietl();
    outer.innerJakChcesz = field;
    System.out.println("3a': obecna wartosc pola (innerJakChcesz) to: " + outer.innerJakChcesz);

    System.out.print("3b: zmieniona warosc pola (nazwa) przypisanego obiektu typu klasy to: " );
    outer.innerJakChcesz.wyswietl();

  }
/**
 * metoda do pokazania, ze this to referencja do obiektu, ktory wywoluje// this to referencja do samego siebie
 */

  public static void pointThisToEvokedObject(){
    JakChcesz pointerNo1 = new JakChcesz("the 1st pointer;");
    JakChcesz pointerNo2 = new JakChcesz("the 2nd pointer;");

    System.out.print("4a: the reference to the first evoked object is as follows: ");
    pointerNo1.wyswietl();

    System.out.print("4b: the reference to the second evoked object is as follows: ");
    pointerNo2.wyswietl();
  }

  /**
   * metoda do pokazania, ze this to referencja do kolejnego odniesienia
   */
  public static void pointThisToAnotherObcejct(){
    //given
    JakChcesz anotherPointer = new JakChcesz("the 1st reference;");

    //when
    anotherPointer.zrobCos();

    //then
    System.out.print("5a: the first reference to the evoked object is as follows: ");
    anotherPointer.wyswietl();
    anotherPointer.innerJakChcesz.wyswietl();

    anotherPointer.nazwa = "the 2nd reference;";

    System.out.print("5b: the second reference to the evoked object is as follows:  ");
    anotherPointer.zrobCos();
    anotherPointer.wyswietl();
    anotherPointer.innerJakChcesz.wyswietl();
  }

  public void wyswietl() {
    System.out.println(nazwa);
  }
  
  public static void main(String[] args) {

    JakChcesz.changeableVariable();
    JakChcesz.unchangeableVariable();
    JakChcesz.classTypeField();
    JakChcesz.pointThisToEvokedObject();
    JakChcesz.pointThisToAnotherObcejct();

  }

}

//do zapoznania: given//when/then


