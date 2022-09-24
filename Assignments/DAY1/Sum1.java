import java.util.Scanner;
class Sum1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= b; i++){
			sum = ++a;
		}
		System.out.println(sum);
	}
}	