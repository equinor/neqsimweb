/*
 * AddAnalyser.java
 *
 * Created on 5. mars 2005, 10:29
 * Copyright ESOL
 */
package neqsimserver2.Thermo.ThermoDAB;

import javax.faces.*;

import com.sun.jsfcl.app.*;

import javax.faces.component.html.*;

import com.sun.jsfcl.data.*;

import javax.faces.component.*;

import com.sun.sql.rowset.*;

import javax.faces.event.*;
import com.sun.data.provider.impl.CachedRowSetDataProvider;

public class AddMeasurement extends AbstractPageBean {

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
    private HtmlSelectOneMenu dropdown1 = new HtmlSelectOneMenu();

    public HtmlSelectOneMenu getDropdown1() {

        return dropdown1;

    }

    public void setDropdown1(HtmlSelectOneMenu hsom) {

        this.dropdown1 = hsom;

    }
    private DefaultSelectItemsArray dropdown1DefaultItems = new DefaultSelectItemsArray();

    public DefaultSelectItemsArray getDropdown1DefaultItems() {

        return dropdown1DefaultItems;

    }

    public void setDropdown1DefaultItems(DefaultSelectItemsArray dsia) {

        this.dropdown1DefaultItems = dsia;

    }
    private UISelectItems dropdown1SelectItems1 = new UISelectItems();

    public UISelectItems getDropdown1SelectItems1() {

        return dropdown1SelectItems1;

    }

