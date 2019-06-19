package Swing学习;

import java.awt.*;

import javax.swing.*;

public class LandFrame extends JFrame{
	private JPanel jp1 = new JPanel();
	private JPanel jp2 = new JPanel();
	private JPanel jp3 = new JPanel();
	private JTextArea jt1 = new JTextArea(1,10);
	private JTextArea jt2 = new JTextArea(1,10);
	private JLabel jl1 = new JLabel("账号");
	private JLabel jl2 = new JLabel("密码");
	private JButton bt1 = new JButton("登陆");
	private JButton bt2 = new JButton("退出");
	public LandFrame() {
		Container c = getContentPane();
		setSize(500, 300);
		setVisible(true);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setTitle("用户登陆界面");
		c.add(BorderLayout.NORTH,jp1);
		jp1.add(jl1);
		jp1.add(jt1);
		c.add(BorderLayout.CENTER,jp2);
		jp2.add(jl2);
		jp2.add(jt2);
		bt1.setBounds(100,200,100,21);
		bt2.setBounds(300,200,100,21);
		jp3.add(bt1);
		jp3.add(bt2);
		c.add(BorderLayout.SOUTH,jp3);
		
	}
	public static void main(String[] args) {
		LandFrame lf = new LandFrame();
		String a = lf.jt1.getText();
		System.out.println(a);
	}
}
