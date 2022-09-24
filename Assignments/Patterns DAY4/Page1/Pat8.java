import java.util.Scanner;
class Pat8{
	public static void main(String args[]){
		Scanner p = new Scanner(System.in);
		int m = p.nextInt();
		
		for(int i=m; i >= 1; i--){
			
			for(int j=1; j < i; j++){	
				System.out.print(" ");
			}	
			for(int j=i; j <= m; j++){	
				System.out.print(j+ " ");
				
			}	
				
			
			System.out.println();
		}	
			
		
	}
}	