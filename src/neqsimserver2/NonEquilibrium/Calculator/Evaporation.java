/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package neqsimserver2.NonEquilibrium.Calculator;

import com.sun.data.provider.impl.CachedRowSetDataProvider;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.model.DefaultTableDataProvider;
import javax.faces.FacesException;
import neqsimserver2.SessionBean1;
import neqsimserver2.Thermo.TPflash4;
import neqsimserver2.Thermo.TPflash2;
import neqsimserver2.Thermo.ComponentSelector_3;
import neqsimserver2.Thermo.TemperaturePressureSelector;
import neqsimserver2.Thermo.ThermoSessionBean;
import neqsimserver2.Thermo.ComponentSelector_Mod1;
import neqsimserver2.Thermo.TempPresSelector;
import neqsimserver2.Thermo.TPflash_temp;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version Evaporation.java
 * @version Created on 15.jul.2009, 22:15:32
 * @author ESOL
 */

public class Evaporation extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }
    private DefaultTableDataProvider defaultTableDataProvider = new DefaultTableDataProvider();

    public DefaultTableDataProvider getDefaultTableDataProvider() {
        return defaultTableDataProvider;
    }

    public void setDefaultTableDataProvider(DefaultTableDataProvider dtdp) {
        this.defaultTableDataProvider = dtdp;
    }
    private CachedRowSetDataProvider cachedRowSetDataProvider1 = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getCachedRowSetDataProvider1() {
        return cachedRowSetDataProvider1;
    }

    public void setCachedRowSetDataProvider1(CachedRowSetDataProvider crsdp) {
        this.cachedRowSetDataProvider1 = crsdp;
    }
    private CachedRowSetDataProvider cachedRowSetDataProvider2 = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getCachedRowSetDataProvider2() {
        return cachedRowSetDataProvider2;
    }

    public void setCachedRowSetDataProvider2(CachedRowSetDataProvider crsdp) {
        this.cachedRowSetDataProvider2 = crsdp;
    }
    private CachedRowSetDataProvider cachedRowSetDataProvider3 = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getCachedRowSetDataProvider3() {
        return cachedRowSetDataProvider3;
    }

    public void setCachedRowSetDataProvider3(CachedRowSetDataProvider crsdp) {
        this.cachedRowSetDataProvider3 = crsdp;
    }
    private CachedRowSetDataProvider cachedRowSetDataProvider4 = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getCachedRowSetDataProvider4() {
        return cachedRowSetDataProvider4;
    }

    public void setCachedRowSetDataProvider4(CachedRowSetDataProvider crsdp) {
        this.cachedRowSetDataProvider4 = crsdp;
    }
    private CachedRowSetDataProvider cachedRowSetDataProvider5 = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getCachedRowSetDataProvider5() {
        return cachedRowSetDataProvider5;
    }

    public void setCachedRowSetDataProvider5(CachedRowSetDataProvider crsdp) {
        this.cachedRowSetDataProvider5 = crsdp;
    }
    private CachedRowSetDataProvider cachedRowSetDataProvider6 = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getCachedRowSetDataProvider6() {
        return cachedRowSetDataProvider6;
    }

    public void setCachedRowSetDataProvider6(CachedRowSetDataProvider crsdp) {
        this.cachedRowSetDataProvider6 = crsdp;
    }
    private CachedRowSetDataProvider cachedRowSetDataProvider7 = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getCachedRowSetDataProvider7() {
        return cachedRowSetDataProvider7;
    }

    public void setCachedRowSetDataProvider7(CachedRowSetDataProvider crsdp) {
        this.cachedRowSetDataProvider7 = crsdp;
    }

    // </editor-fold>

    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public Evaporation() {
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
            log("Evaporation Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
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
        cachedRowSetDataProvider1.close();
        cachedRowSetDataProvider2.close();
        cachedRowSetDataProvider3.close();
        cachedRowSetDataProvider4.close();
        cachedRowSetDataProvider5.close();
        cachedRowSetDataProvider6.close();
        cachedRowSetDataProvider7.close();
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
    protected TPflash4 getThermo$TPflash4() {
        return (TPflash4) getBean("Thermo$TPflash4");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected TPflash2 getThermo$TPflash2() {
        return (TPflash2) getBean("Thermo$TPflash2");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected ComponentSelector_3 getThermo$ComponentSelector_3() {
        return (ComponentSelector_3) getBean("Thermo$ComponentSelector_3");
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
    protected ThermoSessionBean getThermo$ThermoSessionBean() {
        return (ThermoSessionBean) getBean("Thermo$ThermoSessionBean");
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
    protected TempPresSelector getThermo$TempPresSelector() {
        return (TempPresSelector) getBean("Thermo$TempPresSelector");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected TPflash_temp getThermo$TPflash_temp() {
        return (TPflash_temp) getBean("Thermo$TPflash_temp");
    }
    
}

