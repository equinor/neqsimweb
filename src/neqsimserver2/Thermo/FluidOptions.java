/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package neqsimserver2.Thermo;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.DropDown;
import com.sun.rave.web.ui.component.Listbox;
import com.sun.rave.web.ui.model.DefaultOptionsList;
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
 * @version FluidOptions.java
 * @version Created on 09.jul.2009, 09:04:12
 * @author esol
 */
public class FluidOptions extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        thermoModelOptions.setOptions(new com.sun.rave.web.ui.model.Option[]{new com.sun.rave.web.ui.model.Option("SRK-EOS", "SRK-EOS"), new com.sun.rave.web.ui.model.Option("ScRK-EOS-HV", "ScRK-EOS-HV"), new com.sun.rave.web.ui.model.Option("PR-EOS", "PR-EOS"), new com.sun.rave.web.ui.model.Option("CPAs-SRK-EOS-statoil", "CPA-EOS"), new com.sun.rave.web.ui.model.Option("UMR-PRU-EoS", "UMR-PRU-EoS"), new com.sun.rave.web.ui.model.Option("PC-SAFT", "PC-SAFT"), new com.sun.rave.web.ui.model.Option("GERG-2008-EoS", "GERG-2008 EoS")});
        interfaceOption.setOptions(new com.sun.rave.web.ui.model.Option[]{new com.sun.rave.web.ui.model.Option("Parachor", "Parachor"), new com.sun.rave.web.ui.model.Option("Linear gradient theory", "Linear gradient theory"), new com.sun.rave.web.ui.model.Option("Gradient theory", "Gradient theory")});
        capeOpenListBoxDefaultOptions.setOptions(new com.sun.rave.web.ui.model.Option[]{new com.sun.rave.web.ui.model.Option("viscosity", "Viscosity"), new com.sun.rave.web.ui.model.Option("thermalConductivity", "Thermal Conductivity"), new com.sun.rave.web.ui.model.Option("interfacialTension", "Interfacial tension")});
        phaseDropDownDefaultOptions1.setOptions(new com.sun.rave.web.ui.model.Option[]{new com.sun.rave.web.ui.model.Option("0", "Gas"), new com.sun.rave.web.ui.model.Option("1", "Oil"), new com.sun.rave.web.ui.model.Option("2", "Aqueous")});
        phaseDropDownDefaultOptions1.setSelectedValue("0");
    }
    private DropDown thermoModelDropDown = new DropDown();

    public DropDown getThermoModelDropDown() {
        return thermoModelDropDown;
    }

    public void setThermoModelDropDown(DropDown dd) {
        this.thermoModelDropDown = dd;
    }
    private SingleSelectOptionsList thermoModelOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getThermoModelOptions() {
        return thermoModelOptions;
    }

    public void setThermoModelOptions(SingleSelectOptionsList ssol) {
        this.thermoModelOptions = ssol;
    }
    private SingleSelectOptionsList interfaceOption = new SingleSelectOptionsList();

    public SingleSelectOptionsList getInterfaceOption() {
        return interfaceOption;
    }

    public void setInterfaceOption(SingleSelectOptionsList ssol) {
        this.interfaceOption = ssol;
    }
    private DropDown interfaceDropDown = new DropDown();

    public DropDown getInterfaceDropDown() {
        return interfaceDropDown;
    }

    public void setInterfaceDropDown(DropDown dd) {
        this.interfaceDropDown = dd;
    }
    private DefaultOptionsList capeOpenListBoxDefaultOptions = new DefaultOptionsList();

    public DefaultOptionsList getCapeOpenListBoxDefaultOptions() {
        return capeOpenListBoxDefaultOptions;
    }

    public void setCapeOpenListBoxDefaultOptions(DefaultOptionsList dol) {
        this.capeOpenListBoxDefaultOptions = dol;
    }
    private Listbox capeOpenListBox = new Listbox();

    public Listbox getCapeOpenListBox() {
        return capeOpenListBox;
    }

    public void setCapeOpenListBox(Listbox l) {
        this.capeOpenListBox = l;
    }
    private SingleSelectOptionsList phaseDropDownDefaultOptions1 = new SingleSelectOptionsList();

    public SingleSelectOptionsList getPhaseDropDownDefaultOptions1() {
        return phaseDropDownDefaultOptions1;
    }

    public void setPhaseDropDownDefaultOptions1(SingleSelectOptionsList ssol) {
        this.phaseDropDownDefaultOptions1 = ssol;
    }
    private DropDown phaseDropDown1 = new DropDown();

    public DropDown getPhaseDropDown1() {
        return phaseDropDown1;
    }

    public void setPhaseDropDown1(DropDown dd) {
        this.phaseDropDown1 = dd;
    }

    // </editor-fold>
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public FluidOptions() {
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
            log("FluidOptions Initialization Failure", e);
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
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1) getBean("ApplicationBean1");
    }

    public void thermoModelDropDown_processValueChange(ValueChangeEvent event) {
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected ThermoSessionBean getThermo$ThermoSessionBean() {
        return (ThermoSessionBean) getBean("Thermo$ThermoSessionBean");
    }

    public String button1_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.
        thermo.system.SystemInterface thermoSystem = getThermo$ThermoSessionBean().getThermoSystem();

        try {
            Object[] objects = (Object[]) capeOpenListBox.getSelected();
            for (int i = 0; i < objects.length; i++) {
                System.out.println("option val " + objects[i].toString());
                thermoSystem.addCapeOpenProperty(objects[i].toString());
            }
        } catch (Exception e) {
            //e.printStackTrace();
        }
        String temp = (String) thermoModelDropDown.getValue();

        System.out.println(
                "model name " + temp);
        getThermo$ThermoSessionBean().setThermoSystem(thermoSystem.setModel(temp));//"UMR-PRU-EoS"));
        getThermo$ThermoSessionBean().getThermodynamicOperation().setSystem(getThermo$ThermoSessionBean().getThermoSystem());
        getThermo$ThermoSessionBean().getThermoSystem().saveObject(getSessionBean1().getActiveFluidID(),"");

        /*
        if (getSessionBean1().getActiveSubject().equals("thermo")) {
        return "AddComponentToThermoMenuPage";
        } else if (getSessionBean1().getActiveSubject().equals("gasquality")) {
        return "ToGasQualityOperationPage";
        } else if (getSessionBean1().getActiveSubject().equals("LNG")) {
        return "ToLNGCalculatorOperations";
        } else if (getSessionBean1().getActiveSubject().equals("GasProcess")) {
        return "ToProcessOperationPage";
        } else {
        return "AddComponentToThermoMenuPage";
        }
         */



        return "ToThermoOperationPage";
    }

    public String button2_action() {
        String name = "gas";
        int value = ((Integer) phaseDropDown1.getValue()).intValue();

        if (value == 0) {
            name = "gas";
        } else if (value == 1) {
            name = "oil";
        } else if (value == 2) {
            name = "aqueous";
        }


        getThermo$ThermoSessionBean().setThermoSystem(getThermo$ThermoSessionBean().getThermoSystem().phaseToSystem(name));
        getThermo$ThermoSessionBean().getThermoSystem().saveObject(getSessionBean1().getActiveFluidID(),"");
        return "ToThermoOperationPage";
    }
}

