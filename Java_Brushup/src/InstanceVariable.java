
public class InstanceVariable {
	int var1=10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InstanceVariable refvar=new InstanceVariable();
		System.out.println(refvar);
		System.out.println(refvar.var1);
		InstanceVariable refvar1=new InstanceVariable();
		refvar.var1=15;
		System.out.println(refvar1.var1);
		System.out.println(refvar.var1);
		
	}

}
