package com.volkodav4ik;

public class DataProvider {

    public static String[] firstNames = new String[]{"Valery", "Paul", "Oleg", "Vladislav", "Nikolas"
                                                    , "John", "Andrew", "Igor", "Artem", "Victor"
                                                    , "Adam", "Jack", "Kristofer", "Lucifer", "Garry"
                                                    , "Soul", "Rick", "Bucky", "Rodger", "Peter"};
    public static String[] lastNames = new String[]{"Smith", "Carpenter", "Brolin", "Romanoff", "Karloff"
                                                    , "Bach", "Debussy", "Kravec", "Stuart", "Gudzone"
                                                    , "Gabidulin", "Goodman", "Krasinsky", "Pratchett", "Radd"
                                                    , "Priston", "Harvard", "Scrabbia", "Hatefield", "Cavaleras"};

    public static String getFirstNames(int i) {
        return firstNames[i];
    }

    public static String getLastNames(int i) {
        return lastNames[i];
    }
}
