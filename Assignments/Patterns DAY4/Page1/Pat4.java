import java.util.Scanner;
class Pat4{
	public static void main(String args[]){
		Scanner p = new Scanner(System.in);
		int n = p.nextInt();
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= i; j++){		
				System.out.print(i+ " ");
        	}
			System.out.println();
		}
    }
}	