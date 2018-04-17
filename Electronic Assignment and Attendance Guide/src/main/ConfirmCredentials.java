
//Package
package main;

//Imports
import gui.*;
import javax.swing.JOptionPane;

//________________________________________________________CONFIRM CREDENTIALS________________________________________________________
public class ConfirmCredentials
{

	//---------------------------------------------------------CREDENTIALS---------------------------------------------------------
	//This method is called from the login screen (LoginScreen.java) upon submission of user-entered login data.
	public static void credentials(String username, String password)
	{
		//[PLACEHOLDER] - - - - - - - - - - - - - - - - - - - - - - - - - - -
		//[PLACEHOLDER] THIS IS WHERE WE WILL CHECK WITH THE DATABASE TO CONFIRM THE USER TYPE
		//[PLACEHOLDER] - - - - - - - - - - - - - - - - - - - - - - - - - - -
		
		//The user is then taken to their respective action center, based on their user type.
		//[FOR NOW, WE WILL USE THESE PLACEHOLDER LOGINS.]
		
		//User is of 'Admin' type.
		if (username.equals("admin"))
		{
			//Admin action center is displayed for the user.
			//[PLACEHOLDER] ADMIN ACTION CENTER WILL BE CALLED HERE.
		}
		
		//User is of 'Teacher' type.
		else if (username.equals("teacher"))
		{
			//By default, the teacher action center starts with no class selected.
			String currentClass = "No Class Selected";
			
			//Teacher action center is displayed for the user.
			TeacherActionCenter.display(currentClass);
		}
		
		//User is of 'Student' type.
		else if (username.equals("student"))
		{
			//Student action center is displayed for the user.
			//[PLACEHOLDER] STUDENT ACTION CENTER WILL BE CALLED HERE.
		}
		
		//User does not match one of the three user types, and is returned to the login screen.
		else
		{
			LoginScreen.display();
			JOptionPane.showMessageDialog(null, "Invalid Username/Password");
			
		}
	}
}
