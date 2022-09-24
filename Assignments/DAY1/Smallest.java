import java.util.Scanner;
class Smallest{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a<b && a<c){ //4,5,6
			System.out.println(a+ " is smallest.");
		}else if(b<c){
			System.out.println(b+ " is smallest.");
		}else{
			System.out.println(c+ " is smallest.");
		}
    }
}	



			