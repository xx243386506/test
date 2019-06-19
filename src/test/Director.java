package test;

import java.io.*;

public class Director {
	public static void main(String[]args) {
	File f = new File("D:\\ÎÒµÄjava\\test\\src\\test\\write.java");
	/**try {
	FileWriter fw = new FileWriter(f);
	BufferedWriter bufw = new BufferedWriter(fw);
	bufw.write("d:/WeGame");
	bufw.close();
	fw.close();
}catch(Exception e) {
	e.printStackTrace();
}**/
	if(f.isDirectory()) {
		System.out.println("yes");
	File[]f1 = f.listFiles();
	for(int i = 0;i<f1.length;i++)
	System.out.println(f1[i]);}
	else
		System.out.println("no");
	try {
	FileReader fr = new FileReader(f);
	BufferedReader bufr = new BufferedReader(fr);
	String s;
	s=bufr.toString();
	System.out.println(s);
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
	
}