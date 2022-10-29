package org.itstep.step03;

import org.itstep.step02.Pair;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Итерируемая коллекция объектов Pair.
 *
 * @author Michael S. Kirkpatrick and Nathan Sprague
 * @version V1, 8/2017
 */
public class Pairs<K, V> implements Iterable<Pair<K, V>> {
    private K first;
    private V second;
    private int index = 0;
    private int lengthMas=10; // длина массива

    /* TODO: Объявить массив фиксированного размера (максимум 10 элементов) объектов Pair */

    Pair<K, V>[] pairs = new Pair[lengthMas];


    /**
     * Создайте коллекцию, в которой будут храниться элементы, добавленные парами.
     */

    public Pairs(K first, V second) {
        this.first = first;
        this.second = second;
    }

    public Pairs() {

    }

    public K getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public int getIndex() {
        return index;
    }

    /**
     * TODO: Создайте новую пару и добавьте ее в коллекцию, если есть место.
     *
     * @param first  Первый объект
     * @param second Второй объект
     * @return true - если пара была добавлена, false - в противном случае
     */
    public boolean addPair(K first, V second) {
        if (pairs.length == lengthMas) {
            if (index < lengthMas) {
                pairs[index] = new Pair<>(first, second);
                index++;
                return true;
            } else {
                return false;
            }
        } else {
            pairs=Arrays.copyOf(pairs,pairs.length+1);
            pairs[pairs.length-1] = new Pair<>(first, second);
            index++;
            return true;
        }
    }


    @Override
    public Iterator<Pair<K, V>> iterator() {
        return new PairIterator();
    }

    /*
     * TODO: Реализуйте итератор здесь на основе документации API по адресу
     * https://docs.oracle.com/javase/10/docs/api/java/util/Iterator.html Throw the exceptions as
     * specified
     */
    private class PairIterator implements Iterator<Pair<K, V>> {


        private int indexPairIterator = -1;




        /**
         * TODO: Проверить наличие следующего элемента в итераторе
         */
        @Override
        public boolean hasNext() {
            return ++indexPairIterator < pairs.length;
        }


        /**
         * TODO: Вернуть следующую пару в итератор.
         * <p>
         * // * @throws NoSuchElementException - если больше нет элементов для итерации
         */
        @Override
        public Pair<K, V> next() {
            return pairs[indexPairIterator];
        }


        /**
         * TODO: Удалите предыдущую пару, возвращенную функцией next()
         */
        @Override
        public void remove() {
            if (indexPairIterator >= 0) {
                for (int i = indexPairIterator; i < pairs.length - 1; i++) {
                    if (i<=pairs.length-2) {
                        pairs[i] = pairs[i + 1];
                    }
                }
                pairs = Arrays.copyOf(pairs, pairs.length - 1);
                index--;
            }
        }
    }
}

