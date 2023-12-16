package ru.mirea.goncharov.LAB23.task4_smth_wrng;

class Multiply extends BinaryOperation {
    public Multiply(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    int evaluate(int x) {
        return left.evaluate(x) * right.evaluate(x);
    }
}
