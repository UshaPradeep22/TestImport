
public class Constructor {
	int var1;
	
	Constructor(int arg1) //Parameterized constructor
	{
		var1=arg1;
		//System.out.println("tets");
	}
	Constructor(int arg2,String s1)
	{
		System.out.println(s1);
	}
	Constructor(String s2,int arg3)
	{
		System.out.println(s2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor ref=new Constructor(500);
		System.out.println(ref.var1);
		Constructor ref1=new Constructor(250,"usha");
		Constructor ref2=new Constructor("Aura",1);
		//System.out.println
	}

}
