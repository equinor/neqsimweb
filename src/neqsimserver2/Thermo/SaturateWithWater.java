/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package neqsimserver2.Thermo;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import javax.faces.FacesException;
import javax.faces.component.html.HtmlInputText;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version SaturateWithWater.java
 * @version Created on 16.apr.2013, 08:46:23
 * @author ESOL
 */
public class SaturateWithWater extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
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

    // </editor-fold>
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public SaturateWithWater() {
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
    @Override
    public void init() {
        // Perform initializations inherited from our superclass
        super.init();
        // Perform application initialization that must complete
        // *before* managed components are initialized
        // TODO - add your own initialiation code here

        // <editor-fold defaultstate="collapsed" desc="Managed Component Initialization">
        // Initialize automatically managed components
        // *Note* - this logic should NOT be modified
        try {
            _init();
        } catch (Exception e) {
            log("SaturateWithWater Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
        }

             getThermo$ThermoSessionBean().setActiveExperimentType("water dew point");
        getThermo$ThermoSessionBean().setActiveWikiCategory("water dew point");


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
    @Override
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
    @Override
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
    @Override
    public void destroy() {
    }

    protected neqsimserver2.GasQuality.GasQualitySessionBean getGasQuality$GasQualitySessionBean() {

        return (neqsimserver2.GasQuality.GasQualitySessionBean) getBean("GasQuality$GasQualitySessionBean");

    }

    protected neqsimserver2.ApplicationBean1 getApplicationBean1() {

        return (neqsimserver2.ApplicationBean1) getBean("ApplicationBean1");

    }

    protected neqsimserver2.Thermo.ThermoSessionBean getThermo$ThermoSessionBean() {

        return (neqsimserver2.Thermo.ThermoSessionBean) getBean("Thermo$ThermoSessionBean");

    }

    protected neqsimserver2.SessionBean1 getSessionBean1() {

        return (neqsimserver2.SessionBean1) getBean("SessionBean1");

    }

    public String okFlashButton_action() {
        getThermo$ThermoSessionBean().setThermoSystem(getThermo$ThermoSessionBean().getThermoSystem().setModel("CPAs-SRK-EOS-statoil"));//"UMR-PRU-EoS"));
        getThermo$ThermoSessionBean().getThermodynamicOperation().setSystem(getThermo$ThermoSessionBean().getThermoSystem());

        getThermo$ThermoSessionBean().getThermoSystem().setTemperature(
                273.15 + java.lang.Double.parseDouble(getTemperatureTextField().getValue().toString()));

        getThermo$ThermoSessionBean().getThermoSystem().setPressure(
                java.lang.Double.parseDouble(getPressureTextField().getValue().toString()));


        getThermo$ThermoSessionBean().getThermoSystem().setMultiPhaseCheck(true);

        thermodynamicOperations.ThermodynamicOperations ops = new thermodynamicOperations.ThermodynamicOperations(
                getThermo$ThermoSessionBean().getThermoSystem());

        ops.saturateWithWater();

        getThermo$ThermoSessionBean().getThermoSystem().createTable(
                getThermo$ThermoSessionBean().getThermoSystem().getFluidName());

        getThermo$ThermoSessionBean().setDisplayData(true);

        getThermo$ThermoSessionBean().setDisplayGraph(false);
        getThermo$ThermoSessionBean().getThermoSystem().saveObject(getSessionBean1().getActiveFluidID(),"");

        return "ToVeiwResults";

    }
}

