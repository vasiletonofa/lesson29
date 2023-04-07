package exceptions;

import javax.naming.InvalidNameException;

public class Person {
    String firstName;
    String lastName;
    int age;

    public void setFirstName(String firstName) throws InvalidNameException {

        firstName.length();

        if(firstName == null || firstName.equals("")) {
            throw new InvalidNameException("Numele este null");
        }

        this.firstName = firstName;
    }

    public void setLastName(String lastName) throws InvalidNameException {

        if(lastName == null || lastName.equals("")) {
            throw new InvalidNameException("Numele este null");
        }

        this.lastName = lastName;
    }

    public void setAge(int age) throws InvalidAgeException {

        if(age == 0) {
            throw new InvalidAgeException("Age nu poate fi 0");
        }

        this.age = age;
    }
}
