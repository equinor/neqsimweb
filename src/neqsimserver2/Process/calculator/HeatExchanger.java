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
import neqsimserver2.SessionBean1;
import neqsimserver2.Thermo.ThermoSessionBean;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version HeatExchanger.java
 * @version Created on 03.jul.2009, 11:05:11
 * @author esol
 */
public class HeatExchanger extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }
    private TextField temperatureInTextField = new TextField();

    public TextField getTemperatureInTextField() {
        return temperatureInTextField;
    }

    public void setTemperatureInTextField(TextField tf) {
        this.temperatureInTextField = tf;
    }
    private TextField pressureInTextField = new TextField();

    public TextField getPressureInTextField() {
        return pressureInTextField;
    }

    public void setPressureInTextField(TextField tf) {
        this.pressureInTextField = tf;
    }
    private TextField temperatureOutTextField = new TextField();

    public TextField getTemperatureOutTextField() {
        return temperatureOutTextField;
    }

    public void setTemperatureOutTextField(TextField tf) {
        this.temperatureOutTextField = tf;
    }
    private TextField pressureDropTextField = new TextField();

    public TextField getPressureDropTextField() {
        return pressureDropTextField;
    }

    public void setPressureDropTextField(TextField tf) {
        this.pressureDropTextField = tf;
    }
    private HtmlDataTable resultsTable = new HtmlDataTable();

    public HtmlDataTable getResultsTable() {
        return resultsTable;
    }

    public void setResultsTable(HtmlDataTable hdt) {
        this.resultsTable = hdt;
    }
    private StaticText dutyField = new StaticText();

    public StaticText getDutyField() {
        return dutyField;
    }

    public void setDutyField(StaticText st) {
        this.dutyField = st;
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
    public HeatExchanger() {
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
                      temperatureInTextField.setValue(getThermo$ThermoSessionBean().getThermoSystem().getTemperature()-273.15);
        pressureInTextField.setValue(getThermo$ThermoSessionBean().getThermoSystem().getPressure());

            _init();
     
        } catch (Exception e) {
            log("HeatExchanger Initialization Failure", e);
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
        getThermo$ThermoSessionBean().getThermoSystem().setTemperature((Double) temperatureInTextField.getValue() + 273.15);
        getThermo$ThermoSessionBean().getThermoSystem().setPressure((Double) pressureInTextField.getValue());
        neqsim.processSimulation.processEquipment.stream.Stream tempStream = new neqsim.processSimulation.processEquipment.stream.Stream(getThermo$ThermoSessionBean().getThermoSystem());
        neqsim.processSimulation.processEquipment.heatExchanger.Heater heater = new neqsim.processSimulation.processEquipment.heatExchanger.Heater(tempStream);
        heater.setOutTemperature((Double) temperatureOutTextField.getValue() + 273.15);//setOutletPressure((Double) pressureOutTextField.getValue());
        heater.setPressureDrop((Double) pressureDropTextField.getValue());
       
        tempStream.run();
        heater.run();
        getThermo$ThermoSessionBean().setThermoSystem(heater.getOutStream().getThermoSystem());
        getThermo$ThermoSessionBean().getThermoSystem().createTable(
        getThermo$ThermoSessionBean().getThermoSystem().getFluidName());

        getThermo$ThermoSessionBean().setDisplayData(true);

        getThermo$ThermoSessionBean().setDisplayGraph(false);

        resultsTable.setRendered(true);

        dutyField.setValue(new Double(heater.getEnergyInput()));
        
        return null;
    }
}

