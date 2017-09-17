import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
 
public class testCal extends JFrame {
 
  DefaultTableModel model;
  Calendar cal = new GregorianCalendar();
  JLabel lblToday;
  JTextArea txtOutput;
 
  testCal() {
 
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("Swing Calandar");
    this.setSize(600,300);
    this.setLayout(new BorderLayout());
    this.setVisible(true);
 
 
    lblToday = new JLabel();
    lblToday.setHorizontalAlignment(SwingConstants.CENTER);
    
    txtOutput = new JTextArea();

    txtOutput.setText("Hello");

 
    JButton b1 = new JButton("<-");
    b1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        cal.add(Calendar.DAY_OF_YEAR, -1);
        updateCal();
      }
    });
 
    JButton b2 = new JButton("->");
    b2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        cal.add(Calendar.DAY_OF_YEAR, +1);
        updateCal();
      }
    });
 
    JPanel panel = new JPanel();
    panel.setLayout(new BorderLayout());
    panel.add(b1,BorderLayout.WEST);
    panel.add(lblToday,BorderLayout.CENTER);
    panel.add(b2,BorderLayout.EAST);
    JPanel panel1 = new JPanel();
    panel1.setLayout(new BorderLayout());
    panel1.add(txtOutput,BorderLayout.SOUTH);
 
 
    String [] columns = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
    model = new DefaultTableModel(null,columns);
    JTable table = new JTable(model);
    JScrollPane pane = new JScrollPane(table);
 
    this.add(panel,BorderLayout.NORTH);
    this.add(pane,BorderLayout.CENTER);
    this.add(panel1,BorderLayout.SOUTH);
 
    this.updateCal();
 
  }
 
  
  void updateCal() {
	    cal.set(Calendar.DAY_OF_YEAR, 1);
	 
	    String month = cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.US);
	    int year = cal.get(Calendar.YEAR);
	    lblToday.setText(month + " " + year);
	 
	    int startDay = cal.get(Calendar.DAY_OF_WEEK);
	    int numberOfDays = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
	    int weeks = cal.getActualMaximum(Calendar.WEEK_OF_MONTH);
	    
	    String hh = "jhcjds" + "\r"+ "sdf"+ month + System.lineSeparator() + month;
	    System.out.println("jhcjds" + "\r"+ "sdf"+ month + System.lineSeparator() + month);
	    System.out.println(""+ year);
	    System.out.println(lblToday.getText());
	    System.out.println(""+ startDay);
	    System.out.println(""+ numberOfDays);
	    System.out.println(""+ weeks);

	 
	    model.setRowCount(0);
	    model.setRowCount(weeks);
	 
	    int i = startDay-1;
	    for(int day=1;day<=numberOfDays;day++){
	      model.setValueAt(day, i/7 , i%7 );    
	      i = i + 1;
	    }
	 
	    txtOutput.setText(hh);
	  }
  
  
  
  
  
  void updateWeek() {
	  
	  cal.set(Calendar.WEEK_OF_YEAR, cal.getFirstDayOfWeek());
	  
	  String day1 = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US);
	  String day2 = cal.getDisplayName(Calendar.DATE, Calendar.LONG, Locale.US);
	  String day3 = cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.US);
	  

	  
	  	cal.set(Calendar.DAY_OF_WEEK_IN_MONTH, Calendar.MONTH);
	  
		  String date1 = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US);
		  String date2 = cal.getDisplayName(Calendar.DATE, Calendar.LONG, Locale.US);
		  String date3 = cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.US);
		  

	  
/*	  	  
	  cal.set(Calendar.DAY_OF_WEEK_IN_MONTH, Calendar.MONTH);
	  
	  
	//    cal.set(Calendar.WEEK_OF_YEAR, Calendar.MONTH);
	 
	    String day = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US);
	    String month = cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.US);
	    int year = cal.get(Calendar.YEAR);
	    lblToday.setText(day + " "  + month + " " + year);
	 
	    
	    cal.set(Calendar.DAY_OF_WEEK, cal.getFirstDayOfWeek());	    
	    
	    int startDay = cal.getFirstDayOfWeek();	
	    int numberOfDays = 7;  //cal.getActualMaximum(Calendar.DAY_OF_MONTH);
	    int weeks = cal.getActualMaximum(Calendar.WEEK_OF_YEAR);
	    int week = cal.get(Calendar.WEEK_OF_YEAR);
	    	    
	    System.out.println(""+ day);
	    System.out.println(""+ month);
	    System.out.println(""+ year);
	    System.out.println(lblToday.getText());
	    System.out.println(""+ startDay);
	    System.out.println(""+ numberOfDays);
	    System.out.println(""+ weeks);
	    System.out.println(""+ week);

	 
//	    model.setRowCount(1);
	    model.setRowCount(10);
	 
	    int i = startDay;
	    for(int today=1;today<=numberOfDays;today++){
	      model.setValueAt(today, i/7 , i%7 );    
	      i = i + 1;
	    
	    }
  */
  }
  
  void updateMonth() {
    cal.set(Calendar.DAY_OF_MONTH, 1);
 
    String month = cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.US);
    int year = cal.get(Calendar.YEAR);
    lblToday.setText(month + " " + year);
 
    int startDay = cal.get(Calendar.DAY_OF_WEEK);
    int numberOfDays = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
    int weeks = cal.getActualMaximum(Calendar.WEEK_OF_MONTH);
 
    model.setRowCount(0);
    model.setRowCount(weeks);
 
    int i = startDay-1;
    for(int day=1;day<=numberOfDays;day++){
      model.setValueAt(day, i/7 , i%7 );    
      i = i + 1;
    }
 
  }
 
  public static void main(String[] arguments) {
    JFrame.setDefaultLookAndFeelDecorated(true);
    testCal sc = new testCal();
  }
 
}