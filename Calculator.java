package switch_statements;

public class Calculator {

	public static void main(String[] args) {
		int a = 2,b =10;
		char op ='+';
		
		switch(op) {
		
		case '+':
			System.out.println(a+b);
			break;
	   
		case '-':
			System.out.println(a-b);
			break;
			
		case '*':
			System.out.println(a*b);
			break;
			
		case '/':
			System.out.println(a/b);
			break;
		default:
			System.out.println("Invalid choice");
		
		}
		
	}

}
