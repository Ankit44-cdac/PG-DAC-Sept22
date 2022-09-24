import java.util.Scanner;
class Swap{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first no.:");
		int num1 = sc.nextInt();
		System.out.println("Enter second no.:");
		int num2 = sc.nextInt();
		System.out.println("Swapping numbers,");
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("After Swapping, numbers are: " + num1 + " and " + num2);
	}
}	
		
		