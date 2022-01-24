//Assignment: 1. Implement Ternary Operators if possible in above scenario
// 			   2. Whenever a wrong promo code is applied, tell the user whats the right promo code
//			   3. implement a use case i.e. Book a Cab by taking OLA/Uber as a case study


import java.util.Scanner;

public class Assignment2 {

	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in); // Scanner Object Construction

		System.out.println("Enter an Amount: ");
		double amount = scanner.nextDouble(); // to read a double

		System.out.println("Enter Promo Code: ");
		//String promoCode = scanner.nextLine(); // to read a String
		int promoCode = scanner.nextInt();

		scanner.close(); // release the memory resources
		// 2 Promo Codes :)
		int JUMBO = 101;   // Flat 50% off for the items worth 200 or more
		int ZOMHELLO = 201; // Flat 60% off for the items worth 159 or more upto 120

		double discount = 0;

		if(amount >= 159 ) {
			System.out.println("You will get Discount");

			discount = (promoCode ==  JUMBO && amount >= 200) ?
					amount * 0.5 :
					(promoCode == ZOMHELLO) ?
							((amount * 0.6 > 120) ?
									120 :
									amount * 0.6):
							0;

			String str = (promoCode ==  JUMBO ) ?
					"Promo code JUMBO applied successfully \n Discount is " + discount :
					(promoCode == ZOMHELLO) ?
							"promo code ZOMHELLO applied successfully \n Discount is " + discount :
							"Invalid promo code try using JUMBO or ZOMHELLo";
			System.out.print(str);

		}
		else {

			System.out.println("Amount is Lesser. Please add items worth "+(159-amount)+" more");
		}

	}

}
