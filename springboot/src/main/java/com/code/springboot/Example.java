package com.code.springboot;

public class Example {

	public static void main(String[] args) {
		boolean f = false; 
		for(int i=0; i<100; i++) {
			if(i==10) {
				 f = true;  
				 System.out.println(f);
			}
			System.out.println(i+10);
		}
	}

}
