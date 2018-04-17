
//Package
package gui;

//Imports
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.border.BevelBorder;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
//Date and Time
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

//________________________________________________________TEACHER ACTION CENTER________________________________________________________
public class TeacherActionCenter
{
	/**
	 * @wbp.parser.entryPoint
	 */
	
	//---------------------------------------------------------DISPLAY---------------------------------------------------------
	public static void display(String currentClass)
	{
		
		//========================OBJECTS========================
		
		//Jframe
		JFrame frmTeacher = new JFrame("Electronic Assignment and Attendance Guide");
		frmTeacher.setResizable(false);
	    frmTeacher.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	    frmTeacher.setSize(732,527);  
	    frmTeacher.getContentPane().setLayout(null);
	    
	    //'Take Attendance' Button
	    JButton btnTakeAttendance = new JButton("Take Attendance");
	    btnTakeAttendance.setFont(new Font("Arial", Font.PLAIN, 14));
	    btnTakeAttendance.setBounds(88, 189, 181, 41);
	    frmTeacher.getContentPane().add(btnTakeAttendance);
	    
	    //'Class Select' Button
	    JButton btnClassSelect = new JButton("Class Select");
	    btnClassSelect.setFont(new Font("Arial", Font.PLAIN, 14));
	    btnClassSelect.setBounds(10, 105, 181, 41);
	    frmTeacher.getContentPane().add(btnClassSelect);
	    
	    //'Create Assignment' Button
	    JButton btnCreateAssignment = new JButton("Create Assignment");
	    btnCreateAssignment.setFont(new Font("Arial", Font.PLAIN, 14));
	    btnCreateAssignment.setBounds(89, 256, 181, 41);
	    frmTeacher.getContentPane().add(btnCreateAssignment);
	    
	    //'Grade Assignment' Button
	    JButton btnGradeAssignment = new JButton("Grade Assignment");
	    btnGradeAssignment.setFont(new Font("Arial", Font.PLAIN, 14));
	    btnGradeAssignment.setBounds(88, 308, 181, 41);
	    frmTeacher.getContentPane().add(btnGradeAssignment);
	    
	    //'Delete Assignment' Button
	    JButton btnDeleteAssignment = new JButton("Delete Assignment");
	    btnDeleteAssignment.setFont(new Font("Arial", Font.PLAIN, 14));
	    btnDeleteAssignment.setBounds(88, 360, 181, 41);
	    frmTeacher.getContentPane().add(btnDeleteAssignment);
	    
	    //Logout Button
	    JButton btnLogout = new JButton("Log Out");
	    btnLogout.setFont(new Font("Arial", Font.PLAIN, 14));
	    btnLogout.setBounds(535, 446, 181, 41);
	    frmTeacher.getContentPane().add(btnLogout);
	    
	    //'Current Class Selected:' Label
	    JLabel lblText = new JLabel("Current Class Selected:");
	    lblText.setFont(new Font("Arial", Font.PLAIN, 14));
	    lblText.setHorizontalAlignment(SwingConstants.CENTER);
	    lblText.setBounds(214, 92, 301, 28);
	    frmTeacher.getContentPane().add(lblText);
	    
	    //Current Class Display Label
	    JLabel lblCurrentClass = new JLabel(currentClass);
	    lblCurrentClass.setFont(new Font("Tahoma", Font.PLAIN, 18));
	    lblCurrentClass.setHorizontalAlignment(SwingConstants.CENTER);
	    lblCurrentClass.setOpaque(true);
	    lblCurrentClass.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
	    lblCurrentClass.setForeground(Color.BLACK);
	    lblCurrentClass.setBackground(Color.WHITE);
	    lblCurrentClass.setBounds(214, 118, 301, 28);
	    frmTeacher.getContentPane().add(lblCurrentClass);
	    
	    //JPanel for holding our day-of-the-week, time, and date information.
	    JPanel panel = new JPanel();
	    panel.setOpaque(false);
	    panel.setBounds(573, 11, 143, 48);
	    frmTeacher.getContentPane().add(panel);
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
	    
	    //Background Image
	    JLabel lblBackgroundImage = new JLabel("");
	    lblBackgroundImage.setIcon(new ImageIcon(TeacherActionCenter.class.getResource("/images/TeacherScreenBackground.png")));
	    lblBackgroundImage.setBounds(0, -17, 743, 526);
	    frmTeacher.getContentPane().add(lblBackgroundImage);
	    
		//========================ACTIONS========================
	    
	    //'Class Select' button has been clicked.
	    //Creates a pop-up window for the user to select the class to alter.
	    btnClassSelect.addMouseListener(new MouseAdapter()
	    {
	    	@Override
	    	public void mouseReleased(MouseEvent arg0)
	    	{
	    		//Class select screen is opened.
	    		ClassSelect.display();
	    		
	    		//Teacher action center is closed.
	    		frmTeacher.dispose();
	    	}
	    });
	    
	    //'Enter' key is pressed while the 'Class Select' button is tab-selected.
	    //Creates a pop-up window for the user to select the class to alter.
	    btnClassSelect.addKeyListener(new KeyAdapter()
	    {
	    	@Override
	    	public void keyPressed(KeyEvent e)
	    	{
	    		if (e.getKeyCode()==KeyEvent.VK_ENTER)
	    		{
		    		//Class select screen is opened.
		    		ClassSelect.display();
		    		
		    		//Teacher action center is closed.
		    		frmTeacher.dispose();
	    	    }
	    	}
	    });
	    
	    //'Take Attendance' button has been clicked.
	    //Creates a pop-up window for the user to complete an attendance form.
	    btnTakeAttendance.addMouseListener(new MouseAdapter()
	    {
	    	@Override
	    	public void mouseReleased(MouseEvent arg0)
	    	{
	    		//Attendance screen is opened.
	    		Attendance.display(currentClass);
	    		
	    		//Teacher action center is closed.
	    		frmTeacher.dispose();
	    	}
	    });
	    
	    //'Enter' key is pressed while the 'Take Attendance' button is tab-selected.
	    //Creates a pop-up window for the user to complete an attendance form.
	    btnTakeAttendance.addKeyListener(new KeyAdapter()
	    {
	    	@Override
	    	public void keyPressed(KeyEvent e)
	    	{
	    		if (e.getKeyCode()==KeyEvent.VK_ENTER)
	    		{
		    		//Attendance screen is opened.
		    		Attendance.display(currentClass);
		    		
		    		//Teacher action center is closed.
		    		frmTeacher.dispose();
	    	    }
	    	}
	    });
	    
	    //'Create Assignment' button has been clicked.
	    //Creates a pop-up window for the user to complete an assignment creation form.
	    btnCreateAssignment.addMouseListener(new MouseAdapter()
	    {
	    	@Override
	    	public void mouseReleased(MouseEvent arg0)
	    	{
	    		//Assignment creation screen is opened.
	    		CreateAssignment.display(currentClass);
	    		
	    		//Teacher action center is closed.
	    		frmTeacher.dispose();
	    	}
	    });
	    
	    //'Enter' key is pressed while the 'Take Attendance' button is tab-selected.
	    //Creates a pop-up window for the user to complete an assignment creation form.
	    btnCreateAssignment.addKeyListener(new KeyAdapter()
	    {
	    	@Override
	    	public void keyPressed(KeyEvent e)
	    	{
	    		if (e.getKeyCode()==KeyEvent.VK_ENTER)
	    		{
	    			
		    		//Attendance screen is opened.
		    		Attendance.display(currentClass);
		    		
		    		//Teacher action center is closed.
		    		frmTeacher.dispose();
	    	    }
	    	}
	    });
	    
	    //'Delete Assignment' button has been clicked.
	    //Creates a pop-up window for the user to select an assignment to delete.
	    btnDeleteAssignment.addMouseListener(new MouseAdapter()
	    {
	    	@Override
	    	public void mouseReleased(MouseEvent arg0)
	    	{
    			//Don't worry about this variable. The 'Delete Assignment' class needs it.
    			int index = (0);
	    		
	    		//Assignment deletion screen is opened.
	    		DeleteAssignment.display(currentClass, index);
	    		
	    		//Teacher action center is closed.
	    		frmTeacher.dispose();
	    	}
	    });
	    
	    //'Enter' key is pressed while the 'Delete Assignment' button is tab-selected.
	    //Creates a pop-up window for the user to select an assignment to delete.
	    btnDeleteAssignment.addKeyListener(new KeyAdapter()
	    {
	    	@Override
	    	public void keyPressed(KeyEvent e)
	    	{
	    		if (e.getKeyCode()==KeyEvent.VK_ENTER)
	    		{
	    			//Don't worry about this variable. The 'Delete Assignment' class needs it.
	    			int index = (0);
	    			
		    		//Assignment deletion screen is opened.
		    		DeleteAssignment.display(currentClass, index);
		    		
		    		//Teacher action center is closed.
		    		frmTeacher.dispose();
	    	    }
	    	}
	    });
	    
	    //'Log Out' button has been clicked.
	    //Returns the user to the login screen.
	    btnLogout.addMouseListener(new MouseAdapter()
	    {
	    	@Override
	    	public void mouseReleased(MouseEvent arg0)
	    	{
	    		//Teacher action center is closed.
	    		frmTeacher.dispose();
	    		
	    		//Login screen is opened.
	    		LoginScreen.display();
	    	}
	    });
	    
	    //'Enter' key is pressed while the 'Log Out' button is tab-selected.
	    //Returns the user to the login screen.
	    btnLogout.addKeyListener(new KeyAdapter()
	    {
	    	@Override
	    	public void keyPressed(KeyEvent e)
	    	{
	    		if (e.getKeyCode()==KeyEvent.VK_ENTER){
		    		//Teacher action center is closed.
		    		frmTeacher.dispose();
		    		
		    		//Login screen is opened.
		    		LoginScreen.display();
	    	    }
	    	}
	    });
	    
		//========================OTHER========================
	    
		//IMPORTANT
	    //This code centers the Jframe in the center of the screen upon creation.
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frmTeacher.setLocation(dim.width/2-frmTeacher.getSize().width/2, dim.height/2-frmTeacher.getSize().height/2);
		frmTeacher.setLocationRelativeTo(null);
		frmTeacher.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{btnClassSelect, btnTakeAttendance, btnCreateAssignment, btnGradeAssignment, btnDeleteAssignment, btnLogout}));
	    
	    //The action buttons will not appear until the teacher selects a class to edit.
	    if(currentClass == "No Class Selected")
	    {
	    	btnTakeAttendance.setVisible(false);
	    	btnCreateAssignment.setVisible(false);
	    	btnGradeAssignment.setVisible(false);
	    	btnDeleteAssignment.setVisible(false);
	    }
		
		//Frame is displayed.
	    frmTeacher.setVisible(true);
	}
}
