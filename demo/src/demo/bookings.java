package demo;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class bookings {

	private JFrame frame;
	
	private JTextField n1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bookings window = new bookings();
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
	public bookings() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 506, 413);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("       BOOK UR SHOW !!");
		lblNewLabel_1.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 11));
		lblNewLabel_1.setBounds(168, 11, 161, 27);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("     Name :");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Leelawadee UI", Font.BOLD, 11));
		lblNewLabel_2.setBounds(20, 77, 58, 27);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Movie Name :");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Leelawadee UI", Font.BOLD, 11));
		lblNewLabel_2_1.setBounds(20, 115, 74, 27);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JComboBox cb1 = new JComboBox();
		cb1.setEditable(true);
		cb1.setModel(new DefaultComboBoxModel(new String[] {"Select Movie","RRR", "Dasara", "Nani", "Salar", "Kgf-2", "Darling"}));
		cb1.setBounds(125, 118, 118, 22);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"No of Tickets", "1", "2", "3", "4", "5", "6"}));
		cb2.setBounds(125, 158, 118, 22);
		frame.getContentPane().add(cb2);
		
		
		JLabel lblNewLabel_2_1_1 = new JLabel("    No Of Tickets :");
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Leelawadee UI", Font.BOLD, 11));
		lblNewLabel_2_1_1.setBounds(20, 155, 88, 27);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		
		n1 = new JTextField();
		n1.setBounds(125, 80, 118, 20);
		frame.getContentPane().add(n1);
		n1.setColumns(10);
		
		JButton btnNewButton = new JButton("  CONFIRM");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int amount=0;
				String name=n1.getText();
				String moviename=(String) cb1.getSelectedItem();
				String tickets=(String) cb2.getSelectedItem();
				int nt=Integer.parseInt(tickets);
				
				if(moviename.equals("RRR"))
				{
					amount=amount+(150*nt);
				}
				if(moviename.equals("Dasara"))
				{
					amount=amount+(200*nt);
				}
				if(moviename.equals("Nani"))
				{
					amount=amount+(100*nt);
				}
				if(moviename.equals("Salar"))
				{
					amount=amount+(150*nt);
				}
				if(moviename.equals("Kgf-2"))
				{
					amount=amount+(250*nt);
				}
				if(moviename.equals("Darling"))
				{
					amount=amount+(100*nt);
				}
				int res=0;
				res=JOptionPane.showConfirmDialog(btnNewButton,"Name : "+name+"\n Movie_Name : "+moviename+"\n No_Of_Tickets : "+tickets+ "\n  Amount " +amount);
		
				int YES_OPTION = 0;
			
				if(res==YES_OPTION)
				{
					JOptionPane.showMessageDialog(btnNewButton,"BOOKing Sucessfull !!");
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton," Booking failed");
					
				}
	
			}
			
			
		});
		btnNewButton.setFont(new Font("Leelawadee UI", Font.BOLD, 13));
		btnNewButton.setBounds(133, 258, 103, 27);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("No.Of Tickets :");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\OIP.jfif"));
		lblNewLabel.setBounds(0,0, 490, 400);                                                                     
		frame.getContentPane().add(lblNewLabel);
		
	}
}
