package ru.mirea.goncharov.LAB23.task4_smth_wrng;

class Subtract extends BinaryOperation {
    public Subtract(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    int evaluate(int x) {
        return left.evaluate(x) - right.evaluate(x);
    }
}
