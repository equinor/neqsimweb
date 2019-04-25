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
import com.sun.rave.web.ui.component.Page;
import javax.faces.FacesException;
import javax.faces.component.html.HtmlGraphicImage;
import javax.faces.component.html.HtmlOutputText;
import com.sun.rave.web.ui.component.Button;
import javax.faces.component.html.HtmlDataTable;
import javax.faces.component.UIColumn;
import com.sun.rave.web.ui.component.ImageHyperlink;
import javax.faces.component.html.HtmlInputText;
import javax.faces.validator.LengthValidator;
import javax.faces.validator.DoubleRangeValidator;
import javax.faces.component.html.HtmlMessage;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class ISOgerg2004 extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Creator-managed Component Definition">
    private int __placeholder;
    
    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
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

    private HtmlInputText temperatureTextField = new HtmlInputText();

    public HtmlInputText getTemperatureTextField() {
        return temperatureTextField;
    }

    public void setTemperatureTextField(HtmlInputText hit) {
        this.temperatureTextField = hit;
    }

    private HtmlInputText pressureTextField = new HtmlInputText();

    public HtmlInputText getPressureTextField() {
        return pressureTextField;
    }

    public void setPressureTextField(HtmlInputText hit) {
        this.pressureTextField = hit;
    }

    private HtmlOutputText outputText12 = new HtmlOutputText();

    public HtmlOutputText getOutputText12() {
        return outputText12;
    }

    public void setOutputText12(HtmlOutputText hot) {
        this.outputText12 = hot;
    }

    private HtmlOutputText outputText13 = new HtmlOutputText();

    public HtmlOutputText getOutputText13() {
        return outputText13;
    }

    public void setOutputText13(HtmlOutputText hot) {
        this.outputText13 = hot;
    }

    private HtmlOutputText outputText14 = new HtmlOutputText();

    public HtmlOutputText getOutputText14() {
        return outputText14;
    }

    public void setOutputText14(HtmlOutputText hot) {
        this.outputText14 = hot;
    }

    private HtmlOutputText outputText15 = new HtmlOutputText();

    public HtmlOutputText getOutputText15() {
        return outputText15;
    }

    public void setOutputText15(HtmlOutputText hot) {
        this.outputText15 = hot;
    }

    private LengthValidator lengthValidator1 = new LengthValidator();

    public LengthValidator getLengthValidator1() {
        return lengthValidator1;
    }

    public void setLengthValidator1(LengthValidator lv) {
        this.lengthValidator1 = lv;
    }

    private DoubleRangeValidator doubleRangeValidator1 = new DoubleRangeValidator();

    public DoubleRangeValidator getDoubleRangeValidator1() {
        return doubleRangeValidator1;
    }

    public void setDoubleRangeValidator1(DoubleRangeValidator drv) {
        this.doubleRangeValidator1 = drv;
    }

    private HtmlMessage inlineMessage1 = new HtmlMessage();

    public HtmlMessage getInlineMessage1() {
        return inlineMessage1;
    }

    public void setInlineMessage1(HtmlMessage hm) {
        this.inlineMessage1 = hm;
    }

    private HtmlMessage inlineMessage2 = new HtmlMessage();

    public HtmlMessage getInlineMessage2() {
        return inlineMessage2;
    }

    public void setInlineMessage2(HtmlMessage hm) {
        this.inlineMessage2 = hm;
    }
    
    // </editor-fold>
    
    
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public ISOgerg2004() {
    }
    
    /**
     * <p>Return a reference to the scoped data bean.</p>
     */
    protected neqsimserver2.GasQuality.GasQualitySessionBean getGasQuality$GasQualitySessionBean() {
        return (neqsimserver2.GasQuality.GasQualitySessionBean)getBean("GasQuality$GasQualitySessionBean");
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
    protected neqsimserver2.SessionBean1 getSessionBean1() {
        return (neqsimserver2.SessionBean1)getBean("SessionBean1");
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
            log("ISO6976energy Initialization Failure", e);
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
    }
    
    
    public String button1_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.
        getThermo$ThermoSessionBean().getThermoSystem().init(0);
        getThermo$ThermoSessionBean().getThermoSystem().init(1);
        
        getThermo$ThermoSessionBean().getThermoSystem().setPressure(Double.parseDouble(pressureTextField.getValue().toString()));
        getThermo$ThermoSessionBean().getThermoSystem().setTemperature(273.15+Double.parseDouble(temperatureTextField.getValue().toString()));
        
        getThermo$ThermoSessionBean().setISOstandard(new neqsim.standards.gasQuality.Draft_GERG2004(getThermo$ThermoSessionBean().getThermoSystem()));
        getThermo$ThermoSessionBean().getISOstandard().calculate();
        getThermo$ThermoSessionBean().getISOstandard().createTable("GERG 2004 EOS");
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

