package demo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class metro {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					metro window = new metro();
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
	public metro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("      METRO TICKET BOOKING");
		lblNewLabel_2.setFont(new Font("Nirmala UI", Font.BOLD, 14));
		lblNewLabel_2.setBounds(85, 11, 203, 32);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("  NAME  :");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Nirmala UI", Font.BOLD, 14));
		lblNewLabel.setBounds(38, 70, 84, 14);
		frame.getContentPane().add(lblNewLabel);
		
		tb1 = new JTextField();
		tb1.setColumns(10);
		tb1.setBounds(167, 69, 121, 20);
		frame.getContentPane().add(tb1);
		
		JLabel lblNewLabel_1 = new JLabel("SOURCE :");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Nirmala UI", Font.BOLD, 14));
		lblNewLabel_1.setBounds(39, 114, 72, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "KPHB", "AMEERPET", "KUKATPALLY", "MIYAPUR", "BALANAGAR", "JNTU", "MUSAPET", "PARADISE"}));
		cb1.setBounds(167, 112, 121, 22);
		frame.getContentPane().add(cb1);
		
		JLabel lblNewLabel_1_2 = new JLabel("   DESTINATION  :");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Nirmala UI", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(10, 157, 134, 14);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "KPHB", "AMEERPET", "KUKATPALLY", "MIYAPUR", "BALANAGAR", "JNTU", "MUSAPET", "PARADISE"}));
		cb2.setBounds(167, 155, 121, 22);
		frame.getContentPane().add(cb2);
		
		JLabel lblNewLabel_1_3 = new JLabel("   NO.OF_TICKETS  :");
		lblNewLabel_1_3.setBackground(new Color(0, 0, 0));
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Nirmala UI", Font.BOLD, 14));
		lblNewLabel_1_3.setBounds(10, 209, 144, 14);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JComboBox cb3 = new JComboBox();
		cb3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		cb3.setModel(new DefaultComboBoxModel(new String[] {"SELECT ", "1", "2", "3", "4", "5", "6"}));
		cb3.setBounds(167, 207, 121, 22);
		frame.getContentPane().add(cb3);
		
		JButton btnNewButton = new JButton("   Submit");
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setFont(new Font("Nirmala UI", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String source=(String) cb1.getSelectedItem();
				String destination =(String) cb2.getSelectedItem();
				String tickets =(String) cb3.getSelectedItem();
				int nt= Integer.parseInt(tickets);
				if(source.equals(destination))
				{
					JOptionPane.showMessageDialog(btnNewButton, " INVALID !! Please check Stations");
					
				}
				else
				{
					int bill=nt*45;
					JOptionPane.showMessageDialog(btnNewButton, " NAME : "+name+"\n SOURCE :"+source+"\n DESTINATION  :"+destination+"\n TICKETS :"+tickets+"\n amount :"+bill);
				}
				
			}
		});
		btnNewButton.setBounds(335, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\metro image.jfif"));
		lblNewLabel_3.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel_3);
	}
}
