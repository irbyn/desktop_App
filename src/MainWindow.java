import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
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

public class MainWindow {

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
	private Text txtSiteCheck;
	private Text txtQuote;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MainWindow window = new MainWindow();
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
		shell.setSize(700, 600);
		shell.setText("Application Name");
		
		Button btnSchedule = new Button(shell, SWT.NONE);
		btnSchedule.setText("SCHEDULE");
		btnSchedule.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnSchedule.setBounds(10, 22, 210, 25);
		
		Button btnSales = new Button(shell, SWT.NONE);
		btnSales.setText("SALES");
		btnSales.setBounds(236, 22, 210, 25);
		
		Button btnInstalls = new Button(shell, SWT.NONE);
		btnInstalls.setText("INSTALLS");
		btnInstalls.setBounds(465, 22, 210, 25);
		
		
		
		TabFolder tabFolder = new TabFolder(shell, SWT.NONE);
		tabFolder.setBounds(10, 79, 645, 420);
		
		TabItem tbtmNewItem = new TabItem(tabFolder, SWT.NONE);
		tbtmNewItem.setText("First Contact");
		
		Composite composite = new Composite(tabFolder, SWT.NONE);
		tbtmNewItem.setControl(composite);
		
		List list_1 = new List(composite, SWT.BORDER);
		list_1.setItems(new String[] {"John & Mary Smith     52 Halifax Street\t", "Joe Bloggs                    2 Sandford Rise", "Kay Hall                        28 Becroft Lane", "", "", "", "", "", "", "      List of people who have entered ", "      details but not been sent an email"});
		list_1.setBounds(10, 44, 220, 338);
		
		text = new Text(composite, SWT.BORDER);
		text.setEditable(false);
		text.setBounds(375, 10, 238, 185);
		
		Label lblNewLabel = new Label(composite, SWT.NONE);
		lblNewLabel.setBounds(291, 10, 78, 15);
		lblNewLabel.setText("Name");
		
		Label lblAddress = new Label(composite, SWT.NONE);
		lblAddress.setText("Site Address");
		lblAddress.setBounds(291, 31, 78, 15);
		
		Label lblSuburb = new Label(composite, SWT.NONE);
		lblSuburb.setText("Suburb");
		lblSuburb.setBounds(291, 48, 78, 15);
		
		Label lblSiteAddress = new Label(composite, SWT.NONE);
		lblSiteAddress.setText("Postal Address");
		lblSiteAddress.setBounds(291, 85, 78, 15);
		
		Label lblSuburb_1 = new Label(composite, SWT.NONE);
		lblSuburb_1.setText("Suburb");
		lblSuburb_1.setBounds(291, 106, 78, 15);
		
		Label lblMobile = new Label(composite, SWT.NONE);
		lblMobile.setText("Mobile");
		lblMobile.setBounds(291, 127, 78, 15);
		
		Label lblPhone = new Label(composite, SWT.NONE);
		lblPhone.setText("Phone");
		lblPhone.setBounds(291, 148, 78, 15);
		
		Label lblEmail = new Label(composite, SWT.NONE);
		lblEmail.setText("email");
		lblEmail.setBounds(291, 169, 78, 15);
		
		Button btnNewButton = new Button(composite, SWT.NONE);
		btnNewButton.setBounds(10, 10, 220, 25);
		btnNewButton.setText("Refresh List");
		
		text_9 = new Text(composite, SWT.BORDER);
		text_9.setBounds(523, 211, 90, 21);
		
		Label lblInstallType = new Label(composite, SWT.NONE);
		lblInstallType.setText("Price");
		lblInstallType.setBounds(485, 214, 32, 15);
		
		Label label = new Label(composite, SWT.NONE);
		label.setText("Install Type");
		label.setBounds(291, 243, 64, 15);
		
		text_8 = new Text(composite, SWT.BORDER);
		text_8.setBounds(375, 211, 90, 21);
		
		Label lblFire = new Label(composite, SWT.NONE);
		lblFire.setText("Fire");
		lblFire.setBounds(291, 214, 64, 15);
		
		Combo combo = new Combo(composite, SWT.NONE);
		combo.setBounds(375, 243, 238, 23);
		
