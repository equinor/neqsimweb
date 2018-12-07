/*
 * ExperimentalData2.java
 *
 * Created on 4. mars 2006, 19:08
 * Copyright ESOL
 */
package neqsimserver2.Thermo;

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
import com.sun.data.provider.impl.CachedRowSetDataProvider;
import com.sun.rave.web.ui.component.Upload;
import com.sun.rave.web.ui.component.Button;
import com.sun.rave.web.ui.component.Table;
import com.sun.rave.web.ui.component.TableRowGroup;
import com.sun.rave.web.ui.component.TableColumn;
import com.sun.rave.web.ui.component.StaticText;
import com.sun.rave.web.ui.component.TextField;
import com.sun.rave.web.ui.component.TextArea;
import javax.faces.convert.LongConverter;
import com.sun.rave.web.ui.component.DropDown;
import com.sun.rave.web.ui.component.PanelLayout;
import com.sun.rave.web.ui.component.ImageHyperlink;
import javax.faces.event.ValueChangeEvent;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class ExperimentalData2 extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Creator-managed Component Definition">

    private int __placeholder;

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        experimentaldatatypeDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.experimentaldatatypeRowSet}"));
        litteratureDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.litteratureRowSet}"));
        litteratureDataProviderTable.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.litteratureRowSetTable}"));
        literatureandarticlestableDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.literatureandarticlestableRowSet}"));
        litteratureDataProvider1.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.litteratureRowSet1}"));
