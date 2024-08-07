
//create a class for check bank balance.

package com.BankManagementSystem;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;

public class BalanceEnquiry extends JFrame implements ActionListener{

	JButton back;
	String pinnumber;
	
	BalanceEnquiry(String pinnumber) {
		
		this.pinnumber = pinnumber;
		
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0, 0, 900, 900);
		add(image);
		
		//create a back button for going in transaction page.
		back = new JButton("Back");
		back.setBounds(355, 520, 150, 30); 
		back.addActionListener(this);
		image.add(back);
		
		Conn c = new Conn();
		 int balance = 0;
		try {
			//write query for fatch the user data through pin number.
			   ResultSet rs = c.st.executeQuery("select * from bank where pin = '"+pinnumber+"'");
			   while(rs.next()) {
				   if(rs.getString("type").equals("deposit")) {
					   balance += Integer.parseInt(rs.getString("amount"));
					   
				   }else {
					   balance -= Integer.parseInt(rs.getString("amount"));
				   }
				   
			   }
		}catch(Exception e) {
			System.out.println(e);
		}
		
		JLabel bal = new JLabel("Your Current Account balance is Rs. " + balance);
		bal.setForeground(Color.WHITE);
		bal.setBounds(170, 300, 400, 30);
		image.add(bal);
		
		setSize(900, 900);
		setLocation(300, 0);
		setUndecorated(true);
		setVisible(true);
	
	}
	
	public void actionPerformed(ActionEvent ae) {
		setVisible(false);
		new Transactions(pinnumber).setVisible(true);
		
	}
	public static void main(String[] args) {
		
		new BalanceEnquiry("");
	}

}
