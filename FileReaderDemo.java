// Demonstrate FileReader.

import java.io.*;

class FileReaderDemo {
public static void main(String args[]) throws IOException {

File file = new File("FileDetails.java"); 
FileReader fr = new FileReader(file);
BufferedReader br = new BufferedReader(fr);
String s;
s = br.readLine();
while(s!= null) {
	System.out.println(s);
	s = br.readLine();
	}
fr.close();
}
}