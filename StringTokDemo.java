package javalab;
import java.util.Scanner;
import java.util.StringTokenizer;
public class StringTokDemo {
	public static void main(String args []) {
		int sum=0,num;
		System.out.println("Enter an integer string:");
		Scanner sc=new Scanner(System.in);
		String data=sc.nextLine();
		StringTokenizer input=new StringTokenizer(data);
		while(input.hasMoreTokens()) {
		 num=Integer.parseInt(input.nextToken());
		 System.out.println(num);
			sum=sum+num;
		}
		System.out.println("Sum is:"+sum);
	}

}
