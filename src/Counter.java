public class Counter {
    private static int counter = 0;
    private static int updateCounter = 0;


    public static synchronized void increment() {
        counter++;
        updateCounter++;
        if (updateCounter % 500 == 0) {
            System.out.print(counter + " ");
        }
    }

    public static void decrement() {
        synchronized (Counter.class){
            counter--;
            updateCounter++;
            if (updateCounter % 500 == 0) {
                System.out.print(counter + " ");
            }
        }
    }
}
