import javax.swing.JFrame;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Calculator implements ActionListener{

	
	static double n1;
	static double n2;
	static char op;
	
	
	JFrame frame;
	JButton[] btns;
	JTextField num1;
	JButton CE;
	JTextField result;
	
	Calculator()
	{
		btns=new JButton[16];
		frame=new JFrame("My Calculator");
		num1=new JTextField();
	//	num2=new JTextField();
		result=new JTextField();
		CE=new JButton("CE");
		myFunc();
		
	}
	
	public void myFunc()
	{
		frame.setLayout(new GridLayout(5,4));
		
		
		for(int i=0;i<10;i++)
		{btns[i]=new JButton(i+"");
		frame.add(btns[i]);
		}
		btns[10]=new JButton("+");
		frame.add(btns[10]);
		btns[11]=new JButton("-");
		frame.add(btns[11]);
		btns[12]=new JButton("X");
		frame.add(btns[12]);
		btns[13]=new JButton("/");
		frame.add(btns[13]);
		btns[14]=new JButton("=");
		frame.add(btns[14]);
		btns[15]=new JButton("C");
		frame.add(btns[15]);
		
		for(int i=0;i<btns.length;i++)
		btns[i].addActionListener(this);
			
	
	num1.setEnabled(false);
	result.setEnabled(false);
	
		frame.add(num1);
		
		frame.add(result);
		frame.add(CE);
		CE.addActionListener(this);
		frame.setSize(600,600);  
	    frame.setVisible(true);  
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String args[])
	{
		
		Calculator c=new Calculator();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
		for(int i =0;i<10;i++)
		{
		if(e.getSource()==btns[i])
		{
			String a;
			a=num1.getText();
			a+=btns[i].getText();
			num1.setText(a);
		}
		}
		
		for(int i=10;i<14;i++)
		{
		if(e.getSource()==btns[i])
		{
			try {
		n1= Double.parseDouble(num1.getText());
		num1.setText("");
		op= btns[i].getText().charAt(0);
			}
		catch(Exception f)
			{
			JOptionPane.showMessageDialog(null, f);	
			}
		
		}
		}
		
		if(e.getSource()==btns[14])
		{
			try {
			n2= Double.parseDouble(num1.getText());}
			catch(Exception f) {
				JOptionPane.showMessageDialog(null, f);	
				}
				if(op=='+')
				{
					
					result.setText(n1+n2+ "");
				
					}
				else if(op=='-')
				{
					result.setText(n1-n2+ "");		
				}
				else if(op=='X')
				{
					result.setText(n1*n2+ "");		
				}
				else if(op=='/')
				{
					try {
					result.setText(n1/n2+ "");		
				
					}
					catch(Exception f)
					{
						JOptionPane.showMessageDialog(null, "Can not divide from 0");
					}
					
					}
								
		}
		if(e.getSource()==btns[15])
		{
			clear();
		}
		else if(e.getSource()==CE)
		{
			String s;
			String b;
			s=num1.getText();
			b=s.substring(0, s.length()-1);
			num1.setText(b);
		}
		
	}
	
	
	public void clear()
	{
		n1=0;
	n2=0;
	op=' ';
	num1.setText("");
	result.setText("");
		
		
	}
	
	
}
