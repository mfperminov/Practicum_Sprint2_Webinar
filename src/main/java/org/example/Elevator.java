package org.example;

public class Elevator {

    short maxFloor;
    int maxWeight;
    int currentWeight;

    public Elevator(final short maxFloor, final int maxWeight) {
        this.maxFloor = maxFloor;
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
    }

    public boolean isAllowedToEnter(int additionalWeight, short floorRequested) {
        return (floorRequested <= maxFloor) && (currentWeight + additionalWeight) < maxWeight;
    }


    public boolean addPerson(Person person) {
        if (isAllowedToEnter(person.weight, person.targetFloor)) {
            currentWeight += person.weight;
            System.out.println("Новый вес лифта " + currentWeight + " кг");
            return true;
        }
        System.out.println(person.name + " никуда не поедет");
        return false;
    }



}
