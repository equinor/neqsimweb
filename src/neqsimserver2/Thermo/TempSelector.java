/*
 * ComponentSelector.java
 *
 * Created on 7. juli 2004, 22:27
 * Copyright Even Solbraa
 */

package neqsimserver2.Thermo;

import javax.faces.*;

import com.sun.jsfcl.app.*;

import javax.faces.component.html.*;

import javax.faces.convert.*;

import javax.faces.validator.*;

import java.lang.*;

import javax.faces.component.*;

import javax.faces.context.*;

public class TempSelector extends AbstractPageBean {

	// <editor-fold defaultstate="collapsed" desc="Creator-managed Component
	// Definition">

	private thermo.system.SystemInterface thermoSystem = new thermo.system.SystemSrkEos(
			290.0, 3.0);

	private thermodynamicOperations.ThermodynamicOperations thermoOps = new thermodynamicOperations.ThermodynamicOperations(
			thermoSystem);

	private int __placeholder;

	private HtmlOutputText componentTopText = new HtmlOutputText();

	public HtmlOutputText getComponentTopText() {

		return componentTopText;

	}

	public void setComponentTopText(HtmlOutputText hot) {

		this.componentTopText = hot;

	}

	private HtmlOutputText methaneTextID = new HtmlOutputText();

	public HtmlOutputText getMethaneTextID() {

		return methaneTextID;

	}

	public void setMethaneTextID(HtmlOutputText hot) {

		this.methaneTextID = hot;

	}

	private HtmlOutputText ethaneTextID = new HtmlOutputText();

	public HtmlOutputText getEthaneTextID() {

		return ethaneTextID;

	}

	public void setEthaneTextID(HtmlOutputText hot) {

		this.ethaneTextID = hot;

	}

	private HtmlOutputText propaneTextID = new HtmlOutputText();

	public HtmlOutputText getPropaneTextID() {

		return propaneTextID;

	}

	public void setPropaneTextID(HtmlOutputText hot) {

		this.propaneTextID = hot;

	}

	private HtmlOutputText ibutaneTextID = new HtmlOutputText();

	public HtmlOutputText getIbutaneTextID() {

		return ibutaneTextID;

	}

	public void setIbutaneTextID(HtmlOutputText hot) {

		this.ibutaneTextID = hot;

	}

	private HtmlOutputText nbutaneTextID = new HtmlOutputText();

	public HtmlOutputText getNbutaneTextID() {

		return nbutaneTextID;

	}

	public void setNbutaneTextID(HtmlOutputText hot) {

		this.nbutaneTextID = hot;

	}

	private HtmlOutputText pentaneTextID = new HtmlOutputText();

	public HtmlOutputText getPentaneTextID() {

		return pentaneTextID;

	}

	public void setPentaneTextID(HtmlOutputText hot) {

		this.pentaneTextID = hot;

	}

	private HtmlOutputText waterTextID = new HtmlOutputText();

	public HtmlOutputText getWaterTextID() {

		return waterTextID;

	}

	public void setWaterTextID(HtmlOutputText hot) {

		this.waterTextID = hot;

	}

	private HtmlOutputText hexaneTextID = new HtmlOutputText();

	public HtmlOutputText getHexaneTextID() {

		return hexaneTextID;

	}

	public void setHexaneTextID(HtmlOutputText hot) {

		this.hexaneTextID = hot;

	}

	private HtmlInputText methaneTextField = new HtmlInputText();

	public HtmlInputText getMethaneTextField() {

		return methaneTextField;

	}

	public void setMethaneTextField(HtmlInputText hit) {

		this.methaneTextField = hit;

	}

	private HtmlInputText ethaneTextField = new HtmlInputText();

	public HtmlInputText getEthaneTextField() {

		return ethaneTextField;

	}

	public void setEthaneTextField(HtmlInputText hit) {

		this.ethaneTextField = hit;

	}

