package shapeGame;

public class Square implements TwoDShape {
	double side;
	
	Square() {
		
	}
	Square(double side) {
		this.side=side;
	}
	public void getArea() {
		System.out.println("Area of square is: "+side*side+ " Sq.Unit");
	}
	public void getPerimeter() {
		System.out.println("Perimeter of Square is: "+4*side+" Sq.Unit");
	}
}
