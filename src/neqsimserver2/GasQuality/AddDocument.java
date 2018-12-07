/*
 * AddDocument.java
 *
 * Created on 22. april 2006, 11:52
 * Copyright ESOL
 */
package neqsimserver2.GasQuality;

import com.sun.data.provider.RowKey;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.Page;
import javax.faces.FacesException;
import javax.faces.component.html.HtmlGraphicImage;
import javax.faces.component.html.HtmlOutputText;
import com.sun.data.provider.impl.CachedRowSetDataProvider;
import com.sun.rave.web.ui.component.Upload;
import com.sun.rave.web.ui.component.DropDown;
import com.sun.rave.web.ui.component.StaticText;
import javax.faces.event.ValueChangeEvent;
import javax.faces.convert.LongConverter;
import com.sun.rave.web.ui.component.Button;
import com.sun.rave.web.ui.component.TextField;
import com.sun.rave.web.ui.component.MessageGroup;
import com.sun.rave.web.ui.component.Table;
import com.sun.rave.web.ui.component.TableRowGroup;
import com.sun.rave.web.ui.model.DefaultTableDataProvider;
import com.sun.rave.web.ui.component.TableColumn;


/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class AddDocument extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Creator-managed Component Definition">
    private int __placeholder;
    
    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        documentsDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet)getValue("#{SessionBean1.documentsRowSet}"));
        documentsDataProviderWithInfo.setCachedRowSet((javax.sql.rowset.CachedRowSet)getValue("#{SessionBean1.documentsRowSetWithInfo}"));
        documenttypeDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet)getValue("#{SessionBean1.documenttypeRowSet}"));
    }
    
    private Page page1 = new Page();
    
    public Page getPage1() {
        return page1;
    }
    
    public void setPage1(Page p) {
        this.page1 = p;
    }
    
    private Html html1 = new Html();
    
    public Html getHtml1() {
        return html1;
    }
    
    public void setHtml1(Html h) {
        this.html1 = h;
    }
    
    private Head head1 = new Head();
    
    public Head getHead1() {
        return head1;
    }
    
    public void setHead1(Head h) {
        this.head1 = h;
    }
    
    private Link link1 = new Link();
    
    public Link getLink1() {
        return link1;
    }
    
    public void setLink1(Link l) {
        this.link1 = l;
    }
    
    private Body body1 = new Body();
    
    public Body getBody1() {
        return body1;
    }
    
    public void setBody1(Body b) {
        this.body1 = b;
    }
    
    private Form form1 = new Form();
    
    public Form getForm1() {
        return form1;
    }
    
    public void setForm1(Form f) {
        this.form1 = f;
    }
    
    private HtmlGraphicImage image1 = new HtmlGraphicImage();
    
    public HtmlGraphicImage getImage1() {
        return image1;
    }
    
    public void setImage1(HtmlGraphicImage hgi) {
        this.image1 = hgi;
    }
    
    private HtmlOutputText logoOutputText1 = new HtmlOutputText();
    
    public HtmlOutputText getLogoOutputText1() {
        return logoOutputText1;
    }
    
    public void setLogoOutputText1(HtmlOutputText hot) {
        this.logoOutputText1 = hot;
    }
    
    private CachedRowSetDataProvider documentsDataProvider = new CachedRowSetDataProvider();
    
    public CachedRowSetDataProvider getDocumentsDataProvider() {
        return documentsDataProvider;
    }
    
    public void setDocumentsDataProvider(CachedRowSetDataProvider crsdp) {
        this.documentsDataProvider = crsdp;
    }
    
    private CachedRowSetDataProvider documentsDataProviderWithInfo = new CachedRowSetDataProvider();
    
    public CachedRowSetDataProvider getDocumentsDataProviderWithInfo() {
        return documentsDataProviderWithInfo;
    }
    
    public void setDocumentsDataProviderWithInfo(CachedRowSetDataProvider crsdp) {
        this.documentsDataProviderWithInfo = crsdp;
    }
    
    private DropDown expTypeDropDown = new DropDown();
    
    public DropDown getExpTypeDropDown() {
        return expTypeDropDown;
    }
    
    public void setExpTypeDropDown(DropDown dd) {
        this.expTypeDropDown = dd;
    }
    
    private StaticText staticText1 = new StaticText();
    
    public StaticText getStaticText1() {
        return staticText1;
    }
    
    public void setStaticText1(StaticText st) {
        this.staticText1 = st;
    }
    
    private Upload fileUpload1 = new Upload();
    
    public Upload getFileUpload1() {
        return fileUpload1;
    }
    
    public void setFileUpload1(Upload u) {
        this.fileUpload1 = u;
    }
    
    private CachedRowSetDataProvider documenttypeDataProvider = new CachedRowSetDataProvider();
    
    public CachedRowSetDataProvider getDocumenttypeDataProvider() {
        return documenttypeDataProvider;
    }
    
    public void setDocumenttypeDataProvider(CachedRowSetDataProvider crsdp) {
        this.documenttypeDataProvider = crsdp;
    }
    
    private LongConverter expTypeDropDownConverter = new LongConverter();
    
    public LongConverter getExpTypeDropDownConverter() {
        return expTypeDropDownConverter;
    }
    
    public void setExpTypeDropDownConverter(LongConverter lc) {
        this.expTypeDropDownConverter = lc;
    }
    
    private Button button1 = new Button();
    
    public Button getButton1() {
        return button1;
    }
    
    public void setButton1(Button b) {
        this.button1 = b;
    }
    
    private StaticText staticText2 = new StaticText();
    
    public StaticText getStaticText2() {
        return staticText2;
    }
    
    public void setStaticText2(StaticText st) {
        this.staticText2 = st;
    }
    
    private TextField fileInformationTextArea = new TextField();
    
    public TextField getFileInformationTextArea() {
        return fileInformationTextArea;
    }
    
    public void setFileInformationTextArea(TextField tf) {
        this.fileInformationTextArea = tf;
    }
    
    private MessageGroup messageGroup1 = new MessageGroup();
    
    public MessageGroup getMessageGroup1() {
        return messageGroup1;
    }
    
    public void setMessageGroup1(MessageGroup mg) {
        this.messageGroup1 = mg;
    }
    
    private Table table1 = new Table();
    
    public Table getTable1() {
        return table1;
    }
    
    public void setTable1(Table t) {
        this.table1 = t;
    }
    
    private TableRowGroup tableRowGroup1 = new TableRowGroup();
    
    public TableRowGroup getTableRowGroup1() {
        return tableRowGroup1;
    }
    
    public void setTableRowGroup1(TableRowGroup trg) {
        this.tableRowGroup1 = trg;
    }
    
    private TableColumn tableColumn1 = new TableColumn();
    
    public TableColumn getTableColumn1() {
        return tableColumn1;
    }
    
    public void setTableColumn1(TableColumn tc) {
        this.tableColumn1 = tc;
    }
    
    private StaticText staticText3 = new StaticText();
    
    public StaticText getStaticText3() {
        return staticText3;
    }
    
    public void setStaticText3(StaticText st) {
        this.staticText3 = st;
    }
    
    private TableColumn tableColumn2 = new TableColumn();
    
    public TableColumn getTableColumn2() {
        return tableColumn2;
    }
    
    public void setTableColumn2(TableColumn tc) {
        this.tableColumn2 = tc;
    }
    
    private StaticText staticText4 = new StaticText();
    
    public StaticText getStaticText4() {
        return staticText4;
    }
    
    public void setStaticText4(StaticText st) {
        this.staticText4 = st;
    }
    
    private TableColumn tableColumn3 = new TableColumn();
    
    public TableColumn getTableColumn3() {
        return tableColumn3;
    }
    
    public void setTableColumn3(TableColumn tc) {
        this.tableColumn3 = tc;
    }
    
    private Button button2 = new Button();
    
    public Button getButton2() {
        return button2;
    }
    
    public void setButton2(Button b) {
        this.button2 = b;
    }
    
    private TableColumn tableColumn4 = new TableColumn();
    
    public TableColumn getTableColumn4() {
        return tableColumn4;
    }
    
    public void setTableColumn4(TableColumn tc) {
        this.tableColumn4 = tc;
    }
    
    private Button button3 = new Button();
    
    public Button getButton3() {
        return button3;
    }
    
    public void setButton3(Button b) {
        this.button3 = b;
    }

    private TableColumn tableColumn5 = new TableColumn();

    public TableColumn getTableColumn5() {
        return tableColumn5;
    }

    public void setTableColumn5(TableColumn tc) {
        this.tableColumn5 = tc;
    }

    private StaticText staticText5 = new StaticText();

    public StaticText getStaticText5() {
        return staticText5;
    }

    public void setStaticText5(StaticText st) {
        this.staticText5 = st;
    }
    
    // </editor-fold>
    
    
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public AddDocument() {
    }
    
    /**
     * <p>Return a reference to the scoped data bean.</p>
     */
    protected neqsimserver2.SessionBean1 getSessionBean1() {
        return (neqsimserver2.SessionBean1)getBean("SessionBean1");
    }
    
    
    /**
     * <p>Return a reference to the scoped data bean.</p>
     */
    protected GasQualitySessionBean getGasQuality$GasQualitySessionBean() {
        return (GasQualitySessionBean)getBean("GasQuality$GasQualitySessionBean");
    }
    
    
    /**
     * <p>Return a reference to the scoped data bean.</p>
     */
    protected neqsimserver2.Thermo.ThermoSessionBean getThermo$ThermoSessionBean() {
        return (neqsimserver2.Thermo.ThermoSessionBean)getBean("Thermo$ThermoSessionBean");
    }
    
    
    /**
     * <p>Return a reference to the scoped data bean.</p>
     */
    protected neqsimserver2.ApplicationBean1 getApplicationBean1() {
        return (neqsimserver2.ApplicationBean1)getBean("ApplicationBean1");
    }
    
    
    /**
     * <p>Callback method that is called whenever a page is navigated to,
     * either directly via a URL, or indirectly via page navigation.
     * Customize this method to acquire resources that will be needed
     * for event handlers and lifecycle methods, whether or not this
     * page is performing post back processing.</p>
     *
     * <p>Note that, if the current request is a postback, the property
     * values of the components do <strong>not</strong> represent any
     * values submitted with this request.  Instead, they represent the
     * property values that were saved for this view when it was rendered.</p>
     */
    public void init() {
        // Perform initializations inherited from our superclass
        super.init();
        // Perform application initialization that must complete
        // *before* managed components are initialized
        // TODO - add your own initialiation code here
        
        // <editor-fold defaultstate="collapsed" desc="Creator-managed Component Initialization">
        // Initialize automatically managed components
        // *Note* - this logic should NOT be modified
        try {
            _init();
        } catch (Exception e) {
            log("AddDocument Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
        
    }
    
    /**
     * <p>Callback method that is called after the component tree has been
     * restored, but before any event processing takes place.  This method
     * will <strong>only</strong> be called on a postback request that
     * is processing a form submit.  Customize this method to allocate
     * resources that will be required in your event handlers.</p>
     */
    public void preprocess() {
    }
    
    /**
     * <p>Callback method that is called just before rendering takes place.
     * This method will <strong>only</strong> be called for the page that
     * will actually be rendered (and not, for example, on a page that
     * handled a postback and then navigated to a different page).  Customize
     * this method to allocate resources that will be required for rendering
     * this page.</p>
     */
    public void prerender() {
    }
    
    /**
     * <p>Callback method that is called after rendering is completed for
     * this request, if <code>init()</code> was called (regardless of whether
     * or not this was the page that was actually rendered).  Customize this
     * method to release resources acquired in the <code>init()</code>,
     * <code>preprocess()</code>, or <code>prerender()</code> methods (or
     * acquired during execution of an event handler).</p>
     */
    public void destroy() {
        documenttypeDataProvider.close();
        documentsDataProviderWithInfo.close();
        documentsDataProvider.close();
    }
    
    
    public void fileUpload1_processValueChange(ValueChangeEvent event) {
        // TODO: Replace with your code
        
    }
    
    
    public String button1_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.
        int artID = 1;
        try {
            if (fileUpload1.getUploadedFile().getContentType().substring(0, 4).compareTo("image") != 0) {
                documentsDataProvider.cursorLast();
                RowKey rk = documentsDataProvider.appendRow();
                //sales_rep_data_tblDataProvider.setValue("SALES_REP_NUM", rk, textField1.getValue());
                documentsDataProvider.setValue("FILETYPE",rk, fileUpload1.getUploadedFile().getContentType());
                documentsDataProvider.setValue("FILEID",rk, fileUpload1.getUploadedFile().getOriginalName());
                documentsDataProvider.setValue("TEXT",rk, fileInformationTextArea.getText());
                documentsDataProvider.setValue("FILE",rk, fileUpload1.getUploadedFile().getBytes());
                documentsDataProvider.setValue("ARTICLETYPE",rk, expTypeDropDown.getValue().toString());
                documentsDataProvider.setValue("ARTICLEID",rk, Integer.toString(artID));
                
                documentsDataProvider.commitChanges();
                documentsDataProvider.refresh();
                documentsDataProvider.refresh();
                documentsDataProviderWithInfo.refresh();
                
            } else {
                error("Please choose a file of image type. " +
                        fileUpload1.getUploadedFile().getOriginalName() +
                        " is of " + fileUpload1.getUploadedFile().getContentType() + " type."); };
        } catch (Exception ex) {
            log("Error Description", ex);
            error(ex.getMessage());
        }
        return null;
    }
    
    
    public String button3_action() {
        RowKey rowKey = tableRowGroup1.getRowKey();
        int id = Integer.parseInt(documentsDataProviderWithInfo.getValue("ID", rowKey).toString());
        getSessionBean1().setDocumentID(id);
        return "DisplayDocument";
    }
}

