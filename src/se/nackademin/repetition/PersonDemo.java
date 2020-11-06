package se.nackademin.repetition;

/**
 * Created by Mahmud Al Hakim
 * Date: 2020-11-06
 * Time: 09:19
 * Project: KVALIT20-OOP-Lektion20
 * Copyright: MIT
 */
public class PersonDemo {

  public static void main(String[] args) {
    Person p1 = new Person();
    p1.firstName = "Mahmud";
    p1.lastName = "Al Hakim";
    p1.dateOfBirth = "19730202";
    p1.height = 1.70;
    p1.weight = 85;
    System.out.println(p1.getName());
    System.out.println("Ålder: " + p1.getAge() + " år.");
    System.out.printf("BMI: %.2f \n" , p1.getBMI());
    System.out.println("Viktklassen: " + p1.getBMICategory());

    Person p2 = new Person();
    p2.firstName = "Yasmin";
    p2.lastName = "Al Hakim";
    p2.dateOfBirth = "19750606";
    p2.height = 1.68;
    p2.weight = 60;
    System.out.println(p2.getName());
    System.out.println("Ålder: " + p2.getAge() + " år." );
    System.out.printf("BMI: %.2f \n" , p2.getBMI());
    System.out.println("Viktklassen: " + p2.getBMICategory());
    System.out.println();

    // Skriv ut ett objekt
    System.out.println(p1);
    System.out.println(p2);


  }

}
