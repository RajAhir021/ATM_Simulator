package com.BankManagementSystem;

import java.awt.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;


public class SignupOne extends JFrame implements ActionListener{

	long random;
	JTextField nameTextField, fnameTextField, dobTextField, emailTextField, addressTextField, cityTextField, stateTextField, pinTextField;
	JButton next;
	JRadioButton male, female, other, married, unmarried;
	JDateChooser dateChooser;
	
	SignupOne(){
		
		setLayout(null);
		
		//create a random number for form number.
		Random ran = new Random();
		random = Math.abs((ran.nextLong() % 9000L) + 1000L);
		
		JLabel formno = new JLabel("APPLICATION FORM NO. " + random);
		formno.setFont(new Font("Raleway", Font.BOLD, 38));
		formno.setBounds(140, 20, 600, 40);
		add(formno);
		 
		JLabel personDetails = new JLabel("Page 1: Personal Details");
		personDetails.setFont(new Font("Raleway", Font.BOLD, 30));
		personDetails.setBounds(250, 80, 400, 40);
		add(personDetails);
		
		JLabel name = new JLabel("Name:");   
		name.setFont(new Font("Raleway", Font.BOLD, 20));
		name.setBounds(100, 140, 100, 30);
		add(name);
		
		//text field for write name.
		nameTextField = new JTextField();
		nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		nameTextField.setBounds(300, 140, 400, 30);
		add(nameTextField);
		
		JLabel fName = new JLabel("Father's Name: ");
		fName.setFont(new Font("Raleway", Font.BOLD, 20));
		fName.setBounds(100, 190, 200, 30);
		add(fName);
		
		//text field for write father name.
		fnameTextField = new JTextField();
		fnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		fnameTextField.setBounds(300, 190, 400, 30);
		add(fnameTextField);
		
		JLabel dob = new JLabel("Date Of Birth: ");
		dob.setFont(new Font("Raleway", Font.BOLD, 20));
		dob.setBounds(100, 240, 200, 30);
		add(dob);
		
		//choose the birth date.
		dateChooser = new JDateChooser();
		dateChooser.setBounds(300,240,400,30);
		dateChooser.setForeground(Color.BLACK);
		add(dateChooser);
		
		JLabel gender = new JLabel("Gender: ");
		gender.setFont(new Font("Raleway", Font.BOLD, 20));
		gender.setBounds(100, 290, 200, 30);
		add(gender);
		
		male = new JRadioButton("Male");
		male.setBounds(300,290,60,30);
		male.setBackground(Color.white);
		add(male);
		
		female = new JRadioButton("Female");
		female.setBounds(450,290,120,30);
		female.setBackground(Color.white);
		add(female);
		
		//button for select a gender.
		ButtonGroup genderGroup = new ButtonGroup();
		genderGroup.add(male);
		genderGroup.add(female);
		
		JLabel email = new JLabel("Email Address: ");
		email.setFont(new Font("Raleway", Font.BOLD, 20));
		email.setBounds(100, 340, 200, 30);
		add(email);
		
		//text field for write email.
		emailTextField = new JTextField();
		emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		emailTextField.setBounds(300, 340, 400, 30);
		add(emailTextField);
		
		JLabel maritalS = new JLabel("Marital Status: ");
		maritalS.setFont(new Font("Raleway", Font.BOLD, 20));
		maritalS.setBounds(100, 390, 200, 30);
		add(maritalS);
		
		married = new JRadioButton("Married");
		married.setBounds(300,390,100,30);
		married.setBackground(Color.white);
		add(married);
		
		unmarried = new JRadioButton("Unmarried");
		unmarried.setBounds(450,390,100,30);
		unmarried.setBackground(Color.white);
		add(unmarried);
		
		other = new JRadioButton("Other");
		other.setBounds(630,390,100,30);
		other.setBackground(Color.white);
		add(other);
		
		//button for select marital status.
		ButtonGroup maritalGroup = new ButtonGroup();
		maritalGroup.add(married);
		maritalGroup.add(unmarried);
		maritalGroup.add(other);
		
		JLabel address = new JLabel("Address: ");
		address.setFont(new Font("Raleway", Font.BOLD, 20));
		address.setBounds(100, 440, 200, 30);
		add(address);
		
		//text field for write address.
		addressTextField = new JTextField();
		addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		addressTextField.setBounds(300, 440, 400, 30);
		add(addressTextField);
		
		JLabel city = new JLabel("City: ");
		city.setFont(new Font("Raleway", Font.BOLD, 20));
		city.setBounds(100, 490, 200, 30);
		add(city);
		
		//text field for write city name.
		cityTextField = new JTextField();
		cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		cityTextField.setBounds(300, 490, 400, 30);
		add(cityTextField);
		
		JLabel state = new JLabel("State: ");
		state.setFont(new Font("Raleway", Font.BOLD, 20));
		state.setBounds(100, 540, 200, 30);
		add(state);
		
		//text field for write state name.
		stateTextField = new JTextField();
		stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		stateTextField.setBounds(300, 540, 400, 30);
		add(stateTextField);
		
		JLabel pincode = new JLabel("Pin Code: ");
		pincode.setFont(new Font("Raleway", Font.BOLD, 20));
		pincode.setBounds(100, 590, 200, 30);
		add(pincode);
		
		//text field for write pincode number.
		pinTextField = new JTextField();
		pinTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		pinTextField.setBounds(300, 590, 400, 30);
		add(pinTextField);
		
		//button for going to next page.
		next = new JButton("Next");
		next.setBackground(Color.black);
		next.setForeground(Color.white);
		next.setFont(new Font("Raleway", Font.BOLD, 16));
		next.setBounds(620, 660, 80, 30);
		next.addActionListener(this);
		add(next);
		
		getContentPane().setBackground(Color.WHITE);
		
		setSize(850, 800);
		setLocation(350,10);
		setVisible(true);
		
		
	}
	
