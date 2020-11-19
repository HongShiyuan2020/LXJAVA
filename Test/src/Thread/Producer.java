package Thread;

public class Producer extends Thread {
    Stack<Character> a;

    
    @Override
    public void run() {
        while (true) {
            char c = (char) ((Math.random() * 10)+48);
            a.push(c);
            System.out.println(a.aLinkedList.size()+"<");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public Producer(Stack<Character> b) {
        this.a = b;
    }
}