	private HtmlInputText propaneTextField = new HtmlInputText();

	public HtmlInputText getPropaneTextField() {

		return propaneTextField;

	}

	public void setPropaneTextField(HtmlInputText hit) {

		this.propaneTextField = hit;

	}

	private HtmlInputText nbutaneTextField = new HtmlInputText();

	public HtmlInputText getNbutaneTextField() {

		return nbutaneTextField;

	}

	public void setNbutaneTextField(HtmlInputText hit) {

		this.nbutaneTextField = hit;

	}

	private HtmlInputText pentaneTextField = new HtmlInputText();

	public HtmlInputText getPentaneTextField() {

		return pentaneTextField;

	}

	public void setPentaneTextField(HtmlInputText hit) {

		this.pentaneTextField = hit;

	}

	private HtmlInputText hexaneTextField = new HtmlInputText();

	public HtmlInputText getHexaneTextField() {

		return hexaneTextField;

	}

	public void setHexaneTextField(HtmlInputText hit) {

		this.hexaneTextField = hit;

	}

	private HtmlOutputText carbondioxTextID = new HtmlOutputText();

	public HtmlOutputText getCarbondioxTextID() {

		return carbondioxTextID;

	}

	public void setCarbondioxTextID(HtmlOutputText hot) {

		this.carbondioxTextID = hot;

	}

	private HtmlOutputText nitrogenTextID = new HtmlOutputText();

	public HtmlOutputText getNitrogenTextID() {

		return nitrogenTextID;

	}

	public void setNitrogenTextID(HtmlOutputText hot) {

		this.nitrogenTextID = hot;

	}

	private HtmlInputText carbonDioxideTextField = new HtmlInputText();

	public HtmlInputText getCarbonDioxideTextField() {

		return carbonDioxideTextField;

	}

	public void setCarbonDioxideTextField(HtmlInputText hit) {

		this.carbonDioxideTextField = hit;

	}

	private HtmlInputText nitrogenTextField = new HtmlInputText();

	public HtmlInputText getNitrogenTextField() {

		return nitrogenTextField;

	}

	public void setNitrogenTextField(HtmlInputText hit) {

		this.nitrogenTextField = hit;

	}

	private HtmlInputText waterTextField = new HtmlInputText();

	public HtmlInputText getWaterTextField() {

		return waterTextField;

	}

	public void setWaterTextField(HtmlInputText hit) {

		this.waterTextField = hit;

	}

	private HtmlInputText ibutaneTextField = new HtmlInputText();

	public HtmlInputText getIbutaneTextField() {

		return ibutaneTextField;

	}

	public void setIbutaneTextField(HtmlInputText hit) {

		this.ibutaneTextField = hit;

	}

	private HtmlOutputText temperatureIDText = new HtmlOutputText();

	public HtmlOutputText getTemperatureIDText() {

		return temperatureIDText;

	}

	public void setTemperatureIDText(HtmlOutputText hot) {

		this.temperatureIDText = hot;

	}

	private HtmlOutputText pressureIDText = new HtmlOutputText();

	public HtmlOutputText getPressureIDText() {

		return pressureIDText;

	}

