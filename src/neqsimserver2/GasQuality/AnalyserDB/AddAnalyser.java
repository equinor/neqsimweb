/*
 * AddAnalyser.java
 *
 * Created on 5. mars 2005, 10:29
 * Copyright ESOL
 */
package neqsimserver2.GasQuality.AnalyserDB;

import com.sun.data.provider.RowKey;
import javax.faces.*;

import com.sun.jsfcl.app.*;

import javax.faces.component.html.*;

import javax.faces.component.*;

import javax.faces.event.*;

import com.sun.data.provider.impl.CachedRowSetDataProvider;

public class AddAnalyser extends AbstractPageBean {

    // <editor-fold defaultstate="collapsed" desc="Creator-managed Component
    // Definition">
    private int __placeholder;
    private HtmlForm form1 = new HtmlForm();

    public HtmlForm getForm1() {

        return form1;

    }

    public void setForm1(HtmlForm hf) {

        this.form1 = hf;

    }
    private HtmlGraphicImage neqsimLogo = new HtmlGraphicImage();

    public HtmlGraphicImage getNeqsimLogo() {

        return neqsimLogo;

    }

    public void setNeqsimLogo(HtmlGraphicImage hgi) {

        this.neqsimLogo = hgi;

    }
    private HtmlOutputText topMenuText = new HtmlOutputText();

    public HtmlOutputText getTopMenuText() {

        return topMenuText;

    }

