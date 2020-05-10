// Demonstrate FileOutputStream.

import java.io.*;

class FileOutputStreamDemo {
public static void main(String args[]) throws IOException {

String source = "Hi all \n"
+ " lets learn IT Workshop II \n"
+ " Now";

byte buf[] = source.getBytes();

OutputStream f0 = new FileOutputStream("Hello.txt");
for (int i=0; i < buf.length; i++) {
	f0.write(buf[i]);
}
System.out.println("Completed");
f0.close();
}
}