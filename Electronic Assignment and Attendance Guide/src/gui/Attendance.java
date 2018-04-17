
//Package
package gui;

//Imports
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import org.eclipse.wb.swing.FocusTraversalOnArray;
//Date and Time
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

//________________________________________________________CLASS SELECT________________________________________________________
public class Attendance {
	/**
	 * @wbp.parser.entryPoint
	 */	
	
	//---------------------------------------------------------DISPLAY---------------------------------------------------------
	public static void display(String currentClass)
	{
		//========================OBJECTS========================

		//Jframe
		JFrame frmAttendance = new JFrame("Class Select");
		frmAttendance.setResizable(false);
	    frmAttendance.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	    frmAttendance.setSize(793,543);
	    frmAttendance.getContentPane().setLayout(null);
	    
	    //This is the list which contains all of the students belonging to a teacher's individual class.
	    DefaultListModel<Object> listOfPresentStudents = new DefaultListModel<Object>();
	    
	    //TEMPORARY TEMPORARY TEMPORARY TEMPORARY TEMPORARY TEMPORARY TEMPORARY TEMPORARY TEMPORARY TEMPORARY 
	    //Pre-filled student list values.
	    //This is where a query will eventually retrieve a class's students.
	    listOfPresentStudents.addElement("Gregory Hamilton");
	    listOfPresentStudents.addElement("Jane Salamander");
	    listOfPresentStudents.addElement("Suzy Smith");
	    listOfPresentStudents.addElement("Emmy Winter");
	    listOfPresentStudents.addElement("Joe Conway");
	    listOfPresentStudents.addElement("Edgar Wright");
	    listOfPresentStudents.addElement("Ricky Dane");
	    listOfPresentStudents.addElement("Sam Hanes");
	    listOfPresentStudents.addElement("Poppy Fredricton");
	    listOfPresentStudents.addElement("John Johhny");
	    listOfPresentStudents.addElement("Elly Rightman");
	    listOfPresentStudents.addElement("Ernie Wheeler");
	    listOfPresentStudents.addElement("Larry Peters");
	    listOfPresentStudents.addElement("Hal Dodgers");
	    listOfPresentStudents.addElement("Wendy Julies");
	    listOfPresentStudents.addElement("Esther Ruby");
	    listOfPresentStudents.addElement("Henry McLarson");
	    listOfPresentStudents.addElement("Quincy Smitht");
	    frmAttendance.getContentPane().setLayout(null);
	    
	    DefaultListModel<Object> listOfAbsentStudents = new DefaultListModel<Object>();
	    
	    DefaultListModel<Object> listOfTardyStudents = new DefaultListModel<Object>();
	    
	    //'Present' Label
	    JLabel lblAbsent = new JLabel("Present");
	    lblAbsent.setFont(new Font("Arial", Font.PLAIN, 14));
	    lblAbsent.setHorizontalAlignment(SwingConstants.CENTER);
	    lblAbsent.setBounds(92, 11, 69, 23);
	    frmAttendance.getContentPane().add(lblAbsent);
	    
	    //'Present' Scroll Pane
	    JScrollPane scrollPanePresent = new JScrollPane();
	    scrollPanePresent.setBounds(25, 32, 227, 348);
	    frmAttendance.getContentPane().add(scrollPanePresent);
	
	    //'Present' JList
	    JList<Object> listPresent = new JList<Object>(listOfPresentStudents);
	    listPresent.setFont(new Font("Arial", Font.PLAIN, 16));
	    listPresent.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
	    scrollPanePresent.setViewportView(listPresent);
	    listPresent.setBackground(Color.WHITE);
        listPresent.setSelectedIndex(0);
        listPresent.setVisibleRowCount(3);
        
        //'Absent' Label
        JLabel lblPresent = new JLabel("Absent");
        lblPresent.setFont(new Font("Arial", Font.PLAIN, 14));
        lblPresent.setHorizontalAlignment(SwingConstants.CENTER);
        lblPresent.setBounds(631, 11, 69, 23);
        frmAttendance.getContentPane().add(lblPresent);
        
        //'Absent' Scroll Pane
        JScrollPane scrollPaneAbsent = new JScrollPane();
        scrollPaneAbsent.setBounds(567, 32, 200, 140);
        frmAttendance.getContentPane().add(scrollPaneAbsent);
        
        //'Absent' JList
        JList<Object> listAbsent = new JList<Object>(listOfAbsentStudents);
        scrollPaneAbsent.setViewportView(listAbsent);
        
        //'Tardy' Label
        JLabel lblTardy = new JLabel("Tardy");
        lblTardy.setFont(new Font("Arial", Font.PLAIN, 14));
        lblTardy.setHorizontalAlignment(SwingConstants.CENTER);
        lblTardy.setBounds(643, 191, 69, 23);
        frmAttendance.getContentPane().add(lblTardy);
        
        //'Tardy' Scroll Pane
        JScrollPane scrollPaneTardy = new JScrollPane();
        scrollPaneTardy.setBounds(567, 217, 207, 163);
        frmAttendance.getContentPane().add(scrollPaneTardy);
        
        //'Tardy' JList
        JList<Object> listTardy = new JList<Object>(listOfTardyStudents);
        scrollPaneTardy.setViewportView(listTardy);
        listTardy.setVisibleRowCount(3);
        
        //'Set Absent' Button
        JButton btnSetAbsent = new JButton("Set Absent ->");
        btnSetAbsent.setFont(new Font("Arial", Font.PLAIN, 14));
        btnSetAbsent.setBounds(262, 123, 127, 46);
        frmAttendance.getContentPane().add(btnSetAbsent);
        
        //'Set Present' Button for Tardy
        JButton btnSetTardyToPresent = new JButton("<- Set Present");
        btnSetTardyToPresent.setFont(new Font("Arial", Font.PLAIN, 14));
        btnSetTardyToPresent.setBounds(408, 334, 149, 46);
        frmAttendance.getContentPane().add(btnSetTardyToPresent);
        
        //'Set Present' Button for Absent
        JButton btnSetAbsentToPresent = new JButton("<- Set Present");
        btnSetAbsentToPresent.setFont(new Font("Arial", Font.PLAIN, 14));
        btnSetAbsentToPresent.setBounds(408, 32, 149, 46);
        frmAttendance.getContentPane().add(btnSetAbsentToPresent);
        
        //'Set Tardy' Button
        JButton btnSetTardy = new JButton("Set Tardy ->");
        btnSetTardy.setFont(new Font("Arial", Font.PLAIN, 14));
        btnSetTardy.setBounds(262, 217, 127, 45);
        frmAttendance.getContentPane().add(btnSetTardy);
        
        //'Submit' Button
        JButton btnSubmit = new JButton("Submit");
        btnSubmit.setFont(new Font("Arial", Font.PLAIN, 14));
        btnSubmit.setBounds(293, 460, 127, 35);
        btnSubmit.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
        frmAttendance.getContentPane().add(btnSubmit);
        
        //'Cancel' Button
        JButton btnCancel = new JButton("Cancel");
        btnCancel.setFont(new Font("Arial", Font.PLAIN, 14));
        btnCancel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
        btnCancel.setBounds(430, 460, 127, 35);
        frmAttendance.getContentPane().add(btnCancel);
        
	    //JPanel for holding our day-of-the-week, time, and date information.
	    JPanel panel = new JPanel();
	    panel.setBounds(141, 455, 143, 48);
	    frmAttendance.getContentPane().add(panel);
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
        
        //'Set Absent To Present' button has been clicked.
        btnSetAbsentToPresent.addMouseListener(new MouseAdapter()
        {
        	@Override
        	public void mouseReleased(MouseEvent arg0)
        	{
        		//Selected student is assigned to variable 'value'.
        		Object value = listAbsent.getSelectedValue();
        		
        		//If no student is selected, nothing happens.
        		if (value == null)
        		{
        			
        		}
        		
        		//Otherwise, the student is moved.
        		else
        		{
        			//The selection index value is stored to preserve where the user's highlighted value is.
        			int index = listAbsent.getSelectedIndex();
        			
            		//That student is removed from 'Absent'.
            		listOfAbsentStudents.removeElement(value);
            		
            		//That student is added to 'Present'.
            	    listOfPresentStudents.addElement(value);
            	    
            	    //The next student in the list is selected.
                    listAbsent.setSelectedIndex(index);
        		}

        	}		
        	
        });
        
	    //'Enter' key is pressed while the 'Set Absent To Present' button is tab-selected.
	    btnSetAbsent.addKeyListener(new KeyAdapter()
	    {
	    	@Override
	    	public void keyPressed(KeyEvent e)
	    	{
	    		if (e.getKeyCode()==KeyEvent.VK_ENTER)
	    		{
	        		//Selected student is assigned to variable 'value'.
	        		Object value = listAbsent.getSelectedValue();
	        		
	        		//If no student is selected, nothing happens.
	        		if (value == null)
	        		{
	        			
	        		}
	        		
	        		//Otherwise, the student is moved.
	        		else
	        		{
	           			//The selection index value is stored to preserve where the user's highlighted value is.
	        			int index = listAbsent.getSelectedIndex();
	        			
	            		//That student is removed from 'Absent'.
	            		listOfAbsentStudents.removeElement(value);
	            		
	            		//That student is added to 'Present'.
	            	    listOfPresentStudents.addElement(value);
	            	    
	            	    //The next student in the list is selected.
	                    listAbsent.setSelectedIndex(index);
	        		}
	    	    }
	    	}
	    });
        
        //'Set Absent' button has been clicked.
        btnSetAbsent.addMouseListener(new MouseAdapter()
        {
        	@Override
        	public void mouseReleased(MouseEvent arg0)
        	{
        		//Selected student is assigned to variable 'value'.
        		Object value = listPresent.getSelectedValue();
        		
        		//If no student is selected, nothing happens.
        		if (value == null)
        		{
        			
        		}
        		
        		//Otherwise, the student is moved.
        		else
        		{
        			//The selection index value is stored to preserve where the user's highlighted value is.
        			int index = listPresent.getSelectedIndex();
        			
            		//That student is removed from 'Present'.
            		listOfPresentStudents.removeElement(value);
            		
            		//That student is added to 'Absent'.
            	    listOfAbsentStudents.addElement(value);
            	    
            	    //The next student in the 'Present' list is selected.
                    listPresent.setSelectedIndex(index);
                    
        			//Give the 'Absent' list a selection. (This just looks nice.)
        	        listAbsent.setSelectedIndex(0);
        		}

        	}		
        	
        });
        
	    //'Enter' key is pressed while the 'Set Absent' button is tab-selected.
	    btnSetAbsent.addKeyListener(new KeyAdapter()
	    {
	    	@Override
	    	public void keyPressed(KeyEvent e)
	    	{
        		//Selected student is assigned to variable 'value'.
        		Object value = listPresent.getSelectedValue();
        		
        		//If no student is selected, nothing happens.
        		if (value == null)
        		{
        			
        		}
        		
        		//Otherwise, the student is moved.
        		else
        		{
        			//The selection index value is stored to preserve where the user's highlighted value is.
        			int index = listPresent.getSelectedIndex();
        			
            		//That student is removed from 'Present'.
            		listOfPresentStudents.removeElement(value);
            		
            		//That student is added to 'Absent'.
            	    listOfAbsentStudents.addElement(value);
            	    
            	    //The next student in the 'Present' list is selected.
                    listPresent.setSelectedIndex(index);
                    
        			//Give the 'Absent' list a selection. (This just looks nice.)
        	        listAbsent.setSelectedIndex(0);
        		}
	    	}
	    });
	    
        //'Set Tardy' button has been clicked.
        btnSetTardy.addMouseListener(new MouseAdapter()
        {
        	@Override
        	public void mouseReleased(MouseEvent arg0)
        	{
        		//Selected student is assigned to variable 'value'.
        		Object value = listPresent.getSelectedValue();
        		
        		//If no student is selected, nothing happens.
        		if (value == null)
        		{
        			
        		}
        		
        		//Otherwise, the student is moved.
        		else
        		{
        			//The selection index value is stored to preserve where the user's highlighted value is.
        			int index = listPresent.getSelectedIndex();
        			
            		//That student is removed from 'Present'.
            		listOfPresentStudents.removeElement(value);
            		
            		//That student is added to 'Tardy'.
            	    listOfTardyStudents.addElement(value);
            	    
            	    //The next student in the 'Present' list is selected.
                    listPresent.setSelectedIndex(index);
                    
        			//Give the 'Tardy' list a selection. (This just looks nice.)
        	        listTardy.setSelectedIndex(0);
        		}

        	}		
        	
        });
        
	    //'Enter' key is pressed while the 'Set Tardy' button is tab-selected.
	    btnSetTardy.addKeyListener(new KeyAdapter()
	    {
	    	@Override
	    	public void keyPressed(KeyEvent e)
	    	{
        		//Selected student is assigned to variable 'value'.
        		Object value = listPresent.getSelectedValue();
        		
        		//If no student is selected, nothing happens.
        		if (value == null)
        		{
        			
        		}
        		
        		//Otherwise, the student is moved.
        		else
        		{
        			//The selection index value is stored to preserve where the user's highlighted value is.
        			int index = listPresent.getSelectedIndex();
        			
            		//That student is removed from 'Present'.
            		listOfPresentStudents.removeElement(value);
            		
            		//That student is added to 'Tardy'.
            	    listOfTardyStudents.addElement(value);
            	    
            	    //The next student in the 'Present' list is selected.
                    listPresent.setSelectedIndex(index);
                    
        			//Give the 'Tardy' list a selection. (This just looks nice.)
        	        listTardy.setSelectedIndex(0);
        		}
	    	}
	    });
	    
        //'Set Tardy To Present' button has been clicked.
        btnSetTardyToPresent.addMouseListener(new MouseAdapter()
        {
        	@Override
        	public void mouseReleased(MouseEvent arg0)
        	{
        		//Selected student is assigned to variable 'value'.
        		Object value = listTardy.getSelectedValue();
        		
        		//If no student is selected, nothing happens.
        		if (value == null)
        		{
        			
        		}
        		
        		//Otherwise, the student is moved.
        		else
        		{
        			//The selection index value is stored to preserve where the user's highlighted value is.
        			int index = listTardy.getSelectedIndex();
        			
            		//That student is removed from 'Tardy'.
            		listOfTardyStudents.removeElement(value);
            		
            		//That student is added to 'Present'.
            	    listOfPresentStudents.addElement(value);
            	    
            	    //The next student in the list is selected.
                    listTardy.setSelectedIndex(index);
        		}

        	}		
        	
        });
        
	    //'Enter' key is pressed while the 'Set Tardy To Present' button is tab-selected.
	    btnSetTardy.addKeyListener(new KeyAdapter()
	    {
	    	@Override
	    	public void keyPressed(KeyEvent e)
	    	{
	    		if (e.getKeyCode()==KeyEvent.VK_ENTER)
	    		{
	        		//Selected student is assigned to variable 'value'.
	        		Object value = listTardy.getSelectedValue();
	        		
	        		//If no student is selected, nothing happens.
	        		if (value == null)
	        		{
	        			
	        		}
	        		
	        		//Otherwise, the student is moved.
	        		else
	        		{
	        			//The selection index value is stored to preserve where the user's highlighted value is.
	        			int index = listTardy.getSelectedIndex();
	        			
	            		//That student is removed from 'Tardy'.
	            		listOfTardyStudents.removeElement(value);
	            		
	            		//That student is added to 'Present'.
	            	    listOfPresentStudents.addElement(value);
	            	    
	            	    //The next student in the list is selected.
	                    listTardy.setSelectedIndex(index);
	        		}
	    	    }
	    	}
	    });
	    
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
	    		//Attendance screen is closed.
	    		frmAttendance.dispose();
        		
        		//Returns user to teacher action center with no changes to attendance.
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
		    		//Attendance screen is closed.
		    		frmAttendance.dispose();
	        		
	        		//Returns user to teacher action center with no changes to attendance.
	        		TeacherActionCenter.display(currentClass);
	    	    }
	    	}
	    });
	    
	    //========================OTHER========================
	    
	  	//IMPORTANT
	  	//This code centers the Jframe in the center of the screen upon creation.
	  	Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	  	frmAttendance.setLocation(dim.width/2-frmAttendance.getSize().width/2, dim.height/2-frmAttendance.getSize().height/2);
	  	frmAttendance.setLocationRelativeTo(null);
	  	
	  	//Tab-traversal priority list.
	  	frmAttendance.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{btnSetAbsentToPresent, btnSetAbsent, btnSetTardy, btnSetTardyToPresent, btnSubmit, btnCancel}));
	  	
	  	//Frame is displayed.
	  	frmAttendance.setVisible(true);
	}
}
