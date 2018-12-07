/*
 * GasQualityMenuPage.java
 *
 * Created on 15. november 2004, 10:24
 * Copyright ESOL
 */

package neqsimserver2.GasQuality;

import javax.faces.*;

import com.sun.jsfcl.app.*;

import javax.faces.component.html.*;

import com.sun.data.provider.impl.CachedRowSetDataProvider;

public class GasQualityMenuPage extends AbstractPageBean {

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

	private HtmlGraphicImage image1 = new HtmlGraphicImage();

	public HtmlGraphicImage getImage1() {

		return image1;

	}

	public void setImage1(HtmlGraphicImage hgi) {

		this.image1 = hgi;

	}

	private HtmlOutputText logoOutputText = new HtmlOutputText();

	public HtmlOutputText getLogoOutputText() {

		return logoOutputText;

	}

	public void setLogoOutputText(HtmlOutputText hot) {

		this.logoOutputText = hot;

	}

	private CachedRowSetDataProvider co2mdeaDataProvider = new CachedRowSetDataProvider();

	public CachedRowSetDataProvider getCo2mdeaDataProvider() {

		return co2mdeaDataProvider;

	}

	public void setCo2mdeaDataProvider(CachedRowSetDataProvider crsdp) {

		this.co2mdeaDataProvider = crsdp;

	}

	// </editor-fold>

	public GasQualityMenuPage() {

		// <editor-fold defaultstate="collapsed" desc="Creator-managed Component
		// Initialization">

		try {

			co2mdeaDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.co2mdeaRowSet}"));

		} catch (Exception e) {

			log("GasQualityMenuPage Initialization Failure", e);

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

		co2mdeaDataProvider.close();

	}

	public String mainMenuLinkAction_action() {

		return "GasQualityToStartMenu";

	}

	public String addComponentLinkAction_action() {

		return "GasQuakityToAddComponentPage";

	}

	public String iSO6976MenuId_action() {

		return "GasQualityToISO6976Page";

	}

	public String displayResultsLink_action() {

		// User event code here...

		return "GasQualityToViewResultsPage";

	}

	public String iso6976Action_action() {

		return "GasQualityToISO6976Page";

	}

}
