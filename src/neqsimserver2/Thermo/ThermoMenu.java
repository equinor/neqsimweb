/*
 * ThermoMenu.java
 *
 * Created on 6. mars 2006, 09:38
 * Copyright ESOL
 */
package neqsimserver2.Thermo;

import com.sun.rave.web.ui.appbase.AbstractFragmentBean;
import com.sun.rave.web.ui.component.Message;
import com.sun.rave.web.ui.component.MessageGroup;
import javax.faces.FacesException;
import com.sun.rave.web.ui.component.StaticText;
import com.sun.rave.web.ui.component.Hyperlink;

/**
 * <p>Fragment bean that corresponds to a similarly named JSP page
 * fragment.  This class contains component definitions (and initialization
 * code) for all components that you have defined on this fragment, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class ThermoMenu extends AbstractFragmentBean {
    // <editor-fold defaultstate="collapsed" desc="Creator-managed Component Definition">
    private int __placeholder;
    
    /**
     * <p>Automatically managed component initialization. <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }

    private StaticText staticText1 = new StaticText();

    public StaticText getStaticText1() {
        return staticText1;
    }

    public void setStaticText1(StaticText st) {
        this.staticText1 = st;
    }

    private Hyperlink hyperlink1 = new Hyperlink();

    public Hyperlink getHyperlink1() {
        return hyperlink1;
    }

    public void setHyperlink1(Hyperlink h) {
        this.hyperlink1 = h;
    }

    private Hyperlink hyperlink2 = new Hyperlink();

    public Hyperlink getHyperlink2() {
        return hyperlink2;
    }

    public void setHyperlink2(Hyperlink h) {
        this.hyperlink2 = h;
    }

    private Hyperlink hyperlink3 = new Hyperlink();

    public Hyperlink getHyperlink3() {
        return hyperlink3;
    }

    public void setHyperlink3(Hyperlink h) {
        this.hyperlink3 = h;
    }

    private Hyperlink hyperlink4 = new Hyperlink();

    public Hyperlink getHyperlink4() {
        return hyperlink4;
    }

    public void setHyperlink4(Hyperlink h) {
        this.hyperlink4 = h;
    }

    private Hyperlink hyperlink5 = new Hyperlink();

    public Hyperlink getHyperlink5() {
        return hyperlink5;
    }

    public void setHyperlink5(Hyperlink h) {
        this.hyperlink5 = h;
    }

    private Hyperlink serachLink = new Hyperlink();

    public Hyperlink getSerachLink() {
        return serachLink;
    }

    public void setSerachLink(Hyperlink h) {
        this.serachLink = h;
    }

    private Hyperlink editHyperLink = new Hyperlink();

    public Hyperlink getEditHyperLink() {
        return editHyperLink;
    }

    public void setEditHyperLink(Hyperlink h) {
        this.editHyperLink = h;
    }
    private MessageGroup messageGroup1 = new MessageGroup();

    public MessageGroup getMessageGroup1() {
        return messageGroup1;
    }

    public void setMessageGroup1(MessageGroup mg) {
        this.messageGroup1 = mg;
    }
    // </editor-fold>
    
    public ThermoMenu() {
    }

    /** 
     * <p>Return a reference to the scoped data bean.</p>
     */
    protected neqsimserver2.GasQuality.GasQualitySessionBean getGasQuality$GasQualitySessionBean() {
        return (neqsimserver2.GasQuality.GasQualitySessionBean)getBean("GasQuality$GasQualitySessionBean");
    }


    /** 
     * <p>Return a reference to the scoped data bean.</p>
     */
    protected neqsimserver2.ApplicationBean1 getApplicationBean1() {
        return (neqsimserver2.ApplicationBean1)getBean("ApplicationBean1");
    }


    /** 
     * <p>Return a reference to the scoped data bean.</p>
     */
    protected ThermoSessionBean getThermo$ThermoSessionBean() {
        return (ThermoSessionBean)getBean("Thermo$ThermoSessionBean");
    }


    /** 
     * <p>Return a reference to the scoped data bean.</p>
     */
    protected neqsimserver2.SessionBean1 getSessionBean1() {
        return (neqsimserver2.SessionBean1)getBean("SessionBean1");
    }


    /** 
     * <p>Callback method that is called whenever a page containing
     * this page fragment is navigated to, either directly via a URL,
     * or indirectly via page navigation.  Override this method to acquire
     * resources that will be needed for event handlers and lifecycle methods.</p>
     * 
     * <p>The default implementation does nothing.</p>
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
            log("ThermoMenu Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here

    }

    /** 
     * <p>Callback method that is called after rendering is completed for
     * this request, if <code>init()</code> was called.  Override this
     * method to release resources acquired in the <code>init()</code>
     * resources that will be needed for event handlers and lifecycle methods.</p>
     * 
     * <p>The default implementation does nothing.</p>
     */
    public void destroy() {
    }


    public String serachLink_action() {
        // TODO: Replace with your code
        
        return "ToDatabaseSearchPage";
    }


    public String hyperlink2_action() {
        // TODO: Replace with your code
        return "ToStartMenu";
    }


    public String hyperlink3_action() {
        // TODO: Replace with your code
        
        return "ToReadFluidDB";
    }


    public String hyperlink4_action() {
        // TODO: Replace with your code
        
        return "ToThermoOperationPage";
    }


    public String hyperlink5_action() {
        // TODO: Replace with your code
        if (getThermo$ThermoSessionBean().isDisplayGraph()) return "ToPhaseEnvelopeViewPage";
        return "ToVeiwResults";
    }


    public String hyperlink1_action() {
        // TODO: Replace with your code
        
        return "ToThermoStartPage";
    }


    public String hyperlink6_action() {
        // TODO: Replace with your code
        
        return "ToThermoDocumentationPage";
    }


    public String editHyperLink_action() {
        // TODO: Replace with your code
        if(getSessionBean1().getActiveFluidID()==0){
            error("No active fluid selected. Please select or create new fluid by selecting the Select Fluid menu.");
            return null;
        }
        return "ToEditThermoFluidPage";
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     */
    protected ComponentSelector_Mod1 getThermo$ComponentSelector_Mod1() {
        return (ComponentSelector_Mod1)getBean("Thermo$ComponentSelector_Mod1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     */
    protected ComponentSelector_3 getThermo$ComponentSelector_3() {
        return (ComponentSelector_3)getBean("Thermo$ComponentSelector_3");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     */
    protected TempSelector getThermo$TempSelector() {
        return (TempSelector)getBean("Thermo$TempSelector");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     */
    protected TemperaturePressureSelector getThermo$TemperaturePressureSelector() {
        return (TemperaturePressureSelector)getBean("Thermo$TemperaturePressureSelector");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     */
    protected TPflash_temp getThermo$TPflash_temp() {
        return (TPflash_temp)getBean("Thermo$TPflash_temp");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     */
    protected TempPresSelector getThermo$TempPresSelector() {
        return (TempPresSelector)getBean("Thermo$TempPresSelector");
    }

    public String hyperlink7_action() {
        // TODO: Replace with your code
        return "ToThermoFluidOptions";
    }

    public String hyperlink8_action() {
        // TODO: Replace with your code
        return null;
    }

    public String thermoDocumentationLink_action() {
        // TODO: Replace with your code
        return null;
    }
}
