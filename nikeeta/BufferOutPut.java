package nikeeta;

import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferOutPut {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream f = new FileOutputStream("C:\\Users\\hp\\Desktop\\alpha\\nik\\demo4.txt");
		 BufferedOutputStream b = new  BufferedOutputStream(f);
		 String s = " hi i am nikeeta how are you";
		 byte[] c = s.getBytes();
		 b.write(c);
		 System.out.println("done");
		 b.close();
		 f.close();
	}

}
