import java.util.Scanner;
class P15{
	public static void main(String args[]){
		Scanner p = new Scanner(System.in);
		int n = p.nextInt();
		
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= i; j++){
				if(i==n||j==1||i==j){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}	
			}	
			System.out.println();	
        }
    }
}	