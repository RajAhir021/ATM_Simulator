package com.BankManagementSystem;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.Random;
import java.util.*;
import javax.swing.*;

public class SignupThree extends JFrame implements ActionListener{
	
	JRadioButton r1, r2, r3, r4;
	JCheckBox c1, c2, c3, c4, c5, c6, c7;
	JButton submit, cancle;
	String formno;
	
	SignupThree(String formno){
		
		this.formno = formno;
		setLayout(null);
		
		JLabel l1 = new JLabel("Page 3: Account Details");
		l1.setFont(new Font("Raleway", Font.BOLD, 22));
		l1.setBounds(280,40,400,40);
		add(l1);
		
		JLabel type = new JLabel("Account Type");
		type.setFont(new Font("Raleway", Font.BOLD, 22));
		type.setBounds(100,140,200,30);
		add(type);
		
		r1 = new JRadioButton("Saving Account");
		r1.setFont(new Font("Raleway", Font.BOLD, 16));
		r1.setBackground(Color.WHITE);
		r1.setBounds(100, 180, 250, 20);
		add(r1);
		
		r2 = new JRadioButton("Current Account");
		r2.setFont(new Font("Raleway", Font.BOLD, 16));
		r2.setBackground(Color.WHITE);
		r2.setBounds(350, 180, 250, 20);
		add(r2);
		
		r3 = new JRadioButton("Fixed Deposit Account");
		r3.setFont(new Font("Raleway", Font.BOLD, 16));
		r3.setBackground(Color.WHITE);
		r3.setBounds(100, 220, 250, 20);
		add(r3);
		
		r4 = new JRadioButton("Recurring Deposit Account");
		r4.setFont(new Font("Raleway", Font.BOLD, 16));
		r4.setBackground(Color.WHITE);
		r4.setBounds(350, 220, 250, 20);
		add(r4);
		
		//add radio button for checking which type of account user want to create.
		ButtonGroup groupAccount = new ButtonGroup(); 
		groupAccount.add(r1);
		groupAccount.add(r2);
		groupAccount.add(r3);
		groupAccount.add(r4);
		
		JLabel card = new JLabel("Card Number");
		card.setFont(new Font("Raleway", Font.BOLD, 22));
		card.setBounds(100,300,200,30);
		add(card);
		
		//give an example of how card number is look like which he/she get.
		JLabel Number = new JLabel("XXXX-XXXX-XXXX-4184");
		Number.setFont(new Font("Raleway", Font.BOLD, 22));
		Number.setBounds(330,300,300,30);
		add(Number);
		
		JLabel carddetail = new JLabel("Your 16 Digit Card Number");
		carddetail.setFont(new Font("Raleway", Font.BOLD, 12));
		carddetail.setBounds(100,330,300,20);
		add(carddetail);
		
		JLabel pin = new JLabel("PIN: ");
		pin.setFont(new Font("Raleway", Font.BOLD, 22));
		pin.setBounds(100,370,200,30);
		add(pin);
		
		JLabel pinNumber = new JLabel("XXXX");
		pinNumber.setFont(new Font("Raleway", Font.BOLD, 22));
		pinNumber.setBounds(330,370,300,30);
		add(pinNumber);
		
		JLabel pindetail = new JLabel("Your 4 Digit PIN Number");
		pindetail.setFont(new Font("Raleway", Font.BOLD, 12));
		pindetail.setBounds(100,400,300,20);
		add(pindetail);
		
		
		//create multiple check boxes asking user to which type of services he/she need.
		JLabel services = new JLabel("Services Required: ");
		services.setFont(new Font("Raleway", Font.BOLD, 22));
		services.setBounds(100,450,300,30);
		add(services);
		
		c1 = new JCheckBox("ATM CARD");
		c1.setBackground(Color.WHITE);
		c1.setFont(new Font("Raleway", Font.BOLD, 16));
		c1.setBounds(100, 500, 200, 30);
		add(c1);
		
		c2 = new JCheckBox("Internet Banking");
		c2.setBackground(Color.WHITE);
		c2.setFont(new Font("Raleway", Font.BOLD, 16));
		c2.setBounds(350, 500, 200, 30);
		add(c2);
		
		c3 = new JCheckBox("Mobile Banking");
		c3.setBackground(Color.WHITE);
		c3.setFont(new Font("Raleway", Font.BOLD, 16));
		c3.setBounds(100, 550, 200, 30);
		add(c3);
		
		c4 = new JCheckBox("EMAIL & SMS Alerts");
		c4.setBackground(Color.WHITE);
		c4.setFont(new Font("Raleway", Font.BOLD, 16));
		c4.setBounds(350, 550, 200, 30);
		add(c4);
		
		c5 = new JCheckBox("Cheque Book");
		c5.setBackground(Color.WHITE);
		c5.setFont(new Font("Raleway", Font.BOLD, 16));
		c5.setBounds(100, 600, 200, 30);
		add(c5);
		
		c6 = new JCheckBox("E-Statement");
		c6.setBackground(Color.WHITE);
		c6.setFont(new Font("Raleway", Font.BOLD, 16));
		c6.setBounds(350, 600, 200, 30);
		add(c6);
		
		c7 = new JCheckBox("I hereby declares that the above entered details are correct to the best of my knowledge");
		c7.setBackground(Color.WHITE);
		c7.setFont(new Font("Raleway", Font.BOLD, 12));
		c7.setBounds(100, 680, 600, 30);
		add(c7);
		
		//submit button for submit the details.
		submit = new JButton("Submit");
		submit.setBackground(Color.BLACK);
		submit.setForeground(Color.WHITE);
		submit.setFont(new Font("Raleway", Font.BOLD, 14));
		submit.setBounds(250, 720, 100, 30);
		submit.addActionListener(this);
		add(submit);
		
		//Cancel button for cancel the generating form.
		cancle = new JButton("Cancle");
		cancle.setBackground(Color.BLACK);
		cancle.setForeground(Color.WHITE);
		cancle.setFont(new Font("Raleway", Font.BOLD, 14));
		cancle.setBounds(420, 720, 100, 30);
		cancle.addActionListener(this);
		add(cancle);
		
		getContentPane().setBackground(Color.WHITE);;
		setSize(850, 820);
		setLocation(350, 0);
		setVisible(true);
		
	}
	
