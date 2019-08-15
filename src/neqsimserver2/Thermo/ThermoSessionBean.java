/*
 * ThermoSessionBean.java
 *
 * Created on 17. oktober 2004, 20:43
 * Copyright ESOL
 */
package neqsimserver2.Thermo;

//import com.sun.jsfcl.app.AbstractSessionBean;
import com.sun.sql.rowset.CachedRowSetXImpl;
import javax.faces.FacesException;
import neqsimserver2.ApplicationBean1;
import neqsim.thermo.system.*;
import neqsim.fluidMechanics.flowSystem.twoPhaseFlowSystem.shipSystem.LNGship;
import com.sun.rave.web.ui.appbase.AbstractSessionBean;

public class ThermoSessionBean extends AbstractSessionBean {
    // <editor-fold defaultstate="collapsed" desc="Creator-managed Component Definition">

    private int __placeholder;
    private neqsim.thermo.system.SystemInterface thermoSystem = new neqsim.thermo.system.SystemSrkEos();
    private neqsim.standards.StandardInterface ISOstandard = new neqsim.standards.gasQuality.Standard_ISO6976(thermoSystem);
    private neqsim.standards.salesContract.BaseContract salesContract = new neqsim.standards.salesContract.BaseContract();
    private neqsim.thermodynamicOperations.ThermodynamicOperations thermodynamicOperation = new neqsim.thermodynamicOperations.ThermodynamicOperations(thermoSystem);
    boolean displayGraph = false;
    boolean displayData = true;
    private LNGship LNGship = null;
    private String activeExperimentType = "VLE";
    private String activeWikiCategory = "interfacial tension";

    public ThermoSessionBean() {
        // <editor-fold defaultstate="collapsed" desc="Creator-managed Component Initialization">
        try {
        } catch (Exception e) {
            log("ThermoSessionBean Initialization Failure", e);
            throw e instanceof javax.faces.FacesException ? (FacesException) e : new FacesException(e);
        }
        // </editor-fold>
        // Additional user provided initialization code
        neqsim.util.database.NeqSimDataBase.setDataBaseType("mySQL");
        thermoSystem = new neqsim.thermo.system.SystemSrkEos();
        setThermodynamicOperation(new neqsim.thermodynamicOperations.ThermodynamicOperations(thermoSystem));
        ISOstandard = new neqsim.standards.gasQuality.Standard_ISO6976(thermoSystem);
    }

