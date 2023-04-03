// Реализуйте очередь с помощью LinkedList со следующими методами:
// • enqueue() — помещает элемент в конец очереди,
// • dequeue() — возвращает первый элемент из очереди и удаляет его,
// • first() — возвращает первый элемент из очереди, не удаляя.


package Java_HW.HW_04;

import java.util.LinkedList;

public class Ex_42 {
    public static void main(String[] args) {
        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            enqueue(queue, getRandomNumber());
        }
        System.out.println(queue);

        System.out.println(dequeue(queue));
        System.out.println(queue);

        System.out.println(first(queue));
        System.out.println(queue); 
    }

    public static void enqueue(LinkedList<Integer> ll, int num) {
        ll.addLast(num);
    }

    public static int dequeue(LinkedList<Integer> ll) {
        int num = ll.get(0);
        ll.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> ll) {
        int num = ll.get(0);
        return num;
    }

    public static int getRandomNumber() {
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }
}
