import java.util.Scanner;
class P14{
	public static void main(String args[]){
		Scanner p = new Scanner(System.in);
		int n = p.nextInt();
		for(int i = n; i > 1; i--){
			for(int j = 1; j <= n-i; j++){		
				System.out.print(" ");
        	}
			for(int j = i; j >= 1; j--){		
				System.out.print("* ");
        	}
			
			System.out.println();
        }			
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= n-i; j++){		
				System.out.print(" ");
			}	
			for(int j = 1; j <= i; j++){		
				System.out.print("* ");
			}
			System.out.println( );
		}	
		
		
    }
}	