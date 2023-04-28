public class Main {
    public static void main(String[] args) {

        Thread th = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                Counter.increment();
            }
        });

        Thread th1 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                Counter.decrement();
            }
        });

        th.start();
        th1.start();
    }
}