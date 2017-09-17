import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;

import org.eclipse.swt.graphics.Image;

import java.io.File;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.custom.TableCursor;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.jface.viewers.TableViewer;

public class SchedulePrototype {

	protected Shell shell;
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	private Table table;
	private Text text;
	private Text text_1;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			SchedulePrototype window = new SchedulePrototype();
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
		
	    Image small = new Image(display,"src/resources/icon64W.jpg");    
	    shell.setImage(small);
	    
	    Button btnSales = new Button(shell, SWT.NONE);
	    btnSales.setText("SALES");
	    btnSales.setBounds(181, 22, 161, 25);
	    formToolkit.adapt(btnSales, true, true);
	    
	    Button btnInstalls = new Button(shell, SWT.NONE);
	    btnInstalls.addSelectionListener(new SelectionAdapter() {
	    	@Override
	    	public void widgetSelected(SelectionEvent e) {
	    	}
	    });
	    btnInstalls.setText("INSTALLS");
	    btnInstalls.setBounds(353, 22, 161, 25);
	    formToolkit.adapt(btnInstalls, true, true);
	    
	    Button btnPermits = new Button(shell, SWT.NONE);
	    btnPermits.addSelectionListener(new SelectionAdapter() {
	    	@Override
	    	public void widgetSelected(SelectionEvent e) {
	    	}
	    });
	    btnPermits.setText("PERMITS");
	    btnPermits.setBounds(520, 22, 161, 25);
	    formToolkit.adapt(btnPermits, true, true);
	    
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
		shell.setSize(700, 600);
		shell.setText("West City Heating WorkFlow");

		Button btnSchedule = new Button(shell, SWT.NONE);
		btnSchedule.setText("SCHEDULE");
		btnSchedule.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnSchedule.setBounds(10, 22, 161, 25);
		
		
		
		TabFolder tabFolder = new TabFolder(shell, SWT.NONE);
		tabFolder.setBounds(10, 79, 645, 420);
		
		TabItem tbtmNewItem_1 = new TabItem(tabFolder, SWT.NONE);
		tbtmNewItem_1.setText("Install Schedule");
		
		Composite composite_1 = new Composite(tabFolder, SWT.NONE);
		tbtmNewItem_1.setControl(composite_1);
		

		
		table = new Table(composite_1, SWT.BORDER | SWT.FULL_SELECTION);
		table.setBounds(7, 0, 627, 350);
		formToolkit.adapt(table);
		formToolkit.paintBordersFor(table);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		TableColumn tblclmnNewColumn_7 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn_7.setWidth(100);
		tblclmnNewColumn_7.setText("Installer");
		
		TableColumn tblclmnNewColumn = new TableColumn(table, SWT.CENTER);
		tblclmnNewColumn.setResizable(false);
		tblclmnNewColumn.setWidth(50);
		tblclmnNewColumn.setText("Sun");
		
		TableColumn tblclmnNewColumn_1 = new TableColumn(table, SWT.CENTER);
		tblclmnNewColumn_1.setResizable(false);
		tblclmnNewColumn_1.setWidth(80);
		tblclmnNewColumn_1.setText("Monday");
		
		TableColumn tblclmnNewColumn_2 = new TableColumn(table, SWT.CENTER);
		tblclmnNewColumn_2.setResizable(false);
		tblclmnNewColumn_2.setWidth(80);
		tblclmnNewColumn_2.setText("Tuesday");
		
		TableColumn tblclmnNewColumn_3 = new TableColumn(table, SWT.CENTER);
		tblclmnNewColumn_3.setResizable(false);
		tblclmnNewColumn_3.setWidth(80);
		tblclmnNewColumn_3.setText("Wednesday");
		
		TableColumn tblclmnNewColumn_4 = new TableColumn(table, SWT.CENTER);
		tblclmnNewColumn_4.setResizable(false);
		tblclmnNewColumn_4.setWidth(80);
		tblclmnNewColumn_4.setText("Thursday");
		
		TableColumn tblclmnNewColumn_5 = new TableColumn(table, SWT.CENTER);
		tblclmnNewColumn_5.setResizable(false);
		tblclmnNewColumn_5.setWidth(80);
		tblclmnNewColumn_5.setText("Friday");
		
