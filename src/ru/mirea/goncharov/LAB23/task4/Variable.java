package ru.mirea.goncharov.LAB23.task4;

class Variable extends Expression {
    private final String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    int evaluate(int x) {
        return x;
    }
}
