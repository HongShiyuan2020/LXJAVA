package Thread;

import java.util.LinkedList;

public class Stack<T> {
    LinkedList<T> aLinkedList = new LinkedList<T>();

    public synchronized void push(T a) {
        if (aLinkedList.size() >= 100) {
            try {
                this.notify();
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.aLinkedList.addLast(a);
    }

    public synchronized void pop() {
        if (aLinkedList.size() == 0) {
            try {
                this.notify();
                this.wait();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.aLinkedList.removeLast();
    }

    public synchronized T pull() {
        return aLinkedList.getLast();
    }
}
