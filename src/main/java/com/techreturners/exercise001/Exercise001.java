package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(final String word) {
        final String capitalizedWord = initCap(word) + word.substring(1);
        return capitalizedWord;
    }

    private static String initCap(final String word) {
        return word.substring(0, 1).toUpperCase();
    }

    public String generateInitials(final String firstName, final String lastName) {
        final String generatedInitials = initCap(firstName) + ". " + initCap(lastName);
        return generatedInitials;
    }

    public double addVat(final double originalPrice, final double vatRate) {
        final double finalValue = originalPrice + originalPrice*vatRate/100;
        return finalValue;
    }

    public String reverse(final String sentence) {
        final StringBuilder sentenseBuilder = new StringBuilder(sentence);
        return sentenseBuilder.reverse().toString();
    }

    public int countLinuxUsers(final List<User> users) {
        return (int)users.stream().filter(user -> user.getOperatingSystem().equalsIgnoreCase("linux")).count();
    }
}
