
public class AlgorithmsAssignment2A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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

	public static String findLongestPalindrome(String str){
		
		for(int i = 0; i < str.length(); i++){
			
		}
		
		return null;
	}
}
