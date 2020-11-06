package se.nackademin.viktor;

import java.util.Calendar;

public class Person {

  // Instansvariabler
  String firstName;
  String lastName;
  String dateOfBirth;
  public double height;
  double weight;


  // Instansmetoder - får ej innehålla static
  public String getName() {
    return this.firstName + " " + this.lastName;
  }

  public int getAge() {

    String calendar = Calendar.getInstance().getTime().toString();
    String thisYearString = calendar.substring(calendar.lastIndexOf(' ') + 1);
    int thisYear = Integer.parseInt(thisYearString);

    String yearString = this.dateOfBirth.substring(0, 4);
    int year = Integer.parseInt(yearString);

    int age = thisYear - year;
    return age;
  }

  public double getBMI() {
    return this.weight / (this.height * 2);
  }

  /**
   * En instansmetod som beräknar viktklassen
   *
   * @return viktklassen
   */
  public String getBMICategory() {

    // double BMI = this.getBMI();
    // Eller utan this
    double BMI = getBMI();

    String category;

    if (BMI < 18.5)
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

