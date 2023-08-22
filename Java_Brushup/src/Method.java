
public class Method {
	static int ivalue=25;
	 static int methodprint(int ivalue1)
	{
		 Method.ivalue=ivalue1;
		return Method.ivalue;
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int result=methodprint(30);
System.out.println(result);
//return;
	}

}
