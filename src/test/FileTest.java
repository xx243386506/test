package test;

import java.io.*;

public class FileTest {
public static void main(String[]args) {
	File file = new File("word.txt");
	try {
		FileOutputStream out = new FileOutputStream(file);
		byte buy[]="����һֻСë¿���Ҵ���Ҳ���".getBytes();
		out.write(buy);
		out.close();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	try {
		FileInputStream in = new FileInputStream(file);
		byte by[]=new byte[1024];
		int len = in.read(by);
		System.out.println("�ļ��е���Ϣ�ǣ�"+new String(by));
		in.close();
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
