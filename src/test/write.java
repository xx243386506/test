package test;
import java.io.*;
public class write {

	public static void main(String[] args) {
		File file = new File("d:/wegame/穿越火线/xiangxu.txt");
		String str[] = {"我是好人","我很积极","我要努力"};
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
				System.out.println("第" + i + "行：" + s);
			}
			bufr.close();
			fr.close();
		}catch(Exception e) {
			e.printStackTrace();

}
	}
}
