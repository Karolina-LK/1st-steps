package BasicExercises;

public class DtosMain {
  public static void main(String[] args) {
    ManualDto obj1 = new ManualDto("title", "name", "surname", "street", "city",
        "message", null, 9, 42);
    ManualDto obj2 = new ManualDto("title", "name", "surname", "street", "city",
        "message", null, 9, 42);
    System.out.println(obj1.equals(obj2));

    LombokDto objLombok = LombokDto.builder()
                                   .city("city")
                                   .street("street")
                                   .build();
  }
}
