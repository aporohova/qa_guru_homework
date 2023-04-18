package com.demoqa.utils;

import java.security.SecureRandom;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class RandomUtils {

  public static String[] genders = {"Male", "Female", "Other"};

    public static void main(String[] args) {
        System.out.println(generateUuidString());
        System.out.println(getRandomString(10));
        System.out.println(getRandomEmail());
        System.out.println(getRandomInt(111111, 999999));


        System.out.println(getRandomItemFromArray(genders));
    }

    public static String generateUuidString() {
        String uuid = UUID.randomUUID().toString();
        return "uuid = " + uuid;
    }

    public static String getRandomString(int len) {
        String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
         SecureRandom rnd = new SecureRandom();

            StringBuilder sb = new StringBuilder(len);
            for(int i = 0; i < len; i++)
                sb.append(AB.charAt(rnd.nextInt(AB.length())));
            return sb.toString();

    }

    public static String getRandomEmail() {
        return getRandomString(10) + "@gmail.com";
    }

    public static int getRandomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max+1);
    }
    public static String getRandomItemFromArray(String[] values) {
        int index = getRandomInt(0, values.length -1);
        return values[index];
    }

    public static String getRandomGender() {
       return getRandomItemFromArray(genders);
    }


}
