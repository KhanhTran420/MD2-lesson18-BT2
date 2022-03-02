public class OddThread extends Thread {
    private Thread oddThread;

    public OddThread() {
        oddThread = new Thread(this, "OddThread");
    }
    public void run(){
        try {
            for (int i = 0; i < 10 ; i++) {
                if (i%2!=0){
                    System.out.println("Old number: " + i);

                }
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Old Thread Stop");
    }
}
