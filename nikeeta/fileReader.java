package nikeeta;

import java.io.FileReader;
import java.io.IOException;

public class fileReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
   FileReader f = new FileReader("C:\\Users\\hp\\Desktop\\alpha\\nik\\demo.txt");
    int i;
    while((i=f.read())!=-1) {
    	System.out.print((char)i);
    }
    f.close();
    

	}

}
