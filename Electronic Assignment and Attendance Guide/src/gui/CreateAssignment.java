
//Package
package gui;

//Imports
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;
//Date and Time
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

//________________________________________________________ASSIGNMENT CREATION________________________________________________________
public class CreateAssignment {
	/**
	 * @wbp.parser.entryPoint
	 */	
	
	//---------------------------------------------------------DISPLAY---------------------------------------------------------
	public static void display(String currentClass)
	{
		//========================OBJECTS========================

		//Jframe
		JFrame frmCreateAssignment = new JFrame("Assignment Creation");
		frmCreateAssignment.setResizable(false);
	    frmCreateAssignment.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	    frmCreateAssignment.setSize(793,543);
	    frmCreateAssignment.getContentPane().setLayout(null);
        
        //'Submit' Button
        JButton btnSubmit = new JButton("Submit");
        btnSubmit.setFont(new Font("Arial", Font.PLAIN, 14));
        btnSubmit.setBounds(293, 460, 127, 35);
        btnSubmit.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
        frmCreateAssignment.getContentPane().add(btnSubmit);
        
        //'Cancel' Button
        JButton btnCancel = new JButton("Cancel");
        btnCancel.setFont(new Font("Arial", Font.PLAIN, 14));
        btnCancel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
        btnCancel.setBounds(430, 460, 127, 35);
        frmCreateAssignment.getContentPane().add(btnCancel);
        
	    //JPanel for holding our day-of-the-week, time, and date information.
	    JPanel panel = new JPanel();
	    panel.setBounds(141, 455, 143, 48);
	    frmCreateAssignment.getContentPane().add(panel);
	    panel.setLayout(new BorderLayout(0, 0));
	    
	    //Getting date information for day of the week.
	    DateFormat formatDay = new SimpleDateFormat("EEEE");
	    Date dateDay = new Date();
	    //Getting date information for month/day/year.
	    DateFormat formatMonthYear = new SimpleDateFormat("LLLL dd, yyyy");
	    Date dateMonthYear = new Date();
	    //Getting date information for time.
	    DateFormat formatTime = new SimpleDateFormat("hh:mma");
	    Date dateTime = new Date();
	    
	    //Day of the Week Label
	    JLabel lblDayOfWeek = new JLabel("Today's Date:");
	    panel.add(lblDayOfWeek, BorderLayout.NORTH);
	    lblDayOfWeek.setFont(new Font("Arial", Font.BOLD, 14));
	    lblDayOfWeek.setHorizontalAlignment(SwingConstants.CENTER);
	    lblDayOfWeek.setText(formatDay.format(dateDay));
	    
	    //Time Label
	    JLabel lblTime = new JLabel("New label");
	    lblTime.setHorizontalAlignment(SwingConstants.CENTER);
	    panel.add(lblTime, BorderLayout.CENTER);
	    lblTime.setFont(new Font("Arial", Font.BOLD, 14));
	    lblTime.setText(formatTime.format(dateTime));
	    
	    //Month Day, Year Label
	    JLabel lblMonthDayYear = new JLabel("New label");
	    panel.add(lblMonthDayYear, BorderLayout.SOUTH);
	    lblMonthDayYear.setFont(new Font("Arial", Font.BOLD, 14));
	    lblMonthDayYear.setHorizontalAlignment(SwingConstants.CENTER);
	    lblMonthDayYear.setText(formatMonthYear.format(dateMonthYear));
        
        //========================ACTIONS========================
	    
        //'Submit' button has been clicked.
        btnSubmit.addMouseListener(new MouseAdapter()
        {
        	@Override
        	public void mouseReleased(MouseEvent arg0)
        	{
    			//THE USER HAS SUBMITTED THE INFORMATION TO THE DATABASE
    			//======UNDER CONSTRUCTION
        		
        	}
        });
        
	    //'Enter' key is pressed while the 'Submit' button is tab-selected.
	    btnSubmit.addKeyListener(new KeyAdapter()
	    {
	    	@Override
	    	public void keyPressed(KeyEvent e)
	    	{
	    		if (e.getKeyCode()==KeyEvent.VK_ENTER)
	    		{
	    			//THE USER HAS SUBMITTED THE INFORMATION TO THE DATABASE
	    			//======UNDER CONSTRUCTION
	    	    }
	    	}
	    });
	    
        //'Cancel' button has been clicked.
        btnCancel.addMouseListener(new MouseAdapter()
        {
        	@Override
        	public void mouseReleased(MouseEvent arg0)
        	{
	    		//Assignment creation screen is closed.
	    		frmCreateAssignment.dispose();
        		
        		//Returns user to teacher action center without creating an assignment.
        		TeacherActionCenter.display(currentClass);
        		
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
		    		//Assignment creation screen is closed.
		    		frmCreateAssignment.dispose();
	        		
	        		//Returns user to teacher action center without creating an assignment.
	        		TeacherActionCenter.display(currentClass);
	    	    }
	    	}
	    });
	    
	    //========================OTHER========================
	    
	  	//IMPORTANT
	  	//This code centers the Jframe in the center of the screen upon creation.
	  	Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	  	frmCreateAssignment.setLocation(dim.width/2-frmCreateAssignment.getSize().width/2, dim.height/2-frmCreateAssignment.getSize().height/2);
	  	frmCreateAssignment.setLocationRelativeTo(null);

	  	//Frame is displayed.
	  	frmCreateAssignment.setVisible(true);
	}
}
