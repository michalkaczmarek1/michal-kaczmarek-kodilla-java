package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {
    private final String bun;
    private final int burgers;
    private final String sauce;
    private List<String> ingredients = new ArrayList<>();

    private Bigmac(String bun, int burgers, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public static class BigmacBuilder {
        private String bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredient(String ingredient) {
            this.ingredients.add(ingredient);
            return this;
        }

        private boolean isAvailableIngredient(String ingredient) {
            List<String> availableIngredients = new ArrayList<>();
            availableIngredients.add("salad");
            availableIngredients.add("onion");
            availableIngredients.add("bacon");
            availableIngredients.add("cucumber");
            availableIngredients.add("chilli");
            availableIngredients.add("mushrooms");
            availableIngredients.add("prawns");
            availableIngredients.add("chesse");

            return availableIngredients.contains(ingredient);
        }

        public Bigmac build() {
            if(!(bun.equals("sesame")) && !(bun.equals("without sesame"))) {
                throw new IllegalStateException("Bun must be specified with sesame or without sesame");
            }

            if(burgers != 2) {
                throw new IllegalStateException("Burgers must be two");
            }

            if(!(sauce.equals("standard")) && !(sauce.equals("1000 islands")) && !(sauce.equals("barbecue"))) {
                throw new IllegalStateException("Sauce must be specified as standard, 1000 islands and barbecue");
            }


            for(String ingredient: ingredients) {
                if(!(isAvailableIngredient(ingredient))) {
                    throw new IllegalStateException("Ingredients must be choosed with predefinied list");
                }
            }

            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