		Label lblSiteCheck = new Label(composite, SWT.NONE);
		lblSiteCheck.setText("Site Check");
		lblSiteCheck.setBounds(291, 279, 64, 15);
		
		DateTime dateTime = new DateTime(composite, SWT.BORDER);
		dateTime.setBounds(523, 272, 90, 24);
		
		DateTime dateTime_1 = new DateTime(composite, SWT.BORDER | SWT.TIME);
		dateTime_1.setBounds(428, 272, 90, 24);
		
		Button btnCheckButton = new Button(composite, SWT.CHECK);
		btnCheckButton.setBounds(358, 272, 64, 16);
		btnCheckButton.setText("To Book");
		
		Button btnNewButton_1 = new Button(composite, SWT.NONE);
		btnNewButton_1.setBounds(499, 364, 114, 25);
		btnNewButton_1.setText("Send Email");
		
		Label lblPersonalNote = new Label(composite, SWT.NONE);
		lblPersonalNote.setText("Personal Note");
		lblPersonalNote.setBounds(291, 305, 78, 25);
		
		text_1 = new Text(composite, SWT.BORDER);
		text_1.setBounds(375, 302, 238, 25);
		
		Label lblSalesPerson = new Label(composite, SWT.NONE);
		lblSalesPerson.setText("Sales Person");
		lblSalesPerson.setBounds(291, 336, 78, 25);
		
		Button btnSaveDetails = new Button(composite, SWT.NONE);
		btnSaveDetails.setText("Save Details");
		btnSaveDetails.setBounds(375, 364, 114, 25);
		formToolkit.adapt(btnSaveDetails, true, true);
		
		Combo combo_1 = new Combo(composite, SWT.NONE);
		combo_1.setBounds(375, 333, 238, 23);
		formToolkit.adapt(combo_1);
		formToolkit.paintBordersFor(combo_1);
		
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
		text_2.setBounds(375, 10, 238, 240);
		
		Label label_1 = new Label(composite_4, SWT.NONE);
		label_1.setText("Name");
		label_1.setBounds(291, 10, 78, 15);
		
		Label label_2 = new Label(composite_4, SWT.NONE);
		label_2.setText("Site Address");
		label_2.setBounds(291, 31, 78, 15);
		
		Label label_3 = new Label(composite_4, SWT.NONE);
		label_3.setText("Suburb");
		label_3.setBounds(291, 48, 78, 15);
		
		Label label_4 = new Label(composite_4, SWT.NONE);
		label_4.setText("Postal Address");
		label_4.setBounds(291, 85, 78, 15);
		
		Label label_5 = new Label(composite_4, SWT.NONE);
		label_5.setText("Suburb");
		label_5.setBounds(291, 106, 78, 15);
		
		Label label_6 = new Label(composite_4, SWT.NONE);
		label_6.setText("Mobile");
		label_6.setBounds(291, 127, 78, 15);
		
		Label label_7 = new Label(composite_4, SWT.NONE);
		label_7.setText("Phone");
		label_7.setBounds(291, 148, 78, 15);
		
		Label label_8 = new Label(composite_4, SWT.NONE);
		label_8.setText("email");
		label_8.setBounds(291, 169, 78, 15);
		
		Button button = new Button(composite_4, SWT.NONE);
		button.setText("Refresh List");
		button.setBounds(10, 10, 220, 25);
		
		Label label_10 = new Label(composite_4, SWT.NONE);
		label_10.setText("Install Type");
		label_10.setBounds(291, 211, 64, 15);
		
		Label label_11 = new Label(composite_4, SWT.NONE);
		label_11.setText("Fire");
		label_11.setBounds(291, 190, 64, 15);
		
		Label lblSiteCheckBooking = new Label(composite_4, SWT.NONE);
		lblSiteCheckBooking.setText("Site Check Booking");
		lblSiteCheckBooking.setBounds(291, 279, 130, 15);
		
		Button btnSaveBooking = new Button(composite_4, SWT.NONE);
		btnSaveBooking.setText("Save Booking");
		btnSaveBooking.setBounds(375, 357, 238, 25);
		
		Label lblEstimateTotal = new Label(composite_4, SWT.NONE);
		lblEstimateTotal.setText("Estimate Total");
		lblEstimateTotal.setBounds(291, 235, 78, 15);
		
