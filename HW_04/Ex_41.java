// Задача 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёет «перевёрнутый» список.
package Java_HW.HW_04;

import java.util.LinkedList;

public class Ex_41 {
    public static void main(String[] args) {
        LinkedList<Integer> listForFlip = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            listForFlip.add(getRandomNumber());
        }
        System.out.println(listForFlip);

        for (int i = 0; i < 10; i++) {
            System.out.print(listForFlip.getLast() + " ");
            listForFlip.removeLast();

        }
    }

    public static int getRandomNumber() { // генерирует случайное число
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }
}