public class Main {

    public static void main(String[] args) throws InterruptedException {
        NumberChecker numberChecker = new NumberChecker();

        // warm up period
        for(int i = 1; i < 10000; i ++) {
            numberChecker.isPrime2(i);
        }

        Thread.sleep(2000);
        System.out.println("Warm up finished; now measuring!");
        long start = System.currentTimeMillis();

        for(int i = 1; i < 50000; i ++) {
            numberChecker.isPrime2(i);
        }


        long end = System.currentTimeMillis();
        System.out.println("Time taken: " + (end - start) + " ms");
    }

}
