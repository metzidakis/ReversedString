package reverse_string;

import java.util.Stack;

public class ReverseString {

	//method 1 for reversing a string
	public static String reverse(String string) {
		char[] chars = string.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i=chars.length -1; i >= 0 ; i--) {
			sb.append(chars[i]);
		}
		return sb.toString();
	}
	
	//method 2 for reversing a string
	public static String reverse2(String string) {
		char[] chars = string.toCharArray();
		char[] reversedChars = new char[chars.length];
		for (int i = 0 ; i<chars.length; i++) {
			reversedChars[i] = chars[chars.length-i-1];
		}
		return reversedChars.toString();	
	}
	
	//method 3 for reversing a string
	public static String reverse3(String string) {
		Stack<Character> myFirstEverStack = new Stack<>();
		char[] chars = string.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<chars.length ; i++) {
			myFirstEverStack.push(chars[i]);
		}
		while ( myFirstEverStack.isEmpty() == false) {
			sb.append(myFirstEverStack.pop());
		}
		return sb.toString();
	}
	
	public static void main (String[] args) {
		System.out.println(reverse("abcdefghijkl  mnopqrstuvwxyz"));
		System.out.println(reverse2("abcdefghijklmnopqrstuvwxyz"));
		System.out.println(reverse3("abcdefghijklmnopqrstuvwxyz"));
	}
}
