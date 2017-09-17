import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Schedule {

	protected Shell shell;
	DefaultTableModel model;
	Calendar cal = new GregorianCalendar();
	JLabel lblToday;
	

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Schedule window = new Schedule();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(600, 300);
		shell.setText("Install Schedule");

	    lblToday = new JLabel();
	    lblToday.setHorizontalAlignment(SwingConstants.CENTER);
	 
	    JButton b1 = new JButton("<-");
	    b1.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent ae) {
	        cal.add(Calendar.WEEK_OF_YEAR, -1);
	        updateWeek();
	      }
	    });
	 
	    JButton b2 = new JButton("->");
	    b2.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent ae) {
	        cal.add(Calendar.WEEK_OF_YEAR, +1);
	        updateWeek();
	      }
	    });
	 
	    JPanel panel = new JPanel();
	    panel.setLayout(new BorderLayout());
	    panel.add(b1,BorderLayout.WEST);
	    panel.add(lblToday,BorderLayout.CENTER);
	    panel.add(b2,BorderLayout.EAST);
	 
	 
	    String [] columns = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
	    model = new DefaultTableModel(null,columns);
	    JTable table = new JTable(model);
	    JScrollPane pane = new JScrollPane(table);
	

	 
	    this.updateWeek();
	}

	void updateWeek() {
	
	}
}
