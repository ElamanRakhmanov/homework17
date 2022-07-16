package com.company;

public class Main {
    public static void main(String[] args) {

        Animal [] animals = {new Shark(), new Turtle(), new Eagle()};
        Shark [] animalShark = new Shark []{};
        Turtle[] animalTurtle = new Turtle[]{};
        Eagle [] animalEagle = new Eagle[]{};
        for (Animal animalShark1 : animals) {
            if(animals instanceof  Animal[] ){
            }
        }
        Shark.attack();
        for (Animal animalTurtle1: animals) {
            if (animals instanceof Animal[]){
            }
        }
        Turtle.swim();

        for (Animal animalEagle1:animals) {
            if(animals instanceof Animal[]){
            }
        }
        Eagle.fly();

    }
}