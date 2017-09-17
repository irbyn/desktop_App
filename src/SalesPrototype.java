import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
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
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.GridData;

public class SalesPrototype {

	protected Shell shell;
	private Text text;
	private Text text_9;
	private Text text_8;
	private Text text_1;
	private Text text_2;
	private Text text_3;
	private Text text_4;
	private Text text_5;
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	private Text txtPdfFile;
	private Text txtPdfFile_1;
	private Text text_7;
	private Text text_13;
	private Text text_10;
	private Text text_6;
	private Text text_15;
	private Text text_16;
	private Text text_11;
	private Text text_17;
	private Text text_12;
	private Text text_18;
	private Text text_14;
	private Text text_19;
	private Text text_20;
	private Text txtImageFile;
	private Text text_21;
	private Text text_22;
	private Text text_23;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			SalesPrototype window = new SalesPrototype();
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
	    
	    Button button = new Button(shell, SWT.NONE);
	    button.setText("SCHEDULE");
	    button.setBounds(10, 22, 161, 25);
	    formToolkit.adapt(button, true, true);
	    
	    Button button_1 = new Button(shell, SWT.NONE);
	    button_1.addSelectionListener(new SelectionAdapter() {
	    	@Override
	    	public void widgetSelected(SelectionEvent e) {
	    	}
	    });
	    button_1.setText("SALES");
	    button_1.setBounds(181, 22, 161, 25);
	    formToolkit.adapt(button_1, true, true);
	    
	    Button button_2 = new Button(shell, SWT.NONE);
	    button_2.addSelectionListener(new SelectionAdapter() {
	    	@Override
	    	public void widgetSelected(SelectionEvent e) {
	    	}
	    });
	    button_2.setText("INSTALLS");
	    button_2.setBounds(353, 22, 161, 25);
	    formToolkit.adapt(button_2, true, true);
	    
	    Button button_3 = new Button(shell, SWT.NONE);
	    button_3.setText("PERMITS");
	    button_3.setBounds(520, 22, 161, 25);
	    formToolkit.adapt(button_3, true, true);
	    
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
		
		
		
		TabFolder tabFolder = new TabFolder(shell, SWT.BORDER);
		tabFolder.setBounds(10, 79, 645, 420);
		
		TabItem tbtmClient = new TabItem(tabFolder, SWT.NONE);
		tbtmClient.setText("Customer");
		
		Composite composite_5 = new Composite(tabFolder, SWT.NONE);
		composite_5.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		composite_5.setTextDirection(0);
		tbtmClient.setControl(composite_5);
		formToolkit.paintBordersFor(composite_5);
		
		Label lblName = new Label(composite_5, SWT.NONE);
		lblName.setText("Name:");
		lblName.setBounds(129, 13, 78, 15);
		formToolkit.adapt(lblName, true, true);
		
		Label lblSiteAddress_1 = new Label(composite_5, SWT.NONE);
		lblSiteAddress_1.setText("Site Address:");
		lblSiteAddress_1.setBounds(129, 170, 78, 15);
		formToolkit.adapt(lblSiteAddress_1, true, true);
		
		Label lblSiteSuburb = new Label(composite_5, SWT.NONE);
		lblSiteSuburb.setText("Site Suburb:");
		lblSiteSuburb.setBounds(129, 206, 78, 15);
		formToolkit.adapt(lblSiteSuburb, true, true);
		
		Label lblMobile_1 = new Label(composite_5, SWT.NONE);
		lblMobile_1.setText("Mobile:");
		lblMobile_1.setBounds(129, 48, 78, 15);
		formToolkit.adapt(lblMobile_1, true, true);
		
		Label lblPhone_1 = new Label(composite_5, SWT.NONE);
		lblPhone_1.setText("Phone:");
		lblPhone_1.setBounds(129, 82, 78, 15);
		formToolkit.adapt(lblPhone_1, true, true);
		
		Label lblEmail_1 = new Label(composite_5, SWT.NONE);
		lblEmail_1.setText("Email:");
		lblEmail_1.setBounds(129, 113, 78, 15);
		formToolkit.adapt(lblEmail_1, true, true);
		
		Button btnSaveCustomer = new Button(composite_5, SWT.NONE);
		btnSaveCustomer.setText("CREATE CUSTOMER");
		btnSaveCustomer.setBounds(499, 364, 114, 25);
		formToolkit.adapt(btnSaveCustomer, true, true);
		
		Button button_8 = new Button(composite_5, SWT.NONE);
		button_8.setText("CANCEL");
		button_8.setBounds(375, 364, 114, 25);
		formToolkit.adapt(button_8, true, true);
		
		text_6 = new Text(composite_5, SWT.BORDER);
		text_6.setBounds(213, 10, 302, 25);
		formToolkit.adapt(text_6, true, true);
		
		text_15 = new Text(composite_5, SWT.BORDER);
		text_15.setBounds(213, 167, 302, 25);
		formToolkit.adapt(text_15, true, true);
		
