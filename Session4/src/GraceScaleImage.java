

//Assignment 3: GraScale The Image
//   For a pixel sum af all values and divide by 3
//    for eg. values 12,34,45  12+34+45/3= 25
//     then pixel1=[25,25,25)







import java.util.Scanner;

public class GraceScaleImage {
	public static void main(String []args){
		int grayScale=0;
		int sum=0;

		Scanner scanner = new Scanner(System.in);
		int[][][] image= new int[3][3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("Enter Pixcel"+(j+1));
				for (int k = 0; k < 3; k++) {
					image[i][j][k]=scanner.nextInt();
					sum+=image[i][j][k];
				}
				grayScale=sum/3;
				sum=0;
				for (int k = 0; k < 3 ; k++) {
					image[i][j][k]=grayScale;
				}
				grayScale=0;
			}
		}


		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("[");
				for (int k = 0; k < 3; k++) {
					System.out.print(+image[i][j][k]+",");
				}
				System.out.print("] ");
			}
			System.out.println(" "+i);
		}








	/*	int[][][] image={
				         {       {32,46,234},
						         {54,67,34},
						         {0,78,45}},

		                 {       {32,12,123},
				                 {123,45,67},
				                 {12,45,67} },

				         {       {24,45,67},
						         {23,45,67},
						         {78,23,45} }

		};


		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <3 ; j++) {
				for (int k = 0; k < 3; k++) {
					 sum=0;
					sum+=image[i][j][k];
				}
				grayScale=sum/3;
				for (int k = 0; k < 3; k++) {
					image[i][j][k]=grayScale;
					System.out.print(image[i][j][k]+",");
				}
				System.out.print(" ");
			}
			System.out.println();

		}*/


	}
}
