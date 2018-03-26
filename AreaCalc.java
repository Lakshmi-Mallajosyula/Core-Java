package concepts;
import java.util.Scanner;

abstract class Shape{
	abstract double area();
}

class Circle extends Shape{
	double area() {
		System.out.println("Area of the Circle");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the circle : ");
		int r = sc.nextInt();
		double ar = 3.14 * r * r;
		sc.close();
		return ar;
	}
}

class Rectangle extends Shape{
	double area() {
		System.out.println("Area of the Rectangle");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the Rectangle : ");
		int l = sc.nextInt();
		System.out.println("Enter the breadth of the Rectangle : ");
		int b = sc.nextInt();
		double ar = l * b;
		sc.close();
		return ar;
	}
}

class Square extends Shape{
	double area() {
		double ar = 0;
		System.out.println("Area of the Square");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the square : ");
		int l = sc.nextInt();
		ar = l * l;
		sc.close();
		return ar;
	}
}

public class AreaCalc {

	public static void main(String[] args) {
		Shape a; //Created an object for the class Shape
		double z = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print(("Enter the shape of the object - Circle-1; Rectangle-2; Square-3: "));
		String objectsp = sc.next();

		switch (objectsp) {
		case "1":{
			a = new Circle(); //Object a is assigned as a reference to the class Circle
			z = a.area(); //Calling the method area in the class Circle
			break;
		}	
		case "2":{
			a = new Rectangle(); 
			z = a.area(); 
			break;
		}
		case "3":{
			a = new Square();
			z = a.area(); 
			break;
		}
		default:{
			System.out.println("Invalid input");
			break;
		}
		}
		System.out.println("The area of the object is : "+ z);
		sc.close();
	}
}
