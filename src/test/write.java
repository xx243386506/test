package test;
import java.io.*;
public class write {

	public static void main(String[] args) {
		File file = new File("d:/wegame/��Խ����/xiangxu.txt");
		String str[] = {"���Ǻ���","�Һܻ���","��ҪŬ��"};
		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bufw = new BufferedWriter(fw);
			for(int k = 0;k<str.length;k++) {
				bufw.write(str[k]);
				bufw.newLine();
			}
			bufw.close();
			fw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		try{
			FileReader fr = new FileReader(file);
			BufferedReader bufr = new BufferedReader(fr);
			String s = null;
			int i = 0;
			while((s=bufr.readLine())!=null) {
				i++;
				System.out.println("��" + i + "�У�" + s);
			}
			bufr.close();
			fr.close();
		}catch(Exception e) {
			e.printStackTrace();

}
	}
}