		DateTime dateTime_4 = new DateTime(composite_4, SWT.BORDER);
		dateTime_4.setBounds(523, 279, 90, 24);
		
		DateTime dateTime_5 = new DateTime(composite_4, SWT.BORDER | SWT.TIME);
		dateTime_5.setBounds(427, 279, 90, 24);
		
		TabItem tbtmNewItem_2 = new TabItem(tabFolder, SWT.NONE);
		tbtmNewItem_2.setText("Quotes");
		
		Composite composite_2 = new Composite(tabFolder, SWT.NONE);
		tbtmNewItem_2.setControl(composite_2);
		
		Button btnSaveQuoteDetails = new Button(composite_2, SWT.NONE);
		btnSaveQuoteDetails.setText("Save Quote Details");
		btnSaveQuoteDetails.setBounds(488, 357, 125, 25);
		
		text_3 = new Text(composite_2, SWT.BORDER);
		text_3.setEditable(false);
		text_3.setBounds(375, 10, 238, 203);
		
		Label label_13 = new Label(composite_2, SWT.NONE);
		label_13.setText("Fire");
		label_13.setBounds(291, 190, 64, 15);
		
		Label label_14 = new Label(composite_2, SWT.NONE);
		label_14.setText("email");
		label_14.setBounds(291, 169, 78, 15);
		
		Label label_15 = new Label(composite_2, SWT.NONE);
		label_15.setText("Phone");
		label_15.setBounds(291, 148, 78, 15);
		
		Label label_16 = new Label(composite_2, SWT.NONE);
		label_16.setText("Mobile");
		label_16.setBounds(291, 127, 78, 15);
		
		Label label_17 = new Label(composite_2, SWT.NONE);
		label_17.setText("Suburb");
		label_17.setBounds(291, 106, 78, 15);
		
		Label label_18 = new Label(composite_2, SWT.NONE);
		label_18.setText("Postal Address");
		label_18.setBounds(291, 85, 78, 15);
		
		Label label_19 = new Label(composite_2, SWT.NONE);
		label_19.setText("Suburb");
		label_19.setBounds(291, 48, 78, 15);
		
		Label label_20 = new Label(composite_2, SWT.NONE);
		label_20.setText("Site Address");
		label_20.setBounds(291, 31, 78, 15);
		
		Label label_21 = new Label(composite_2, SWT.NONE);
		label_21.setText("Name");
		label_21.setBounds(291, 10, 78, 15);
		
		Button button_2 = new Button(composite_2, SWT.NONE);
		button_2.setText("Refresh List");
		button_2.setBounds(10, 10, 275, 25);
		
		List list_3 = new List(composite_2, SWT.BORDER);
		list_3.setItems(new String[] {"15/06/17    John & Mary Smith     52 Halifax Street\t", "15/06/17    Joe Bloggs                    2 Sandford Rise", "16/06/17    Kay Hall                        28 Becroft Lane", "", "", "", "", "", "", "      List of people who have passed sitecheck", "      day but not had a quote entered."});
		list_3.setBounds(10, 44, 275, 338);
		
		Label lblReesCode = new Label(composite_2, SWT.NONE);
		lblReesCode.setText("Rees Code");
		lblReesCode.setBounds(291, 222, 64, 15);
		
		text_4 = new Text(composite_2, SWT.BORDER);
		text_4.setBounds(361, 219, 90, 21);
		
		Label lblQuote = new Label(composite_2, SWT.NONE);
		lblQuote.setText("Quote #");
		lblQuote.setBounds(469, 222, 48, 15);
		
		text_5 = new Text(composite_2, SWT.BORDER);
		text_5.setBounds(523, 219, 90, 21);
		
		txtPdfFile = new Text(composite_2, SWT.BORDER);
		txtPdfFile.setText("PDF FILE");
		txtPdfFile.setBounds(361, 258, 90, 81);
		formToolkit.adapt(txtPdfFile, true, true);
		
		Label lblSiteCheck_1 = new Label(composite_2, SWT.NONE);
		lblSiteCheck_1.setText("Site Check");
		lblSiteCheck_1.setBounds(291, 258, 64, 15);
		formToolkit.adapt(lblSiteCheck_1, true, true);
		
