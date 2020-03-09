package BasicExercises;

import java.awt.*;
import java.util.Objects;

public class ManualDto {
  private String title;
  private String name;
  private String surname;
  private String street;
  private String city;
  private String message;
  private Image picture;
  private int flatNo;
  private int postalCode;

  public ManualDto(String title,
                   String name,
                   String surname,
                   String street,
                   String city,
                   String message,
                   Image picture,
                   int flatNo,
                   int postalCode
  ) {
    this.title = title;
    this.name = name;
    this.surname = surname;
    this.street = street;
    this.city = city;
    this.message = message;
    this.picture = picture;
    this.flatNo = flatNo;
    this.postalCode = postalCode;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Image getPicture() {
    return picture;
  }

  public void setPicture(Image picture) {
    this.picture = picture;
  }

  public int getFlatNo() {
    return flatNo;
  }

  public void setFlatNo(int flatNo) {
    this.flatNo = flatNo;
  }

  public int getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(int postalCode) {
    this.postalCode = postalCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ManualDto)) {
      return false;
    }
    ManualDto manualDto = (ManualDto) o;
    return getFlatNo() == manualDto.getFlatNo() &&
        getPostalCode() == manualDto.getPostalCode() &&
        Objects.equals(getTitle(), manualDto.getTitle()) &&
        Objects.equals(getName(), manualDto.getName()) &&
        Objects.equals(getSurname(), manualDto.getSurname()) &&
        Objects.equals(getStreet(), manualDto.getStreet()) &&
        Objects.equals(getCity(), manualDto.getCity()) &&
        Objects.equals(getMessage(), manualDto.getMessage()) &&
        Objects.equals(getPicture(), manualDto.getPicture());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getTitle(), getName(), getSurname(), getStreet(), getCity(), getMessage(), getPicture(),
        getFlatNo(), getPostalCode());
  }

  @Override
  public String toString() {
    return "ManualDto{" +
        "title='" + title + '\'' +
        ", name='" + name + '\'' +
        ", surname='" + surname + '\'' +
        ", street='" + street + '\'' +
        ", city='" + city + '\'' +
        ", message='" + message + '\'' +
        ", picture=" + picture +
        ", flatNo=" + flatNo +
        ", postalCode=" + postalCode +
        '}';
  }
}



//DTO: data transfer object -> POJO = plain old java object; ma pola, jest niemutowalne/ niezmienne (immutable), nie ma logiki/metod, sluzy do komunikacji miedzymodulowej/ miedzy kontekstami