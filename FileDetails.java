// Demonstrate File.

import java.io.File;

class FileDetails {
public static void main(String args[]) {

//File f1 = new File("FileDetails.java");
File f1 = new File("C:\\Users\\IIITK\\PVP\\E\\Dropbox\\IIIT Kottayam\\2 - Jan'20 - Apr'20\\1 - IT Workshop II\\0 - Theory\\1 - Class Demo\\file\\FileDetails.java");
System.out.println("File Name: " + f1.getName());
System.out.println("Path: " + f1.getPath());
System.out.println("Abs Path: " + f1.getAbsolutePath());
System.out.println("Parent: " + f1.getParent());
System.out.println(f1.exists() ? "exists" : "does not exist");
System.out.println(f1.canWrite() ? "is writeable" : "is not writeable");
System.out.println(f1.canRead() ? "is readable" : "is not readable");
System.out.println("is " + (f1.isDirectory() ? "" : "not" + " a directory"));
System.out.println(f1.isFile() ? "is normal file" : "might be a named pipe");
System.out.println(f1.isAbsolute() ? "is absolute" : "is not absolute");
System.out.println("File last modified: " + f1.lastModified());
System.out.println("File size: " + f1.length() + " Bytes");

}
}