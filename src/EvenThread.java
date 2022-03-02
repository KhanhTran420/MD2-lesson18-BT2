public class EvenThread extends Thread {
    private Thread evenThread;

    public EvenThread() {
        evenThread = new Thread(this, "EvenThread");

    }
    public void run(){
        try {
            for (int i = 0; i < 10 ; i++) {
                if (i%2==0){
                    System.out.println("Even number: " + i);

                }
                Thread.sleep(15);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Even Thread Stop");
    }
}
