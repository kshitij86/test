package com.company;

import java.util.*;

class AnagramMaker{
	
	private static boolean isAnagram(int[]c1, int[] c2){
		boolean areTheyEqual = Arrays.equals(c1, c2); 
		return areTheyEqual; 
	}

	private static int[] arrayMaker(String x){
		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		// Make a character array of 26 chars to keep track of each alphabet. 
		int[] freqCharacters = new int[26]; 
		// Fill it with zeroes.
		
		Arrays.fill(freqCharacters, 0);
		
		for(int j = 0; j < x.length(); j++){
			for(int i = 0; i < alphabet.length; i++){
				if(alphabet[i] == x.charAt(j)) ++freqCharacters[i]; 
			}
		}
		return freqCharacters;
	}

	private static int stepsToMakeAnagram(String s, String t){
		int[] fors = arrayMaker(s); int[] fort = arrayMaker(t);
		int unequals = 0 ;
		System.out.println(isAnagram(fors, fort));
		for (int i : fors) System.out.print(i + " "); 
		System.out.println();		
		for (int i : fort) System.out.print(i + " "); 
		System.out.println();
		if(isAnagram(fors, fort)) return unequals;
		else{
			// Check by how many values both of them differ. 
			for(int i = 0; i < 26; i++){
				if(fors[i] != fort[i]) unequals++; 
			}
		}
		return unequals-1; 
	}

	public static void main(String[] args) {
		System.out.println("Steps to make anagram : " + stepsToMakeAnagram("friend", "family")); 
		System.out.println();
	}
}