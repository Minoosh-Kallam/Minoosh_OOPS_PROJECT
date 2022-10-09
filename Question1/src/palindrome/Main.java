package palindrome;

import java.util.Scanner;

public class Main {

	public static boolean recurse(String word , int left ,int right) {
		if(left >= right)
			return true ;
		
		if(word.charAt(left) != word.charAt(right))
			return false ;
		
		return recurse(word , left+1 , right-1);
	}
	public static boolean isPalindrome(String word) {
		if(word == null)
			return false ;
		if(word.length() <= 1)
			return true ;
		
		return recurse(word , 0 , word.length()-1);
		
		
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("Enter word");
		String word = sc.nextLine() ;
		
		System.out.println(isPalindrome(word));
	}
}
