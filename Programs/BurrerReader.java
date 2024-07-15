package nikeeta;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BurrerReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       FileReader f = new FileReader("C:\\Users\\hp\\Desktop\\alpha\\nik\\demo2.txt");
       BufferedReader b = new BufferedReader(f);
       
       int i ;
       while((i=b.read())!=-1) {
    	   System.out.print((char)i);
    	   
       }
       b.close();
       f.close();
	}

}
