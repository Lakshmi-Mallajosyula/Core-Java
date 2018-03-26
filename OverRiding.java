package concepts;

class ParentOne{
	void display() {
		System.out.println("Parent class method");
	}
	
	void displayParent() {
		System.out.println("Parent class method with different method name");
	}
	
	void superChk() {
		System.out.println("Both Parent class method");
	}
}

class Child extends ParentOne {
	void display() {
		System.out.println("Child class method");
	}
	
	void displayChild() {
		System.out.println("Child class method with different method name");
	}

	void superChk() {
		super.superChk();  //Calls parent's method
		System.out.println("Both Child class method");
	}	
}

public class Overriding {

	public static void main(String[] args) {
		ParentOne P=new ParentOne(); //Parent reference to parent object - none of the child methods will be accessible.
		P.display(); //Calls the display method of the parent class
		P.displayParent(); //Calls the displayParent method of the parent class
		P.superChk(); //calls the superChk method from the parent class
		System.out.println("***********End of Parent reference to parent object ***********");
		
		Child C=new Child(); //Child reference to child object - Can access methods from both parent and child classes.
		C.display();  //Child display method overrides the parent display method 
		C.displayParent();  //Calls the displayParent method of the parent class with child reference
		C.displayChild();  //Calling child method
		C.superChk(); //Call superChk child methods and parent superChk method using Super keyword
		System.out.println("***********End of Child reference to child object***********");
		
		ParentOne PC=new Child();  //Parent reference to child object  - can access parent methods and overridden child methods. Cannot access child methods
		PC.display(); //Child display method overrides the parent display method 
		PC.displayParent(); //Calls the displayParent method of the parent class
		PC.superChk(); //Child superChk method overrides the parent superChk method
		System.out.println("***********End of Parent reference to child object***********");
	}
}
