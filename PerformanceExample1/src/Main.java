import java.util.Date;

public class Main {

	public static void main(String[] args) throws InterruptedException {
//		Thread.sleep(20000);
		Date startDate = new Date();

		PrimeNumbers primeNumbers = new PrimeNumbers();
		Integer max = Integer.parseInt(args[0]);
		primeNumbers.generateNumbers(max);

		Date endDate = new Date();
		System.out.println("Elapsed time was: " + (endDate.getTime() - startDate.getTime()) + " ms.");
	}

}
