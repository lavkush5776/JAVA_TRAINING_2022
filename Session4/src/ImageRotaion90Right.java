//Assignment: 1: Rotate the image 90 degrees to Right;





public class ImageRotaion90Right {

	public static void main(String []args){




		String[][][] image={
				{       {"p1","p1","p1"},
						{"p2","p2","p2"},
						{"p3","p3","p3"}},

				{       {"p4","p4","p4"},
						{"p5","p5","p5"},
						{"p6","p6","p6"} },

				{       {"p7","p7","p7"},
						{"p8","p8","p8"},
						{"p9","p9","p9"} }

		};


		for (int i = 0; i< 3; i++) {
			for (int j =0; j<3; j++) {
				System.out.print("[");
				for (int k = 0; k <3; k++) {
					System.out.print(image[i][j][k]+",");
				}
				System.out.print("] ");
			}
			System.out.println(" "+i);
		}


		System.out.println();
		System.out.println("-------------------------------------");
		System.out.println("Image rotated 90 degree to Right: ");
		System.out.println();
		System.out.println("___________________________________");

		for (int i = 0; i<=2; i++) {
			for (int j =2; j>=0; j--) {
				System.out.print("[");
				for (int k = 2; k>=0; k--) {
					System.out.print(image[j][i][k]+",");
				}

				System.out.print("] ");
			}

			System.out.println();
		}
		System.out.println("----------------------------------");

	}
}
