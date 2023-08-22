import java.util.Scanner;
public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    char a;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the alphabet");
		a=scanner.next().charAt(0);
		switch(a) {
		case 'a':
		{
			System.out.println("It is an vowel");
			break;
		}
		
		case 'e':
		{
			System.out.println("It is an vowel");
			break;
		}
		default:
		{
			System.out.println("It's consonant");
		}
	}

}
}
