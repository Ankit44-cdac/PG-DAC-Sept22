import java.util.Scanner;
class Palindrome{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int rem = 0;
		int n1 = num;
		int rev = 0;
		
		while(n1!=0){
			rem = n1%10;
			rev = rev * 10 + rem;
			n1 = n1/10;
			
        }
		
		
		if(rev == num){
			System.out.println(num+ " is Palindrome Number!");
		}else{
			System.out.println(num+ " is Not Palindrome Number!!");
		}	
    }
}	