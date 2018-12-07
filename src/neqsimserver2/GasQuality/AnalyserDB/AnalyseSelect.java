/*
 * AnalyseSelect.java
 *
 * Created on 1. mars 2005, 10:16
 * Copyright ESOL
 */

package neqsimserver2.GasQuality.AnalyserDB;

import javax.faces.*;

import com.sun.jsfcl.app.*;
import javax.faces.component.html.*;

import javax.faces.component.*;

import com.sun.sql.rowset.*;

import javax.faces.event.*;

import com.sun.jsfcl.data.*;

import com.sun.data.provider.impl.CachedRowSetDataProvider;
import com.sun.data.provider.impl.TableRowDataProvider;

public class AnalyseSelect extends AbstractPageBean {
    
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
    
    private HtmlCommandButton typeButton = new HtmlCommandButton();
    
    public HtmlCommandButton getTypeButton() {
        
        return typeButton;
        
    }
    
    public void setTypeButton(HtmlCommandButton hcb) {
        
        this.typeButton = hcb;
        
    }
    
    private HtmlCommandButton addButton = new HtmlCommandButton();
    
    public HtmlCommandButton getAddButton() {
        
        return addButton;
        
    }
    
    public void setAddButton(HtmlCommandButton hcb) {
        
        this.addButton = hcb;
        
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
    
    private HtmlGraphicImage image1 = new HtmlGraphicImage();
    
    public HtmlGraphicImage getImage1() {
        
        return image1;
        
    }
    
    public void setImage1(HtmlGraphicImage hgi) {
        
        this.image1 = hgi;
        
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

    private HtmlSelectOneMenu locationDropdown = new HtmlSelectOneMenu();

    public HtmlSelectOneMenu getLocationDropdown() {
        return locationDropdown;
    }

    public void setLocationDropdown(HtmlSelectOneMenu hsom) {
        this.locationDropdown = hsom;
    }

    private DefaultSelectItemsArray dropdown1DefaultItems1 = new DefaultSelectItemsArray();

    public DefaultSelectItemsArray getDropdown1DefaultItems1() {
        return dropdown1DefaultItems1;
    }

    public void setDropdown1DefaultItems1(DefaultSelectItemsArray dsia) {
        this.dropdown1DefaultItems1 = dsia;
    }

    private UISelectItems dropdown1SelectItems = new UISelectItems();

    public UISelectItems getDropdown1SelectItems() {
        return dropdown1SelectItems;
    }

    public void setDropdown1SelectItems(UISelectItems uisi) {
        this.dropdown1SelectItems = uisi;
    }

    private HtmlSelectOneMenu typeDropdown = new HtmlSelectOneMenu();

    public HtmlSelectOneMenu getTypeDropdown() {
        return typeDropdown;
    }

    public void setTypeDropdown(HtmlSelectOneMenu hsom) {
        this.typeDropdown = hsom;
    }

    private DefaultSelectItemsArray dropdown1DefaultItems2 = new DefaultSelectItemsArray();

    public DefaultSelectItemsArray getDropdown1DefaultItems2() {
        return dropdown1DefaultItems2;
    }

    public void setDropdown1DefaultItems2(DefaultSelectItemsArray dsia) {
        this.dropdown1DefaultItems2 = dsia;
    }

    private UISelectItems dropdown1SelectItems1 = new UISelectItems();

    public UISelectItems getDropdown1SelectItems1() {
        return dropdown1SelectItems1;
    }

    public void setDropdown1SelectItems1(UISelectItems uisi) {
        this.dropdown1SelectItems1 = uisi;
    }

    private DefaultSelectItemsArray dropdown1DefaultItems = new DefaultSelectItemsArray();

    public DefaultSelectItemsArray getDropdown1DefaultItems() {
        return dropdown1DefaultItems;
    }

    public void setDropdown1DefaultItems(DefaultSelectItemsArray dsia) {
        this.dropdown1DefaultItems = dsia;
    }
    
    // </editor-fold>
    
    public AnalyseSelect() {
        
        // <editor-fold defaultstate="collapsed" desc="Creator-managed Component
        // Initialization">
        
        try {
            
            analyserlocationviewDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.analyserlocationviewRowSet}"));
            
            analysertypeviewDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.analysertypeviewRowSet}"));
            
        } catch (Exception e) {
            
            log("AnalyseSelect Initialization Failure", e);
            
            throw e instanceof javax.faces.FacesException ? (FacesException) e
                    : new FacesException(e);
            
        }
        
        // </editor-fold>
        
        // Additional user provided initialization code
        
    }
    
    protected neqsimserver2.GasQuality.GasQualitySessionBean getGasQuality$GasQualitySessionBean() {
        
        return (neqsimserver2.GasQuality.GasQualitySessionBean) getBean("GasQuality$GasQualitySessionBean");
        
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
    
    /**
     * Bean cleanup.
     */
    
    protected void afterRenderResponse() {
        
        analysertypeviewDataProvider.close();
        
        analyserlocationviewDataProvider.close();
        
    }
    
    public void locationDropDown_processValueChange(ValueChangeEvent vce) {
        
        // TODO Replace with your code
        
    }
    
    public void loactionDropDownList_processValueChange(ValueChangeEvent vce) {
        
        // TODO Replace with your code
        
    }
    
    public void typeDropDownList_processValueChange(ValueChangeEvent vce) {
        
        // TODO Replace with your code
        
    }
    
    public String submitButton_action() {
        System.out.println("hei from here...");
        // TODO Following code was replaced by static navigation
        
		if (true) {

			// TODO Replace with your code

			getGasQuality$GasQualitySessionBean().setType(typeDropdown.getValue().toString());

			getGasQuality$GasQualitySessionBean().setLoaction(locationDropdown.getValue().toString());

			return "ToAnalyserDB";

		}
        
        return "ToAnalyserDB";
        
    }
    
    public String addButton_action() {
        
        getGasQuality$GasQualitySessionBean().setAnalyserID(new Integer(0));
        
        getGasQuality$GasQualitySessionBean().setType(typeDropdown.getValue().toString());
        
        getGasQuality$GasQualitySessionBean().setLoaction(locationDropdown.getValue().toString());
        
        return "ToAddGasQualityAnalyser";
        
    }
    
    public String startMenuLinkAction_action() {
        
        // TODO Replace with your code
        
        return "ToStartMenu";
        
    }
    
    public String linkAction1_action() {
        
        // TODO Replace with your code
        
        return null;
        
    }
    


    public String button1_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.
        
        return "ToStartMenu";
    }
}
