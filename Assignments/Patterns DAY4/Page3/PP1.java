import java.util.Scanner;
class PP1{
	public static void main(String args[]){
		Scanner p = new Scanner(System.in);
		int m = p.nextInt();
		
		
		for(int i=1; i <= m; i++){
			
			for(int j=1; j <= m-i; j++){	
				System.out.print(" ");
			}	
			for(int j=1; j <= i; j++){	
				System.out.print(i+ " ");
				
			}	
				
			
			System.out.println();
		}	
			
		
	}
}	