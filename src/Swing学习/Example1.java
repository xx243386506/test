package Swing学习;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Example1 extends JFrame{
	public void createJFrame(String title) {
		JFrame jf = new JFrame(title);
		jf.setSize(500,250);
		Container container = jf.getContentPane();
		JLabel jl = new JLabel("This is a JFrame");
		jl.setHorizontalAlignment(SwingConstants.CENTER);
//		container.add(jl);
		jf.setVisible(true);
		
		jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
		JMenuBar menubar = new JMenuBar();
		jf.setJMenuBar(menubar);
		JMenu jm = new JMenu("菜单名称");
		JMenuItem jmi = new JMenuItem("菜单项名称");
		JMenuItem jmi2 = new JMenuItem("菜单项名称2");
		jm.setEnabled(false);
		jm.add(jmi);
		jm.add(jmi2);
		menubar.add(jm);
		jmi.addActionListener(new ItemListener());
	}
	class ItemListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JMenuItem jmi = (JMenuItem)e.getSource();
			System.out.println("您单击的菜单项是"+jmi.getText());
		}
	}
	public static void main(String[]args) {
		new Example1();
	}


}
 