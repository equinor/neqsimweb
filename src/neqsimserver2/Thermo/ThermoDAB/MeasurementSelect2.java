/*
 * MeasurementSelect2.java
 *
 * Created on 26. mars 2006, 23:32
 * Copyright ESOL
 */
package neqsimserver2.Thermo.ThermoDAB;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Hyperlink;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.Page;
import javax.faces.FacesException;
import javax.faces.component.html.HtmlGraphicImage;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.event.ValueChangeEvent;
import com.sun.rave.web.ui.component.Button;
import com.sun.rave.web.ui.component.DropDown;
import com.sun.rave.web.ui.component.AddRemove;
import com.sun.data.provider.impl.CachedRowSetDataProvider;
import com.sun.rave.web.ui.component.Checkbox;
import com.sun.rave.web.ui.component.MessageGroup;
import com.sun.rave.web.ui.component.StaticText;
import com.sun.rave.web.ui.component.TextField;
import javax.faces.convert.DoubleConverter;
import javax.faces.validator.DoubleRangeValidator;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class MeasurementSelect2 extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Creator-managed Component Definition">

    private int __placeholder;

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        webcomponentsDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.webcomponentsRowSet}"));
        datatTypeDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.experimentaldatatypeRowSet}"));
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
    private HtmlOutputText outputText2 = new HtmlOutputText();

    public HtmlOutputText getOutputText2() {
        return outputText2;
    }

    public void setOutputText2(HtmlOutputText hot) {
        this.outputText2 = hot;
    }
    private HtmlOutputText typeText1 = new HtmlOutputText();

    public HtmlOutputText getTypeText1() {
        return typeText1;
    }

    public void setTypeText1(HtmlOutputText hot) {
        this.typeText1 = hot;
    }
    private HtmlOutputText loacitionText1 = new HtmlOutputText();

    public HtmlOutputText getLoacitionText1() {
        return loacitionText1;
    }

    public void setLoacitionText1(HtmlOutputText hot) {
        this.loacitionText1 = hot;
    }
    private HtmlOutputText topMenuText1 = new HtmlOutputText();

    public HtmlOutputText getTopMenuText1() {
        return topMenuText1;
    }

    public void setTopMenuText1(HtmlOutputText hot) {
        this.topMenuText1 = hot;
    }
    private HtmlOutputText outputText3 = new HtmlOutputText();

    public HtmlOutputText getOutputText3() {
        return outputText3;
    }

    public void setOutputText3(HtmlOutputText hot) {
        this.outputText3 = hot;
    }
    private Button button1 = new Button();

    public Button getButton1() {
        return button1;
    }

    public void setButton1(Button b) {
        this.button1 = b;
    }
    private DropDown dataTypeList = new DropDown();

    public DropDown getDataTypeList() {
        return dataTypeList;
    }

    public void setDataTypeList(DropDown dd) {
        this.dataTypeList = dd;
    }
    private AddRemove componentsAddRemoveList = new AddRemove();

    public AddRemove getComponentsAddRemoveList() {
        return componentsAddRemoveList;
    }

    public void setComponentsAddRemoveList(AddRemove ar) {
        this.componentsAddRemoveList = ar;
    }
    private CachedRowSetDataProvider webcomponentsDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getWebcomponentsDataProvider() {
        return webcomponentsDataProvider;
    }

    public void setWebcomponentsDataProvider(CachedRowSetDataProvider crsdp) {
        this.webcomponentsDataProvider = crsdp;
    }
    private CachedRowSetDataProvider datatTypeDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getDatatTypeDataProvider() {
        return datatTypeDataProvider;
    }

    public void setDatatTypeDataProvider(CachedRowSetDataProvider crsdp) {
        this.datatTypeDataProvider = crsdp;
    }
    private Checkbox allComponentsCheckbox = new Checkbox();

    public Checkbox getAllComponentsCheckbox() {
        return allComponentsCheckbox;
    }

    public void setAllComponentsCheckbox(Checkbox c) {
        this.allComponentsCheckbox = c;
    }
    private StaticText staticText1 = new StaticText();

    public StaticText getStaticText1() {
        return staticText1;
    }

    public void setStaticText1(StaticText st) {
        this.staticText1 = st;
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
    private StaticText staticText5 = new StaticText();

    public StaticText getStaticText5() {
        return staticText5;
    }

    public void setStaticText5(StaticText st) {
        this.staticText5 = st;
    }
    private StaticText staticText6 = new StaticText();

    public StaticText getStaticText6() {
        return staticText6;
    }

    public void setStaticText6(StaticText st) {
        this.staticText6 = st;
    }
    private TextField maxTempTextField = new TextField();

    public TextField getMaxTempTextField() {
        return maxTempTextField;
    }

    public void setMaxTempTextField(TextField tf) {
        this.maxTempTextField = tf;
    }
    private TextField maxPresTextField = new TextField();

    public TextField getMaxPresTextField() {
        return maxPresTextField;
    }

    public void setMaxPresTextField(TextField tf) {
        this.maxPresTextField = tf;
    }
    private TextField minPresTextField = new TextField();

    public TextField getMinPresTextField() {
        return minPresTextField;
    }

    public void setMinPresTextField(TextField tf) {
        this.minPresTextField = tf;
    }
    private TextField minTempTextField = new TextField();

    public TextField getMinTempTextField() {
        return minTempTextField;
    }

    public void setMinTempTextField(TextField tf) {
        this.minTempTextField = tf;
    }
    private DoubleConverter doubleConverter1 = new DoubleConverter();

    public DoubleConverter getDoubleConverter1() {
        return doubleConverter1;
    }

    public void setDoubleConverter1(DoubleConverter dc) {
        this.doubleConverter1 = dc;
    }
    private DoubleRangeValidator doubleRangeValidator1 = new DoubleRangeValidator();

    public DoubleRangeValidator getDoubleRangeValidator1() {
        return doubleRangeValidator1;
    }

    public void setDoubleRangeValidator1(DoubleRangeValidator drv) {
        this.doubleRangeValidator1 = drv;
    }
    private MessageGroup messageGroup1 = new MessageGroup();

    public MessageGroup getMessageGroup1() {
        return messageGroup1;
    }

    public void setMessageGroup1(MessageGroup mg) {
        this.messageGroup1 = mg;
    }
    private Hyperlink useActivFLuidCompLink = new Hyperlink();

    public Hyperlink getUseActivFLuidCompLink() {
        return useActivFLuidCompLink;
    }

    public void setUseActivFLuidCompLink(Hyperlink h) {
        this.useActivFLuidCompLink = h;
    }
    private TextField freeTextField = new TextField();

    public TextField getFreeTextField() {
        return freeTextField;
    }

    public void setFreeTextField(TextField tf) {
        this.freeTextField = tf;
    }

    // </editor-fold>
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public MeasurementSelect2() {
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     */
    protected neqsimserver2.Thermo.ThermoSessionBean getThermo$ThermoSessionBean() {
        return (neqsimserver2.Thermo.ThermoSessionBean) getBean("Thermo$ThermoSessionBean");
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
    protected neqsimserver2.SessionBean1 getSessionBean1() {
        return (neqsimserver2.SessionBean1) getBean("SessionBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     */
    protected neqsimserver2.GasQuality.GasQualitySessionBean getGasQuality$GasQualitySessionBean() {
        return (neqsimserver2.GasQuality.GasQualitySessionBean) getBean("GasQuality$GasQualitySessionBean");
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
            log("MeasurementSelect2 Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
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
        datatTypeDataProvider.close();
        webcomponentsDataProvider.close();
    }

    public String submitButton_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.

        return null;
    }

    public void typeDropDownList1_processValueChange(ValueChangeEvent vce) {
        // TODO: Replace with your code
    }

    public String addButton_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.

        return null;
    }

    public String linkAction1_action() {
        // TODO: Replace with your code

        return null;
    }

    public String startMenuLinkAction_action() {
        // TODO: Replace with your code

        return null;
    }

    public String button1_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.
        String andor = "OR";
        if (allComponentsCheckbox.isChecked()) {
            andor = "AND";
        }



        try {
            System.out.println("length " + getSessionBean1().getExpTypeChoices().length);
            //System.out.println("value " + getSessionBean1().getExpTypeChoices()[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }

        String temp1 = "";
        if (!dataTypeList.getSelected().toString().equals("*")) {
            temp1 += "AND experimentaldatatype.TYPE='" + dataTypeList.getSelected().toString() + "' ";
        }
        String compSQL = "AND (";

        if (!componentsAddRemoveList.isRendered()) {
            if (getThermo$ThermoSessionBean().getThermoSystem() == null) {
                return null;
            }
            for (int i = 0; i < getThermo$ThermoSessionBean().getThermoSystem().getCompNames().length - 1; i++) {
               // compSQL += "fluidinfo." + getThermo$ThermoSessionBean().getThermoSystem().getCompNames()[i].replace("-", "").replace("_PC", "") + ">1e-30\n " + andor + " ";
            }
            //compSQL += "fluidinfo." + getThermo$ThermoSessionBean().getThermoSystem().getCompNames()[getThermo$ThermoSessionBean().getThermoSystem().getCompNames().length - 1].replace("-", "").replace("_PC", "") + ">1e-30\n";
        } else {
            if (getSessionBean1().getExpTypeChoices().length == 0) {
                return null;
            }
            for (int i = 0; i < getSessionBean1().getExpTypeChoices().length - 1; i++) {
                if (!getSessionBean1().getExpTypeChoices()[i].equals("")) {
                    compSQL += "fluidinfo." + getSessionBean1().getExpTypeChoices()[i] + ">1e-30 " + andor + " ";
                }// METHANE>1e-30\n " + andor + " "; // "+componentsAddRemoveList.getSelectedItems().next().toString()+">0\n";
            }
            if (!getSessionBean1().getExpTypeChoices()[getSessionBean1().getExpTypeChoices().length - 1].equals("")) {
                compSQL += "fluidinfo." + getSessionBean1().getExpTypeChoices()[getSessionBean1().getExpTypeChoices().length - 1] + ">1e-30 ";
            }
        }

        compSQL += ") ";

        String freeText = " ";
        try{
        if (!freeTextField.getValue().toString().trim().equals("")) {
            freeText += "AND (litterature.TEXT LIKE '%" + freeTextField.getValue().toString() + "%' ";
            freeText += "OR litterature.NAME LIKE '%" + freeTextField.getValue().toString() + "%' ";
            freeText += "OR fluidinfo.TEXT LIKE '%" + freeTextField.getValue().toString() + "%' ";
            freeText += "OR literatureandarticlestable.AUTHOR LIKE '%" + freeTextField.getValue().toString() + "%' ";
            freeText += "OR fluidinfo.TEXT LIKE '%" + freeTextField.getValue().toString() + "%' ";
            freeText += "OR literatureandarticlestable.NAME LIKE '%" + freeTextField.getValue().toString() + "%') ";
        }
        }
        catch(Exception e){
            e.printStackTrace();
        }

        String tempPresSQL = freeText + "AND litterature.MAXPRESSURE>" + Double.parseDouble(minPresTextField.getValue().toString()) + " AND litterature.MINPRESSURE<" + Double.parseDouble(maxPresTextField.getValue().toString()) + " AND litterature.MINTEMPERATURE<" + Double.parseDouble(maxTempTextField.getValue().toString()) + " AND litterature.MAXTEMPERATURE>" + Double.parseDouble(minTempTextField.getValue().toString()) + " ";


        try {
            log("SELECT ALL litterature.ID,                      litterature.FLUID_ID,                      litterature.FILE,                      litterature.TYPE,                      litterature.NAME,                      litterature.TEXT,                      litterature.EXPTYPEID,                      experimentaldatatype.ID AS EXPID,                      experimentaldatatype.TYPE,                      userdb.ID AS USERID,                      userdb.USERNAME,                      userdb.PASSWORD,                      userdb.EMAIL,                      userdb.FORNAME,                      userdb.SURENAME,                      fluidinfo.ID AS FLUIDID,                      fluidinfo.USERID,                      fluidinfo.FIELD,                      fluidinfo.WELL,                      fluidinfo.TEST,                      fluidinfo.SAMPLE,                      fluidinfo.TEXT,                      fluidinfo.HISTORY,                      fluidinfo.METHANE,                      fluidinfo.ETHANE,                      fluidinfo.PROPANE,                      fluidinfo.CO2,                      fluidinfo.H2S,                      fluidinfo.NITROGEN,                      fluidinfo.IBUTANE,                      fluidinfo.NBUTANE,                      fluidinfo.PENTANE,                      fluidinfo.NHEXANE,                      fluidinfo.CYCPENTANE,                      fluidinfo.CYCHEXANE,                      fluidinfo.NHEPTANE,                      fluidinfo.NOCTANE,                      fluidinfo.NNONANE,                      fluidinfo.NDECANE,                      fluidinfo.BENZENE,                      fluidinfo.TOLUENE,                      fluidinfo.MXYLENE,                      fluidinfo.PXYLENE,                      fluidinfo.OXYLENE,                      fluidinfo.WATER,                      fluidinfo.METHANOL,                      fluidinfo.MEG,                      fluidinfo.TEG,                      fluidinfo.DEG,                      fluidinfo.MDEA,                      fluidinfo.PIPERAZINE,                      fluidinfo.ACETICACID,                      fluidinfo.PROPIONICACID,                      fluidinfo.NAPLUS,                      fluidinfo.FEPLUS,                      fluidinfo.CAPLUS,                      fluidinfo.H3OPLUS,                      fluidinfo.OHMINUS,                      fluidinfo.CO3MINUS,                      fluidinfo.CLMINUS,                      fluidinfo.C6,                      fluidinfo.C6MOLARMASS,                      fluidinfo.C6DENSITY,                      fluidinfo.C7,                      fluidinfo.C7MOLARMASS,                      fluidinfo.C7DENSITY,                      fluidinfo.C8,                      fluidinfo.C8MOLARMASS,                      fluidinfo.C8DENSITY,                      fluidinfo.C9,                      fluidinfo.C9MOLARMASS,                      fluidinfo.C9DENSITY,                      fluidinfo.C10,                      fluidinfo.C10MOLARMASS,                      fluidinfo.C10DENSITY,                      fluidinfo.C11,                      fluidinfo.C11MOLARMASS,                      fluidinfo.C11DENSITY,                      fluidinfo.C12,                      fluidinfo.C12MOLARMASS,                      fluidinfo.C12DENSITY,                      fluidinfo.C13,                      fluidinfo.C13MOLARMASS,                      fluidinfo.C13DENSITY,                      fluidinfo.CPLUS,                      fluidinfo.CPLUSMOLARMASS,                      fluidinfo.CPLUSDENSITY,                      literatureandarticlestable.ID AS LITID,                      literatureandarticlestable.AUTHOR,                      literatureandarticlestable.NAME AS LITNAME,                      literatureandarticlestable.JOURNAL,                      literatureandarticlestable.VOLUME,                      literatureandarticlestable.PAGES,                      literatureandarticlestable.YEAR,                      literatureandarticlestable.REFERENCEID,                      litterature.ARTICLEID,                      litterature.MAXPRESSURE,                      litterature.MINPRESSURE,                      litterature.MAXTEMPERATURE,                      litterature.MINTEMPERATURE,                      fluidinfo.SHARED  FROM litterature, experimentaldatatype, userdb, fluidinfo, literatureandarticlestable WHERE litterature.EXPTYPEID = experimentaldatatype.ID           AND litterature.FLUID_ID = fluidinfo.ID           AND fluidinfo.USERID = userdb.ID   AND litterature.ARTICLEID = literatureandarticlestable.ID " +
                    temp1 + compSQL + tempPresSQL +
                    "GROUP BY litterature.ID, litterature.FLUID_ID, litterature.FILE, litterature.NAME, litterature.TEXT, litterature.EXPTYPEID, litterature.TYPE, experimentaldatatype.ID, experimentaldatatype.TYPE, userdb.ID, userdb.USERNAME, userdb.PASSWORD, userdb.EMAIL, userdb.FORNAME, userdb.SURENAME, fluidinfo.ID, fluidinfo.USERID, fluidinfo.FIELD, fluidinfo.WELL, fluidinfo.TEST, fluidinfo.SAMPLE, fluidinfo.TEXT, fluidinfo.HISTORY, fluidinfo.METHANE, fluidinfo.ETHANE, fluidinfo.PROPANE, fluidinfo.CO2, fluidinfo.H2S, fluidinfo.NITROGEN, fluidinfo.IBUTANE, fluidinfo.NBUTANE, fluidinfo.PENTANE, fluidinfo.NHEXANE, fluidinfo.CYCPENTANE, fluidinfo.CYCHEXANE, fluidinfo.NHEPTANE, fluidinfo.NOCTANE, fluidinfo.NNONANE, fluidinfo.NDECANE, fluidinfo.BENZENE, fluidinfo.TOLUENE, fluidinfo.MXYLENE, fluidinfo.PXYLENE, fluidinfo.OXYLENE, fluidinfo.WATER, fluidinfo.METHANOL, fluidinfo.MEG, fluidinfo.TEG, fluidinfo.DEG, fluidinfo.MDEA, fluidinfo.PIPERAZINE, fluidinfo.ACETICACID, fluidinfo.PROPIONICACID, fluidinfo.NAPLUS, fluidinfo.FEPLUS, fluidinfo.CAPLUS, fluidinfo.H3OPLUS, fluidinfo.OHMINUS, fluidinfo.CO3MINUS, fluidinfo.CLMINUS, fluidinfo.C6, fluidinfo.C6MOLARMASS, fluidinfo.C6DENSITY, fluidinfo.C7, fluidinfo.C7MOLARMASS, fluidinfo.C7DENSITY, fluidinfo.C8, fluidinfo.C8MOLARMASS, fluidinfo.C8DENSITY, fluidinfo.C9, fluidinfo.C9MOLARMASS, fluidinfo.C9DENSITY, fluidinfo.C10, fluidinfo.C10MOLARMASS, fluidinfo.C10DENSITY, fluidinfo.C11, fluidinfo.C11MOLARMASS, fluidinfo.C11DENSITY, fluidinfo.C12, fluidinfo.C12MOLARMASS, fluidinfo.C12DENSITY, fluidinfo.C13, fluidinfo.C13MOLARMASS, fluidinfo.C13DENSITY, fluidinfo.CPLUS, fluidinfo.CPLUSMOLARMASS, fluidinfo.CPLUSDENSITY, litterature.FLUID_ID, litterature.MAXPRESSURE, litterature.MINPRESSURE, litterature.MAXTEMPERATURE, litterature.MINTEMPERATURE, litterature.ARTICLEID");
    //            getSessiogetSessionBean1().getLitteratureRowSet2().setCommand("SELECT ALL littenBean1().getLitteratureRowSet().setCommand("SELECT ALL litterature.ID,                      litterature.FLUID_ID,                      litterature.FILE,                      litterature.NAME,                      litterature.TEXT,                      litterature.EXPTYPEID,                      litterature.TYPE,                      experimentaldatatype.ID AS EXPID,                      experimentaldatatype.TYPE AS EXPTYPE,                      userdb.ID AS USERID,                      userdb.USERNAME,                      userdb.PASSWORD,                      userdb.EMAIL,                      userdb.FORNAME,                      userdb.SURENAME,                      fluidinfo.ID AS FLUIDID,                      fluidinfo.USERID,                      fluidinfo.FIELD,                      fluidinfo.WELL,                      fluidinfo.TEST,                      fluidinfo.SAMPLE,                      fluidinfo.TEXT,                      fluidinfo.HISTORY,                      fluidinfo.METHANE,                      fluidinfo.ETHANE,                      fluidinfo.PROPANE,                      fluidinfo.CO2,                      fluidinfo.H2S,                      fluidinfo.NITROGEN,                      fluidinfo.IBUTANE,                      fluidinfo.NBUTANE,                      fluidinfo.PENTANE,                      fluidinfo.NHEXANE,                      fluidinfo.CYCPENTANE,                      fluidinfo.CYCHEXANE,                      fluidinfo.NHEPTANE,                      fluidinfo.NOCTANE,                      fluidinfo.NNONANE,                      fluidinfo.NDECANE,                      fluidinfo.BENZENE,                      fluidinfo.TOLUENE,                      fluidinfo.MXYLENE,                      fluidinfo.PXYLENE,                      fluidinfo.OXYLENE,                      fluidinfo.WATER,                      fluidinfo.METHANOL,                      fluidinfo.MEG,                      fluidinfo.TEG,                      fluidinfo.DEG,                      fluidinfo.MDEA,                      fluidinfo.PIPERAZINE,                      fluidinfo.ACETICACID,                      fluidinfo.PROPIONICACID,                      fluidinfo.NAPLUS,                      fluidinfo.FEPLUS,                      fluidinfo.CAPLUS,                      fluidinfo.H3OPLUS,                      fluidinfo.OHMINUS,                      fluidinfo.CO3MINUS,                      fluidinfo.CLMINUS,                      fluidinfo.C6,                      fluidinfo.C6MOLARMASS,                      fluidinfo.C6DENSITY,                      fluidinfo.C7,                      fluidinfo.C7MOLARMASS,                      fluidinfo.C7DENSITY,                      fluidinfo.C8,                      fluidinfo.C8MOLARMASS,                      fluidinfo.C8DENSITY,                      fluidinfo.C9,                      fluidinfo.C9MOLARMASS,                      fluidinfo.C9DENSITY,                      fluidinfo.C10,                      fluidinfo.C10MOLARMASS,                      fluidinfo.C10DENSITY,                      fluidinfo.C11,                      fluidinfo.C11MOLARMASS,                      fluidinfo.C11DENSITY,                      fluidinfo.C12,                      fluidinfo.C12MOLARMASS,                      fluidinfo.C12DENSITY,                      fluidinfo.C13,                      fluidinfo.C13MOLARMASS,                      fluidinfo.C13DENSITY,                      fluidinfo.CPLUS,                      fluidinfo.CPLUSMOLARMASS,                      fluidinfo.CPLUSDENSITY,                      litterature.FLUID_ID,                      litterature.MAXPRESSURE,                      litterature.MINPRESSURE,                      litterature.MAXTEMPERATURE,                      litterature.MINTEMPERATURE,                      litterature.ARTICLEID  FROM litterature, experimentaldatatype, userdb, fluidinfo WHERE litterature.EXPTYPEID = experimentaldatatype.ID           AND litterature.FLUID_ID = fluidinfo.ID           AND fluidinfo.USERID = userdb.ID " +
            getSessionBean1().getLitteratureRowSet2().setCommand("SELECT ALL litterature.ID,                      litterature.FLUID_ID,                      litterature.FILE,                      litterature.TYPE,                      litterature.NAME,                      litterature.TEXT,                      litterature.EXPTYPEID,                      experimentaldatatype.ID AS EXPID,                      experimentaldatatype.TYPE,                      userdb.ID AS USERID,                      userdb.USERNAME,                      userdb.PASSWORD,                      userdb.EMAIL,                      userdb.FORNAME,                      userdb.SURENAME,                      fluidinfo.ID AS FLUIDID,                      fluidinfo.USERID,                      fluidinfo.FIELD,                      fluidinfo.WELL,                      fluidinfo.TEST,                      fluidinfo.SAMPLE,                      fluidinfo.TEXT,                      fluidinfo.HISTORY,                      fluidinfo.METHANE,                      fluidinfo.ETHANE,                      fluidinfo.PROPANE,                      fluidinfo.CO2,                      fluidinfo.H2S,                      fluidinfo.NITROGEN,                      fluidinfo.IBUTANE,                      fluidinfo.NBUTANE,                      fluidinfo.PENTANE,                      fluidinfo.NHEXANE,                      fluidinfo.CYCPENTANE,                      fluidinfo.CYCHEXANE,                      fluidinfo.NHEPTANE,                      fluidinfo.NOCTANE,                      fluidinfo.NNONANE,                      fluidinfo.NDECANE,                      fluidinfo.BENZENE,                      fluidinfo.TOLUENE,                      fluidinfo.MXYLENE,                      fluidinfo.PXYLENE,                      fluidinfo.OXYLENE,                      fluidinfo.WATER,                      fluidinfo.METHANOL,                      fluidinfo.MEG,                      fluidinfo.TEG,                      fluidinfo.DEG,                      fluidinfo.MDEA,                      fluidinfo.PIPERAZINE,                      fluidinfo.ACETICACID,                      fluidinfo.PROPIONICACID,                      fluidinfo.NAPLUS,                      fluidinfo.FEPLUS,                      fluidinfo.CAPLUS,                      fluidinfo.H3OPLUS,                      fluidinfo.OHMINUS,                      fluidinfo.CO3MINUS,                      fluidinfo.CLMINUS,                      fluidinfo.C6,                      fluidinfo.C6MOLARMASS,                      fluidinfo.C6DENSITY,                      fluidinfo.C7,                      fluidinfo.C7MOLARMASS,                      fluidinfo.C7DENSITY,                      fluidinfo.C8,                      fluidinfo.C8MOLARMASS,                      fluidinfo.C8DENSITY,                      fluidinfo.C9,                      fluidinfo.C9MOLARMASS,                      fluidinfo.C9DENSITY,                      fluidinfo.C10,                      fluidinfo.C10MOLARMASS,                      fluidinfo.C10DENSITY,                      fluidinfo.C11,                      fluidinfo.C11MOLARMASS,                      fluidinfo.C11DENSITY,                      fluidinfo.C12,                      fluidinfo.C12MOLARMASS,                      fluidinfo.C12DENSITY,                      fluidinfo.C13,                      fluidinfo.C13MOLARMASS,                      fluidinfo.C13DENSITY,                      fluidinfo.CPLUS,                      fluidinfo.CPLUSMOLARMASS,                      fluidinfo.CPLUSDENSITY,                      literatureandarticlestable.ID AS LITID,                      literatureandarticlestable.AUTHOR,                      literatureandarticlestable.NAME AS LITNAME,                      literatureandarticlestable.JOURNAL,                      literatureandarticlestable.VOLUME,                      literatureandarticlestable.PAGES,                      literatureandarticlestable.YEAR,                      literatureandarticlestable.REFERENCEID,                      litterature.ARTICLEID,                      litterature.MAXPRESSURE,                      litterature.MINPRESSURE,                      litterature.MAXTEMPERATURE,                      litterature.MINTEMPERATURE,                      fluidinfo.SHARED  FROM litterature, experimentaldatatype, userdb, fluidinfo, literatureandarticlestable WHERE litterature.EXPTYPEID = experimentaldatatype.ID           AND litterature.FLUID_ID = fluidinfo.ID           AND fluidinfo.USERID = userdb.ID   AND litterature.ARTICLEID = literatureandarticlestable.ID " +
                    temp1 + compSQL + tempPresSQL +
                    "GROUP BY litterature.ID, litterature.FLUID_ID, litterature.FILE, litterature.NAME, litterature.TEXT, litterature.EXPTYPEID, litterature.TYPE, experimentaldatatype.ID, experimentaldatatype.TYPE, userdb.ID, userdb.USERNAME, userdb.PASSWORD, userdb.EMAIL, userdb.FORNAME, userdb.SURENAME, fluidinfo.ID, fluidinfo.USERID, fluidinfo.FIELD, fluidinfo.WELL, fluidinfo.TEST, fluidinfo.SAMPLE, fluidinfo.TEXT, fluidinfo.HISTORY, fluidinfo.METHANE, fluidinfo.ETHANE, fluidinfo.PROPANE, fluidinfo.CO2, fluidinfo.H2S, fluidinfo.NITROGEN, fluidinfo.IBUTANE, fluidinfo.NBUTANE, fluidinfo.PENTANE, fluidinfo.NHEXANE, fluidinfo.CYCPENTANE, fluidinfo.CYCHEXANE, fluidinfo.NHEPTANE, fluidinfo.NOCTANE, fluidinfo.NNONANE, fluidinfo.NDECANE, fluidinfo.BENZENE, fluidinfo.TOLUENE, fluidinfo.MXYLENE, fluidinfo.PXYLENE, fluidinfo.OXYLENE, fluidinfo.WATER, fluidinfo.METHANOL, fluidinfo.MEG, fluidinfo.TEG, fluidinfo.DEG, fluidinfo.MDEA, fluidinfo.PIPERAZINE, fluidinfo.ACETICACID, fluidinfo.PROPIONICACID, fluidinfo.NAPLUS, fluidinfo.FEPLUS, fluidinfo.CAPLUS, fluidinfo.H3OPLUS, fluidinfo.OHMINUS, fluidinfo.CO3MINUS, fluidinfo.CLMINUS, fluidinfo.C6, fluidinfo.C6MOLARMASS, fluidinfo.C6DENSITY, fluidinfo.C7, fluidinfo.C7MOLARMASS, fluidinfo.C7DENSITY, fluidinfo.C8, fluidinfo.C8MOLARMASS, fluidinfo.C8DENSITY, fluidinfo.C9, fluidinfo.C9MOLARMASS, fluidinfo.C9DENSITY, fluidinfo.C10, fluidinfo.C10MOLARMASS, fluidinfo.C10DENSITY, fluidinfo.C11, fluidinfo.C11MOLARMASS, fluidinfo.C11DENSITY, fluidinfo.C12, fluidinfo.C12MOLARMASS, fluidinfo.C12DENSITY, fluidinfo.C13, fluidinfo.C13MOLARMASS, fluidinfo.C13DENSITY, fluidinfo.CPLUS, fluidinfo.CPLUSMOLARMASS, fluidinfo.CPLUSDENSITY, litterature.FLUID_ID, litterature.MAXPRESSURE, litterature.MINPRESSURE, litterature.MAXTEMPERATURE, litterature.MINTEMPERATURE, litterature.ARTICLEID");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "ToThermoMeasurementDB";
    }

    public void allComponentRadioButton_processValueChange(ValueChangeEvent event) {
        // TODO: Replace with your code
    }

    public String useActivFLuidCompLink_action() {
        if (componentsAddRemoveList.isRendered()) {
            componentsAddRemoveList.setRendered(false);
        } else {
            componentsAddRemoveList.setRendered(true);
        }
        return null;
    }
}

