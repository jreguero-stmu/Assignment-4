import java.util.Scanner;

public class TestPhoneBill {

	public static void main(String[] args) {
		
		int time;
		Scanner scan = new Scanner(System.in);
		LongDistanceBill bill = new LongDistanceBill();
		
		System.out.println("This program will calculate your phone bill for you \nWhat is your call rate?");
		bill.setCallRate(scan.nextDouble());
		System.out.println("What is your monthly rate?");
		bill.setMonthlyRate(scan.nextDouble());
		System.out.println("How many minutes did you talk?");
		time = scan.nextInt();
		System.out.println("Your monthly bill is $" + bill.calculateBill(time));

	}

}
