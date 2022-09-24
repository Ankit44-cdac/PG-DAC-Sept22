import java.util.Scanner;
class Pat2{
	public static void main(String args[]){
		Scanner p = new Scanner(System.in);
		char m = p.next().charAt(0);
		char n = 'A';
		for(char i=n; i <= m; i++){
			for(char j=n; j <= i; j++){	
				System.out.print(j+ " ");
			}
			System.out.println();
		}	
			
		
	}
}	