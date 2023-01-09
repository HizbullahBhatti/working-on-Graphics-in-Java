import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class ActionListener1 extends JFrame implements ActionListener{
	private int i = 0;
	JTextField text;
	JButton btn;
	
	public ActionListener1 () {
		add(text = new JTextField(20));
		add(btn = new JButton("Click me"));
		setLayout(new FlowLayout());
		setSize(360,360);
		setTitle("ActionListener Example");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btn.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		i++;
		text.setText("Button Clicked " + i + "times");
	}
	public static void main (String [] a) {
		ActionListener1 object = new ActionListener1();
	}
	
	
	


	

}
