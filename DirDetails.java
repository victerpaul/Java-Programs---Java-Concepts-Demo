// Using directories.

import java.io.File;

class DirDetails {
public static void main(String args[]) {

String dirname = "C:\\Users\\IIITK\\PVP\\E\\Dropbox\\IIIT Kottayam\\2 - Jan'20 - Apr'20\\1 - IT Workshop II\\0 - Theory\\1 - Class Demo\\";
File f1 = new File(dirname);
	if (f1.isDirectory()) {
		System.out.println("Directory of " + dirname);
		String s[] = f1.list();
		for (int i=0; i < s.length; i++) {
			File f = new File(dirname + "/" + s[i]);
			if (f.isDirectory()) {
			System.out.println(s[i] + " is a directory");
			} else {
			System.out.println(s[i] + " is a file");
			}
		}
	} else {
		System.out.println(dirname + " is not a directory");
	}
}
}