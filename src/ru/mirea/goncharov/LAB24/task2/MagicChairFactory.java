package ru.mirea.goncharov.LAB24.task2;

class MagicChairFactory implements ChairFactory {
    @Override
    public Chair createChair() {
        return new MagicChair();
    }
}
