package ru.mirea.goncharov.LAB20.task3;

public interface Animal extends Comparable<Animal> {
    String getName();
    void makeSound();
    int getAge();
}

