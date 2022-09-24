import java.util.Scanner;
class PrintDigits{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int pnum = sc.nextInt();
		
		int rem = 0;
		while(pnum!=0){
			
			rem = pnum % 10;
			System.out.println("digits : " + rem);
			pnum = pnum/10;
		}
    }
}	

			
		
		
		