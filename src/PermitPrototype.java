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

public class PermitPrototype {

	protected Shell shell;
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	private Text text_5;
	private Text text_2;
	private Text text_8;
	private Text text_9;
	private Text text_10;
	private Text text_11;
	private Text text_12;
	private Text text_14;
	private Text text_1;
	private Text text;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			PermitPrototype window = new PermitPrototype();
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
		tbtmNewItem_1.setText("Permits Required");
		
		Composite composite_1 = new Composite(tabFolder, SWT.NONE);
		tbtmNewItem_1.setControl(composite_1);
		
		Composite composite_4 = new Composite(composite_1, SWT.NONE);
		composite_4.setBounds(0, 0, 637, 392);
		
		List list_2 = new List(composite_4, SWT.BORDER);
		list_2.setItems(new String[] {"4233       John & Mary Smith     52 Halifax Street        \tHenderson                Lot 32         DP 215047\t\t\t\t", "4237       Joe Bloggs                    2 Sandford Rise          Titirangi                      -                  -", "4241       Kay Hall                        28 Becroft Lane          Kumeu                       Lot 4           DP 1/2sh 457654 & 1/2sh 457660", "", "", "", "", "", "                    List of people who have been Invoiced but permit not sent to council"});
		list_2.setBounds(10, 10, 603, 185);
		formToolkit.adapt(list_2, true, true);
		
		text_2 = new Text(composite_4, SWT.BORDER);
		text_2.setBounds(313, 220, 300, 56);
		formToolkit.adapt(text_2, true, true);
		
		text_8 = new Text(composite_4, SWT.BORDER);
		text_8.setBounds(101, 201, 184, 25);
		formToolkit.adapt(text_8, true, true);
		
		Label lblLot = new Label(composite_4, SWT.NONE);
		lblLot.setText("Lot");
		lblLot.setBounds(10, 201, 39, 25);
		formToolkit.adapt(lblLot, true, true);
		
		text_9 = new Text(composite_4, SWT.BORDER);
		text_9.setBounds(101, 233, 184, 25);
		formToolkit.adapt(text_9, true, true);
		
		Label lblDp = new Label(composite_4, SWT.NONE);
		lblDp.setText("DP");
		lblDp.setBounds(10, 234, 39, 25);
		formToolkit.adapt(lblDp, true, true);
		
		text_10 = new Text(composite_4, SWT.BORDER);
		text_10.setBounds(101, 269, 184, 25);
		formToolkit.adapt(text_10, true, true);
		
		Label lblBuildingName = new Label(composite_4, SWT.NONE);
		lblBuildingName.setText("Building Name");
		lblBuildingName.setBounds(10, 272, 81, 17);
		formToolkit.adapt(lblBuildingName, true, true);
		
		Label lblUnitLevel = new Label(composite_4, SWT.NONE);
		lblUnitLevel.setText("Unit / Level");
		lblUnitLevel.setBounds(10, 299, 78, 25);
		formToolkit.adapt(lblUnitLevel, true, true);
		
		text_11 = new Text(composite_4, SWT.BORDER);
		text_11.setBounds(101, 298, 184, 25);
		formToolkit.adapt(text_11, true, true);
		
		Label lblValueOfWorks = new Label(composite_4, SWT.NONE);
		lblValueOfWorks.setText("Value of Works");
		lblValueOfWorks.setBounds(10, 331, 78, 25);
		formToolkit.adapt(lblValueOfWorks, true, true);
		
		text_12 = new Text(composite_4, SWT.BORDER);
		text_12.setBounds(101, 330, 184, 25);
		formToolkit.adapt(text_12, true, true);
		
		Label lblLocationOfFireplace = new Label(composite_4, SWT.NONE);
		lblLocationOfFireplace.setText("Location of Fireplace");
		lblLocationOfFireplace.setBounds(315, 201, 121, 13);
		formToolkit.adapt(lblLocationOfFireplace, true, true);
		
