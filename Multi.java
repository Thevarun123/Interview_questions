public class Multi implements Runnable {

    @Override
    public void run() {
        System.out.println("My multithreading program");
    }

    public static void main(String[] args) {
        Multi m1 = new Multi();
        Thread t1 = new Thread(m1);
        t1.start();
    }
}
