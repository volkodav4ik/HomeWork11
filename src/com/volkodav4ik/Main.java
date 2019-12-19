package com.volkodav4ik;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Person[] people = PersonFactory.getPersons();
        System.out.println(Arrays.toString(people));
    }
}
