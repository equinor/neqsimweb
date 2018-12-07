/*
 * LNGFreezingCalculation2.java
 *
 * Created on 02.jul.2008, 12:31:06
 */
package neqsimserver2.Thermo;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.RadioButtonGroup;
import com.sun.rave.web.ui.component.StaticText;
import com.sun.rave.web.ui.component.TextField;
import com.sun.rave.web.ui.model.SingleSelectOptionsList;
import javax.faces.FacesException;
import javax.faces.event.ValueChangeEvent;
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
 * @author ESOL
 */
public class FreezingCalculation extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        componentButtonGroupDefaultOptions.setOptions(new com.sun.rave.web.ui.model.Option[]{new com.sun.rave.web.ui.model.Option("water", "water"), new com.sun.rave.web.ui.model.Option("MEG", "MEG"), new com.sun.rave.web.ui.model.Option("TEG", "TEG"), new com.sun.rave.web.ui.model.Option("methanol", "methanol"), new com.sun.rave.web.ui.model.Option("MEG-water", "MEG-water"), new com.sun.rave.web.ui.model.Option("TEG-water", "TEG-water"), new com.sun.rave.web.ui.model.Option("methanol-water", "methanol-water"), new com.sun.rave.web.ui.model.Option("natural gas hydrate", "natural gas hydrate")});
        componentButtonGroupDefaultOptions.setSelectedValue("water");
    }
    private SingleSelectOptionsList componentButtonGroupDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getComponentButtonGroupDefaultOptions() {
        return componentButtonGroupDefaultOptions;
    }

    public void setComponentButtonGroupDefaultOptions(SingleSelectOptionsList ssol) {
        this.componentButtonGroupDefaultOptions = ssol;
    }
    private StaticText freezingPointTemperatureTextFIeld = new StaticText();

    public StaticText getFreezingPointTemperatureTextFIeld() {
        return freezingPointTemperatureTextFIeld;
    }

    public void setFreezingPointTemperatureTextFIeld(StaticText st) {
        this.freezingPointTemperatureTextFIeld = st;
    }
    private TextField temperatureTextField = new TextField();

    public TextField getTemperatureTextField() {
        return temperatureTextField;
    }

    public void setTemperatureTextField(TextField tf) {
        this.temperatureTextField = tf;
    }
    private TextField pressureTextFIeld = new TextField();

    public TextField getPressureTextFIeld() {
        return pressureTextFIeld;
    }

    public void setPressureTextFIeld(TextField tf) {
        this.pressureTextFIeld = tf;
    }
    private RadioButtonGroup componentButtonGroup = new RadioButtonGroup();

    public RadioButtonGroup getComponentButtonGroup() {
        return componentButtonGroup;
    }

    public void setComponentButtonGroup(RadioButtonGroup rbg) {
        this.componentButtonGroup = rbg;
    }

    // </editor-fold>
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public FreezingCalculation() {
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
            log("LNGFreezingCalculation2 Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
        }

        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here

        getThermo$ThermoSessionBean().setActiveExperimentType("freezing point");
        getThermo$ThermoSessionBean().setActiveWikiCategory("freezing point");
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
        // TODO: Process the button click action. Return value is a navigation
        String compName = componentButtonGroup.getSelected().toString();
        boolean complexCheck = false;
        String comp1 = null, comp2 = null;



        if (compName.equals("MEG-water") || compName.equals("TEG-water") || compName.equals("methanol-water")) {
            complexCheck = true;
            if (compName.equals("MEG-water") && !(getThermo$ThermoSessionBean().getThermoSystem().getPhase(0).hasComponent("MEG") && getThermo$ThermoSessionBean().getThermoSystem().getPhase(0).hasComponent("water"))) {
                error("componenet " + componentButtonGroup.getSelected().toString() + " must be present to calculate freezing point. // 1");
                return null;
            }
            if (compName.equals("TEG-water") && !(getThermo$ThermoSessionBean().getThermoSystem().getPhase(0).hasComponent("TEG") && getThermo$ThermoSessionBean().getThermoSystem().getPhase(0).hasComponent("water"))) {
                error("componenet " + componentButtonGroup.getSelected().toString() + " must be present to calculate freezing point.");
                return null;
            }
            if (compName.equals("methanol-water") && !(getThermo$ThermoSessionBean().getThermoSystem().getPhase(0).hasComponent("methanol") && getThermo$ThermoSessionBean().getThermoSystem().getPhase(0).hasComponent("water"))) {
                error("componenet " + componentButtonGroup.getSelected().toString() + " must be present to calculate freezing point.");
                return null;
            }

            if (!complexCheck && !getThermo$ThermoSessionBean().getThermoSystem().getPhase(0).hasComponent(compName)) {
                error("componenet " + componentButtonGroup.getSelected().toString() + " must be present to calculate freezing point. // 2");
                return null;
            }
        }
        if (compName.equals("MEG-water")) {
            comp1 = "MEG";
            comp2 = "water";
        }
        if (compName.equals("TEG-water")) {
            comp1 = "TEG";
            comp2 = "water";
        }
        if (compName.equals("methanol-water")) {
            comp1 = "methanol";
            comp2 = "water";
        }
        getThermo$ThermoSessionBean().getThermoSystem().setMultiPhaseCheck(true);
        getThermo$ThermoSessionBean().getThermoSystem().setSolidPhaseCheck(false);
        getThermo$ThermoSessionBean().getThermoSystem().setHydrateCheck(false);

        if (compName.equals("natural gas hydrate")) {
            getThermo$ThermoSessionBean().getThermoSystem().setHydrateCheck(true);
        }

        if (!complexCheck && !compName.equals("natural gas hydrate")) {
            getThermo$ThermoSessionBean().getThermoSystem().setSolidPhaseCheck(componentButtonGroup.getSelected().toString());
            System.out.println("component " + componentButtonGroup.getSelected());
        }

        getThermo$ThermoSessionBean().getThermoSystem().setTemperature(
                273.15 + java.lang.Double.parseDouble(getTemperatureTextField().getValue().toString()));
        getThermo$ThermoSessionBean().getThermoSystem().setPressure(
                java.lang.Double.parseDouble(getPressureTextFIeld().getValue().toString()));

        thermodynamicOperations.ThermodynamicOperations ops = new thermodynamicOperations.ThermodynamicOperations(getThermo$ThermoSessionBean().getThermoSystem());

        try {
            if (compName.equals("natural gas hydrate")) {
                ops.setRunAsThread(true);
                ops.hydrateFormationTemperature();
                boolean isFinished = ops.waitAndCheckForFinishedCalculation(100000);
                System.out.println("finished? " + isFinished);
            } else if (complexCheck) {
                ops.calcSolidComlexTemperature(comp1, comp2);
            } else {
                ops.freezingPointTemperatureFlash();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        getThermo$ThermoSessionBean().getThermoSystem().createTable(
                getThermo$ThermoSessionBean().getThermoSystem().getFluidName());

        getThermo$ThermoSessionBean().setDisplayData(true);

        getThermo$ThermoSessionBean().setDisplayGraph(false);

        java.text.DecimalFormat decFormat = new java.text.DecimalFormat();
        decFormat.setMaximumFractionDigits(3);
        freezingPointTemperatureTextFIeld.setText(decFormat.format(getThermo$ThermoSessionBean().getThermoSystem().getTemperature() - 273.15));

        return null;
    }

    public void componentButtonGroup_processValueChange(ValueChangeEvent vce) {
    }
}



