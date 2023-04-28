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

    public static synchronized void decrement() {
        counter--;
        updateCounter++;
        if (updateCounter % 500 == 0) {
            System.out.print(counter + " ");
        }
    }
}
