
//create a login page.

package com.BankManagementSystem;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;

public class Login extends JFrame implements ActionListener{
	
	Container co;
	JPanel panel;
	JButton login, clear, signup;
	JTextField cardTextField;
	JPasswordField  pinTextField;
	
	Login() throws IOException {
		
		co = getContentPane();
		co.setLayout(null);
		
		URL url = Login.class.getResource("/icons/logo.jpg");
		//System.out.println("Resource URL: " + url);
		
		setTitle("Automated Teller Machine ");	
		
		//add bank logo.
		ImageIcon i1 = new ImageIcon(url);
		Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel label1 = new JLabel(i3);
		label1.setBounds(70, 10, 100, 100);
		add(label1);
		
		JLabel text = new JLabel("Welcome to ATM");
		text.setFont(new Font("Osward", Font.BOLD, 38));
		text.setBounds(200, 40, 400, 40);
		add(text); 
		
		JLabel cardno = new JLabel("Card No:");
		cardno.setFont(new Font("Railway", Font.BOLD, 26));
		cardno.setBounds(120, 150, 150, 30);
		add(cardno); 
		
		//text field for write card number
		cardTextField = new JTextField();
		cardTextField.setBounds(300, 150, 230, 30);
		cardTextField.setFont(new Font("Arial", Font.BOLD, 16));
		add(cardTextField);
		
		JLabel pin = new JLabel("Pin:");
		pin.setFont(new Font("Railway", Font.BOLD, 26));
		pin.setBounds(120, 220, 230, 30);
		add(pin); 
		
		//text field for write pin
		pinTextField = new JPasswordField();
		pinTextField.setBounds(300, 220, 230, 30);
		pinTextField.setFont(new Font("Arial", Font.BOLD, 16));
		add(pinTextField);

		login = new JButton("Sign IN");
		login.setBounds(300, 300, 100, 30);
		login.setBackground(Color.BLACK);
		login.setForeground(Color.WHITE);
		login.addActionListener(this);
		add(login);
		
		clear = new JButton("CLEAR");
		clear.setBounds(430, 300, 100, 30);
		clear.setBackground(Color.BLACK);
		clear.setForeground(Color.WHITE);
		clear.addActionListener(this);
		add(clear);
		
		signup = new JButton("SIGN UP");
		signup.setBounds(300, 350, 230, 30);
		signup.setBackground(Color.BLACK);
		signup.setForeground(Color.WHITE);
		signup.addActionListener(this);
		add(signup);
  
		//create a pane.
		getContentPane().setBackground(Color.white);
		setSize(800,480);
		setVisible(true);
		setLocation(350,200);
	} 

	//when user write card number or pin and click on any button then this section perform button task and store data.
	public void actionPerformed(ActionEvent ae){
		
		String cardnum = cardTextField.getText();
		String pinnum = pinTextField.getText();
		
		
		//if click on clear button.
		if(ae.getSource() == clear) {
			cardTextField.setText("");
			pinTextField.setText("");
		}
		//if click on login button.
		else if(ae.getSource() == login){
			
			if(cardnum.equals("")) {
				JOptionPane.showMessageDialog(null, "Card Number is required");
			}
			else if(pinnum.equals("")) {
				JOptionPane.showMessageDialog(null, "PIN is required");
			}
			
			Conn conn = new Conn();
			String cardnumber = cardTextField.getText();
			String pinnumber = pinTextField.getText();
			String query = "select * from login where cardnumber = '"+cardnumber+"' and pin = '"+pinnumber+"'"; 
			
			try {
				
				ResultSet rs = conn.st.executeQuery(query);
				if(rs.next()) {
					
					//Transaction object.
					setVisible(false);
					new Transactions(pinnumber).setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
				}
				
			} catch (Exception e) {
				System.out.println(e);
			}
			
		}
		//if click on sign-up button.
		else if(ae.getSource() == signup) {
			//signup1 object.
			setVisible(false);
			new SignupOne().setVisible(true);
			
		}
	}
	
public static void main(String[] args) throws IOException {
	// TODO Auto-generated method stub
	new Login();
}


}