		text_16 = new Text(composite_5, SWT.BORDER);
		text_16.setBounds(213, 203, 157, 25);
		formToolkit.adapt(text_16, true, true);
		
		Label lblPostalAddress = new Label(composite_5, SWT.NONE);
		lblPostalAddress.setText("Postal Address:");
		lblPostalAddress.setBounds(129, 266, 78, 15);
		formToolkit.adapt(lblPostalAddress, true, true);
		
		text_11 = new Text(composite_5, SWT.BORDER);
		text_11.setBounds(213, 263, 302, 25);
		formToolkit.adapt(text_11, true, true);
		
		text_17 = new Text(composite_5, SWT.BORDER);
		text_17.setBounds(447, 203, 68, 25);
		formToolkit.adapt(text_17, true, true);
		
		Label lblAreaCode = new Label(composite_5, SWT.NONE);
		lblAreaCode.setText("Area Code:");
		lblAreaCode.setBounds(375, 206, 62, 15);
		formToolkit.adapt(lblAreaCode, true, true);
		
		Label lblPostalSuburb = new Label(composite_5, SWT.NONE);
		lblPostalSuburb.setText("Postal Suburb:");
		lblPostalSuburb.setBounds(129, 297, 78, 15);
		formToolkit.adapt(lblPostalSuburb, true, true);
		
		text_12 = new Text(composite_5, SWT.BORDER);
		text_12.setBounds(213, 294, 157, 25);
		formToolkit.adapt(text_12, true, true);
		
		Label lblAreaCode_1 = new Label(composite_5, SWT.NONE);
		lblAreaCode_1.setText("Area Code:");
		lblAreaCode_1.setBounds(375, 297, 62, 15);
		formToolkit.adapt(lblAreaCode_1, true, true);
		
		text_18 = new Text(composite_5, SWT.BORDER);
		text_18.setBounds(447, 294, 68, 25);
		formToolkit.adapt(text_18, true, true);
		
		Button btnPostalAddressIs = new Button(composite_5, SWT.CHECK);
		btnPostalAddressIs.setBounds(129, 244, 215, 16);
		formToolkit.adapt(btnPostalAddressIs, true, true);
		btnPostalAddressIs.setText("Postal Address is Site Address");
		
		text_14 = new Text(composite_5, SWT.BORDER);
		text_14.setBounds(213, 45, 157, 25);
		formToolkit.adapt(text_14, true, true);
		
		text_19 = new Text(composite_5, SWT.BORDER);
		text_19.setBounds(213, 79, 157, 25);
		formToolkit.adapt(text_19, true, true);
		
		text_20 = new Text(composite_5, SWT.BORDER);
		text_20.setBounds(213, 110, 302, 25);
		formToolkit.adapt(text_20, true, true);
		
		Button btnSearchForExisting = new Button(composite_5, SWT.NONE);
		btnSearchForExisting.setText("SEARCH FOR EXISTING CUSTOMER");
		btnSearchForExisting.setBounds(129, 364, 224, 25);
		formToolkit.adapt(btnSearchForExisting, true, true);
		
		TabItem tbtmNewItem = new TabItem(tabFolder, SWT.NONE);
		tbtmNewItem.setText("Estimation");
		
		Composite composite = new Composite(tabFolder, SWT.NONE);
		composite.setTextDirection(0);
		tbtmNewItem.setControl(composite);
		composite.setLayout(null);
		
		Combo combo_2 = new Combo(composite, SWT.NONE);
		combo_2.setBounds(5, 11, 111, 23);
		combo_2.setItems(new String[] {"All", "Solomon", "David", "Marcia", "Greg", "No Salesperson"});
		formToolkit.adapt(combo_2);
		formToolkit.paintBordersFor(combo_2);
		combo_2.select(0);
		
		Button btnNewButton = new Button(composite, SWT.NONE);
		btnNewButton.setBounds(121, 10, 72, 25);
		btnNewButton.setText("Refresh List");
		
		Label lblNewLabel = new Label(composite, SWT.NONE);
		lblNewLabel.setBounds(218, 5, 35, 15);
		lblNewLabel.setText("Name:");
		
		text = new Text(composite, SWT.BORDER);
		text.setBounds(303, 5, 284, 158);
		text.setEditable(false);
		
		Label lblAddress = new Label(composite, SWT.NONE);
		lblAddress.setBounds(218, 25, 67, 15);
		lblAddress.setText("Site Address:");
		
		List list_1 = new List(composite, SWT.BORDER);
		list_1.setBounds(5, 45, 208, 291);
		list_1.setItems(new String[] {"John & Mary Smith     52 Halifax Street\t", "Joe Bloggs                    2 Sandford Rise", "Kay Hall                        28 Becroft Lane", "", "", "", "", "", "", "      List of people who have entered ", "      details but not been sent an email"});
		
		Label lblSuburb = new Label(composite, SWT.NONE);
		lblSuburb.setBounds(218, 45, 41, 15);
		lblSuburb.setText("Suburb:");
		
