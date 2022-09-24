import java.util.Scanner;
class SumDigits{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int pnum = sc.nextInt();
		int sum = 0;
		int rem = 0;
		while(pnum!=0){
			
			rem = pnum % 10;
			sum = sum + rem;	
			pnum = pnum/10;
		}
		System.out.println("Sum is : " + sum);
    }
}	

			
		
		
		