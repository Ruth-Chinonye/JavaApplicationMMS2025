public class OperatorsPart2{
	public static void main(String[] args){
		int num1 = 70;
		int num2 = 50;
		int num3 = 120;
		
		// Logical Operators(&&, ||, !)
		boolean andResult = (num1 > num2) && (num1 != num3);
		System.out.printf("The AND result is %b%n", andResult);
		
		boolean orResult = (num1 > num2) || (num1 == num3);
		System.out.printf("The OR result is %b%n", orResult);
		
		boolean notResult = !((num1 > num2) || (num1 == num3));
		System.out.printf("The NOT result is %b%n", notResult);
		
		// Unary Operators (increament(++), pre-increment(++x) and post-increment(x++), 
		// Decrement(--), pre-decrement(--X) and post-decrement(x--)
		// Unary Increment Operator
		int x = 5;
		++x;
		++x;
		int y = ++x;
		
		System.out.println("The value of x is " + x);
		System.out.println("The value of y is " + y);
		
		x = 5;
		y = x++;
		System.out.println("The value of x is " + x);
		System.out.println("The value of y is " + y);
		
		// Unary Decrement Operator
		--x;
		--x;
		y = ++x;
		
		System.out.println("The value of decrement x is " + x);
		System.out.println("The value of decrement y is " + y);
		
		x = 5;
		y = x--;
		System.out.println("The value of x is " + x);
		System.out.println("The value of y is " + y);
	}
}