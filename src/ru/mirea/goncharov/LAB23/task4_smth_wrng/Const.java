package ru.mirea.goncharov.LAB23.task4_smth_wrng;

class Const extends Expression {
    private final int value;

    public Const(int value) {
        this.value = value;
    }

    @Override
    int evaluate(int x) {
        return value;
    }
}
