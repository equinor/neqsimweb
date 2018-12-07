/*
 * ThermoMenuPage2.java
 *
 * Created on 16. april 2006, 21:02
 * Copyright ESOL
 */
package neqsimserver2.Thermo;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.Page;
import javax.faces.FacesException;
import javax.faces.component.html.HtmlGraphicImage;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.component.html.HtmlCommandLink;


/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class ThermoMenuPage2 extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Creator-managed Component Definition">
    private int __placeholder;
    
    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }
    
    private Page page1 = new Page();
    
    public Page getPage1() {
        return page1;
    }
    
    public void setPage1(Page p) {
        this.page1 = p;
    }
    
    private Html html1 = new Html();
    
    public Html getHtml1() {
        return html1;
    }
    
    public void setHtml1(Html h) {
        this.html1 = h;
    }
    
    private Head head1 = new Head();
    
    public Head getHead1() {
        return head1;
    }
    
    public void setHead1(Head h) {
        this.head1 = h;
    }
    
    private Link link1 = new Link();
    
    public Link getLink1() {
        return link1;
    }
    
    public void setLink1(Link l) {
        this.link1 = l;
    }
    
    private Body body1 = new Body();
    
    public Body getBody1() {
        return body1;
    }
    
    public void setBody1(Body b) {
        this.body1 = b;
    }
    
    private Form form1 = new Form();
    
    public Form getForm1() {
        return form1;
    }
    
    public void setForm1(Form f) {
        this.form1 = f;
    }

    private HtmlGraphicImage image1 = new HtmlGraphicImage();

    public HtmlGraphicImage getImage1() {
        return image1;
    }

    public void setImage1(HtmlGraphicImage hgi) {
        this.image1 = hgi;
    }

    private HtmlOutputText outputText1 = new HtmlOutputText();

    public HtmlOutputText getOutputText1() {
        return outputText1;
    }

    public void setOutputText1(HtmlOutputText hot) {
        this.outputText1 = hot;
    }

    private HtmlOutputText outputText2 = new HtmlOutputText();

    public HtmlOutputText getOutputText2() {
        return outputText2;
    }

    public void setOutputText2(HtmlOutputText hot) {
        this.outputText2 = hot;
    }

    private HtmlCommandLink scaleLinkAction = new HtmlCommandLink();

    public HtmlCommandLink getScaleLinkAction() {
        return scaleLinkAction;
    }

    public void setScaleLinkAction(HtmlCommandLink hcl) {
        this.scaleLinkAction = hcl;
    }

    private HtmlOutputText scaleLinkActionText1 = new HtmlOutputText();

    public HtmlOutputText getScaleLinkActionText1() {
        return scaleLinkActionText1;
    }

    public void setScaleLinkActionText1(HtmlOutputText hot) {
        this.scaleLinkActionText1 = hot;
    }

    private HtmlCommandLink waxLinkAction = new HtmlCommandLink();

    public HtmlCommandLink getWaxLinkAction() {
        return waxLinkAction;
    }

    public void setWaxLinkAction(HtmlCommandLink hcl) {
        this.waxLinkAction = hcl;
    }

    private HtmlOutputText linkAction1Text1 = new HtmlOutputText();

    public HtmlOutputText getLinkAction1Text1() {
        return linkAction1Text1;
    }

    public void setLinkAction1Text1(HtmlOutputText hot) {
        this.linkAction1Text1 = hot;
    }

    private HtmlCommandLink hydrateLinkAction = new HtmlCommandLink();

    public HtmlCommandLink getHydrateLinkAction() {
        return hydrateLinkAction;
    }

    public void setHydrateLinkAction(HtmlCommandLink hcl) {
        this.hydrateLinkAction = hcl;
    }

    private HtmlOutputText scaleLinkActionText2 = new HtmlOutputText();

    public HtmlOutputText getScaleLinkActionText2() {
        return scaleLinkActionText2;
    }

    public void setScaleLinkActionText2(HtmlOutputText hot) {
        this.scaleLinkActionText2 = hot;
    }

    private HtmlCommandLink tpFlashAction = new HtmlCommandLink();

    public HtmlCommandLink getTpFlashAction() {
        return tpFlashAction;
    }

    public void setTpFlashAction(HtmlCommandLink hcl) {
        this.tpFlashAction = hcl;
    }

    private HtmlOutputText linkAction2Text1 = new HtmlOutputText();

    public HtmlOutputText getLinkAction2Text1() {
        return linkAction2Text1;
    }

    public void setLinkAction2Text1(HtmlOutputText hot) {
        this.linkAction2Text1 = hot;
    }

    private HtmlCommandLink bubblePointLinkAction = new HtmlCommandLink();

    public HtmlCommandLink getBubblePointLinkAction() {
        return bubblePointLinkAction;
    }

    public void setBubblePointLinkAction(HtmlCommandLink hcl) {
        this.bubblePointLinkAction = hcl;
    }

    private HtmlOutputText linkAction1Text2 = new HtmlOutputText();

    public HtmlOutputText getLinkAction1Text2() {
        return linkAction1Text2;
    }

    public void setLinkAction1Text2(HtmlOutputText hot) {
        this.linkAction1Text2 = hot;
    }

    private HtmlCommandLink phaseEnvelopeLinkAction = new HtmlCommandLink();

    public HtmlCommandLink getPhaseEnvelopeLinkAction() {
        return phaseEnvelopeLinkAction;
    }

    public void setPhaseEnvelopeLinkAction(HtmlCommandLink hcl) {
        this.phaseEnvelopeLinkAction = hcl;
    }

    private HtmlOutputText linkAction1Text3 = new HtmlOutputText();

    public HtmlOutputText getLinkAction1Text3() {
        return linkAction1Text3;
    }

    public void setLinkAction1Text3(HtmlOutputText hot) {
        this.linkAction1Text3 = hot;
    }

    private HtmlCommandLink dewPointLinkActin = new HtmlCommandLink();

    public HtmlCommandLink getDewPointLinkActin() {
        return dewPointLinkActin;
    }

    public void setDewPointLinkActin(HtmlCommandLink hcl) {
        this.dewPointLinkActin = hcl;
    }

    private HtmlOutputText linkAction2Text2 = new HtmlOutputText();

    public HtmlOutputText getLinkAction2Text2() {
        return linkAction2Text2;
    }

    public void setLinkAction2Text2(HtmlOutputText hot) {
        this.linkAction2Text2 = hot;
    }

    private HtmlCommandLink asphalteneLinkAction = new HtmlCommandLink();

    public HtmlCommandLink getAsphalteneLinkAction() {
        return asphalteneLinkAction;
    }

    public void setAsphalteneLinkAction(HtmlCommandLink hcl) {
        this.asphalteneLinkAction = hcl;
    }

    private HtmlOutputText linkAction1Text4 = new HtmlOutputText();

    public HtmlOutputText getLinkAction1Text4() {
        return linkAction1Text4;
    }

    public void setLinkAction1Text4(HtmlOutputText hot) {
        this.linkAction1Text4 = hot;
    }

    private HtmlCommandLink dewPointLinkAction = new HtmlCommandLink();

    public HtmlCommandLink getDewPointLinkAction() {
        return dewPointLinkAction;
    }

    public void setDewPointLinkAction(HtmlCommandLink hcl) {
        this.dewPointLinkAction = hcl;
    }

    private HtmlOutputText linkAction1Text5 = new HtmlOutputText();

    public HtmlOutputText getLinkAction1Text5() {
        return linkAction1Text5;
    }

    public void setLinkAction1Text5(HtmlOutputText hot) {
        this.linkAction1Text5 = hot;
    }
    
    // </editor-fold>


    /** 
     * <p>Construct a new Page bean instance.</p>
     */
    public ThermoMenuPage2() {
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
     * <p>Return a reference to the scoped data bean.</p>
     */
    protected neqsimserver2.ApplicationBean1 getApplicationBean1() {
        return (neqsimserver2.ApplicationBean1)getBean("ApplicationBean1");
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
            log("ThermoMenuPage2 Initialization Failure", e);
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
    public void destroy() {
    }


    public String scaleLinkAction_action() {
        return "ToScalePotentialCheck";
    }

    public String phaseEnvelopeLinkAction_action() {
        return "ToPhaseEnvelopePage";
    }


    public String hydrateLinkAction_action() {
        // TODO: Replace with your code
        
        return "ToHydrateCalc";
    }


    public String tpFlashAction_action() {
        // User event code here...
         return "ToTPFlashPage";
    }

    
    public String dewPointLinkActin_action() {
        return "ToDewPointMenuPage";
    }


       public String asphalteneLinkAction_action() {
        // TODO: Replace with your code
        
        return "ToAsphalteneCalc";
    }


    public String bubblePointLinkAction_action() {
        return "ToBubblePointPage";
    }


    public String waxLinkAction_action() {
        // TODO: Replace with your code
        
        return "ToWaxPage";
    }


    public String dewPointLinkAction_action() {
        // TODO: Replace with your code
        
        return "ToDewPointPage";
    }

    public String freezingPointLinkAction_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.
        return "ToFreezingCalculation";
    }

    public String interfaceTensionLinkAction_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.
        return "ToInterfaceTensionPage";
    }

    public String saturatewaterPointLinkActin_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.
        return "TosaturateWithWater";
    }

    public String adsoprtionLinkAction_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.
        return "ToAdsorptionCalc";
    }

    public String viscosityLinkAction_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.
        return "ToViscosityCalc";
    }
}

