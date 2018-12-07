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
import javax.faces.convert.DoubleConverter;
import javax.faces.convert.IntegerConverter;
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
public class GasNetworkPipeFieldAnalysis extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        cachedRowSetDataProvider1.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.pipePlantDBRowSet}"));
        cachedRowSetDataProvider2.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.pipePlantSumDBRowSet}"));
        fieldproductiondbDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.fieldproductiondbRowSet}"));
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
    private TableRowGroup tableRowGroup1 = new TableRowGroup();

    public TableRowGroup getTableRowGroup1() {
        return tableRowGroup1;
    }

    public void setTableRowGroup1(TableRowGroup trg) {
        this.tableRowGroup1 = trg;
    }
    private IntegerConverter integerConverter1 = new IntegerConverter();

    public IntegerConverter getIntegerConverter1() {
        return integerConverter1;
    }

    public void setIntegerConverter1(IntegerConverter ic) {
        this.integerConverter1 = ic;
    }
    private DoubleConverter doubleConverter1 = new DoubleConverter();

    public DoubleConverter getDoubleConverter1() {
        return doubleConverter1;
    }

    public void setDoubleConverter1(DoubleConverter dc) {
        this.doubleConverter1 = dc;
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
    public GasNetworkPipeFieldAnalysis() {
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

        try {

            getSessionBean1().getPipePlantDBRowSet().setObject(1, Integer.toString(getSessionBean1().getActivePipePlantID()));
            cachedRowSetDataProvider1.refresh();

            getSessionBean1().getPipePlantSumDBRowSet().setObject(1, Integer.toString(getSessionBean1().getActivePipePlantID()));
            cachedRowSetDataProvider2.refresh();
        } catch (Exception e) {
            log("GasNetworkAnalysis Initialization Failure", e);
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
        cachedRowSetDataProvider1.close();
        cachedRowSetDataProvider2.close();
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

    public String openFluidButton_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.

        cachedRowSetDataProvider1.cursorFirst();
        int fluidid = 0;

        getThermo$ThermoSessionBean().createEmptySystem();

        do {
            fluidid = Integer.parseInt(cachedRowSetDataProvider1.getValue("FIELDPRODUCTIONDB.FLUIDID").toString());
            getThermo$ThermoSessionBean().addThermoSystem(fluidid);
        } while (cachedRowSetDataProvider1.cursorNext());

        return null;
    }

    public String button2_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.
        return null;
    }

    public String addDataButton_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.
        // Last Row in DB Rowset
        // Set the Rowset to the last row
        // TODO: Drag a table to page
        // Go to last row in the RowSet
        try {
            RowKey appendedRow = null;
            if (fieldproductiondbDataProvider.canAppendRow()) {
                appendedRow = fieldproductiondbDataProvider.appendRow();
            }
      //      fieldproductiondbDataProvider.setValue("FIELDID", appendedRow, Integer.parseInt(cachedRowSetDataProvider1.getValue("FIELDPRODUCTIONDB.FIELDID").toString()));
       //     fieldproductiondbDataProvider.setValue("YEAR", appendedRow, yearTextField.getValue().toString());
      //      fieldproductiondbDataProvider.setValue("Production", appendedRow, productionTextField.getValue().toString());
            fieldproductiondbDataProvider.commitChanges();
            fieldproductiondbDataProvider.refresh();
            cachedRowSetDataProvider1.refresh();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new FacesException(ex);
        }

        // URL for Rowset JavaDoc:
        // http://java.sun.com/j2se/1.4.2/docs/api/javax/sql/RowSet.html
        return null;
    }
}

