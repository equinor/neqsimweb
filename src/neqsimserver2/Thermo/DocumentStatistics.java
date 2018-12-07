/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package neqsimserver2.Thermo;

import com.sun.rave.web.ui.appbase.AbstractFragmentBean;
import com.sun.rave.web.ui.component.Hyperlink;
import com.sun.rave.web.ui.component.StaticText;
import javax.faces.FacesException;
import neqsimserver2.SessionBean1;
import neqsimserver2.GasQuality.GasQualitySessionBean;

/**
 * <p>Fragment bean that corresponds to a similarly named JSP page
 * fragment.  This class contains component definitions (and initialization
 * code) for all components that you have defined on this fragment, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version DocumentStatistics.java
 * @version Created on 03.jan.2013, 22:23:54
 * @author ESOL
 */
public class DocumentStatistics extends AbstractFragmentBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization. <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }
    private StaticText numberOfArticlesText = new StaticText();

    public StaticText getNumberOfArticlesText() {
        return numberOfArticlesText;
    }

    public void setNumberOfArticlesText(StaticText st) {
        this.numberOfArticlesText = st;
    }
    private StaticText numberOfArticlesTotalText = new StaticText();

    public StaticText getNumberOfArticlesTotalText() {
        return numberOfArticlesTotalText;
    }

    public void setNumberOfArticlesTotalText(StaticText st) {
        this.numberOfArticlesTotalText = st;
    }
    private Hyperlink hyperlink3 = new Hyperlink();

    public Hyperlink getHyperlink3() {
        return hyperlink3;
    }

    public void setHyperlink3(Hyperlink h) {
        this.hyperlink3 = h;
    }
    // </editor-fold>

    public DocumentStatistics() {
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
            throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
        }

        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
        numberOfArticlesText.setText(new Integer(getSessionBean1().getCountSQLdata("")).toString());
        numberOfArticlesTotalText.setText(new Integer(getSessionBean1().getCountSQLdata("*")).toString());
         hyperlink3.setUrl("http://129.241.62.72:8080/NeqSimWiki/en/Category:"+getThermo$ThermoSessionBean().getActiveWikiCategory());
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

    public String hyperlink1_action() {
        // TODO: Replace with your code
        return getSessionBean1().getSQLdata("");
    }

    public String hyperlink2_action() {
        // TODO: Replace with your code
        return getSessionBean1().getSQLdata("*");
    }

    public String hyperlink32_action() {
        hyperlink3.setUrl("http://129.241.62.72:8080/NeqSimWiki/en/Category:"+getThermo$ThermoSessionBean().getActiveWikiCategory());
        // TODO: Replace with your code
        return null;
    }
}