		Button btnPermitSent = new Button(composite_4, SWT.CHECK);
		btnPermitSent.setText("Permit Application Sent");
		btnPermitSent.setBounds(422, 311, 184, 16);
		formToolkit.adapt(btnPermitSent, true, true);
		
		Button btnPlan = new Button(composite_4, SWT.CHECK);
		btnPlan.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnPlan.setText("Plan?");
		btnPlan.setBounds(101, 361, 63, 16);
		formToolkit.adapt(btnPlan, true, true);
		
		Button button = new Button(composite_4, SWT.NONE);
		button.setText("CANCEL");
		button.setBounds(358, 361, 125, 25);
		formToolkit.adapt(button, true, true);
		
		Button btnSaveDetails = new Button(composite_4, SWT.NONE);
		btnSaveDetails.setText("SAVE DETAILS");
		btnSaveDetails.setBounds(488, 361, 125, 25);
		formToolkit.adapt(btnSaveDetails, true, true);
		
		TabItem tbtmNewItem = new TabItem(tabFolder, SWT.NONE);
		tbtmNewItem.setText("Receive Permits");
		
		Composite composite = new Composite(tabFolder, SWT.NONE);
		tbtmNewItem.setControl(composite);
		
		List list_1 = new List(composite, SWT.BORDER);
		list_1.setItems(new String[] {"4233       John & Mary Smith     52 Halifax Street        \tHenderson                Lot 32         DP 215047\t\t\t\t", "4237       Joe Bloggs                    2 Sandford Rise          Titirangi                      -                  -", "4241       Kay Hall                        28 Becroft Lane          Kumeu                       Lot 4           DP 1/2sh 457654 & 1/2sh 457660", "", "", "", "", "", "                    List of people who have had permit sent, but not received"});
		list_1.setBounds(10, 10, 603, 185);
		formToolkit.adapt(list_1, true, true);
		
		Label lblPermitNumber = new Label(composite, SWT.NONE);
		lblPermitNumber.setText("Permit Number");
		lblPermitNumber.setBounds(330, 212, 93, 25);
		formToolkit.adapt(lblPermitNumber, true, true);
		
		text_14 = new Text(composite, SWT.BORDER);
		text_14.setBounds(429, 209, 184, 25);
		formToolkit.adapt(text_14, true, true);
		
		Button btnPermitReceived = new Button(composite, SWT.CHECK);
		btnPermitReceived.setText("Permit Received");
		btnPermitReceived.setBounds(429, 246, 184, 16);
		formToolkit.adapt(btnPermitReceived, true, true);
		
		Label label = new Label(composite, SWT.NONE);
		label.setText("Name:");
		label.setBounds(10, 208, 35, 15);
		formToolkit.adapt(label, true, true);
		
		Label label_1 = new Label(composite, SWT.NONE);
		label_1.setText("Site Address:");
		label_1.setBounds(10, 228, 67, 15);
		formToolkit.adapt(label_1, true, true);
		
		Label label_2 = new Label(composite, SWT.NONE);
		label_2.setText("Suburb:");
		label_2.setBounds(10, 248, 41, 15);
		formToolkit.adapt(label_2, true, true);
		
		Label label_3 = new Label(composite, SWT.NONE);
		label_3.setText("Mobile:");
		label_3.setBounds(10, 269, 37, 15);
		formToolkit.adapt(label_3, true, true);
		
		Label label_4 = new Label(composite, SWT.NONE);
		label_4.setText("Phone:");
		label_4.setBounds(10, 290, 41, 15);
		formToolkit.adapt(label_4, true, true);
		
		Label label_5 = new Label(composite, SWT.NONE);
		label_5.setText("Email:");
		label_5.setBounds(10, 312, 32, 15);
		formToolkit.adapt(label_5, true, true);
		
		Label label_13 = new Label(composite, SWT.NONE);
		label_13.setText("REES Code:");
		label_13.setBounds(10, 333, 67, 15);
		formToolkit.adapt(label_13, true, true);
		
		text = new Text(composite, SWT.BORDER);
		text.setEditable(false);
		text.setBounds(83, 208, 151, 145);
		formToolkit.adapt(text, true, true);
		
