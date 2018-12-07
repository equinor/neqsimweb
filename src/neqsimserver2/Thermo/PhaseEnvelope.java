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

import javax.faces.event.*;

public class PhaseEnvelope extends AbstractPageBean {

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

	private HtmlOutputText pressureTextField = new HtmlOutputText();

	public HtmlOutputText getPressureTextField() {

		return pressureTextField;

	}

	public void setPressureTextField(HtmlOutputText hot) {

		this.pressureTextField = hot;

	}

	private DefaultSelectItemsArray checkboxList1DefaultItems = new DefaultSelectItemsArray();

	public DefaultSelectItemsArray getCheckboxList1DefaultItems() {

		return checkboxList1DefaultItems;

	}

	public void setCheckboxList1DefaultItems(DefaultSelectItemsArray dsia) {

		this.checkboxList1DefaultItems = dsia;

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

	private HtmlSelectBooleanCheckbox bubPointTCheckBox = new HtmlSelectBooleanCheckbox();

	public HtmlSelectBooleanCheckbox getBubPointTCheckBox() {

		return bubPointTCheckBox;

	}

	public void setBubPointTCheckBox(HtmlSelectBooleanCheckbox hsbc) {

		this.bubPointTCheckBox = hsbc;

	}

	private HtmlSelectBooleanCheckbox bubPointPCheckBox = new HtmlSelectBooleanCheckbox();

	public HtmlSelectBooleanCheckbox getBubPointPCheckBox() {

		return bubPointPCheckBox;

	}

	public void setBubPointPCheckBox(HtmlSelectBooleanCheckbox hsbc) {

		this.bubPointPCheckBox = hsbc;

	}

	private HtmlOutputText dewPointText1 = new HtmlOutputText();

	public HtmlOutputText getDewPointText1() {

		return dewPointText1;

	}

	public void setDewPointText1(HtmlOutputText hot) {

		this.dewPointText1 = hot;

	}

	private HtmlSelectBooleanCheckbox hydrateCheckBox = new HtmlSelectBooleanCheckbox();

	public HtmlSelectBooleanCheckbox getHydrateCheckBox() {

		return hydrateCheckBox;

	}

	public void setHydrateCheckBox(HtmlSelectBooleanCheckbox hsbc) {

		this.hydrateCheckBox = hsbc;

	}

	// </editor-fold>

	public PhaseEnvelope() {

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

		getThermo$ThermoSessionBean().getThermoSystem().setTemperature(100.0);

		getThermo$ThermoSessionBean().getThermoSystem().setPressure(
				java.lang.Double.parseDouble(getPressureTextInputField().getValue().toString()));

		try {

                    System.out.println("starting calculation...");
			getThermo$ThermoSessionBean().getThermodynamicOperation().setSystem(getThermo$ThermoSessionBean().getThermoSystem());

			getThermo$ThermoSessionBean().getThermodynamicOperation().calcPTphaseEnvelope(true);

		}

		catch (Exception e) {

			e.printStackTrace();

		}

		getSessionBean1().setJFreeChartObject(getThermo$ThermoSessionBean().getThermodynamicOperation().getJfreeChart());

		return "ToPhaseEnvelopeViewPage";

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

}
