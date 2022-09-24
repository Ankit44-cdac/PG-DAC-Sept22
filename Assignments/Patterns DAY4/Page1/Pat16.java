import java.util.Scanner;
class Pat16{
	public static void main(String args[]){
		Scanner p = new Scanner(System.in);
		int n = p.nextInt();
		
		for(int i = 1; i <= n; i++){
			int x = n;
			for(int j = 1; j<=i; j++){
				int a = x--;
				System.out.print(a+ " ");
				
			}
			System.out.println();
	    }
	}
}	