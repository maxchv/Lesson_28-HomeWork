package org.itstep.step02;

// TODO: Реализуйте здесь обобщенный класс Pari

public class Pair <T,K>{

    private final T first;
    private final K second;

    /**
     * Создаем объект ObjectTuple на базе двух объектов.
     *
     * @param first первый объект
     * @param second второй объект
     */
    public Pair(T first, K second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public K getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "<" + first.toString() + ", " + second.toString() + ">";
    }

}