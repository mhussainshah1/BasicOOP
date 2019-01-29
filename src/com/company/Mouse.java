package com.company;

public class Mouse extends Animal {
    public Mouse(){
        System.out.println("Now I am a mouse!");
    }
    @Override
    public String sleep() {
        return "A mouse sleeps...";
    }

    @Override
    public String eat() {
        return "A mouse eats...";
    }

    public String pope(){
        return "A mouse pope...";
    }
}
