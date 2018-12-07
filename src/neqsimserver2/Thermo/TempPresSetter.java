/*
 * TempPresSetter.java
 *
 * Created on 25. oktober 2004, 21:36
 * Copyright ESOL
 */
package neqsimserver2.Thermo;

import javax.faces.*;

import com.sun.jsfcl.app.*;

import javax.faces.component.html.*;

public class TempPresSetter extends AbstractPageBean {

    // <editor-fold defaultstate="collapsed" desc="Creator-managed Component
    // Definition">
    private int __placeholder;
    private HtmlOutputText temperatureLableText = new HtmlOutputText();

    public HtmlOutputText getTemperatureLableText() {

        return temperatureLableText;

    }

    public void setTemperatureLableText(HtmlOutputText hot) {

        this.temperatureLableText = hot;

    }
    private HtmlOutputText pressureLabelText = new HtmlOutputText();

    public HtmlOutputText getPressureLabelText() {

        return pressureLabelText;

    }

    public void setPressureLabelText(HtmlOutputText hot) {

        this.pressureLabelText = hot;

    }
    private HtmlInputText temperatureTextField = new HtmlInputText();

    public HtmlInputText getTemperatureTextField() {

        return temperatureTextField;

    }

    public void setTemperatureTextField(HtmlInputText hit) {

        this.temperatureTextField = hit;

    }
    private HtmlInputText pressureTextField = new HtmlInputText();

    public HtmlInputText getPressureTextField() {

        return pressureTextField;

    }

    public void setPressureTextField(HtmlInputText hit) {

        this.pressureTextField = hit;

    }
    private HtmlCommandButton okFlashButton = new HtmlCommandButton();

    public HtmlCommandButton getOkFlashButton() {

        return okFlashButton;

    }

    public void setOkFlashButton(HtmlCommandButton hcb) {

        this.okFlashButton = hcb;

    }

    // </editor-fold>
    public TempPresSetter() {

        // <editor-fold defaultstate="collapsed" desc="Creator-managed Component
        // Initialization">

        try {

        } catch (Exception e) {

            log("TempPresSetter Initialization Failure", e);

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

    }

    public String oKButonflash_action() {

        // User event code here...

        return null;

    }

    public String okFlashButton_action() {

        getThermo$ThermoSessionBean().getThermoSystem().setTemperature(
                273.15 + java.lang.Double.parseDouble(getTemperatureTextField().getValue().toString()));

        getThermo$ThermoSessionBean().getThermoSystem().setPressure(
                java.lang.Double.parseDouble(getPressureTextField().getValue().toString()));


        getThermo$ThermoSessionBean().getThermoSystem().setMultiPhaseCheck(true);

        getThermo$ThermoSessionBean().getThermoSystem().getInterphaseProperties().setInterfacialTensionModel(0);
        thermodynamicOperations.ThermodynamicOperations ops = new thermodynamicOperations.ThermodynamicOperations(
                getThermo$ThermoSessionBean().getThermoSystem());

        ops.TPflash();

        getThermo$ThermoSessionBean().getThermoSystem().createTable(
                getThermo$ThermoSessionBean().getThermoSystem().getFluidName());

        getThermo$ThermoSessionBean().setDisplayData(true);

        getThermo$ThermoSessionBean().setDisplayGraph(false);

        return "ToVeiwResults";

    }
}
