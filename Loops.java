package mypakage;

import java.util.ArrayList;

public class Loops {
	public static void main(String [] args) {
		// int s = 0 its mean condition starts
		// s <=6 means condition ends
		//++ means incremental
		// -- means decremental
		
		
	//	for loop
		for (int s = 0; s<=5; s++) {
			System.out.println("i love java : value s is="+s);
		}
		
		//while loop
		int a = 0;
		while (a<5) {
			System.out.println("this is a while loop : value a is =" +a);
			a++;
		}
		//enhanced for loop
		//create an array and insert  3 names
		String array[] = {"apu","sowrov","adnan"};
		System.out.println("length of array is "+array.length);
		for(String s: array) {
			System.out.println("my name is "+s);
		}
		
		//do while
		int c = 20;
		do {
			//System.out.println("my num is "+c);
			c++;
			
		} while (c<20);
		ArrayList <String> arraylist = new ArrayList<>();
		
		//System.out.println(arraylist.size());
		//System.out.println(arraylist.get(0));
		for(int l =0; l<5; l++) {
			arraylist.add("opu");
			
		}
		System.out.println(arraylist.size());
		System.out.println(arraylist.get(3));
			
		}
			
		 
		
	
	}


