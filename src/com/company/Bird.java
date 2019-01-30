package com.company;

/*
 * All Birds are Animals but all Animals are not Birds
 */
// we can extend a class into a more specific type by using the keyword: extends

public class Bird extends Animal {
    public Bird() {
        //super();// If we dont put then compiler put implicitly.
        System.out.println("A bird is hatched...");
    }

    //we can override methods from the parent class
    @Override
    public String sleep() {
        return "A bird sleeps soundly...";
    }

    @Override
    public String eat() {
        return "A bird eats...";
    }


    public String fly() {
        //Birds can fly but other animals can't so this method
        //is unique to the Bird class
        return "A bird flies...";
    }
}