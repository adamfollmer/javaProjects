import java.text.DecimalFormat;
import java.util.Scanner;

public class PaycheckCalc {
	public static void main(String[] args) {
		double hoursWorked;
		double payRate;
		double totalPay;
		double hoursOverForty;
		double overtimeMoney;
		int worker;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Are you Worker 1 or Worker 2");
		while (!scanner.hasNextInt()) {
			System.out.println("Invalid!");
			System.out.println("Please enter either a 1 or 2");
			scanner.next();
		}
		worker = scanner.nextInt();

		switch (worker) {
		case 1:
			payRate = 17.24;
			break;
		case 2:
			payRate = 23.43;
			break;
		default:
			System.out.println("You're working for free this week.");
			payRate = 0;
			break;
		}

		System.out.println("Please enter in your hours worked:");
		while (!scanner.hasNextDouble()) {
			System.out.println("Invalid!");
			System.out.println("Please enter in your HOURS worked with numbers");
			scanner.next();
		}
		hoursWorked = scanner.nextDouble();

		if (hoursWorked > 40) {
			hoursOverForty = hoursWorked - 40;
			overtimeMoney = payRate * 1.5 * hoursOverForty;
			totalPay = overtimeMoney + (payRate * 40);
		} else {
			totalPay = hoursWorked * payRate;
		}

		DecimalFormat df = new DecimalFormat("#.00");

		System.out.println("You made $" + df.format(totalPay) + " this pay period.");
	}

}