//        litteratureRowSet1.setCommand("SELECT ALL litterature.ID, \n                    litterature.FLUID_ID, \n                    litterature.FILE, \n                    litterature.TYPE, \n                    litterature.NAME, \n                    litterature.TEXT, \n                    litterature.EXPTYPEID, \n                    experimentaldatatype.ID AS EXPID, \n                    experimentaldatatype.TYPE AS EXPTYPE, \n                    userdb.ID AS USERID, \n                    userdb.USERNAME, \n                    userdb.PASSWORD, \n                    userdb.EMAIL, \n                    userdb.FORNAME, \n                    userdb.SURENAME, \n                    fluidinfo.ID AS FLUIDID, \n                    fluidinfo.USERID, \n                    fluidinfo.FIELD, \n                    fluidinfo.WELL, \n                    fluidinfo.TEST, \n                    fluidinfo.SAMPLE, \n                    fluidinfo.TEXT, \n                    fluidinfo.HISTORY, \n                    fluidinfo.METHANE, \n                    fluidinfo.ETHANE, \n                    fluidinfo.PROPANE, \n                    fluidinfo.CO2, \n                    fluidinfo.H2S, \n                    fluidinfo.NITROGEN, \n                    fluidinfo.IBUTANE, \n                    fluidinfo.NBUTANE, \n                    fluidinfo.PENTANE, \n                    fluidinfo.NHEXANE, \n                    fluidinfo.CYCPENTANE, \n                    fluidinfo.CYCHEXANE, \n                    fluidinfo.NHEPTANE, \n                    fluidinfo.NOCTANE, \n                    fluidinfo.NNONANE, \n                    fluidinfo.NDECANE, \n                    fluidinfo.BENZENE, \n                    fluidinfo.TOLUENE, \n                    fluidinfo.MXYLENE, \n                    fluidinfo.PXYLENE, \n                    fluidinfo.OXYLENE, \n                    fluidinfo.WATER, \n                    fluidinfo.METHANOL, \n                    fluidinfo.MEG, \n                    fluidinfo.TEG, \n                    fluidinfo.DEG, \n                    fluidinfo.MDEA, \n                    fluidinfo.PIPERAZINE, \n                    fluidinfo.ACETICACID, \n                    fluidinfo.PROPIONICACID, \n                    fluidinfo.NAPLUS, \n                    fluidinfo.FEPLUS, \n                    fluidinfo.CAPLUS, \n                    fluidinfo.H3OPLUS, \n                    fluidinfo.OHMINUS, \n                    fluidinfo.CO3MINUS, \n                    fluidinfo.CLMINUS, \n                    fluidinfo.C6, \n                    fluidinfo.C6MOLARMASS, \n                    fluidinfo.C6DENSITY, \n                    fluidinfo.C7, \n                    fluidinfo.C7MOLARMASS, \n                    fluidinfo.C7DENSITY, \n                    fluidinfo.C8, \n                    fluidinfo.C8MOLARMASS, \n                    fluidinfo.C8DENSITY, \n                    fluidinfo.C9, \n                    fluidinfo.C9MOLARMASS, \n                    fluidinfo.C9DENSITY, \n                    fluidinfo.C10, \n                    fluidinfo.C10MOLARMASS, \n                    fluidinfo.C10DENSITY, \n                    fluidinfo.C11, \n                    fluidinfo.C11MOLARMASS, \n                    fluidinfo.C11DENSITY, \n                    fluidinfo.C12, \n                    fluidinfo.C12MOLARMASS, \n                    fluidinfo.C12DENSITY, \n                    fluidinfo.C13, \n                    fluidinfo.C13MOLARMASS, \n                    fluidinfo.C13DENSITY, \n                    fluidinfo.CPLUS, \n                    fluidinfo.CPLUSMOLARMASS, \n                    fluidinfo.CPLUSDENSITY, \n                    literatureandarticlestable.ID AS LITID, \n                    literatureandarticlestable.AUTHOR, \n                    literatureandarticlestable.NAME AS LITNAME, \n                    literatureandarticlestable.JOURNAL, \n                    literatureandarticlestable.VOLUME, \n                    literatureandarticlestable.PAGES, \n                    literatureandarticlestable.YEAR, \n                    literatureandarticlestable.REFERENCEID, \n                    litterature.ARTICLEID, \n                    litterature.MAXPRESSURE, \n                    litterature.MINPRESSURE, \n                    litterature.MAXTEMPERATURE, \n                    litterature.MINTEMPERATURE, \n                    fluidinfo.SHARED \nFROM litterature, experimentaldatatype, userdb, fluidinfo, literatureandarticlestable\nWHERE fluidinfo.ID = ?\n          AND litterature.EXPTYPEID = experimentaldatatype.ID\n          AND litterature.FLUID_ID = fluidinfo.ID\n          AND fluidinfo.USERID = userdb.ID\n          AND litterature.ARTICLEID = literatureandarticlestable.ID ");
//        litteratureRowSet1.setDataSourceName("java:comp/env/jdbc/neqsimdatabase_MySQL");
//        litteratureRowSet1.setTableName("litterature");  
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
    private Upload fileUpload1 = new Upload();

    public Upload getFileUpload1() {
        return fileUpload1;
    }

    public void setFileUpload1(Upload u) {
        this.fileUpload1 = u;
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
    private StaticText staticText3 = new StaticText();

    public StaticText getStaticText3() {
        return staticText3;
    }

    public void setStaticText3(StaticText st) {
        this.staticText3 = st;
    }
    private StaticText staticText4 = new StaticText();

    public StaticText getStaticText4() {
        return staticText4;
    }

    public void setStaticText4(StaticText st) {
        this.staticText4 = st;
    }
    private TextArea fileInformationTextArea = new TextArea();

    public TextArea getFileInformationTextArea() {
        return fileInformationTextArea;
    }

    public void setFileInformationTextArea(TextArea ta) {
        this.fileInformationTextArea = ta;
    }
    private StaticText staticText7 = new StaticText();

    public StaticText getStaticText7() {
        return staticText7;
    }

    public void setStaticText7(StaticText st) {
        this.staticText7 = st;
    }
    private LongConverter listbox1Converter = new LongConverter();

    public LongConverter getListbox1Converter() {
        return listbox1Converter;
    }

    public void setListbox1Converter(LongConverter lc) {
        this.listbox1Converter = lc;
    }
    private DropDown expTypeDropDown = new DropDown();

    public DropDown getExpTypeDropDown() {
        return expTypeDropDown;
    }

    public void setExpTypeDropDown(DropDown dd) {
        this.expTypeDropDown = dd;
    }
    private CachedRowSetDataProvider experimentaldatatypeDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getExperimentaldatatypeDataProvider() {
        return experimentaldatatypeDataProvider;
    }

    public void setExperimentaldatatypeDataProvider(CachedRowSetDataProvider crsdp) {
        this.experimentaldatatypeDataProvider = crsdp;
    }
    private LongConverter expTypeDropDownConverter = new LongConverter();

    public LongConverter getExpTypeDropDownConverter() {
        return expTypeDropDownConverter;
    }

    public void setExpTypeDropDownConverter(LongConverter lc) {
        this.expTypeDropDownConverter = lc;
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
    private CachedRowSetDataProvider litteratureDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getLitteratureDataProvider() {
        return litteratureDataProvider;
    }

    public void setLitteratureDataProvider(CachedRowSetDataProvider crsdp) {
        this.litteratureDataProvider = crsdp;
    }
    private TableColumn tableColumn1 = new TableColumn();

    public TableColumn getTableColumn1() {
        return tableColumn1;
    }

    public void setTableColumn1(TableColumn tc) {
        this.tableColumn1 = tc;
    }
    private StaticText staticText1 = new StaticText();

    public StaticText getStaticText1() {
        return staticText1;
    }

    public void setStaticText1(StaticText st) {
        this.staticText1 = st;
    }
    private TableColumn tableColumn4 = new TableColumn();

    public TableColumn getTableColumn4() {
        return tableColumn4;
    }

    public void setTableColumn4(TableColumn tc) {
        this.tableColumn4 = tc;
    }
    private StaticText staticText8 = new StaticText();

    public StaticText getStaticText8() {
        return staticText8;
    }

    public void setStaticText8(StaticText st) {
        this.staticText8 = st;
    }
    private TableColumn tableColumn6 = new TableColumn();

    public TableColumn getTableColumn6() {
        return tableColumn6;
    }

    public void setTableColumn6(TableColumn tc) {
        this.tableColumn6 = tc;
    }
    private Button button2 = new Button();

    public Button getButton2() {
        return button2;
    }

    public void setButton2(Button b) {
        this.button2 = b;
    }
    private TableColumn tableColumn7 = new TableColumn();

    public TableColumn getTableColumn7() {
        return tableColumn7;
    }

    public void setTableColumn7(TableColumn tc) {
        this.tableColumn7 = tc;
    }
    private Button button3 = new Button();

    public Button getButton3() {
        return button3;
    }

    public void setButton3(Button b) {
        this.button3 = b;
    }
    private CachedRowSetDataProvider litteratureDataProviderTable = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getLitteratureDataProviderTable() {
        return litteratureDataProviderTable;
    }

    public void setLitteratureDataProviderTable(CachedRowSetDataProvider crsdp) {
        this.litteratureDataProviderTable = crsdp;
    }
    private CachedRowSetDataProvider literatureandarticlestableDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getLiteratureandarticlestableDataProvider() {
        return literatureandarticlestableDataProvider;
    }

    public void setLiteratureandarticlestableDataProvider(CachedRowSetDataProvider crsdp) {
        this.literatureandarticlestableDataProvider = crsdp;
    }
    private PanelLayout detailsGridPanel = new PanelLayout();

    public PanelLayout getDetailsGridPanel() {
        return detailsGridPanel;
    }

    public void setDetailsGridPanel(PanelLayout pl) {
        this.detailsGridPanel = pl;
    }
    private StaticText staticText10 = new StaticText();

    public StaticText getStaticText10() {
        return staticText10;
    }

    public void setStaticText10(StaticText st) {
        this.staticText10 = st;
    }
    private TextField authorTextField = new TextField();

    public TextField getAuthorTextField() {
        return authorTextField;
    }

    public void setAuthorTextField(TextField tf) {
        this.authorTextField = tf;
    }
    private StaticText staticText11 = new StaticText();

    public StaticText getStaticText11() {
        return staticText11;
    }

    public void setStaticText11(StaticText st) {
        this.staticText11 = st;
    }
    private TextField articleTitleTextField = new TextField();

    public TextField getArticleTitleTextField() {
        return articleTitleTextField;
    }

    public void setArticleTitleTextField(TextField tf) {
        this.articleTitleTextField = tf;
    }
    private StaticText staticText6 = new StaticText();

    public StaticText getStaticText6() {
        return staticText6;
    }

    public void setStaticText6(StaticText st) {
        this.staticText6 = st;
    }
    private TextField journalNameTextField = new TextField();

    public TextField getJournalNameTextField() {
        return journalNameTextField;
    }

    public void setJournalNameTextField(TextField tf) {
        this.journalNameTextField = tf;
    }
    private StaticText staticText12 = new StaticText();

    public StaticText getStaticText12() {
        return staticText12;
    }

    public void setStaticText12(StaticText st) {
        this.staticText12 = st;
    }
    private TextField volumeTextField = new TextField();

    public TextField getVolumeTextField() {
        return volumeTextField;
    }

    public void setVolumeTextField(TextField tf) {
        this.volumeTextField = tf;
    }
    private StaticText staticText13 = new StaticText();

    public StaticText getStaticText13() {
        return staticText13;
    }

    public void setStaticText13(StaticText st) {
        this.staticText13 = st;
    }
    private TextField pageTextField = new TextField();

    public TextField getPageTextField() {
        return pageTextField;
    }

    public void setPageTextField(TextField tf) {
        this.pageTextField = tf;
    }
    private StaticText staticText14 = new StaticText();

    public StaticText getStaticText14() {
        return staticText14;
    }

    public void setStaticText14(StaticText st) {
        this.staticText14 = st;
    }
    private TextField yearTextField = new TextField();

    public TextField getYearTextField() {
        return yearTextField;
    }

    public void setYearTextField(TextField tf) {
        this.yearTextField = tf;
    }
    private StaticText staticText15 = new StaticText();

    public StaticText getStaticText15() {
        return staticText15;
    }

    public void setStaticText15(StaticText st) {
        this.staticText15 = st;
    }
    private TextField minTempTextField = new TextField();

    public TextField getMinTempTextField() {
        return minTempTextField;
    }

    public void setMinTempTextField(TextField tf) {
        this.minTempTextField = tf;
    }
    private StaticText staticText16 = new StaticText();

    public StaticText getStaticText16() {
        return staticText16;
    }

    public void setStaticText16(StaticText st) {
        this.staticText16 = st;
    }
    private TextField maxTempTextField = new TextField();

    public TextField getMaxTempTextField() {
        return maxTempTextField;
    }

    public void setMaxTempTextField(TextField tf) {
        this.maxTempTextField = tf;
    }
    private StaticText staticText17 = new StaticText();

    public StaticText getStaticText17() {
        return staticText17;
    }

    public void setStaticText17(StaticText st) {
        this.staticText17 = st;
    }
    private StaticText staticText18 = new StaticText();

    public StaticText getStaticText18() {
        return staticText18;
    }

    public void setStaticText18(StaticText st) {
        this.staticText18 = st;
    }
    private StaticText staticText19 = new StaticText();

    public StaticText getStaticText19() {
        return staticText19;
    }

    public void setStaticText19(StaticText st) {
        this.staticText19 = st;
    }
    private TextField maxPresTextField = new TextField();

    public TextField getMaxPresTextField() {
        return maxPresTextField;
    }

    public void setMaxPresTextField(TextField tf) {
        this.maxPresTextField = tf;
    }
    private StaticText staticText20 = new StaticText();

    public StaticText getStaticText20() {
        return staticText20;
    }

    public void setStaticText20(StaticText st) {
        this.staticText20 = st;
    }
    private TextField minPresTextField = new TextField();

    public TextField getMinPresTextField() {
        return minPresTextField;
    }

    public void setMinPresTextField(TextField tf) {
        this.minPresTextField = tf;
    }
    private CachedRowSetDataProvider litteratureDataProvider1 = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getLitteratureDataProvider1() {
        return litteratureDataProvider1;
    }

    public void setLitteratureDataProvider1(CachedRowSetDataProvider crsdp) {
        this.litteratureDataProvider1 = crsdp;
    }
    private TableColumn tableColumn2 = new TableColumn();

    public TableColumn getTableColumn2() {
        return tableColumn2;
    }

    public void setTableColumn2(TableColumn tc) {
        this.tableColumn2 = tc;
    }
    private StaticText staticText5 = new StaticText();

    public StaticText getStaticText5() {
        return staticText5;
    }

    public void setStaticText5(StaticText st) {
        this.staticText5 = st;
    }
    private TableColumn tableColumn3 = new TableColumn();

    public TableColumn getTableColumn3() {
        return tableColumn3;
    }

    public void setTableColumn3(TableColumn tc) {
        this.tableColumn3 = tc;
    }
    private StaticText staticText9 = new StaticText();

    public StaticText getStaticText9() {
        return staticText9;
    }

    public void setStaticText9(StaticText st) {
        this.staticText9 = st;
    }
    private TableColumn tableColumn5 = new TableColumn();

    public TableColumn getTableColumn5() {
        return tableColumn5;
    }

    public void setTableColumn5(TableColumn tc) {
        this.tableColumn5 = tc;
    }
    private Button button4 = new Button();

    public Button getButton4() {
        return button4;
    }

    public void setButton4(Button b) {
        this.button4 = b;
    }

//    private CachedRowSetXImpl litteratureRowSet1 = new CachedRowSetXImpl();
//    public CachedRowSetXImpl getLitteratureRowSet1() {
//        return litteratureRowSet1;
//    }
//    public void setLitteratureRowSet1(CachedRowSetXImpl crsxi) {
//        this.litteratureRowSet1 = crsxi;
//    }
    // </editor-fold>
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public ExperimentalData2() {
        try {
            getSessionBean1().getLitteratureRowSet().setObject(1, Integer.toString(getSessionBean1().getActiveFluidID()));
            litteratureDataProvider.refresh();
            log("ative fluid ID2 " + getSessionBean1().getActiveFluidID());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     */
    protected neqsimserver2.GasQuality.GasQualitySessionBean getGasQuality$GasQualitySessionBean() {
        return (neqsimserver2.GasQuality.GasQualitySessionBean) getBean("GasQuality$GasQualitySessionBean");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     */
    protected neqsimserver2.ApplicationBean1 getApplicationBean1() {
        return (neqsimserver2.ApplicationBean1) getBean("ApplicationBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     */
    protected ThermoSessionBean getThermo$ThermoSessionBean() {
        return (ThermoSessionBean) getBean("Thermo$ThermoSessionBean");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     */
    protected neqsimserver2.SessionBean1 getSessionBean1() {
        return (neqsimserver2.SessionBean1) getBean("SessionBean1");
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
            log("ExperimentalData2 Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
        }
        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
        try {
            getSessionBean1().getLitteratureRowSet().setObject(1, Integer.toString(getSessionBean1().getActiveFluidID()));
            litteratureDataProvider.refresh();
            log("ative fluid ID22 " + getSessionBean1().getActiveFluidID());

        } catch (Exception e) {
            e.printStackTrace();
        }

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

        System.out.println("drop down value " + expTypeDropDown.getSelected());
        if (expTypeDropDown.getSelected() == null) {
            expTypeDropDown.setSelected(new Long(litteratureDataProviderTable.getValue("litterature.EXPTYPEID").toString()));
        }
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
        litteratureDataProvider1.close();
        literatureandarticlestableDataProvider.close();
        litteratureDataProviderTable.close();
        litteratureDataProvider.close();
        experimentaldatatypeDataProvider.close();
    }

    public String button1_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.
        int artID = 1;
        try {
            if (detailsGridPanel.isRendered()) {
                literatureandarticlestableDataProvider.cursorLast();
                RowKey rk = literatureandarticlestableDataProvider.appendRow();
                log("1");
                literatureandarticlestableDataProvider.setValue("AUTHOR", rk, authorTextField.getValue());
                log("2");
                literatureandarticlestableDataProvider.setValue("NAME", rk, articleTitleTextField.getValue());
                log("3");
                literatureandarticlestableDataProvider.setValue("JOURNAL", rk, journalNameTextField.getValue());
                log("4");
                literatureandarticlestableDataProvider.setValue("VOLUME", rk, volumeTextField.getValue());
                log("5");
                literatureandarticlestableDataProvider.setValue("PAGES", rk, pageTextField.getValue());
                log("6");
                literatureandarticlestableDataProvider.setValue("YEAR", rk, yearTextField.getValue());
                log("7");
                literatureandarticlestableDataProvider.commitChanges();
                literatureandarticlestableDataProvider.refresh();
                artID = Integer.parseInt(literatureandarticlestableDataProvider.getValue("ID", rk).toString());
                literatureandarticlestableDataProvider.close();
                log("art numbers " + artID);
            }
        } catch (Exception ex) {
            log("Error Description", ex);
            error(ex.getMessage());
        }


        try {
            if (fileUpload1.getUploadedFile().getContentType().substring(0, 4).compareTo("image") != 0) {
                litteratureDataProviderTable.cursorLast();

                // litteratureDataProviderTable.getValue("ID", rk).toString();

                RowKey rk = litteratureDataProviderTable.appendRow();
                //sales_rep_data_tblDataProvider.setValue("SALES_REP_NUM", rk, textField1.getValue());
//                litteratureDataProviderTable.setValue("ID",rk, "2");
                litteratureDataProviderTable.setValue("TYPE", rk, fileUpload1.getUploadedFile().getContentType());
                String filename = "no name";
                if (fileUpload1.getUploadedFile().getOriginalName().lastIndexOf("\\") > 0) {
                    filename = fileUpload1.getUploadedFile().getOriginalName().substring(fileUpload1.getUploadedFile().getOriginalName().lastIndexOf("\\") + 1);
                }

                litteratureDataProviderTable.setValue("NAME", rk, filename);//fileUpload1.getUploadedFile().getOriginalName());
                litteratureDataProviderTable.setValue("FLUID_ID", rk, Integer.toString(getSessionBean1().getActiveFluidID()));
                litteratureDataProviderTable.setValue("TEXT", rk, fileInformationTextArea.getText());
                litteratureDataProviderTable.setValue("FILE", rk, fileUpload1.getUploadedFile().getBytes());

//                int count = experimentaldatatypeDataProvider.getRowCount();
//                int index = expTypeDropDown.getTabIndex();
//                RowKey[] rk3 = experimentaldatatypeDataProvider.getRowKeys(count,null);
//                String expType = experimentaldatatypeDataProvider.getValue("ID", rk3[index]).toString();
                litteratureDataProviderTable.setValue("EXPTYPEID", rk, expTypeDropDown.getValue().toString());
                litteratureDataProviderTable.setValue("ARTICLEID", rk, Integer.toString(artID));

                litteratureDataProviderTable.setValue("MINTEMPERATURE", rk, minTempTextField.getValue());
                litteratureDataProviderTable.setValue("MAXTEMPERATURE", rk, maxTempTextField.getValue());

                litteratureDataProviderTable.setValue("MINPRESSURE", rk, minPresTextField.getValue());
                litteratureDataProviderTable.setValue("MAXPRESSURE", rk, maxPresTextField.getValue());

                litteratureDataProviderTable.commitChanges();
                litteratureDataProviderTable.refresh();
                 litteratureDataProviderTable.close();
                getSessionBean1().getLitteratureRowSet().setObject(1, Integer.toString(getSessionBean1().getActiveFluidID()));
                litteratureDataProvider.refresh();

            } else {
                error("Please choose a file of image type. " +
                        fileUpload1.getUploadedFile().getOriginalName() +
                        " is of " + fileUpload1.getUploadedFile().getContentType() + " type.");
            }
            ;
        } catch (Exception ex) {
            log("Error Description", ex);
            error(ex.getMessage());
        }




        return null;
    }

    public String button2_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.
        RowKey rowKey = tableRowGroup1.getRowKey();
        getSessionBean1().setLitteratureID(Integer.parseInt(staticText1.getValue().toString()));
        int id = Integer.parseInt(litteratureDataProvider.getValue("ID", rowKey).toString());
        return "ExperimentalDataToViewResults";
    }

    public String button3_action() {




//        // TODO: Process the button click action. Return value is a navigation
//        // case name where null will return to the same page.
        try {
            RowKey rowKey = tableRowGroup1.getRowKey();

            int id = Integer.parseInt(staticText1.getValue().toString());

            log("id " + id);
            litteratureDataProvider1.refresh();
            litteratureDataProvider1.cursorFirst();
            do {
                log(litteratureDataProvider1.getValue("ID").toString());
            } while (!(Integer.parseInt(litteratureDataProvider1.getValue("ID").toString()) == id) && litteratureDataProvider1.cursorNext());

            log("id 1");
            RowKey rowKey2 = litteratureDataProvider1.getCursorRow();
            litteratureDataProvider1.removeRow(rowKey2);
            litteratureDataProvider1.commitChanges();
            litteratureDataProvider1.refresh();
//            if ( litteratureDataProviderTable.canRemoveRow(rowKey2) ) {
//                System.out.println(" IDDD " + litteratureDataProviderTable.getValue("ID", rowKey2).toString());
//                litteratureDataProviderTable.removeRow(rowKey2);
//                litteratureDataProviderTable.commitChanges();
//            } else {
//                error("Cannot remove current row");
//            }

//
//        log("id 2");
//        litteratureDataProviderTable.removeRow(rowKey2);
//        log("id 3");
            log("id 4");
            litteratureDataProviderTable.refresh();
            log("id 5");
            getSessionBean1().getLitteratureRowSet().setObject(1, Integer.toString(getSessionBean1().getActiveFluidID()));
            log("id 6");
            litteratureDataProvider.refresh();
            log("id 7");
        } catch (Exception e) {
            log("delete litteratureDataProvider exeption", e);
            error("Eception deleting litteratureDataProvider id: " + e);
        }
        return null;
    }
//      public String button2_action() {
//        // TODO: Process the button click action. Return value is a navigation
//        // case name where null will return to the same page.
//        RowKey rowKey = tableRowGroup1.getRowKey();
//        int id = Integer.parseInt(litteratureDataProvider.getValue("ID", rowKey).toString());
//        getSessionBean1().setLitteratureID(id);
//        return "ExperimentalDataToViewResults";
//    }
//
//
//    public String button3_action() {
//        // TODO: Process the button click action. Return value is a navigation
//        // case name where null will return to the same page.
//         try{
//            RowKey rowKey = tableRowGroup1.getRowKey();
//            litteratureDataProvider.removeRow(rowKey);
//            litteratureDataProvider.commitChanges();
//            litteratureDataProvider.refresh();
//        } catch (Exception e){
//            log("delete litteratureDataProvider exeption", e);
//            error("Eception deleting litteratureDataProvider id: " + e);
//        }
//        return null;
//    }

    public String hyperlink1_action() {
        // TODO: Replace with your code

        return "ToReadFluidDB";
    }

//    public String addDetailsButton_action() {
//        // TODO: Process the button click action. Return value is a navigation
//        // case name where null will return to the same page.
//        if(articleForm.isRendered()) articleForm.setRendered(false);
//        else articleForm.setRendered(true);
//        return null;
//    }
    public String imageHyperlink1_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.
        if (detailsGridPanel.isRendered()) {
            detailsGridPanel.setRendered(false);
        } else {
            detailsGridPanel.setRendered(true);
        }
        return null;
    }

    public void authorTextField_processValueChange(ValueChangeEvent event) {
        // TODO: Replace with your code
    }

    public void fileUpload1_processValueChange(ValueChangeEvent event) {
        // TODO: Replace with your code
    }

    public String button4_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.
        RowKey rowKey = tableRowGroup1.getRowKey();
        int id = Integer.parseInt(staticText1.getValue().toString());
        //   int id = Integer.parseInt(litteratureDataProvider.getValue("ID", rowKey).toString());
        System.out.println("Column ID " + id);
        getSessionBean1().setLitteratureID(id);
        return "ToEditExperimentalData";
    }
}

