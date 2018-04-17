
//Package
package gui;

//Imports
import javax.swing.*;
import main.ConfirmCredentials;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

//________________________________________________________LOGIN SCREEN________________________________________________________
public class LoginScreen
{
	//Variables
	private static JTextField usernameField;	//This variable retrieves the value from our username field entry.
	private static JTextField passwordField;	//This variable retrieves the value from our password field entry.

	/**
	 * @wbp.parser.entryPoint
	 */
	
	//---------------------------------------------------------DISPLAY---------------------------------------------------------
	//This is the display method that is called from other methods to open the login screen.
	public static void display()
	{
		
		//========================OBJECTS========================
		
		//Jframe
		JFrame frmLogin = new JFrame("Login");
		frmLogin.setResizable(false);

	    frmLogin.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	    frmLogin.setSize(793,612);
	    frmLogin.getContentPane().setLayout(null);
	    
	    //Username Label
	    JLabel lblUsername = new JLabel("Username:");
	    lblUsername.setBounds(300, 370, 119, 28);
	    lblUsername.setHorizontalAlignment(SwingConstants.RIGHT);
	    lblUsername.setFont(new Font("Arial", Font.PLAIN, 20));
	    frmLogin.getContentPane().add(lblUsername);
	    
	    //Username Textfield
	    usernameField = new JTextField();
	    usernameField.setBounds(429, 369, 196, 28);
	    usernameField.setFont(new Font("Tahoma", Font.PLAIN, 20));
	    frmLogin.getContentPane().add(usernameField);
	    usernameField.setColumns(10);
	    
	    //Password Label
	    JLabel lblPassword = new JLabel("Password:");
	    lblPassword.setBounds(300, 409, 119, 28);
	    lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
	    lblPassword.setFont(new Font("Arial", Font.PLAIN, 20));
	    frmLogin.getContentPane().add(lblPassword);
	    
	    //Password Textfield
	    passwordField = new JTextField();
	    passwordField.setBounds(429, 408, 196, 28);
	    passwordField.setFont(new Font("Tahoma", Font.PLAIN, 20));
	    passwordField.setColumns(10);
	    frmLogin.getContentPane().add(passwordField);
	    
	    //'Submit' Button
	    JButton btnLogin = new JButton("Log In");
	    btnLogin.setBounds(536, 447, 89, 23);
	    btnLogin.setFont(new Font("Arial", Font.PLAIN, 14));
	    frmLogin.getContentPane().add(btnLogin);
	    
	    //'Information' Button
	    JButton btnInformation = new JButton("Information");
	    btnInformation.setFont(new Font("Arial", Font.PLAIN, 14));
	    btnInformation.setBounds(10, 519, 174, 28);
	    frmLogin.getContentPane().add(btnInformation);
	    
	    //Background Image
	    JLabel backgroundImage = new JLabel("");
	    backgroundImage.setBounds(0, 0, 793, 582);
	    backgroundImage.setHorizontalAlignment(SwingConstants.LEFT);
	    backgroundImage.setIcon(new ImageIcon(LoginScreen.class.getResource("/images/LoginScreenBackground.png")));
	    frmLogin.getContentPane().add(backgroundImage);
	    
		//========================ACTIONS========================
	    
	    //'Submit' button has been clicked.
	    btnLogin.addMouseListener(new MouseAdapter()
	    {
	    	@Override
	    	public void mouseReleased(MouseEvent arg0)
	    	{
    			//Get text from username and password fields.
	    		String username = usernameField.getText();
				String userPassword = passwordField.getText();
				
				//Send the username and password to the credentials method of the ConfirmCredentials class.
				ConfirmCredentials.credentials(username, userPassword);
				
				//Close login screen.
	    	    frmLogin.dispose();
	    	}
	    });
	    
	  //'Enter' key is pressed while the 'Username' text field is tab-selected.
	    usernameField.addKeyListener(new KeyAdapter()
	    {
	    	@Override
	    	public void keyPressed(KeyEvent e)
	    	{
	    		if (e.getKeyCode()==KeyEvent.VK_ENTER)
	    		{
	    			//Get text from username and password fields.
		    		String username = usernameField.getText();
					String userPassword = passwordField.getText();
					
					//Send the username and password to the credentials method of the ConfirmCredentials class.
					ConfirmCredentials.credentials(username, userPassword);
					
					//Close login screen.
		    	    frmLogin.dispose();
	    	    }
	    	}
	    });
	    
	    //'Enter' key is pressed while the 'Password' text field is tab-selected.
	    passwordField.addKeyListener(new KeyAdapter()
	    {
	    	@Override
	    	public void keyPressed(KeyEvent e)
	    	{
	    		if (e.getKeyCode()==KeyEvent.VK_ENTER)
	    		{
	    			//Get text from username and password fields.
		    		String username = usernameField.getText();
					String userPassword = passwordField.getText();
					
					//Send the username and password to the credentials method of the ConfirmCredentials class.
					ConfirmCredentials.credentials(username, userPassword);
					
					//Close login screen.
		    	    frmLogin.dispose();
	    	    }
	    	}
	    });
	    
	    //'Enter' key is pressed while the 'Submit' button is tab-selected.
	    btnLogin.addKeyListener(new KeyAdapter()
	    {
	    	@Override
	    	public void keyPressed(KeyEvent e)
	    	{
	    		if (e.getKeyCode()==KeyEvent.VK_ENTER)
	    		{
	    			//Get text from username and password fields.
		    		String username = usernameField.getText();
					String userPassword = passwordField.getText();
					
					//Send the username and password to the credentials method of the ConfirmCredentials class.
					ConfirmCredentials.credentials(username, userPassword);
					
					//Close login screen.
		    	    frmLogin.dispose();
	    	    }
	    	}
	    });
	    
	    //'Information' button has been clicked.
	    btnInformation.addMouseListener(new MouseAdapter()
	    {
	    	@Override
	    	public void mouseReleased(MouseEvent arg0)
	    	{
    			//The company information page will pop up.
    			Information.display();
	    	}
	    });
	    
	    //'Enter' key is pressed while the 'Information' button is tab-selected.
	    btnInformation.addKeyListener(new KeyAdapter()
	    {
	    	@Override
	    	public void keyPressed(KeyEvent e)
	    	{
	    		if (e.getKeyCode()==KeyEvent.VK_ENTER)
	    		{
	    			//The company information page will pop up.
	    			Information.display();
	    	    }
	    	}
	    });
	  
		//========================OTHER========================
	    
		//IMPORTANT
	    //This code centers the Jframe in the center of the screen upon creation.
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frmLogin.setLocation(dim.width/2-frmLogin.getSize().width/2, dim.height/2-frmLogin.getSize().height/2);
		frmLogin.setLocationRelativeTo(null);
	    
		//Frame is displayed.
	    frmLogin.setVisible(true);
	}
}
