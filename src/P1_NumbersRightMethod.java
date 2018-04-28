/*
	ISYS 320
	Name(s):Carolyn
	Date: 
*/

public class P1_NumbersRightMethod {

	public static void main(String[] args) {
		for (int line = 1; line <= 7; line++) {
			for (int i = 1; i <= line * -1 + 7; i++) {
				System.out.print(" ");
			}
			for (int num = 1; num <= line; num++) {
				System.out.print(line);
			}
			System.out.println();

	}

}
}