		TableColumn tblclmnNewColumn_6 = new TableColumn(table, SWT.CENTER);
		tblclmnNewColumn_6.setResizable(false);
		tblclmnNewColumn_6.setWidth(50);
		tblclmnNewColumn_6.setText("Sat");
		
		TableCursor tableCursor = new TableCursor(table, SWT.NONE);
		formToolkit.adapt(tableCursor);
		formToolkit.paintBordersFor(tableCursor);
		
		TableItem tableItem = new TableItem(table, SWT.NONE);
		tableItem.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
		tableItem.setText("Greg       AM");
		
		TableItem tableItem_1 = new TableItem(table, SWT.NONE);
		tableItem_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
		tableItem_1.setText("Greg       PM");
		
		TableItem tableItem_2 = new TableItem(table, SWT.NONE);
		tableItem_2.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_NORMAL_SHADOW));
		tableItem_2.setText("Scott      AM");
		
		TableItem tableItem_3 = new TableItem(table, SWT.NONE);
		tableItem_3.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_NORMAL_SHADOW));
		tableItem_3.setText("Scott      PM");
		
		TableItem tableItem_4 = new TableItem(table, SWT.NONE);
		tableItem_4.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
		tableItem_4.setText("Darren    AM");
		
		TableItem tableItem_5 = new TableItem(table, SWT.NONE);
		tableItem_5.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
		tableItem_5.setText("Darren    PM");
		
		Button btnNextWeek = new Button(composite_1, SWT.NONE);
		btnNextWeek.setBounds(502, 356, 125, 25);
		btnNextWeek.setText("NEXT WEEK");
		formToolkit.adapt(btnNextWeek, true, true);
		
		Button btnLastWeek = new Button(composite_1, SWT.NONE);
		btnLastWeek.setBounds(7, 356, 125, 25);
		btnLastWeek.setText("PREVIOUS WEEK");
		formToolkit.adapt(btnLastWeek, true, true);

//		formToolkit.adapt(text, true, true);
		
	//	TabItem tbtmNewItem_3 = new TabItem(tabFolder, SWT.NONE);
	//	tbtmNewItem_3.setText("Receive Orders");
		
		
		Composite composite_3 = new Composite(tabFolder, SWT.NONE);
