
public class AlgorithmsAssignment2A {

	public static void main(String[] args) {
		System.out.println(makePalindrome("bababba"));

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

	public static String makePalindrome(String input) {
		StringBuilder palin = new StringBuilder(findLongestPalindrome(input));
		StringBuilder beforePalin = new StringBuilder(input.indexOf(palin.toString()));
		StringBuilder afterPalin = new StringBuilder(input.substring(input.indexOf(palin.toString()) + palin.length(), input.length()));
		
		System.out.println(beforePalin);
		System.out.println(afterPalin);
		
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
		
		//System.out.println(palin);

		
		//Grow palindrome around center
		while(index - dist > 0 && index + dist < str.length() - 1 - (inbetween ? 1 : 0)){
			
			char ch1 = str.charAt(index - dist - 1);
			char ch2 = str.charAt(index + dist + 1 + (inbetween ? 1 : 0));
			
			//System.out.println("Char 1: " + ch1 + " Char 2: " + ch2);

			if(ch1 == ch2){
				palin.append(ch1);
				palin.insert(0, ch2);
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
}
