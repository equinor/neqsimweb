/*
 * AnalyseSelect.java
 *
 * Created on 1. mars 2005, 10:16
 * Copyright ESOL
 */































































package neqsimserver2.GasQuality.MeasurementDB;































































































































import javax.faces.*;































































import com.sun.jsfcl.app.*;































































import javax.faces.component.html.*;































































import javax.faces.component.*;































































import com.sun.sql.rowset.*;































































import javax.faces.event.*;































































import com.sun.jsfcl.data.*;































































































































public class MeasurementSelect2 extends AbstractPageBean {































































    // <editor-fold defaultstate="collapsed" desc="Creator-managed Component Definition">































































































































    private int __placeholder;































































































































    private HtmlForm form1 = new HtmlForm();































































































































    public HtmlForm getForm1() {































































        return form1;































































    }































































































































    public void setForm1(HtmlForm hf) {































































        this.form1 = hf;































































    }































































































































    private HtmlOutputText topMenuText = new HtmlOutputText();































































































































    public HtmlOutputText getTopMenuText() {































































        return topMenuText;































































    }































































































































    public void setTopMenuText(HtmlOutputText hot) {































































        this.topMenuText = hot;































































    }































































































































    private HtmlOutputText loacitionText = new HtmlOutputText();































































































































    public HtmlOutputText getLoacitionText() {































































        return loacitionText;































































    }































































































































    public void setLoacitionText(HtmlOutputText hot) {































































        this.loacitionText = hot;































































    }































































































































    private HtmlOutputText typeText = new HtmlOutputText();































































































































    public HtmlOutputText getTypeText() {































































        return typeText;































































    }































































































































    public void setTypeText(HtmlOutputText hot) {































































        this.typeText = hot;































































    }































































































































    private HtmlCommandButton submitButton = new HtmlCommandButton();































































































































    public HtmlCommandButton getSubmitButton() {































































        return submitButton;































































    }































































































































    public void setSubmitButton(HtmlCommandButton hcb) {































































        this.submitButton = hcb;































































    }































































































































    private HtmlCommandButton addButton = new HtmlCommandButton();































































































































    public HtmlCommandButton getAddButton() {































































        return addButton;































































    }































































































































    public void setAddButton(HtmlCommandButton hcb) {































































        this.addButton = hcb;































































    }































































































































    private HtmlGraphicImage image1 = new HtmlGraphicImage();































































































































    public HtmlGraphicImage getImage1() {































































        return image1;































































    }































































































































    public void setImage1(HtmlGraphicImage hgi) {































































        this.image1 = hgi;































































    }































































































































    private HtmlSelectOneMenu loactionDropDownList = new HtmlSelectOneMenu();































































































































    public HtmlSelectOneMenu getLoactionDropDownList() {































































        return loactionDropDownList;































































    }































































































































    public void setLoactionDropDownList(HtmlSelectOneMenu hsom) {































































        this.loactionDropDownList = hsom;































































    }































































































































    private DefaultSelectItemsArray dropdown1DefaultItems = new DefaultSelectItemsArray();































































































































    public DefaultSelectItemsArray getDropdown1DefaultItems() {































































        return dropdown1DefaultItems;































































    }































































































































    public void setDropdown1DefaultItems(DefaultSelectItemsArray dsia) {































































        this.dropdown1DefaultItems = dsia;































































    }































































































































    private UISelectItems dropdown1SelectItems = new UISelectItems();































































































































    public UISelectItems getDropdown1SelectItems() {































































        return dropdown1SelectItems;































































    }































































































































    public void setDropdown1SelectItems(UISelectItems uisi) {































































        this.dropdown1SelectItems = uisi;































































    }































































































































    private HtmlSelectOneMenu typeDropDownList = new HtmlSelectOneMenu();































































































































    public HtmlSelectOneMenu getTypeDropDownList() {































































        return typeDropDownList;































































    }































































































































    public void setTypeDropDownList(HtmlSelectOneMenu hsom) {































































        this.typeDropDownList = hsom;































































    }































































































































    private UISelectItems dropdown1SelectItems1 = new UISelectItems();































































































































    public UISelectItems getDropdown1SelectItems1() {































































        return dropdown1SelectItems1;































































    }































































































































    public void setDropdown1SelectItems1(UISelectItems uisi) {































































        this.dropdown1SelectItems1 = uisi;































































    }































































































































    private HtmlOutputText outputText8 = new HtmlOutputText();































































































































    public HtmlOutputText getOutputText8() {































































        return outputText8;































































    }































































































































    public void setOutputText8(HtmlOutputText hot) {































































        this.outputText8 = hot;































































    }































































































































    private HtmlOutputText outputText7 = new HtmlOutputText();































































































































    public HtmlOutputText getOutputText7() {































































        return outputText7;































































    }































































































































    public void setOutputText7(HtmlOutputText hot) {































































        this.outputText7 = hot;































































    }































































































































    private HtmlCommandLink startMenuLinkAction = new HtmlCommandLink();































































































































    public HtmlCommandLink getStartMenuLinkAction() {































































        return startMenuLinkAction;































































    }































































































































    public void setStartMenuLinkAction(HtmlCommandLink hcl) {































































        this.startMenuLinkAction = hcl;































































    }































































































































    private HtmlOutputText linkAction1Text = new HtmlOutputText();































































































































    public HtmlOutputText getLinkAction1Text() {































































        return linkAction1Text;































































    }































































































































    public void setLinkAction1Text(HtmlOutputText hot) {































































        this.linkAction1Text = hot;































































    }































































































































    private HtmlGraphicImage image2 = new HtmlGraphicImage();































































































































    public HtmlGraphicImage getImage2() {































































        return image2;































































    }































































































































