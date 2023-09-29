package javalab;
import java.util.Scanner;
/****************************************************************************
 * File           :Add2numbers.java
 * Description    :Java program to check the frequency"
 * Author         :Gowrikrishna
 * Version        :1.O
 * Date           :29/08/23
 */
import java.util.Scanner;
public class Frequency {
	public static void main(String [] args ) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String input=sc.nextLine();
		System.out.println("Enter the character");
		char checkMe=sc.next().charAt(0);
		int charCount=checkFreq(input,checkMe);
		System.out.println("The number of occurance of the chracter is"+charCount);
		}
static int checkFreq(String input,char checkMe) {
	char[]charArray=input.toCharArray();
	int charCount=0;
	for(int i=0;i<input.length();i++) {
		if(charArray[i]==checkMe) {
			charCount++;
		}
	}
	return charCount;
}
}
