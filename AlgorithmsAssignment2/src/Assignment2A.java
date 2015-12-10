
//Name: Adam Schoelz
//ID: 010645574

public class Assignment2A {

	public static void main(String[] args) {
		Assignment2B palinfinder = new Assignment2B();
		
		System.out.println(makePalindrome("abracadabra"));
		
		System.out.println(palinfinder.numPalindrome("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"));
	}

	public static String makePalindrome(String input) {
		StringBuilder palin = new StringBuilder(findLongestPalindrome(input));
		StringBuilder beforePalin = new StringBuilder(input.indexOf(palin.toString()));
		StringBuilder afterPalin = new StringBuilder(input.substring(input.indexOf(palin.toString()) + palin.length(), input.length()));
		
		palin.insert(0, beforePalin);
		palin.append(afterPalin);
		palin.insert(0, afterPalin.reverse());
		palin.append(beforePalin.reverse());
		return palin.toString(); 
	}
	
	public static String findLongestPalindrome(String str){
		String longest = str.substring(0, 1);
		
		//Check each palindrome center to find longest palindrome
		for(int i = 0; i < str.length(); i++){
			if(expand(str, i, false).length() > longest.length()){
				longest = expand(str, i, false);
			}
			if(i < str.length() -1 && str.charAt(i) == str.charAt(i + 1)){
				if(expand(str, i, true).length() > longest.length()){
					longest = expand(str, i, true);
				}
			}
		}
				
		return longest.toString();
	}
	
	public static String expand(String str, int index, boolean inbetween){
		StringBuilder palin = new StringBuilder();
		int dist = 0;
		
		//Generate palindrome center
		if(inbetween){
			palin.append(str.charAt(index));
			palin.append(str.charAt(index + 1));
		}
		else palin.append(str.charAt(index));
		

		
		//Grow palindrome around center
		while(index - dist > 0 && index + dist < str.length() - 1 - (inbetween ? 1 : 0)){
			
			char ch1 = str.charAt(index - dist - 1);
			char ch2 = str.charAt(index + dist + 1 + (inbetween ? 1 : 0));
			

			if(ch1 == ch2){
				palin.append(ch1);
				palin.insert(0, ch2);
			}
			else{
				break;
			}
			dist++;

		}
		

		
		return palin.toString();
	}
}
