public class TestThread {
    public static void main(String[] args) {
        OddThread O = new OddThread();
        EvenThread E = new EvenThread();

        O.start();
        try {
            O.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        E.start();
    }
}