		Label lblSiteAddress = new Label(composite, SWT.NONE);
		lblSiteAddress.setBounds(218, 65, 80, 15);
		lblSiteAddress.setText("Postal Address:");
		
		Label lblSuburb_1 = new Label(composite, SWT.NONE);
		lblSuburb_1.setBounds(218, 85, 41, 15);
		lblSuburb_1.setText("Suburb:");
		
		Label lblMobile = new Label(composite, SWT.NONE);
		lblMobile.setBounds(218, 105, 67, 15);
		lblMobile.setText("Mobile:");
		
		Label lblPhone = new Label(composite, SWT.NONE);
		lblPhone.setBounds(218, 126, 67, 15);
		lblPhone.setText("Phone:");
		
		Label lblEmail = new Label(composite, SWT.NONE);
		lblEmail.setBounds(218, 148, 32, 15);
		lblEmail.setText("Email:");
		
		Label lblFire = new Label(composite, SWT.NONE);
		lblFire.setBounds(218, 169, 67, 15);
		lblFire.setText("Fire:");
		Label label_29 = new Label(composite, SWT.NONE);
		label_29.setBounds(384, 148, 0, 15);
		formToolkit.adapt(label_29, true, true);
		
		text_8 = new Text(composite, SWT.BORDER);
		text_8.setBounds(485, 171, 102, 21);
		
		Label lblInstallType = new Label(composite, SWT.NONE);
		lblInstallType.setBounds(444, 174, 35, 15);
		lblInstallType.setText("Price:");
		
		text_9 = new Text(composite, SWT.BORDER);
		text_9.setBounds(303, 171, 128, 21);
		
		Label lblInstallType_1 = new Label(composite, SWT.NONE);
		lblInstallType_1.setBounds(218, 201, 80, 15);
		lblInstallType_1.setText("Install Type:");
		Label label_30 = new Label(composite, SWT.NONE);
		label_30.setBounds(448, 174, 0, 15);
		formToolkit.adapt(label_30, true, true);
		
		Combo combo = new Combo(composite, SWT.NONE);
		combo.setBounds(303, 198, 176, 23);
		
		Label lblSiteCheck = new Label(composite, SWT.NONE);
		lblSiteCheck.setBounds(218, 230, 67, 15);
		lblSiteCheck.setText("Site Check:");
		
		Button btnCheckButton = new Button(composite, SWT.CHECK);
		btnCheckButton.setBounds(303, 227, 64, 16);
		btnCheckButton.setText("To Book");
		
		DateTime dateTime_1 = new DateTime(composite, SWT.BORDER | SWT.TIME);
		dateTime_1.setBounds(373, 221, 106, 24);
		dateTime_1.setEnabled(false);
		dateTime_1.setTime(12, 00, 00);
		
		DateTime dateTime = new DateTime(composite, SWT.BORDER);
		dateTime.setBounds(485, 221, 102, 24);
		dateTime.setEnabled(false);
		dateTime.setDate(0, 0, 0);
		
		Label lblSiteCheckBy = new Label(composite, SWT.NONE);
		lblSiteCheckBy.setBounds(218, 260, 80, 15);
		lblSiteCheckBy.setText("Site Check By:");
		formToolkit.adapt(lblSiteCheckBy, true, true);
		
		Combo combo_3 = new Combo(composite, SWT.NONE);
		combo_3.setBounds(303, 254, 176, 23);
		formToolkit.adapt(combo_3);
		formToolkit.paintBordersFor(combo_3);
		
		text_1 = new Text(composite, SWT.BORDER);
		text_1.setBounds(303, 282, 284, 21);
		
		Label lblPersonalNote = new Label(composite, SWT.NONE);
		lblPersonalNote.setBounds(218, 287, 80, 15);
		lblPersonalNote.setText("Comment:");
		
		Label lblSalesPerson = new Label(composite, SWT.NONE);
		lblSalesPerson.setBounds(218, 314, 80, 15);
		lblSalesPerson.setText("Sales Person:");
		
		Combo combo_1 = new Combo(composite, SWT.NONE);
		combo_1.setBounds(303, 310, 118, 23);
		formToolkit.adapt(combo_1);
		formToolkit.paintBordersFor(combo_1);
		
		Button btnNewButton_1 = new Button(composite, SWT.NONE);
		btnNewButton_1.setBounds(269, 341, 102, 25);
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNewButton_1.setText("SEND EMAIL");
		
		Button btnCancel_1 = new Button(composite, SWT.NONE);
		btnCancel_1.setBounds(377, 341, 102, 25);
		btnCancel_1.setText("CANCEL");
		formToolkit.adapt(btnCancel_1, true, true);
		
		Button btnSaveDetails = new Button(composite, SWT.NONE);
		btnSaveDetails.setBounds(485, 341, 102, 25);
		btnSaveDetails.setText("SAVE DETAILS");
		formToolkit.adapt(btnSaveDetails, true, true);
		
