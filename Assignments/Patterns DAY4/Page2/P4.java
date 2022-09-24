import java.util.Scanner;
class P4{
	public static void main(String args[]){
		Scanner p = new Scanner(System.in);
		int n = p.nextInt();
		for(int i = n; i >= 1; i--){
			for(int j = 1; j <= n-i; j++){		
				System.out.print(" ");
        	}
			for(int j = i; j >= 1; j--){		
				System.out.print("*");
        	}
			
			System.out.println();
        }			
		
		
		
		
    }
}	