package p1;
import java.util.Scanner;

public class Calculator2 implements Calculator {

	@Override
	public void mul() {
		System.out.println("Enter the two values:");
		Scanner scan =new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=a*b;
		System.out.println("Multiplication is: "+c);
		

	}

	@Override
	public void div() {
		System.out.println("Enter the two values:");
		Scanner scan =new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=a/b;
		System.out.println("Division  is: "+c);
		

	}

}
