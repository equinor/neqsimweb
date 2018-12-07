/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package neqsimserver2.Thermo;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import javax.faces.FacesException;
import javax.faces.component.html.HtmlInputText;
import javax.faces.component.html.HtmlSelectBooleanCheckbox;
import neqsimserver2.SessionBean1;
import neqsimserver2.GasQuality.GasQualitySessionBean;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version PhaseEnvelope2.java
 * @version Created on 13.mar.2013, 18:31:26
 * @author ESOL
 */
public class PhaseEnvelope2 extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }
    private HtmlInputText minimumPressureTextInputField = new HtmlInputText();

    public HtmlInputText getMinimumPressureTextInputField() {
        return minimumPressureTextInputField;
    }

    public void setMinimumPressureTextInputField(HtmlInputText hit) {
        this.minimumPressureTextInputField = hit;
    }
    private HtmlSelectBooleanCheckbox hydrocarbonLineCheckBox = new HtmlSelectBooleanCheckbox();

    public HtmlSelectBooleanCheckbox getHydrocarbonLineCheckBox() {
        return hydrocarbonLineCheckBox;
    }

    public void setHydrocarbonLineCheckBox(HtmlSelectBooleanCheckbox hsbc) {
        this.hydrocarbonLineCheckBox = hsbc;
    }
    private HtmlSelectBooleanCheckbox aqueousLineCheckBox = new HtmlSelectBooleanCheckbox();

    public HtmlSelectBooleanCheckbox getAqueousLineCheckBox() {
        return aqueousLineCheckBox;
    }

    public void setAqueousLineCheckBox(HtmlSelectBooleanCheckbox hsbc) {
        this.aqueousLineCheckBox = hsbc;
    }
    private HtmlSelectBooleanCheckbox hydrateLineCheckBox = new HtmlSelectBooleanCheckbox();

    public HtmlSelectBooleanCheckbox getHydrateLineCheckBox() {
        return hydrateLineCheckBox;
    }

    public void setHydrateLineCheckBox(HtmlSelectBooleanCheckbox hsbc) {
        this.hydrateLineCheckBox = hsbc;
    }
    private HtmlInputText maximumPressureTextField = new HtmlInputText();

    public HtmlInputText getMaximumPressureTextField() {
        return maximumPressureTextField;
    }

    public void setMaximumPressureTextField(HtmlInputText hit) {
        this.maximumPressureTextField = hit;
    }

    // </editor-fold>
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public PhaseEnvelope2() {
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
            log("PhaseEnvelope2 Initialization Failure", e);
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
    protected TPflash_temp getThermo$TPflash_temp() {
        return (TPflash_temp) getBean("Thermo$TPflash_temp");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected ComponentSelector_Mod1 getThermo$ComponentSelector_Mod1() {
        return (ComponentSelector_Mod1) getBean("Thermo$ComponentSelector_Mod1");
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

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected TemperaturePressureSelector getThermo$TemperaturePressureSelector() {
        return (TemperaturePressureSelector) getBean("Thermo$TemperaturePressureSelector");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected TPflash4 getThermo$TPflash4() {
        return (TPflash4) getBean("Thermo$TPflash4");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected TempPresSelector getThermo$TempPresSelector() {
        return (TempPresSelector) getBean("Thermo$TempPresSelector");
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
    protected TPflash2 getThermo$TPflash2() {
        return (TPflash2) getBean("Thermo$TPflash2");
    }

    public String okButton_action() {

        getThermo$ThermoSessionBean().getThermoSystem().setTemperature(300.0);

        double minPressure = java.lang.Double.parseDouble(getMinimumPressureTextInputField().getValue().toString());
        double maxPressure = java.lang.Double.parseDouble(getMaximumPressureTextField().getValue().toString());

        getThermo$ThermoSessionBean().getThermoSystem().setPressure(minPressure);

        try {

            System.out.println("starting calculation...");
            getThermo$ThermoSessionBean().getThermodynamicOperation().setSystem(getThermo$ThermoSessionBean().getThermoSystem());
            getThermo$ThermoSessionBean().getThermodynamicOperation().setRunAsThread(true);

            boolean hasWater = getThermo$ThermoSessionBean().getThermoSystem().getPhase(0).hasComponent("water");
            double[][] waterData = null;

            if (aqueousLineCheckBox.isSelected() && hasWater) {
                getThermo$ThermoSessionBean().getThermodynamicOperation().waterDewPointLine(minPressure, maxPressure);
                boolean isFinished = getThermo$ThermoSessionBean().getThermodynamicOperation().waitAndCheckForFinishedCalculation(150000);
                waterData = getThermo$ThermoSessionBean().getThermodynamicOperation().getData();
            }

            double[][] hydData = null;
            if (hydrateLineCheckBox.isSelected() && hasWater) {
                getThermo$ThermoSessionBean().getThermodynamicOperation().hydrateEquilibriumLine(minPressure, maxPressure);
                boolean isFinished = getThermo$ThermoSessionBean().getThermodynamicOperation().waitAndCheckForFinishedCalculation(150000);
                hydData = getThermo$ThermoSessionBean().getThermodynamicOperation().getData();
            }

            if (hasWater) {
                getThermo$ThermoSessionBean().getThermoSystem().addComponent("water", -getThermo$ThermoSessionBean().getThermoSystem().getPhase(0).getComponent("water").getNumberOfmoles());
            }


            getThermo$ThermoSessionBean().getThermodynamicOperation().calcPTphaseEnvelope(true);//true);
            boolean isFinished = getThermo$ThermoSessionBean().getThermodynamicOperation().waitAndCheckForFinishedCalculation(150000);
            if (aqueousLineCheckBox.isSelected() && hasWater) {
                getThermo$ThermoSessionBean().getThermodynamicOperation().addData("water", waterData);
            }
            if (hydrateLineCheckBox.isSelected() && hasWater) {
                getThermo$ThermoSessionBean().getThermodynamicOperation().addData("hydrate", hydData);
            }

            getThermo$ThermoSessionBean().getThermodynamicOperation().setRunAsThread(false);
        } catch (Exception e) {

            e.printStackTrace();

        }

        getSessionBean1().setJFreeChartObject(getThermo$ThermoSessionBean().getThermodynamicOperation().getJfreeChart());

        return "ToPhaseEnvelopeViewPage";
    }
}

