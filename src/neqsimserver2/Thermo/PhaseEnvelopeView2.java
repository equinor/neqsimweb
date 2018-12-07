/*
 * PhaseEnvelopeView2.java
 *
 * Created on 8. mars 2006, 20:20
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
import com.sun.rave.web.ui.component.StaticText;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class PhaseEnvelopeView2 extends AbstractPageBean {
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
    private HtmlGraphicImage imageNeqSim1 = new HtmlGraphicImage();

    public HtmlGraphicImage getImageNeqSim1() {
        return imageNeqSim1;
    }

    public void setImageNeqSim1(HtmlGraphicImage hgi) {
        this.imageNeqSim1 = hgi;
    }
    private HtmlOutputText plotOutputText1 = new HtmlOutputText();

    public HtmlOutputText getPlotOutputText1() {
        return plotOutputText1;
    }

    public void setPlotOutputText1(HtmlOutputText hot) {
        this.plotOutputText1 = hot;
    }
    private HtmlGraphicImage image1 = new HtmlGraphicImage();

    public HtmlGraphicImage getImage1() {
        return image1;
    }

    public void setImage1(HtmlGraphicImage hgi) {
        this.image1 = hgi;
    }
    private StaticText criticalPressure = new StaticText();

    public StaticText getCriticalPressure() {
        return criticalPressure;
    }

    public void setCriticalPressure(StaticText st) {
        this.criticalPressure = st;
    }
    private StaticText cricondenthermPressureText = new StaticText();

    public StaticText getCricondenthermPressureText() {
        return cricondenthermPressureText;
    }

    public void setCricondenthermPressureText(StaticText st) {
        this.cricondenthermPressureText = st;
    }
    private StaticText cricondenbarPressureText = new StaticText();

    public StaticText getCricondenbarPressureText() {
        return cricondenbarPressureText;
    }

    public void setCricondenbarPressureText(StaticText st) {
        this.cricondenbarPressureText = st;
    }
    private StaticText criticalTemperature = new StaticText();

    public StaticText getCriticalTemperature() {
        return criticalTemperature;
    }

    public void setCriticalTemperature(StaticText st) {
        this.criticalTemperature = st;
    }
    private StaticText cricondenthermTemperatureText1 = new StaticText();

    public StaticText getCricondenthermTemperatureText1() {
        return cricondenthermTemperatureText1;
    }

    public void setCricondenthermTemperatureText1(StaticText st) {
        this.cricondenthermTemperatureText1 = st;
    }
    private StaticText cricondenbarTemperatureText = new StaticText();

    public StaticText getCricondenbarTemperatureText() {
        return cricondenbarTemperatureText;
    }

    public void setCricondenbarTemperatureText(StaticText st) {
        this.cricondenbarTemperatureText = st;
    }

    // </editor-fold>
    /** 
     * <p>Construct a new Page bean instance.</p>
     */
    public PhaseEnvelopeView2() {
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
    protected neqsimserver2.ApplicationBean1 getApplicationBean1() {
        return (neqsimserver2.ApplicationBean1) getBean("ApplicationBean1");
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
            log("PhaseEnvelopeView2 Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
        }


        try {
            DecimalFormat nf = new DecimalFormat();
            DecimalFormatSymbols symbols = new DecimalFormatSymbols();
            symbols.setDecimalSeparator('.');
            nf.setDecimalFormatSymbols(symbols);
            nf.setMaximumFractionDigits(3);

            double CBTemp = getThermo$ThermoSessionBean().getThermodynamicOperation().get("cricondenbar")[0] - 273.15;
            cricondenbarTemperatureText.setValue(nf.format(CBTemp));

            double CBPresp = getThermo$ThermoSessionBean().getThermodynamicOperation().get("cricondenbar")[1];
            cricondenbarPressureText.setValue(nf.format(CBPresp));

            double CTTemp = getThermo$ThermoSessionBean().getThermodynamicOperation().get("cricondentherm")[0] - 273.15;
            cricondenthermTemperatureText1.setValue(nf.format(CTTemp));

            double CTPresp = getThermo$ThermoSessionBean().getThermodynamicOperation().get("cricondentherm")[1];
            cricondenthermPressureText.setValue(nf.format(CTPresp));

            double CCPTemp = getThermo$ThermoSessionBean().getThermodynamicOperation().get("criticalPoint1")[0]-273.15;
            criticalTemperature.setValue(nf.format(CCPTemp));

            double CCPPres = getThermo$ThermoSessionBean().getThermodynamicOperation().get("criticalPoint1")[1];
            criticalPressure.setValue(nf.format(CCPPres));
        } catch (Exception e) {
            log("could not calculate cricondetherm/pres", e);
            e.printStackTrace();
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

        return null;
    }
}

