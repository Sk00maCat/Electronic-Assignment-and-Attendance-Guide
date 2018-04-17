
//Package
package gui;

//Imports=
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Toolkit;

//________________________________________________________Comapny Information________________________________________________________
public class Information {
	/**
	 * @wbp.parser.entryPoint
	 */	
	
	//---------------------------------------------------------DISPLAY---------------------------------------------------------
	public static void display()
	{
		//========================OBJECTS========================

		//Jframe
		JFrame frmInformation = new JFrame("Company Information");
		frmInformation.setTitle("Information");
		frmInformation.setResizable(false);
	    frmInformation.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	    frmInformation.setSize(516,543);
	    
	    
	    //========================ACTIONS========================
        
	    
	    //========================OTHER========================
	    
	  	//IMPORTANT
	  	//This code centers the Jframe in the center of the screen upon creation.
	  	Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	  	frmInformation.setLocation(dim.width/2-frmInformation.getSize().width/2, dim.height/2-frmInformation.getSize().height/2);
	  	frmInformation.setLocationRelativeTo(null);
	  	frmInformation.getContentPane().setLayout(null);
	  	
	  	JButton btnNewButton = new JButton("Developer Website");
	  	btnNewButton.setBounds(169, 423, 164, 32);
	  	frmInformation.getContentPane().add(btnNewButton);
	  	
	  	JLabel lblBackgroundImage = new JLabel("New label");
	  	lblBackgroundImage.setVerticalAlignment(SwingConstants.TOP);
	  	lblBackgroundImage.setIcon(new ImageIcon(Information.class.getResource("/images/InformationScreenBackground.png")));
	  	lblBackgroundImage.setBounds(0, 0, 513, 516);
	  	frmInformation.getContentPane().add(lblBackgroundImage);
	  	
	  	//Frame is displayed.
	  	frmInformation.setVisible(true);
	}
}
