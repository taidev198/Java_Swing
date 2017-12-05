package calculate;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class CalculateFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculateFrame frame = new CalculateFrame();
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
	public CalculateFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 496, 504);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(0, 213, 92, 54);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(0, 267, 92, 54);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(0, 323, 92, 54);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(107, 229, 93, 54);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(107, 281, 93, 52);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("New button");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_5.setBounds(212, 281, 85, 54);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("New button");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_6.setBounds(212, 231, 85, 52);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("New button");
		btnNewButton_7.setBounds(107, 334, 93, 54);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("New button");
		btnNewButton_8.setBounds(212, 336, 85, 52);
		contentPane.add(btnNewButton_8);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(0, 13, 478, 129);
		contentPane.add(textPane);
		
		JButton btnNewButton_9 = new JButton("New button");
		btnNewButton_9.setBounds(0, 390, 230, 54);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_11 = new JButton("New button");
		btnNewButton_11.setBounds(232, 390, 107, 54);
		contentPane.add(btnNewButton_11);
		
		JButton btnNewButton_10 = new JButton("New button");
		btnNewButton_10.setBounds(309, 229, 87, 54);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_12 = new JButton("New button");
		btnNewButton_12.setBounds(309, 280, 87, 54);
		contentPane.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("New button");
		btnNewButton_13.setBounds(309, 334, 87, 54);
		contentPane.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("New button");
		btnNewButton_14.setBounds(340, 390, 108, 54);
		contentPane.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("New button");
		btnNewButton_15.setBounds(0, 155, 92, 54);
		contentPane.add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("New button");
		btnNewButton_16.setBounds(103, 179, 97, 25);
		contentPane.add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("New button");
		btnNewButton_17.setBounds(212, 179, 97, 25);
		contentPane.add(btnNewButton_17);
	}
}
