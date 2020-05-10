// Demonstrate FileInputStream.

import java.io.*;

class FileInputStreamDemo {
public static void main(String args[]) throws IOException {

int size,segment=10;
File file=new File("FileDetails.java");
InputStream f = new FileInputStream(file);
System.out.println("Total Available Bytes: " + (size = f.available()));
int n = size/segment;
System.out.println("This code reads " + n +" bytes of the file one read() at a time");
for(int j=0;j<segment;j++){
for (int i=0; i < n; i++) {
System.out.print((char) f.read());
}
//System.out.println("\nStill Available: " + f.available());
}

f.close();
}
}