/*
 * TPflash.java
 *
 * Created on 6. juli 2004, 13:39
 * Copyright Even Solbraa
 */
package neqsimserver2.Thermo;

import com.sun.rave.web.ui.component.StaticText;
import javax.faces.*;

import com.sun.jsfcl.app.*;

import javax.faces.component.html.*;

import com.sun.jsfcl.data.*;

import javax.faces.component.*;

public class TPflash extends AbstractPageBean {

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
    private HtmlGraphicImage imageNeqSIm = new HtmlGraphicImage();

    public HtmlGraphicImage getImageNeqSIm() {

        return imageNeqSIm;

    }

    public void setImageNeqSIm(HtmlGraphicImage hgi) {

        this.imageNeqSIm = hgi;

    }
    private HtmlOutputText tpflashMenuText = new HtmlOutputText();

    public HtmlOutputText getTpflashMenuText() {

        return tpflashMenuText;

    }

    public void setTpflashMenuText(HtmlOutputText hot) {

        this.tpflashMenuText = hot;

    }

    // </editor-fold>
    public TPflash() {

        // <editor-fold defaultstate="collapsed" desc="Creator-managed Component
        // Initialization">

        try {
        } catch (Exception e) {

            log("TPflash Initialization Failure", e);

            throw e instanceof javax.faces.FacesException ? (FacesException) e
                    : new FacesException(e);

        }

        // </editor-fold>
       // Additional user provided initialization code
        getThermo$ThermoSessionBean().setActiveExperimentType("VLE");
        getThermo$ThermoSessionBean().setActiveWikiCategory("vapour liquid equilibrium");
    }

    protected neqsimserver2.GasQuality.GasQualitySessionBean getGasQuality$GasQualitySessionBean() {

        return (neqsimserver2.GasQuality.GasQualitySessionBean) getBean("GasQuality$GasQualitySessionBean");

    }

    protected neqsimserver2.Thermo.ThermoSessionBean getThermo$ThermoSessionBean() {

        return (neqsimserver2.Thermo.ThermoSessionBean) getBean("Thermo$ThermoSessionBean");

    }

    protected neqsimserver2.SessionBean1 getSessionBean1() {

        return (neqsimserver2.SessionBean1) getBean("SessionBean1");

    }

    protected neqsimserver2.ApplicationBean1 getApplicationBean1() {

        return (neqsimserver2.ApplicationBean1) getBean("ApplicationBean1");

    }

    /**
     * Bean cleanup.
     */
    protected void afterRenderResponse() {
    }

    public String subButt_action() {

        // User event code here...

        return null;

    }

    public String calculateButton_action() {

        return null;

    }

    public String thermoMenuLinkAction_action() {

        return "TPflashToThermoMenu";

    }

}
