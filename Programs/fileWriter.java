package nikeeta;

import java.io.*;

public class fileWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    FileWriter w = new FileWriter("C:\\Users\\hp\\Desktop\\alpha\\nik\\demo2.txt");
    String s = "where you from, i am from delhi";
     w.write(s);
     w.close();
     System.out.println("done");
	}
	

}
