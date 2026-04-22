package oopsConcepts;

public class InterfacePracticeTest implements shape{

	@Override
	public void circle() {
		System.out.println("this is implements---abstract methods are always public methods");	
	}
	public static void trapiz() {
		System.out.println("Tytdueiww");
	}
	public static void main(String [] args) {
		//Scenario 1
		InterfacePracticeTest obj=new InterfacePracticeTest();
		obj.square();
		obj.circle();
		shape.rectangle();
		System.out.println("=======================");
		//Scenario 2
		//shape sh=new shape();// This is not posible because we cannot instattiate the interface we can create object for the interface 
		
		shape sh= new InterfacePracticeTest();
		sh.circle();
		sh.square();
		shape.rectangle();
	
		
	}
	
	

}
interface shape{
	 int length=10; //in interface variables are always final and static
	int hight=12;//in interface variables are always final and static
	//abstarct method
	void circle();
	//interface allows default methods
	default void square() {
		System.out.println("This is square-default methods");
		
	}
	//interface allows static methods
	static void rectangle() {
		System.out.println("This is rectangle-static methods");
	}
		
}
