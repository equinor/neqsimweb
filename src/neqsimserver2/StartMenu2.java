/*
 * StarMenu2.java
 *
 * Created on 11. april 2007, 19:05
 * Copyright ESOL
 */
package neqsimserver2;

import com.sun.data.provider.impl.CachedRowSetDataProvider;
import com.sun.j2ee.blueprints.ui.geocoder.GeoCoder;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Hyperlink;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.Page;
import javax.faces.FacesException;
import javax.faces.component.html.HtmlCommandLink;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.component.html.HtmlOutputLink;
import javax.faces.component.html.HtmlGraphicImage;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class StartMenu2 extends AbstractPageBean {
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
    private HtmlCommandLink thermoCalculatorLinkAction1 = new HtmlCommandLink();

    public HtmlCommandLink getThermoCalculatorLinkAction1() {
        return thermoCalculatorLinkAction1;
    }

    public void setThermoCalculatorLinkAction1(HtmlCommandLink hcl) {
        this.thermoCalculatorLinkAction1 = hcl;
    }
    private HtmlOutputText linkAction1Text1 = new HtmlOutputText();

    public HtmlOutputText getLinkAction1Text1() {
        return linkAction1Text1;
    }

    public void setLinkAction1Text1(HtmlOutputText hot) {
        this.linkAction1Text1 = hot;
    }
    private HtmlOutputText outputText2 = new HtmlOutputText();

    public HtmlOutputText getOutputText2() {
        return outputText2;
    }

    public void setOutputText2(HtmlOutputText hot) {
        this.outputText2 = hot;
    }
    private HtmlOutputText gasQualityoutputText1 = new HtmlOutputText();

    public HtmlOutputText getGasQualityoutputText1() {
        return gasQualityoutputText1;
    }

    public void setGasQualityoutputText1(HtmlOutputText hot) {
        this.gasQualityoutputText1 = hot;
    }
    private HtmlCommandLink thermoDatabaseLinkAction1 = new HtmlCommandLink();

    public HtmlCommandLink getThermoDatabaseLinkAction1() {
        return thermoDatabaseLinkAction1;
    }

    public void setThermoDatabaseLinkAction1(HtmlCommandLink hcl) {
        this.thermoDatabaseLinkAction1 = hcl;
    }
    private HtmlOutputText linkAction1Text2 = new HtmlOutputText();

    public HtmlOutputText getLinkAction1Text2() {
        return linkAction1Text2;
    }

    public void setLinkAction1Text2(HtmlOutputText hot) {
        this.linkAction1Text2 = hot;
    }
    private HtmlOutputText outputText3 = new HtmlOutputText();

    public HtmlOutputText getOutputText3() {
        return outputText3;
    }

    public void setOutputText3(HtmlOutputText hot) {
        this.outputText3 = hot;
    }
    private HtmlCommandLink pipeCalcLinkAction1 = new HtmlCommandLink();

    public HtmlCommandLink getPipeCalcLinkAction1() {
        return pipeCalcLinkAction1;
    }

    public void setPipeCalcLinkAction1(HtmlCommandLink hcl) {
        this.pipeCalcLinkAction1 = hcl;
    }
    private HtmlOutputText linkAction4Text2 = new HtmlOutputText();

    public HtmlOutputText getLinkAction4Text2() {
        return linkAction4Text2;
    }

    public void setLinkAction4Text2(HtmlOutputText hot) {
        this.linkAction4Text2 = hot;
    }
    private HtmlCommandLink gasQualitySpecificationLinkAction1 = new HtmlCommandLink();

    public HtmlCommandLink getGasQualitySpecificationLinkAction1() {
        return gasQualitySpecificationLinkAction1;
    }

    public void setGasQualitySpecificationLinkAction1(HtmlCommandLink hcl) {
        this.gasQualitySpecificationLinkAction1 = hcl;
    }
    private HtmlOutputText linkAction2Text1 = new HtmlOutputText();

    public HtmlOutputText getLinkAction2Text1() {
        return linkAction2Text1;
    }

    public void setLinkAction2Text1(HtmlOutputText hot) {
        this.linkAction2Text1 = hot;
    }
    private HtmlCommandLink gasQualityPipeDatabaseLinkAction1 = new HtmlCommandLink();

    public HtmlCommandLink getGasQualityPipeDatabaseLinkAction1() {
        return gasQualityPipeDatabaseLinkAction1;
    }

    public void setGasQualityPipeDatabaseLinkAction1(HtmlCommandLink hcl) {
        this.gasQualityPipeDatabaseLinkAction1 = hcl;
    }
    private HtmlOutputText linkAction2Text4 = new HtmlOutputText();

    public HtmlOutputText getLinkAction2Text4() {
        return linkAction2Text4;
    }

    public void setLinkAction2Text4(HtmlOutputText hot) {
        this.linkAction2Text4 = hot;
    }
    private HtmlOutputText outputText4 = new HtmlOutputText();

    public HtmlOutputText getOutputText4() {
        return outputText4;
    }

    public void setOutputText4(HtmlOutputText hot) {
        this.outputText4 = hot;
    }
    private HtmlOutputText outputText5 = new HtmlOutputText();

    public HtmlOutputText getOutputText5() {
        return outputText5;
    }

    public void setOutputText5(HtmlOutputText hot) {
        this.outputText5 = hot;
    }
    private HtmlOutputText outputText6 = new HtmlOutputText();

    public HtmlOutputText getOutputText6() {
        return outputText6;
    }

    public void setOutputText6(HtmlOutputText hot) {
        this.outputText6 = hot;
    }
    private HtmlCommandLink gasQualityStandardsLinkAction1 = new HtmlCommandLink();

    public HtmlCommandLink getGasQualityStandardsLinkAction1() {
        return gasQualityStandardsLinkAction1;
    }

    public void setGasQualityStandardsLinkAction1(HtmlCommandLink hcl) {
        this.gasQualityStandardsLinkAction1 = hcl;
    }
    private HtmlOutputText linkAction2Text5 = new HtmlOutputText();

    public HtmlOutputText getLinkAction2Text5() {
        return linkAction2Text5;
    }

    public void setLinkAction2Text5(HtmlOutputText hot) {
        this.linkAction2Text5 = hot;
    }
    private HtmlCommandLink procEconLinkAction1 = new HtmlCommandLink();

    public HtmlCommandLink getProcEconLinkAction1() {
        return procEconLinkAction1;
    }

    public void setProcEconLinkAction1(HtmlCommandLink hcl) {
        this.procEconLinkAction1 = hcl;
    }
    private HtmlOutputText linkAction6Text1 = new HtmlOutputText();

    public HtmlOutputText getLinkAction6Text1() {
        return linkAction6Text1;
    }

    public void setLinkAction6Text1(HtmlOutputText hot) {
        this.linkAction6Text1 = hot;
    }
    private HtmlCommandLink gasQualityAnalyserDatabaseLinkAction1 = new HtmlCommandLink();

    public HtmlCommandLink getGasQualityAnalyserDatabaseLinkAction1() {
        return gasQualityAnalyserDatabaseLinkAction1;
    }

    public void setGasQualityAnalyserDatabaseLinkAction1(HtmlCommandLink hcl) {
        this.gasQualityAnalyserDatabaseLinkAction1 = hcl;
    }
    private HtmlOutputText linkAction2Text7 = new HtmlOutputText();

    public HtmlOutputText getLinkAction2Text7() {
        return linkAction2Text7;
    }

    public void setLinkAction2Text7(HtmlOutputText hot) {
        this.linkAction2Text7 = hot;
    }
    private HtmlCommandLink processCalcLinkAction1 = new HtmlCommandLink();

    public HtmlCommandLink getProcessCalcLinkAction1() {
        return processCalcLinkAction1;
    }

    public void setProcessCalcLinkAction1(HtmlCommandLink hcl) {
        this.processCalcLinkAction1 = hcl;
    }
    private HtmlOutputText linkAction5Text1 = new HtmlOutputText();

    public HtmlOutputText getLinkAction5Text1() {
        return linkAction5Text1;
    }

    public void setLinkAction5Text1(HtmlOutputText hot) {
        this.linkAction5Text1 = hot;
    }
    private HtmlOutputText processLinkOutputText1 = new HtmlOutputText();

    public HtmlOutputText getProcessLinkOutputText1() {
        return processLinkOutputText1;
    }

    public void setProcessLinkOutputText1(HtmlOutputText hot) {
        this.processLinkOutputText1 = hot;
    }
    private HtmlOutputText outputText7 = new HtmlOutputText();

    public HtmlOutputText getOutputText7() {
        return outputText7;
    }

    public void setOutputText7(HtmlOutputText hot) {
        this.outputText7 = hot;
    }
    private HtmlOutputText topMenuText1 = new HtmlOutputText();

    public HtmlOutputText getTopMenuText1() {
        return topMenuText1;
    }

    public void setTopMenuText1(HtmlOutputText hot) {
        this.topMenuText1 = hot;
    }
    private HtmlCommandLink masstransLDatabaseinkAction1 = new HtmlCommandLink();

    public HtmlCommandLink getMasstransLDatabaseinkAction1() {
        return masstransLDatabaseinkAction1;
    }

    public void setMasstransLDatabaseinkAction1(HtmlCommandLink hcl) {
        this.masstransLDatabaseinkAction1 = hcl;
    }
    private HtmlOutputText linkAction2Text8 = new HtmlOutputText();

    public HtmlOutputText getLinkAction2Text8() {
        return linkAction2Text8;
    }

    public void setLinkAction2Text8(HtmlOutputText hot) {
        this.linkAction2Text8 = hot;
    }
    private HtmlCommandLink pipeDatabseLinkAction1 = new HtmlCommandLink();

    public HtmlCommandLink getPipeDatabseLinkAction1() {
        return pipeDatabseLinkAction1;
    }

    public void setPipeDatabseLinkAction1(HtmlCommandLink hcl) {
        this.pipeDatabseLinkAction1 = hcl;
    }
    private HtmlOutputText linkAction4Text4 = new HtmlOutputText();

    public HtmlOutputText getLinkAction4Text4() {
        return linkAction4Text4;
    }

    public void setLinkAction4Text4(HtmlOutputText hot) {
        this.linkAction4Text4 = hot;
    }
    private HtmlCommandLink procEconLinkAction2 = new HtmlCommandLink();

    public HtmlCommandLink getProcEconLinkAction2() {
        return procEconLinkAction2;
    }

    public void setProcEconLinkAction2(HtmlCommandLink hcl) {
        this.procEconLinkAction2 = hcl;
    }
    private HtmlOutputText linkAction6Text2 = new HtmlOutputText();

    public HtmlOutputText getLinkAction6Text2() {
        return linkAction6Text2;
    }

    public void setLinkAction6Text2(HtmlOutputText hot) {
        this.linkAction6Text2 = hot;
    }
    private HtmlCommandLink processUnitDesignLink = new HtmlCommandLink();

    public HtmlCommandLink getProcessUnitDesignLink() {
        return processUnitDesignLink;
    }

    public void setProcessUnitDesignLink(HtmlCommandLink hcl) {
        this.processUnitDesignLink = hcl;
    }
    private HtmlOutputText linkAction5Text3 = new HtmlOutputText();

    public HtmlOutputText getLinkAction5Text3() {
        return linkAction5Text3;
    }

    public void setLinkAction5Text3(HtmlOutputText hot) {
        this.linkAction5Text3 = hot;
    }
    private HtmlCommandLink masstransCalcLinkAction1 = new HtmlCommandLink();

    public HtmlCommandLink getMasstransCalcLinkAction1() {
        return masstransCalcLinkAction1;
    }

    public void setMasstransCalcLinkAction1(HtmlCommandLink hcl) {
        this.masstransCalcLinkAction1 = hcl;
    }
    private HtmlOutputText linkAction2Text9 = new HtmlOutputText();

    public HtmlOutputText getLinkAction2Text9() {
        return linkAction2Text9;
    }

    public void setLinkAction2Text9(HtmlOutputText hot) {
        this.linkAction2Text9 = hot;
    }
    private HtmlCommandLink pipeDatabseLinkAction2 = new HtmlCommandLink();

    public HtmlCommandLink getPipeDatabseLinkAction2() {
        return pipeDatabseLinkAction2;
    }

    public void setPipeDatabseLinkAction2(HtmlCommandLink hcl) {
        this.pipeDatabseLinkAction2 = hcl;
    }
    private HtmlOutputText linkAction4Text5 = new HtmlOutputText();

    public HtmlOutputText getLinkAction4Text5() {
        return linkAction4Text5;
    }

    public void setLinkAction4Text5(HtmlOutputText hot) {
        this.linkAction4Text5 = hot;
    }
    private HtmlGraphicImage image1 = new HtmlGraphicImage();

    public HtmlGraphicImage getImage1() {
        return image1;
    }

    public void setImage1(HtmlGraphicImage hgi) {
        this.image1 = hgi;
    }
    private HtmlCommandLink gasQualityCalcLinkAction1 = new HtmlCommandLink();

    public HtmlCommandLink getGasQualityCalcLinkAction1() {
        return gasQualityCalcLinkAction1;
    }

    public void setGasQualityCalcLinkAction1(HtmlCommandLink hcl) {
        this.gasQualityCalcLinkAction1 = hcl;
    }
    private HtmlOutputText linkAction2Text10 = new HtmlOutputText();

    public HtmlOutputText getLinkAction2Text10() {
        return linkAction2Text10;
    }

    public void setLinkAction2Text10(HtmlOutputText hot) {
        this.linkAction2Text10 = hot;
    }
    private HtmlCommandLink linkAction2 = new HtmlCommandLink();

    public HtmlCommandLink getLinkAction2() {
        return linkAction2;
    }

    public void setLinkAction2(HtmlCommandLink hcl) {
        this.linkAction2 = hcl;
    }
    private HtmlOutputText linkAction1Text4 = new HtmlOutputText();

    public HtmlOutputText getLinkAction1Text4() {
        return linkAction1Text4;
    }

    public void setLinkAction1Text4(HtmlOutputText hot) {
        this.linkAction1Text4 = hot;
    }
    private HtmlOutputText outputText8 = new HtmlOutputText();

    public HtmlOutputText getOutputText8() {
        return outputText8;
    }

    public void setOutputText8(HtmlOutputText hot) {
        this.outputText8 = hot;
    }
    private HtmlCommandLink statoilProcessSimAction1 = new HtmlCommandLink();

    public HtmlCommandLink getStatoilProcessSimAction1() {
        return statoilProcessSimAction1;
    }

    public void setStatoilProcessSimAction1(HtmlCommandLink hcl) {
        this.statoilProcessSimAction1 = hcl;
    }
    private HtmlOutputText linkAction6Text4 = new HtmlOutputText();

    public HtmlOutputText getLinkAction6Text4() {
        return linkAction6Text4;
    }

    public void setLinkAction6Text4(HtmlOutputText hot) {
        this.linkAction6Text4 = hot;
    }
    private HtmlOutputLink hyperlink1 = new HtmlOutputLink();

    public HtmlOutputLink getHyperlink1() {
        return hyperlink1;
    }

    public void setHyperlink1(HtmlOutputLink hol) {
        this.hyperlink1 = hol;
    }
    private HtmlOutputText hyperlink1Text = new HtmlOutputText();

    public HtmlOutputText getHyperlink1Text() {
        return hyperlink1Text;
    }

    public void setHyperlink1Text(HtmlOutputText hot) {
        this.hyperlink1Text = hot;
    }
    private GeoCoder geoCoder1 = new GeoCoder();

    public GeoCoder getGeoCoder1() {
        return geoCoder1;
    }

    public void setGeoCoder1(GeoCoder gc) {
        this.geoCoder1 = gc;
    }

    // </editor-fold>
    /** 
     * <p>Construct a new Page bean instance.</p>
     */
    public StartMenu2() {
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
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1) getBean("ApplicationBean1");
    }

    /** 
     * <p>Return a reference to the scoped data bean.</p>
     */
    protected SessionBean1 getSessionBean1() {
        return (SessionBean1) getBean("SessionBean1");
    }

    /** 
     * <p>Return a reference to the scoped data bean.</p>
     */
    protected neqsimserver2.Thermo.ThermoSessionBean getThermo$ThermoSessionBean() {
        return (neqsimserver2.Thermo.ThermoSessionBean) getBean("Thermo$ThermoSessionBean");
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
            log("StarMenu2 Initialization Failure", e);
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

    public String gasQualityLinkAction1_action() {

        return "StartMenuToGasQuality";

    }

    public String masstransLinkAction_action() {

        return "StartMenuToMassTransferMenuPage";

    }

    public String procEconLinkAction2_action() {

        // TODO Replace with your code

        return "StarMenuToEconomyMenuPage";

    }

    public String gasQualityPipeDatabaseLinkAction_action() {

        // TODO Replace with your code
        getSessionBean1().setActiveSubject("thermo");
        return "MainMenuToMeasurementSelect";

    }

    public String thermoDatabaseLinkAction_action() {

        // TODO Replace with your code

        return "StartMenuToMeasurementSelect";

    }

    public String thermoCalculatorLinkAction_action() {

        // TODO Replace with your code
        getSessionBean1().setActiveSubject("thermo");
        return "ToThermoStartPage";

    }

    public String thermoDocLinkAction_action() {

        // TODO Replace with your code
        getSessionBean1().setActiveSubject("thermo");
        return "ToThermoDocumentationPage";

    }

    public String processStreamLinkAction_action() {

        // TODO Replace with your code

        return null;

    }

    public String statoilProcessSimAction_action() {
        return "ToStatoilProcessMenuPage";

    }

    public String gasQualityCalcLinkAction_action() {

        // TODO: Replace with your code
        getSessionBean1().setActiveSubject("gasquality");
        return "ToGasQualityCalculator";

    }

    public String linkAction1_action() {

        // TODO: Replace with your code

        return "ToStartMenu";

    }

    public String linkAction2_action() {

        // TODO: Replace with your code

        return "ToMainDocumentation";

    }

    public String gasQualityDocLinkAction_action() {

        // TODO: Replace with your code

        return "ToGasQualityDocumentation";

    }

    public String gasQualitySpecificationLinkAction_action() {

        // TODO: Replace with your code

        return "ToGasQualitySpecificationDB";

    }

    public String linkAction3_action() {
        // TODO: Replace with your code

        return null;
    }

    public String hyperlink1_action() {
        // TODO: Replace with your code

        return null;
    }

    public String gasQualityAnalyserDatabaseLinkAction1_action() {
        // TODO: Replace with your code

        return "MainMenuToAnalyserSelect";
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     */
    protected StartMenu2 getStartMenu() {
        return (StartMenu2) getBean("StartMenu2");
    }

    public String LNGDocLinkAction1_action() {
        // TODO: Replace with your code
        return "ToLNGDocumentation";
    }

    public String gasQualityStandardsLinkAction1_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.
        return "ToStandardsMenuPage";
    }

    public String procEconLinkAction3_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.
        return "ToProcessEconomyDocumentation";
    }

    public String pipeDocLinkAction2_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.
        return "ToPipeFlowDocumentation";
    }

    public String processDocLinkAction1_action() {
        // TODO: Replace with your code
        return "ToProcessDocumentation";
    }

    public String masstransDocLinkAction1_action() {
        // TODO: Replace with your code
        return "ToNonEquilibriumDocumentation";
    }

    public String masstransCalcLinkAction1_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.
        return null;
    }

    public String gasQualityStandardsLinkAction2_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.
        return "ToProcessStandardDataBase";
    }

    public String piplineStandardStandardsLinkAction_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.
        return "ToPipelineStandardDataBase";
    }

    public String pipeCalcLinkAction1_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.
        return null;
    }

    public String processEconomyStandardsLinkAction_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.
        return "ToProcessEconomyStandardDataBase";
    }

    public String LNGStandardsLinkAction5_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.
        return "ToLNGStandardDataBase";
    }

    public String LNGLinkAction2_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.
        getSessionBean1().setActiveSubject("LNG");
        return "ToLNGCalculatorStartPage";
    }

    public String LNGDatabseLinkAction1_action() {
        // TODO: Replace with your code
        return null;
    }

    public String gasNetworkActionLink_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.
        return "ToGasNetworkStartPage";
    }

    public String processCalcLinkAction1_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.
        return "ToGasProcessCalcMenu";
    }

    public String thermoDocumentationLink_action() {
        // TODO: Replace with your code
        return null;
    }

    public String processSystemDesignLink_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.
        return "ToProcessSystemDesignMain";
    }

    public String processUnitDesignLink_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.
        return "ToProcessUnitDesignMain";
    }

    public String hyperlink4_action() {
        // TODO: Replace with your code
        return null;
    }
}