		Label lblQuote_1 = new Label(composite_2, SWT.NONE);
		lblQuote_1.setText("Quote");
		lblQuote_1.setBounds(474, 258, 43, 15);
		formToolkit.adapt(lblQuote_1, true, true);
		
		txtPdfFile_1 = new Text(composite_2, SWT.BORDER);
		txtPdfFile_1.setText("PDF FILE");
		txtPdfFile_1.setBounds(523, 258, 90, 81);
		formToolkit.adapt(txtPdfFile_1, true, true);
		
		Button btnEmailQuote = new Button(composite_2, SWT.NONE);
		btnEmailQuote.setText("Email Quote?");
		btnEmailQuote.setBounds(357, 357, 125, 25);
		formToolkit.adapt(btnEmailQuote, true, true);
		
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
		
		Label label_9 = new Label(composite_3, SWT.NONE);
		label_9.setText("Name");
		label_9.setBounds(291, 10, 78, 15);
		formToolkit.adapt(label_9, true, true);
		
		Label label_12 = new Label(composite_3, SWT.NONE);
		label_12.setText("Site Address");
		label_12.setBounds(291, 31, 78, 15);
		formToolkit.adapt(label_12, true, true);
		
		Label label_22 = new Label(composite_3, SWT.NONE);
		label_22.setText("Suburb");
		label_22.setBounds(291, 48, 78, 15);
		formToolkit.adapt(label_22, true, true);
		
		Label label_23 = new Label(composite_3, SWT.NONE);
		label_23.setText("Postal Address");
		label_23.setBounds(291, 85, 78, 15);
		formToolkit.adapt(label_23, true, true);
		
		Label label_24 = new Label(composite_3, SWT.NONE);
		label_24.setText("Suburb");
		label_24.setBounds(291, 106, 78, 15);
		formToolkit.adapt(label_24, true, true);
		
		Label label_25 = new Label(composite_3, SWT.NONE);
		label_25.setText("Mobile");
		label_25.setBounds(291, 127, 78, 15);
		formToolkit.adapt(label_25, true, true);
		
		Label label_26 = new Label(composite_3, SWT.NONE);
		label_26.setText("Phone");
		label_26.setBounds(291, 148, 78, 15);
		formToolkit.adapt(label_26, true, true);
		
		Label label_27 = new Label(composite_3, SWT.NONE);
		label_27.setText("email");
		label_27.setBounds(291, 169, 78, 15);
		formToolkit.adapt(label_27, true, true);
		
		Label label_28 = new Label(composite_3, SWT.NONE);
		label_28.setText("Fire");
		label_28.setBounds(291, 190, 64, 15);
		formToolkit.adapt(label_28, true, true);
		
		Label lblComment = new Label(composite_3, SWT.NONE);
		lblComment.setText("Comment");
		lblComment.setBounds(347, 222, 64, 15);
		formToolkit.adapt(lblComment, true, true);
		
		text_7 = new Text(composite_3, SWT.BORDER);
		text_7.setBounds(417, 219, 195, 48);
		formToolkit.adapt(text_7, true, true);
		
		Button btnSaveComment = new Button(composite_3, SWT.NONE);
		btnSaveComment.setText("Save Follow Up");
		btnSaveComment.setBounds(417, 357, 195, 25);
		formToolkit.adapt(btnSaveComment, true, true);
		
		text_13 = new Text(composite_3, SWT.BORDER);
		text_13.setEditable(false);
		text_13.setBounds(374, 12, 238, 203);
		formToolkit.adapt(text_13, true, true);
		
		List list_4 = new List(composite_3, SWT.BORDER);
		list_4.setItems(new String[] {"16/05/17    Left voice message\t", "19/05/17    Spoke to Mark, call in 1 week", "", "", "", "      List of previous contacts"});
		list_4.setBounds(10, 222, 275, 160);
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
		
		txtSiteCheck = new Text(composite_3, SWT.BORDER);
		txtSiteCheck.setText("Site Check");
		txtSiteCheck.setBounds(319, 252, 63, 58);
		formToolkit.adapt(txtSiteCheck, true, true);
		
		txtQuote = new Text(composite_3, SWT.BORDER);
		txtQuote.setText("QUOTE");
		txtQuote.setBounds(319, 324, 63, 58);
		formToolkit.adapt(txtQuote, true, true);
		
		

	}
}