		Button button_1 = new Button(composite, SWT.NONE);
		button_1.setText("CANCEL");
		button_1.setBounds(361, 357, 125, 25);
		formToolkit.adapt(button_1, true, true);
		
		Button btnSaveConsent = new Button(composite, SWT.NONE);
		btnSaveConsent.setText("SAVE CONSENT");
		btnSaveConsent.setBounds(491, 357, 125, 25);
		formToolkit.adapt(btnSaveConsent, true, true);
		
		TabItem tbtmNewItem_2 = new TabItem(tabFolder, SWT.NONE);
		tbtmNewItem_2.setText("Producer Statement");
		
		Composite composite_2 = new Composite(tabFolder, SWT.NONE);
		tbtmNewItem_2.setControl(composite_2);
		
		List list_3 = new List(composite_2, SWT.BORDER);
		list_3.setItems(new String[] {"15/08/2017    4233       John & Mary Smith     52 Halifax Street          Henderson            ABA-20171502321          Darren\t\t\t", "16/08/2017    4237       Joe Bloggs                    2 Sandford Rise           Titirangi                 ABA-20171502336          Scott", "16/08/2017    4241       Kay Hall                        28 Becroft Lane            Kumeu                  ABA-20171502452          Phil  ", "", "", "", "", "                    List of people who have had install completed but PS3 not Marked as Signed ( or Printed?)"});
		list_3.setBounds(10, 45, 613, 150);
		formToolkit.adapt(list_3, true, true);
		
		List list_4 = new List(composite_2, SWT.BORDER);
		list_4.setItems(new String[] {"15/08/2017    4233       John & Mary Smith     52 Halifax Street          Henderson            ABA-20171502321          Darren\t\t\t", "16/08/2017    4237       Joe Bloggs                    2 Sandford Rise           Titirangi                 ABA-20171502336          Scott"});
		list_4.setBounds(10, 212, 613, 82);
		formToolkit.adapt(list_4, true, true);
		
		Combo combo = new Combo(composite_2, SWT.NONE);
		combo.setItems(new String[] {"Date", "Invoice", "Installer"});
		combo.setBounds(65, 10, 122, 23);
		formToolkit.adapt(combo);
		formToolkit.paintBordersFor(combo);
		combo.select(0);
		
		Label label_6 = new Label(composite_2, SWT.NONE);
		label_6.setText("Sort By:");
		label_6.setBounds(10, 13, 55, 15);
		formToolkit.adapt(label_6, true, true);
		
		Button button_2 = new Button(composite_2, SWT.NONE);
		button_2.setText("CANCEL");
		button_2.setBounds(368, 357, 125, 25);
		formToolkit.adapt(button_2, true, true);
		
		Button btnPsSigned = new Button(composite_2, SWT.NONE);
		btnPsSigned.setText("PS3 SIGNED");
		btnPsSigned.setBounds(498, 357, 125, 25);
		formToolkit.adapt(btnPsSigned, true, true);
		
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
		
		text_5 = new Text(composite_3, SWT.BORDER);
		text_5.setBounds(154, 285, 140, 21);
		formToolkit.adapt(text_5, true, true);
		
		Button button_3 = new Button(composite_3, SWT.NONE);
		button_3.setText("Record PO");
		button_3.setBounds(300, 283, 104, 25);
		formToolkit.adapt(button_3, true, true);
		
		
		TabItem tbtmReceiveOrders_1 = new TabItem(tabFolder, SWT.NONE);
		tbtmReceiveOrders_1.setText("CCC to Council");
		
		Composite composite_6 = new Composite(tabFolder, SWT.NONE);
		tbtmReceiveOrders_1.setControl(composite_6);
		formToolkit.paintBordersFor(composite_6);
		
		Label label_7 = new Label(composite_6, SWT.NONE);
		label_7.setText("Sort By:");
		label_7.setBounds(10, 13, 55, 15);
		formToolkit.adapt(label_7, true, true);
		
