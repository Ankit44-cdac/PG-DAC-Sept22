import java.util.Scanner;
class EvenSeries{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter upto what number you want to print even series:");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++){
			if(i % 2 == 0){
				System.out.print(i+ " ");
			}	
				
		}
	}
}	
	