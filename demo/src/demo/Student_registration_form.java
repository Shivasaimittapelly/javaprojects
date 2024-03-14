package demo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Student_registration_form {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student_registration_form window = new Student_registration_form();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Student_registration_form() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 128, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblNewLabel.setBounds(56, 37, 56, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblRollNo = new JLabel("ROLL NO");
		lblRollNo.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblRollNo.setBounds(56, 70, 70, 14);
		frame.getContentPane().add(lblRollNo);
		
		JLabel lblBranch = new JLabel("Branch");
		lblBranch.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblBranch.setBounds(56, 114, 56, 14);
		frame.getContentPane().add(lblBranch);
		
		JLabel lblNewLabel_1 = new JLabel("GENDER");
		lblNewLabel_1.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(56, 158, 56, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Prog.Lang");
		lblNewLabel_1_1.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblNewLabel_1_1.setBounds(56, 193, 87, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setBounds(73, 133, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		tb1 = new JTextField();
		tb1.setBounds(185, 34, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setBounds(185, 67, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("   Student Registration Form");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(132, 11, 190, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JRadioButton r1 = new JRadioButton("Male");
		r1.setBounds(162, 154, 70, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("Female");
		r2.setBounds(261, 154, 70, 23);
		frame.getContentPane().add(r2);
		
		JCheckBox c1 = new JCheckBox("Python");
		c1.setBounds(149, 189, 70, 23);
		frame.getContentPane().add(c1);
		
		JCheckBox c3 = new JCheckBox("C");
		c3.setBounds(293, 189, 56, 23);
		frame.getContentPane().add(c3);
		
		
		JCheckBox c2 = new JCheckBox("Java");
		c2.setBounds(221, 189, 70, 23);
		frame.getContentPane().add(c2);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"Select ", "", "CSE", "DS", "AIML", "IT", "IOT"}));
		cb1.setBounds(185, 110, 86, 22);
		frame.getContentPane().add(cb1);
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String roll=tb2.getText();
				String branch=(String) cb1.getSelectedItem();
				String gender=" ";
				String langs="";
				
				
				if(r1.isSelected())
				{
					gender="Male";
				}
				if(r2.isSelected())
				{
					gender="Female";
				}
				if(c1.isSelected())
				{
					langs=langs+" Python,";
				}
				if(c2.isSelected())
				{
					langs=langs+" Java,";
				}
				if(c3.isSelected())
				{
					langs=langs+" C";
					
				}
				JOptionPane.showMessageDialog(btnNewButton,
						"Name : "+name+"\n ROLL : "+roll+"\n BRANCH :"+branch+"\n Gender :  "+gender+"\n Prog Langs : "+langs);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(182, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		
		
	}
}
