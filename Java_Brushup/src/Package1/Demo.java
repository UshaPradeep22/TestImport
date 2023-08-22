package Package1;
import Package2.Test;

class Demo {
	
	public static void main(String [] args)
	{
		Test ref=new Test();//test
		ref.m1();
		System.out.println(ref.insVar);
	}

}
