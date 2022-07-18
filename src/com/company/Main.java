package com.company;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = {new Shark(), new Eagle(),new Turtle()};
        for (Animal aMovement : animals) {
            if (aMovement instanceof Turtle)
            {
                ((Turtle) aMovement).swim();
            }
            else if (aMovement instanceof Shark){
                ((Shark) aMovement).attack();
            }
            else if (aMovement instanceof Eagle){
                ((Eagle) aMovement).fly();
            }
        }

        for (Animal av : animals) {
            if (av.getClass().getName().equals("com.company.Turtle"))
            {
                av.movement();
            }
        }
    }

}