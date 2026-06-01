package com.tcs.prep;

public class duplicate_1 {

	public static void main(String[] args) {
		String str = "program"; 

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {

				if (str.charAt(i) == str.charAt(j)) {
					System.out.println("Duplicate character found: " + str.charAt(i));
				
				}
			}
		}
	}
}