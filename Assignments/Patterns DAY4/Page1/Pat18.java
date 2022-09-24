import java.util.Scanner;
class Pat18{
	public static void main(String args[]){
		Scanner p = new Scanner(System.in);
		int n = p.nextInt();
		char ch = 'A';
		
		for(int i = 1; i <= n; i++){
			int x = n;
			ch = 'A';
			for(int j = n; j>=i; j--){
				int a = x--;
				System.out.print(ch+++ " ");
				
			}
			System.out.println();
	    }
	}
}	