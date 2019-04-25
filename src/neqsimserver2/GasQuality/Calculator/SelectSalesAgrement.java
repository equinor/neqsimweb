/*
 * SelectSalesAgreement.java
 *
 * Created on 5. mai 2006, 00:11
 * Copyright ESOL
 */
package neqsimserver2.GasQuality.Calculator;

import com.sun.data.provider.impl.CachedRowSetDataProvider;
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
import com.sun.rave.web.ui.component.DropDown;
import com.sun.rave.web.ui.component.StaticText;
import com.sun.rave.web.ui.component.Button;
import javax.faces.event.ValueChangeEvent;
import neqsim.standards.salesContract.BaseContract;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class SelectSalesAgrement extends AbstractPageBean {
    
    // <editor-fold defaultstate="collapsed" desc="Creator-managed Component Definition">

    private int __placeholder;

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        cachedRowSetDataProvider1.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.speccountryRowSet}"));
        cachedRowSetDataProvider2.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.entrypointsRowSet}"));
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
    private HtmlOutputText logoOutputText1 = new HtmlOutputText();

    public HtmlOutputText getLogoOutputText1() {
        return logoOutputText1;
    }

    public void setLogoOutputText1(HtmlOutputText hot) {
        this.logoOutputText1 = hot;
    }
    private DropDown dropDown1 = new DropDown();

    public DropDown getDropDown1() {
        return dropDown1;
    }

    public void setDropDown1(DropDown dd) {
        this.dropDown1 = dd;
    }
    private StaticText staticText1 = new StaticText();

    public StaticText getStaticText1() {
        return staticText1;
    }

    public void setStaticText1(StaticText st) {
        this.staticText1 = st;
    }
    private Button button1 = new Button();

    public Button getButton1() {
        return button1;
    }

    public void setButton1(Button b) {
        this.button1 = b;
    }
    private DropDown coutryDropDown2 = new DropDown();

    public DropDown getCoutryDropDown2() {
        return coutryDropDown2;
    }

    public void setCoutryDropDown2(DropDown dd) {
        this.coutryDropDown2 = dd;
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

    // </editor-fold>
    /** 
     * <p>Construct a new Page bean instance.</p>
     */
    public SelectSalesAgrement() {
    }

    /** 
     * <p>Return a reference to the scoped data bean.</p>
     */
    protected neqsimserver2.GasQuality.GasQualitySessionBean getGasQuality$GasQualitySessionBean() {
        return (neqsimserver2.GasQuality.GasQualitySessionBean) getBean("GasQuality$GasQualitySessionBean");
    }

    /** 
     * <p>Return a reference to the scoped data bean.</p>
     */
    protected neqsimserver2.SessionBean1 getSessionBean1() {
        return (neqsimserver2.SessionBean1) getBean("SessionBean1");
    }

    /** 
     * <p>Return a reference to the scoped data bean.</p>
     */
    protected neqsimserver2.Thermo.ThermoSessionBean getThermo$ThermoSessionBean() {
        return (neqsimserver2.Thermo.ThermoSessionBean) getBean("Thermo$ThermoSessionBean");
    }

    /** 
     * <p>Return a reference to the scoped data bean.</p>
     */
    protected neqsimserver2.ApplicationBean1 getApplicationBean1() {
        return (neqsimserver2.ApplicationBean1) getBean("ApplicationBean1");
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
            log("SelectSalesAgreement Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
        }
    // </editor-fold>
    // Perform application initialization that must complete
    // *after* managed components are initialized
    // TODO - add your own initialization code here
        try{
         cachedRowSetDataProvider2.getCachedRowSet().setString(1, "NORWAY");
        cachedRowSetDataProvider2.getCachedRowSet().execute();
        }
        catch(Exception e){
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
        cachedRowSetDataProvider1.close();
        cachedRowSetDataProvider2.close();
    }

    public String button1_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.
        getThermo$ThermoSessionBean().setSalesContract(new BaseContract(getThermo$ThermoSessionBean().getThermoSystem(),"TROLLGASSALE","Norway"));
        getThermo$ThermoSessionBean().getSalesContract().runCheck();
        getThermo$ThermoSessionBean().getSalesContract().display();
        return "ToGasQualityContractResults";
    }

    public void coutryDropDown2_processValueChange(ValueChangeEvent event) {
        //   cachedRowSetDataProvider2.
      //
        try{

        cachedRowSetDataProvider2.getCachedRowSet().setString(1, coutryDropDown2.getSelected().toString());
        cachedRowSetDataProvider2.getCachedRowSet().execute();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

