package com.demoqa.utils;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class RandomUtils {

    static String[] genders = {"Male", "Female", "Other"};
    static String[] hobbies = {"Sports", "Reading", "Music"};
    static String[] subjects = {"English", "Chemistry", "Computer Science",
            "Commerce", "Economics", "Social Studies", "Maths", "Accounting",
            "Arts", "Biology", "Physics", "Civics", "Hindi", "History"};
    static String[] states = {"NCR", "Uttar Pradesh", "Haryana", "Rajasthan"};

    static String[] NCRCity = {"Delhi", "Gurgaon", "Noida"};
    static String[] UttarCity = {"Agra", "Lucknow", "Merrut"};
    static String[] HaryanaCity = {"Karnal", "Panipat"};
    static String[] RajCity = {"Jaipur", "Jaiselmer"};

    public static void main(String[] args) {

        System.out.println(getRandomItemFromArray(genders));
        System.out.println(getRandom(hobbies));
        System.out.println(getRandom(subjects));
        System.out.println(getRandom(states));
        System.out.println(randomBirthDay());
    }

    public static int getRandomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max+1);
    }
    public static String getRandom(String[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
//        int index = getRandomInt(0, values.length -1);
//        return values[index];
    }

    public static String getRandomItemFromArray(String[] values) {
        int index = getRandomInt(0, values.length -1);
                return values [index];
    }

    public static String getRandomGender() {
        return getRandomItemFromArray(genders);
    }

    public static String randomBirthDay () {

        String s = new SimpleDateFormat("dd.MM.yyyy").format(new Date());
        return s;
    }


    public static String getRandomHobbies() {
        return getRandom(hobbies);
    }

    public static String getRandomSubject() {
        return getRandom(subjects);
    }

    public static String getRandomState() {
        return getRandom(states);
    }

    public static String getRandomCity(String states) {
        switch (states) {
            case "NCR": {
                return getRandom(NCRCity);
            }
        }
        switch (states) {
            case "Uttar Pradesh": {
                return getRandom(UttarCity);
            }
        }
        switch (states) {
            case "Haryana": {
                return getRandom(HaryanaCity);
            }
        }
        switch (states) {
            case "Rajasthan": {
                return getRandom(RajCity);
            }
        }
        return null;
    }
}