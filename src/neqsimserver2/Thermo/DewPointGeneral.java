/*
 * BubblePoint2.java
 *
 * Created on 16. april 2006, 20:40
 * Copyright ESOL
 */
package neqsimserver2.Thermo;

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
import javax.faces.component.html.HtmlInputText;
import com.sun.rave.web.ui.component.CheckboxGroup;
import com.sun.rave.web.ui.model.MultipleSelectOptionsList;
import javax.faces.event.ValueChangeEvent;
import javax.faces.component.html.HtmlSelectBooleanCheckbox;
import javax.faces.component.html.HtmlCommandButton;
import com.sun.rave.web.ui.component.Button;
import com.sun.rave.web.ui.component.StaticText;
import java.text.DecimalFormat;
import com.sun.rave.web.ui.component.MessageGroup;
import javax.faces.validator.DoubleRangeValidator;
import javax.faces.convert.DoubleConverter;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class DewPointGeneral extends AbstractPageBean {
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
    
    private HtmlGraphicImage imageNeqSIm1 = new HtmlGraphicImage();
    
    public HtmlGraphicImage getImageNeqSIm1() {
        return imageNeqSIm1;
    }
    
    public void setImageNeqSIm1(HtmlGraphicImage hgi) {
        this.imageNeqSIm1 = hgi;
    }
    
    private HtmlOutputText gergWaterMenuText1 = new HtmlOutputText();
    
    public HtmlOutputText getGergWaterMenuText1() {
        return gergWaterMenuText1;
    }
    
    public void setGergWaterMenuText1(HtmlOutputText hot) {
        this.gergWaterMenuText1 = hot;
    }
    
    private HtmlInputText temperatureTextInputField = new HtmlInputText();
    
    public HtmlInputText getTemperatureTextInputField() {
        return temperatureTextInputField;
    }
    
    public void setTemperatureTextInputField(HtmlInputText hit) {
        this.temperatureTextInputField = hit;
    }
    
    private HtmlOutputText temperatureTextField1 = new HtmlOutputText();
    
    public HtmlOutputText getTemperatureTextField1() {
        return temperatureTextField1;
    }
    
    public void setTemperatureTextField1(HtmlOutputText hot) {
        this.temperatureTextField1 = hot;
    }
    
    private HtmlOutputText pressureTextField1 = new HtmlOutputText();
    
    public HtmlOutputText getPressureTextField1() {
        return pressureTextField1;
    }
    
    public void setPressureTextField1(HtmlOutputText hot) {
        this.pressureTextField1 = hot;
    }
    
    private HtmlInputText pressureTextInputField = new HtmlInputText();
    
    public HtmlInputText getPressureTextInputField() {
        return pressureTextInputField;
    }
    
    public void setPressureTextInputField(HtmlInputText hit) {
        this.pressureTextInputField = hit;
    }
    
    private HtmlSelectBooleanCheckbox bubPointTCheckBox = new HtmlSelectBooleanCheckbox();
    
    public HtmlSelectBooleanCheckbox getBubPointTCheckBox() {
        return bubPointTCheckBox;
    }
    
    public void setBubPointTCheckBox(HtmlSelectBooleanCheckbox hsbc) {
        this.bubPointTCheckBox = hsbc;
    }
    
    private HtmlOutputText dewPointText1 = new HtmlOutputText();
    
    public HtmlOutputText getDewPointText1() {
        return dewPointText1;
    }
    
    public void setDewPointText1(HtmlOutputText hot) {
        this.dewPointText1 = hot;
    }
    
    private HtmlSelectBooleanCheckbox bubPointPCheckBox = new HtmlSelectBooleanCheckbox();
    
    public HtmlSelectBooleanCheckbox getBubPointPCheckBox() {
        return bubPointPCheckBox;
    }
    
    public void setBubPointPCheckBox(HtmlSelectBooleanCheckbox hsbc) {
        this.bubPointPCheckBox = hsbc;
    }
    
    private HtmlOutputText tpFlashSelectorText1 = new HtmlOutputText();
    
    public HtmlOutputText getTpFlashSelectorText1() {
        return tpFlashSelectorText1;
    }
    
    public void setTpFlashSelectorText1(HtmlOutputText hot) {
        this.tpFlashSelectorText1 = hot;
    }
    
    private Button okButton = new Button();
    
    public Button getOkButton() {
        return okButton;
    }
    
    public void setOkButton(Button b) {
        this.okButton = b;
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
    
    private StaticText bubblePointPressureTextField = new StaticText();
    
    public StaticText getBubblePointPressureTextField() {
        return bubblePointPressureTextField;
    }
    
    public void setBubblePointPressureTextField(StaticText st) {
        this.bubblePointPressureTextField = st;
    }
    
    private StaticText bublePointTemperatureTextField = new StaticText();
    
    public StaticText getBublePointTemperatureTextField() {
        return bublePointTemperatureTextField;
    }
    
    public void setBublePointTemperatureTextField(StaticText st) {
        this.bublePointTemperatureTextField = st;
    }

    private MessageGroup messageGroup1 = new MessageGroup();

    public MessageGroup getMessageGroup1() {
        return messageGroup1;
    }

    public void setMessageGroup1(MessageGroup mg) {
        this.messageGroup1 = mg;
    }

    private DoubleRangeValidator doubleRangeValidator1 = new DoubleRangeValidator();

    public DoubleRangeValidator getDoubleRangeValidator1() {
        return doubleRangeValidator1;
    }

    public void setDoubleRangeValidator1(DoubleRangeValidator drv) {
        this.doubleRangeValidator1 = drv;
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
    public DewPointGeneral() {
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
    protected ThermoSessionBean getThermo$ThermoSessionBean() {
        return (ThermoSessionBean)getBean("Thermo$ThermoSessionBean");
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
            log("BubblePoint2 Initialization Failure", e);
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
    
    
    public void checkboxGroup1_processValueChange(ValueChangeEvent event) {
        // TODO: Replace with your code
        
    }
    
    
    public void bubPointTCheckBox_processValueChange(ValueChangeEvent vce) {
   }
    
    
    public void bubPointPCheckBox_processValueChange(ValueChangeEvent vce) {
    }
    
    
    public String okButton_action() {
        
        java.text.DecimalFormat decFormat = new java.text.DecimalFormat();
        decFormat.setMaximumFractionDigits(3);
        
        
        getThermo$ThermoSessionBean().getThermoSystem().setTemperature(273.15+java.lang.Double.parseDouble(getTemperatureTextInputField().getValue().toString()));
        getThermo$ThermoSessionBean().getThermoSystem().setPressure(java.lang.Double.parseDouble(getPressureTextInputField().getValue().toString()));
        
        thermodynamicOperations.ThermodynamicOperations ops = new  thermodynamicOperations.ThermodynamicOperations(getThermo$ThermoSessionBean().getThermoSystem());
        try{
            if (bubPointTCheckBox.isSelected()) ops.dewPointTemperatureFlash();
            else if (bubPointPCheckBox.isSelected()) ops.dewPointPressureFlash();
            else ops.dewPointTemperatureFlash();
        } catch (Exception e){
            e.printStackTrace();
        }
        getThermo$ThermoSessionBean().getThermoSystem().createTable(getThermo$ThermoSessionBean().getThermoSystem().getFluidName());
        
        getThermo$ThermoSessionBean().setDisplayGraph(false);
        getThermo$ThermoSessionBean().setDisplayData(true);
        
        bubblePointPressureTextField.setValue(decFormat.format(getThermo$ThermoSessionBean().getThermoSystem().getPressure()));
        bublePointTemperatureTextField.setValue(decFormat.format(getThermo$ThermoSessionBean().getThermoSystem().getTemperature()-273.15));
        return null;
    }
    
    
}