    public void setTopMenuText(HtmlOutputText hot) {

        this.topMenuText = hot;

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
    private HtmlInputText instrumentNameTextField = new HtmlInputText();

    public HtmlInputText getInstrumentNameTextField() {

        return instrumentNameTextField;

    }

    public void setInstrumentNameTextField(HtmlInputText hit) {

        this.instrumentNameTextField = hit;

    }
    private HtmlInputTextarea purposeTextArea = new HtmlInputTextarea();

    public HtmlInputTextarea getPurposeTextArea() {

        return purposeTextArea;

    }

    public void setPurposeTextArea(HtmlInputTextarea hit) {

        this.purposeTextArea = hit;

    }
    private HtmlInputText numberInstTextField = new HtmlInputText();

    public HtmlInputText getNumberInstTextField() {

        return numberInstTextField;

    }

    public void setNumberInstTextField(HtmlInputText hit) {

        this.numberInstTextField = hit;

    }
    private HtmlOutputText outputText6 = new HtmlOutputText();

    public HtmlOutputText getOutputText6() {

        return outputText6;

    }

    public void setOutputText6(HtmlOutputText hot) {

        this.outputText6 = hot;

    }
    private HtmlInputText fieldLocationTextField = new HtmlInputText();

    public HtmlInputText getFieldLocationTextField() {

        return fieldLocationTextField;

    }

    public void setFieldLocationTextField(HtmlInputText hit) {

        this.fieldLocationTextField = hit;

    }
    private HtmlOutputText outputText7 = new HtmlOutputText();

    public HtmlOutputText getOutputText7() {

        return outputText7;

    }

    public void setOutputText7(HtmlOutputText hot) {

        this.outputText7 = hot;

    }
    private HtmlInputText tagNumberTextField = new HtmlInputText();

    public HtmlInputText getTagNumberTextField() {

        return tagNumberTextField;

    }

    public void setTagNumberTextField(HtmlInputText hit) {

        this.tagNumberTextField = hit;

    }
    private HtmlOutputText outputText8 = new HtmlOutputText();

    public HtmlOutputText getOutputText8() {

        return outputText8;

    }

    public void setOutputText8(HtmlOutputText hot) {

        this.outputText8 = hot;

    }
    private HtmlInputTextarea calibrationRoutinesTextField = new HtmlInputTextarea();

    public HtmlInputTextarea getCalibrationRoutinesTextField() {

        return calibrationRoutinesTextField;

    }

    public void setCalibrationRoutinesTextField(HtmlInputTextarea hit) {

        this.calibrationRoutinesTextField = hit;

    }
    private HtmlOutputText outputText9 = new HtmlOutputText();

    public HtmlOutputText getOutputText9() {

        return outputText9;

    }

    public void setOutputText9(HtmlOutputText hot) {

        this.outputText9 = hot;

    }
    private HtmlInputTextarea maintainanceTextField = new HtmlInputTextarea();

    public HtmlInputTextarea getMaintainanceTextField() {

        return maintainanceTextField;

    }

    public void setMaintainanceTextField(HtmlInputTextarea hit) {

        this.maintainanceTextField = hit;

    }
    private HtmlOutputText outputText10 = new HtmlOutputText();

    public HtmlOutputText getOutputText10() {

        return outputText10;

    }

    public void setOutputText10(HtmlOutputText hot) {

        this.outputText10 = hot;

    }
    private HtmlInputTextarea experienceTextField = new HtmlInputTextarea();

    public HtmlInputTextarea getExperienceTextField() {

        return experienceTextField;

    }

    public void setExperienceTextField(HtmlInputTextarea hit) {

        this.experienceTextField = hit;

    }
    private HtmlOutputText outputText11 = new HtmlOutputText();

    public HtmlOutputText getOutputText11() {

        return outputText11;

    }

    public void setOutputText11(HtmlOutputText hot) {

        this.outputText11 = hot;

    }
    private HtmlInputText contactTextField = new HtmlInputText();

    public HtmlInputText getContactTextField() {

        return contactTextField;

    }

    public void setContactTextField(HtmlInputText hit) {

        this.contactTextField = hit;

    }
    private HtmlOutputText outputText12 = new HtmlOutputText();

    public HtmlOutputText getOutputText12() {

        return outputText12;

    }

    public void setOutputText12(HtmlOutputText hot) {

        this.outputText12 = hot;

    }
    private HtmlOutputText outputText13 = new HtmlOutputText();

    public HtmlOutputText getOutputText13() {

        return outputText13;

    }

    public void setOutputText13(HtmlOutputText hot) {

        this.outputText13 = hot;

    }
    private HtmlCommandButton saveButton = new HtmlCommandButton();

    public HtmlCommandButton getSaveButton() {

        return saveButton;

    }

    public void setSaveButton(HtmlCommandButton hcb) {

        this.saveButton = hcb;

    }
    private HtmlCommandButton clearButton = new HtmlCommandButton();

    public HtmlCommandButton getClearButton() {

        return clearButton;

    }

    public void setClearButton(HtmlCommandButton hcb) {

        this.clearButton = hcb;

    }
    private HtmlOutputText outputText1 = new HtmlOutputText();

    public HtmlOutputText getOutputText1() {

        return outputText1;

    }

    public void setOutputText1(HtmlOutputText hot) {

        this.outputText1 = hot;

    }
    private HtmlSelectOneMenu locationDropDown = new HtmlSelectOneMenu();

    public HtmlSelectOneMenu getLocationDropDown() {

        return locationDropDown;

    }

    public void setLocationDropDown(HtmlSelectOneMenu hsom) {

        this.locationDropDown = hsom;

    }
    private UISelectItems dropdown2SelectItems = new UISelectItems();

    public UISelectItems getDropdown2SelectItems() {

        return dropdown2SelectItems;

    }

    public void setDropdown2SelectItems(UISelectItems uisi) {

        this.dropdown2SelectItems = uisi;

    }
    private HtmlInputTextarea commentTextFeild = new HtmlInputTextarea();

    public HtmlInputTextarea getCommentTextFeild() {

        return commentTextFeild;

    }

    public void setCommentTextFeild(HtmlInputTextarea hit) {

        this.commentTextFeild = hit;

    }
    private HtmlCommandLink linkAction1 = new HtmlCommandLink();

    public HtmlCommandLink getLinkAction1() {

        return linkAction1;

    }

    public void setLinkAction1(HtmlCommandLink hcl) {

        this.linkAction1 = hcl;

    }
    private HtmlOutputText linkAction1Text = new HtmlOutputText();

    public HtmlOutputText getLinkAction1Text() {

        return linkAction1Text;

    }

    public void setLinkAction1Text(HtmlOutputText hot) {

        this.linkAction1Text = hot;

    }
    private HtmlCommandLink linkAction2 = new HtmlCommandLink();

    public HtmlCommandLink getLinkAction2() {

        return linkAction2;

    }

    public void setLinkAction2(HtmlCommandLink hcl) {

        this.linkAction2 = hcl;

    }
    private HtmlOutputText linkAction1Text1 = new HtmlOutputText();

    public HtmlOutputText getLinkAction1Text1() {

        return linkAction1Text1;

    }

    public void setLinkAction1Text1(HtmlOutputText hot) {

        this.linkAction1Text1 = hot;

    }
    private HtmlCommandLink selectAnalyserLink = new HtmlCommandLink();

    public HtmlCommandLink getSelectAnalyserLink() {

        return selectAnalyserLink;

    }

    public void setSelectAnalyserLink(HtmlCommandLink hcl) {

        this.selectAnalyserLink = hcl;

    }
    private HtmlOutputText linkAction3Text = new HtmlOutputText();

    public HtmlOutputText getLinkAction3Text() {

        return linkAction3Text;

    }

    public void setLinkAction3Text(HtmlOutputText hot) {

        this.linkAction3Text = hot;

    }
    private HtmlOutputText outputText14 = new HtmlOutputText();

    public HtmlOutputText getOutputText14() {

        return outputText14;

    }

    public void setOutputText14(HtmlOutputText hot) {

        this.outputText14 = hot;

    }
    private HtmlInputText installationTextField = new HtmlInputText();

    public HtmlInputText getInstallationTextField() {

        return installationTextField;

    }

    public void setInstallationTextField(HtmlInputText hit) {

        this.installationTextField = hit;

    }
    private HtmlOutputText outputText31 = new HtmlOutputText();

    public HtmlOutputText getOutputText31() {

        return outputText31;

    }

    public void setOutputText31(HtmlOutputText hot) {

        this.outputText31 = hot;

    }
    private HtmlCommandLink linkAction3 = new HtmlCommandLink();

    public HtmlCommandLink getLinkAction3() {

        return linkAction3;

    }

    public void setLinkAction3(HtmlCommandLink hcl) {

        this.linkAction3 = hcl;

    }
    private HtmlOutputText linkAction1Text2 = new HtmlOutputText();

    public HtmlOutputText getLinkAction1Text2() {

        return linkAction1Text2;

    }

    public void setLinkAction1Text2(HtmlOutputText hot) {

        this.linkAction1Text2 = hot;

    }
    private HtmlSelectOneMenu analyserTypeDropDown = new HtmlSelectOneMenu();

    public HtmlSelectOneMenu getAnalyserTypeDropDown() {

        return analyserTypeDropDown;

    }

    public void setAnalyserTypeDropDown(HtmlSelectOneMenu hsom) {

        this.analyserTypeDropDown = hsom;

    }
    private UISelectItems dropdown2SelectItems1 = new UISelectItems();

    public UISelectItems getDropdown2SelectItems1() {

        return dropdown2SelectItems1;

    }

    public void setDropdown2SelectItems1(UISelectItems uisi) {

        this.dropdown2SelectItems1 = uisi;

    }
    private CachedRowSetDataProvider analyserlocationviewDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getAnalyserlocationviewDataProvider() {

        return analyserlocationviewDataProvider;

    }

    public void setAnalyserlocationviewDataProvider(
            CachedRowSetDataProvider crsdp) {

        this.analyserlocationviewDataProvider = crsdp;

    }
    private CachedRowSetDataProvider analysertypeviewDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getAnalysertypeviewDataProvider() {

        return analysertypeviewDataProvider;

    }

    public void setAnalysertypeviewDataProvider(CachedRowSetDataProvider crsdp) {

        this.analysertypeviewDataProvider = crsdp;

    }
    private CachedRowSetDataProvider addAnalysersDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getAddAnalysersDataProvider() {
        return addAnalysersDataProvider;
    }

    public void setAddAnalysersDataProvider(CachedRowSetDataProvider crsdp) {
        this.addAnalysersDataProvider = crsdp;
    }

    // </editor-fold>
    public AddAnalyser() {

        // <editor-fold defaultstate="collapsed" desc="Creator-managed Component
        // Initialization">
        analyserlocationviewDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.analyserlocationviewRowSet}"));

        analysertypeviewDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.analysertypeviewRowSet}"));
        addAnalysersDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.addAnalysersRowSet}"));

        try {

            // analysersRowSet.setCommand("SELECT * FROM ANALYSERS WHERE
            // ANALYSERS.ID=?");

            analyserlocationviewDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.analyserlocationviewRowSet}"));

            analysertypeviewDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.analysertypeviewRowSet}"));
            addAnalysersDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.addAnalysersRowSet}"));

        } catch (Exception e) {

            log("AddAnalyser Initialization Failure", e);

            throw e instanceof javax.faces.FacesException ? (FacesException) e
                    : new FacesException(e);

        }

        // </editor-fold>

        // Additional user provided initialization code

        try {
            analyserlocationviewDataProvider.refresh();
            analysertypeviewDataProvider.refresh();

            addAnalysersDataProvider.getCachedRowSet().setInt(1, getGasQuality$GasQualitySessionBean().getAnalyserID().intValue());

            addAnalysersDataProvider.getCachedRowSet().execute();

            if (this.getGasQuality$GasQualitySessionBean().getAnalyserID().intValue() == 0) {

                addAnalysersDataProvider.cursorLast();
                RowKey rowKey = addAnalysersDataProvider.appendRow();

                Integer analID = nextAnalyserID();
                System.out.println("ID analyser " + analID);
                getGasQuality$GasQualitySessionBean().setAnalyserID(analID);
                addAnalysersDataProvider.setValue("ANALYSERS.ID", rowKey, Integer.toString(analID.intValue()));
                addAnalysersDataProvider.commitChanges();
                addAnalysersDataProvider.refresh();
                addAnalysersDataProvider.getCachedRowSet().setInt(1, getGasQuality$GasQualitySessionBean().getAnalyserID().intValue());
                addAnalysersDataProvider.getCachedRowSet().execute();
            }
        } catch (Exception e) {

            log("AddAnalyser Initialization Failure", e);

            throw e instanceof javax.faces.FacesException ? (FacesException) e
                    : new FacesException(e);

        }

        analyserTypeDropDown.setValue(getGasQuality$GasQualitySessionBean().getType());

        locationDropDown.setValue(getGasQuality$GasQualitySessionBean().getLoaction());
        addAnalysersDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.addAnalysersRowSet}"));
        analysertypeviewDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.analysertypesRowSet}"));
        analyserlocationviewDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.analyserlocationviewRowSet}"));
        addAnalysersDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.addAnalysersRowSet}"));
        addAnalysersDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.addAnalysersRowSet}"));
        analysertypeviewDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.analysertypeviewRowSet}"));
        analyserlocationviewDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.analyserlocationviewRowSet}"));
        addAnalysersDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.addAnalysersRowSet}"));
    //  addAnalysersDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.addAnalysersRowSet}"));
    //  analysertypeviewDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.analysertypesviewRowSet}"));
    //  analyserlocationviewDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.analyserlocationviewRowSet}"));

    // onlineDropDown.setValue(getGasQuality$GasQualitySessionBean().getOnlineOffline());

    }

    /**
     * Bean cleanup.
     */
    protected void afterRenderResponse() {
        addAnalysersDataProvider.close();

        analysertypeviewDataProvider.close();

        analyserlocationviewDataProvider.close();

    }

    protected neqsimserver2.ApplicationBean1 getApplicationBean1() {

        return (neqsimserver2.ApplicationBean1) getBean("ApplicationBean1");

    }

    protected neqsimserver2.Thermo.ThermoSessionBean getThermo$ThermoSessionBean() {

        return (neqsimserver2.Thermo.ThermoSessionBean) getBean("Thermo$ThermoSessionBean");

    }

    protected neqsimserver2.SessionBean1 getSessionBean1() {

        return (neqsimserver2.SessionBean1) getBean("SessionBean1");

    }

    protected neqsimserver2.GasQuality.GasQualitySessionBean getGasQuality$GasQualitySessionBean() {

        return (neqsimserver2.GasQuality.GasQualitySessionBean) getBean("GasQuality$GasQualitySessionBean");

    }

    /**
     * Bean cleanup.
     */
    protected void afterRenderResponse(String online, String offline) {


    }

    public void dropdown2_processValueChange(ValueChangeEvent vce) {

    // TODO Replace with your code

    }

    public void dropdown1_processValueChange(ValueChangeEvent vce) {

    // TODO Replace with your code

    }

    public String saveButton_action() {

        // TODO Replace with your code

        try {
            RowKey rowKey = addAnalysersDataProvider.getCursorRow();
            addAnalysersDataProvider.setValue("ANALYSERS.INSTRUMENTTYPE", rowKey, analyserTypeDropDown.getValue().toString());
            addAnalysersDataProvider.setValue("ANALYSERS.STED", rowKey, locationDropDown.getValue().toString());

            addAnalysersDataProvider.commitChanges();
            addAnalysersDataProvider.getCachedRowSet().commit();

        // System.out.println("value " +
        // onlineDropDown.getValue().toString());

        } catch (Exception e) {

            log("page AddAnalyser save exception " + e);

            error("exceptiuon saving analyser: " + e);

            e.printStackTrace();

        }

        return "AddAnalyserToAnalyseSelect";

    }

    public void init() {
        // Perform initializations inherited from our superclass
        analyserlocationviewDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.analyserlocationviewRowSet}"));

        analysertypeviewDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.analysertypeviewRowSet}"));
        addAnalysersDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.addAnalysersRowSet}"));

        super.init();
    // Perform application initialization that must complete
    // *before* managed components are initialized
    // TODO - add your own initialiation code here

    // <editor-fold defaultstate="collapsed" desc="Creator-managed Component Initialization">
    // Initialize automatically managed components
    // *Note* - this logic should NOT be modified
