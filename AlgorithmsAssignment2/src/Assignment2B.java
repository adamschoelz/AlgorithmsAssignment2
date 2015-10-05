
// Name: Adam Schoelz

import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class Assignment2B {
	
	
	public int numPalindrome(String input) {
		return findAllPalindrome(input).size();
	}
	
	public static int bruteForceNumPalindrome(String input){
		int palinCount = 0;
		ArrayList<String> palinList = new ArrayList<String>();
		for(int i = 0; i < input.length(); i++){
			for(int j = 0; j < input.length(); j++){	
				if(j + i < input.length() && checkPalindrome(input.substring(j, j+i))){
					palinCount++;
					palinList.add(input.substring(j, j+i));
				}	
			}
		}
		
		printList(palinList);
		return palinCount;
	}
	
	public static void printList(ArrayList list){
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}
	}
	
	public ArrayList<String> findAllPalindrome(String str){
		
		ArrayList<String> allPalin = new ArrayList<String>();
		
		//Check each palindrome center to find longest palindrome
		for(int i = 0; i < str.length(); i++){
			expandAll(str, i, false, allPalin);
			
			if(i < str.length() -1 && str.charAt(i) == str.charAt(i + 1)){
				expandAll(str, i, true, allPalin);
			}
		}
		printList(allPalin);
		
		return allPalin;
	}
	
	//Finds all palindromes starting from selected character
	public String expandAll(String str, int index, boolean inbetween, ArrayList<String> all){
		StringBuilder palin = new StringBuilder();
		int dist = 0;
		
		//Generate palindrome center
		if(inbetween){
			palin.append(str.charAt(index));
			palin.append(str.charAt(index + 1));
			all.add(palin.toString());
		}
		else{
			palin.append(str.charAt(index));
			all.add(palin.toString());
		}
		
		//Grow palindrome around center
		while(index - dist > 0 && index + dist < str.length() - 1 - (inbetween ? 1 : 0)){
			
			char ch1 = str.charAt(index - dist - 1);
			char ch2 = str.charAt(index + dist + 1 + (inbetween ? 1 : 0));
			
			
			all.add(palin.toString());

			if(ch1 == ch2){
				palin.append(ch1);
				palin.insert(0, ch2);
				all.add(palin.toString());
			}
			else{
				//System.out.println("broken!");
				break;
			}
			dist++;

		}
		
		//System.out.println(palin);

		
		return palin.toString();
	}
	
	public static boolean checkPalindrome(String str){
		boolean toReturn = true;
		
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
				toReturn = false;
				break;
			}
		}
		
		return toReturn;
	}
}
