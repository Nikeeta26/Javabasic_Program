package nikeeta;

import java.io.FileInputStream;
import java.io.IOException;

public class fileInputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
   FileInputStream f = new FileInputStream("C:\\Users\\hp\\Desktop\\alpha\\nik\\demo.txt");
   int i;
   while((i=f.read())!=-1) {
   System.out.print((char)i);
   }
   f.close();
		
	}

}
