/*
 * PipeFlowMenuPage.java
 *
 * Created on 6. juli 2004, 11:06
 * Copyright Even Solbraa
 */































































package neqsimserver2.PipeFlow;































































































































import javax.faces.*;































































import com.sun.jsfcl.app.*;































































import javax.faces.component.html.*;































































































































public class PipeFlowMenuPage extends AbstractPageBean {































































    // <editor-fold defaultstate="collapsed" desc="Creator-managed Component Definition">































































































































    private int __placeholder;































































































































    private HtmlForm form1 = new HtmlForm();































































































































    public HtmlForm getForm1() {































































        return form1;































































    }































































































































    public void setForm1(HtmlForm hf) {































































        this.form1 = hf;































































    }































































    // </editor-fold>































































    public PipeFlowMenuPage() {































































        // <editor-fold defaultstate="collapsed" desc="Creator-managed Component Initialization">































































        try {































































        } catch (Exception e) {































































            log("PipeFlowMenuPage Initialization Failure", e);































































            throw e instanceof javax.faces.FacesException ? (FacesException) e : new FacesException(e);































































        }































































        // </editor-fold>































































        // Additional user provided initialization code































































    }































































































































    protected neqsimserver2.GasQuality.GasQualitySessionBean getGasQuality$GasQualitySessionBean() {































































        return (neqsimserver2.GasQuality.GasQualitySessionBean)getBean("GasQuality$GasQualitySessionBean");































































    }































































































































    protected neqsimserver2.Thermo.ThermoSessionBean getThermo$ThermoSessionBean() {































































        return (neqsimserver2.Thermo.ThermoSessionBean)getBean("Thermo$ThermoSessionBean");































































    }































































































































    protected neqsimserver2.ApplicationBean1 getApplicationBean1() {































































        return (neqsimserver2.ApplicationBean1)getBean("ApplicationBean1");































































    }































































































































    protected neqsimserver2.SessionBean1 getSessionBean1() {































































        return (neqsimserver2.SessionBean1)getBean("SessionBean1");































































    }































































































































    /** 
     * Bean cleanup.
     */































































    protected void afterRenderResponse() {































































    }































































}































































