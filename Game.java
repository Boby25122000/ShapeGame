package shapeGame;
import java.util.Scanner;
public class Game {
	Game() {
		System.out.println("=====Game Has Started=====");
		System.out.println("**************************");
	}
	public int selectShape() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1====> for 2D Shape");
		System.out.println("Press 2====> for 3D Shape");
		
		int choice=sc.nextInt();
		if(choice==1) 
			return 1;
		else if(choice==2)
			return 2;
		else {
			System.out.println("Invalid Choice Entered");
			return selectShape();
		}
	}

//	2D Shape Starts............
	public TwoDShape selectTwoDShape() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1====> for Circle");
		System.out.println("Press 2====> for Triangle");
		System.out.println("Press 3====> for Rectangle");
		System.out.println("Press 4====> for Square");
		
		int choice=sc.nextInt();
		if(choice==1) {
			System.out.println("You have selected Circle");
			System.out.println("Enter the Radius: ");
			double radius=sc.nextDouble();
			Circle c1=new Circle(radius);
		return c1;
		}
		else if(choice==2) {
			System.out.println("You have selected Triangle");
			System.out.println("Enter the Side 1: ");
			double side1=sc.nextDouble();
			System.out.println("Enter the Side 2: ");
			double side2=sc.nextDouble();
			System.out.println("Enter the Side 2: ");
			double side3=sc.nextDouble();
		return new Triangle(side1, side2, side3);
		}
		else if(choice==3) {
			System.out.println("You have selected Rectangle");
			System.out.println("Enter the Length: ");
			double l=sc.nextDouble();
			System.out.println("Enter the Width: ");
			double w=sc.nextDouble();
		return new Rectangle(l,w);
		}
		else if(choice==4) {
			System.out.println("You have selected Square");
			System.out.println("Enter the Side: ");
			double side=sc.nextDouble();
		return new Square(side);
		}
		else {
			System.out.println("Valid Choice Entered");
			System.out.println("Please select from the valid choice!!");
			return selectTwoDShape();
		}
	}
//	2D Shapes End...............
	
//	3D Shapes Start................
	public ThreeDShape selectThreeDShape() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1====> for Cylinder");
		System.out.println("Press 2====> for Cube");
		int choice=sc.nextInt();
		if(choice==1) {
			System.out.println("You have selected Cylinder");
			System.out.println("Enter Radius: ");
			double r=sc.nextDouble();
			System.out.println("Enter Height: ");
			double h=sc.nextDouble();
		return new Cylinder(r,h);
		}
		else if(choice==2) {
			System.out.println("You have selected Cube");
			System.out.println("Enter side: ");
			double side=sc.nextDouble();
		return new Cube(side);
		}
		else {
			System.out.println("Invalid Choice Entered");
			System.out.println("Please select from the valid choice!!");
			return selectThreeDShape();
		}
	}
//	3D Shapes End.............
}
