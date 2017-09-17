import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;

import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;

import java.io.File;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

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
import org.eclipse.wb.swt.SWTResourceManager;

public class InstallPrototype {

	protected Shell shell;
	private Text text;
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	private Text text_1;
	private Text text_2;
	private Text text_4;
	private Text text_5;
	private Text text_7;
	private Text text_10;
	private Text text_11;
	private Text text_6;
	private Text text_8;
	private Text text_9;
	private Text text_12;
	private Text text_14;
	private Text text_15;
	private Text text_16;
	private Text text_3;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
        //Look and feel
        try {UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());}
        catch (ClassNotFoundException e) {}
        catch (InstantiationException e) {}
        catch (IllegalAccessException e) {}
        catch (UnsupportedLookAndFeelException e) {}
        
		try {
			InstallPrototype window = new InstallPrototype();
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
		tbtmNewItem_1.setText("Load Documents");
		
		Composite composite_1 = new Composite(tabFolder, SWT.NONE);
		tbtmNewItem_1.setControl(composite_1);
		
		Composite composite_4 = new Composite(composite_1, SWT.NONE);
		composite_4.setBounds(0, 0, 637, 392);
		
		List list_2 = new List(composite_4, SWT.BORDER);
		list_2.setItems(new String[] {"4233       John & Mary Smith     52 Halifax Street        \tSite Check             No Invoice       No Photo", "4237       Joe Bloggs                    2 Sandford Rise          No Site Check      Invoice             Elevation", "4241       Kay Hall                        28 Becroft Lane          Site Check             Invoice             Elevation", "", "", "", "", "", "                    List of people who have been Invoiced but are missing Site check or Invoice copy or Elevation photo"});
		list_2.setBounds(10, 35, 603, 160);
		formToolkit.adapt(list_2, true, true);
		
		text_2 = new Text(composite_4, SWT.BORDER);
		text_2.setEditable(false);
		text_2.setBounds(94, 201, 161, 145);
		formToolkit.adapt(text_2, true, true);
		
		Label lblInvoice = new Label(composite_4, SWT.NONE);
		lblInvoice.setText("Invoice");
		lblInvoice.setAlignment(SWT.CENTER);
		lblInvoice.setBounds(385, 210, 74, 15);
		formToolkit.adapt(lblInvoice, true, true);
		
		Label label_16 = new Label(composite_4, SWT.NONE);
		label_16.setText("Photo");
		label_16.setAlignment(SWT.CENTER);
		label_16.setBounds(542, 210, 69, 15);
		formToolkit.adapt(label_16, true, true);
		
		text_7 = new Text(composite_4, SWT.BORDER);
		text_7.setText("IMAGE FILE");
		text_7.setBounds(540, 231, 73, 67);
		formToolkit.adapt(text_7, true, true);
		
		text_10 = new Text(composite_4, SWT.BORDER);
		text_10.setText("PDF FILE");
		text_10.setBounds(465, 231, 71, 67);
		formToolkit.adapt(text_10, true, true);
		
		text_11 = new Text(composite_4, SWT.BORDER);
		text_11.setText("PDF FILE");
		text_11.setBounds(385, 231, 74, 67);
		formToolkit.adapt(text_11, true, true);
		
		Label label_6 = new Label(composite_4, SWT.NONE);
		label_6.setText("Site Check");
		label_6.setAlignment(SWT.CENTER);
		label_6.setBounds(465, 210, 74, 15);
		formToolkit.adapt(label_6, true, true);
		
		Label label_12 = new Label(composite_4, SWT.NONE);
		label_12.setText("Name:");
		label_12.setBounds(20, 201, 68, 15);
		formToolkit.adapt(label_12, true, true);
		
		Label label_15 = new Label(composite_4, SWT.NONE);
		label_15.setText("Site Address:");
		label_15.setBounds(20, 221, 67, 15);
		formToolkit.adapt(label_15, true, true);
		
		Label label_17 = new Label(composite_4, SWT.NONE);
		label_17.setText("Suburb:");
		label_17.setBounds(20, 241, 41, 15);
		formToolkit.adapt(label_17, true, true);
		
		Label label_18 = new Label(composite_4, SWT.NONE);
		label_18.setText("Mobile:");
		label_18.setBounds(20, 262, 37, 15);
		formToolkit.adapt(label_18, true, true);
		
		Label label_19 = new Label(composite_4, SWT.NONE);
		label_19.setText("Phone:");
		label_19.setBounds(20, 283, 41, 15);
		formToolkit.adapt(label_19, true, true);
		
		Label label_20 = new Label(composite_4, SWT.NONE);
		label_20.setText("Email:");
		label_20.setBounds(20, 305, 32, 15);
		formToolkit.adapt(label_20, true, true);
		
		Label lblReesCode = new Label(composite_4, SWT.NONE);
		lblReesCode.setText("REES Code:");
		lblReesCode.setBounds(20, 326, 67, 15);
		formToolkit.adapt(lblReesCode, true, true);
		
		Button button_12 = new Button(composite_4, SWT.NONE);
		button_12.setText("CANCEL");
		button_12.setBounds(371, 357, 125, 25);
		formToolkit.adapt(button_12, true, true);
		
		Button btnSaveDocuments = new Button(composite_4, SWT.NONE);
		btnSaveDocuments.setText("SAVE DOCUMENTS");
		btnSaveDocuments.setBounds(502, 357, 125, 25);
		formToolkit.adapt(btnSaveDocuments, true, true);
		
		TabItem tbtmNewItem = new TabItem(tabFolder, SWT.NONE);
		tbtmNewItem.setText("Check for Orders");
		
		Composite composite = new Composite(tabFolder, SWT.NONE);
		composite.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.NORMAL));
		tbtmNewItem.setControl(composite);
		
		List list_1 = new List(composite, SWT.BORDER);
		list_1.setItems(new String[] {"4233       John & Mary Smith     52 Halifax Street        \tSite Check             No Invoice       No Photo", "4237       Joe Bloggs                    2 Sandford Rise          No Site Check      Invoice             Elevation", "4241       Kay Hall                        28 Becroft Lane          Site Check             Invoice             Elevation", "", "", "", "", "", "                        List of people who have been Invoiced but not checked for orders"});
		list_1.setBounds(10, 10, 603, 159);
		
		text = new Text(composite, SWT.BORDER);
		text.setEditable(false);
		text.setBounds(83, 175, 151, 145);
		
		Composite composite_5 = new Composite(composite, SWT.NONE);
		composite_5.setBounds(240, 175, 373, 211);
		formToolkit.adapt(composite_5);
		formToolkit.paintBordersFor(composite_5);
		
		List list_5 = new List(composite_5, SWT.BORDER | SWT.V_SCROLL | SWT.MULTI);
		list_5.setBounds(0, 0, 227, 164);
		list_5.setItems(new String[] {"1      JAYLINE FR300 FS C/A MET BLACK WITH ASHPAN 16KW (NEW)", "1      JAYLINE 4.2M F/S FLUE KIT MKII INCL. DOUBLE FLUE SHIELD", "1      Soaker DEKTITE Grey EPDM 255-410mm Roof Pitch >20 DEGREES", "1      S/S Flue Pipe - 150 x 1200mm", "1      Galv Outer Casing 250 x 1200MM", "1      BETHIAN HEARTH ASH - S/S TRIM - TILES - CORNER", "", "1      Delivery of Hardware - Auck Area", "1      Standard Installation Fee - Registered NZHHA Member 2 PERSON", "1      Auckland Council Consent & Code Compliance Certification"});
		formToolkit.adapt(list_5, true, true);
		
		text_1 = new Text(composite_5, SWT.BORDER);
		text_1.setBounds(324, 0, 45, 16);
		formToolkit.adapt(text_1, true, true);
		
		Button btnOrderChecked = new Button(composite_5, SWT.CHECK);
		btnOrderChecked.setText("Order Checked");
		btnOrderChecked.setBounds(238, 164, 129, 16);
		formToolkit.adapt(btnOrderChecked, true, true);
		
		Button btnSaveOrders = new Button(composite_5, SWT.NONE);
		btnSaveOrders.setText("SAVE ORDERS");
		btnSaveOrders.setBounds(238, 186, 125, 25);
		formToolkit.adapt(btnSaveOrders, true, true);
		
		Button button_13 = new Button(composite_5, SWT.NONE);
		button_13.setText("CANCEL");
		button_13.setBounds(107, 186, 125, 25);
		formToolkit.adapt(button_13, true, true);
		
		Combo combo_4 = new Combo(composite_5, SWT.NONE);
		combo_4.setItems(new String[] {"Order Part", "In Stock", "Remove Line"});
		combo_4.setBounds(233, 0, 85, 23);
		formToolkit.adapt(combo_4);
		formToolkit.paintBordersFor(combo_4);
		combo_4.setText("Order Part\r\nIn Stock\r\nRemove Line");
		combo_4.select(0);
		
		text_6 = new Text(composite_5, SWT.BORDER);
		text_6.setBounds(324, 19, 45, 16);
		formToolkit.adapt(text_6, true, true);
		
		text_8 = new Text(composite_5, SWT.BORDER);
		text_8.setBounds(324, 36, 45, 16);
		formToolkit.adapt(text_8, true, true);
		
		Combo combo_5 = new Combo(composite_5, SWT.NONE);
		combo_5.setItems(new String[] {"Order Part", "In Stock", "Remove Line"});
		combo_5.setBounds(233, 19, 85, 23);
		formToolkit.adapt(combo_5);
		formToolkit.paintBordersFor(combo_5);
		combo_5.setText("Order Part\r\nIn Stock\r\nRemove Line");
		combo_5.select(1);
		
		Combo combo_6 = new Combo(composite_5, SWT.NONE);
		combo_6.setItems(new String[] {"Order Part", "In Stock", "Remove Line"});
		combo_6.setBounds(233, 39, 85, 23);
		formToolkit.adapt(combo_6);
		formToolkit.paintBordersFor(combo_6);
		combo_6.setText("Order Part\r\nIn Stock\r\nRemove Line");
		combo_6.select(1);
		
		Combo combo_7 = new Combo(composite_5, SWT.NONE);
		combo_7.setItems(new String[] {"Order Part", "In Stock", "Remove Line"});
		combo_7.setBounds(233, 58, 85, 23);
		formToolkit.adapt(combo_7);
		formToolkit.paintBordersFor(combo_7);
		combo_7.setText("Order Part\r\nIn Stock\r\nRemove Line");
		combo_7.select(1);
		
		text_9 = new Text(composite_5, SWT.BORDER);
		text_9.setBounds(324, 58, 45, 16);
		formToolkit.adapt(text_9, true, true);
		
		text_12 = new Text(composite_5, SWT.BORDER);
		text_12.setBounds(324, 77, 45, 16);
		formToolkit.adapt(text_12, true, true);
		
		Combo combo_8 = new Combo(composite_5, SWT.NONE);
		combo_8.setItems(new String[] {"Order Part", "In Stock", "Remove Line"});
		combo_8.setBounds(233, 77, 85, 23);
		formToolkit.adapt(combo_8);
		formToolkit.paintBordersFor(combo_8);
		combo_8.setText("Order Part\r\nIn Stock\r\nRemove Line");
		combo_8.select(0);
		
		Combo combo_10 = new Combo(composite_5, SWT.NONE);
		combo_10.setItems(new String[] {"Order Part", "In Stock", "Remove Line"});
		combo_10.setBounds(233, 99, 85, 23);
		formToolkit.adapt(combo_10);
		formToolkit.paintBordersFor(combo_10);
		combo_10.setText("Order Part\r\nIn Stock\r\nRemove Line");
		combo_10.select(2);
		
		text_14 = new Text(composite_5, SWT.BORDER);
		text_14.setBounds(324, 99, 45, 16);
		formToolkit.adapt(text_14, true, true);
		
		text_15 = new Text(composite_5, SWT.BORDER);
		text_15.setBounds(324, 118, 45, 16);
		formToolkit.adapt(text_15, true, true);
		
		Combo combo_11 = new Combo(composite_5, SWT.NONE);
		combo_11.setItems(new String[] {"Order Part", "In Stock", "Remove Line"});
		combo_11.setBounds(233, 118, 85, 23);
		formToolkit.adapt(combo_11);
		formToolkit.paintBordersFor(combo_11);
		combo_11.setText("Order Part\r\nIn Stock\r\nRemove Line");
		combo_11.select(2);
		
		Combo combo_12 = new Combo(composite_5, SWT.NONE);
		combo_12.setItems(new String[] {"Order Part", "In Stock", "Remove Line"});
		combo_12.setBounds(233, 138, 85, 23);
		formToolkit.adapt(combo_12);
		formToolkit.paintBordersFor(combo_12);
		combo_12.setText("Order Part\r\nIn Stock\r\nRemove Line");
		combo_12.select(2);
		
		text_16 = new Text(composite_5, SWT.BORDER);
		text_16.setBounds(324, 135, 45, 16);
		formToolkit.adapt(text_16, true, true);
		
		Button btnInvoice = new Button(composite, SWT.NONE);
		btnInvoice.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnInvoice.setText("VIEW INVOICE");
		btnInvoice.setBounds(20, 326, 104, 25);
		formToolkit.adapt(btnInvoice, true, true);
		
		Label label = new Label(composite, SWT.NONE);
		label.setText("Name:");
		label.setBounds(10, 175, 35, 15);
		formToolkit.adapt(label, true, true);
		
		Label label_1 = new Label(composite, SWT.NONE);
		label_1.setText("Site Address:");
		label_1.setBounds(10, 195, 67, 15);
		formToolkit.adapt(label_1, true, true);
		
		Label label_2 = new Label(composite, SWT.NONE);
		label_2.setText("Suburb:");
		label_2.setBounds(10, 215, 41, 15);
		formToolkit.adapt(label_2, true, true);
		
		Label label_3 = new Label(composite, SWT.NONE);
		label_3.setText("Mobile:");
		label_3.setBounds(10, 236, 37, 15);
		formToolkit.adapt(label_3, true, true);
		
		Label label_4 = new Label(composite, SWT.NONE);
		label_4.setText("Phone:");
		label_4.setBounds(10, 257, 41, 15);
		formToolkit.adapt(label_4, true, true);
		
		Label label_5 = new Label(composite, SWT.NONE);
		label_5.setText("Email:");
		label_5.setBounds(10, 279, 32, 15);
		formToolkit.adapt(label_5, true, true);
		
		Label label_21 = new Label(composite, SWT.NONE);
		label_21.setText("REES Code:");
		label_21.setBounds(10, 300, 67, 15);
		formToolkit.adapt(label_21, true, true);
		
		Button button = new Button(composite, SWT.NONE);
		button.setText("VIEW SITE CHECK");
		button.setBounds(130, 326, 104, 25);
		formToolkit.adapt(button, true, true);
		
		Button btnViewPhoto = new Button(composite, SWT.NONE);
		btnViewPhoto.setText("VIEW PHOTO");
		btnViewPhoto.setBounds(20, 357, 104, 25);
		formToolkit.adapt(btnViewPhoto, true, true);
		
		TabItem tbtmNewItem_2 = new TabItem(tabFolder, SWT.NONE);
		tbtmNewItem_2.setText("Place Orders");
		
		Composite composite_2 = new Composite(tabFolder, SWT.NONE);
		tbtmNewItem_2.setControl(composite_2);
		
		List list_3 = new List(composite_2, SWT.BORDER);
		list_3.setItems(new String[] {"4233       JAY-FR300CABKM6       JAYLINE FR300 FS C/A MET BLACK WITH ASHPAN (NEW)     John & Mary Smith     52 Halifax Street", "4233       HTH-BETHIAN              BETHIAN HEARTH ASH - S/S TRIM - TILES - CORNER             John & Mary Smith     52 Halifax Street", "4237       JAY-SPTFSCABKS3        JAYLINE SPITFIRE FS C/A BLACK 19KW                                       Joe Bloggs                    2 Sandford Rise ", "4241       3063                                Woodsman FLARE - BOX (Charcoal/Pewter)                              Kay Hall                        28 Becroft Lane          ", "", "", "", "", "                        List of orders not yet recorded"});
		list_3.setBounds(10, 36, 613, 139);
		formToolkit.adapt(list_3, true, true);
		
		Combo combo = new Combo(composite_2, SWT.NONE);
		combo.setBounds(65, 7, 122, 23);
		combo.setItems(new String[] {"Invoice", "Code", "Description", "Customer"});
		formToolkit.adapt(combo);
		formToolkit.paintBordersFor(combo);
		combo.select(0);
		
		Label lblSortBy = new Label(composite_2, SWT.NONE);
		lblSortBy.setText("Sort By:");
		lblSortBy.setBounds(10, 10, 55, 15);
		formToolkit.adapt(lblSortBy, true, true);
		
		List list_6 = new List(composite_2, SWT.BORDER);
		list_6.setItems(new String[] {"4233       JAY-FR300CABKM6       JAYLINE FR300 FS C/A MET BLACK WITH ASHPAN (NEW)     ", "4237       JAY-SPTFSCABKS3        JAYLINE SPITFIRE FS C/A BLACK 19KW                              "});
		list_6.setBounds(282, 181, 341, 79);
		formToolkit.adapt(list_6, true, true);
		
		Button btnRecordPo = new Button(composite_2, SWT.NONE);
		btnRecordPo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnRecordPo.setText("RECORD PO");
		btnRecordPo.setBounds(498, 357, 125, 25);
		formToolkit.adapt(btnRecordPo, true, true);
		
		text_4 = new Text(composite_2, SWT.BORDER);
		text_4.setBounds(483, 278, 140, 21);
		formToolkit.adapt(text_4, true, true);
		
		Label lblOrderNumber = new Label(composite_2, SWT.NONE);
		lblOrderNumber.setText("Order Number");
		lblOrderNumber.setBounds(392, 281, 85, 15);
		formToolkit.adapt(lblOrderNumber, true, true);
		
		Label label_7 = new Label(composite_2, SWT.NONE);
		label_7.setText("Name:");
		label_7.setBounds(10, 185, 35, 15);
		formToolkit.adapt(label_7, true, true);
		
		Label label_8 = new Label(composite_2, SWT.NONE);
		label_8.setText("Site Address:");
		label_8.setBounds(10, 205, 67, 15);
		formToolkit.adapt(label_8, true, true);
		
		Label label_10 = new Label(composite_2, SWT.NONE);
		label_10.setText("Suburb:");
		label_10.setBounds(10, 225, 41, 15);
		formToolkit.adapt(label_10, true, true);
		
		Label label_11 = new Label(composite_2, SWT.NONE);
		label_11.setText("Mobile:");
		label_11.setBounds(10, 246, 37, 15);
		formToolkit.adapt(label_11, true, true);
		
		Label label_13 = new Label(composite_2, SWT.NONE);
		label_13.setText("Phone:");
		label_13.setBounds(10, 267, 41, 15);
		formToolkit.adapt(label_13, true, true);
		
		Label label_14 = new Label(composite_2, SWT.NONE);
		label_14.setText("Email:");
		label_14.setBounds(10, 289, 32, 15);
		formToolkit.adapt(label_14, true, true);
		
		Label label_22 = new Label(composite_2, SWT.NONE);
		label_22.setText("REES Code:");
		label_22.setBounds(10, 310, 67, 15);
		formToolkit.adapt(label_22, true, true);
		
		Button button_1 = new Button(composite_2, SWT.NONE);
		button_1.setText("VIEW INVOICE");
		button_1.setBounds(20, 336, 104, 25);
		formToolkit.adapt(button_1, true, true);
		
		Button button_2 = new Button(composite_2, SWT.NONE);
		button_2.setText("VIEW PHOTO");
		button_2.setBounds(20, 367, 104, 25);
		formToolkit.adapt(button_2, true, true);
		
		Button button_4 = new Button(composite_2, SWT.NONE);
		button_4.setText("VIEW SITE CHECK");
		button_4.setBounds(130, 336, 104, 25);
		formToolkit.adapt(button_4, true, true);
		
		text_3 = new Text(composite_2, SWT.BORDER);
		text_3.setEditable(false);
		text_3.setBounds(83, 185, 151, 145);
		formToolkit.adapt(text_3, true, true);
		
		Button button_5 = new Button(composite_2, SWT.NONE);
		button_5.setText("CANCEL");
		button_5.setBounds(368, 357, 125, 25);
		formToolkit.adapt(button_5, true, true);
		
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
		tbtmReceiveOrders_1.setText("Receive Orders");
		
		Composite composite_6 = new Composite(tabFolder, SWT.NONE);
		tbtmReceiveOrders_1.setControl(composite_6);
		formToolkit.paintBordersFor(composite_6);
		
		Combo combo_2 = new Combo(composite_6, SWT.NONE);
		combo_2.setItems(new String[] {"Purchase Order", "Product", "Invoice"});
		combo_2.setBounds(65, 10, 122, 23);
		formToolkit.adapt(combo_2);
		formToolkit.paintBordersFor(combo_2);
		combo_2.setText("Purchase Order\r\nProduct\r\nInvoice");
		combo_2.select(0);
		
		Label label_9 = new Label(composite_6, SWT.NONE);
		label_9.setText("Search By:");
		label_9.setBounds(10, 13, 55, 15);
		formToolkit.adapt(label_9, true, true);
		
		List list_4 = new List(composite_6, SWT.BORDER);
		list_4.setItems(new String[] {"1602       JAY-FR300CABKM6       JAYLINE FR300 FS C/A MET BLACK WITH ASHPAN (NEW)     4233    John & Mary Smith     52 Halifax Street", "1602       JAY-SPTFSCABKS3        JAYLINE SPITFIRE FS C/A BLACK 19KW                                       4237    Joe Bloggs                    2 Sandford Rise ", "1604       HTH-BETHIAN              BETHIAN HEARTH ASH - S/S TRIM - TILES - CORNER             4233    John & Mary Smith     52 Halifax Street", "1605       3063                                Woodsman FLARE - BOX (Charcoal/Pewter)                              4241    Kay Hall                        28 Becroft Lane          ", "", "", "", "", "                        List of orders not yet received"});
		list_4.setBounds(10, 39, 613, 207);
		formToolkit.adapt(list_4, true, true);
		
		List list_8 = new List(composite_6, SWT.BORDER);
		list_8.setItems(new String[] {"4233       JAY-FR300CABKM6       JAYLINE FR300 FS C/A MET BLACK WITH ASHPAN (NEW)     ", "4237       JAY-SPTFSCABKS3        JAYLINE SPITFIRE FS C/A BLACK 19KW                              "});
		list_8.setBounds(282, 252, 341, 99);
		formToolkit.adapt(list_8, true, true);
		
		Button button_6 = new Button(composite_6, SWT.NONE);
		button_6.setText("CANCEL");
		button_6.setBounds(368, 357, 125, 25);
		formToolkit.adapt(button_6, true, true);
		
		Button btnReceiveGoods = new Button(composite_6, SWT.NONE);
		btnReceiveGoods.setText("RECEIVE GOODS");
		btnReceiveGoods.setBounds(498, 357, 125, 25);
		formToolkit.adapt(btnReceiveGoods, true, true);
		
		TabItem tbtmBookings = new TabItem(tabFolder, SWT.NONE);
		tbtmBookings.setText("Bookings");
		
		Composite composite_8 = new Composite(tabFolder, SWT.NONE);
		tbtmBookings.setControl(composite_8);
		formToolkit.paintBordersFor(composite_8);
		
		Combo combo_3 = new Combo(composite_8, SWT.NONE);
		combo_3.setItems(new String[] {"Booked But Not Ready", "Order By Invoice", "Ready To Install", "Order By Progress"});
		combo_3.setBounds(65, 10, 155, 23);
		formToolkit.adapt(combo_3);
		formToolkit.paintBordersFor(combo_3);
		combo_3.select(0);
		
		Label lblDisplay = new Label(composite_8, SWT.NONE);
		lblDisplay.setText("Display");
		lblDisplay.setBounds(10, 13, 55, 15);
		formToolkit.adapt(lblDisplay, true, true);
		
		List list_7 = new List(composite_8, SWT.BORDER);
		list_7.setItems(new String[] {"4233    John & Mary Smith     52 Halifax Street                No Permit", "                                                                                               No JAY-FR300CABKM6    1602     JAYLINE FR300 FS C/A MET BLACK WITH ASHPAN (NEW) ", "                                                                                               No HTH-BETHIAN            1604     BETHIAN HEARTH ASH - S/S TRIM - TILES - CORNER", "4237    Joe Bloggs                    2 Sandford Rise                 No JAY-SPTFSCABKS3      1602     JAYLINE SPITFIRE FS C/A BLACK 19KW                               ", "4241    Kay Hall                        28 Becroft Lane                 No 3063                               1605     Woodsman FLARE - BOX (Charcoal/Pewter)", "", "", "", "                                                   List of Invoices & Why Not Ready"});
		list_7.setBounds(10, 39, 613, 314);
		formToolkit.adapt(list_7, true, true);
		
		Button btnBookInstall_1 = new Button(composite_8, SWT.NONE);
		btnBookInstall_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnBookInstall_1.setText("BOOK INSTALL");
		btnBookInstall_1.setBounds(498, 357, 125, 25);
		formToolkit.adapt(btnBookInstall_1, true, true);
		
		Button button_8 = new Button(composite_8, SWT.NONE);
		button_8.setText("CANCEL");
		button_8.setBounds(368, 357, 125, 25);
		formToolkit.adapt(button_8, true, true);
		
		Button btnEditInstall = new Button(composite_8, SWT.NONE);
		btnEditInstall.setText("EDIT INSTALL");
		btnEditInstall.setBounds(10, 359, 125, 25);
		formToolkit.adapt(btnEditInstall, true, true);
		
		

	}
}

