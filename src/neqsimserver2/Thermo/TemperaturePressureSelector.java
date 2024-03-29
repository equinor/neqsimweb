/*
 * TemperaturePressureSelector.java
 *
 * Created on 7. juli 2004, 23:26
 * Copyright Even Solbraa
 */































































package neqsimserver2.Thermo;































































































































import javax.faces.*;































































import com.sun.jsfcl.app.*;































































import javax.faces.component.html.*;































































import javax.faces.convert.*;































































import javax.faces.validator.*;































































import javax.faces.event.*;































































































































public class TemperaturePressureSelector extends AbstractPageBean {































































    // <editor-fold defaultstate="collapsed" desc="Creator-managed Component Definition">































































    private neqsim.thermo.system.SystemInterface thermoSystem = new  neqsim.thermo.system.SystemSrkEos(290.0, 3.0);































































    private neqsim.thermodynamicOperations.ThermodynamicOperations  thermoOps = new neqsim.thermodynamicOperations.ThermodynamicOperations(thermoSystem);































































    private int __placeholder;































































    // </editor-fold>































































    public TemperaturePressureSelector() {































































        // <editor-fold defaultstate="collapsed" desc="Creator-managed Component Initialization">































































        try {































































        } catch (Exception e) {































































            log("TemperaturePressureSelector Initialization Failure", e);































































            throw e instanceof javax.faces.FacesException ? (FacesException) e : new FacesException(e);































































        }































































        // </editor-fold>































































        // Additional user provided initialization code































































    }

    /** 
     * <p>Return a reference to the scoped data bean.</p>
     */
    protected neqsimserver2.GasQuality.AnalyserDB.AddAnalyser getGasQuality$AnalyserDB$AddAnalyser2() {
        return (neqsimserver2.GasQuality.AnalyserDB.AddAnalyser)getBean("GasQuality$AnalyserDB$AddAnalyser2");
    }































































































































    /** 
     * <p>Return a reference to the scoped data bean.</p>
     */































































    protected TempSelector getThermo$TempSelector() {































































        return (TempSelector)getBean("Thermo$TempSelector");































































    }































































































































































































    /** 
     * <p>Return a reference to the scoped data bean.</p>
     */































































    protected TempPresSelector getThermo$TempPresSelector() {































































        return (TempPresSelector)getBean("Thermo$TempPresSelector");































































    }































































































































































































    /** 
     * <p>Return a reference to the scoped data bean.</p>
     */































































    protected TPflash_temp getThermo$TPflash_temp() {































































        return (TPflash_temp)getBean("Thermo$TPflash_temp");































































    }































































































































































































    /** 
     * <p>Return a reference to the scoped data bean.</p>
     */































































    protected ComponentSelector_3 getThermo$ComponentSelector_3() {































































        return (ComponentSelector_3)getBean("Thermo$ComponentSelector_3");































































    }































































































































































































    /** 
     * <p>Return a reference to the scoped data bean.</p>
     */































































    protected ComponentSelector_Mod1 getThermo$ComponentSelector_Mod1() {































































        return (ComponentSelector_Mod1)getBean("Thermo$ComponentSelector_Mod1");































































    }































































































































    protected neqsimserver2.GasQuality.GasQualitySessionBean getGasQuality$GasQualitySessionBean() {































































        return (neqsimserver2.GasQuality.GasQualitySessionBean)getBean("GasQuality$GasQualitySessionBean");































































    }































































































































    protected neqsimserver2.ApplicationBean1 getApplicationBean1() {































































        return (neqsimserver2.ApplicationBean1)getBean("ApplicationBean1");































































    }































































































































    protected neqsimserver2.SessionBean1 getSessionBean1() {































































        return (neqsimserver2.SessionBean1)getBean("SessionBean1");































































    }































































































































    protected neqsimserver2.Thermo.ThermoSessionBean getThermo$ThermoSessionBean() {































































        return (neqsimserver2.Thermo.ThermoSessionBean)getBean("Thermo$ThermoSessionBean");































































    }































































































































    /** 
     * Bean cleanup.
     */































































    protected void afterRenderResponse() {































































    }































































































































//    public String tempPresButton_action() {































































//            getThermo$ThermoSessionBean().getThermoSystem().setTemperature(java.lang.Double.parseDouble(getTemperatureTextField().getValue().toString())+273.15);































































//            getThermo$ThermoSessionBean().getThermoSystem().setPressure(java.lang.Double.parseDouble(getPressureTextField().getValue().toString()));































































//            thermoOps = new thermodynamicOperations.ThermodynamicOperations(thermoSystem);































































//































































//            thermoSystem.setMultiPhaseCheck(true);































































//            thermoOps.TPflash();































































//             return null;//"ThermoMenuToViewResultsPage";































































//    }































































































































    public void pressureTextField_processValueChange(ValueChangeEvent vce) {































































        // User event code here...































































    }































































































































    public String testButton_action() {































































        // User event code here...































































        return null;































































    }































































}































































