/*
 * DewPoint2.java
 *
 * Created on 10. april 2006, 11:11
 * Copyright ESOL
 */
package neqsimserver2.Thermo;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Checkbox;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.Page;
import javax.faces.FacesException;
import javax.faces.component.html.HtmlGraphicImage;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.component.html.HtmlInputText;
import com.sun.rave.web.ui.component.Button;
import com.sun.rave.web.ui.component.StaticText;
import com.sun.rave.web.ui.component.MessageGroup;
import neqsim.thermo.component.ComponentHydrate;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class HydrateCalc extends AbstractPageBean {
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
    private HtmlInputText pressureTextField = new HtmlInputText();

    public HtmlInputText getPressureTextField() {
        return pressureTextField;
    }

    public void setPressureTextField(HtmlInputText hit) {
        this.pressureTextField = hit;
    }
    private HtmlOutputText pressureTextField1 = new HtmlOutputText();

    public HtmlOutputText getPressureTextField1() {
        return pressureTextField1;
    }

    public void setPressureTextField1(HtmlOutputText hot) {
        this.pressureTextField1 = hot;
    }
    private Button button1 = new Button();

    public Button getButton1() {
        return button1;
    }

    public void setButton1(Button b) {
        this.button1 = b;
    }
    private StaticText staticText3 = new StaticText();

    public StaticText getStaticText3() {
        return staticText3;
    }

    public void setStaticText3(StaticText st) {
        this.staticText3 = st;
    }
    private StaticText hydrateFormationTemperatureTextField = new StaticText();

    public StaticText getHydrateFormationTemperatureTextField() {
        return hydrateFormationTemperatureTextField;
    }

    public void setHydrateFormationTemperatureTextField(StaticText st) {
        this.hydrateFormationTemperatureTextField = st;
    }
    private MessageGroup messageGroup1 = new MessageGroup();

    public MessageGroup getMessageGroup1() {
        return messageGroup1;
    }

    public void setMessageGroup1(MessageGroup mg) {
        this.messageGroup1 = mg;
    }
    private StaticText staticText6 = new StaticText();

    public StaticText getStaticText6() {
        return staticText6;
    }

    public void setStaticText6(StaticText st) {
        this.staticText6 = st;
    }
    private StaticText staticText7 = new StaticText();

    public StaticText getStaticText7() {
        return staticText7;
    }

    public void setStaticText7(StaticText st) {
        this.staticText7 = st;
    }
    private StaticText hydrateStructureTextField = new StaticText();

    public StaticText getHydrateStructureTextField() {
        return hydrateStructureTextField;
    }

    public void setHydrateStructureTextField(StaticText st) {
        this.hydrateStructureTextField = st;
    }
    private Checkbox TOLhydratecheckbox = new Checkbox();

    public Checkbox getTOLhydratecheckbox() {
        return TOLhydratecheckbox;
    }

    public void setTOLhydratecheckbox(Checkbox c) {
        this.TOLhydratecheckbox = c;
    }

    // </editor-fold>
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public HydrateCalc() {
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
            log("DewPoint2 Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
        }
        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
        getThermo$ThermoSessionBean().setActiveExperimentType("gas hydrate");
        getThermo$ThermoSessionBean().setActiveWikiCategory("gas hydrate");
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
        //button1.setText("wait..");//e
        ////Erd
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.
        getThermo$ThermoSessionBean().getThermoSystem().setPressure(java.lang.Double.parseDouble(getPressureTextField().getValue().toString()));
        getThermo$ThermoSessionBean().getThermoSystem().init(0);
        getThermo$ThermoSessionBean().getThermoSystem().setMultiPhaseCheck(true);
        getThermo$ThermoSessionBean().getThermoSystem().setHydrateCheck(true);
        if (!getThermo$ThermoSessionBean().getThermoSystem().getPhase(0).hasComponent("water")) {
            error("Water must be present in system to perform calculations. Hydrates won't form. Please add water to the system.");
            return null;
        }
        neqsim.thermodynamicOperations.ThermodynamicOperations ops = new neqsim.thermodynamicOperations.ThermodynamicOperations(getThermo$ThermoSessionBean().getThermoSystem());

        java.text.DecimalFormat decFormat = new java.text.DecimalFormat();
        decFormat.setMaximumFractionDigits(4);
        try {
            if (!TOLhydratecheckbox.isChecked()) {
                ops.setRunAsThread(true);
                ops.hydrateFormationTemperature();
                boolean isFinished = ops.waitAndCheckForFinishedCalculation(100000);
                System.out.println("finished? " + isFinished);
            } else {
                ops.calcTOLHydrateFormationTemperature();
            }

            hydrateFormationTemperatureTextField.setValue(decFormat.format(getThermo$ThermoSessionBean().getThermoSystem().getTemperature() - 273.15));
            hydrateStructureTextField.setValue(("S" + Integer.toString((1 + ((ComponentHydrate) getThermo$ThermoSessionBean().getThermoSystem().getPhase(4).getComponent("water")).getHydrateStructure()))));

        } catch (Exception e) {
            e.printStackTrace();
        }

        //
        //ops.TPflash();

        getThermo$ThermoSessionBean().getThermoSystem().createTable(getThermo$ThermoSessionBean().getThermoSystem().getFluidName());

        getThermo$ThermoSessionBean().setDisplayData(true);

        getThermo$ThermoSessionBean().setDisplayGraph(false);

        getThermo$ThermoSessionBean().getThermoSystem().setHydrateCheck(false);

        return null;
    }
}

