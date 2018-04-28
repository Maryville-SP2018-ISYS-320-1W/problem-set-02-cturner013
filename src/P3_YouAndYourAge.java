import java.util.Scanner;

/*
	ISYS 320
	Name(s):
	Date: 
*/

public class P3_YouAndYourAge {

	

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
	    System.out.print("Input your first name: ");
	    String fname = input.next();
	    System.out.print("Input your age: ");
	    String age = input.next();
	    System.out.println();
	    System.out.printf("Hello \n"+fname+"it's hard to believe your", "+age+ "  + "it's nice to meet you");
	}

}
