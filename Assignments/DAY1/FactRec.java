import java.util.Scanner;
class FactRec{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no.:");
		int num = sc.nextInt();
		int fact1 = fact(num);
		System.out.println("Factorial of "+ num + " is: " + fact1);	
	}
	public static int fact(int n){
		if(n == 0){
			return 1;
		}else {	
			int m = n * fact(n-1);
			return m;
		}	
	}
}