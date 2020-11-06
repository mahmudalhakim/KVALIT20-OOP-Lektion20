package se.nackademin.inkapsling;

/**
 * Created by Mahmud Al Hakim
 * Date: 2020-11-06
 * Time: 11:17
 * Project: KVALIT20-OOP-Lektion20
 * Copyright: MIT
 */
public class PersonDemo {
  public static void main(String[] args) {

    Person p1 = new Person("James", "Gosling");
    System.out.println(p1);

    System.out.println(p1.getFirstName());
    p1.setFirstName("Mahmud");
    System.out.println(p1);


  }
}
