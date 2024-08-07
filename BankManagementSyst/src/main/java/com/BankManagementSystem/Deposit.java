
//in this class create a deposit page.

package com.BankManagementSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.*;

import javax.swing.*;

public class Deposit extends JFrame implements ActionListener{

	JTextField amount;
	JButton deposit, back;
	String pinnumber;
	
	Deposit(String pinnumber) {
		
		this.pinnumber = pinnumber;
		
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2 = i1.getImage().getScaledInstance(900,  900,  Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0, 0, 900, 900);
		add(image);
		
		JLabel text = new JLabel("Enter amount you want to deposit");
		text.setForeground(Color.WHITE);
		text.setFont(new Font("System", Font.BOLD, 16));
		text.setBounds(175, 300, 400, 20);
		image.add(text);
		
		//create textfield for take deposit amount.
		amount = new JTextField();
		amount.setFont(new Font("Raleway", Font.BOLD, 22));
		amount.setBounds(175, 330, 320, 25);
		image.add(amount);
		
		//create deposit button.
		deposit = new JButton("Deposit");
		deposit.setBounds(355, 485, 150, 30);
		deposit.addActionListener(this);
		image.add(deposit);
		 
		//create a back button for go on transaction page.
		back = new JButton("Back");
		back.setBounds(355, 520, 150, 30);
		back.addActionListener(this);
		image.add(back);
		
		setSize(900, 900);
		setLocation(300, 0);
		setVisible(true);
		
	}
	
	//when user give any data then then this are store and run in this section
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == deposit){
			String number = amount.getText();
			Date date = new Date();
			if(number.equals("")) {
				JOptionPane.showMessageDialog(null, "Plese enter amount you want to deposit");
				
			}else {
			
				try {
				Conn conn = new Conn();
				String query = "insert into bank value('"+pinnumber+"', '"+date+"', 'deposit', '"+number+"')";
			
					conn.st.executeUpdate(query);
				
				JOptionPane.showMessageDialog(null, "Rs " + number + " Deposited Successfully");
				setVisible(false);
				new Transactions(pinnumber).setVisible(true);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		else if(ae.getSource() == back) {
			setVisible(false);
			new Transactions(pinnumber).setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		
		new Deposit("");
	}

}
