


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

public class motogpGUI extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					motogpGUI frame = new motogpGUI();
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
	public motogpGUI() {
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
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(199, 21, 133)));
		panel_1.setBackground(new Color(255, 192, 203));
		panel_1.setBounds(210, 27, 837, 98);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("The Result of MotoGP Spain 2020");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(100, 22, 673, 52);
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
				{" Fabio Quartararo", " Podium 1", " Petronas Yamaha (YZR-M1)", " 41m 23.796s", " 25", " France"},
				{" Maverick Vinales", " Podium 2", " Monster Yamaha (YZR-M1)", " 41m 28.399s", " 20", " Spain"},
				{" Andrea Dovizioso", " Podium 3", " Ducati Team (GP20)", " 41m 29.742s", " 16", " Italy"},
				{" Jack Miller", " Podium 4", " Pramac Ducati (GP20)", " 41m 30.464s", " 13", " Australia"},
				{" Franco Morbidelli", " Podium 5", " Petronas Yamaha (YZR-M1)", " 41m 30.64s", " 11 ", " Italy"},
				{"  Pol Esparango", " Podium 6", " Red Bull KTM (RC16)", " 41m 30.734s", " 10", " Spain"},
				{" Francesco Bagnaia", " Podium 7", " Pramac Ducati (GP20)", " 41m 36.823s", " 9", " Italy"},
				{" Miguel Olivera", " Podium 8", " KTM Tech3 (RC16)", " 41m 37.237s", " 8", " Portugal"},
				{" Danilo Petrucci", " Podium 9", " Ducati Team (GP20)", " 41m 43.447s", " 7", " Italy"},
				{" Takaagi Nakagami", " Podium 10", " LCR Honda (RC213V)", " 41m 45.349s", " 6", " Japan"},
				{" Johann Zarco", " Podium 11", " Reale Avintia (GP19)", " 41m 48.896s", " 5", " France"},
				{" Alex Marquez", " Podium 12", " Repsol Honda (RC213V)", " 41m 51.146s", " 4", " Spain"},
				{" Brad Binder", " Podium 13", " Red Bull KTM (RC16)", " 41m 53.436s", " 3", " South Africa"},
				{" Tito Rabat", " Podium 14", " Reale Avintia (GP19)", " 41m 56.694s", " 2", " Spain"},
				{" Bradley Smith", " Podium 15", " Aprilia Test Rider (RS-GP)", " 42m 3.478s", " 1", " England"},
				{" Marc Marquez", " Not in Podium", " Repsol Honda (RC213V)", " Not Shown", " 0", " Spain"},
				{" Iker Lecuona", " Not in Podium", " Red Bull KTM Tech3 (RC16)", " Not Shown", " 0", " Spain"},
				{" Valentino Rossi", " Not in Podium", " Monster Yamaha (YZR-M1)", " Not Shown", " 0", " Italy"},
				{" Aleix Esparago", " Not in Podium", " Aprilia Gresini (RS-GP)", " Not Shown", " 0", " Spain"},
				{" Joan Mir", " Not in podium", " Suzuki Ecstar (GSX-RR)", " Not Shown", " 0", " Spain"},
			},
			new String[] {
				"Riders' Name:", "Podium Position:", "Teammate & Motorcycle:", "Time:", "Final Point:", "Country Origin:"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(102);
		table.getColumnModel().getColumn(1).setPreferredWidth(120);
		table.getColumnModel().getColumn(2).setPreferredWidth(149);
		table.getColumnModel().getColumn(4).setPreferredWidth(66);
		table.getColumnModel().getColumn(5).setPreferredWidth(92);
		table.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
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
		btnReturn.setBounds(628, 582, 167, 50);
		panel.add(btnReturn);
	}
}