		Button btnSiteCheckCompleted = new Button(composite, SWT.CHECK);
		btnSiteCheckCompleted.setText("Site Check Completed");
		btnSiteCheckCompleted.setBounds(485, 259, 138, 16);
		formToolkit.adapt(btnSiteCheckCompleted, true, true);
		
		TabItem tbtmNewItem_1 = new TabItem(tabFolder, SWT.NONE);
		tbtmNewItem_1.setText("Site Checks");
		
		Composite composite_1 = new Composite(tabFolder, SWT.NONE);
		tbtmNewItem_1.setControl(composite_1);
		
		Composite composite_4 = new Composite(composite_1, SWT.NONE);
		composite_4.setBounds(0, 0, 637, 392);
		
		List list_2 = new List(composite_4, SWT.BORDER);
		list_2.setItems(new String[] {"John & Mary Smith     52 Halifax Street", "Joe Bloggs                    2 Sandford Rise", "Kay Hall                        28 Becroft Lane", "", "", "", "", "", "", "      List of people who have entered ", "      details but not had a sitecheck", "      booked"});
		list_2.setBounds(10, 44, 220, 338);
		
		text_2 = new Text(composite_4, SWT.BORDER);
		text_2.setEditable(false);
		text_2.setBounds(349, 10, 264, 240);
		
		Button button = new Button(composite_4, SWT.NONE);
		button.setText("Refresh List");
		button.setBounds(10, 10, 220, 25);
		
		Label lblInstallType_2 = new Label(composite_4, SWT.NONE);
		lblInstallType_2.setText("Install Type:");
		lblInstallType_2.setBounds(265, 198, 64, 15);
		
		Label lblSiteCheckBooking = new Label(composite_4, SWT.NONE);
		lblSiteCheckBooking.setText("Site Check Booking");
		lblSiteCheckBooking.setBounds(291, 279, 130, 15);
		
		Button btnSaveBooking = new Button(composite_4, SWT.NONE);
		btnSaveBooking.setText("SAVE BOOKING");
		btnSaveBooking.setBounds(499, 357, 114, 25);
		
		Label lblEstimateTotal = new Label(composite_4, SWT.NONE);
		lblEstimateTotal.setText("Estimate Total:");
		lblEstimateTotal.setBounds(265, 219, 78, 15);
		
		DateTime dateTime_4 = new DateTime(composite_4, SWT.BORDER);
		dateTime_4.setBounds(523, 279, 90, 24);
		
		DateTime dateTime_5 = new DateTime(composite_4, SWT.BORDER | SWT.TIME);
		dateTime_5.setBounds(427, 279, 90, 24);
		
		Button button_4 = new Button(composite_4, SWT.NONE);
		button_4.setText("CANCEL");
		button_4.setBounds(379, 357, 114, 25);
		formToolkit.adapt(button_4, true, true);
		
		Label label = new Label(composite_4, SWT.NONE);
		label.setText("Site Check By:");
		label.setBounds(291, 315, 80, 15);
		formToolkit.adapt(label, true, true);
		
		Combo combo_4 = new Combo(composite_4, SWT.NONE);
		combo_4.setItems(new String[] {"Darren", "Dave", "Greg", "Phil", "Scott", "Solomon"});
		combo_4.setBounds(376, 309, 103, 23);
		formToolkit.adapt(combo_4);
		formToolkit.paintBordersFor(combo_4);
		
		Button button_5 = new Button(composite_4, SWT.CHECK);
		button_5.setText("Site Check Completed");
		button_5.setBounds(489, 314, 138, 16);
		formToolkit.adapt(button_5, true, true);
		
		Label label_1 = new Label(composite_4, SWT.NONE);
		label_1.setText("Fire:");
		label_1.setBounds(265, 174, 67, 15);
		formToolkit.adapt(label_1, true, true);
		
		Label label_2 = new Label(composite_4, SWT.NONE);
		label_2.setText("Email:");
		label_2.setBounds(265, 153, 32, 15);
		formToolkit.adapt(label_2, true, true);
		
		Label label_3 = new Label(composite_4, SWT.NONE);
		label_3.setText("Phone:");
		label_3.setBounds(265, 131, 64, 15);
		formToolkit.adapt(label_3, true, true);
		
		Label label_4 = new Label(composite_4, SWT.NONE);
		label_4.setText("Mobile:");
		label_4.setBounds(265, 110, 64, 15);
		formToolkit.adapt(label_4, true, true);
		
		Label label_5 = new Label(composite_4, SWT.NONE);
		label_5.setText("Suburb:");
		label_5.setBounds(265, 90, 41, 15);
		formToolkit.adapt(label_5, true, true);
		
		Label label_6 = new Label(composite_4, SWT.NONE);
		label_6.setText("Postal Address:");
		label_6.setBounds(265, 70, 80, 15);
		formToolkit.adapt(label_6, true, true);
		
		Label label_7 = new Label(composite_4, SWT.NONE);
		label_7.setText("Suburb:");
		label_7.setBounds(265, 50, 41, 15);
		formToolkit.adapt(label_7, true, true);
		
