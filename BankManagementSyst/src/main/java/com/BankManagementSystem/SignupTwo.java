package com.BankManagementSystem;

import java.awt.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;


public class SignupTwo extends JFrame implements ActionListener{

	JTextField pan, aadhar;
	JButton next;
	JRadioButton sYes, sNo, eYes, eNo;
	JComboBox religion, income, category, education, occupation;
	String formno;
	
	SignupTwo(String formno){
		this.formno = formno;
		setLayout(null);
		
		setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
		
		JLabel additionalDetails = new JLabel("Page 2: Additional Details");
		additionalDetails.setFont(new Font("Raleway", Font.BOLD, 30));
		additionalDetails.setBounds(250, 80, 400, 40);
		add(additionalDetails);
		
		JLabel religionn = new JLabel("Religion:");   
		religionn.setFont(new Font("Raleway", Font.BOLD, 20));
		religionn.setBounds(100, 140, 100, 30);
		add(religionn);
		
		//creating a combo box for choose a religion.
		String valReligion[] = {"Hindu", "Sikh", "Christian", "Muslim", "Other"};
		religion = new JComboBox(valReligion);
		religion.setBounds(300, 140, 400, 30);
		religion.setBackground(Color.WHITE);
		add(religion);
		
		JLabel categry = new JLabel("Category: ");
		categry.setFont(new Font("Raleway", Font.BOLD, 20));
		categry.setBounds(100, 190, 200, 30);
		add(categry);
		
		//creating a combo box for choose a cast(category).
		String valCategory[] = {"General", "OBC", "SC", "ST", "Other"};
		category = new JComboBox(valCategory);
		category.setBounds(300, 190, 400, 30);
		category.setBackground(Color.WHITE);
		add(category);
		
		JLabel incom = new JLabel("Income: ");
		incom.setFont(new Font("Raleway", Font.BOLD, 20));
		incom.setBounds(100, 240, 200, 30);
		add(incom);
		
		//creating a combo box for choose a income.
		String valIncome[] = {"Null", "<1,50,000", "<2,50,000", "<5,00,000", "<10,00,000", "Upto 25,00,000"};
		income = new JComboBox(valIncome);
		income.setBounds(300, 240, 400, 30);
		income.setBackground(Color.WHITE);
		add(income);
		
		JLabel educational = new JLabel("Educational");
		educational.setFont(new Font("Raleway", Font.BOLD, 20));
		educational.setBounds(100, 290, 200, 30);
		add(educational);
		
		JLabel qualification = new JLabel("Qualification: ");
		qualification.setFont(new Font("Raleway", Font.BOLD, 20));
		qualification.setBounds(100, 315, 200, 30);
		add(qualification);
		
		//creating a combo box for choose a education qualification.
		String valEducation[] = {"10th Pass", "12th Pass", "Non Graduation", "Graduate", "Post-Graduate", "Doctrate", "others"};
		education = new JComboBox(valEducation);
		education.setBounds(300, 305, 400, 30);
		education.setBackground(Color.WHITE);
		add(education);
		
		
		JLabel occupatioN = new JLabel("Occupation: ");
		occupatioN.setFont(new Font("Raleway", Font.BOLD, 20));
		occupatioN.setBounds(100, 390, 200, 30);
		add(occupatioN);

		//creating a combo box for choose a occupation.
		String valOccupation[] = {"Salaried", "Self Employed", "Business", "Student", "Retired", "Others"};
		occupation = new JComboBox(valOccupation);
		occupation.setBounds(300, 390, 400, 30);
		occupation.setBackground(Color.WHITE);
		add(occupation);
		
		JLabel panNumber = new JLabel("PAN Number: ");
		panNumber.setFont(new Font("Raleway", Font.BOLD, 20));
		panNumber.setBounds(100, 440, 200, 30);
		add(panNumber);
		
		//creating a jtextfield for write PAN number.
		pan = new JTextField();
		pan.setFont(new Font("Raleway", Font.BOLD, 14));
		pan.setBounds(300, 440, 400, 30);
		add(pan);
		
		JLabel aadharNumber = new JLabel("Aadhar Number: ");
		aadharNumber.setFont(new Font("Raleway", Font.BOLD, 20));
		aadharNumber.setBounds(100, 490, 200, 30);
		add(aadharNumber);
		
		//creating a jtextfield for write aadhar number.
		aadhar = new JTextField();
		aadhar.setFont(new Font("Raleway", Font.BOLD, 14));
		aadhar.setBounds(300, 490, 400, 30);
		add(aadhar);
		
		JLabel seniorC = new JLabel("Senior citizen: ");
		seniorC.setFont(new Font("Raleway", Font.BOLD, 20));
		seniorC.setBounds(100, 540, 200, 30);
		add(seniorC);
		
		sYes = new JRadioButton("Yes");
		sYes.setBounds(300, 540, 100, 30);
		sYes.setBackground(Color.WHITE);
		add(sYes);
		
		sNo = new JRadioButton("No");
		sNo.setBounds(450, 540, 100, 30);
		sNo.setBackground(Color.WHITE);
		add(sNo);
		
		//checking for senior citizen.
		ButtonGroup seniourGroup = new ButtonGroup();
		seniourGroup.add(sYes);
		seniourGroup.add(sNo);
		
		JLabel existingA = new JLabel("Existing Account: ");
		existingA.setFont(new Font("Raleway", Font.BOLD, 20));
		existingA.setBounds(100, 590, 200, 30);
		add(existingA);

		eYes = new JRadioButton("Yes");
		eYes.setBounds(300, 590, 100, 30);
		eYes.setBackground(Color.WHITE);
		add(eYes);
		
		eNo = new JRadioButton("No");
		eNo.setBounds(450, 590, 100, 30);
		eNo.setBackground(Color.WHITE);
		add(eNo);
		
		//checking for user have already have an account in bank.
		ButtonGroup existingGroup = new ButtonGroup();
		existingGroup.add(eYes);
		existingGroup.add(eNo);
		
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
		
		//String formno = "" + random;
		String aeReligion = (String) religion.getSelectedItem();
		String aecategory = (String) category.getSelectedItem();
		String aeincome = (String) income.getSelectedItem();
		String aeeducation = (String) education.getSelectedItem();
		String aeOccupation = (String) occupation.getSelectedItem();
		

		
		//checking for user's senior citizenship status.
		String aeSeniorCitizen = null;
		if(sYes.isSelected()) {
			aeSeniorCitizen = "Yes";
		}
		else if(sNo.isSelected()) {
			aeSeniorCitizen = "No";
		}
		
		//checking for user's have already have account or not.
		String aeExistingAcc = null;
		if(eYes.isSelected()) {
			aeExistingAcc = "Yes";
		}
		else if(eNo.isSelected()) {
			aeExistingAcc = "No";
		}
		
		String aePan = pan.getText();
		String aeAadhar = aadhar.getText();
		
		if(aePan.equals("")) {
			JOptionPane.showMessageDialog(null, "PAN Number is required");
		}
		else if(aeAadhar.equals("")) {
			JOptionPane.showMessageDialog(null, "Aadhar number is required");
		}
		else {
		
		try {
				//query for add data and store in database.
				Conn c = new Conn();
				String query = "insert into signuptwo values ('"+formno+"', '"+aeReligion+"', '"+aecategory+"', '"+aeincome+"', '"+aeeducation+"', '"+aeOccupation+"', '"+aePan+"', '"+aeAadhar+"', '"+aeSeniorCitizen+"', '"+aeExistingAcc+"')";
				c.st.executeUpdate(query);
	
				//Signup3 Object
				setVisible(false);
				new SignupThree(formno).setVisible(true);
		} catch (Exception e) {
			System.out.println(e);
		}
		}
		
	}
	
	public static void main(String[] args) {
		new SignupTwo("");
	}

}
