import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class SubLogin extends JFrame {

	private JPanel contentPane;
	private JTextField enterName;
	private JTextField enterAge;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SubLogin frame = new SubLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SubLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 290, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		enterName = new JTextField();
		enterName.setBounds(100, 78, 146, 40);
		contentPane.add(enterName);
		enterName.setColumns(10);
		
		enterAge = new JTextField();
		enterAge.setBounds(100, 140, 146, 40);
		contentPane.add(enterAge);
		enterAge.setColumns(10);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String age= enterAge.getText();
				int myInteger = 0;
				try {
				    myInteger = Integer.parseInt(age);
					String fileName = "guestRecord.txt";
					try {
						File writer = new File(fileName);
						PrintWriter pw = new PrintWriter(new FileOutputStream(writer,true));
						pw.append(enterName.getText().format("%-10s", enterName.getText())+" "+"/"+" "+enterAge.getText()+"\n");
						pw.close();
					} catch (IOException e2) {
						e2.printStackTrace();
					}
					MainMenuSport sport = new MainMenuSport();
					dispose();
					sport.setVisible(true);
				} catch(Exception a){
					JOptionPane.showMessageDialog(null, "PLEASE ENTER AGE IN NUMBER/INTEGER");
				}
				

			}
		});
		btnNewButton.setBounds(161, 200, 85, 40);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(31, 78, 59, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("AGE");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(31, 140, 45, 40);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("*max 10 characters");
		lblNewLabel_2.setBounds(137, 117, 109, 13);
		contentPane.add(lblNewLabel_2);
	}

}
