import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MyFrame extends JFrame implements ActionListener {
	private JButton yesButton;
	private JButton noButton;
	private JButton cancelButton;
	private JButton exitButton;
	private JTextField txtfd;
	
	MyFrame(){
		setSize(300,320);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
		txtfd = new JTextField(10);
		add(txtfd);
		
		yesButton = new JButton("Yes");
		yesButton.addActionListener(this);
		add(yesButton);
		setVisible(true);
		
		
		noButton = new JButton("No");
		noButton.addActionListener(this);
		add(noButton);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==yesButton) {
			String text = yesButton.getText();
			txtfd.setText(txtfd.getText()+text); 
		}
		if(e.getSource()==noButton) {
			String text  = noButton.getText();
			txtfd.setText(txtfd.getText()+text);
		}
	}
	public static void main (String [] a) {
		new MyFrame().setVisible(true);
	}

}

