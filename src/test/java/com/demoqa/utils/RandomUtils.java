package com.demoqa.utils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;


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

        System.out.println(getRandom(genders));
        System.out.println(getRandom(hobbies));
        System.out.println(getRandom(subjects));
        System.out.println(getRandom(states));
        System.out.println(getDateRandom());
    }


    public static String getRandom(String[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
        //int index = getRandomInt(0, values.length -1);
        //return values[index];
    }

    public static String getRandomGender() {
        return getRandom(genders);
    }

    public static String getDateRandom () {
        String s = new SimpleDateFormat("MM.dd.yyyy").format(new Date());
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