	//user give any data then then this are store and run in this section.
	public void actionPerformed(ActionEvent ae) {
		
		String c07 = c7.toString();
		
		if(ae.getSource() == submit) {
			String accountType = null;
			if(r1.isSelected()) {
				accountType = "Saving Account";
			}
			else if(r2.isSelected()) {
				accountType = "Current Account";
			}
			else if(r3.isSelected()) {
				accountType = "Fixed Deposit Account";
			}
			else if(r4.isSelected()) {
				accountType = "Recurring Deposit Account";
			}
			
			Random random = new Random();
			String cardNumber = "" + Math.abs((random.nextLong() % 90000000) + 5040936100000000L);
			
			String pinNimber = "" + Math.abs((random.nextLong() % 9000L) + 1000L);
			
			String facility = "";
			if(c1.isSelected()) {
				facility = facility + " ATM Card";
			}
			else if(c2.isSelected()) {
				facility = facility + " Internet Banking";
			}
			else if(c3.isSelected()) {
				facility = facility + " Mobile Banking";
			}
			else if(c4.isSelected()) {
				facility = facility + " EMAIL & SMS Alerts";
			}
			else if(c5.isSelected()) {
				facility = facility + " Cheque Book";
			}
			else if(c6.isSelected()) {
				facility = facility + " E-Statemet";
			}
			
			try {
				
				//query for add data and store in database.
				if(accountType.equals("")) {
					JOptionPane.showMessageDialog(null, "Account Type is Required");
				}
				else {
					Conn conn = new Conn();
					String query = "insert into signupthree values('"+formno+"', '"+accountType+"', '"+cardNumber+"', '"+pinNimber+"', '"+facility+"')";
					String query2 = "insert into login values('"+formno+"', '"+cardNumber+"', '"+pinNimber+"')";
					
					conn.st.executeUpdate(query);
					conn.st.executeUpdate(query2);
					
					JOptionPane.showMessageDialog(null, "Card Number: " + cardNumber + "\n Pin: " + pinNimber);
				}
				
				setVisible(false);
				new Deposit(pinNimber).setVisible(true);
				
			} catch (Exception e) {
				System.out.println(e);
			}
			
		}
		else if(ae.getSource() == cancle) {
			setVisible(false);
			
			try {
				new Login().setVisible(true);
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	 public static void main(String[] args) {
		 
		 new SignupThree("");
		 
	 }
	
}
