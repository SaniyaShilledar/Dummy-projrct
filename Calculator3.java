package p1;
import java.util.Scanner;

public class Calculator3 implements Calculator {

	@Override
	public void mul() {
		System.out.println("Enter the two values:");
		Scanner scan =new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=a*b;
		if(a==0||b==0)
		{
			System.out.println("Multiplication is: 0");
		}
		else
		{
		
		System.out.println("Multiplication is: "+c);
		}

	}

	@Override
	public void div() {
		System.out.println("Enter the two values:");
		Scanner scan =new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=a/b;
		if(a==0&&b==0)
		{
			System.out.println("Division is: 0");
		}
		else
		{
			
		System.out.println("Division is: "+c);
		}

	}

}
