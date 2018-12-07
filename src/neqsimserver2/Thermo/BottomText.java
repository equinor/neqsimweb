/*
 * BottomText.java
 *
 * Created on 6. juli 2004, 19:51
 * Copyright Even Solbraa
 */

package neqsimserver2.Thermo;

import javax.faces.*;

import com.sun.jsfcl.app.*;

import javax.faces.component.html.*;

public class BottomText extends AbstractPageBean {

	// <editor-fold defaultstate="collapsed" desc="Creator-managed Component
	// Definition">

	private int __placeholder;

	private HtmlOutputText createdByText = new HtmlOutputText();

	public HtmlOutputText getCreatedByText() {

		return createdByText;

	}

	public void setCreatedByText(HtmlOutputText hot) {

		this.createdByText = hot;

	}

	private HtmlOutputText visitorsText = new HtmlOutputText();

	public HtmlOutputText getVisitorsText() {

		return visitorsText;

	}

	public void setVisitorsText(HtmlOutputText hot) {

		this.visitorsText = hot;

	}

	// </editor-fold>

	public BottomText() {

		// <editor-fold defaultstate="collapsed" desc="Creator-managed Component
		// Initialization">

		try {

		} catch (Exception e) {

			log("BottomText Initialization Failure", e);

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

	protected neqsimserver2.ApplicationBean1 getApplicationBean1() {

		return (neqsimserver2.ApplicationBean1) getBean("ApplicationBean1");

	}

	protected neqsimserver2.SessionBean1 getSessionBean1() {

		return (neqsimserver2.SessionBean1) getBean("SessionBean1");

	}

	/**
	 * Bean cleanup.
	 */

	protected void afterRenderResponse() {

	}

}
