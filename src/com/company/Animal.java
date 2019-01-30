package com.company;

/*
 * This is the parent class. Also called the super class
 */
public class Animal {
    private String animalName;
    //public methods are visible to the calling class (ie.. Main)

    public Animal() {
        System.out.println("\nA new animal has been created!");
    }

    public String sleep() {
        return "An animal sleeps...";
    }

    public String eat() {
        return "An animal eats...";
    }
}
