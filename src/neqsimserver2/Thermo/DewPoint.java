/*
 * TPflash.java
 *
 * Created on 6. juli 2004, 13:39
 * Copyright Even Solbraa
 */

package neqsimserver2.Thermo;

import javax.faces.*;

import com.sun.jsfcl.app.*;

import javax.faces.component.html.*;

import com.sun.jsfcl.data.*;

import javax.faces.component.*;

import javax.faces.event.*;

public class DewPoint extends AbstractPageBean {

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

	private HtmlOutputText gergWaterMenuText = new HtmlOutputText();

	public HtmlOutputText getGergWaterMenuText() {

		return gergWaterMenuText;

	}

	public void setGergWaterMenuText(HtmlOutputText hot) {

		this.gergWaterMenuText = hot;

	}

	private HtmlOutputText temperatureTextField = new HtmlOutputText();

	public HtmlOutputText getTemperatureTextField() {

		return temperatureTextField;

	}

	public void setTemperatureTextField(HtmlOutputText hot) {

		this.temperatureTextField = hot;

	}

	private HtmlOutputText pressureTextField = new HtmlOutputText();

	public HtmlOutputText getPressureTextField() {

		return pressureTextField;

	}

	public void setPressureTextField(HtmlOutputText hot) {

		this.pressureTextField = hot;

	}

	private HtmlInputText temperatureTextInputField = new HtmlInputText();

	public HtmlInputText getTemperatureTextInputField() {

		return temperatureTextInputField;

	}

	public void setTemperatureTextInputField(HtmlInputText hit) {

		this.temperatureTextInputField = hit;

	}

	private HtmlCommandButton okButton = new HtmlCommandButton();

	public HtmlCommandButton getOkButton() {

		return okButton;

	}

	public void setOkButton(HtmlCommandButton hcb) {

		this.okButton = hcb;

	}

	private HtmlInputText pressureTextInputField = new HtmlInputText();

	public HtmlInputText getPressureTextInputField() {

		return pressureTextInputField;

	}

	public void setPressureTextInputField(HtmlInputText hit) {

		this.pressureTextInputField = hit;

	}

	private DefaultSelectItemsArray radioButtonList1DefaultItems = new DefaultSelectItemsArray();

	public DefaultSelectItemsArray getRadioButtonList1DefaultItems() {

		return radioButtonList1DefaultItems;

	}

	public void setRadioButtonList1DefaultItems(DefaultSelectItemsArray dsia) {

		this.radioButtonList1DefaultItems = dsia;

	}

	private HtmlOutputText tpFlashSelectorText = new HtmlOutputText();

	public HtmlOutputText getTpFlashSelectorText() {

		return tpFlashSelectorText;

	}

	public void setTpFlashSelectorText(HtmlOutputText hot) {

		this.tpFlashSelectorText = hot;

	}

	private HtmlOutputText dewPointText = new HtmlOutputText();

	public HtmlOutputText getDewPointText() {

		return dewPointText;

	}

	public void setDewPointText(HtmlOutputText hot) {

		this.dewPointText = hot;

	}

	private HtmlSelectBooleanCheckbox dewPointTCheckBox = new HtmlSelectBooleanCheckbox();

	public HtmlSelectBooleanCheckbox getDewPointTCheckBox() {

		return dewPointTCheckBox;

	}

	public void setDewPointTCheckBox(HtmlSelectBooleanCheckbox hsbc) {

		this.dewPointTCheckBox = hsbc;

	}

	private HtmlSelectBooleanCheckbox dewPointPCheckBox = new HtmlSelectBooleanCheckbox();

	public HtmlSelectBooleanCheckbox getDewPointPCheckBox() {

		return dewPointPCheckBox;

	}

	public void setDewPointPCheckBox(HtmlSelectBooleanCheckbox hsbc) {

		this.dewPointPCheckBox = hsbc;

	}

	private DefaultSelectItemsArray checkboxList1DefaultItems1 = new DefaultSelectItemsArray();

	public DefaultSelectItemsArray getCheckboxList1DefaultItems1() {

		return checkboxList1DefaultItems1;

	}

	public void setCheckboxList1DefaultItems1(DefaultSelectItemsArray dsia) {

		this.checkboxList1DefaultItems1 = dsia;

	}

	// </editor-fold>

	public DewPoint() {

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

	public String okButton_action() {

		getThermo$ThermoSessionBean().getThermoSystem().setTemperature(
				273.15 + java.lang.Double.parseDouble(getTemperatureTextInputField().getValue().toString()));

		getThermo$ThermoSessionBean().getThermoSystem().setPressure(
				java.lang.Double.parseDouble(getPressureTextInputField().getValue().toString()));

		neqsim.thermodynamicOperations.ThermodynamicOperations ops = new neqsim.thermodynamicOperations.ThermodynamicOperations(
				getThermo$ThermoSessionBean().getThermoSystem());

		try {

			if (dewPointTCheckBox.isSelected())
				ops.dewPointTemperatureFlash();

			else if (dewPointPCheckBox.isSelected())
				ops.dewPointPressureFlash();

			else
				ops.dewPointTemperatureFlash();

		} catch (Exception e) {

			e.printStackTrace();

		}

		getThermo$ThermoSessionBean().getThermoSystem().createTable(
				getThermo$ThermoSessionBean().getThermoSystem().getFluidName());

		getThermo$ThermoSessionBean().setDisplayGraph(false);

		getThermo$ThermoSessionBean().setDisplayData(true);

		return "DewPointToThermoMenu";

	}

	public String BubblePointToThermoMenu() {

		return "DewPointToThermoMenu";

	}

	public void tPflashCheckBox_processValueChange(ValueChangeEvent vce) {

		// User event code here...

	}

	public String startMenuLinkAction_action() {

		return "BubblePointToThermoMenu";

	}

	public void dewPointTCheckBox_processValueChange(ValueChangeEvent vce) {

		if (dewPointTCheckBox.isSelected())
			dewPointPCheckBox.setSelected(false);

	}

	public void dewPointPCheckBox_processValueChange(ValueChangeEvent vce) {

		if (dewPointPCheckBox.isSelected())
			dewPointTCheckBox.setSelected(false);

	}

}
