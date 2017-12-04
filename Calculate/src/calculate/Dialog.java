package calculate;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.*;
public class Dialog extends JPanel{

	ImageIcon img = new ImageIcon("D:/download/Calculator_5122x.png");
    JFrame frame;
    String simpleDialogDesc = "Some simple message dialogs";
    String iconDesc = "A JOptionPane has its choice of icons";
    String moreDialogDesc = "Some more dialogs";
   // CustomDialog customDialog;
    public Dialog() {
    	frame.setSize(200, 200);
    	frame.setVisible(true);
    }
}