		Combo combo_2 = new Combo(composite_6, SWT.NONE);
		combo_2.setItems(new String[] {"Date", "Invoice", "Installer"});
		combo_2.setBounds(65, 10, 122, 23);
		formToolkit.adapt(combo_2);
		formToolkit.paintBordersFor(combo_2);
		combo_2.select(0);
		
		List list_5 = new List(composite_6, SWT.BORDER);
		list_5.setItems(new String[] {"15/08/2017    4233       John & Mary Smith     52 Halifax Street          Henderson            ABA-20171502321          Darren\t\t\t", "16/08/2017    4237       Joe Bloggs                    2 Sandford Rise           Titirangi                 ABA-20171502336          Scott", "16/08/2017    4241       Kay Hall                        28 Becroft Lane            Kumeu                  ABA-20171502452          Phil  ", "", "", "", "", "                    List of people who have had PS3 Marked as Signed but no date recorded for CCC going to council"});
		list_5.setBounds(10, 45, 613, 150);
		formToolkit.adapt(list_5, true, true);
		
		DateTime dateTime = new DateTime(composite_6, SWT.BORDER);
		dateTime.setBounds(498, 305, 125, 24);
		formToolkit.adapt(dateTime);
		formToolkit.paintBordersFor(dateTime);
		
		List list_6 = new List(composite_6, SWT.BORDER);
		list_6.setItems(new String[] {"15/08/2017    4233       John & Mary Smith     52 Halifax Street          Henderson            ABA-20171502321          Darren\t\t\t", "16/08/2017    4237       Joe Bloggs                    2 Sandford Rise           Titirangi                 ABA-20171502336          Scott"});
		list_6.setBounds(10, 215, 566, 68);
		formToolkit.adapt(list_6, true, true);
		
		Button button_4 = new Button(composite_6, SWT.NONE);
		button_4.setText("CANCEL");
		button_4.setBounds(368, 357, 125, 25);
		formToolkit.adapt(button_4, true, true);
		
		Button btnApplyForCcc = new Button(composite_6, SWT.NONE);
		btnApplyForCcc.setText("APPLY FOR CCC");
		btnApplyForCcc.setBounds(498, 357, 125, 25);
		formToolkit.adapt(btnApplyForCcc, true, true);
		
		TabItem tbtmCccApproved = new TabItem(tabFolder, SWT.NONE);
		tbtmCccApproved.setText("CCC APPROVED");
		
		Composite composite_5 = new Composite(tabFolder, SWT.NONE);
		tbtmCccApproved.setControl(composite_5);
		formToolkit.paintBordersFor(composite_5);
		
		List list_9 = new List(composite_5, SWT.BORDER);
		list_9.setItems(new String[] {"15/08/2017    4233       John & Mary Smith     52 Halifax Street          Henderson            ABA-20171502321          Darren\t\t\t", "16/08/2017    4237       Joe Bloggs                    2 Sandford Rise           Titirangi                 ABA-20171502336          Scott", "16/08/2017    4241       Kay Hall                        28 Becroft Lane            Kumeu                  ABA-20171502452          Phil  ", "", "", "", "", "                    List of people who have had CCC Marked as Sent To Council"});
		list_9.setBounds(10, 10, 613, 185);
		formToolkit.adapt(list_9, true, true);
		
		DateTime dateTime_2 = new DateTime(composite_5, SWT.BORDER);
		dateTime_2.setBounds(498, 305, 125, 24);
		formToolkit.adapt(dateTime_2);
		formToolkit.paintBordersFor(dateTime_2);
		
		List list_10 = new List(composite_5, SWT.BORDER);
		list_10.setItems(new String[] {"15/08/2017    4233       John & Mary Smith     52 Halifax Street          Henderson            ABA-20171502321          Darren\t\t\t", "16/08/2017    4237       Joe Bloggs                    2 Sandford Rise           Titirangi                 ABA-20171502336          Scott"});
		list_10.setBounds(10, 201, 550, 82);
		formToolkit.adapt(list_10, true, true);
		
