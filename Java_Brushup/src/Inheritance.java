class Child{
	private int x=90;
	final protected char a='t';
	final static void Child_Method()
	{
	System.out.println("Child method running");	
	}
	Child()
	{
		x=98;
	}
}
class Parent extends Child{
	void Parent_Method()
	{
	System.out.println("Parent method running");	
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent refvar= new Parent();
		Child.Child_Method();
		refvar.Parent_Method();
		refvar.Child();
		System.out.println(Child.x);
		System.out.println(refvar.a);

	}

}
