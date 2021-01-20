import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class eplGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					eplGUI frame = new eplGUI();
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
	public eplGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 718, 455);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("TABLE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eplTable table = new eplTable();
				dispose();
				table.setVisible(true);
			}
		});
		btnNewButton.setBounds(288, 230, 105, 47);
		contentPane.add(btnNewButton);
		
		JButton btnPlayers = new JButton("PLAYERS");
		btnPlayers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eplPlayers players = new eplPlayers();
				dispose();
				players.setVisible(true);
			}
		});
		btnPlayers.setBounds(434, 230, 105, 47);
		contentPane.add(btnPlayers);
		
		JButton btnMatches = new JButton("MATCHES");
		btnMatches.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eplMatches matches = new eplMatches();
				dispose();
				matches.setVisible(true);
			}
		});
		btnMatches.setBounds(288, 302, 105, 47);
		contentPane.add(btnMatches);
		
		JButton btnResults = new JButton("RESULTS");
		btnResults.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eplResults results = new eplResults();
				dispose();
				results.setVisible(true);
			}
		});
		btnResults.setBounds(434, 302, 105, 47);
		contentPane.add(btnResults);
		
		JButton btnNewButton_4 = new JButton("return");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				dispose();
				MainMenuSport.main(null);
			}
		});
		btnNewButton_4.setBounds(544, 384, 85, 21);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(eplGUI.class.getResource("/Image/epl.PNG")));
		lblNewLabel.setBounds(144, 19, 395, 191);
		contentPane.add(lblNewLabel);
		
		JButton btnTop = new JButton("TOP 3");
		btnTop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eplTop3 top3 = new eplTop3();
				dispose();
				top3.setVisible(true);
			}
		});
		btnTop.setBounds(144, 302, 105, 47);
		contentPane.add(btnTop);
		
		JButton btnAbout = new JButton("ABOUT");
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eplAbout about = new eplAbout();
				dispose();
				about.setVisible(true);
			}
		});
		btnAbout.setBounds(144, 230, 105, 47);
		contentPane.add(btnAbout);
	}

}
