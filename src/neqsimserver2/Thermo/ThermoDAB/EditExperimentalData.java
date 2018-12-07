/*
 * EditExperimentalData.java
 *
 * Created on 30.des.2007, 21:32:50
 */
package neqsimserver2.Thermo.ThermoDAB;

import com.sun.data.provider.RowKey;
import com.sun.data.provider.impl.CachedRowSetDataProvider;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Button;
import com.sun.rave.web.ui.component.DropDown;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.ImageHyperlink;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.Page;
import com.sun.rave.web.ui.component.PanelLayout;
import com.sun.rave.web.ui.component.StaticText;
import com.sun.rave.web.ui.component.TextArea;
import com.sun.rave.web.ui.component.TextField;
import com.sun.rave.web.ui.component.Upload;
import javax.faces.FacesException;
import javax.faces.component.html.HtmlGraphicImage;
import javax.faces.convert.DoubleConverter;
import javax.faces.convert.IntegerConverter;
import javax.faces.convert.LongConverter;
import javax.faces.event.ValueChangeEvent;
import neqsimserver2.SessionBean1;
import neqsimserver2.Thermo.ThermoSessionBean;
import neqsimserver2.GasQuality.GasQualitySessionBean;
import neqsimserver2.ApplicationBean1;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @author ESOL
 */
