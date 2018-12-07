/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package neqsimserver2.GasQuality.Calculator;

import com.sun.rave.web.ui.appbase.AbstractFragmentBean;
import javax.faces.FacesException;
import neqsimserver2.SessionBean1;
import neqsimserver2.Thermo.ThermoSessionBean;
import neqsimserver2.ApplicationBean1;
import neqsimserver2.GasQuality.GasQualitySessionBean;

/**
 * <p>Fragment bean that corresponds to a similarly named JSP page
 * fragment.  This class contains component definitions (and initialization
 * code) for all components that you have defined on this fragment, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version GasQualityCalcRightMenu2.java
 * @version Created on 02.jul.2009, 21:36:45
 * @author ESOL
 */

public class GasQualityCalcRightMenu2 extends AbstractFragmentBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization. <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }
    // </editor-fold>

    public GasQualityCalcRightMenu2() {
    }

    /**
     * <p>Callback method that is called whenever a page containing
     * this page fragment is navigated to, either directly via a URL,
     * or indirectly via page navigation.  Override this method to acquire
     * resources that will be needed for event handlers and lifecycle methods.</p>
     * 
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void init() {
        // Perform initializations inherited from our superclass
        super.init();
        // Perform application initialization that must complete
        // *before* managed components are initialized
        // TODO - add your own initialiation code here
        
        
        // <editor-fold defaultstate="collapsed" desc="Visual-Web-managed Component Initialization">
        // Initialize automatically managed components
        // *Note* - this logic should NOT be modified
        try {
            _init();
        } catch (Exception e) {
            log("Page1 Initialization Failure", e);
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

  public String hyperlink3_action() {
        // TODO: Replace with your code
        return "ToReadFluidDB";
    }


    public String hyperlink4_action() {
        // TODO: Replace with your code
        return "ToGasQualityOperationPage";
    }


    public String hyperlink6_action() {
        // TODO: Replace with your code
        return "ToGasQualityVeiwResults";
    }


    public String editHyperLink_action() {
        // TODO: Replace with your code
        return "ToEditThermoFluidPage";
    }

    public String hyperlink5_action() {
        // TODO: Replace with your code
        return "ToGasQualityVeiwResults";
    }

}
