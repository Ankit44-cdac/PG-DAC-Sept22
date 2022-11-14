import java.util.*;
class SQ14{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = sc.nextLine();
		System.out.println("Reverse of " +str+ " is: " +reverseStr(str));
	}
	static String reverseStr(String s){
		if(s.length() == 0){
			return s;
		}
		return reverseStr(s.substring(1)) + s.charAt(0); 
	}
}	
		