		Button button_5 = new Button(composite_5, SWT.NONE);
		button_5.setText("CANCEL");
		button_5.setBounds(368, 357, 125, 25);
		formToolkit.adapt(button_5, true, true);
		
		Button btnReceiveCcc = new Button(composite_5, SWT.NONE);
		btnReceiveCcc.setText("RECEIVE CCC");
		btnReceiveCcc.setBounds(498, 357, 125, 25);
		formToolkit.adapt(btnReceiveCcc, true, true);
		
		TabItem tbtmBookings = new TabItem(tabFolder, SWT.NONE);
		tbtmBookings.setText("CCC To Client");
		
		Composite composite_8 = new Composite(tabFolder, SWT.NONE);
		tbtmBookings.setControl(composite_8);
		formToolkit.paintBordersFor(composite_8);
		
		List list_7 = new List(composite_8, SWT.BORDER);
		list_7.setItems(new String[] {"15/08/2017    4233       John & Mary Smith     52 Halifax Street          Henderson            ABA-20171502321          Darren\t\t\t", "16/08/2017    4237       Joe Bloggs                    2 Sandford Rise           Titirangi                 ABA-20171502336          Scott", "16/08/2017    4241       Kay Hall                        28 Becroft Lane            Kumeu                  ABA-20171502452          Phil  ", "", "", "", "", "                    List of people who have had CCC Marked as Approved but not sent to Client"});
		list_7.setBounds(10, 10, 613, 185);
		formToolkit.adapt(list_7, true, true);
		
		DateTime dateTime_1 = new DateTime(composite_8, SWT.BORDER);
		dateTime_1.setBounds(489, 273, 134, 24);
		formToolkit.adapt(dateTime_1);
		formToolkit.paintBordersFor(dateTime_1);
		
		Label label_8 = new Label(composite_8, SWT.NONE);
		label_8.setText("Name");
		label_8.setBounds(20, 207, 78, 15);
		formToolkit.adapt(label_8, true, true);
		
		Label label_9 = new Label(composite_8, SWT.NONE);
		label_9.setText("Site Address");
		label_9.setBounds(20, 228, 78, 15);
		formToolkit.adapt(label_9, true, true);
		
		Label label_10 = new Label(composite_8, SWT.NONE);
		label_10.setText("Suburb");
		label_10.setBounds(20, 245, 78, 15);
		formToolkit.adapt(label_10, true, true);
		
		Label label_11 = new Label(composite_8, SWT.NONE);
		label_11.setText("Postal Address");
		label_11.setBounds(20, 282, 78, 15);
		formToolkit.adapt(label_11, true, true);
		
		Label label_12 = new Label(composite_8, SWT.NONE);
		label_12.setText("Suburb");
		label_12.setBounds(20, 303, 78, 15);
		formToolkit.adapt(label_12, true, true);
		
		text_1 = new Text(composite_8, SWT.BORDER);
		text_1.setEditable(false);
		text_1.setBounds(104, 207, 238, 139);
		formToolkit.adapt(text_1, true, true);
		
		Label lblReesCode = new Label(composite_8, SWT.NONE);
		lblReesCode.setText("REES Code");
		lblReesCode.setBounds(20, 324, 78, 15);
		formToolkit.adapt(lblReesCode, true, true);
		
		Button btnFullPaymentReceived = new Button(composite_8, SWT.CHECK);
		btnFullPaymentReceived.setText("Full Payment Checked");
		btnFullPaymentReceived.setBounds(488, 290, 135, 40);
		formToolkit.adapt(btnFullPaymentReceived, true, true);
		
		Button button_6 = new Button(composite_8, SWT.NONE);
		button_6.setText("CANCEL");
		button_6.setBounds(372, 357, 125, 25);
		formToolkit.adapt(button_6, true, true);
		
		Button btnSentToClient_1 = new Button(composite_8, SWT.NONE);
		btnSentToClient_1.setText("SENT TO CLIENT");
		btnSentToClient_1.setBounds(502, 357, 125, 25);
		formToolkit.adapt(btnSentToClient_1, true, true);
		
		

	}
}
