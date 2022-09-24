import java.util.Scanner;
class Pat17{
	public static void main(String args[]){
		Scanner p = new Scanner(System.in);
		int n = p.nextInt();
		int num = 1;
		for(int i = 1; i <= n; i++){
			for(int j = 1; j<=i; j++){
				System.out.print(num+ " ");
				num++;		
			}
			System.out.println();
	    }
	}
}	