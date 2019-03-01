package p1;

public class Calculator1 implements Calculator {

	@Override
	public void mul() {
		int a=7;
		int b=2;
				int c=a*b;
		System.out.println("Multiplication of two number is: "+c );
		

	}

	@Override
	public void div() {
		int a=7;
		int b=2;
				int c=a/b;
		System.out.println("Division  of two number is: "+c );
		
		

	}

}
