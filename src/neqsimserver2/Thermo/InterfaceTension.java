/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package neqsimserver2.Thermo;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Checkbox;
import com.sun.rave.web.ui.component.StaticText;
import javax.faces.FacesException;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlInputText;
import javax.faces.context.FacesContext;
import javax.faces.validator.DoubleRangeValidator;
import neqsimserver2.GasQuality.GasQualitySessionBean;
import neqsimserver2.SessionBean1;
import neqsimserver2.ApplicationBean1;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version InterfaceTension.java
 * @version Created on 09.mar.2011, 12:09:16
 * @author ESOL
 */
public class InterfaceTension extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        doubleRangeValidator1.setMaximum(1000000.0);
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
    private Checkbox useGradientTheoryCheckbox = new Checkbox();

    public Checkbox getUseGradientTheoryCheckbox() {
        return useGradientTheoryCheckbox;
    }

    public void setUseGradientTheoryCheckbox(Checkbox c) {
        this.useGradientTheoryCheckbox = c;
    }
    private StaticText interfaceTensionValue = new StaticText();

    public StaticText getInterfaceTensionValue() {
        return interfaceTensionValue;
    }

    public void setInterfaceTensionValue(StaticText st) {
        this.interfaceTensionValue = st;
    }
    private DoubleRangeValidator doubleRangeValidator1 = new DoubleRangeValidator();

    public DoubleRangeValidator getDoubleRangeValidator1() {
        return doubleRangeValidator1;
    }

    public void setDoubleRangeValidator1(DoubleRangeValidator drv) {
        this.doubleRangeValidator1 = drv;
    }

    // </editor-fold>
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public InterfaceTension() {
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
            log("InterfaceTension Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
        }

        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
        getThermo$ThermoSessionBean().setActiveExperimentType("surface/interface tenison");
        getThermo$ThermoSessionBean().setActiveWikiCategory("interfacial tension");
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

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1) getBean("ApplicationBean1");
    }

    public String button1_action() {
        getThermo$ThermoSessionBean().setThermoSystem(getThermo$ThermoSessionBean().getThermoSystem().setModel("PrEos"));
        getThermo$ThermoSessionBean().getThermoSystem().setTemperature(java.lang.Double.parseDouble(getTemperatureTextField().getValue().toString()) + 273.15);
        getThermo$ThermoSessionBean().getThermoSystem().setPressure(java.lang.Double.parseDouble(getPressureTextField().getValue().toString()));
        getThermo$ThermoSessionBean().getThermoSystem().init(0);
        if(useGradientTheoryCheckbox.isChecked()) getThermo$ThermoSessionBean().getThermoSystem().getInterphaseProperties().setInterfacialTensionModel(1);
        else getThermo$ThermoSessionBean().getThermoSystem().getInterphaseProperties().setInterfacialTensionModel(0);
        thermodynamicOperations.ThermodynamicOperations ops = new thermodynamicOperations.ThermodynamicOperations(getThermo$ThermoSessionBean().getThermoSystem());
        java.text.DecimalFormat decFormat = new java.text.DecimalFormat();
        decFormat.setMaximumFractionDigits(3);
        try {
            ops.TPflash();
            getThermo$ThermoSessionBean().getThermoSystem().initPhysicalProperties();
            interfaceTensionValue.setValue(decFormat.format(getThermo$ThermoSessionBean().getThermoSystem().getInterphaseProperties().getSurfaceTension(0,1)*1.0e3));
        } catch (Exception e) {
            e.printStackTrace();
        }

        getThermo$ThermoSessionBean().getThermoSystem().createTable(
                getThermo$ThermoSessionBean().getThermoSystem().getFluidName());

        getThermo$ThermoSessionBean().setDisplayData(true);

        getThermo$ThermoSessionBean().setDisplayGraph(false);

        return null;
    }

    public void temperatureTextField_validate(FacesContext context, UIComponent component, Object value) {
    }
}

