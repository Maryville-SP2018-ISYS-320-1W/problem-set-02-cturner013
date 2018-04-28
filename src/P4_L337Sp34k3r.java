import java.util.Scanner;

/*
	ISYS 320
	Name(s):
	Date: 
*/

public class P4_L337Sp34k3r {

	private static Object Object;

	public static void main(String[] args) {
		Object input;
		String line = ((Scanner) input).nextLine();
	      Scanner lineScanner = new Scanner(line);
	      Object output;
		while (lineScanner.hasNext()) {
	         String word = lineScanner.next();
	         word = word.replace("b", "B");
	         word = word.replace("u", "U");
	         word = word.replace("t", "7");
	         word = word.replace("t", "7");
	         word = word.replace("e", "3");
	         word = word.replace("r", "R");
	       {
	            word = word.substring(0, word.length() - 1) + "Z";
	         }
	          Object = output.print("(" + word + ") ");
	      

	}
	}

}
