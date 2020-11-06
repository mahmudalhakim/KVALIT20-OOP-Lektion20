package se.nackademin.repetition;

import java.util.Calendar;

/**
 * Created by Mahmud Al Hakim
 * Date: 2020-11-06
 * Time: 09:09
 * Project: KVALIT20-OOP-Lektion20
 * Copyright: MIT
 */
public class Person {

  // Instansvariabler
  String firstName;
  String lastName;
  String dateOfBirth;
  double height;
  double weight;

  // Instansmetoder

  /**
   * En instansmetod som returnerar hela namnet
   *
   * @return "förnamn efternamn"
   */
  public String getName() {
    return this.firstName + " " + this.lastName;
  }

  /**
   * En instansmetod som beräknar ålder
   *
   * @return ålder
   */
  public int getAge() {
    String calendar = Calendar.getInstance().getTime().toString();
    String thisYearString = calendar.substring(calendar.lastIndexOf(' ') + 1);
    int thisYear = Integer.parseInt(thisYearString);

    String yearString = this.dateOfBirth.substring(0, 4);
    int year = Integer.parseInt(yearString);

    return thisYear - year;
  }

  /**
   * En instansmetod som beräknar BMI
   * @return BMI
   */
  public double getBMI(){
    // return this.weight / (this.height * this.height);
    // Eller utan this
    return weight / (height * height);
  }

  /**
   * En instansmetod som beräknar viktklassen
   * @return viktklassen
   */
  public String getBMICategory(){

    // double BMI = this.getBMI();
    // Eller utan this
    double BMI = getBMI();

    String category;

    if(BMI < 18.5)
      category = "Undervikt";
    else if (BMI <= 25)
      category = "Normalvikt";
    else
      category = "Övervikt";

    return category;

  }


  @Override
  public String toString() {
    return "Namn: " + getName() +
        "\nÅlder: " + getAge() + " år" +
        "\nBMI: " + getBMI() +
        "\nViktklass: " + getBMICategory() + "\n";
  }
}