//		tbtmReceiveOrders.setControl(composite_3);
		
		Composite composite_7 = new Composite(tabFolder, SWT.NONE);
	//	tbtmReceiveOrders.setControl(composite_7);
		formToolkit.paintBordersFor(composite_7);
		
		Button btnSaveComment = new Button(composite_3, SWT.NONE);
		btnSaveComment.setText("Save Follow Up");
		btnSaveComment.setBounds(417, 357, 195, 25);
		formToolkit.adapt(btnSaveComment, true, true);
		
		Combo combo_1 = new Combo(composite_3, SWT.NONE);
		combo_1.setItems(new String[] {"Purchase Order", "Product", "Invoice"});
		combo_1.setBounds(65, 10, 122, 23);
		formToolkit.adapt(combo_1);
		formToolkit.paintBordersFor(combo_1);
		combo_1.setText("Purchase Order\r\nProduct\r\nInvoice");
		combo_1.select(0);
		
		Label lblSearchBy = new Label(composite_3, SWT.NONE);
		lblSearchBy.setText("Search By:");
		lblSearchBy.setBounds(10, 13, 55, 15);
		formToolkit.adapt(lblSearchBy, true, true);
		
		List list = new List(composite_3, SWT.BORDER);
		list.setItems(new String[] {"1602       JAY-FR300CABKM6       JAYLINE FR300 FS C/A MET BLACK WITH ASHPAN (NEW)     4233    John & Mary Smith     52 Halifax Street", "1602       JAY-SPTFSCABKS3        JAYLINE SPITFIRE FS C/A BLACK 19KW                                       4237    Joe Bloggs                    2 Sandford Rise ", "1604       HTH-BETHIAN              BETHIAN HEARTH ASH - S/S TRIM - TILES - CORNER             4233    John & Mary Smith     52 Halifax Street", "1605       3063                                Woodsman FLARE - BOX (Charcoal/Pewter)                              4241    Kay Hall                        28 Becroft Lane          ", "", "", "", "", "                        List of orders not yet received"});
		list.setBounds(10, 39, 613, 238);
		formToolkit.adapt(list, true, true);
		
		TabItem tbtmSiteChecks = new TabItem(tabFolder, SWT.NONE);
		tbtmSiteChecks.setText("Site Checks");
		
		Composite composite = new Composite(tabFolder, SWT.NONE);
		tbtmSiteChecks.setControl(composite);
		formToolkit.paintBordersFor(composite);
		
		List list_1 = new List(composite, SWT.BORDER);
		list_1.setItems(new String[] {"16/05/2017  09:00    John & Mary Smith     52 Halifax Street   Solomon", "16/05/2017  10:00    Joe Bloggs                    2 Sandford Rise    Solomon", "17/05/2017  09:00    Kay Hall                        28 Becroft Lane    Greg", "", "", "", "      List of people who have Site Checks booked"});
		list_1.setBounds(10, 12, 366, 370);
		formToolkit.adapt(list_1, true, true);
		
		Label label = new Label(composite, SWT.NONE);
		label.setText("Comment");
		label.setBounds(382, 219, 64, 15);
		formToolkit.adapt(label, true, true);
		
		text = new Text(composite, SWT.BORDER);
		text.setBounds(468, 219, 144, 48);
		formToolkit.adapt(text, true, true);
		
		text_1 = new Text(composite, SWT.BORDER);
		text_1.setEditable(false);
		text_1.setBounds(468, 12, 144, 203);
		formToolkit.adapt(text_1, true, true);
		
		Label label_1 = new Label(composite, SWT.NONE);
		label_1.setText("Name:");
		label_1.setBounds(382, 10, 35, 15);
		formToolkit.adapt(label_1, true, true);
		
		Label label_2 = new Label(composite, SWT.NONE);
		label_2.setText("Site Address:");
		label_2.setBounds(382, 30, 67, 15);
		formToolkit.adapt(label_2, true, true);
		
		Label label_3 = new Label(composite, SWT.NONE);
		label_3.setText("Suburb:");
		label_3.setBounds(382, 50, 41, 15);
		formToolkit.adapt(label_3, true, true);
		
		Label label_4 = new Label(composite, SWT.NONE);
		label_4.setText("Postal Address:");
		label_4.setBounds(382, 70, 80, 15);
		formToolkit.adapt(label_4, true, true);
		
		Label label_5 = new Label(composite, SWT.NONE);
		label_5.setText("Suburb:");
		label_5.setBounds(382, 90, 41, 15);
		formToolkit.adapt(label_5, true, true);
		
		Label label_6 = new Label(composite, SWT.NONE);
		label_6.setText("Mobile:");
		label_6.setBounds(382, 110, 41, 15);
		formToolkit.adapt(label_6, true, true);
		
		Label label_7 = new Label(composite, SWT.NONE);
		label_7.setText("Phone:");
		label_7.setBounds(382, 131, 41, 15);
		formToolkit.adapt(label_7, true, true);
		
		Label label_8 = new Label(composite, SWT.NONE);
		label_8.setText("Email:");
		label_8.setBounds(382, 153, 32, 15);
		formToolkit.adapt(label_8, true, true);
		
		Label label_9 = new Label(composite, SWT.NONE);
		label_9.setText("Fire:");
		label_9.setBounds(382, 174, 67, 15);
		formToolkit.adapt(label_9, true, true);
		
		Label label_10 = new Label(composite, SWT.NONE);
		label_10.setText("Install Type:");
		label_10.setBounds(382, 198, 64, 15);
		formToolkit.adapt(label_10, true, true);
		
		TabItem tabItem = new TabItem(tabFolder, SWT.NONE);
		tabItem.setText("New Item");
		
		Composite composite_2 = new Composite(tabFolder, SWT.NONE);
		tabItem.setControl(composite_2);
		formToolkit.paintBordersFor(composite_2);
		

			
	
		
		

	}
}
