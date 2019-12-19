package com.volkodav4ik;

import java.util.Random;

public class PersonFactory {

    private static final int PERSON_COUNT = 100;
    private static final int MAX_AGE = 69;
    private static final int MIN_AGE = 20;
    private static final int MAX_HEIGHT = 200;
    private static final int MIN_HEIGHT = 150;
    private static final Random RANDOM = new Random();

    public static Person[] getPersons() {
        Person[] people = new Person[PERSON_COUNT];
        for (int i = 0; i < PERSON_COUNT; i++) {
            people[i] = createRandomPerson();
        }
        return people;
    }

    private static Person createRandomPerson() {
        String name = DataProvider.getFirstNames(RANDOM.nextInt(DataProvider.firstNames.length));
        String lastName = DataProvider.getLastNames(RANDOM.nextInt(DataProvider.lastNames.length));
        int age = RANDOM.nextInt(MAX_AGE - MIN_AGE) + MIN_AGE + 1;
        int height = RANDOM.nextInt(MAX_HEIGHT - MIN_HEIGHT) + MIN_HEIGHT + 1;
        int weight = getWeight(age, height);
        return new Person(name, lastName, age, height, weight);

    }

    private static int getWeight(int age, int height) {
        if (height <= 160) {
            if (age < 30) {
                return RANDOM.nextInt(37) + 47;
            } else {
                if (age >= 30 && age < 50) {
                    return RANDOM.nextInt(41) + 52;
                } else {
                    return RANDOM.nextInt(35) + 54;
                }
            }
        }
        if (height > 160 && height <= 170) {
            if (age < 30) {
                return RANDOM.nextInt(33) + 61;
            } else {
                if (age >= 30 && age < 50) {
                    return RANDOM.nextInt(35) + 67;
                } else {
                    return RANDOM.nextInt(36) + 65;
                }
            }
        }
        if (height > 170 && height <= 180) {
            if (age < 30) {
                return RANDOM.nextInt(36) + 70;
            } else {
                if (age >= 30 && age < 50) {
                    return RANDOM.nextInt(36) + 75;
                } else {
                    return RANDOM.nextInt(35) + 74;
                }
            }
        }
        if (height > 180 && height <= 200) {
            if (age < 30) {
                return RANDOM.nextInt(43) + 83;
            } else {
                if (age >= 30 && age < 50) {
                    return RANDOM.nextInt(40) + 87;
                } else {
                    return RANDOM.nextInt(44) + 81;
                }
            }
        }
        return 0;
    }
}
