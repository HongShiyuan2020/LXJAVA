package Thread;

public class Zuoye_2020_11_18_2 {
    public static void main(String[] args) {
        Stack<Character> aStack = new Stack<Character>();
        Producer aProducer = new Producer(aStack);
        Consummer aConsummer = new Consummer(aStack);

        aProducer.start();
        aConsummer.start();
    }
}
