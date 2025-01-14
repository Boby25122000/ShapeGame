package shapeGame;

public class Circle implements TwoDShape {
	double r;
	Circle() {
		
	}
	Circle(double r) {
		if(r>0) {
			this.r=r;
		}
		else {
			System.out.println("Invalid Radiu Entered");
		}
		
	}
	public void getArea() {
		System.out.println("Area of Circle is: "+Math.PI*r*r+" Sq.Unit");
	}
	public void getPerimeter() {
		System.out.println("Perimeter of Circle is: "+2*Math.PI*r+" Unit");
	}
}
