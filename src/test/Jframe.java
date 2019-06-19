package test;

import java.awt.*;

import javax.swing.*;

public class Jframe {
	
	public static void main(String[] args) {
	JFrame jf = new JFrame("我怎么这么好看");
	Container ct = jf.getContentPane();
	JLabel jl = new JLabel("我爱秦");
	//使标签的文字居中
	jl.setHorizontalAlignment(SwingConstants.CENTER);
	ct.add(jl);
	ct.setBackground(Color.green);
	jf.setVisible(true);
	jf.setSize(200, 150);
	jf.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
}
}