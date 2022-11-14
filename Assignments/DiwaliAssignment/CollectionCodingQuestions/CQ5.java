/*Write a Java program to reverse elements in a array list.*/

import java.util.*;
class CQ5{
	public static void display(List<String> mylist)
	{	
		System.out.println("-------------------------------------");
		Iterator<String> it = mylist.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	public static void main(String[] args){
		List<String> colors = new ArrayList<>();
		colors.add("Blue");
		colors.add("Red");
		colors.add("Green");
		colors.add("Yellow");
		colors.add("Orange");
		colors.add("Violet");
		colors.add("Indigo");
		colors.add(0,"Black");
		System.out.println("List before Reversing: ");
		display(colors);
		Collections.sort(colors,Collections.reverseOrder());
		System.out.println("\nList after Reversing: ");
		display(colors);
	}
}	