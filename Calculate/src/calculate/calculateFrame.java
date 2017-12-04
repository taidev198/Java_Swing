package calculate;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.tools.Diagnostic.Kind;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.annotation.processing.Messager;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.Element;
import javax.print.attribute.standard.JobName;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.InputMethodListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class calculateFrame extends JFrame {
	 float a,b,c;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculateFrame frame = new calculateFrame();
					
					frame.setTitle("CALCULATE BY TAIDEV198");
					ImageIcon img = new ImageIcon("D:/download/Calculator_5122x.png");
					frame.setIconImage(img.getImage());
	                Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	                int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
	                int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
	                frame.setLocation(x, y);
	                frame.setResizable(false);
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
	public calculateFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 341);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 153));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCalculate = new JButton("CALCULATE");
		btnCalculate.setForeground(new Color(255, 102, 102));
		btnCalculate.setBackground(new Color(102, 255, 51));
		btnCalculate.setBounds(154, 211, 119, 25);
		contentPane.add(btnCalculate);
		//create textPane
		JTextPane firstResult = new JTextPane();
		firstResult.setEnabled(false);//cannot edit
		firstResult.setBounds(25, 162, 76, 22);
		contentPane.add(firstResult);
		
		JTextPane secondResult = new JTextPane();
		secondResult.setBounds(333, 162, 76, 22);
		secondResult.setEnabled(false);//cannot edit
		contentPane.add(secondResult);
		
		JTextField A = new JTextField();
		
		//input
	
		A.setBounds(25, 116, 76, 22);
		contentPane.add(A);
		

		JTextField B = new JTextField();
		
		B.setBounds(173, 116, 76, 22);
		contentPane.add(B);
		JTextField C = new JTextField();
		C.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String edit = C.getText();
				c = Float.parseFloat(edit);
			}
		});
		
		C.setBounds(333, 116, 76, 22);
		contentPane.add(C);
		//create labels
		JLabel AVariable = new JLabel("A");
		AVariable.setBounds(46, 98, 56, 16);
		contentPane.add(AVariable);
		
		JLabel BVariable = new JLabel("B");
		BVariable.setBounds(195, 98, 56, 16);
		contentPane.add(BVariable);
		
		JLabel lblC = new JLabel("C");
		lblC.setBounds(354, 99, 56, 16);
		contentPane.add(lblC);
		
		JLabel X1 = new JLabel("X1");
		X1.setBounds(45, 144, 56, 16);
		contentPane.add(X1);
		
		JLabel X2 = new JLabel("X2");
		X2.setBounds(353, 144, 56, 16);
		contentPane.add(X2);
		
		JLabel lblResults = new JLabel("RESULTS");
		lblResults.setBounds(183, 151, 56, 16);
		contentPane.add(lblResults);
		
		JLabel DesignedByTaidev = new JLabel("DESIGNED BY TAIDEV198");
		DesignedByTaidev.setBackground(new Color(255, 204, 153));
		DesignedByTaidev.setForeground(new Color(255, 51, 0));
		DesignedByTaidev.setBounds(281, 269, 168, 25);
		//REMOVE COMPONENT
		
		contentPane.add(DesignedByTaidev);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 204, 153));
		panel.setBounds(0, 0, 432, 100);
		contentPane.add(panel);
		//add image
		ImageIcon img = new ImageIcon("D:/download/calculate.jpg");
		
		JLabel ImgLabel = new JLabel(img);
		ImgLabel.setBackground(new Color(255, 204, 153));
		ImgLabel.setSize(100, 10);
		panel.add(ImgLabel);
		
		JLabel lblAbout = new JLabel("ABOUT");
		lblAbout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JDialog jp = new JDialog();
				jp.setTitle("ABOUT ME");
				jp.setBackground(getContentPane().getBackground());
				jp.setVisible(true);
				jp.setSize(300, 200);
				jp.setResizable(false);
				
				JTextPane jtp = new JTextPane();
				jtp.setEditable(false);
				jtp.setText( "I'am TaiDev198 "
						+ "\n" + "MAIL:taidev198@gmail.com" +"\n PHONE:01627249988" + "\nFACEBOOK:facebook.com/NTT.TaiDev198");
				JButton ok = new JButton("OK");
				ok.setText("OK");
				ok.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						jp.setVisible(false);
						
					}
				});
				jp.setModal(true);
				ok.setBounds(120, 120, 40, 30);
				jp.add(ok);
				jp.add(jtp);
//				jp.showMessageDialog(null, "I'am TaiDev198 "
//						+ "\n" + "MAIL:taidev198@gmail.com" +"\n PHONE:01627249988" + "\nFACEBOOK:facebook.com/NTT.TaiDev198" ,"ABOUT ME",JOptionPane.INFORMATION_MESSAGE);
//				jp.setBackground(new Color(255, 204, 153));
			}
		});
		lblAbout.setBounds(12, 273, 56, 16);
		contentPane.add(lblAbout);
		//events

			//main

		btnCalculate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				a= Float.parseFloat(A.getText());
				b= Float.parseFloat(B.getText());
				c= Float.parseFloat(C.getText());
				Calculate calulate = new Calculate(a,b,c);
				System.out.println(a);
				calulate.calulate();
				firstResult.setText(Float.toString(calulate.getX1()));
				
				secondResult.setText(Float.toString(calulate.getX2()));
				
			}
		});

	}
}
