package com.volkodav4ik;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private int height;
    private int weight;

    public Person(String firstName, String lastName, int age, int height, int weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "\nPerson: "
                + firstName + " "
                + lastName + ", "
                + age + " years old, height "
                + height + " sm, weight "
                + weight + " Kg";
    }
}
