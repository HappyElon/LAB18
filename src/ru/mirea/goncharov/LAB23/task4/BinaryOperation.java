package ru.mirea.goncharov.LAB23.task4;

abstract class BinaryOperation extends Expression {
    protected final Expression left;
    protected final Expression right;

    public BinaryOperation(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