	public void setPressureIDText(HtmlOutputText hot) {

		this.pressureIDText = hot;

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

	private HtmlCommandButton calculateButton = new HtmlCommandButton();

	public HtmlCommandButton getCalculateButton() {

		return calculateButton;

	}

	public void setCalculateButton(HtmlCommandButton hcb) {

		this.calculateButton = hcb;

	}

	// </editor-fold>

	public TempSelector() {

		// <editor-fold defaultstate="collapsed" desc="Creator-managed Component
		// Initialization">

		try {

		} catch (Exception e) {

			log("ComponentSelector Initialization Failure", e);

			throw e instanceof javax.faces.FacesException ? (FacesException) e
					: new FacesException(e);

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

	protected neqsimserver2.GasQuality.GasQualitySessionBean getGasQuality$GasQualitySessionBean() {

		return (neqsimserver2.GasQuality.GasQualitySessionBean) getBean("GasQuality$GasQualitySessionBean");

	}

	protected neqsimserver2.ApplicationBean1 getApplicationBean1() {

		return (neqsimserver2.ApplicationBean1) getBean("ApplicationBean1");

	}

	protected neqsimserver2.SessionBean1 getSessionBean1() {

		return (neqsimserver2.SessionBean1) getBean("SessionBean1");

	}

	protected neqsimserver2.Thermo.ThermoSessionBean getThermo$ThermoSessionBean() {

		return (neqsimserver2.Thermo.ThermoSessionBean) getBean("Thermo$ThermoSessionBean");

	}

	/**
	 * Bean cleanup.
	 */

	protected void afterRenderResponse() {

	}

	public void methaneTextField_validate(FacesContext fc, UIComponent uic,
			Object o) {

		// User event code here...

	}

	public void ethaneTextField_validate(FacesContext fc, UIComponent uic,
			Object o) {

		// User event code here...

	}

	public String calculateButton_action() {

		try {

			java.text.DecimalFormat nf = new java.text.DecimalFormat();

			nf.setMaximumFractionDigits(3);

			nf.applyPattern("#.###E0");

			// thermoSystem = new
			// thermo.system.SystemSrkSchwartzentruberEos(290,10);

			getThermo$ThermoSessionBean().resetThermoSystem();

			thermoSystem = getThermo$ThermoSessionBean().getThermoSystem();// new
																			// thermo.system.SystemSrkSchwartzentruberEos((java.lang.Double.parseDouble(getTemperatureTextField().getValue().toString())+273.15),java.lang.Double.parseDouble(getPressureTextField().getValue().toString()));

			thermoSystem.setTemperature(java.lang.Double.parseDouble(getTemperatureTextField().getValue().toString()) + 273.15);

			thermoSystem.setPressure(java.lang.Double.parseDouble(getPressureTextField().getValue().toString()));

			thermoOps = new thermodynamicOperations.ThermodynamicOperations(
					thermoSystem);

			if (java.lang.Double.parseDouble(getMethaneTextField().getValue().toString()) > 1.0E-20) {

				thermoSystem.addComponent("methane", java.lang.Double.parseDouble(getMethaneTextField().getValue().toString()));

			}

			if (java.lang.Double.parseDouble(getEthaneTextField().getValue().toString()) > 1.0E-20) {

				thermoSystem.addComponent("ethane",
						java.lang.Double.parseDouble(getEthaneTextField().getValue().toString()));

			}

			if (java.lang.Double.parseDouble(getPropaneTextField().getValue().toString()) > 1.0E-20) {

				thermoSystem.addComponent("propane", java.lang.Double.parseDouble(getPropaneTextField().getValue().toString()));

			}

			if (java.lang.Double.parseDouble(getIbutaneTextField().getValue().toString()) > 1.0E-20) {

				thermoSystem.addComponent("i-butane", java.lang.Double.parseDouble(getIbutaneTextField().getValue().toString()));

			}

			if (java.lang.Double.parseDouble(getNbutaneTextField().getValue().toString()) > 1.0E-20) {

				thermoSystem.addComponent("n-butane", java.lang.Double.parseDouble(getNbutaneTextField().getValue().toString()));

			}

			if (java.lang.Double.parseDouble(getPentaneTextField().getValue().toString()) > 1.0E-20) {

				thermoSystem.addComponent("n-pentane", java.lang.Double.parseDouble(getPentaneTextField().getValue().toString()));

			}

			if (java.lang.Double.parseDouble(getHexaneTextField().getValue().toString()) > 1.0E-20) {

				thermoSystem.addComponent("n-hexane",
						java.lang.Double.parseDouble(getHexaneTextField().getValue().toString()));

			}

			if (java.lang.Double.parseDouble(getCarbonDioxideTextField().getValue().toString()) > 1.0E-20) {

				thermoSystem.addComponent("CO2", java.lang.Double.parseDouble(getCarbonDioxideTextField().getValue().toString()));

			}

			if (java.lang.Double.parseDouble(getNitrogenTextField().getValue().toString()) > 1.0E-20) {

				thermoSystem.addComponent("nitrogen", java.lang.Double.parseDouble(getNitrogenTextField().getValue().toString()));

			}

			if (java.lang.Double.parseDouble(getWaterTextField().getValue().toString()) > 1.0E-20) {

				thermoSystem.addComponent("water", java.lang.Double.parseDouble(getWaterTextField().getValue().toString()));

			}

			thermoSystem.createDatabase(true);

			thermoSystem.setMixingRule(2);

			thermoSystem.setMultiPhaseCheck(true);

			thermoOps.TPflash();

			//

			// for (int i =0; i<3;i++){

			//

			// if (i==0) methaneTotalMolFrac.setValue("-");

			// if
			// (i<thermoSystem.getNumberOfPhases()&&java.lang.Double.parseDouble(getMethaneTextField().getValue().toString())>1.0E-20){

			// methaneTotalMolFrac.setValue(nf.format(thermoSystem.getPhase(i).getComponent("methane").getz()));

			// if (i==0)
			// methanePhase1MolFrac.setValue(nf.format(thermoSystem.getPhase(i).getComponent("methane").getx()));

			// if (i==1)
			// methanePhase2MolFrac.setValue(nf.format(thermoSystem.getPhase(i).getComponent("methane").getx()));

			// if (i==2)
			// methanePhase3MolFrac.setValue(nf.format(thermoSystem.getPhase(i).getComponent("methane").getx()));

			// }

			// else{

			// if (i==0) methanePhase1MolFrac.setValue("-");

			// if (i==1) methanePhase2MolFrac.setValue("-");

			// if (i==2) methanePhase3MolFrac.setValue("-");

			// }

			//

			//

			// if (i==0) ethaneTotalMolFrac.setValue("-");

			// if
			// (i<thermoSystem.getNumberOfPhases()&&java.lang.Double.parseDouble(getEthaneTextField().getValue().toString())>1.0E-20){

			// ethaneTotalMolFrac.setValue(nf.format(thermoSystem.getPhase(i).getComponent("ethane").getz()));

			// if (i==0)
			// ethanePhase1MolFrac.setValue(nf.format(thermoSystem.getPhase(i).getComponent("ethane").getx()));

			// if (i==1)
			// ethanePhase2MolFrac.setValue(nf.format(thermoSystem.getPhase(i).getComponent("ethane").getx()));

			// if (i==2)
			// ethanePhase3MolFrac.setValue(nf.format(thermoSystem.getPhase(i).getComponent("ethane").getx()));

			// }

			// else{

			// if (i==0) ethanePhase1MolFrac.setValue("-");

			// if (i==1) ethanePhase2MolFrac.setValue("-");

			// if (i==2) ethanePhase3MolFrac.setValue("-");

			// }

			//

			//

			// if (i==0) propaneTotalMolFrac.setValue("-");

			// if
			// (i<thermoSystem.getNumberOfPhases()&&java.lang.Double.parseDouble(getPropaneTextField().getValue().toString())>1.0E-20){

			// propaneTotalMolFrac.setValue(nf.format(thermoSystem.getPhase(i).getComponent("propane").getz()));

			// if (i==0)
			// propanePhase1MolFrac.setValue(nf.format(thermoSystem.getPhase(i).getComponent("propane").getx()));

			// if (i==1)
			// propanePhase2MolFrac.setValue(nf.format(thermoSystem.getPhase(i).getComponent("propane").getx()));

			// if (i==2)
			// propanePhase3MolFrac.setValue(nf.format(thermoSystem.getPhase(i).getComponent("propane").getx()));

			// }

			// else{

			// if (i==0) propanePhase1MolFrac.setValue("-");

			// if (i==1) propanePhase2MolFrac.setValue("-");

			// if (i==2) propanePhase3MolFrac.setValue("-");

			// }

			//

			//

			// if (i==0) ibutaneTotalMolFrac.setValue("-");

			// if
			// (i<thermoSystem.getNumberOfPhases()&&java.lang.Double.parseDouble(getIbutaneTextField().getValue().toString())>1.0E-20){

			// ibutaneTotalMolFrac.setValue(nf.format(thermoSystem.getPhase(i).getComponent("i-butane").getz()));

			// if (i==0)
			// ibutanePhase1MolFrac.setValue(nf.format(thermoSystem.getPhase(i).getComponent("i-butane").getx()));

			// if (i==1)
			// ibutanePhase2MolFrac.setValue(nf.format(thermoSystem.getPhase(i).getComponent("i-butane").getx()));

			// if (i==2)
			// ibutanePhase3MolFrac.setValue(nf.format(thermoSystem.getPhase(i).getComponent("i-butane").getx()));

			// }

			// else{

			// if (i==0) ibutanePhase1MolFrac.setValue("-");

			// if (i==1) ibutanePhase2MolFrac.setValue("-");

			// if (i==2) ibutanePhase3MolFrac.setValue("-");

			// }

			//

			//

			// if (i==0) nbutaneTotalMolFrac.setValue("-");

			// if
			// (i<thermoSystem.getNumberOfPhases()&&java.lang.Double.parseDouble(getNbutaneTextField().getValue().toString())>1.0E-20){

			// nbutaneTotalMolFrac.setValue(nf.format(thermoSystem.getPhase(i).getComponent("n-butane").getz()));

			// if (i==0)
			// nbutanePhase1MolFrac.setValue(nf.format(thermoSystem.getPhase(i).getComponent("n-butane").getx()));

			// if (i==1)
			// nbutanePhase2MolFrac.setValue(nf.format(thermoSystem.getPhase(i).getComponent("n-butane").getx()));

			// if (i==2)
			// nbutanePhase3MolFrac.setValue(nf.format(thermoSystem.getPhase(i).getComponent("n-butane").getx()));

			// }

			// else{

			// if (i==0) nbutanePhase1MolFrac.setValue("-");

			// if (i==1) nbutanePhase2MolFrac.setValue("-");

			// if (i==2) nbutanePhase3MolFrac.setValue("-");

			// }

			//

			// if (i==0) pentaneTotalMolFrac.setValue("-");

			// if
			// (i<thermoSystem.getNumberOfPhases()&&java.lang.Double.parseDouble(getPentaneTextField().getValue().toString())>1.0E-20){

			// pentaneTotalMolFrac.setValue(nf.format(thermoSystem.getPhase(i).getComponent("n-pentane").getz()));

			// if (i==0)
			// pentanePhase1MolFrac.setValue(nf.format(thermoSystem.getPhase(i).getComponent("n-pentane").getx()));

			// if (i==1)
			// pentanePhase2MolFrac.setValue(nf.format(thermoSystem.getPhase(i).getComponent("n-pentane").getx()));

			// if (i==2)
			// pentanePhase3MolFrac.setValue(nf.format(thermoSystem.getPhase(i).getComponent("n-pentane").getx()));

			// }

			// else{

			// if (i==0) pentanePhase1MolFrac.setValue("-");

			// if (i==1) pentanePhase2MolFrac.setValue("-");

			// if (i==2) pentanePhase3MolFrac.setValue("-");

			// }

			//

			// if (i==0) hexaneTotalMolFrac.setValue("-");

			// if
			// (i<thermoSystem.getNumberOfPhases()&&java.lang.Double.parseDouble(getHexaneTextField().getValue().toString())>1.0E-20){

			// hexaneTotalMolFrac.setValue(nf.format(thermoSystem.getPhase(i).getComponent("n-hexane").getz()));

			// if (i==0)
			// hexanePhase1MolFrac.setValue(nf.format(thermoSystem.getPhase(i).getComponent("n-hexane").getx()));

			// if (i==1)
			// hexanePhase2MolFrac.setValue(nf.format(thermoSystem.getPhase(i).getComponent("n-hexane").getx()));

			// if (i==2)
			// hexanePhase3MolFrac.setValue(nf.format(thermoSystem.getPhase(i).getComponent("n-hexane").getx()));

			// }

			// else{

			// if (i==0) hexanePhase1MolFrac.setValue("-");

			// if (i==1) hexanePhase2MolFrac.setValue("-");

			// if (i==2) hexanePhase3MolFrac.setValue("-");

			// }

			//

			//

			// if (i==0) co2TotalMolFrac.setValue("-");

			// if
			// (i<thermoSystem.getNumberOfPhases()&&java.lang.Double.parseDouble(getCarbonDioxideTextField().getValue().toString())>1.0E-20){

			// co2TotalMolFrac.setValue(nf.format(thermoSystem.getPhase(i).getComponent("CO2").getz()));

			// if (i==0)
			// co2Phase1MolFrac.setValue(nf.format(thermoSystem.getPhase(i).getComponent("CO2").getx()));

			// if (i==1)
			// co2Phase2MolFrac.setValue(nf.format(thermoSystem.getPhase(i).getComponent("CO2").getx()));

			// if (i==2)
			// co2Phase3MolFrac.setValue(nf.format(thermoSystem.getPhase(i).getComponent("CO2").getx()));

			// }

			// else{

			// if (i==0) co2Phase1MolFrac.setValue("-");

			// if (i==1) co2Phase2MolFrac.setValue("-");

			// if (i==2) co2Phase3MolFrac.setValue("-");

			// }

			//

			//

			// if (i==0) nitrogenTotalMolFrac.setValue("-");

			// if
			// (i<thermoSystem.getNumberOfPhases()&&java.lang.Double.parseDouble(getNitrogenTextField().getValue().toString())>1.0E-20){

			// nitrogenTotalMolFrac.setValue(nf.format(thermoSystem.getPhase(i).getComponent("nitrogen").getz()));

			// if (i==0)
			// nitrogenPhase1MolFrac.setValue(nf.format(thermoSystem.getPhase(i).getComponent("nitrogen").getx()));

			// if (i==1)
			// nitrogenPhase2MolFrac.setValue(nf.format(thermoSystem.getPhase(i).getComponent("nitrogen").getx()));

			// if (i==2)
			// nitrogenPhase3MolFrac.setValue(nf.format(thermoSystem.getPhase(i).getComponent("nitrogen").getx()));

			// }

			// else{

			// if (i==0) nitrogenPhase1MolFrac.setValue("-");

			// if (i==1) nitrogenPhase2MolFrac.setValue("-");

			// if (i==2) nitrogenPhase3MolFrac.setValue("-");

			// }

			//

			//

			// if (i==0) waterTotalMolFrac.setValue("-");

			// if
			// (i<thermoSystem.getNumberOfPhases()&&java.lang.Double.parseDouble(getWaterTextField().getValue().toString())>1.0E-20){

			// waterTotalMolFrac.setValue(nf.format(thermoSystem.getPhase(i).getComponent("water").getz()));

			// if (i==0)
			// waterPhase1MolFrac.setValue(nf.format(thermoSystem.getPhase(i).getComponent("water").getx()));

			// if (i==1)
			// waterPhase2MolFrac.setValue(nf.format(thermoSystem.getPhase(i).getComponent("water").getx()));

			// if (i==2)
			// waterPhase3MolFrac.setValue(nf.format(thermoSystem.getPhase(i).getComponent("water").getx()));

			//

			// }

			// else{

			// if (i==0) waterPhase1MolFrac.setValue("-");

			// if (i==1) waterPhase2MolFrac.setValue("-");

			// if (i==2) waterPhase3MolFrac.setValue("-");

			// }

			//

			// if (i==0) phase1PhaseFractionText.setValue("1.0");

			// if
			// (i<thermoSystem.getNumberOfPhases()&&java.lang.Double.parseDouble(getWaterTextField().getValue().toString())>1.0E-20){

			// if (i==0)
			// phase1PhaseFractionText.setValue(nf.format(thermoSystem.getPhase(i).getBeta()));

			// if (i==1)
			// phase2PhaseFractionText.setValue(nf.format(thermoSystem.getPhase(i).getBeta()));

			// if (i==2)
			// phase3PhaseFractionText.setValue(nf.format(thermoSystem.getPhase(i).getBeta()));

			//

			// }

			// else{

			// if (i==0) phase1PhaseFractionText.setValue("-");

			// if (i==1) phase2PhaseFractionText.setValue("-");

			// if (i==2) phase3PhaseFractionText.setValue("-");

			// }

			//

			//

			// if (i==0) molarMassTotal.setValue("-");

			// if
			// (i<thermoSystem.getNumberOfPhases()&&java.lang.Double.parseDouble(getWaterTextField().getValue().toString())>1.0E-20){

			// molarMassTotal.setValue(nf.format(thermoSystem.getMolarMass()));

			// if (i==0)
			// molarMassPhase1.setValue(nf.format(thermoSystem.getPhase(i).getMolarMass()));

			// if (i==1)
			// molarMassPhase2.setValue(nf.format(thermoSystem.getPhase(i).getMolarMass()));

			// if (i==2)
			// molarMassPhase3.setValue(nf.format(thermoSystem.getPhase(i).getMolarMass()));

			// }

			// else{

			// if (i==0) molarMassPhase1.setValue("-");

			// if (i==1) molarMassPhase2.setValue("-");

			// if (i==2) molarMassPhase3.setValue("-");

			// }

			//

			// if
			// (i<thermoSystem.getNumberOfPhases()&&java.lang.Double.parseDouble(getWaterTextField().getValue().toString())>1.0E-20){

			// if (i==0)
			// densityPhase1.setValue(nf.format(thermoSystem.getPhase(i).getDensity()));

			// if (i==1)
			// densityPhase2.setValue(nf.format(thermoSystem.getPhase(i).getDensity()));

			// if (i==2)
			// densityPhase3.setValue(nf.format(thermoSystem.getPhase(i).getDensity()));

			// }

			// else{

			// if (i==0) densityPhase1.setValue("-");

			// if (i==1) densityPhase2.setValue("-");

			// if (i==2) densityPhase3.setValue("-");

			// }

			//

			// if (i==0) enthalpyTotal.setValue("-");

			// if
			// (i<thermoSystem.getNumberOfPhases()&&java.lang.Double.parseDouble(getWaterTextField().getValue().toString())>1.0E-20){

			// enthalpyTotal.setValue(nf.format(thermoSystem.getEnthalpy()*0.0010));

			// if (i==0)
			// enthalpyPhase1.setValue(nf.format(thermoSystem.getPhase(i).getEnthalpy()*0.0010));

			// if (i==1)
			// enthalpyPhase2.setValue(nf.format(thermoSystem.getPhase(i).getEnthalpy()*0.0010));

			// if (i==2)
			// enthalpyPhase3.setValue(nf.format(thermoSystem.getPhase(i).getEnthalpy()*0.0010));

			// }

			// else{

			// if (i==0) enthalpyPhase1.setValue("-");

			// if (i==1) enthalpyPhase2.setValue("-");

			// if (i==2) enthalpyPhase3.setValue("-");

			// }

			//

			//

			//

			// }

			// thermoSystem.display();

		}

		catch (Exception e) {

			e.printStackTrace();

		}

		return null;

	}

}
