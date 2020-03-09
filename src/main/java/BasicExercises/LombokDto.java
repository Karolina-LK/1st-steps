package BasicExercises;

import lombok.Builder;
import lombok.Data;

import java.awt.*;

@Data
@Builder
public class LombokDto {
  private String title;
  private String name;
  private String surname;
  private String street;
  private String city;
  private String message;
  private Image picture;
  private int flatNo;
  private int postalCode;
}
