package se.nackademin.inkapsling;

/**
 * Created by Mahmud Al Hakim
 * Date: 2020-11-06
 * Time: 11:16
 * Project: KVALIT20-OOP-Lektion20
 * Copyright: MIT
 */
public class Person {

  // Privata instansvariabler
  private String firstName;
  private String lastName;

  // Konstruktor
  public Person(String firstName, String lastName){
    setFirstName(firstName);
    setLastName(lastName);
  }

  public String getFirstName() {
    if(this.firstName == null)
        this.firstName = "Guest";

    return firstName;
  }

  public void setFirstName(String firstName) {
    if(firstName != null)
      this.firstName = firstName;
    else
      throw new NullPointerException();
  }

  public String getLastName() {
    if(this.lastName == null)
      this.lastName = "";

    return lastName;
  }

  public void setLastName(String lastName) {
    if(lastName != null)
      this.lastName = lastName;
    else
      throw new NullPointerException();
  }

  public void setName(String firstName, String lastName){
    if(firstName != null && lastName != null){
      this.firstName = firstName;
      this.lastName = lastName;
    }
    else
      throw new NullPointerException();
  }

  @Override
  public String toString() {
    return "Person{" +
        "firstName='" + getFirstName() + '\'' +
        ", lastName='" + getLastName() + '\'' +
        '}';
  }
}
