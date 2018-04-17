
//Package
package gui;

//Imports
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EtchedBorder;
import org.eclipse.wb.swing.FocusTraversalOnArray;

//________________________________________________________DELETE ASSIGNMENT________________________________________________________
public class DeleteAssignment {

	/**
	 * @wbp.parser.entryPoint
	 */	
	
	//---------------------------------------------------------DISPLAY---------------------------------------------------------
	public static void display(String currentClass, int index)
	{
		//========================OBJECTS========================
		
		//Jframe
		JFrame frmDeleteAssignment = new JFrame("Deleting Assignment");
		frmDeleteAssignment.setResizable(false);
	    frmDeleteAssignment.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	    frmDeleteAssignment.setSize(341,447);
	    
	    //This is the list which contains all of the assignments associated with the current class.
	    DefaultListModel<String> listOfAssignments = new DefaultListModel<String>();
	    
	    //TEMPORARY TEMPORARY TEMPORARY TEMPORARY TEMPORARY TEMPORARY TEMPORARY TEMPORARY TEMPORARY TEMPORARY 
	    //Pre-filled class list values.
	    //This is where a query will eventually retrieve a class's current assignments.
	    listOfAssignments.addElement("Introductory Readings");
	    listOfAssignments.addElement("Homework 1");
	    listOfAssignments.addElement("Oregon Trail Exam");
	    listOfAssignments.addElement("Homework 2");
	    listOfAssignments.addElement("Quiz 1");
	    listOfAssignments.addElement("Homework 3");
	    listOfAssignments.addElement("Midterm Exam");
	    listOfAssignments.addElement("Discussion Post 1");
	    listOfAssignments.addElement("Quiz 2");
	    listOfAssignments.addElement("Quiz 3");
	    listOfAssignments.addElement("Gold Rush Exam");
	    listOfAssignments.addElement("Homework 4");
	    listOfAssignments.addElement("Homework 5");
	    listOfAssignments.addElement("Discussion Post 2");
	    listOfAssignments.addElement("Final Exam");
	    frmDeleteAssignment.getContentPane().setLayout(null);
	    
	    //Scroll Pane
	    JScrollPane scrollPane = new JScrollPane();
	    scrollPane.setBounds(10, 11, 315, 300);
	    frmDeleteAssignment.getContentPane().add(scrollPane);
	
	    //Jlist
	    JList<String> assignmentList = new JList<String>(listOfAssignments);
	    assignmentList.setFont(new Font("Arial", Font.PLAIN, 16));
	    assignmentList.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
	    scrollPane.setViewportView(assignmentList);
	    assignmentList.setBackground(Color.WHITE);
        assignmentList.setSelectedIndex(0);
        assignmentList.setVisibleRowCount(3);
        
        //'Delete' Button
        JButton btnDelete = new JButton("Delete");
        btnDelete.setFont(new Font("Arial", Font.PLAIN, 14));
        btnDelete.setBounds(10, 322, 315, 35);
        frmDeleteAssignment.getContentPane().add(btnDelete);
        
        //'Return to Teacher Action Center' Button
        JButton btnCancel = new JButton("Return to Teacher Action Center");
        btnCancel.setFont(new Font("Arial", Font.PLAIN, 14));
        btnCancel.setBounds(10, 368, 315, 35);
        frmDeleteAssignment.getContentPane().add(btnCancel);
        
	    //This is needed to set the index when starting the screen.
        assignmentList.setSelectedIndex(index);
 
        
	    //========================ACTIONS========================
	    
        //'Delete' button has been clicked.
        btnDelete.addMouseListener(new MouseAdapter()
        {
        	@Override
        	public void mouseReleased(MouseEvent arg0)
        	{
    			//THE USER HAS THAT AN ASSIGNMENT BE DELETED FROM THE DATABASE
    			//======UNDER CONSTRUCTION
        		
        		//The assignment is removed from the list.
        		//Selected assignment is assigned to variable 'value'.
        		Object value = assignmentList.getSelectedValue();
        		
        		//If no assignment is selected, nothing happens.
        		if (value == null)
        		{
        			
        		}
        		
        		//Otherwise, a confirmation popup appears.
        		else
        		{
        			//Assigns the selected assignment to a string for sending to the popup.
	    			String selectedAssignment = assignmentList.getSelectedValue().toString();
	    			
        			
        			//The selection index value is stored to preserve where the user's highlighted value is.
        			int index = assignmentList.getSelectedIndex();
	    			
	    			//The confirmation popup.
		    		ConfirmationPopup.display(currentClass, selectedAssignment, index);
		    		
		    		//EDIT EDIT EDIT EDIT EDIT EDIT 
		    		//AT THIS POINT WE WILL RETRIVE THE CHOICE RESULT OF THIS POPUP VIA A GETTER
		    		//EDIT EDIT EDIT EDIT EDIT EDIT 
		    		
		    		//Delete assignment window is closed.
		    		frmDeleteAssignment.dispose();
        			
            		//That assignment is removed.
            		listOfAssignments.removeElement(value);
            	    
            	    //The next assignment in the list is selected.
                    assignmentList.setSelectedIndex(index);
        		}
        		
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

	    	    }
	    	}
	    });
	    
        //'Return to Teacher Action Center' button has been clicked.
        btnCancel.addMouseListener(new MouseAdapter()
        {
        	@Override
        	public void mouseReleased(MouseEvent arg0)
        	{
	    		//Assignment deletion screen is closed.
	    		frmDeleteAssignment.dispose();
        		
        		//Returns user to teacher action center.
        		TeacherActionCenter.display(currentClass);
        		
        	}
        });
        
	    //'Enter' key is pressed while the 'Return to Teacher Action Center' button is tab-selected.
	    btnCancel.addKeyListener(new KeyAdapter()
	    {
	    	@Override
	    	public void keyPressed(KeyEvent e)
	    	{
	    		if (e.getKeyCode()==KeyEvent.VK_ENTER)
	    		{
		    		//Assignment deletion screen is closed.
		    		frmDeleteAssignment.dispose();
	        		
	        		//Returns user to teacher action center.
	        		TeacherActionCenter.display(currentClass);
	    	    }
	    	}
	    });
        
	    //========================OTHER========================
	    
	  	//IMPORTANT
	  	//This code centers the Jframe in the center of the screen upon creation.
	  	Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	  	frmDeleteAssignment.setLocation(dim.width/2-frmDeleteAssignment.getSize().width/2, dim.height/2-frmDeleteAssignment.getSize().height/2);
	  	frmDeleteAssignment.setLocationRelativeTo(null);
	  	frmDeleteAssignment.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{btnDelete, btnCancel}));
	  	
	  	//Frame is displayed.
	  	frmDeleteAssignment.setVisible(true);
	}
}
