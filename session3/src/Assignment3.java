
// Explore labels with break and continue in Java and write a program for the same


public class Assignment3 {

	public  static void main(String []args){
		int rolno1=7;
		int rolno2=4;
		for (int i = 1; i <= 10; i++) {
			if(i<rolno2){
				continue;
			}
			else if(i==rolno1){
				System.out.println("He is topper of ur class");
				break;
			}else {
				System.out.println(i);
			}
		}
	}
}
