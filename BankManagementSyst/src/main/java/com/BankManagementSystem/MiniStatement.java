
//create a class for crete mini statement.

package com.BankManagementSystem;

import java.awt.Color;
import java.sql.*;

import javax.swing.*;



public class MiniStatement extends JFrame{    

	String pinnumber;
	MiniStatement(String pinnumber){
		setTitle("Mini Statement");
		
		setLayout(null);
		
		JLabel mini = new JLabel();
		add(mini);
		
		JLabel bank = new JLabel("Bharat Bank");
		bank.setBounds(150, 50, 100, 30);
		add(bank);
		
		JLabel card = new JLabel("");
		card.setBounds(120, 80, 300, 20);
		add(card);
		
		JLabel balance = new JLabel();
		balance.setBounds(20, 400, 300, 20);
		add(balance);
		
		try {
			//gate a user card number data and print in page.
			Conn conn = new Conn();
			ResultSet rs = conn.st.executeQuery("select * from login where pin = '"+pinnumber+"'");
			while(rs.next()) {
				card.setText("Card Number: " + rs.getString("cardnumber").substring(0, 4) + "XXXXXXXX" + rs.getString("cardnumber").substring(12));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try {
			//print statements of user.
			Conn conn = new Conn();
			int bal = 0;
			ResultSet rs = conn.st.executeQuery("select * from bank where pin = '"+pinnumber+"'");
			while(rs.next()) {
				mini.setText(mini.getText() + "<html>" + rs.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount") + "<br><br><html>");
				
				if(rs.getString("type").equals("deposit")) {
					   bal += Integer.parseInt(rs.getString("amount"));
					   
				   }else {
					   bal -= Integer.parseInt(rs.getString("amount"));
				   }
			}
			
			balance.setText("Your current account balance is Rs. " + bal);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		mini.setBounds(20, 140, 400, 200);
		
		setSize(400, 600);
		setLocation(20, 20);
		getContentPane().setBackground(Color.WHITE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MiniStatement("");

	}

}
