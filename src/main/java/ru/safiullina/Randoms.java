package ru.safiullina;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected int minValue;
    protected int maxValue;

    public Randoms(int min, int max) {
        // Объект генератор случайного числа
        this.random = new Random();
        // Минимальное значение, которое можно сгенерировать
        this.minValue = min;
        // Верхняя граница случайных чисел, т.к. она исключается генератором случайных чисел,
        // то прибавим 1, чтобы включить и верхнюю границу
        this.maxValue = max + 1;
    }

    /**
     * Реализуем требуемый интерфейсом Iterable метод iterator()
     */
    @Override
    public Iterator<Integer> iterator() {

        // Создаем вспомогательный класс для итератора (реализующего Iterator<Integer>) по нашему классу
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                // Если у нас нижняя граница меньше или равно верхней, то можем генерить случайнее числа в этом диапазоне
                return minValue <= maxValue;
            }

            @Override
            public Integer next() {
                // Если у нас нижняя граница меньше или равно верхней, то генерим случайнее числа в этом диапазоне
                if (minValue <= maxValue) {
                    return random.nextInt(minValue,maxValue);
                }
                return null;
            }
        };
    }

}