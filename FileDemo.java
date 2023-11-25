package javalab;
import java.io.FileWriter;
import java.io.IOException;
public class FileDemo {
	public static void main(String [] args) {
		String data="This is the new file";
		FileWriter output=null;
		try {
			output=new FileWriter("input.txt");
			output.write(data);
			output.flush();
			output.close();
			}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
