/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package neqsimserver2.Thermo;

import neqsim.PVTsimulation.util.parameterfitting.SaturationPressureFunction;
import com.sun.data.provider.RowKey;
import com.sun.data.provider.impl.CachedRowSetDataProvider;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.StaticText;
import com.sun.rave.web.ui.component.TextField;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import javax.faces.FacesException;
import neqsimserver2.ApplicationBean1;
import neqsimserver2.SessionBean1;
import neqsimserver2.GasQuality.GasQualitySessionBean;
import neqsim.statistics.parameterFitting.SampleSet;
import neqsim.statistics.parameterFitting.SampleValue;
import neqsim.statistics.parameterFitting.nonLinearParameterFitting.LevenbergMarquardt;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version PVTdata.java
 * @version Created on 27.feb.2013, 22:07:40
 * @author ESOL
 */
public class PVTdata extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        pvt_satptDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.pvt_satptRowSet}"));
        pvt_satptDataProvider1.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.pvt_satptRowSet}"));
    }
    private CachedRowSetDataProvider pvt_satptDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getPvt_satptDataProvider() {
        return pvt_satptDataProvider;
    }

    public void setPvt_satptDataProvider(CachedRowSetDataProvider crsdp) {
        this.pvt_satptDataProvider = crsdp;
    }
    private CachedRowSetDataProvider pvt_satptDataProvider1 = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getPvt_satptDataProvider1() {
        return pvt_satptDataProvider1;
    }

    public void setPvt_satptDataProvider1(CachedRowSetDataProvider crsdp) {
        this.pvt_satptDataProvider1 = crsdp;
    }
    private TextField descriptionTextField = new TextField();

    public TextField getDescriptionTextField() {
        return descriptionTextField;
    }

    public void setDescriptionTextField(TextField tf) {
        this.descriptionTextField = tf;
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
    private TextField weigthTextField = new TextField();

    public TextField getWeigthTextField() {
        return weigthTextField;
    }

    public void setWeigthTextField(TextField tf) {
        this.weigthTextField = tf;
    }
    private StaticText statusTextField = new StaticText();

    public StaticText getStatusTextField() {
        return statusTextField;
    }

    public void setStatusTextField(StaticText st) {
        this.statusTextField = st;
    }
    private TextField molarMassTextFiled = new TextField();

    public TextField getMolarMassTextFiled() {
        return molarMassTextFiled;
    }

    public void setMolarMassTextFiled(TextField tf) {
        this.molarMassTextFiled = tf;
    }

    // </editor-fold>
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public PVTdata() {
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
            log("PVTdata Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
        }

        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here

        try {
            getSessionBean1().getPvt_satptRowSet().setObject(1, Integer.toString(getSessionBean1().getActiveFluidID()));
            pvt_satptDataProvider.refresh();
            pvt_satptDataProvider1.refresh();
            log("ative fluid ID2 " + getSessionBean1().getActiveFluidID());
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
        pvt_satptDataProvider.close();
        pvt_satptDataProvider1.close();
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
    protected ThermoSessionBean getThermo$ThermoSessionBean() {
        return (ThermoSessionBean) getBean("Thermo$ThermoSessionBean");
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
    protected GasQualitySessionBean getGasQuality$GasQualitySessionBean() {
        return (GasQualitySessionBean) getBean("GasQuality$GasQualitySessionBean");
    }

    public String button1_action() {
        pvt_satptDataProvider1.cursorLast();
        System.out.println("3");
        RowKey rowKey = pvt_satptDataProvider1.appendRow();
        System.out.println("4");

        pvt_satptDataProvider1.setValue("pvt_satpt.TEXT", rowKey, descriptionTextField.getValue());
        pvt_satptDataProvider1.setValue("pvt_satpt.Pressure", rowKey, pressureTextField.getValue());
        pvt_satptDataProvider1.setValue("pvt_satpt.Temperature", rowKey, temperatureTextField.getValue());
        pvt_satptDataProvider1.setValue("pvt_satpt.Weight", rowKey, weigthTextField.getValue());
        pvt_satptDataProvider1.setValue("pvt_satpt.FLUID_ID", rowKey, Integer.toString(getSessionBean1().getActiveFluidID()));

        pvt_satptDataProvider1.commitChanges();
        pvt_satptDataProvider1.refresh();
        return null;
    }

    public String deleteButton_action() {
        RowKey rowKey2 = pvt_satptDataProvider1.getCursorRow();
        pvt_satptDataProvider1.removeRow(rowKey2);
        pvt_satptDataProvider1.commitChanges();
        pvt_satptDataProvider1.refresh();
        return null;
    }

    public String button2_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.
        statusTextField.setValue("tuning running...");
        getThermo$ThermoSessionBean().getThermoSystem().setHeavyTBPfractionAsPlusFraction();
        ArrayList sampleList = new ArrayList();

        if (!pvt_satptDataProvider1.cursorFirst()) {
            statusTextField.setValue("missing input PVTdata");
            return null;
        }

        getThermo$ThermoSessionBean().getThermoSystem().setMultiPhaseCheck(false);
        do {
            double pressure1 = Double.parseDouble(pvt_satptDataProvider1.getValue("pvt_satpt.Pressure").toString());
            double temperature1 = 273.15 + Double.parseDouble(pvt_satptDataProvider1.getValue("pvt_satpt.Temperature").toString());
            double sample1[] = {temperature1};
            double satPres = pressure1;
            double standardDeviation1[] = {1.5};
            SampleValue sample = new SampleValue(satPres, satPres / 100.0, sample1, standardDeviation1);
            SaturationPressureFunction function = new SaturationPressureFunction();
            sample.setFunction(function);
            double molarmass = Double.parseDouble(molarMassTextFiled.getValue().toString());
            double guess[] = {molarmass / 1000.0};
            function.setInitialGuess(guess);
            sample.setThermodynamicSystem(getThermo$ThermoSessionBean().getThermoSystem());
            sampleList.add(sample);
        } while (pvt_satptDataProvider1.cursorNext());

        SampleSet sampleSet = new SampleSet(sampleList);
        LevenbergMarquardt optim = new LevenbergMarquardt();
        optim.setMaxNumberOfIterations(10);
        optim.setSampleSet(sampleSet);
        optim.solve();
        java.text.DecimalFormat decFormat = new java.text.DecimalFormat();
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator('.');
        decFormat.setDecimalFormatSymbols(symbols);
        decFormat.setMaximumFractionDigits(3);

        molarMassTextFiled.setValue(decFormat.format(optim.getSample(0).getFunction().getFittingParams(0) * 1000.0));
        
        getThermo$ThermoSessionBean().setThermoSystem(optim.getSample(0).getFunction().getSystem());
        getThermo$ThermoSessionBean().getThermoSystem().setMultiPhaseCheck(true);
        return null;
    }
}