//        try {
//            _init();
//        } catch (Exception e) {
//            log("testPAge Initialization Failure", e);
//            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
//        }
//        // </editor-fold>
//        // Perform application initialization that must complete
//        // *after* managed components are initialized
//        // TODO - add your own initialization code here
//        try{
//            addAnalysersDataProvider.getCachedRowSet().setObject(1,getGasQuality$GasQualitySessionBean().getAnalyserID());
//            addAnalysersDataProvider.refresh();
//        } catch(Exception e){
//            e.printStackTrace();
//        }
//
    }

    public Integer nextAnalyserID() throws java.sql.SQLException {

        com.sun.rowset.JdbcRowSetImpl pkRowSet = new com.sun.rowset.JdbcRowSetImpl();

        try {

            pkRowSet.setDataSourceName("java:comp/env/jdbc/NeqsimDataSource");

            pkRowSet.setCommand("SELECT MAX(ANALYSERS.ID)+1 FROM ANALYSERS");

            pkRowSet.execute();

            pkRowSet.next();

            return new Integer(pkRowSet.getInt(1));

        } catch (Exception e) {

            log("Addanalyser new ID exception");

            error("Addanalyser new ID exception: " + e);

        } finally {

            pkRowSet.close();

        }

        return null;

    }

    public String clearButton_action() {

        // TODO Replace with your code

        return "AddAnalyserToAnalyseSelect";

    }

    public void purposeTextArea_processValueChange(ValueChangeEvent vce) {

    // TODO Replace with your code

    }

    public void instrumentNameTextField_processValueChange(ValueChangeEvent vce) {

    // TODO Replace with your code

    }

    public String linkAction1_action() {

        // analyserTypeDropDown.getChildren().add("test");

        // analyserTypeDropDown.setValue("test");

        return "ToAddAnalyserLocationType";

    }

    public String selectAnalyserLink_action() {

        // TODO Replace with your code

        return "AddAnalyserToAnalyseSelect";

    }

    public String linkAction3_action() {

        // TODO Replace with your code

        return "AddAnalyserToAnalyseSelect";

    }

    public void analyserTypeDropDown2_processValueChange(ValueChangeEvent vce) {

    // TODO Replace with your code

    }
}
