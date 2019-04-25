/*
 * ISO6976energy.java
 *
 * Created on 27. mars 2006, 23:36
 * Copyright ESOL
 */
package neqsimserver2.GasQuality.Calculator;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.MessageGroup;
import com.sun.rave.web.ui.component.Page;
import com.sun.rave.web.ui.component.RadioButtonGroup;
import com.sun.rave.web.ui.component.StaticText;
import com.sun.rave.web.ui.model.DefaultTableDataProvider;
import com.sun.rave.web.ui.model.MultipleSelectOptionsList;
import com.sun.rave.web.ui.model.SingleSelectOptionsList;
import javax.faces.FacesException;
import javax.faces.component.html.HtmlGraphicImage;
import javax.faces.component.html.HtmlOutputText;
import com.sun.rave.web.ui.component.Button;
import javax.faces.component.html.HtmlDataTable;
import javax.faces.component.UIColumn;
import com.sun.rave.web.ui.component.ImageHyperlink;
import javax.faces.convert.DoubleConverter;
import javax.faces.convert.IntegerConverter;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class ISO6976energy extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Creator-managed Component Definition">

    private int __placeholder;
    //private String[] referenceTemperatureItems = {"0C", "15C", "25C"};

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        refMeasTempCheckBoxGroupDefaultOptions.setOptions(new com.sun.rave.web.ui.model.Option[]{new com.sun.rave.web.ui.model.Option("0", "0"), new com.sun.rave.web.ui.model.Option("15", "15"), new com.sun.rave.web.ui.model.Option("15.55", "15.55"), new com.sun.rave.web.ui.model.Option("20", "20")});
        refMeasTempCheckBoxGroupDefaultOptions.setSelectedValue("15");
        outputRadioButtonGroupDefaultOptions.setOptions(new com.sun.rave.web.ui.model.Option[]{new com.sun.rave.web.ui.model.Option("volume", "volume"), new com.sun.rave.web.ui.model.Option("molar", "molar"), new com.sun.rave.web.ui.model.Option("mass", "mass")});
        outputRadioButtonGroupDefaultOptions.setSelectedValue("volume");
        refCompustTempCheckBoxGroupDefaultOptions.setOptions(new com.sun.rave.web.ui.model.Option[]{new com.sun.rave.web.ui.model.Option("0", "0"), new com.sun.rave.web.ui.model.Option("15", "15"), new com.sun.rave.web.ui.model.Option("15.55", "15.55"), new com.sun.rave.web.ui.model.Option("20", "20"), new com.sun.rave.web.ui.model.Option("25", "25")});
        refCompustTempCheckBoxGroupDefaultOptions.setSelectedValue("15");
        gasBehaviorButtonGroupDefaultOptions.setOptions(new com.sun.rave.web.ui.model.Option[]{new com.sun.rave.web.ui.model.Option("real", "real"), new com.sun.rave.web.ui.model.Option("ideal", "ideal")});
        gasBehaviorButtonGroupDefaultOptions.setSelectedValue("real");
        standardNameGroupDefaultOptions.setOptions(new com.sun.rave.web.ui.model.Option[]{new com.sun.rave.web.ui.model.Option("2006", "2006"), new com.sun.rave.web.ui.model.Option("2016", "2016")});
        standardNameGroupDefaultOptions.setSelectedValue("2006");
        dataTable1.setRendered(false);
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
    private HtmlOutputText outputText1 = new HtmlOutputText();

    public HtmlOutputText getOutputText1() {
        return outputText1;
    }

    public void setOutputText1(HtmlOutputText hot) {
        this.outputText1 = hot;
    }
    private Button button1 = new Button();

    public Button getButton1() {
        return button1;
    }

    public void setButton1(Button b) {
        this.button1 = b;
    }
    private HtmlDataTable dataTable1 = new HtmlDataTable();

    public HtmlDataTable getDataTable1() {
        return dataTable1;
    }

    public void setDataTable1(HtmlDataTable hdt) {
        this.dataTable1 = hdt;
    }
    private UIColumn column1 = new UIColumn();

    public UIColumn getColumn1() {
        return column1;
    }

    public void setColumn1(UIColumn uic) {
        this.column1 = uic;
    }
    private HtmlOutputText outputText2 = new HtmlOutputText();

    public HtmlOutputText getOutputText2() {
        return outputText2;
    }

    public void setOutputText2(HtmlOutputText hot) {
        this.outputText2 = hot;
    }
    private HtmlOutputText outputText3 = new HtmlOutputText();

    public HtmlOutputText getOutputText3() {
        return outputText3;
    }

    public void setOutputText3(HtmlOutputText hot) {
        this.outputText3 = hot;
    }
    private UIColumn column2 = new UIColumn();

    public UIColumn getColumn2() {
        return column2;
    }

    public void setColumn2(UIColumn uic) {
        this.column2 = uic;
    }
    private HtmlOutputText outputText4 = new HtmlOutputText();

    public HtmlOutputText getOutputText4() {
        return outputText4;
    }

    public void setOutputText4(HtmlOutputText hot) {
        this.outputText4 = hot;
    }
    private HtmlOutputText outputText5 = new HtmlOutputText();

    public HtmlOutputText getOutputText5() {
        return outputText5;
    }

    public void setOutputText5(HtmlOutputText hot) {
        this.outputText5 = hot;
    }
    private UIColumn column3 = new UIColumn();

    public UIColumn getColumn3() {
        return column3;
    }

    public void setColumn3(UIColumn uic) {
        this.column3 = uic;
    }
    private HtmlOutputText outputText6 = new HtmlOutputText();

    public HtmlOutputText getOutputText6() {
        return outputText6;
    }

    public void setOutputText6(HtmlOutputText hot) {
        this.outputText6 = hot;
    }
    private HtmlOutputText outputText7 = new HtmlOutputText();

    public HtmlOutputText getOutputText7() {
        return outputText7;
    }

    public void setOutputText7(HtmlOutputText hot) {
        this.outputText7 = hot;
    }
    private UIColumn column4 = new UIColumn();

    public UIColumn getColumn4() {
        return column4;
    }

    public void setColumn4(UIColumn uic) {
        this.column4 = uic;
    }
    private HtmlOutputText outputText8 = new HtmlOutputText();

    public HtmlOutputText getOutputText8() {
        return outputText8;
    }

    public void setOutputText8(HtmlOutputText hot) {
        this.outputText8 = hot;
    }
    private HtmlOutputText outputText9 = new HtmlOutputText();

    public HtmlOutputText getOutputText9() {
        return outputText9;
    }

    public void setOutputText9(HtmlOutputText hot) {
        this.outputText9 = hot;
    }
    private UIColumn column5 = new UIColumn();

    public UIColumn getColumn5() {
        return column5;
    }

    public void setColumn5(UIColumn uic) {
        this.column5 = uic;
    }
    private HtmlOutputText outputText10 = new HtmlOutputText();

    public HtmlOutputText getOutputText10() {
        return outputText10;
    }

    public void setOutputText10(HtmlOutputText hot) {
        this.outputText10 = hot;
    }
    private HtmlOutputText outputText11 = new HtmlOutputText();

    public HtmlOutputText getOutputText11() {
        return outputText11;
    }

    public void setOutputText11(HtmlOutputText hot) {
        this.outputText11 = hot;
    }
    private ImageHyperlink imageHyperlink1 = new ImageHyperlink();

    public ImageHyperlink getImageHyperlink1() {
        return imageHyperlink1;
    }

    public void setImageHyperlink1(ImageHyperlink ih) {
        this.imageHyperlink1 = ih;
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
    private RadioButtonGroup refMeasTempCheckBoxGroup = new RadioButtonGroup();

    public RadioButtonGroup getRefMeasTempCheckBoxGroup() {
        return refMeasTempCheckBoxGroup;
    }

    public void setRefMeasTempCheckBoxGroup(RadioButtonGroup rbg) {
        this.refMeasTempCheckBoxGroup = rbg;
    }
    private SingleSelectOptionsList refMeasTempCheckBoxGroupDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getRefMeasTempCheckBoxGroupDefaultOptions() {
        return refMeasTempCheckBoxGroupDefaultOptions;
    }

    public void setRefMeasTempCheckBoxGroupDefaultOptions(SingleSelectOptionsList ssol) {
        this.refMeasTempCheckBoxGroupDefaultOptions = ssol;
    }
    private IntegerConverter integerConverter1 = new IntegerConverter();

    public IntegerConverter getIntegerConverter1() {
        return integerConverter1;
    }

    public void setIntegerConverter1(IntegerConverter ic) {
        this.integerConverter1 = ic;
    }
    private RadioButtonGroup outputRadioButtonGroup = new RadioButtonGroup();

    public RadioButtonGroup getOutputRadioButtonGroup() {
        return outputRadioButtonGroup;
    }

    public void setOutputRadioButtonGroup(RadioButtonGroup rbg) {
        this.outputRadioButtonGroup = rbg;
    }
    private SingleSelectOptionsList outputRadioButtonGroupDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getOutputRadioButtonGroupDefaultOptions() {
        return outputRadioButtonGroupDefaultOptions;
    }

    public void setOutputRadioButtonGroupDefaultOptions(SingleSelectOptionsList ssol) {
        this.outputRadioButtonGroupDefaultOptions = ssol;
    }
    private RadioButtonGroup refCompustTempCheckBoxGroup = new RadioButtonGroup();

    public RadioButtonGroup getRefCompustTempCheckBoxGroup() {
        return refCompustTempCheckBoxGroup;
    }

    public void setRefCompustTempCheckBoxGroup(RadioButtonGroup rbg) {
        this.refCompustTempCheckBoxGroup = rbg;
    }
    private SingleSelectOptionsList refCompustTempCheckBoxGroupDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getRefCompustTempCheckBoxGroupDefaultOptions() {
        return refCompustTempCheckBoxGroupDefaultOptions;
    }

    public void setRefCompustTempCheckBoxGroupDefaultOptions(SingleSelectOptionsList ssol) {
        this.refCompustTempCheckBoxGroupDefaultOptions = ssol;
    }
    private MessageGroup messageGroup1 = new MessageGroup();

    public MessageGroup getMessageGroup1() {
        return messageGroup1;
    }

    public void setMessageGroup1(MessageGroup mg) {
        this.messageGroup1 = mg;
    }
    private SingleSelectOptionsList gasBehaviorButtonGroupDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getGasBehaviorButtonGroupDefaultOptions() {
        return gasBehaviorButtonGroupDefaultOptions;
    }

    public void setGasBehaviorButtonGroupDefaultOptions(SingleSelectOptionsList ssol) {
        this.gasBehaviorButtonGroupDefaultOptions = ssol;
    }
    private RadioButtonGroup gasBehaviorButtonGroup = new RadioButtonGroup();

    public RadioButtonGroup getGasBehaviorButtonGroup() {
        return gasBehaviorButtonGroup;
    }

    public void setGasBehaviorButtonGroup(RadioButtonGroup rbg) {
        this.gasBehaviorButtonGroup = rbg;
    }
    private SingleSelectOptionsList standardNameGroupDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getStandardNameGroupDefaultOptions() {
        return standardNameGroupDefaultOptions;
    }

    public void setStandardNameGroupDefaultOptions(SingleSelectOptionsList ssol) {
        this.standardNameGroupDefaultOptions = ssol;
    }
    private DoubleConverter doubleConverter1 = new DoubleConverter();

    public DoubleConverter getDoubleConverter1() {
        return doubleConverter1;
    }

    public void setDoubleConverter1(DoubleConverter dc) {
        this.doubleConverter1 = dc;
    }

    // </editor-fold>
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public ISO6976energy() {
        // Map a = new Map();
        // a.put("1", "a");s
        // checkboxGroup2.setItems(a);
        refMeasTempCheckBoxGroupDefaultOptions.setSelectedValue("15");
        outputRadioButtonGroupDefaultOptions.setSelectedValue("volume");
        refCompustTempCheckBoxGroupDefaultOptions.setSelectedValue("15");
        standardNameGroupDefaultOptions.setSelectedValue("2006");
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
    protected neqsimserver2.Thermo.ThermoSessionBean getThermo$ThermoSessionBean() {
        return (neqsimserver2.Thermo.ThermoSessionBean) getBean("Thermo$ThermoSessionBean");
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
    protected neqsimserver2.ApplicationBean1 getApplicationBean1() {
        return (neqsimserver2.ApplicationBean1) getBean("ApplicationBean1");
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
            log("ISO6976energy Initialization Failure", e);
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
        refMeasTempCheckBoxGroupDefaultOptions.setSelectedValue("15");
        outputRadioButtonGroupDefaultOptions.setSelectedValue("volume");
        refCompustTempCheckBoxGroupDefaultOptions.setSelectedValue("15");
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
    }

    public String button1_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.
        getThermo$ThermoSessionBean().getThermoSystem().init(0);
        getThermo$ThermoSessionBean().getThermoSystem().init(1);

        Double refTempVol = new Double(getRefMeasTempCheckBoxGroup().getSelected().toString());
        Double refTempEnergy = new Double(getRefCompustTempCheckBoxGroup().getSelected().toString());
        String refType = getOutputRadioButtonGroup().getSelected().toString();
        System.out.println("ref temp " + refTempVol.intValue());

        neqsim.standards.gasQuality.Standard_ISO6976 standard = new neqsim.standards.gasQuality.Standard_ISO6976(getThermo$ThermoSessionBean().getThermoSystem(), refTempVol.doubleValue(), refTempEnergy.doubleValue(), refType);

        if(standardNameGroupDefaultOptions.getSelectedValue().toString().equals("2016")){
            standard = new neqsim.standards.gasQuality.Standard_ISO6976_2016(getThermo$ThermoSessionBean().getThermoSystem(), refTempVol.doubleValue(), refTempEnergy.doubleValue(), refType);
        }
        String idealreal = gasBehaviorButtonGroup.getSelected().toString();
        standard.setReferenceState(idealreal);

        getThermo$ThermoSessionBean().setISOstandard(standard);


        //getThermo$ThermoSessionBean().getISOstandard().
        //getThermo$ThermoSessionBean().getISOstandard().setReferenceState(getGasBehaviorButtonGroup().getSelected().toString());

        getThermo$ThermoSessionBean().getISOstandard().calculate();
        getThermo$ThermoSessionBean().getISOstandard().createTable("ISO6972");
        //getThermo$ThermoSessionBean().getISOstandard().display("tes");
        dataTable1.setRendered(true);

      
        return null;//"ToGasQualityVeiwResults";
    }

    public String imageHyperlink1_action() {
        // TODO: Replace with your code
        getSessionBean1().setDocumentName("ISOGERGWATER");
        return "DisplayDocument";
    }
}

