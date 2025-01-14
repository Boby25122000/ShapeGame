package shapeGame;
import java.util.*;
public class User {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Game g=new Game();
		char c;
		do {
			int choice=g.selectShape();
			if(choice==1) {
				System.out.println("You have Selected 2D Shape");
				TwoDShape td=g.selectTwoDShape();
				td.getArea();
				td.getPerimeter();
			}
			else {
				System.out.println("You have Selected 3d Shape");
				ThreeDShape td=g.selectThreeDShape();
				td.getVolume();
				td.getCurvedSurfaceArea();
				td.getTotalSurfaceArea();
			}
			System.out.println("Press Y/y to restart.....");
			c=sc.next().charAt(0);
		} while(c=='y' || c=='Y');
		System.out.println("*****Thank You for Playing Game*****");
	}
}
