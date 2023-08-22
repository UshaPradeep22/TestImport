import java.util.Scanner;

public class Reverse_Number {
	
	public static void ReverseMethod(int num) {
			System.out.print(num%10);
			if(num>=10) {
				ReverseMethod(num/10);
			}
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int getnum;
	System.out.println("Enter any number");
	Scanner scanner=new Scanner(System.in);
	getnum=scanner.nextInt();
	ReverseMethod(getnum);
	}

}
