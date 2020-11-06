package se.nackademin.viktor;

public class PersonDemo {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.firstName = "Viktor";
        p1.height = 1.80;
        p1.weight = 70;
        p1.dateOfBirth = "1990-01-01";
        System.out.println(p1);

    }
}
