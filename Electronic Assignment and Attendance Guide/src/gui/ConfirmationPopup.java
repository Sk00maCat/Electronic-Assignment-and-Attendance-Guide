
//Package
package gui;

//Imports
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import org.eclipse.wb.swing.FocusTraversalOnArray;

//________________________________________________________CONFIRMATION POPUP________________________________________________________
public class ConfirmationPopup {

	/**
	 * @wbp.parser.entryPoint
	 */	
	
	//---------------------------------------------------------DISPLAY---------------------------------------------------------
	public static void display(String currentClass, String selectedClass, int index)
	{
		//========================OBJECTS========================
		
		//Jframe
		JFrame frmConfirmationPopup = new JFrame("Confirm Deletion");
		frmConfirmationPopup.setResizable(false);
	    frmConfirmationPopup.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	    frmConfirmationPopup.setSize(371,173);
        frmConfirmationPopup.getContentPane().setLayout(null);
	    
        //'Delete' Button
        JButton btnDelete = new JButton("Delete");
        btnDelete.setFont(new Font("Arial", Font.PLAIN, 14));
        btnDelete.setBounds(10, 84, 166, 42);
        frmConfirmationPopup.getContentPane().add(btnDelete);
        
        //'Cancel' Button
        JButton btnCancel = new JButton("Cancel");
        btnCancel.setFont(new Font("Arial", Font.PLAIN, 14));
        btnCancel.setBounds(186, 84, 166, 42);
        frmConfirmationPopup.getContentPane().add(btnCancel);
        
        //Label
        JLabel lblText = new JLabel("Are you sure you wish to delete the following assignment?:");
        lblText.setFont(new Font("Arial", Font.PLAIN, 12));
        lblText.setBounds(10, 11, 335, 22);
        frmConfirmationPopup.getContentPane().add(lblText);
        
        //Label
        JLabel lblAssignment = new JLabel("\"" + selectedClass + "\"");
        lblAssignment.setForeground(SystemColor.textHighlight);
        lblAssignment.setHorizontalAlignment(SwingConstants.CENTER);
        lblAssignment.setFont(new Font("Arial", Font.BOLD, 14));
        lblAssignment.setBounds(10, 44, 342, 29);
        frmConfirmationPopup.getContentPane().add(lblAssignment);
        
	    //========================ACTIONS========================
        
        //'Delete' button has been clicked.
        btnDelete.addMouseListener(new MouseAdapter()
        {
        	@Override
        	public void mouseReleased(MouseEvent arg0)
        	{
	    		//EDIT EDIT EDIT EDIT EDIT EDIT 
	    		//AT THIS POINT WE WILL SET THE CHOICE RESULT OF THIS POPUP VIA A SETTER
	    		//EDIT EDIT EDIT EDIT EDIT EDIT 
        		
        		//Confirmation popup screen is closed.
	    		frmConfirmationPopup.dispose();	
	    		
    			//User is returned to the 'Delete Assignment' window.
	    		DeleteAssignment.display(currentClass, index);
        	}
        });
        
	    //'Enter' key is pressed while the 'Delete' button is tab-selected.
	    btnDelete.addKeyListener(new KeyAdapter()
	    {
	    	@Override
	    	public void keyPressed(KeyEvent e)
	    	{
	    		if (e.getKeyCode()==KeyEvent.VK_ENTER)
	    		{
		    		//EDIT EDIT EDIT EDIT EDIT EDIT 
		    		//AT THIS POINT WE WILL SET THE CHOICE RESULT OF THIS POPUP VIA A SETTER
		    		//EDIT EDIT EDIT EDIT EDIT EDIT 
	        		
	        		//Confirmation popup screen is closed.
		    		frmConfirmationPopup.dispose();	
		    		
	    			//User is returned to the 'Delete Assignment' window.
		    		DeleteAssignment.display(currentClass, index);
	    	    }
	    	}
	    });
	    
        //'Cancel' button has been clicked.
        btnCancel.addMouseListener(new MouseAdapter()
        {
        	@Override
        	public void mouseReleased(MouseEvent arg0)
        	{
	    		//EDIT EDIT EDIT EDIT EDIT EDIT 
	    		//AT THIS POINT WE WILL SET THE CHOICE RESULT OF THIS POPUP VIA A SETTER
	    		//EDIT EDIT EDIT EDIT EDIT EDIT 
        		
        		//Confirmation popup screen is closed.
	    		frmConfirmationPopup.dispose();	
	    		
    			//User is returned to the 'Delete Assignment' window.
	    		DeleteAssignment.display(currentClass, index);
        	}
        });
        
	    //'Enter' key is pressed while the 'Cancel' button is tab-selected.
	    btnCancel.addKeyListener(new KeyAdapter()
	    {
	    	@Override
	    	public void keyPressed(KeyEvent e)
	    	{
	    		if (e.getKeyCode()==KeyEvent.VK_ENTER)
	    		{
		    		//EDIT EDIT EDIT EDIT EDIT EDIT 
		    		//AT THIS POINT WE WILL SET THE CHOICE RESULT OF THIS POPUP VIA A SETTER
		    		//EDIT EDIT EDIT EDIT EDIT EDIT 
	        		
	        		//Confirmation popup screen is closed.
		    		frmConfirmationPopup.dispose();	
		    		
	    			//User is returned to the 'Delete Assignment' window.
		    		DeleteAssignment.display(currentClass, index);	
	    	    }
	    	}
	    });	    
        
	    //========================OTHER========================
	    
	  	//IMPORTANT
	  	//This code centers the Jframe in the center of the screen upon creation.
	  	Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	  	frmConfirmationPopup.setLocation(dim.width/2-frmConfirmationPopup.getSize().width/2, dim.height/2-frmConfirmationPopup.getSize().height/2);
	  	frmConfirmationPopup.setLocationRelativeTo(null);
	  	frmConfirmationPopup.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{btnDelete, btnCancel}));
	  	
	  	//Frame is displayed.
	  	frmConfirmationPopup.setVisible(true);
	}
}
