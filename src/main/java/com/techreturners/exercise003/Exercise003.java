package com.techreturners.exercise003;

import java.util.*;

public class Exercise003 {

    private final Map<String, Integer> iceCreamFlavours;

    public Exercise003() {
        iceCreamFlavours = new LinkedHashMap<>();
        iceCreamFlavours.put("Pistachio", 0);
        iceCreamFlavours.put("Raspberry Ripple", 1);
        iceCreamFlavours.put("Vanilla", 2);
        iceCreamFlavours.put("Mint Chocolate Chip", 3);
        iceCreamFlavours.put("Chocolate", 4);
        iceCreamFlavours.put("Mango Sorbet", 5);
    }

    int getIceCreamCode(final String iceCreamFlavour) {
        return iceCreamFlavours.get(iceCreamFlavour);
    }

    String[] iceCreamFlavours() {
        return iceCreamFlavours.keySet().stream().toArray(String[]::new);
    }

}
