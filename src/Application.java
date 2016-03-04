import java.text.DecimalFormat;

public class Application {

	public static void main(String[] args) {
		int hoursWorked;
		double payRate;
		double totalPay;
		
		hoursWorked = 37;
		payRate = 22.50d;
		
		totalPay = hoursWorked * payRate;
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.println("You made $" + df.format(totalPay) + " this pay period.");	
	}

}
/*
 * System.out.println("Please enter in your hourly rate:"); while
 * (!scanner.hasNextDouble()) { System.out.println("Invalid!");
 * System.out.println("Please enter in your PAYRATE worked with numbers"
 * ); scanner.next(); } payRate = scanner.nextDouble();
 */