import java.util.Scanner;
class OddSeries{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter upto what number you want to print odd series:");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++){
			if((i % 2)!= 0){
				System.out.print(i+ " ");
			}	
				
		}
	}
}	
	