    private void _init() throws Exception {
    }

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
            log("SessionBean1 Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
        }
    }

    public void createEmptySystem() {
        thermoSystem = new neqsim.thermo.system.SystemSrkEos();
    }

    public void addThermoSystem(int systemID) {
        try {
            CachedRowSetXImpl thermoSystemRowSet = new CachedRowSetXImpl();
            thermoSystemRowSet.setDataSourceName("java:comp/env/jdbc/NeqsimDataSource");

            thermoSystemRowSet.setCommand("SELECT ALL fluidinfo.`ID`, fluidinfo.`FIELD`, fluidinfo.`WELL`, fluidinfo.`TEST`, fluidinfo.`SAMPLE`, fluidinfo.`TEXT`, fluidinfo.`HISTORY`, fluidinfo.`METHANE`, fluidinfo.`ETHANE`, fluidinfo.`PROPANE`, fluidinfo.`WATER`, fluidinfo.`USERID`, userdb.`ID`, userdb.`USERNAME`, userdb.`PASSWORD`, userdb.`EMAIL`, userdb.`FORNAME`, userdb.`SURENAME`, fluidinfo.`CO2`, fluidinfo.`H2S`, fluidinfo.`NITROGEN`, fluidinfo.`IBUTANE`, fluidinfo.`NBUTANE`, fluidinfo.`PENTANE`, fluidinfo.`NHEXANE`, fluidinfo.`CYCPENTANE`, fluidinfo.`CYCHEXANE`, fluidinfo.`NHEPTANE`, fluidinfo.`NOCTANE`, fluidinfo.`NDECANE`, fluidinfo.`BENZENE`, fluidinfo.`TOLUENE`, fluidinfo.`MXYLENE`, fluidinfo.`PXYLENE`, fluidinfo.`TEG`, fluidinfo.`DEG`, fluidinfo.`MDEA`, fluidinfo.`PIPERAZINE`, fluidinfo.`ACETICACID`, fluidinfo.`PROPIONICACID`, fluidinfo.`NAPLUS`, fluidinfo.`FEPLUS`, fluidinfo.`CAPLUS`, fluidinfo.`MEG`, fluidinfo.`METHANOL`, fluidinfo.`OXYLENE`, fluidinfo.`NNONANE`, fluidinfo.`H3OPLUS`, fluidinfo.`OHMINUS`, fluidinfo.`CO3MINUS`, fluidinfo.`CLMINUS`, fluidinfo.`CPLUSDENSITY`, fluidinfo.`CPLUSMOLARMASS`, fluidinfo.`CPLUS`, fluidinfo.`C13DENSITY`, fluidinfo.`C13MOLARMASS`, fluidinfo.`C13`, fluidinfo.`C12DENSITY`, fluidinfo.`C12MOLARMASS`, fluidinfo.`C12`, fluidinfo.`C11DENSITY`, fluidinfo.`C11MOLARMASS`, fluidinfo.`C11`, fluidinfo.`C10DENSITY`, fluidinfo.`C10MOLARMASS`, fluidinfo.`C10`, fluidinfo.`C9DENSITY`, fluidinfo.`C9MOLARMASS`, fluidinfo.`C9`, fluidinfo.`C8DENSITY`, fluidinfo.`C8MOLARMASS`, fluidinfo.`C8`, fluidinfo.`C7DENSITY`, fluidinfo.`C7MOLARMASS`, fluidinfo.`C7`, fluidinfo.`C6DENSITY`, fluidinfo.`C6MOLARMASS`, fluidinfo.`C6`, fluidinfo.`SHARED`, fluidinfo.`C20DENSITY`, fluidinfo.`C19DENSITY`, fluidinfo.`HASPLUSFRACTION`, fluidinfo.`C18DENSITY`, fluidinfo.`C17DENSITY`, fluidinfo.`C16DENSITY`, fluidinfo.`C15DENSITY`, fluidinfo.`C14DENSITY`, fluidinfo.`C20MOLARMASS`, fluidinfo.`C19MOLARMASS`, fluidinfo.`C18MOLARMASS`, fluidinfo.`C17MOLARMASS`, fluidinfo.`C16MOLARMASS`, fluidinfo.`C15MOLARMASS`, fluidinfo.`C14MOLARMASS`, fluidinfo.`C20`, fluidinfo.`C19`, fluidinfo.`C18`, fluidinfo.`C17`, fluidinfo.`C16`, fluidinfo.`C15`, fluidinfo.`C14`, fluidinfo.`SO4MINUS`, fluidinfo.`iPENTANE`  FROM fluidinfo, userdb WHERE fluidinfo.`ID` = " + systemID);
            thermoSystemRowSet.setTableName("thermoSystemRowSet");
            thermoSystemRowSet.execute();
            while (thermoSystemRowSet.next()) {

                if (thermoSystemRowSet.getDouble("METHANE") > 1e-50) {
                    thermoSystem.addComponent("methane", thermoSystemRowSet.getDouble("METHANE"));
                }
                if (thermoSystemRowSet.getDouble("ETHANE") > 1e-50) {
                    thermoSystem.addComponent("ethane", thermoSystemRowSet.getDouble("ETHANE"));
                }
                if (thermoSystemRowSet.getDouble("PROPANE") > 1e-50) {
                    thermoSystem.addComponent("propane", thermoSystemRowSet.getDouble("PROPANE"));
                }
                if (thermoSystemRowSet.getDouble("NBUTANE") > 1e-50) {
                    thermoSystem.addComponent("n-butane", thermoSystemRowSet.getDouble("NBUTANE"));
                }
                if (thermoSystemRowSet.getDouble("IBUTANE") > 1e-50) {
                    thermoSystem.addComponent("i-butane", thermoSystemRowSet.getDouble("IBUTANE"));
                }
                if (thermoSystemRowSet.getDouble("CO2") > 1e-50) {
                    thermoSystem.addComponent("CO2", thermoSystemRowSet.getDouble("CO2"));
                }
                if (thermoSystemRowSet.getDouble("H2S") > 1e-50) {
                    thermoSystem.addComponent("H2S", thermoSystemRowSet.getDouble("H2S"));
                }
                if (thermoSystemRowSet.getDouble("NITROGEN") > 1e-50) {
                    thermoSystem.addComponent("nitrogen", thermoSystemRowSet.getDouble("NITROGEN"));
                }
                if (thermoSystemRowSet.getDouble("PENTANE") > 1e-50) {
                    thermoSystem.addComponent("n-pentane", thermoSystemRowSet.getDouble("PENTANE"));
                }
                if (thermoSystemRowSet.getDouble("NHEXANE") > 1e-50) {
                    thermoSystem.addComponent("n-hexane", thermoSystemRowSet.getDouble("NHEXANE"));
                }
                if (thermoSystemRowSet.getDouble("WATER") > 1e-50) {
                    thermoSystem.addComponent("water", thermoSystemRowSet.getDouble("WATER"));
                }
                //    System.out.println(thermoSystemRowSet.getDouble("METHANE"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        thermoSystem.createDatabase(true);
        thermoSystem.setMixingRule(2);
        thermoSystem.init(0);
        thermoSystem.init(3);
    }

    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1) getBean("ApplicationBean1");
    }

    /**
     * Bean cleanup.
     */
    protected void afterRenderResponse() {
    }

    /**
     * Getter for property thermoSystem.
     * @return Value of property thermoSystem.
     */
    public SystemInterface getThermoSystem() {
        return thermoSystem;
    }

    public void resetThermoSystem() {
        this.thermoSystem = new neqsim.thermo.system.SystemSrkEos();
    }

    /**
     * Setter for property thermoSystem.
     * @param thermoSystem New value of property thermoSystem.
     */
    public void setThermoSystem(SystemInterface thermoSystem) {
        this.thermoSystem = thermoSystem;
    }

    /**
     * Getter for property ISOstandard.
     * @return Value of property ISOstandard.
     */
    public neqsim.standards.StandardInterface getISOstandard() {
        return ISOstandard;
    }

    /**
     * Setter for property ISOstandard.
     * @param ISOstandard New value of property ISOstandard.
     */
    public void setISOstandard(neqsim.standards.StandardInterface ISOstandard) {
        this.ISOstandard = ISOstandard;
    }

    /**
     * Getter for property displayData.
     * @return Value of property displayData.
     */
    public boolean isDisplayData() {
        return displayData;
    }

    /**
     * Setter for property displayData.
     * @param displayData New value of property displayData.
     */
    public void setDisplayData(boolean displayData) {
        this.displayData = displayData;
    }

    /**
     * Getter for property displayGraph.
     * @return Value of property displayGraph.
     */
    public boolean isDisplayGraph() {
        return displayGraph;
    }

    /**
     * Setter for property displayGraph.
     * @param displayGraph New value of property displayGraph.
     */
    public void setDisplayGraph(boolean displayGraph) {
        this.displayGraph = displayGraph;
    }

    /**
     * Holds value of property resultTable.

     * 
    private String[][] resultTable;

    /**
     * Getter for property resultTable.
     * @return Value of property resultTable.
     */
    public String[][] getResultTable() {

        return thermoSystem.getResultTable();
    }

    public String[][] getSalesContractResultTable() {

        return salesContract.getResultTable();
    }

    public String[][] getLNGageingResultTable() {

        return LNGship.getResultTable();
    }

    /**
     * Getter for property thermodynamicOperation.
     * @return Value of property thermodynamicOperation.
     */
    public neqsim.thermodynamicOperations.ThermodynamicOperations getThermodynamicOperation() {

        return this.thermodynamicOperation;
    }

    /**
     * Setter for property thermodynamicOperation.
     * @param thermodynamicOperation New value of property thermodynamicOperation.
     */
    public void setThermodynamicOperation(neqsim.thermodynamicOperations.ThermodynamicOperations thermodynamicOperation) {

        this.thermodynamicOperation = thermodynamicOperation;
    }

    /**
     * @return the LNGship
     */
    public LNGship getLNGship() {
        return LNGship;
    }

    /**
     * @param LNGship the LNGship to set
     */
    public void setLNGship(LNGship LNGship) {
        this.LNGship = LNGship;
    }

    /**
     * @return the salesContract
     */
    public neqsim.standards.salesContract.BaseContract getSalesContract() {
        return salesContract;
    }

    /**
     * @param salesContract the salesContract to set
     */
    public void setSalesContract(neqsim.standards.salesContract.BaseContract salesContract) {
        this.salesContract = salesContract;
    }

    /**
     * <p>This method is called when the session containing it is about to be
     * passivated.  Typically, this occurs in a distributed servlet container
     * when the session is about to be transferred to a different
     * container instance, after which the <code>activate()</code> method
     * will be called to indicate that the transfer is complete.</p>
     *
     * <p>You may customize this method to release references to session data
     * or resources that can not be serialized with the session itself.</p>
     */
    public void passivate() {
    }

    /**
     * <p>This method is called when the session containing it was
     * reactivated.</p>
     *
     * <p>You may customize this method to reacquire references to session
     * data or resources that could not be serialized with the
     * session itself.</p>
     */
    public void activate() {
    }

    /**
     * <p>This method is called when this bean is removed from
     * session scope.  Typically, this occurs as a result of
     * the session timing out or being terminated by the application.</p>
     *
     * <p>You may customize this method to clean up resources allocated
     * during the execution of the <code>init()</code> method, or
     * at any later time during the lifetime of the application.</p>
     */
    public void destroy() {
    }

    /**
     * @return the activeExperimentType
     */
    public String getActiveExperimentType() {
        return activeExperimentType;
    }

    /**
     * @param activeExperimentType the activeExperimentType to set
     */
    public void setActiveExperimentType(String activeExperimentType) {
        this.activeExperimentType = activeExperimentType;
    }

    /**
     * @return the activeWikiCategory
     */
    public String getActiveWikiCategory() {
        return activeWikiCategory;
    }

    /**
     * @param activeWikiCategory the activeWikiCategory to set
     */
    public void setActiveWikiCategory(String activeWikiCategory) {
        this.activeWikiCategory = activeWikiCategory;
    }


}
