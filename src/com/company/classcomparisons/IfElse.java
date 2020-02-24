package com.company.classcomparisons;

public class IfElse {

    static void animalChecker(Animal a){
        if (a instanceof Animal){
            System.out.println(a.speak());
        } else {
            System.out.println("That is not an animal");
        }
    }

    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        animalChecker(myAnimal);
    }
}