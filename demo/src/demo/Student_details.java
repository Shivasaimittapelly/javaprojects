package demo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JProgressBar;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Student_details {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;
	private JTextField tb3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student_details window = new Student_details();
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
	public Student_details() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 558, 432);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("   STUDENT DETAILS");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBackground(new Color(255, 0, 128));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(190, 0, 207, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("   NAME :");
		lblNewLabel_1.setForeground(new Color(255, 0, 255));
		lblNewLabel_1.setFont(new Font("Nirmala UI", Font.BOLD, 14));
		lblNewLabel_1.setBounds(36, 138, 73, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		tb1 = new JTextField();
		tb1.setBounds(180, 88, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("       ID :");
		lblNewLabel_2.setForeground(new Color(255, 0, 255));
		lblNewLabel_2.setFont(new Font("Nirmala UI", Font.BOLD, 14));
		lblNewLabel_2.setBounds(36, 85, 86, 22);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("    BRANCH   :");
		lblNewLabel_1_1.setForeground(new Color(255, 0, 255));
		lblNewLabel_1_1.setFont(new Font("Nirmala UI", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(36, 189, 107, 18);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JComboBox cb1 = new JComboBox();
		cb1.setBackground(new Color(0, 255, 0));
		cb1.setEditable(true);
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "CSE", "AIML", "DS", "IT", "IOT"}));
		cb1.setBounds(180, 189, 86, 22);
		frame.getContentPane().add(cb1);
		
		JButton btnNewButton = new JButton("   SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id=tb1.getText();
				String name=tb2.getText();
				String branch=(String) cb1.getSelectedItem();
				String marks=tb3.getText();
				int m =Integer.parseInt(marks);
				try 
				{
				java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","mrec");
				
				String q="insert into students values('"+id+"','"+name+"','"+branch+"','"+m+"')";
					
				Statement stn=con.createStatement();
				stn.executeUpdate(q);
				con.close();
				JOptionPane.showMessageDialog(btnNewButton, "Inserted Sucessfully !!");
				
				
				}
				catch(SQLException el)
				{
					el.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBackground(UIManager.getColor("Button.focus"));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(389, 330, 107, 23);
		frame.getContentPane().add(btnNewButton);
		
		tb2 = new JTextField();
		tb2.setColumns(10);
		tb2.setBounds(180, 137, 86, 20);
		frame.getContentPane().add(tb2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("   MARKS  :");
		lblNewLabel_1_1_1.setForeground(new Color(255, 0, 255));
		lblNewLabel_1_1_1.setFont(new Font("Nirmala UI", Font.BOLD, 14));
		lblNewLabel_1_1_1.setBounds(47, 247, 107, 18);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		tb3 = new JTextField();
		tb3.setColumns(10);
		tb3.setBounds(180, 248, 86, 20);
		frame.getContentPane().add(tb3);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\fabb402ae2108d26545206531f791499.jpg"));
		lblNewLabel_3.setBounds(0, 23, 542, 370);
		frame.getContentPane().add(lblNewLabel_3);
	}
}