		Label label_8 = new Label(composite_4, SWT.NONE);
		label_8.setText("Site Address:");
		label_8.setBounds(265, 30, 67, 15);
		formToolkit.adapt(label_8, true, true);
		
		Label label_13 = new Label(composite_4, SWT.NONE);
		label_13.setText("Name:");
		label_13.setBounds(265, 10, 35, 15);
		formToolkit.adapt(label_13, true, true);
		
		TabItem tbtmNewItem_2 = new TabItem(tabFolder, SWT.NONE);
		tbtmNewItem_2.setText("Quotes");
		
		Composite composite_2 = new Composite(tabFolder, SWT.NONE);
		tbtmNewItem_2.setControl(composite_2);
		
		Button btnSaveQuoteDetails = new Button(composite_2, SWT.NONE);
		btnSaveQuoteDetails.setText("SAVE QUOTE DETAILS");
		btnSaveQuoteDetails.setBounds(488, 362, 125, 25);
		
		text_3 = new Text(composite_2, SWT.BORDER);
		text_3.setEditable(false);
		text_3.setBounds(388, 10, 225, 217);
		
		Button button_2 = new Button(composite_2, SWT.NONE);
		button_2.setText("Refresh List");
		button_2.setBounds(10, 10, 275, 25);
		
		List list_3 = new List(composite_2, SWT.BORDER);
		list_3.setItems(new String[] {"15/06/17    John & Mary Smith     52 Halifax Street\t", "15/06/17    Joe Bloggs                    2 Sandford Rise", "16/06/17    Kay Hall                        28 Becroft Lane", "", "", "", "", "", "", "      List of people who have passed sitecheck", "      day but not had a quote entered."});
		list_3.setBounds(10, 44, 275, 314);
		
		Label lblReesCode = new Label(composite_2, SWT.NONE);
		lblReesCode.setText("Rees Code");
		lblReesCode.setBounds(305, 244, 64, 15);
		
		text_4 = new Text(composite_2, SWT.BORDER);
		text_4.setBounds(375, 241, 90, 21);
		
		Label lblQuote = new Label(composite_2, SWT.NONE);
		lblQuote.setText("Quote #");
		lblQuote.setBounds(469, 244, 48, 15);
		
		text_5 = new Text(composite_2, SWT.BORDER);
		text_5.setBounds(523, 241, 90, 21);
		
		txtPdfFile = new Text(composite_2, SWT.BORDER);
		txtPdfFile.setText("PDF FILE");
		txtPdfFile.setBounds(385, 289, 74, 67);
		formToolkit.adapt(txtPdfFile, true, true);
		
		Label lblSiteCheck_1 = new Label(composite_2, SWT.NONE);
		lblSiteCheck_1.setAlignment(SWT.CENTER);
		lblSiteCheck_1.setText("Site Check");
		lblSiteCheck_1.setBounds(385, 268, 74, 15);
		formToolkit.adapt(lblSiteCheck_1, true, true);
		
		Label lblQuote_1 = new Label(composite_2, SWT.NONE);
		lblQuote_1.setAlignment(SWT.CENTER);
		lblQuote_1.setText("Quote");
		lblQuote_1.setBounds(469, 268, 67, 15);
		formToolkit.adapt(lblQuote_1, true, true);
		
		txtPdfFile_1 = new Text(composite_2, SWT.BORDER);
		txtPdfFile_1.setText("PDF FILE");
		txtPdfFile_1.setBounds(465, 289, 71, 67);
		formToolkit.adapt(txtPdfFile_1, true, true);
		
		Button btnCancelSiteCheck = new Button(composite_2, SWT.CHECK);
		btnCancelSiteCheck.setText("Remove Site Check");
		btnCancelSiteCheck.setBounds(20, 366, 135, 16);
		formToolkit.adapt(btnCancelSiteCheck, true, true);
		
		Button btnCancel = new Button(composite_2, SWT.NONE);
		btnCancel.setText("REMOVE");
		btnCancel.setBounds(160, 364, 125, 25);
		formToolkit.adapt(btnCancel, true, true);
		
		Button button_1 = new Button(composite_2, SWT.NONE);
		button_1.setText("CANCEL");
		button_1.setBounds(357, 362, 125, 25);
		formToolkit.adapt(button_1, true, true);
		
		txtImageFile = new Text(composite_2, SWT.BORDER);
		txtImageFile.setText("IMAGE FILE");
		txtImageFile.setBounds(540, 289, 73, 67);
		formToolkit.adapt(txtImageFile, true, true);
		
		Label lblPhoto = new Label(composite_2, SWT.NONE);
		lblPhoto.setAlignment(SWT.CENTER);
		lblPhoto.setText("Photo");
		lblPhoto.setBounds(542, 268, 69, 15);
		formToolkit.adapt(lblPhoto, true, true);
		
		Label label_10 = new Label(composite_2, SWT.NONE);
		label_10.setText("Name:");
		label_10.setBounds(302, 10, 35, 15);
		formToolkit.adapt(label_10, true, true);
		
