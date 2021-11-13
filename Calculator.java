package Week3.Day1;

public class Calculator {
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	
	public void add(int a,int b, int c) {
		System.out.println(a+b+c);
	}
	
	public void multiply(int a,int b) {
		System.out.println(a*b);
	}
	
	public void multiply(int a,int b, int c) {
		System.out.println(a*b*c);
	}
	
	public void division(int a,int b) {
		System.out.println(a/b);
	}
	
	public void division(double a,int b) {
		System.out.println(a/b);
	}
	
	public void Subtraction(int a,int b) {
		System.out.println(a-b);
	}
	
	public void Subtraction(double a,double b) {
		System.out.println(a-b);
	}
	
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		calc.add(10, 20);
		calc.add(10, 20, 30);
		calc.multiply(10, 20);
		calc.multiply(10, 20, 30);
		calc.division(20, 2);
		calc.division(2000,2);
		calc.Subtraction(20, 10);
		calc.Subtraction(5000, 4000);
	}
}

