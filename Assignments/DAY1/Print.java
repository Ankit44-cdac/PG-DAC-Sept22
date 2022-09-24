class Print{
	public static void main(String args[]){
		printnum(1);
	}
	public static int printnum(int num){
		if(num <= 10){
			System.out.println(num);
			printnum(num+1);
		}
		return num;
	}
}	