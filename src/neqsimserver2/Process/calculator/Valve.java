/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package neqsimserver2.Process.calculator;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.StaticText;
import com.sun.rave.web.ui.component.TextField;
import javax.faces.FacesException;
import javax.faces.component.html.HtmlDataTable;
import javax.faces.convert.DoubleConverter;
import neqsimserver2.ApplicationBean1;
import neqsimserver2.GasQuality.GasQualitySessionBean;
import neqsimserver2.SessionBean1;
import neqsimserver2.Thermo.ThermoSessionBean;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version Compressor.java
 * @version Created on 01.jul.2009, 12:45:41
 * @author esol
 */
public class Valve extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }
    private TextField temperatureTextField = new TextField();

    public TextField getTemperatureTextField() {
        return temperatureTextField;
    }

    public void setTemperatureTextField(TextField tf) {
        this.temperatureTextField = tf;
    }
    private TextField pressureTextField = new TextField();

    public TextField getPressureTextField() {
        return pressureTextField;
    }

    public void setPressureTextField(TextField tf) {
        this.pressureTextField = tf;
    }
    private TextField pressureOutTextField = new TextField();

    public TextField getPressureOutTextField() {
        return pressureOutTextField;
    }

    public void setPressureOutTextField(TextField tf) {
        this.pressureOutTextField = tf;
    }
    private HtmlDataTable resultsTable = new HtmlDataTable();

    public HtmlDataTable getResultsTable() {
        return resultsTable;
    }

    public void setResultsTable(HtmlDataTable hdt) {
        this.resultsTable = hdt;
    }
    private DoubleConverter doubleConverter1 = new DoubleConverter();

    public DoubleConverter getDoubleConverter1() {
        return doubleConverter1;
    }

    public void setDoubleConverter1(DoubleConverter dc) {
        this.doubleConverter1 = dc;
    }
    private StaticText temperatureOutText = new StaticText();

    public StaticText getTemperatureOutText() {
        return temperatureOutText;
    }

    public void setTemperatureOutText(StaticText st) {
        this.temperatureOutText = st;
    }

    // </editor-fold>
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public Valve() {
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
            log("Compressor Initialization Failure", e);
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

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1) getBean("ApplicationBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected GasQualitySessionBean getGasQuality$GasQualitySessionBean() {
        return (GasQualitySessionBean) getBean("GasQuality$GasQualitySessionBean");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected SessionBean1 getSessionBean1() {
        return (SessionBean1) getBean("SessionBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected ThermoSessionBean getThermo$ThermoSessionBean() {
        return (ThermoSessionBean) getBean("Thermo$ThermoSessionBean");
    }

    public String calculateButton_action() {
        getThermo$ThermoSessionBean().getThermoSystem().init(0);
        getThermo$ThermoSessionBean().getThermoSystem().init(1);
        getThermo$ThermoSessionBean().getThermoSystem().setTemperature((Double) temperatureTextField.getValue() + 273.15);
        getThermo$ThermoSessionBean().getThermoSystem().setPressure((Double) pressureTextField.getValue());
        neqsim.processSimulation.processEquipment.stream.Stream tempStream = new neqsim.processSimulation.processEquipment.stream.Stream(getThermo$ThermoSessionBean().getThermoSystem());
        neqsim.processSimulation.processEquipment.valve.ThrottlingValve compProcess = new neqsim.processSimulation.processEquipment.valve.ThrottlingValve("valve", tempStream);
        compProcess.setOutletPressure((Double) pressureOutTextField.getValue());
        tempStream.run();
        compProcess.run();
        getThermo$ThermoSessionBean().setThermoSystem(compProcess.getOutStream().getThermoSystem());
        getThermo$ThermoSessionBean().getThermoSystem().createTable(
                getThermo$ThermoSessionBean().getThermoSystem().getFluidName());

        getThermo$ThermoSessionBean().setDisplayData(true);

        getThermo$ThermoSessionBean().setDisplayGraph(false);
        temperatureOutText.setValue(getThermo$ThermoSessionBean().getThermoSystem().getTemperature()-273.15);
        resultsTable.setRendered(true);
        return null;
    }
}

