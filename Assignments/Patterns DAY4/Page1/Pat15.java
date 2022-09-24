import java.util.Scanner;
class Pat15{
	public static void main(String args[]){
		Scanner p = new Scanner(System.in);
		int n = p.nextInt();
		
		for(int i = 1; i <= n; i++){
			int x = n;
			for(int j = n; j>=i; j--){
				int a = x--;
				System.out.print(a+ " ");
				
			}
			System.out.println();
	    }
	}
}	