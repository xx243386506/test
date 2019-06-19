package test;
import java.awt.*;
import java.applet.*;
public class ButtonDemo extends Applet{
		public void init()
		{
			Label one = new Label("One");
			Label two = new Label();
			two.setText("Two");
			Button btn1 = new Button("Button one");
			Button btn2 = new Button();
			btn2.setLabel("Button Two");
			add(one);
			add(two);
			add(btn1);
			add(btn2);
		}
}
