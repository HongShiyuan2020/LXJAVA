package Thread;

public class Consummer extends Thread{
    Stack<Character> a;

    @Override
    public void run() {
        while (true) {
            
        
        a.pop();
        System.out.println(a.aLinkedList.size()+"@");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    }

    public Consummer(Stack<Character> b) {
        this.a = b;
    }
}