    public void setDropdown1SelectItems1(UISelectItems uisi) {

        this.dropdown1SelectItems1 = uisi;

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
    private HtmlCommandLink linkAction4 = new HtmlCommandLink();

    public HtmlCommandLink getLinkAction4() {

        return linkAction4;

    }

    public void setLinkAction4(HtmlCommandLink hcl) {

        this.linkAction4 = hcl;

    }
    private HtmlOutputText linkAction1Text3 = new HtmlOutputText();

    public HtmlOutputText getLinkAction1Text3() {

        return linkAction1Text3;

    }

    public void setLinkAction1Text3(HtmlOutputText hot) {

        this.linkAction1Text3 = hot;

    }
    private HtmlOutputText outputText3 = new HtmlOutputText();

    public HtmlOutputText getOutputText3() {

        return outputText3;

    }

    public void setOutputText3(HtmlOutputText hot) {

        this.outputText3 = hot;

    }
    private HtmlDataTable dataTable1 = new HtmlDataTable();

    public HtmlDataTable getDataTable1() {

        return dataTable1;

    }

    public void setDataTable1(HtmlDataTable hdt) {

        this.dataTable1 = hdt;

    }
    private DefaultTableDataModel dataTable1Model = new DefaultTableDataModel();

    public DefaultTableDataModel getDataTable1Model() {

        return dataTable1Model;

    }

    public void setDataTable1Model(DefaultTableDataModel dtdm) {

        this.dataTable1Model = dtdm;

    }
    private UIColumn column1 = new UIColumn();

    public UIColumn getColumn1() {

        return column1;

    }

    public void setColumn1(UIColumn uic) {

        this.column1 = uic;

    }
    private HtmlOutputText outputText6 = new HtmlOutputText();

    public HtmlOutputText getOutputText6() {

        return outputText6;

    }

    public void setOutputText6(HtmlOutputText hot) {

        this.outputText6 = hot;

    }
    private UIColumn column2 = new UIColumn();

    public UIColumn getColumn2() {

        return column2;

    }

    public void setColumn2(UIColumn uic) {

        this.column2 = uic;

    }
    private HtmlOutputText outputText8 = new HtmlOutputText();

    public HtmlOutputText getOutputText8() {

        return outputText8;

    }

    public void setOutputText8(HtmlOutputText hot) {

        this.outputText8 = hot;

    }
    private UIColumn column3 = new UIColumn();

    public UIColumn getColumn3() {

        return column3;

    }

    public void setColumn3(UIColumn uic) {

        this.column3 = uic;

    }
    private HtmlOutputText outputText10 = new HtmlOutputText();

    public HtmlOutputText getOutputText10() {

        return outputText10;

    }

    public void setOutputText10(HtmlOutputText hot) {

        this.outputText10 = hot;

    }
    private HtmlCommandButton button1 = new HtmlCommandButton();

    public HtmlCommandButton getButton1() {

        return button1;

    }

    public void setButton1(HtmlCommandButton hcb) {

        this.button1 = hcb;

    }
    private HtmlInputText textField2 = new HtmlInputText();

    public HtmlInputText getTextField2() {

        return textField2;

    }

    public void setTextField2(HtmlInputText hit) {

        this.textField2 = hit;

    }
    private HtmlOutputText outputText11 = new HtmlOutputText();

    public HtmlOutputText getOutputText11() {

        return outputText11;

    }

    public void setOutputText11(HtmlOutputText hot) {

        this.outputText11 = hot;

    }
    private HtmlInputText textField3 = new HtmlInputText();

    public HtmlInputText getTextField3() {

        return textField3;

    }

    public void setTextField3(HtmlInputText hit) {

        this.textField3 = hit;

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
    private HtmlInputTextarea textArea1 = new HtmlInputTextarea();

    public HtmlInputTextarea getTextArea1() {

        return textArea1;

    }

    public void setTextArea1(HtmlInputTextarea hit) {

        this.textArea1 = hit;

    }
    private UIColumn column4 = new UIColumn();

    public UIColumn getColumn4() {

        return column4;

    }

    public void setColumn4(UIColumn uic) {

        this.column4 = uic;

    }
    private HtmlOutputText outputText15 = new HtmlOutputText();

    public HtmlOutputText getOutputText15() {

        return outputText15;

    }

    public void setOutputText15(HtmlOutputText hot) {

        this.outputText15 = hot;

    }
    private HtmlCommandButton button2 = new HtmlCommandButton();

    public HtmlCommandButton getButton2() {

        return button2;

    }

    public void setButton2(HtmlCommandButton hcb) {

        this.button2 = hcb;

    }
    private HtmlOutputText outputText14 = new HtmlOutputText();

    public HtmlOutputText getOutputText14() {

        return outputText14;

    }

    public void setOutputText14(HtmlOutputText hot) {

        this.outputText14 = hot;

    }
    private HtmlInputTextarea textArea2 = new HtmlInputTextarea();

    public HtmlInputTextarea getTextArea2() {

        return textArea2;

    }

    public void setTextArea2(HtmlInputTextarea hit) {

        this.textArea2 = hit;

    }
    private UIColumn column5 = new UIColumn();

    public UIColumn getColumn5() {

        return column5;

    }

    public void setColumn5(UIColumn uic) {

        this.column5 = uic;

    }
    private HtmlOutputText outputText17 = new HtmlOutputText();

    public HtmlOutputText getOutputText17() {

        return outputText17;

    }

    public void setOutputText17(HtmlOutputText hot) {

        this.outputText17 = hot;

    }
    private UIColumn column6 = new UIColumn();

    public UIColumn getColumn6() {

        return column6;

    }

    public void setColumn6(UIColumn uic) {

        this.column6 = uic;

    }
    private HtmlOutputText outputText19 = new HtmlOutputText();

    public HtmlOutputText getOutputText19() {

        return outputText19;

    }

    public void setOutputText19(HtmlOutputText hot) {

        this.outputText19 = hot;

    }
    private HtmlInputText textField1 = new HtmlInputText();

    public HtmlInputText getTextField1() {

        return textField1;

    }

    public void setTextField1(HtmlInputText hit) {

        this.textField1 = hit;

    }
    private HtmlInputText textField4 = new HtmlInputText();

    public HtmlInputText getTextField4() {

        return textField4;

    }

    public void setTextField4(HtmlInputText hit) {

        this.textField4 = hit;

    }
    private HtmlInputText textField5 = new HtmlInputText();

    public HtmlInputText getTextField5() {

        return textField5;

    }

    public void setTextField5(HtmlInputText hit) {

        this.textField5 = hit;

    }
    private HtmlInputText textField6 = new HtmlInputText();

    public HtmlInputText getTextField6() {

        return textField6;

    }

    public void setTextField6(HtmlInputText hit) {

        this.textField6 = hit;

    }
    private HtmlInputText textField7 = new HtmlInputText();

    public HtmlInputText getTextField7() {

        return textField7;

    }

    public void setTextField7(HtmlInputText hit) {

        this.textField7 = hit;

    }
    private UIColumn column7 = new UIColumn();

    public UIColumn getColumn7() {

        return column7;

    }

    public void setColumn7(UIColumn uic) {

        this.column7 = uic;

    }
    private HtmlCommandButton button3 = new HtmlCommandButton();

    public HtmlCommandButton getButton3() {

        return button3;

    }

    public void setButton3(HtmlCommandButton hcb) {

        this.button3 = hcb;

    }
    private HtmlOutputText outputText1 = new HtmlOutputText();

    public HtmlOutputText getOutputText1() {

        return outputText1;

    }

    public void setOutputText1(HtmlOutputText hot) {

        this.outputText1 = hot;

    }
    private HtmlSelectOneMenu typeDropDown = new HtmlSelectOneMenu();

    public HtmlSelectOneMenu getTypeDropDown() {

        return typeDropDown;

    }

    public void setTypeDropDown(HtmlSelectOneMenu hsom) {

        this.typeDropDown = hsom;

    }
    private DefaultSelectItemsArray dropdown2DefaultItems = new DefaultSelectItemsArray();

    public DefaultSelectItemsArray getDropdown2DefaultItems() {

        return dropdown2DefaultItems;

    }

    public void setDropdown2DefaultItems(DefaultSelectItemsArray dsia) {

        this.dropdown2DefaultItems = dsia;

    }
    private UISelectItems dropdown2SelectItems = new UISelectItems();

    public UISelectItems getDropdown2SelectItems() {

        return dropdown2SelectItems;

    }

    public void setDropdown2SelectItems(UISelectItems uisi) {

        this.dropdown2SelectItems = uisi;

    }
    private CachedRowSetDataProvider experimentaldatatypeDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getExperimentaldatatypeDataProvider() {
        return experimentaldatatypeDataProvider;
    }

    public void setExperimentaldatatypeDataProvider(CachedRowSetDataProvider crsdp) {
        this.experimentaldatatypeDataProvider = crsdp;
    }

    // </editor-fold>
    public AddMeasurement() {

        // <editor-fold defaultstate="collapsed" desc="Creator-managed Component
        // Initialization">

        try {
            experimentaldatatypeDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.experimentaldatatypeRowSet}"));

        } catch (Exception e) {

            log("AddMeasurement Initialization Failure", e);

            throw e instanceof javax.faces.FacesException ? (FacesException) e
                    : new FacesException(e);

        }

    // </editor-fold>

    // Additional user provided initialization code

    }

    /**
     * Bean cleanup.
     */
    protected void afterRenderResponse() {
        experimentaldatatypeDataProvider.close();

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

    public String linkAction1_action() {

        // TODO Replace with your code

        return null;

    }

    public String button1_action() {
        // TODO: Replace with your code

        return null;
    }
}
