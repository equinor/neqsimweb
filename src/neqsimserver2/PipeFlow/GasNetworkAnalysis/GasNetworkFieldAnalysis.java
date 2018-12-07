/*
 * GasNetworkAnalysis.java
 *
 * Created on 21.jul.2008, 14:51:19
 */
package neqsimserver2.PipeFlow.GasNetworkAnalysis;

import com.sun.data.provider.RowKey;
import com.sun.data.provider.impl.CachedRowSetDataProvider;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.TableRowGroup;
import com.sun.rave.web.ui.component.TextField;
import javax.faces.FacesException;
import neqsimserver2.ApplicationBean1;
import neqsimserver2.Thermo.ThermoSessionBean;
import neqsimserver2.SessionBean1;
import neqsimserver2.GasQuality.GasQualitySessionBean;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @author ESOL
 */
public class GasNetworkFieldAnalysis extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        cachedRowSetDataProvider1.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.fieldDBRowSet2}"));
        fluidinfoFullTableDataProvider2.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.fluidinfoFullTableRowSet2}"));
        fieldProductionDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.fieldproductionDBRowSet}"));
        fieldproductiondbDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.fieldproductiondbRowSet}"));
    }
    private CachedRowSetDataProvider cachedRowSetDataProvider1 = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getCachedRowSetDataProvider1() {
        return cachedRowSetDataProvider1;
    }

    public void setCachedRowSetDataProvider1(CachedRowSetDataProvider crsdp) {
        this.cachedRowSetDataProvider1 = crsdp;
    }
    private TableRowGroup tableRowGroup1 = new TableRowGroup();

    public TableRowGroup getTableRowGroup1() {
        return tableRowGroup1;
    }

    public void setTableRowGroup1(TableRowGroup trg) {
        this.tableRowGroup1 = trg;
    }
    private CachedRowSetDataProvider fluidinfoFullTableDataProvider2 = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getFluidinfoFullTableDataProvider2() {
        return fluidinfoFullTableDataProvider2;
    }

    public void setFluidinfoFullTableDataProvider2(CachedRowSetDataProvider crsdp) {
        this.fluidinfoFullTableDataProvider2 = crsdp;
    }
    private CachedRowSetDataProvider fieldProductionDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getFieldProductionDataProvider() {
        return fieldProductionDataProvider;
    }

    public void setFieldProductionDataProvider(CachedRowSetDataProvider crsdp) {
        this.fieldProductionDataProvider = crsdp;
    }
    private CachedRowSetDataProvider fieldproductiondbDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getFieldproductiondbDataProvider() {
        return fieldproductiondbDataProvider;
    }

    public void setFieldproductiondbDataProvider(CachedRowSetDataProvider crsdp) {
        this.fieldproductiondbDataProvider = crsdp;
    }
    private TextField yearTextField = new TextField();

    public TextField getYearTextField() {
        return yearTextField;
    }

    public void setYearTextField(TextField tf) {
        this.yearTextField = tf;
    }
    private TextField productionTextField = new TextField();

    public TextField getProductionTextField() {
        return productionTextField;
    }

    public void setProductionTextField(TextField tf) {
        this.productionTextField = tf;
    }

    // </editor-fold>
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public GasNetworkFieldAnalysis() {
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
            log("GasNetworkAnalysis Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
        }

        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
        try {

            getSessionBean1().getFieldDBRowSet2().setObject(1, Integer.toString(getSessionBean1().getActiveFieldID()));
            cachedRowSetDataProvider1.refresh();
        } catch (Exception e) {
            log("GasNetworkAnalysis Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
        }
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
        cachedRowSetDataProvider1.close();
        fluidinfoFullTableDataProvider2.close();
        fieldProductionDataProvider.close();
        fieldproductiondbDataProvider.close();
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

    public String button2_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.

        // get selected fluid 
        RowKey rowKey3 = tableRowGroup1.getRowKey();
        cachedRowSetDataProvider1.setCursorRow(rowKey3);
        int fluidid = Integer.parseInt(cachedRowSetDataProvider1.getValue("FIELDPRODUCTIONDB.FLUIDID").toString());
        int prodid = Integer.parseInt(cachedRowSetDataProvider1.getValue("FIELDPRODUCTIONDB.ID").toString());


        if (fluidid == 0) {
            try {
                System.out.println("1");
                fluidinfoFullTableDataProvider2.refresh();
                System.out.println("2");
                fluidinfoFullTableDataProvider2.cursorLast();
                System.out.println("3");
                RowKey rowKey = fluidinfoFullTableDataProvider2.appendRow();
                System.out.println("4");

                fluidinfoFullTableDataProvider2.setValue("FLUIDINFO.FIELD", rowKey, cachedRowSetDataProvider1.getValue("FIELDDB.NAME").toString());
                fluidinfoFullTableDataProvider2.setValue("FLUIDINFO.WELL", rowKey, "new well");
                fluidinfoFullTableDataProvider2.setValue("FLUIDINFO.USERID", rowKey, Integer.toString(getSessionBean1().getLoginBean().getUserID()));
                fluidinfoFullTableDataProvider2.setValue("FLUIDINFO.HISTORY", rowKey, ("production year " + cachedRowSetDataProvider1.getValue("FIELDPRODUCTIONDB.YEAR").toString()));

                fluidinfoFullTableDataProvider2.commitChanges();
                getSessionBean1().setActiveFluidID(((Integer) fluidinfoFullTableDataProvider2.getValue("FLUIDINFO.ID")).intValue() + 1);
                fluidid = getSessionBean1().getActiveFluidID();
                fluidinfoFullTableDataProvider2.refresh();
                //      System.out.println("FLuid_ID " + getSessionBean1().getActiveFluidID());
                //      cachesdRowSetDataProvider1.refresh();
                //  RowKey prodRowKey = getFieldProductionDataProvider().findFirst("FIELDPRODUCTIONDB.ID", new Integer(prodid));
                //  getFieldProductionDataProvider().setCursorRow(prodRowKey);

                getApplicationBean1().executeSQLUpdate("UPDATE neqsimdatabase.FIELDPRODUCTIONDB SET FLUIDID= " + fluidid + " WHERE ID= " + prodid);

                // getFieldProductionDataProvider().setValue("FIELDPRODUCTIONDB.FLUIDID", new Integer(getSessionBean1().getActiveFluidID()));
                // getFieldProductionDataProvider().commitChanges();
            } catch (Exception e) {
                error(e.getMessage());
                log(e.getMessage());
                e.printStackTrace();
            }
        }
        getSessionBean1().setActiveFluidID(fluidid);
        System.out.println("FLuid_ID " + getSessionBean1().getActiveFluidID());
        return "ToEditThermoFluidPage";
    }

    public String button3_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.
        try {
            RowKey appendedRow = null;
            if (fieldproductiondbDataProvider.canAppendRow()) {
                appendedRow = fieldproductiondbDataProvider.appendRow();
            }
            fieldproductiondbDataProvider.setValue("FIELDID", appendedRow, getSessionBean1().getActiveFieldID().toString());
            fieldproductiondbDataProvider.setValue("YEAR", appendedRow, yearTextField.getValue().toString());
            fieldproductiondbDataProvider.setValue("Production", appendedRow, productionTextField.getValue().toString());
              fieldproductiondbDataProvider.setValue("DELIVERYPOINTID", appendedRow, cachedRowSetDataProvider1.getValue("DELIVERYPOINTID").toString());

            fieldproductiondbDataProvider.commitChanges();
            fieldproductiondbDataProvider.refresh();
            getSessionBean1().getFieldDBRowSet2().setObject(1, Integer.toString(getSessionBean1().getActiveFieldID()));
            cachedRowSetDataProvider1.refresh();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new FacesException(ex);
        }
        return null;
    }

    public String addDataButton_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.
        return null;
    }

    public String button4_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.
        return null;
    }
}

