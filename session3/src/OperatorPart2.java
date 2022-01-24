public class OperatorPart2 {
	public static void main(String []args){

		// 5. bitwise operator
		//  &, |, ^;

		int num1=10;               // 1010
		int num2=8;               // 1000

		int result1= num1 & num2;          // 1000 -> 8
		int result2= num1 | num2;         // 1010  -> 10
		int result3= num1 ^ num2;        // 0010  -> 2

		System.out.println("Result1 is: "+result1);
		System.out.println("Result2 is: "+result2);
		System.out.println("Result3 is: "+result3);


		// 6. Shift Operator
		//  >>, <<, >>>

		int a=8;  // data
		int b=3;  // key
		int c= a >> b; // a / 2powerb  8/2^3
		System.out.println("C rt Shift is: "+c);
		c= a << b;  // a * 2powerB   8 *2^3
		System.out.println("c left shift is: "+c);

		int result = c >> b;
		System.out.println("the rsult is: "+result);

		// 8 >> 3
		// 0 0 0 0  1 0 0 0
		// >> 3
		// _ _ _ 0  0 0 0 1
		// 0 0 0 0  0 0 0 1  -> 1

		// 8 << 3
		// 0 0 0 0  1 0 0 0
		// << 3
		// 0 1 0 0  0 _ _ _
		// 0 1 0 0  0 0 0 0  -> 64

		int x = -11;
		int y = 2;
		int z = x >> y;
		System.out.println("z now is: "+z);


		// 0 0 0 0 	1 0 1 1
		// 1 1 1 1  0 1 0 0
		//				+ 1
		// 1 1 1 1  0 1 0 1 -> -11
		// >> 2
		// _ _ 1 1  1 1 0 1
		// 1 1 1 1  1 1 0 1
		// 0 0 0 0  0 0 1 0
		//				+ 1
		// 0 0 0 0  0 0 1 1 -> -3

		// SE: see of you can do it with other methods :)
		//     work with right shift for negative numbers


		z= x << y;
		System.out.println("left shift negative number: "+z);

		// 0 0 0 0 1 0 1 1
		// 1 1 1 1 0 1 0 0
		 //            + 1
		// 1 1 1 1 0 1 0 1 -> -11
		// << 2
		// 1 1 0 1 0 1 _ _
		// 1 1 0 1 0 1 0 0
		// 0 0 1 0 1 0 1 1
		//             + 1
		//0 0 1 0 1 1 0 0 -44

		// 7. Ternary Operator
		String name = "John Watson";
		int eWallet =  300;
		int cabFare = 500;


		String message = (eWallet > cabFare) ? "Cab Booked" : "Please recharge your wallet";
		System.out.println("message is: "+message);

	}
}
