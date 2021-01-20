

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class F1GUI extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					F1GUI frame = new F1GUI();
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
	public F1GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1345, 732);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 192, 203));
		panel.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(199, 21, 133)));
		panel.setBounds(0, 0, 1283, 695);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(Color.ORANGE);
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(199, 21, 133)));
		panel_1.setBackground(Color.PINK);
		panel_1.setBounds(210, 27, 907, 98);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("The Result of F1 Brazil 2020");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(155, 21, 843, 52);
		panel_1.add(lblNewLabel);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(199, 21, 133)));
		panel_1_1.setBackground(new Color(255, 192, 203));
		panel_1_1.setBounds(39, 151, 1206, 377);
		panel.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setToolTipText("");
		scrollPane.setBounds(10, 11, 1186, 355);
		panel_1_1.add(scrollPane);
		
		table = new JTable();
		table.setBackground(new Color(255, 245, 238));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{" Lewis Hamilton", "Podium 1", " Mercedes", " 41m 23.796s", " 347", " England"},
				{" Valtteri Bottas", " Podium 2", " Mercedes", " 41m 28.399s", " 223", " Poland"},
				{" Max Verstappen ", " Podium 3", " Red Bull", " 41m 29.742s", " 214", " Netherlands"},
				{" Sergio Pérez ", " Podium 4", " Racing Point", " 41m 30.464s", " 125", " Mexico"},
				{" Daniel Ricciardo", " Podium 5", " Renault", " 41m 30.64s", " 119", " Australia"},
				{" Carlos Sainz ", " Podium 6", " McLaren", " 41m 30.734s", " 105", " Spain"},
				{" Alexander Albon", " Podium 7", " Red Bull", " 41m 36.823s", " 105", " Thailand"},
				{" Charles Leclerc", " Podium 8", " Ferrari", " 41m 37.237s", " 98", " Monaco"},
				{" Lando Norris", " Podium 9", " McLaren", " 41m 43.447s", " 97", " England"},
				{" Pierre Gasly", " Podium 10", " Scuderia", " 41m 45.349s", " 75", " French"},
				{" Johann Zarco", " Podium 11", " Renault", " 41m 48.896s", " 74", " France"},
				{" Martinoz Kelly", " Podium 12", " Mercedes", " 41m 51.146s", " 74", " Spain"},
				{" Brad Binder", " Podium 13", " Renault", " 41m 53.436s", " 63", " South Africa"},
				{" Tito Rabat", " Podium 14", " McLaren", " 41m 56.694s", " 62", " Spain"},
				{" Bradley Smith", " Podium 15", " Scuderia", " 42m 3.478s", " 51", " England"},
				{" Marc Marquez", " Not in Podium", " Red Bull", " Not Shown", " 45", " Spain"},
				{" Iker Lecuona", " Not in Podium", " McLaren", " Not Shown", " 44", " Spain"},
				{" Valentino Rossi", " Not in Podium", " Rscing Point", " Not Shown", " 42", " Italy"},
				{" Aleix Esparago", " Not in Podium", " McLaren", " Not Shown", " 36", " Spain"},
				{" Joan Mir", " Not in podium", " Racing Point", " Not Shown", " 33", " Spain"},
			},
			new String[] {
				"RIDER'S NAME", "PODIUM POSITION", "TEAM", "TIME", "FINAL POINT", "COUNTRY ORIGIN"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(102);
		table.getColumnModel().getColumn(1).setPreferredWidth(120);
		table.getColumnModel().getColumn(2).setPreferredWidth(149);
		table.getColumnModel().getColumn(4).setPreferredWidth(66);
		table.getColumnModel().getColumn(5).setPreferredWidth(92);
		table.setFont(new Font("Arial", Font.BOLD, 14));
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Component frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","The Result of MotoGP Spain",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
						System.exit(0);
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 31));
		btnNewButton.setBounds(1071, 582, 167, 50);
		panel.add(btnNewButton);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					table.print();
				}
				catch(java.awt.print.PrinterException e) {
					System.err.format("No Printer found", e.getMessage());
				}
			}
		});
		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 31));
		btnPrint.setBounds(856, 582, 167, 50);
		panel.add(btnPrint);
		
		JButton btnReturn = new JButton("Return");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				dispose();
				MainMenuSport.main(null);
			}
		});
		btnReturn.setFont(new Font("Tahoma", Font.BOLD, 31));
		btnReturn.setBounds(631, 582, 167, 50);
		panel.add(btnReturn);
	}
}
