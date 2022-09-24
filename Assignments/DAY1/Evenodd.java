import java.util.Scanner;
class Evenodd{
	public static void main(String args[]){
		Scanner str = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = str.nextInt();   
		if(num % 2 == 0){
			System.out.println(num + " is even");
		}else{
			System.out.println(num + " is odd");
		}
	}
}	
		