		Label label_11 = new Label(composite_2, SWT.NONE);
		label_11.setText("Site Address:");
		label_11.setBounds(302, 30, 67, 15);
		formToolkit.adapt(label_11, true, true);
		
		Label label_14 = new Label(composite_2, SWT.NONE);
		label_14.setText("Suburb:");
		label_14.setBounds(302, 50, 41, 15);
		formToolkit.adapt(label_14, true, true);
		
		Label label_15 = new Label(composite_2, SWT.NONE);
		label_15.setText("Postal Address:");
		label_15.setBounds(302, 70, 80, 15);
		formToolkit.adapt(label_15, true, true);
		
		Label label_16 = new Label(composite_2, SWT.NONE);
		label_16.setText("Suburb:");
		label_16.setBounds(302, 90, 41, 15);
		formToolkit.adapt(label_16, true, true);
		
		Label label_17 = new Label(composite_2, SWT.NONE);
		label_17.setText("Mobile:");
		label_17.setBounds(302, 110, 37, 15);
		formToolkit.adapt(label_17, true, true);
		
		Label label_18 = new Label(composite_2, SWT.NONE);
		label_18.setText("Phone:");
		label_18.setBounds(302, 131, 41, 15);
		formToolkit.adapt(label_18, true, true);
		
		Label label_19 = new Label(composite_2, SWT.NONE);
		label_19.setText("Email:");
		label_19.setBounds(302, 153, 32, 15);
		formToolkit.adapt(label_19, true, true);
		
		Label label_20 = new Label(composite_2, SWT.NONE);
		label_20.setText("Fire:");
		label_20.setBounds(302, 174, 67, 15);
		formToolkit.adapt(label_20, true, true);
		
		Label label_21 = new Label(composite_2, SWT.NONE);
		label_21.setText("Install Type:");
		label_21.setBounds(302, 198, 64, 15);
		formToolkit.adapt(label_21, true, true);
		
		TabItem tbtmNewItem_3 = new TabItem(tabFolder, SWT.NONE);
		tbtmNewItem_3.setText("Follow Ups");
		
		Composite composite_3 = new Composite(tabFolder, SWT.NONE);
		tbtmNewItem_3.setControl(composite_3);
		
		Button button_3 = new Button(composite_3, SWT.NONE);
		button_3.setText("Refresh List");
		button_3.setBounds(10, 10, 275, 25);
		formToolkit.adapt(button_3, true, true);
		
		List list = new List(composite_3, SWT.BORDER);
		list.setItems(new String[] {"Q1227    John & Mary Smith     52 Halifax Street\t", "Q1231    Joe Bloggs                    2 Sandford Rise", "Q1233    Kay Hall                        28 Becroft Lane", "", "", "", "      List of people who have received but not", "      accepted Quotes."});
		list.setBounds(10, 44, 275, 140);
		formToolkit.adapt(list, true, true);
		
		Label lblComment = new Label(composite_3, SWT.NONE);
		lblComment.setText("Comment");
		lblComment.setBounds(304, 222, 64, 15);
		formToolkit.adapt(lblComment, true, true);
		
		text_7 = new Text(composite_3, SWT.BORDER);
		text_7.setBounds(385, 219, 227, 48);
		formToolkit.adapt(text_7, true, true);
		
		text_13 = new Text(composite_3, SWT.BORDER);
		text_13.setEditable(false);
		text_13.setBounds(385, 12, 227, 203);
		formToolkit.adapt(text_13, true, true);
		
		List list_4 = new List(composite_3, SWT.BORDER);
		list_4.setItems(new String[] {"16/05/17    Left voice message\t", "19/05/17    Spoke to Mark, call in 1 week", "", "", "", "      List of previous contacts"});
		list_4.setBounds(10, 222, 252, 160);
		formToolkit.adapt(list_4, true, true);
		
		DateTime dateTime_2 = new DateTime(composite_3, SWT.BORDER);
		dateTime_2.setBounds(523, 273, 90, 24);
		formToolkit.adapt(dateTime_2);
		formToolkit.paintBordersFor(dateTime_2);
		
		Button btnF = new Button(composite_3, SWT.RADIO);
		btnF.setSelection(true);
		btnF.setBounds(417, 273, 100, 16);
		formToolkit.adapt(btnF, true, true);
		btnF.setText("Next Follow Up");
		
		Button btnInvoiced = new Button(composite_3, SWT.RADIO);
		btnInvoiced.setText("Invoiced");
		btnInvoiced.setBounds(417, 305, 90, 16);
		formToolkit.adapt(btnInvoiced, true, true);
		
		Button btnSoldElsewhere = new Button(composite_3, SWT.RADIO);
		btnSoldElsewhere.setText("Sold Elsewhere");
		btnSoldElsewhere.setBounds(417, 335, 112, 16);
		formToolkit.adapt(btnSoldElsewhere, true, true);
		
