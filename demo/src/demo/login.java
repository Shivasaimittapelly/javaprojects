package demo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login {

	private JFrame frame;
	private JTextField tb1;
	private JPasswordField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
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
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 12));
		frame.getContentPane().setBackground(new Color(255, 128, 0));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tb1 = new JTextField();
		tb1.setBounds(194, 61, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel username = new JLabel("USER NAME");
		username.setFont(new Font("Calibri", Font.BOLD, 11));
		username.setBounds(64, 67, 78, 14);
		frame.getContentPane().add(username);
		
		JLabel lblNewLabel_1 = new JLabel("PASSWORD");
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 11));
		lblNewLabel_1.setBounds(64, 123, 62, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("     Login Page !!");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(175, 11, 105, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String password=t1.getText();
				//JOptionPane.showMessageDialog(btnNewButton,"Name:  "+name+"\n Password: " +password);
				if (name.equals("Shiva") && password.equals("12345"))
				{
					JOptionPane.showMessageDialog(btnNewButton, "Valid user !! ");
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton, "In-Valid user !! ");

				}
			}
		});
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(194, 186, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		t1 = new JPasswordField();
		t1.setBounds(194, 120, 86, 20);
		frame.getContentPane().add(t1);
	}
}