	//when user give any data then then this are store and run in this section
	public void actionPerformed(ActionEvent ae) {
		
		String formno = "" + random;
		String name = nameTextField.getText();
		String fname = fnameTextField.getText();
		String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
		String gender = null;
		if(male.isSelected()) {
			gender = "Male";
		}
		else if(female.isSelected()) {
			gender = "Female";
		}
		
		String email = emailTextField.getText();
		String marrital = null;
		if(married.isSelected()) {
			marrital = "Married";
		}
		else if(unmarried.isSelected()) {
			marrital = "Unmarried";
		}
		else if(other.isSelected()) {
			marrital = "Other";
		}
		
		String address = addressTextField.getText();
		String city = cityTextField.getText();
		String state = stateTextField.getText();
		String pin = pinTextField.getText();
		
		try {
			if(name.equals("")) {
				JOptionPane.showMessageDialog(null, "Name is required");
			}
			else if(fname.equals("")) {
				JOptionPane.showMessageDialog(null, "Father name is required");
			}
			else if(dob.equals("")) {
				JOptionPane.showMessageDialog(null, "Birth date is required");
			}
			else if(gender.equals("")) {
				JOptionPane.showMessageDialog(null, "Gender is required");
			}
			else if(address.equals("")) {
				JOptionPane.showMessageDialog(null, "Address is required");
			}
			else if(city.equals("")) {
				JOptionPane.showMessageDialog(null, "City is required");
			}
			else if(state.equals("")) {
				JOptionPane.showMessageDialog(null, "State is required");
			}
			else if(pin.equals("")) {
				JOptionPane.showMessageDialog(null, "Pin code is required");
			}
			
			//query for add data and store in database.
			else {
				Conn c = new Conn();
				String query = "insert into signup values ('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marrital+"', '"+address+"', '"+city+"', '"+state+"', '"+pin+"')";
				c.st.executeUpdate(query);
				
				//Signup2 object.
				setVisible(false);
				new SignupTwo(formno).setVisible(true);
			}
		} catch (Exception e) { 
			System.out.println(e);
		}
		
	}
	
	public static void main(String[] args) {
		new SignupOne();
	}

}
