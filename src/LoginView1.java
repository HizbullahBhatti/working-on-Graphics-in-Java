import java.awt.event.ActionListener;

import javax.swing.*;

public class LoginView1 {
	
	JFrame frame;
	
	public LoginView1(String title , int x , int y) {
		frame = new JFrame(title);
		frame.setSize(x,y);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.placeComponent(frame);
        frame.setVisible(true);
		
	}
	public void placeComponent(JFrame frame) {
		frame.setLayout(null);
		
		JLabel uLabel = new JLabel("User Name");
		uLabel.setBounds(10, 10, 80, 25);
		frame.add(uLabel);
	  	
		JLabel pLabel = new JLabel(" Password ");
		pLabel.setBounds(10, 50, 80, 25);
		frame.add(pLabel);
		
		JTextField  text = new JTextField(20);
		text.setBounds(90, 10, 180, 25);
		frame.add(text);
		
		JPasswordField password = new JPasswordField(20);
		password.setBounds(90, 50, 180, 25);
		frame.add(password);
		
		
		 JButton loginButton = new JButton ("Login"); 
		 loginButton.setBounds(90, 80,80, 25); 
		 frame.add(loginButton);
		 
		JButton registerButton = new JButton ("Rgister");
		registerButton.setBounds(190, 80, 80, 25);
		frame.add(registerButton);
		
		
		ActionListener loginButtonListener = new loginButtonActionListener();
		loginButton.addActionListener(loginButtonListener);
		
	 	

}
} 