package ru.mirea.goncharov.LAB24.task2;

class VictorianChairFactory implements ChairFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }
}
