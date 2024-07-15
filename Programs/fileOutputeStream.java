package nikeeta;

import java.io.FileOutputStream;
import java.io.IOException;

public class fileOutputeStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream f = new FileOutputStream("C:\\Users\\hp\\Desktop\\alpha\\nik\\demo2.txt");
		String s =" nikeeta kaudare is good girls, hi nikeeta";
		
		byte[] c = s.getBytes();
		 f.write(c);
		 f.close();
		 System.out.println("done");
		 
	}

}
