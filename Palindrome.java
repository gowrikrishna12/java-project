package javalab;
/****************************************************************************
 * File           :Palindrome.java
 * Description    :Java program that print the palindrome"
 * Author         :Gowrikrishna
 * Version        :1.O
 * Date           :29/08/23
 */
import java.util.Scanner;
public class Palindrome {
	public static void main(String [] args ) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String input=sc.next();
		boolean isPalindrome=check(input);
		if(isPalindrome) {
			System.out.println("The given string is palindrome");
		}
		else {
			System.out.println("The given string is not palindrome");
		}
	}
	/*Function recieves string as input returns true if it is palindrome
	 * else return false
	 */
     static boolean check(String input) {
	char[]charArray=input.toCharArray();
	int length=input.length();
	for(int i=0;i<=length/2;i++)
	{
	if(charArray[i]!=charArray[length-i-1]) {
	}
		return true;
	}
	return false;
}

}
