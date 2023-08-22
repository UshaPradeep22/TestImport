
public class InbuiltString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="UshaU";
		String s1="Ushau  ";
		//System.out.println(s.charAt(0));   //charAt 
		char[] ch1=s.toCharArray(); //toCharArray
		for(int i=0;i<ch1.length;i++)
		{
		//System.out.println(ch1[i]);
		}
		//System.out.println(s.indexOf('U')); //indexOf
		int x=s.indexOf('U');
		int y=s.indexOf('U',x+1);
		//System.out.println(y);
		//System.out.println(s.startsWith("Us"));
		//System.out.println(s.endsWith("AU"));
		//System.out.println(s.equals(s1));
		//System.out.println(s.equalsIgnoreCase(s1));
		//System.out.println(s.toUpperCase());
		//System.out.println(s.toLowerCase());
		//System.out.println(s.length());
		//System.out.println(s1.trim());
		//System.out.println(s.substring(1, 4 ));

	}

}
