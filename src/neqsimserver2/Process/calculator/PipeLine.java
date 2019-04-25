/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package neqsimserver2.Process.calculator;

import com.sun.data.provider.RowKey;
import com.sun.data.provider.impl.CachedRowSetDataProvider;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.StaticText;
import com.sun.rave.web.ui.component.Table;
import com.sun.rave.web.ui.component.TableRowGroup;
import com.sun.rave.web.ui.component.TextField;
import javax.faces.FacesException;
import javax.faces.convert.DoubleConverter;
import neqsimserver2.SessionBean1;
import neqsimserver2.Thermo.ThermoSessionBean;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version PipeLine.java
 * @version Created on 13.jul.2009, 21:46:59
 * @author ESOL
 */
public class PipeLine extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        pipelineParameterRowSetDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.pipelineParameterRowSet}"));
        pipelineparametersDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.pipelineparametersRowSet}"));
    }
    private Table pipelineTable = new Table();

    public Table getPipelineTable() {
        return pipelineTable;
    }

    public void setPipelineTable(Table t) {
        this.pipelineTable = t;
    }
    private CachedRowSetDataProvider pipelineParameterRowSetDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getPipelineParameterRowSetDataProvider() {
        return pipelineParameterRowSetDataProvider;
    }

    public void setPipelineParameterRowSetDataProvider(CachedRowSetDataProvider crsdp) {
        this.pipelineParameterRowSetDataProvider = crsdp;
    }
    private TextField positionTextField = new TextField();

    public TextField getPositionTextField() {
        return positionTextField;
    }

    public void setPositionTextField(TextField tf) {
        this.positionTextField = tf;
    }
    private TextField heightTextField = new TextField();

    public TextField getHeightTextField() {
        return heightTextField;
    }

    public void setHeightTextField(TextField tf) {
        this.heightTextField = tf;
    }
    private TextField diameterTextField = new TextField();

    public TextField getDiameterTextField() {
        return diameterTextField;
    }

    public void setDiameterTextField(TextField tf) {
        this.diameterTextField = tf;
    }
    private TextField temperatureTextField = new TextField();

    public TextField getTemperatureTextField() {
        return temperatureTextField;
    }

    public void setTemperatureTextField(TextField tf) {
        this.temperatureTextField = tf;
    }
    private TextField pressureTextField1 = new TextField();

    public TextField getPressureTextField1() {
        return pressureTextField1;
    }

    public void setPressureTextField1(TextField tf) {
        this.pressureTextField1 = tf;
    }
    private DoubleConverter doubleConverter1 = new DoubleConverter();

    public DoubleConverter getDoubleConverter1() {
        return doubleConverter1;
    }

    public void setDoubleConverter1(DoubleConverter dc) {
        this.doubleConverter1 = dc;
    }
    private StaticText temperatureOutText = new StaticText();

    public StaticText getTemperatureOutText() {
        return temperatureOutText;
    }

    public void setTemperatureOutText(StaticText st) {
        this.temperatureOutText = st;
    }
    private StaticText pressureOutText = new StaticText();

    public StaticText getPressureOutText() {
        return pressureOutText;
    }

    public void setPressureOutText(StaticText st) {
        this.pressureOutText = st;
    }
    private TableRowGroup tableRowGroup1 = new TableRowGroup();

    public TableRowGroup getTableRowGroup1() {
        return tableRowGroup1;
    }

    public void setTableRowGroup1(TableRowGroup trg) {
        this.tableRowGroup1 = trg;
    }
    private TextField roughnessTextField = new TextField();

    public TextField getRoughnessTextField() {
        return roughnessTextField;
    }

    public void setRoughnessTextField(TextField tf) {
        this.roughnessTextField = tf;
    }
    private TextField outerTemperatureTextField = new TextField();

    public TextField getOuterTemperatureTextField() {
        return outerTemperatureTextField;
    }

    public void setOuterTemperatureTextField(TextField tf) {
        this.outerTemperatureTextField = tf;
    }
    private TextField wallHeatTransferCoeffTextField = new TextField();

    public TextField getWallHeatTransferCoeffTextField() {
        return wallHeatTransferCoeffTextField;
    }

    public void setWallHeatTransferCoeffTextField(TextField tf) {
        this.wallHeatTransferCoeffTextField = tf;
    }
    private TextField outerHeatTransferCoeffTextField = new TextField();

    public TextField getOuterHeatTransferCoeffTextField() {
        return outerHeatTransferCoeffTextField;
    }

    public void setOuterHeatTransferCoeffTextField(TextField tf) {
        this.outerHeatTransferCoeffTextField = tf;
    }
    private CachedRowSetDataProvider pipelineparametersDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getPipelineparametersDataProvider() {
        return pipelineparametersDataProvider;
    }

    public void setPipelineparametersDataProvider(CachedRowSetDataProvider crsdp) {
        this.pipelineparametersDataProvider = crsdp;
    }

    // </editor-fold>
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public PipeLine() {
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
            log("PipeLine Initialization Failure", e);
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
        pipelineParameterRowSetDataProvider.close();
        pipelineparametersDataProvider.close();
    }

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

    public String button2_action() {
        try {
            pipelineParameterRowSetDataProvider.cursorLast();
            System.out.println("3");
            RowKey rowKey = pipelineParameterRowSetDataProvider.appendRow();
            System.out.println("4");
            pipelineParameterRowSetDataProvider.setValue("POSITION", rowKey, positionTextField.getValue());
            pipelineParameterRowSetDataProvider.setValue("HEIGHT", rowKey, heightTextField.getValue());
            pipelineParameterRowSetDataProvider.setValue("DIAMETER", rowKey, diameterTextField.getValue());
            pipelineParameterRowSetDataProvider.setValue("HEATTRANSFCOEFF", rowKey, outerHeatTransferCoeffTextField.getValue());
            pipelineParameterRowSetDataProvider.setValue("WALLROUGHN", rowKey, roughnessTextField.getValue());
            pipelineParameterRowSetDataProvider.setValue("OUTTEMPERATURE", rowKey, outerTemperatureTextField.getValue());
             pipelineParameterRowSetDataProvider.setValue("WALLHEATTRANSFCOEFF", rowKey, wallHeatTransferCoeffTextField.getValue());
            pipelineParameterRowSetDataProvider.commitChanges();
            pipelineParameterRowSetDataProvider.refresh();

        } catch (Exception e) {
            error(e.getMessage());
            log(e.getMessage());
            e.printStackTrace();
        }
        return null;
    }

    public String button1_action() {
        int numberOfRows = 0;
        double[] positions = null, heights = null, diameters = null, wallRoughness = null, outerTemperature = null, outHeatTransferCoef = null, wallHeatTransferCoef = null;
        try {
            RowKey[] rowkeys = pipelineParameterRowSetDataProvider.getAllRows();
            numberOfRows = rowkeys.length;
            positions = new double[numberOfRows];
            heights = new double[numberOfRows];
            diameters = new double[numberOfRows];
            wallRoughness = new double[numberOfRows];
            outerTemperature = new double[numberOfRows];
            outHeatTransferCoef = new double[numberOfRows];
            wallHeatTransferCoef = new double[numberOfRows];
            for (int i = 0; i < numberOfRows; i++) {
                pipelineParameterRowSetDataProvider.setCursorRow(rowkeys[i]);
                positions[i] = Double.parseDouble(pipelineParameterRowSetDataProvider.getValue("POSITION").toString());
                heights[i] = Double.parseDouble(pipelineParameterRowSetDataProvider.getValue("HEIGHT").toString());
                diameters[i] = Double.parseDouble(pipelineParameterRowSetDataProvider.getValue("DIAMETER").toString());
                wallRoughness[i] = Double.parseDouble(pipelineParameterRowSetDataProvider.getValue("WALLROUGHN").toString()) / 1.0e6;
                outerTemperature[i] = Double.parseDouble(pipelineParameterRowSetDataProvider.getValue("OUTTEMPERATURE").toString()) + 273.15;
                outHeatTransferCoef[i] = Double.parseDouble(pipelineParameterRowSetDataProvider.getValue("HEATTRANSFCOEFF").toString());
                wallHeatTransferCoef[i] = Double.parseDouble(pipelineParameterRowSetDataProvider.getValue("WALLHEATTRANSFCOEFF").toString());

                System.out.println("positions " + positions[i] + "  " + numberOfRows);

            }
        } catch (Exception e) {
            error(e.getMessage());
            log(e.getMessage());
            e.printStackTrace();
        }


        getThermo$ThermoSessionBean().getThermoSystem().init(0);
        getThermo$ThermoSessionBean().getThermoSystem().init(1);
        getThermo$ThermoSessionBean().getThermoSystem().setTemperature((Double) temperatureTextField.getValue() + 273.15);
        getThermo$ThermoSessionBean().getThermoSystem().setPressure((Double) pressureTextField1.getValue());
        getThermo$ThermoSessionBean().getThermoSystem().initPhysicalProperties();
        neqsim.processSimulation.processEquipment.stream.Stream tempStream = new neqsim.processSimulation.processEquipment.stream.Stream(getThermo$ThermoSessionBean().getThermoSystem());
        neqsim.processSimulation.processEquipment.pipeline.OnePhasePipeLine pipeLine = new neqsim.processSimulation.processEquipment.pipeline.OnePhasePipeLine(tempStream);
        pipeLine.setNumberOfLegs(numberOfRows - 1);
        pipeLine.setPipeDiameters(diameters);
        pipeLine.setLegPositions(positions);
        pipeLine.setHeightProfile(heights);
        pipeLine.setPipeWallRoughness(wallRoughness);
        pipeLine.setOuterTemperatures(outerTemperature);
        pipeLine.setPipeOuterHeatTransferCoefficients(outHeatTransferCoef);
        pipeLine.setPipeWallHeatTransferCoefficients(wallHeatTransferCoef);
        tempStream.run();
        pipeLine.run();
        getThermo$ThermoSessionBean().setThermoSystem(pipeLine.getOutStream().getThermoSystem());
        getThermo$ThermoSessionBean().getThermoSystem().createTable(
                getThermo$ThermoSessionBean().getThermoSystem().getFluidName());

        getThermo$ThermoSessionBean().setDisplayData(true);

        getThermo$ThermoSessionBean().setDisplayGraph(false);
        //resultsTable.setRendered(true);
        temperatureOutText.setValue(Double.toString(getThermo$ThermoSessionBean().getThermoSystem().getTemperature()));
        pressureOutText.setValue(Double.toString(getThermo$ThermoSessionBean().getThermoSystem().getPressure()));


        return null;
    }

    public String button3_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.
        RowKey rowKey = tableRowGroup1.getRowKey();
//            pipelineParameterRowSetDataProvider.setCursorRow(rowKey);
        pipelineParameterRowSetDataProvider.removeRow(rowKey);
        pipelineParameterRowSetDataProvider.commitChanges();
        return null;
    }
}

