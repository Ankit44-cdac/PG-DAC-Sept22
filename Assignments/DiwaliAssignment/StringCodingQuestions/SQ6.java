/*How to find duplicate characters in a String?*/

import java.util.*;
class SQ6{  
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.nextLine();  
		int count;  
		char c[] = str.toCharArray();  
		System.out.println("Duplicate characters in a given string: ");  
		for(int i = 0; i <c.length; i++) {  
			count = 1;  
			for(int j = i+1; j <c.length; j++) {  
				if(c[i] == c[j] && c[i] != ' ') {  
					count++;   
					c[j] = '0';  
				}  
			}   
			if(count > 1 && c[i] != '0'){  
				System.out.println(c[i]);
			}
		}  
	} 
}	