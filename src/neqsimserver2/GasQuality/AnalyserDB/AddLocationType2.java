/*
 * AddLocationType2.java
 *
 * Created on 17. mars 2007, 18:59
 * Copyright ESOL
 */
package neqsimserver2.GasQuality.AnalyserDB;

import com.sun.data.provider.RowKey;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.Page;
import javax.faces.FacesException;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.component.html.HtmlInputText;
import javax.faces.component.html.HtmlGraphicImage;
import javax.faces.component.html.HtmlCommandButton;
import javax.faces.component.html.HtmlCommandLink;
import com.sun.data.provider.impl.CachedRowSetDataProvider;
import javax.faces.convert.IntegerConverter;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class AddLocationType2 extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Creator-managed Component Definition">
    private int __placeholder;
    
    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        analyserlocationsDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet)getValue("#{SessionBean1.analyserlocationsRowSet}"));
        analysertypesDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet)getValue("#{SessionBean1.analysertypesRowSet}"));
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
    
    private HtmlOutputText outputText1 = new HtmlOutputText();
    
    public HtmlOutputText getOutputText1() {
        return outputText1;
    }
    
    public void setOutputText1(HtmlOutputText hot) {
        this.outputText1 = hot;
    }
    
    private HtmlInputText analyserTextField1 = new HtmlInputText();
    
    public HtmlInputText getAnalyserTextField1() {
        return analyserTextField1;
    }
    
    public void setAnalyserTextField1(HtmlInputText hit) {
        this.analyserTextField1 = hit;
    }
    
    private HtmlGraphicImage image1 = new HtmlGraphicImage();
    
    public HtmlGraphicImage getImage1() {
        return image1;
    }
    
    public void setImage1(HtmlGraphicImage hgi) {
        this.image1 = hgi;
    }
    
    private HtmlInputText locationTextField1 = new HtmlInputText();
    
    public HtmlInputText getLocationTextField1() {
        return locationTextField1;
    }
    
    public void setLocationTextField1(HtmlInputText hit) {
        this.locationTextField1 = hit;
    }
    
    private HtmlCommandButton addTypeButton1 = new HtmlCommandButton();
    
    public HtmlCommandButton getAddTypeButton1() {
        return addTypeButton1;
    }
    
    public void setAddTypeButton1(HtmlCommandButton hcb) {
        this.addTypeButton1 = hcb;
    }
    
    private HtmlOutputText topMenuText1 = new HtmlOutputText();
    
    public HtmlOutputText getTopMenuText1() {
        return topMenuText1;
    }
    
    public void setTopMenuText1(HtmlOutputText hot) {
        this.topMenuText1 = hot;
    }
    
    private HtmlOutputText outputText2 = new HtmlOutputText();
    
    public HtmlOutputText getOutputText2() {
        return outputText2;
    }
    
    public void setOutputText2(HtmlOutputText hot) {
        this.outputText2 = hot;
    }
    
    private HtmlOutputText outputText3 = new HtmlOutputText();
    
    public HtmlOutputText getOutputText3() {
        return outputText3;
    }
    
    public void setOutputText3(HtmlOutputText hot) {
        this.outputText3 = hot;
    }
    
    private HtmlCommandLink linkAction1 = new HtmlCommandLink();
    
    public HtmlCommandLink getLinkAction1() {
        return linkAction1;
    }
    
    public void setLinkAction1(HtmlCommandLink hcl) {
        this.linkAction1 = hcl;
    }
    
    private HtmlOutputText linkAction1Text1 = new HtmlOutputText();
    
    public HtmlOutputText getLinkAction1Text1() {
        return linkAction1Text1;
    }
    
    public void setLinkAction1Text1(HtmlOutputText hot) {
        this.linkAction1Text1 = hot;
    }
    
    private HtmlCommandButton addLocationButton1 = new HtmlCommandButton();
    
    public HtmlCommandButton getAddLocationButton1() {
        return addLocationButton1;
    }
    
    public void setAddLocationButton1(HtmlCommandButton hcb) {
        this.addLocationButton1 = hcb;
    }
    
    private HtmlOutputText outputText4 = new HtmlOutputText();
    
    public HtmlOutputText getOutputText4() {
        return outputText4;
    }
    
    public void setOutputText4(HtmlOutputText hot) {
        this.outputText4 = hot;
    }
    
    private CachedRowSetDataProvider analyserlocationsDataProvider = new CachedRowSetDataProvider();
    
    public CachedRowSetDataProvider getAnalyserlocationsDataProvider() {
        return analyserlocationsDataProvider;
    }
    
    public void setAnalyserlocationsDataProvider(CachedRowSetDataProvider crsdp) {
        this.analyserlocationsDataProvider = crsdp;
    }
    
    private CachedRowSetDataProvider analysertypesDataProvider = new CachedRowSetDataProvider();
    
    public CachedRowSetDataProvider getAnalysertypesDataProvider() {
        return analysertypesDataProvider;
    }
    
    public void setAnalysertypesDataProvider(CachedRowSetDataProvider crsdp) {
        this.analysertypesDataProvider = crsdp;
    }
    
    private IntegerConverter dropDown1Converter = new IntegerConverter();
    
    public IntegerConverter getDropDown1Converter() {
        return dropDown1Converter;
    }
    
    public void setDropDown1Converter(IntegerConverter ic) {
        this.dropDown1Converter = ic;
    }
    
    // </editor-fold>
    
    
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public AddLocationType2() {
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
    protected neqsimserver2.Thermo.ThermoSessionBean getThermo$ThermoSessionBean() {
        return (neqsimserver2.Thermo.ThermoSessionBean)getBean("Thermo$ThermoSessionBean");
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
            log("AddLocationType2 Initialization Failure", e);
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
        analysertypesDataProvider.close();
        analyserlocationsDataProvider.close();
    }
    
    
    public String addTypeButton_action() {
        analysertypesDataProvider.cursorLast();
        RowKey rowKey = analysertypesDataProvider.appendRow();
        analysertypesDataProvider.setValue("ANALYSERTYPES.INSTTYPES", rowKey, analyserTextField1.getValue().toString());
        analysertypesDataProvider.commitChanges();
        analysertypesDataProvider.refresh();
        return "ToAddGasQualityAnalyser";
    }
    
    
    public String linkAction3_action() {
        return "ToAddGasQualityAnalyser";
    }
    
    
    public String addLocationButton_action() {
        
        analyserlocationsDataProvider.cursorLast();
        RowKey rowKey = analyserlocationsDataProvider.appendRow();
        analyserlocationsDataProvider.setValue("ANALYSERLOCATIONS.STED", rowKey, locationTextField1.getValue().toString());
        analyserlocationsDataProvider.commitChanges();
        analyserlocationsDataProvider.refresh();
        // case name where null will return to the same page.
        
        return "ToAddGasQualityAnalyser";
    }
}

