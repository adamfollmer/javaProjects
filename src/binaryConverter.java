import java.util.Scanner;

public class binaryConverter {

	public static void main(String[] args) {
		Scanner number;
		number = new Scanner(System.in);
		int userNumber;
		System.out.println("Please enter in a whole number");
		userNumber = number.nextInt();
		double userDouble = (double)userNumber;
		int [] binaryNumber = new int[0]; //Will hold the completed number
		int i;
		i = 0;

		do {
			if (userNumber % 2 == 1){
				binaryNumber[i] = 1;
				userDouble = userDouble - .5;
				i++;
				}
			else {
				binaryNumber[i] = 0;
				userDouble = userDouble/2;
				i++;
			}	
		}
		while (userNumber > 1);
		
		for (int j = 0; j < binaryNumber.length; j++)
		{
			System.out.print(binaryNumber[j]);
		}


	}
}
