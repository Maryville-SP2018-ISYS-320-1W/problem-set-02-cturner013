import java.awt.Shape;

/*
	ISYS 320
	Name(s):
	Date: 
*/

public class P2_AreaComputer {

	public static void main(String[] args) {
		Shape[ ] shapes = new Shape[1];
		shapes[1] = new Triangle();
		
		
		for (int i = 0; i < shapes.length; i ++) {
			System.out.println("area = " + (shapes[i]).getArea() + ", perimeter = " + shapes[i].getPerimeter());
			

	}
}
}