    public void setImage2(HtmlGraphicImage hgi) {































































        this.image2 = hgi;































































    }































































































































    private HtmlOutputText outputText1 = new HtmlOutputText();































































































































    public HtmlOutputText getOutputText1() {































































        return outputText1;































































    }































































































































    public void setOutputText1(HtmlOutputText hot) {































































        this.outputText1 = hot;































































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































































































































    private HtmlOutputText outputText3 = new HtmlOutputText();































































































































    public HtmlOutputText getOutputText3() {































































        return outputText3;































































    }































































































































    public void setOutputText3(HtmlOutputText hot) {































































        this.outputText3 = hot;































































    }































































































































    private HtmlOutputLink hyperlink2 = new HtmlOutputLink();































































































































    public HtmlOutputLink getHyperlink2() {































































        return hyperlink2;































































    }































































































































    public void setHyperlink2(HtmlOutputLink hol) {































































        this.hyperlink2 = hol;































































    }































































































































    private HtmlOutputText hyperlink2Text = new HtmlOutputText();































































































































    public HtmlOutputText getHyperlink2Text() {































































        return hyperlink2Text;































































    }































































































































    public void setHyperlink2Text(HtmlOutputText hot) {































































        this.hyperlink2Text = hot;































































    }































































































































    private HtmlOutputText typeText1 = new HtmlOutputText();































































































































    public HtmlOutputText getTypeText1() {































































        return typeText1;































































    }































































































































    public void setTypeText1(HtmlOutputText hot) {































































        this.typeText1 = hot;































































    }































































































































    private HtmlSelectOneMenu typeDropDownList1 = new HtmlSelectOneMenu();































































































































    public HtmlSelectOneMenu getTypeDropDownList1() {































































        return typeDropDownList1;































































    }































































































































    public void setTypeDropDownList1(HtmlSelectOneMenu hsom) {































































        this.typeDropDownList1 = hsom;































































    }































































































































    private UISelectItems dropdown1SelectItems2 = new UISelectItems();































































































































    public UISelectItems getDropdown1SelectItems2() {































































        return dropdown1SelectItems2;































































    }































































































































    public void setDropdown1SelectItems2(UISelectItems uisi) {































































        this.dropdown1SelectItems2 = uisi;































































    }































































































































    private DefaultSelectItemsArray loactionDropDownListDefaultItems = new DefaultSelectItemsArray();































































































































    public DefaultSelectItemsArray getLoactionDropDownListDefaultItems() {































































        return loactionDropDownListDefaultItems;































































    }































































































































    public void setLoactionDropDownListDefaultItems(DefaultSelectItemsArray dsia) {































































        this.loactionDropDownListDefaultItems = dsia;































































    }































































































































    private DefaultSelectItemsArray typeDropDownListDefaultItems = new DefaultSelectItemsArray();































































































































    public DefaultSelectItemsArray getTypeDropDownListDefaultItems() {































































        return typeDropDownListDefaultItems;































































    }































































































































    public void setTypeDropDownListDefaultItems(DefaultSelectItemsArray dsia) {































































        this.typeDropDownListDefaultItems = dsia;































































    }































































































































    private DefaultSelectItemsArray typeDropDownList1DefaultItems = new DefaultSelectItemsArray();































































































































    public DefaultSelectItemsArray getTypeDropDownList1DefaultItems() {































































        return typeDropDownList1DefaultItems;































































    }































































































































    public void setTypeDropDownList1DefaultItems(DefaultSelectItemsArray dsia) {































































        this.typeDropDownList1DefaultItems = dsia;































































    }































































    // </editor-fold>































































    public MeasurementSelect2() {































































        // <editor-fold defaultstate="collapsed" desc="Creator-managed Component Initialization">































































        try {































































        } catch (Exception e) {































































            log("MeasurementSelect Initialization Failure", e);































































            throw e instanceof javax.faces.FacesException ? (FacesException) e: new FacesException(e);































































        }































































        // </editor-fold>































































        // Additional user provided initialization code































































    }































































































































    protected neqsimserver2.GasQuality.GasQualitySessionBean getGasQuality$GasQualitySessionBean() {































































        return (neqsimserver2.GasQuality.GasQualitySessionBean)getBean("GasQuality$GasQualitySessionBean");































































    }































































































































    protected neqsimserver2.ApplicationBean1 getApplicationBean1() {































































        return (neqsimserver2.ApplicationBean1)getBean("ApplicationBean1");































































    }































































































































    protected neqsimserver2.Thermo.ThermoSessionBean getThermo$ThermoSessionBean() {































































        return (neqsimserver2.Thermo.ThermoSessionBean)getBean("Thermo$ThermoSessionBean");































































    }































































































































    protected neqsimserver2.SessionBean1 getSessionBean1() {































































        return (neqsimserver2.SessionBean1)getBean("SessionBean1");































































    }































































































































    /** 
     * Bean cleanup.
     */































































    protected void afterRenderResponse() {































































    }































































































































    public String submitButton_action() {































































        // TODO Replace with your code































































        return "MeasurementToMeasurementDB";































































    }































































































































    public String addButton_action() {































































        // TODO Replace with your code































































        return "MeasurementSelectToAddMeasurement";































































    }































































































































    public String startMenuLinkAction_action() {































































        // TODO Replace with your code































































        return "ToStartMenu";































































    }































































































































    public void loactionDropDownList_processValueChange(ValueChangeEvent vce) {































































        // TODO Replace with your code































































    }































































































































    public void typeDropDownList1_processValueChange(ValueChangeEvent vce) {































































        // TODO Replace with your code































































    }































































































































    public void typeDropDownList_processValueChange(ValueChangeEvent vce) {































































        // TODO Replace with your code































































    }































































































































































































}































