public class EditExperimentalData extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    
    String fullFileName = null;
    private void _init() throws Exception {
        litDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.litteratureRowSetGetLitID}"));
        articleDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.literatureandarticlestableRowSetSetArtID}"));
        litteratureDataProviderTable.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.litteratureRowSetTable}"));
        expTypeRowSetDataProvider1.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.experimentaldatatypeRowSet}"));
        articleDataProviderTable.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.literatureandarticlestableRowSet}"));
  //      
    }
    private Page page1 = new Page();

    public Page getPage1() {
        return page1;
    }

    public void setPage1(Page p) {
        this.page1 = p;
    }
    private Html html1 = new Html();

    public Html getHtml1() {
        return html1;
    }

    public void setHtml1(Html h) {
        this.html1 = h;
    }
    private Head head1 = new Head();

    public Head getHead1() {
        return head1;
    }

    public void setHead1(Head h) {
        this.head1 = h;
    }
    private Link link1 = new Link();

    public Link getLink1() {
        return link1;
    }

    public void setLink1(Link l) {
        this.link1 = l;
    }
    private Body body1 = new Body();

    public Body getBody1() {
        return body1;
    }

    public void setBody1(Body b) {
        this.body1 = b;
    }
    private Form form1 = new Form();

    public Form getForm1() {
        return form1;
    }

    public void setForm1(Form f) {
        this.form1 = f;
    }
    private HtmlGraphicImage image1 = new HtmlGraphicImage();

    public HtmlGraphicImage getImage1() {
        return image1;
    }

    public void setImage1(HtmlGraphicImage hgi) {
        this.image1 = hgi;
    }
    private StaticText staticText1 = new StaticText();

    public StaticText getStaticText1() {
        return staticText1;
    }

    public void setStaticText1(StaticText st) {
        this.staticText1 = st;
    }
    private StaticText staticText2 = new StaticText();

    public StaticText getStaticText2() {
        return staticText2;
    }

    public void setStaticText2(StaticText st) {
        this.staticText2 = st;
    }
    private TextField maxTempTextField1 = new TextField();

    public TextField getMaxTempTextField1() {
        return maxTempTextField1;
    }

    public void setMaxTempTextField1(TextField tf) {
        this.maxTempTextField1 = tf;
    }
    private StaticText staticText3 = new StaticText();

    public StaticText getStaticText3() {
        return staticText3;
    }

    public void setStaticText3(StaticText st) {
        this.staticText3 = st;
    }
    private TextField minPresTextField1 = new TextField();

    public TextField getMinPresTextField1() {
        return minPresTextField1;
    }

    public void setMinPresTextField1(TextField tf) {
        this.minPresTextField1 = tf;
    }
    private StaticText staticText4 = new StaticText();

    public StaticText getStaticText4() {
        return staticText4;
    }

    public void setStaticText4(StaticText st) {
        this.staticText4 = st;
    }
    private StaticText staticText5 = new StaticText();

    public StaticText getStaticText5() {
        return staticText5;
    }

    public void setStaticText5(StaticText st) {
        this.staticText5 = st;
    }
    private StaticText staticText6 = new StaticText();

    public StaticText getStaticText6() {
        return staticText6;
    }

    public void setStaticText6(StaticText st) {
        this.staticText6 = st;
    }
    private Button button1 = new Button();

    public Button getButton1() {
        return button1;
    }

    public void setButton1(Button b) {
        this.button1 = b;
    }
    private StaticText staticText7 = new StaticText();

    public StaticText getStaticText7() {
        return staticText7;
    }

    public void setStaticText7(StaticText st) {
        this.staticText7 = st;
    }
    private TextField minTempTextField1 = new TextField();

    public TextField getMinTempTextField1() {
        return minTempTextField1;
    }

    public void setMinTempTextField1(TextField tf) {
        this.minTempTextField1 = tf;
    }
    private PanelLayout detailsGridPanel = new PanelLayout();

    public PanelLayout getDetailsGridPanel() {
        return detailsGridPanel;
    }

    public void setDetailsGridPanel(PanelLayout pl) {
        this.detailsGridPanel = pl;
    }
    private StaticText staticText8 = new StaticText();

    public StaticText getStaticText8() {
        return staticText8;
    }

    public void setStaticText8(StaticText st) {
        this.staticText8 = st;
    }
    private TextField authorTextField1 = new TextField();

    public TextField getAuthorTextField1() {
        return authorTextField1;
    }

    public void setAuthorTextField1(TextField tf) {
        this.authorTextField1 = tf;
    }
    private StaticText staticText9 = new StaticText();

    public StaticText getStaticText9() {
        return staticText9;
    }

    public void setStaticText9(StaticText st) {
        this.staticText9 = st;
    }
    private TextField articleTitleTextField1 = new TextField();

    public TextField getArticleTitleTextField1() {
        return articleTitleTextField1;
    }

    public void setArticleTitleTextField1(TextField tf) {
        this.articleTitleTextField1 = tf;
    }
    private StaticText staticText10 = new StaticText();

    public StaticText getStaticText10() {
        return staticText10;
    }

    public void setStaticText10(StaticText st) {
        this.staticText10 = st;
    }
    private TextField journalNameTextField1 = new TextField();

    public TextField getJournalNameTextField1() {
        return journalNameTextField1;
    }

    public void setJournalNameTextField1(TextField tf) {
        this.journalNameTextField1 = tf;
    }
    private StaticText staticText11 = new StaticText();

    public StaticText getStaticText11() {
        return staticText11;
    }

    public void setStaticText11(StaticText st) {
        this.staticText11 = st;
    }
    private TextField volumeTextField1 = new TextField();

    public TextField getVolumeTextField1() {
        return volumeTextField1;
    }

    public void setVolumeTextField1(TextField tf) {
        this.volumeTextField1 = tf;
    }
    private StaticText staticText12 = new StaticText();

    public StaticText getStaticText12() {
        return staticText12;
    }

    public void setStaticText12(StaticText st) {
        this.staticText12 = st;
    }
    private TextField pageTextField1 = new TextField();

    public TextField getPageTextField1() {
        return pageTextField1;
    }

    public void setPageTextField1(TextField tf) {
        this.pageTextField1 = tf;
    }
    private StaticText staticText13 = new StaticText();

    public StaticText getStaticText13() {
        return staticText13;
    }

    public void setStaticText13(StaticText st) {
        this.staticText13 = st;
    }
    private TextField yearTextField1 = new TextField();

    public TextField getYearTextField1() {
        return yearTextField1;
    }

    public void setYearTextField1(TextField tf) {
        this.yearTextField1 = tf;
    }
    private TextField maxPresTextField1 = new TextField();

    public TextField getMaxPresTextField1() {
        return maxPresTextField1;
    }

    public void setMaxPresTextField1(TextField tf) {
        this.maxPresTextField1 = tf;
    }
    private StaticText staticText14 = new StaticText();

    public StaticText getStaticText14() {
        return staticText14;
    }

    public void setStaticText14(StaticText st) {
        this.staticText14 = st;
    }
    private StaticText staticText15 = new StaticText();

    public StaticText getStaticText15() {
        return staticText15;
    }

    public void setStaticText15(StaticText st) {
        this.staticText15 = st;
    }
    private StaticText staticText16 = new StaticText();

    public StaticText getStaticText16() {
        return staticText16;
    }

    public void setStaticText16(StaticText st) {
        this.staticText16 = st;
    }
    private CachedRowSetDataProvider litDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getLitDataProvider() {
        return litDataProvider;
    }

    public void setLitDataProvider(CachedRowSetDataProvider crsdp) {
        this.litDataProvider = crsdp;
    }
    private TextArea textArea1 = new TextArea();

    public TextArea getTextArea1() {
        return textArea1;
    }

    public void setTextArea1(TextArea ta) {
        this.textArea1 = ta;
    }
    private StaticText statusText = new StaticText();

    public StaticText getStatusText() {
        return statusText;
    }

    public void setStatusText(StaticText st) {
        this.statusText = st;
    }
    private IntegerConverter dropDown1Converter = new IntegerConverter();

    public IntegerConverter getDropDown1Converter() {
        return dropDown1Converter;
    }

    public void setDropDown1Converter(IntegerConverter ic) {
        this.dropDown1Converter = ic;
    }
    private DoubleConverter doubleConverter1 = new DoubleConverter();

    public DoubleConverter getDoubleConverter1() {
        return doubleConverter1;
    }

    public void setDoubleConverter1(DoubleConverter dc) {
        this.doubleConverter1 = dc;
    }
    private CachedRowSetDataProvider articleDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getArticleDataProvider() {
        return articleDataProvider;
    }

    public void setArticleDataProvider(CachedRowSetDataProvider crsdp) {
        this.articleDataProvider = crsdp;
    }
    private ImageHyperlink imageHyperlink1 = new ImageHyperlink();

    public ImageHyperlink getImageHyperlink1() {
        return imageHyperlink1;
    }

    public void setImageHyperlink1(ImageHyperlink ih) {
        this.imageHyperlink1 = ih;
    }
    private Upload fileUpload = new Upload();

    public Upload getFileUpload() {
        return fileUpload;
    }

    public void setFileUpload(Upload u) {
        this.fileUpload = u;
    }
    private CachedRowSetDataProvider litteratureDataProviderTable = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getLitteratureDataProviderTable() {
        return litteratureDataProviderTable;
    }

    public void setLitteratureDataProviderTable(CachedRowSetDataProvider crsdp) {
        this.litteratureDataProviderTable = crsdp;
    }
    private DropDown expTypeDropDown = new DropDown();

    public DropDown getExpTypeDropDown() {
        return expTypeDropDown;
    }

    public void setExpTypeDropDown(DropDown dd) {
        this.expTypeDropDown = dd;
    }
    private CachedRowSetDataProvider expTypeRowSetDataProvider1 = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getExpTypeRowSetDataProvider1() {
        return expTypeRowSetDataProvider1;
    }

    public void setExpTypeRowSetDataProvider1(CachedRowSetDataProvider crsdp) {
        this.expTypeRowSetDataProvider1 = crsdp;
    }
    private LongConverter expTypeDropDownConverter = new LongConverter();

    public LongConverter getExpTypeDropDownConverter() {
        return expTypeDropDownConverter;
    }

    public void setExpTypeDropDownConverter(LongConverter lc) {
        this.expTypeDropDownConverter = lc;
    }
    private LongConverter longConverter1 = new LongConverter();

    public LongConverter getLongConverter1() {
        return longConverter1;
    }

    public void setLongConverter1(LongConverter lc) {
        this.longConverter1 = lc;
    }
    private CachedRowSetDataProvider articleDataProviderTable = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getArticleDataProviderTable() {
        return articleDataProviderTable;
    }

    public void setArticleDataProviderTable(CachedRowSetDataProvider crsdp) {
        this.articleDataProviderTable = crsdp;
    }
    private LongConverter longConverter2 = new LongConverter();

    public LongConverter getLongConverter2() {
        return longConverter2;
    }

    public void setLongConverter2(LongConverter lc) {
        this.longConverter2 = lc;
    }

    // </editor-fold>
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public EditExperimentalData() {
        try {
            litDataProvider.getCachedRowSet().setInt(1, getSessionBean1().getLitteratureID());
            litDataProvider.getCachedRowSet().execute();
        //      litDataProvider.refresh();
        } catch (Exception e) {
            log(e.toString());
        }
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
            log("EditExperimentalData Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
        }

        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
        try {
            litDataProvider.getCachedRowSet().setInt(1, getSessionBean1().getLitteratureID());
            litDataProvider.getCachedRowSet().execute();

            Object articelID = litDataProvider.getValue("LITTERATURE.ARTICLEID");
            System.out.println("LIT ID " + articelID.toString());
            Integer articleID = new Integer(articelID.toString());
            articleDataProvider.getCachedRowSet().setInt(1, articleID.intValue());
            articleDataProvider.getCachedRowSet().execute();

        } catch (Exception e) {
            log("EditExperimentalData Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
        }
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
        System.out.println("drop down value " + expTypeDropDown.getSelected());
        if (expTypeDropDown.getSelected() == null) {
            expTypeDropDown.setSelected(new Long(litDataProvider.getValue("litterature.EXPTYPEID").toString()));
        }
        System.out.println("file name " + fullFileName);
        fileUpload.setText(fullFileName);
       
        System.out.println("drop down selected " + expTypeDropDown.getSelected());
          System.out.println("drop down value " + expTypeDropDown.getValue());
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
        litDataProvider.close();
        articleDataProvider.close();
        litteratureDataProviderTable.close();
        expTypeRowSetDataProvider1.close();
        articleDataProviderTable.close();
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
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1) getBean("ApplicationBean1");
    }

    public void fileUpload1_processValueChange(ValueChangeEvent event) {
    }

    public String imageHyperlink1_action() {
        // TODO: Replace with your code
        detailsGridPanel.setRendered(true);
        return null;
    }

    public String button1_action() {
        try {
            if (detailsGridPanel.isRendered()) {
                Object articelID = litDataProvider.getValue("ARTICLEID");
                System.out.println("LIT ID " + articelID.toString());
                Integer articleID = new Integer(articelID.toString());
                if (articleID.intValue() == 1) {
                    articleDataProviderTable.cursorLast();
                    RowKey rk = articleDataProviderTable.appendRow();
                    log("1");
                    articleDataProviderTable.setValue("AUTHOR", rk, authorTextField1.getValue());
                    log("2");
                    articleDataProviderTable.setValue("NAME", rk, articleTitleTextField1.getValue());
                    log("3");
                    articleDataProviderTable.setValue("JOURNAL", rk, journalNameTextField1.getValue());
                    log("4");
                    articleDataProviderTable.setValue("VOLUME", rk, volumeTextField1.getValue());
                    log("5");
                    articleDataProviderTable.setValue("PAGES", rk, pageTextField1.getValue());
                    log("6");
                    articleDataProviderTable.setValue("YEAR", rk, yearTextField1.getValue());
                    log("7");

                    articleDataProviderTable.commitChanges();
                    articleDataProviderTable.refresh();
                    Integer artID = Integer.parseInt(articleDataProviderTable.getValue("literatureandarticlestable.ID").toString());
                    log("art numbers " + artID);
                    litDataProvider.setValue("ARTICLEID", artID);
                } else {
                    articleDataProvider.commitChanges();
                }
            }

            //  System.out.println("has file " + fileUpload.isLocalValueSet());
            System.out.println("name " + fileUpload.getUploadedFile().getOriginalName().trim());
            if (!fileUpload.getUploadedFile().getOriginalName().trim().equals("")) {
                fullFileName = fileUpload.getUploadedFile().getOriginalName().trim();
                litDataProvider.setValue("TYPE", fileUpload.getUploadedFile().getContentType());
                String filename = "no name";
                if (fileUpload.getUploadedFile().getContentType().substring(0, 4).compareTo("image") != 0) {
                    filename = fileUpload.getUploadedFile().getOriginalName().substring(fileUpload.getUploadedFile().getOriginalName().lastIndexOf("\\") + 1);
                }
                litDataProvider.setValue("NAME", filename);
            //litDataProvider.setValue("FILE", fileUpload.getUploadedFile().getBytes());
            }
            System.out.println("drop down value " + expTypeDropDown.getValue());
            System.out.println("drop down selectedvalue " + expTypeDropDown.getSelected().toString());

            litDataProvider.setValue("EXPTYPEID", expTypeDropDown.getValue().toString());
            litDataProvider.commitChanges();
            litDataProvider.refresh();

            if (!fileUpload.getUploadedFile().getOriginalName().trim().equals("")) {
                getApplicationBean1().executeSQLUpdate("UPDATE neqsimdatabase.litterature SET FILE=? WHERE ID=?", getSessionBean1().getLitteratureID(), fileUpload.getUploadedFile().getBytes());
            }
        // litteratureDataProviderTable.setValue("FILE", litDataProvider.getCursorRow(), fileUpload.getUploadedFile().getBytes());
        // litteratureDataProviderTable.commitChanges();
        // litteratureDataProviderTable.refresh();
        // System.out.println("value " +
        // onlineDropDown.getValue().toString());

        } catch (Exception e) {

            //  log("page AddAnalyser save exception " + e);

            //   error("exceptiuon saving analyser: " + e);

            e.printStackTrace();

        }
        statusText.setValue("Data updated...ok");
        return null;
    }
    }

