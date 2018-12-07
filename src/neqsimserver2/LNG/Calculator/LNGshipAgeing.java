/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package neqsimserver2.LNG.Calculator;

import com.sun.data.provider.impl.CachedRowSetDataProvider;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Checkbox;
import com.sun.rave.web.ui.component.DropDown;
import com.sun.rave.web.ui.component.PanelGroup;
import com.sun.rave.web.ui.component.StaticText;
import com.sun.rave.web.ui.component.TextField;
import com.sun.rave.web.ui.model.SingleSelectOptionsList;
import javax.faces.FacesException;
import javax.faces.convert.DoubleConverter;
import javax.faces.convert.IntegerConverter;
import javax.faces.event.ValueChangeEvent;
import neqsimserver2.GasQuality.GasQualitySessionBean;
import neqsimserver2.SessionBean1;
import neqsimserver2.Thermo.ThermoSessionBean;
import neqsimserver2.ApplicationBean1;
import fluidMechanics.flowSystem.twoPhaseFlowSystem.shipSystem.*;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version LNGshipAgeing.java
 * @version Created on 16.mar.2009, 09:58:34
 * @author esol
 */
public class LNGshipAgeing extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        combustionTemperatureDropDownDefaultOptions.setOptions(new com.sun.rave.web.ui.model.Option[]{new com.sun.rave.web.ui.model.Option("0", "0"), new com.sun.rave.web.ui.model.Option("15", "15"), new com.sun.rave.web.ui.model.Option("20", "20"), new com.sun.rave.web.ui.model.Option("25", "25"),new com.sun.rave.web.ui.model.Option("15.55", "60F")});
        measurementTemperatureDropDownDefaultOptions.setOptions(new com.sun.rave.web.ui.model.Option[]{new com.sun.rave.web.ui.model.Option("0", "0"), new com.sun.rave.web.ui.model.Option("15", "15"), new com.sun.rave.web.ui.model.Option("20", "20"), new com.sun.rave.web.ui.model.Option("15.55", "60F")});
        measurementTemperatureDropDownDefaultOptions.setSelectedValue("15");
        combustionTemperatureDropDownDefaultOptions.setSelectedValue("25");
        lngShipDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.lngShipRowSet}"));
        timeDropDownDefaultOptions.setOptions(new com.sun.rave.web.ui.model.Option[]{new com.sun.rave.web.ui.model.Option("hours", "hours"), new com.sun.rave.web.ui.model.Option("days", "days")});
    }
    private DoubleConverter doubleConverter1 = new DoubleConverter();

    public DoubleConverter getDoubleConverter1() {
        return doubleConverter1;
    }

    public void setDoubleConverter1(DoubleConverter dc) {
        this.doubleConverter1 = dc;
    }
    private TextField pressureField = new TextField();

    public TextField getPressureField() {
        return pressureField;
    }

    public void setPressureField(TextField tf) {
        this.pressureField = tf;
    }
    private TextField shipFillingVolumeField = new TextField();

    public TextField getShipFillingVolumeField() {
        return shipFillingVolumeField;
    }

    public void setShipFillingVolumeField(TextField tf) {
        this.shipFillingVolumeField = tf;
    }
    private TextField boilOffRateField = new TextField();

    public TextField getBoilOffRateField() {
        return boilOffRateField;
    }

    public void setBoilOffRateField(TextField tf) {
        this.boilOffRateField = tf;
    }
    private TextField simulationTimeField = new TextField();

    public TextField getSimulationTimeField() {
        return simulationTimeField;
    }

    public void setSimulationTimeField(TextField tf) {
        this.simulationTimeField = tf;
    }
    private SingleSelectOptionsList combustionTemperatureDropDownDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getCombustionTemperatureDropDownDefaultOptions() {
        return combustionTemperatureDropDownDefaultOptions;
    }

    public void setCombustionTemperatureDropDownDefaultOptions(SingleSelectOptionsList ssol) {
        this.combustionTemperatureDropDownDefaultOptions = ssol;
    }
    private SingleSelectOptionsList measurementTemperatureDropDownDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getMeasurementTemperatureDropDownDefaultOptions() {
        return measurementTemperatureDropDownDefaultOptions;
    }

    public void setMeasurementTemperatureDropDownDefaultOptions(SingleSelectOptionsList ssol) {
        this.measurementTemperatureDropDownDefaultOptions = ssol;
    }
    private DropDown combustionTemperatureDropDown = new DropDown();

    public DropDown getCombustionTemperatureDropDown() {
        return combustionTemperatureDropDown;
    }

    public void setCombustionTemperatureDropDown(DropDown dd) {
        this.combustionTemperatureDropDown = dd;
    }
    private DropDown measurementTemperatureDropDown = new DropDown();

    public DropDown getMeasurementTemperatureDropDown() {
        return measurementTemperatureDropDown;
    }

    public void setMeasurementTemperatureDropDown(DropDown dd) {
        this.measurementTemperatureDropDown = dd;
    }
    private IntegerConverter integerConverter1 = new IntegerConverter();

    public IntegerConverter getIntegerConverter1() {
        return integerConverter1;
    }

    public void setIntegerConverter1(IntegerConverter ic) {
        this.integerConverter1 = ic;
    }
    private CachedRowSetDataProvider lngShipDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getLngShipDataProvider() {
        return lngShipDataProvider;
    }

    public void setLngShipDataProvider(CachedRowSetDataProvider crsdp) {
        this.lngShipDataProvider = crsdp;
    }
    private Checkbox backCalcuationCheckbox = new Checkbox();

    public Checkbox getBackCalcuationCheckbox() {
        return backCalcuationCheckbox;
    }

    public void setBackCalcuationCheckbox(Checkbox c) {
        this.backCalcuationCheckbox = c;
    }
    private Checkbox GERGEOSCheckbox = new Checkbox();

    public Checkbox getGERGEOSCheckbox() {
        return GERGEOSCheckbox;
    }

    public void setGERGEOSCheckbox(Checkbox c) {
        this.GERGEOSCheckbox = c;
    }
    private PanelGroup initialTemperatureGroupPanel = new PanelGroup();

    public PanelGroup getInitialTemperatureGroupPanel() {
        return initialTemperatureGroupPanel;
    }

    public void setInitialTemperatureGroupPanel(PanelGroup pg) {
        this.initialTemperatureGroupPanel = pg;
    }
    private TextField initialTemperatureField = new TextField();

    public TextField getInitialTemperatureField() {
        return initialTemperatureField;
    }

    public void setInitialTemperatureField(TextField tf) {
        this.initialTemperatureField = tf;
    }
    private SingleSelectOptionsList timeDropDownDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getTimeDropDownDefaultOptions() {
        return timeDropDownDefaultOptions;
    }

    public void setTimeDropDownDefaultOptions(SingleSelectOptionsList ssol) {
        this.timeDropDownDefaultOptions = ssol;
    }
    private DropDown timeDropDown = new DropDown();

    public DropDown getTimeDropDown() {
        return timeDropDown;
    }

    public void setTimeDropDown(DropDown dd) {
        this.timeDropDown = dd;
    }
    private Checkbox idealGasReferenceCheckbox = new Checkbox();

    public Checkbox getIdealGasReferenceCheckbox() {
        return idealGasReferenceCheckbox;
    }

    public void setIdealGasReferenceCheckbox(Checkbox c) {
        this.idealGasReferenceCheckbox = c;
    }
    private Checkbox ISO69862016Checkbox = new Checkbox();

    public Checkbox getISO69862016Checkbox() {
        return ISO69862016Checkbox;
    }

    public void setISO69862016Checkbox(Checkbox c) {
        this.ISO69862016Checkbox = c;
    }
    private DoubleConverter doubleConverter2 = new DoubleConverter();

    public DoubleConverter getDoubleConverter2() {
        return doubleConverter2;
    }

    public void setDoubleConverter2(DoubleConverter dc) {
        this.doubleConverter2 = dc;
    }

    // </editor-fold>
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public LNGshipAgeing() {
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
            log("LNGshipAgeing Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
        }

        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
        try {
            lngShipDataProvider.getCachedRowSet().setInt(1, getSessionBean1().getActiveFluidID());
            lngShipDataProvider.getCachedRowSet().execute();
            if (lngShipDataProvider.getRowCount() == 0) {
                getApplicationBean1().executeSQLUpdate("INSERT INTO LNGship (FLUIDREF) VALUES ('" + getSessionBean1().getActiveFluidID() + "')");
                lngShipDataProvider.getCachedRowSet().setInt(1, getSessionBean1().getActiveFluidID());
                lngShipDataProvider.getCachedRowSet().execute();
            }
        } catch (Exception e) {
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
        lngShipDataProvider.close();
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

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1) getBean("ApplicationBean1");
    }

    public String button1_action() {
        // TODO: Process the button click action. Return value is a navigation
        double timeFactor = 1.0;
        if (timeDropDown.getSelected().toString().equals("days")) {
            timeFactor = 24.0;
        }
//if()
        // case name where null will return to the same page.
        //fluidMechanics.flowSystem.twoPhaseFlowSystem.shipSystem.
        getThermo$ThermoSessionBean().getThermoSystem().setPressure((Double) pressureField.getValue());
        getThermo$ThermoSessionBean().getThermoSystem().setTemperature(110.0);
        if (GERGEOSCheckbox.isChecked()) {
            getThermo$ThermoSessionBean().setThermoSystem(getThermo$ThermoSessionBean().getThermoSystem().setModel("GERG2004-EOS"));
        }
        getThermo$ThermoSessionBean().setLNGship(new LNGship(getThermo$ThermoSessionBean().getThermoSystem(), (Double) shipFillingVolumeField.getValue(), (Double) boilOffRateField.getValue() / 100.0));
        getThermo$ThermoSessionBean().getLNGship().getStandardISO6976().setEnergyRefT((Double) combustionTemperatureDropDown.getValue());
        getThermo$ThermoSessionBean().getLNGship().getStandardISO6976().setVolRefT((Double) measurementTemperatureDropDown.getValue());
       
        if(ISO69862016Checkbox.isChecked()){
            getThermo$ThermoSessionBean().getLNGship().useStandardVersion("ISO6976", "2016");
        }
        if (idealGasReferenceCheckbox.isChecked()) {
            getThermo$ThermoSessionBean().getLNGship().getStandardISO6976().setReferenceState("ideal");
        }
        getThermo$ThermoSessionBean().getLNGship().setEndTime((Double) simulationTimeField.getValue() * timeFactor);
        if (initialTemperatureGroupPanel.isRendered()) {
            System.out.println("setting temperature......");
            getThermo$ThermoSessionBean().getLNGship().setInitialTemperature((Double.parseDouble(initialTemperatureField.getValue().toString()) + 273.15));
        }
        getThermo$ThermoSessionBean().getLNGship().createSystem();
        getThermo$ThermoSessionBean().getLNGship().init();
        if (backCalcuationCheckbox.isChecked()) {
            getThermo$ThermoSessionBean().getLNGship().setBackCalculate(true);
        }
        getThermo$ThermoSessionBean().getLNGship().solveSteadyState(0);
        getThermo$ThermoSessionBean().getLNGship().solveTransient(0);
        getThermo$ThermoSessionBean().getLNGship().getResults("temp");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 11; j++) {
                System.out.println(getThermo$ThermoSessionBean().getLNGship().getResultTable()[j][i]);
            }
        }
        try {
            // getSessionBean1().getLNGageingRowSet().setCommand("DELETE FROM LNGAGEINGTABLE");
            getApplicationBean1().executeSQLUpdate("DELETE FROM LNGAGEINGTABLE");

            //  getSessionBean1().getLNGageingRowSet().execute();
            for (int i = 1; i < getThermo$ThermoSessionBean().getLNGship().getResultTable().length; i++) {
                //getSessionBean1().getLNGageingRowSet().setCommand("INSERT INTO LNGAGEINGTABLE values ()");//'" + i + "', " + getThermo$ThermoSessionBean().getLNGship().getResultTable()[i][0] + "', " + getThermo$ThermoSessionBean().getLNGship().getResultTable()[i][1] + "', " + getThermo$ThermoSessionBean().getLNGship().getResultTable()[i][2] + "', " + getThermo$ThermoSessionBean().getLNGship().getResultTable()[i][3] + "')");
                getApplicationBean1().executeSQLUpdate("INSERT INTO LNGAGEINGTABLE values ('" + Integer.toString(i) + "', '" + getThermo$ThermoSessionBean().getLNGship().getResultTable()[i][0] + "', '" + getThermo$ThermoSessionBean().getLNGship().getResultTable()[i][1] + "', '" + getThermo$ThermoSessionBean().getLNGship().getResultTable()[i][2] + "', '" + getThermo$ThermoSessionBean().getLNGship().getResultTable()[i][3] + "', '" + getThermo$ThermoSessionBean().getLNGship().getResultTable()[i][4] + "', '" + getThermo$ThermoSessionBean().getLNGship().getResultTable()[i][5] + "', '" + getThermo$ThermoSessionBean().getLNGship().getResultTable()[i][6] + "', '" + getThermo$ThermoSessionBean().getLNGship().getResultTable()[i][7] + "', '" + getThermo$ThermoSessionBean().getLNGship().getResultTable()[i][8] + "', '" + getThermo$ThermoSessionBean().getLNGship().getResultTable()[i][9] + "', '" + getThermo$ThermoSessionBean().getLNGship().getResultTable()[i][10] + "', '" + getThermo$ThermoSessionBean().getLNGship().getResultTable()[i][11] + "', '" + getThermo$ThermoSessionBean().getLNGship().getResultTable()[i][12] + "', '" + getThermo$ThermoSessionBean().getLNGship().getResultTable()[i][13] + "', '" + getThermo$ThermoSessionBean().getLNGship().getResultTable()[i][14] + "', '" + getThermo$ThermoSessionBean().getLNGship().getResultTable()[i][15] + "', '" + getThermo$ThermoSessionBean().getLNGship().getResultTable()[i][16]+ "', '" + getThermo$ThermoSessionBean().getLNGship().getResultTable()[i][17] + "', '" + getThermo$ThermoSessionBean().getLNGship().getResultTable()[i][18]+ "', '" + getThermo$ThermoSessionBean().getLNGship().getResultTable()[i][19]+ "', '" + getThermo$ThermoSessionBean().getLNGship().getResultTable()[i][20]+ "', '" + getThermo$ThermoSessionBean().getLNGship().getResultTable()[i][21]+ "', '" + getThermo$ThermoSessionBean().getLNGship().getResultTable()[i][22]+ "', '" + getThermo$ThermoSessionBean().getLNGship().getResultTable()[i][23]+ "', '" + getThermo$ThermoSessionBean().getLNGship().getResultTable()[i][24]+ "', '" + getThermo$ThermoSessionBean().getLNGship().getResultTable()[i][25]+ "')");
                //    getSessionBean1().getLNGageingRowSet().execute();
                getApplicationBean1().executeSQLUpdate("UPDATE LNGship SET LNGship.VOLUME='" + shipFillingVolumeField.getValue().toString() + "', LNGship.BOR='" + boilOffRateField.getValue().toString() + "', LNGship.PRESSURE='" + pressureField.getValue().toString() + "', LNGship.TRANSTIME='" + simulationTimeField.getValue().toString() + "', LNGship.INITTEMPERATURE='" + initialTemperatureField.getValue().toString() + "' WHERE LNGship.FLUIDREF='" + getSessionBean1().getActiveFluidID() + "'");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
        getThermo$ThermoSessionBean().getThermoSystem().createTable(
                getThermo$ThermoSessionBean().getThermoSystem().getFluidName());
        getThermo$ThermoSessionBean().setDisplayData(true);
        getThermo$ThermoSessionBean().setDisplayGraph(false);
        //      dataTable1.setRendered(true);


        return "ToLNGshipAgeingResults";
    }

    public String imageHyperlink1_action() {
        //System.out.println("clicked..............");
        if (!initialTemperatureGroupPanel.isRendered()) {
            initialTemperatureGroupPanel.setRendered(true);
        } else {
            initialTemperatureGroupPanel.setRendered(false);
        }
        return null;
    }
}

