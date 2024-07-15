package nikeeta;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferInputstream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       FileInputStream f = new FileInputStream("C:\\Users\\hp\\Desktop\\alpha\\nik\\demo2.txt");
       BufferedInputStream b = new BufferedInputStream(f);
        int i ;
        while((i=b.read())!=-1) {
        	System.out.print((char)i);
        }
       b.close();
       f.close();
      
	}

}
