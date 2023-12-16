package ru.mirea.goncharov.LAB23.task2;

public interface Queue<E> {
    void enqueue(E element);    // Добавить элемент в конец очереди
    E dequeue();                // Извлечь и удалить элемент из начала очереди
    E peek();                   // Посмотреть элемент в начале очереди, не удаляя его
    int size();                 // Вернуть текущий размер очереди
    boolean isEmpty();          // Проверить, пуста ли очередь
}

