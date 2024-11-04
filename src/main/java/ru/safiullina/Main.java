package ru.safiullina;

public class Main {
    public static void main(String[] args) {

        // Бесконечно генерируем случайные числа в диапазоне от 90 до 100 и выводим их в консоль,
        // сделаем выход из этого замкнутого круга по условию получения заданного числа (тут 100).
        for (int r : new Randoms(90, 100)) {
            System.out.println("Случайное число: " + r);
            if (r == 100) {
                System.out.println("Выпало число 100, давайте на этом закончим");
                break;
            }
        }

    }
}