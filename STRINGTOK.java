package javalab;
import java.util.StringTokenizer;
public class STRINGTOK {
public static void main(String [] args) {
	StringTokenizer obj=new StringTokenizer("This, is ,the ,string",",",true);
	while(obj.hasMoreTokens()) {
		System.out.println(obj.nextToken());
	}
}
}
