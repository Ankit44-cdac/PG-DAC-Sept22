import java.util.Scanner;
class PP5{
	public static void main(String args[]){
		Scanner p = new Scanner(System.in);
		int n = p.nextInt();
		for(int i = n; i >= 1; i--){
			for(int j = 1; j < i; j++){		
				System.out.print(" ");
			}	
			for(int j = i; j <=n; j++){		
				System.out.print(j);
			}
					
			for(int j = n-1; j>=i; j--){
				System.out.print(j);
			}		
			System.out.println( );	
		}
		
    }
}	