		text_10 = new Text(composite_3, SWT.BORDER);
		text_10.setBounds(523, 303, 90, 25);
		formToolkit.adapt(text_10, true, true);
		
		Button btnViewInvoice = new Button(composite_3, SWT.NONE);
		btnViewInvoice.setText("VIEW QUOTATION");
		btnViewInvoice.setBounds(268, 295, 104, 25);
		formToolkit.adapt(btnViewInvoice, true, true);
		
		Button btnViewSiteCheck = new Button(composite_3, SWT.NONE);
		btnViewSiteCheck.setText("VIEW SITE CHECK");
		btnViewSiteCheck.setBounds(268, 266, 104, 25);
		formToolkit.adapt(btnViewSiteCheck, true, true);
		
		Button btnSaveFollowUp = new Button(composite_3, SWT.NONE);
		btnSaveFollowUp.setBounds(488, 357, 125, 25);
		btnSaveFollowUp.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnSaveFollowUp.setText("SAVE FOLLOW UP");
		formToolkit.adapt(btnSaveFollowUp, true, true);
		
		Button button_4_1 = new Button(composite_3, SWT.NONE);
		button_4_1.setBounds(357, 357, 125, 25);
		button_4_1.setText("CANCEL");
		formToolkit.adapt(button_4_1, true, true);
		
		Label label_9 = new Label(composite_3, SWT.NONE);
		label_9.setText("Name:");
		label_9.setBounds(304, 13, 35, 15);
		formToolkit.adapt(label_9, true, true);
		
		Label label_12 = new Label(composite_3, SWT.NONE);
		label_12.setText("Site Address:");
		label_12.setBounds(304, 33, 67, 15);
		formToolkit.adapt(label_12, true, true);
		
		Label label_22 = new Label(composite_3, SWT.NONE);
		label_22.setText("Suburb:");
		label_22.setBounds(304, 53, 41, 15);
		formToolkit.adapt(label_22, true, true);
		
		Label label_23 = new Label(composite_3, SWT.NONE);
		label_23.setText("Postal Address:");
		label_23.setBounds(304, 73, 80, 15);
		formToolkit.adapt(label_23, true, true);
		
		Label label_24 = new Label(composite_3, SWT.NONE);
		label_24.setText("Suburb:");
		label_24.setBounds(304, 93, 41, 15);
		formToolkit.adapt(label_24, true, true);
		
		Label label_25 = new Label(composite_3, SWT.NONE);
		label_25.setText("Mobile:");
		label_25.setBounds(304, 113, 41, 15);
		formToolkit.adapt(label_25, true, true);
		
		Label label_26 = new Label(composite_3, SWT.NONE);
		label_26.setText("Phone:");
		label_26.setBounds(304, 134, 41, 15);
		formToolkit.adapt(label_26, true, true);
		
		Label label_27 = new Label(composite_3, SWT.NONE);
		label_27.setText("Email:");
		label_27.setBounds(304, 156, 32, 15);
		formToolkit.adapt(label_27, true, true);
		
		Label label_28 = new Label(composite_3, SWT.NONE);
		label_28.setText("Fire:");
		label_28.setBounds(304, 177, 67, 15);
		formToolkit.adapt(label_28, true, true);
		
		Label label_31 = new Label(composite_3, SWT.NONE);
		label_31.setText("Install Type:");
		label_31.setBounds(304, 201, 64, 15);
		formToolkit.adapt(label_31, true, true);
		
		Button btnViewPhoto = new Button(composite_3, SWT.NONE);
		btnViewPhoto.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnViewPhoto.setText("VIEW PHOTOS");
		btnViewPhoto.setBounds(268, 326, 104, 25);
		formToolkit.adapt(btnViewPhoto, true, true);
		
		TabItem tabItem = new TabItem(tabFolder, 0);
		tabItem.setText("Follow Ups");
		
		Composite composite_6 = new Composite(tabFolder, SWT.NONE);
		tabItem.setControl(composite_6);
		formToolkit.paintBordersFor(composite_6);
		
		Button button_6 = new Button(composite_6, SWT.NONE);
		button_6.setText("Refresh List");
		button_6.setBounds(10, 10, 275, 25);
		formToolkit.adapt(button_6, true, true);
		
		List list_5 = new List(composite_6, SWT.BORDER);
		list_5.setItems(new String[] {"Q1227    John & Mary Smith     52 Halifax Street\t", "Q1231    Joe Bloggs                    2 Sandford Rise", "Q1233    Kay Hall                        28 Becroft Lane", "", "", "", "      List of people who have received but not", "      accepted Quotes."});
		list_5.setBounds(10, 44, 275, 140);
		formToolkit.adapt(list_5, true, true);
		
		Label label_32 = new Label(composite_6, SWT.NONE);
		label_32.setText("Comment");
		label_32.setBounds(304, 222, 64, 15);
		formToolkit.adapt(label_32, true, true);
		
		text_21 = new Text(composite_6, SWT.BORDER);
		text_21.setBounds(385, 219, 227, 48);
		formToolkit.adapt(text_21, true, true);
		
