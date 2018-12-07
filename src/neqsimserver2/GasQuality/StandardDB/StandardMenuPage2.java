/*
 * StandardMenuPage2.java
 *
 * Created on 27.mai.2008, 10:51:38
 */
package neqsimserver2.GasQuality.StandardDB;

import com.sun.data.provider.RowKey;
import com.sun.data.provider.impl.CachedRowSetDataProvider;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Button;
import com.sun.rave.web.ui.component.DropDown;
import com.sun.rave.web.ui.component.TableColumn;
import com.sun.rave.web.ui.component.TableRowGroup;
import com.sun.rave.web.ui.model.SingleSelectOptionsList;
import javax.faces.FacesException;
import javax.faces.event.ValueChangeEvent;
import neqsimserver2.ApplicationBean1;
import neqsimserver2.GasQuality.GasQualitySessionBean;
import neqsimserver2.SessionBean1;
import neqsimserver2.Thermo.ThermoSessionBean;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @author ESOL
 */
public class StandardMenuPage2 extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        standardSubjectDropDownDefaultOptions.setOptions(new com.sun.rave.web.ui.model.Option[]{new com.sun.rave.web.ui.model.Option("1", "GC analysis"), new com.sun.rave.web.ui.model.Option("2", "Process sampling"), new com.sun.rave.web.ui.model.Option("3", "Hydrocarbon dew point analysis"), new com.sun.rave.web.ui.model.Option("4", "Water analysis"), new com.sun.rave.web.ui.model.Option("5", "Mercury analysis"), new com.sun.rave.web.ui.model.Option("6", "Sulphur analysis"), new com.sun.rave.web.ui.model.Option("7", "Combustion properties"), new com.sun.rave.web.ui.model.Option("8", "oxygen analysis"), new com.sun.rave.web.ui.model.Option("9", "Physical/thermodynamic properties"), new com.sun.rave.web.ui.model.Option("10", "other")});
        standardSubjectDropDownDefaultOptions.setSelectedValue("1");
        standardTypeDropDownDefaultOptions.setOptions(new com.sun.rave.web.ui.model.Option[]{new com.sun.rave.web.ui.model.Option("1", "ISO"), new com.sun.rave.web.ui.model.Option("5", "NORSOK"), new com.sun.rave.web.ui.model.Option("2", "ASTM"), new com.sun.rave.web.ui.model.Option("6", "StatoilHydro Guideline"), new com.sun.rave.web.ui.model.Option("7", "StatoilHydro Technical Requirement"), new com.sun.rave.web.ui.model.Option("8", "other")});
        standardTypeDropDownDefaultOptions.setSelectedValue("1");
        standardsDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.standardsRowSet}"));
    }
    private SingleSelectOptionsList standardSubjectDropDownDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getStandardSubjectDropDownDefaultOptions() {
        return standardSubjectDropDownDefaultOptions;
    }

    public void setStandardSubjectDropDownDefaultOptions(SingleSelectOptionsList ssol) {
        this.standardSubjectDropDownDefaultOptions = ssol;
    }
    private SingleSelectOptionsList standardTypeDropDownDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getStandardTypeDropDownDefaultOptions() {
        return standardTypeDropDownDefaultOptions;
    }

    public void setStandardTypeDropDownDefaultOptions(SingleSelectOptionsList ssol) {
        this.standardTypeDropDownDefaultOptions = ssol;
    }
    private CachedRowSetDataProvider standardsDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getStandardsDataProvider() {
        return standardsDataProvider;
    }

    public void setStandardsDataProvider(CachedRowSetDataProvider crsdp) {
        this.standardsDataProvider = crsdp;
    }
    private DropDown standardTypeDropDown = new DropDown();

    public DropDown getStandardTypeDropDown() {
        return standardTypeDropDown;
    }

    public void setStandardTypeDropDown(DropDown dd) {
        this.standardTypeDropDown = dd;
    }
    private DropDown standardSubjectDropDown = new DropDown();

    public DropDown getStandardSubjectDropDown() {
        return standardSubjectDropDown;
    }

    public void setStandardSubjectDropDown(DropDown dd) {
        this.standardSubjectDropDown = dd;
    }
    private Button button3 = new Button();

    public Button getButton3() {
        return button3;
    }

    public void setButton3(Button b) {
        this.button3 = b;
    }
    private TableRowGroup tableRowGroup1 = new TableRowGroup();

    public TableRowGroup getTableRowGroup1() {
        return tableRowGroup1;
    }

    public void setTableRowGroup1(TableRowGroup trg) {
        this.tableRowGroup1 = trg;
    }
    private TableColumn tableColumn4 = new TableColumn();

    public TableColumn getTableColumn4() {
        return tableColumn4;
    }

    public void setTableColumn4(TableColumn tc) {
        this.tableColumn4 = tc;
    }

    // </editor-fold>
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public StandardMenuPage2() {
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
            log("StandardMenuPage2 Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
        }

        try {
            standardsDataProvider.getCachedRowSet().setInt(1, new Integer(1));//standardSubjectDropDownDefaultOptions.getSelectedValue().toString()).intValue());

            standardsDataProvider.getCachedRowSet().setInt(2, new Integer(1));//standardTypeDropDownDefaultOptions.getSelectedValue().toString()).intValue());

            standardsDataProvider.getCachedRowSet().execute();
        } catch (Exception e) {
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
        standardsDataProvider.close();
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1) getBean("ApplicationBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected GasQualitySessionBean getGasQuality$GasQualitySessionBean() {
        return (GasQualitySessionBean) getBean("GasQuality$GasQualitySessionBean");
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
    protected ThermoSessionBean getThermo$ThermoSessionBean() {
        return (ThermoSessionBean) getBean("Thermo$ThermoSessionBean");
    }

    public void standardTypeDropDown_processValueChange(ValueChangeEvent event) {
        try {
            standardsDataProvider.getCachedRowSet().setInt(1, new Integer(standardSubjectDropDown.getValue().toString()).intValue());//standardSubjectDropDown.getSelectedValue().toString()).intValue());

            standardsDataProvider.getCachedRowSet().setInt(2, new Integer(standardTypeDropDown.getValue().toString()).intValue());
            standardsDataProvider.getCachedRowSet().execute();
            standardsDataProvider.refresh();
        //  log("selected value " +new Integer(standardSubjectDropDownDefaultOptions.getSelectedValue().toString()).intValue());
        } catch (Exception e) {
            throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
        }
    }

    public void standardSubjectDropDown_processValueChange(ValueChangeEvent event) {
        try {
            standardsDataProvider.getCachedRowSet().setInt(1, new Integer(standardSubjectDropDown.getValue().toString()).intValue());//standardSubjectDropDown.getSelectedValue().toString()).intValue());

            standardsDataProvider.getCachedRowSet().setInt(2, new Integer(standardTypeDropDown.getValue().toString()).intValue());
            standardsDataProvider.getCachedRowSet().execute();
            standardsDataProvider.refresh();
        } catch (Exception e) {
            throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
        }
    }

    public String hyperlink1_action() {
        // TODO: Replace with your code
        return "ToGasQualityAddStandard";
    }

    public String button3_action() {
        // TODO: Process the button click action. Return value is a navigation
        RowKey rowKey = tableRowGroup1.getRowKey();
        standardsDataProvider.setCursorRow(rowKey);
        getSessionBean1().setDocumentID(Integer.parseInt(standardsDataProvider.getValue("ID").toString()));

        System.out.println("has LINK " + standardsDataProvider.getValue("LINK").toString().isEmpty());
        if (standardsDataProvider.getValue("LINK").toString().isEmpty()) {
            return "DisplayDocument";
        }
        else return null;
    }

    public String button2_action() {
        // TODO: Process the button click action. Return value is a navigation
        try {

            RowKey rowKey = tableRowGroup1.getRowKey();
            standardsDataProvider.setCursorRow(rowKey);
            Integer key = new Integer(standardsDataProvider.getValue("ID").toString());//((Integer) rowData.getValue("FLUIDINFO.ID")).intValue();
            getApplicationBean1().executeSQLUpdate("DELETE FROM neqsimdatabase.documents WHERE documents.ID = " + key.toString());
            standardsDataProvider.refresh();
        } catch (Exception e) {
            log(e.toString());
        // case name where null will return to the same page.

        }
        return null;
    }

    public String hyperlink3_action() {
        // TODO: Replace with your code
        RowKey rowKey = tableRowGroup1.getRowKey();
        standardsDataProvider.setCursorRow(rowKey);
        if (standardsDataProvider.getValue("LINK").toString().isEmpty()) {
            return button3_action();
        }
        return null;
    }

    public void richTextarea1_processValueChange(ValueChangeEvent vce) {
    }
}

