import java.util.Scanner;
import java.util.Scanner;
class Pat10{
	public static void main(String args[]){
		Scanner p = new Scanner(System.in);
		int m = p.nextInt();
		char ch = 'A';
		
		for(int i=m; i >= 1; i--){
			
			for(int j=1; j < i; j++){	
				System.out.print(" ");	
			}	
			
			for(int j=i; j <= m; j++){
				char k = (char)(j+64);
				System.out.print(k+ " ");
				
			}	
				
			
			System.out.println();
		}	
			
		
	}
}	