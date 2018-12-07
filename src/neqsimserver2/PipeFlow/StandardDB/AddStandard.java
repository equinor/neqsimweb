/*
 * AddStandard.java
 *
 * Created on 27.mai.2008, 15:10:14
 */
package neqsimserver2.PipeFlow.StandardDB;

import com.sun.data.provider.RowKey;
import com.sun.data.provider.impl.CachedRowSetDataProvider;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.DropDown;
import com.sun.rave.web.ui.component.TextArea;
import com.sun.rave.web.ui.component.TextField;
import com.sun.rave.web.ui.component.Upload;
import com.sun.rave.web.ui.model.SingleSelectOptionsList;
import javax.faces.FacesException;
import javax.faces.convert.IntegerConverter;
import javax.faces.event.ValueChangeEvent;
import neqsimserver2.ApplicationBean1;
import neqsimserver2.GasQuality.GasQualitySessionBean;
import neqsimserver2.SessionBean1;
import neqsimserver2.Thermo.ThermoSessionBean;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @author ESOL
 */
public class AddStandard extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        standardSubjectDropDownDefaultOptions.setOptions(new com.sun.rave.web.ui.model.Option[]{new com.sun.rave.web.ui.model.Option("1", "GC analysis"), new com.sun.rave.web.ui.model.Option("2", "Water analysis"), new com.sun.rave.web.ui.model.Option("3", "Hydrocarbon dew point")});
        standardSubjectDropDownDefaultOptions.setSelectedValue("1");
        standardTypeDropDownDefaultOptions.setOptions(new com.sun.rave.web.ui.model.Option[]{new com.sun.rave.web.ui.model.Option("1", "ISO"), new com.sun.rave.web.ui.model.Option("2", "NORSOK"), new com.sun.rave.web.ui.model.Option("3", "ASTM")});
        standardTypeDropDownDefaultOptions.setSelectedValue("1");
        documentDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.documentsRowSet}"));
    }
    private SingleSelectOptionsList standardSubjectDropDownDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getStandardSubjectDropDownDefaultOptions() {
        return standardSubjectDropDownDefaultOptions;
    }

    public void setStandardSubjectDropDownDefaultOptions(SingleSelectOptionsList ssol) {
        this.standardSubjectDropDownDefaultOptions = ssol;
    }
    private SingleSelectOptionsList standardTypeDropDownDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getStandardTypeDropDownDefaultOptions() {
        return standardTypeDropDownDefaultOptions;
    }

    public void setStandardTypeDropDownDefaultOptions(SingleSelectOptionsList ssol) {
        this.standardTypeDropDownDefaultOptions = ssol;
    }
    private CachedRowSetDataProvider documentDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getDocumentDataProvider() {
        return documentDataProvider;
    }

    public void setDocumentDataProvider(CachedRowSetDataProvider crsdp) {
        this.documentDataProvider = crsdp;
    }
    private Upload fileUpload1 = new Upload();

    public Upload getFileUpload1() {
        return fileUpload1;
    }

    public void setFileUpload1(Upload u) {
        this.fileUpload1 = u;
    }
    private TextField documentNameTextField = new TextField();

    public TextField getDocumentNameTextField() {
        return documentNameTextField;
    }

    public void setDocumentNameTextField(TextField tf) {
        this.documentNameTextField = tf;
    }
    private DropDown standardTypeDropDown = new DropDown();

    public DropDown getStandardTypeDropDown() {
        return standardTypeDropDown;
    }

    public void setStandardTypeDropDown(DropDown dd) {
        this.standardTypeDropDown = dd;
    }
    private DropDown standardSubjectDropDown1 = new DropDown();

    public DropDown getStandardSubjectDropDown1() {
        return standardSubjectDropDown1;
    }

    public void setStandardSubjectDropDown1(DropDown dd) {
        this.standardSubjectDropDown1 = dd;
    }
    private TextArea documentTextInfo = new TextArea();

    public TextArea getDocumentTextInfo() {
        return documentTextInfo;
    }

    public void setDocumentTextInfo(TextArea ta) {
        this.documentTextInfo = ta;
    }
    private IntegerConverter integerConverter1 = new IntegerConverter();

    public IntegerConverter getIntegerConverter1() {
        return integerConverter1;
    }

    public void setIntegerConverter1(IntegerConverter ic) {
        this.integerConverter1 = ic;
    }
    private TextField httpTextField = new TextField();

    public TextField getHttpTextField() {
        return httpTextField;
    }

    public void setHttpTextField(TextField tf) {
        this.httpTextField = tf;
    }

    // </editor-fold>
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public AddStandard() {
    }

    /**
     * <p>Callback method that is called whenever a page is navigated to,
     * either directly via a URL, or indirectly via page navigation.
     * Customize this method to acquire resources that will be needed
     * for event handlers and lifecycle methods, whether or not this
     * page is performing post back processing.</p>
     * 
     * <p>Note that, if the current request is a postback, the property
     * values of the components do <strong>not</strong> represent any
     * values submitted with this request.  Instead, they represent the
     * property values that were saved for this view when it was rendered.</p>
     */
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
            log("AddStandard Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
        }

    // </editor-fold>
    // Perform application initialization that must complete
    // *after* managed components are initialized
    // TODO - add your own initialization code here
    }

    /**
     * <p>Callback method that is called after the component tree has been
     * restored, but before any event processing takes place.  This method
     * will <strong>only</strong> be called on a postback request that
     * is processing a form submit.  Customize this method to allocate
     * resources that will be required in your event handlers.</p>
     */
    @Override
    public void preprocess() {
    }

    /**
     * <p>Callback method that is called just before rendering takes place.
     * This method will <strong>only</strong> be called for the page that
     * will actually be rendered (and not, for example, on a page that
     * handled a postback and then navigated to a different page).  Customize
     * this method to allocate resources that will be required for rendering
     * this page.</p>
     */
    @Override
    public void prerender() {
    }

    /**
     * <p>Callback method that is called after rendering is completed for
     * this request, if <code>init()</code> was called (regardless of whether
     * or not this was the page that was actually rendered).  Customize this
     * method to release resources acquired in the <code>init()</code>,
     * <code>preprocess()</code>, or <code>prerender()</code> methods (or
     * acquired during execution of an event handler).</p>
     */
    @Override
    public void destroy() {
        documentDataProvider.close();
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1) getBean("ApplicationBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected GasQualitySessionBean getGasQuality$GasQualitySessionBean() {
        return (GasQualitySessionBean) getBean("GasQuality$GasQualitySessionBean");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected SessionBean1 getSessionBean1() {
        return (SessionBean1) getBean("SessionBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected ThermoSessionBean getThermo$ThermoSessionBean() {
        return (ThermoSessionBean) getBean("Thermo$ThermoSessionBean");
    }

    public void standardTypeDropDown_processValueChange(ValueChangeEvent event) {
    }

    public void standardSubjectDropDown_processValueChange(ValueChangeEvent event) {
    }

    public String uploadButton_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.
        try {
            if (fileUpload1.getUploadedFile().getContentType().substring(0, 4).compareTo("image") != 0) {
                documentDataProvider.cursorLast();
                RowKey rk = documentDataProvider.appendRow();
                documentDataProvider.setValue("FILETYPE", rk, fileUpload1.getUploadedFile().getContentType());

                String filename = "no name";
                if (fileUpload1.getUploadedFile().getOriginalName().lastIndexOf("\\") > 0) {
                    filename = fileUpload1.getUploadedFile().getOriginalName().substring(fileUpload1.getUploadedFile().getOriginalName().lastIndexOf("\\") + 1);
                }
                documentDataProvider.setValue("FILEID", rk, filename);
                documentDataProvider.setValue("FILE", rk, fileUpload1.getUploadedFile().getBytes());
                documentDataProvider.setValue("NAME", rk, documentNameTextField.getText().toString());
                documentDataProvider.setValue("TEXT", rk, documentTextInfo.getText().toString());
                documentDataProvider.setValue("LINK", rk, httpTextField.getText().toString());
                
                documentDataProvider.setValue("ARTICLEID", rk, standardTypeDropDown.getValue().toString());
                documentDataProvider.setValue("ARTICLETYPE", rk, standardTypeDropDown.getValue().toString());
                documentDataProvider.setValue("SUBJECT", rk, standardSubjectDropDown1.getValue().toString());

                documentDataProvider.commitChanges();
                documentDataProvider.refresh();
            } else {
                error("Please choose a file of image type. " +
                        fileUpload1.getUploadedFile().getOriginalName() +
                        " is of " + fileUpload1.getUploadedFile().getContentType() + " type.");
            }
        } catch (Exception ex) {
            log("Error Description", ex);
            error(ex.getMessage());
        }
        return "ToStandardsMenuPage";
    }

    public String hyperlink2_action() {
        // TODO: Replace with your code
        return null;
    }
}

