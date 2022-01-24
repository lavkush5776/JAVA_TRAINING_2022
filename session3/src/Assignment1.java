
// Assignment: Place the n-queens on the chessboard by taking input form the User
//			   eg: User says row -> 1 and col -> 1 as input -> replace it with queen
//			   a total of 4 inputs can be taken to place 4 queens in the chessboard
//			   no queen can be placed in the same row again or same column again :)
//			   Hint: use a do, while loop and make sure not to take more than 4 queens positions


import java.util.Scanner;

public class Assignment1 {

		public static int NO_OF_QUEENS = 4;

		public static void main(String[] args) {

			int [] board = {-1, -1, -1, -1,-1, -1, -1, -1};

			for (int i = 0; i < NO_OF_QUEENS; i++) {
				board[0] = i;
				for (int j = 0; j < NO_OF_QUEENS; j++) {
					board[1] = j;
					if (noKill(board, 1)) {
						for (int k = 0; k < NO_OF_QUEENS; k++) {
							board[2] = k;
							if (noKill(board, 2)) {
								for (int l = 0; l < NO_OF_QUEENS; l++) {
									board[3] = l;
									if (noKill(board, 3)) {
										displayQueens(board);
									}
								}
							}
						}
					}
				}

			}
		}
		private static void displayQueens(int[] board) {

			char blackSquare = '\u25A0';	// 1
			char whiteSquare = '\u25A1';	// 0
			char queen = '\u2655';
			System.out.println("-------------");
			int n = board.length;
			for (int row = 0; row < n; row++) {
				for (int j=0;j<n ;j++) {
					if (board[j] == row) {
						System.out.print(queen+" ");
					} else if((j+row)%2==0) {
						System.out.print(blackSquare+" ");
					}
					else {
						System.out.print(whiteSquare+" ");
					}
				}
				System.out.println();
			}
		}

		private static boolean noKill(int[] board, int currentColumnOfQueen) {

			for (int i = 0; i < currentColumnOfQueen; i++) {
				// same row
				if (board[i] == board[currentColumnOfQueen])
					return false;

				//Diagonal
				if ((currentColumnOfQueen - i) == Math.abs(board[currentColumnOfQueen] - board[i])) {
					return false;
				}

			}
			return true;

		}

	}


































	/*public static void main(String []args){
		Scanner scanner= new Scanner(System.in);

		char blackSquare = '\u25A0';	// 1
		char whiteSquare = '\u25A1';	// 0
		char queen = '\u2655';
		int input=4;

             int row1= scanner.nextInt();
              int colm1 = scanner.nextInt();
		      int row2= scanner.nextInt();
		      int colm2 = scanner.nextInt();
		      int row3= scanner.nextInt();
		      int colm3 = scanner.nextInt();
		      int row4= scanner.nextInt();
		      int colm4 = scanner.nextInt();
		int [] row= new int[input];
		int [] colm= new int[input];
		for (int i = 0; i < input; i++) {
			 row[i]= scanner.nextInt();
			 colm[i] = scanner.nextInt();
		}

			 for (int i=0;i<8;i++){
				 for (int j=0; j<8;j++){
						 if (i == row[j] && j == colm[j]) {
							 System.out.print(queen + " ");
						 } else if ((i + j) % 2 == 0) {
							 System.out.print(blackSquare + " ");
						 } else {
							 System.out.print(whiteSquare + " ");
						 }

				 }
				 System.out.println();
			 }



	}
}*/