		text_22 = new Text(composite_6, SWT.BORDER);
		text_22.setEditable(false);
		text_22.setBounds(385, 12, 227, 203);
		formToolkit.adapt(text_22, true, true);
		
		List list_6 = new List(composite_6, SWT.BORDER);
		list_6.setItems(new String[] {"16/05/17    Left voice message\t", "19/05/17    Spoke to Mark, call in 1 week", "", "", "", "      List of previous contacts"});
		list_6.setBounds(10, 222, 252, 160);
		formToolkit.adapt(list_6, true, true);
		
		DateTime dateTime_3 = new DateTime(composite_6, SWT.BORDER);
		dateTime_3.setBounds(523, 273, 90, 24);
		formToolkit.adapt(dateTime_3);
		formToolkit.paintBordersFor(dateTime_3);
		
		Button button_7 = new Button(composite_6, SWT.RADIO);
		button_7.setText("Next Follow Up");
		button_7.setSelection(true);
		button_7.setBounds(417, 273, 100, 16);
		formToolkit.adapt(button_7, true, true);
		
		Button button_9 = new Button(composite_6, SWT.RADIO);
		button_9.setText("Invoiced");
		button_9.setBounds(417, 305, 90, 16);
		formToolkit.adapt(button_9, true, true);
		
		Button button_10 = new Button(composite_6, SWT.RADIO);
		button_10.setText("Sold Elsewhere");
		button_10.setBounds(417, 335, 112, 16);
		formToolkit.adapt(button_10, true, true);
		
		text_23 = new Text(composite_6, SWT.BORDER);
		text_23.setBounds(523, 303, 90, 25);
		formToolkit.adapt(text_23, true, true);
		
		Button button_11 = new Button(composite_6, SWT.NONE);
		button_11.setText("VIEW QUOTATION");
		button_11.setBounds(268, 295, 104, 25);
		formToolkit.adapt(button_11, true, true);
		
		Button button_12 = new Button(composite_6, SWT.NONE);
		button_12.setText("VIEW SITE CHECK");
		button_12.setBounds(268, 266, 104, 25);
		formToolkit.adapt(button_12, true, true);
		
		Button button_13 = new Button(composite_6, SWT.NONE);
		button_13.setText("SAVE FOLLOW UP");
		button_13.setBounds(488, 357, 125, 25);
		formToolkit.adapt(button_13, true, true);
		
		Button button_14 = new Button(composite_6, SWT.NONE);
		button_14.setText("CANCEL");
		button_14.setBounds(357, 357, 125, 25);
		formToolkit.adapt(button_14, true, true);
		
		Label label_33 = new Label(composite_6, SWT.NONE);
		label_33.setText("Name:");
		label_33.setBounds(304, 13, 35, 15);
		formToolkit.adapt(label_33, true, true);
		
		Label label_34 = new Label(composite_6, SWT.NONE);
		label_34.setText("Site Address:");
		label_34.setBounds(304, 33, 67, 15);
		formToolkit.adapt(label_34, true, true);
		
		Label label_35 = new Label(composite_6, SWT.NONE);
		label_35.setText("Suburb:");
		label_35.setBounds(304, 53, 41, 15);
		formToolkit.adapt(label_35, true, true);
		
		Label label_36 = new Label(composite_6, SWT.NONE);
		label_36.setText("Postal Address:");
		label_36.setBounds(304, 73, 80, 15);
		formToolkit.adapt(label_36, true, true);
		
		Label label_37 = new Label(composite_6, SWT.NONE);
		label_37.setText("Suburb:");
		label_37.setBounds(304, 93, 41, 15);
		formToolkit.adapt(label_37, true, true);
		
		Label label_38 = new Label(composite_6, SWT.NONE);
		label_38.setText("Mobile:");
		label_38.setBounds(304, 113, 41, 15);
		formToolkit.adapt(label_38, true, true);
		
		Label label_39 = new Label(composite_6, SWT.NONE);
		label_39.setText("Phone:");
		label_39.setBounds(304, 134, 41, 15);
		formToolkit.adapt(label_39, true, true);
		
		Label label_40 = new Label(composite_6, SWT.NONE);
		label_40.setText("Email:");
		label_40.setBounds(304, 156, 32, 15);
		formToolkit.adapt(label_40, true, true);
		
		Label label_41 = new Label(composite_6, SWT.NONE);
		label_41.setText("Fire:");
		label_41.setBounds(304, 177, 67, 15);
		formToolkit.adapt(label_41, true, true);
		
		Label label_42 = new Label(composite_6, SWT.NONE);
		label_42.setText("Install Type:");
		label_42.setBounds(304, 201, 64, 15);
		formToolkit.adapt(label_42, true, true);
		
		Button button_15 = new Button(composite_6, SWT.NONE);
		button_15.setText("VIEW PHOTOS");
		button_15.setBounds(268, 326, 104, 25);
		formToolkit.adapt(button_15, true, true);
		
		

	}
}
