/*
 * ReadFluidDB.java
 *
 * Created on 6. februar 2006, 22:26
 * Copyright ESOL
 */
package neqsimserver2.Thermo;

import com.sun.data.provider.RowKey;
import com.sun.data.provider.impl.TableRowDataProvider;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.Page;
import javax.faces.FacesException;
import javax.faces.component.html.HtmlGraphicImage;
import javax.faces.component.html.HtmlOutputText;
import com.sun.rave.web.ui.component.Table;
import com.sun.rave.web.ui.component.TableRowGroup;
import com.sun.rave.web.ui.component.TableColumn;
import com.sun.rave.web.ui.component.StaticText;
import com.sun.data.provider.impl.CachedRowSetDataProvider;
import com.sun.rave.web.ui.component.Button;
import com.sun.rave.web.ui.component.MessageGroup;
import com.sun.rave.web.ui.component.Checkbox;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class ReadFluidDB extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Creator-managed Component Definition">

    private int __placeholder;

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        fluidinfoFullTableDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.fluidinfoFullTableRowSet}"));
        fluidinfoFullTableDataProvider2.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.fluidinfoFullTableRowSet2}"));
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
    private HtmlOutputText outputText1 = new HtmlOutputText();

    public HtmlOutputText getOutputText1() {
        return outputText1;
    }

    public void setOutputText1(HtmlOutputText hot) {
        this.outputText1 = hot;
    }
    private Table table1 = new Table();

    public Table getTable1() {
        return table1;
    }

    public void setTable1(Table t) {
        this.table1 = t;
    }
    private TableRowGroup tableRowGroup1 = new TableRowGroup();

    public TableRowGroup getTableRowGroup1() {
        return tableRowGroup1;
    }

    public void setTableRowGroup1(TableRowGroup trg) {
        this.tableRowGroup1 = trg;
    }
    private CachedRowSetDataProvider fluidinfoFullTableDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getFluidinfoFullTableDataProvider() {
        return fluidinfoFullTableDataProvider;
    }

    public void setFluidinfoFullTableDataProvider(CachedRowSetDataProvider crsdp) {
        this.fluidinfoFullTableDataProvider = crsdp;
    }
    private TableColumn tableColumn1 = new TableColumn();

    public TableColumn getTableColumn1() {
        return tableColumn1;
    }

    public void setTableColumn1(TableColumn tc) {
        this.tableColumn1 = tc;
    }
    private StaticText staticText1 = new StaticText();

    public StaticText getStaticText1() {
        return staticText1;
    }

    public void setStaticText1(StaticText st) {
        this.staticText1 = st;
    }
    private TableColumn tableColumn2 = new TableColumn();

    public TableColumn getTableColumn2() {
        return tableColumn2;
    }

    public void setTableColumn2(TableColumn tc) {
        this.tableColumn2 = tc;
    }
    private StaticText staticText2 = new StaticText();

    public StaticText getStaticText2() {
        return staticText2;
    }

    public void setStaticText2(StaticText st) {
        this.staticText2 = st;
    }
    private TableColumn tableColumn3 = new TableColumn();

    public TableColumn getTableColumn3() {
        return tableColumn3;
    }

    public void setTableColumn3(TableColumn tc) {
        this.tableColumn3 = tc;
    }
    private StaticText staticText3 = new StaticText();

    public StaticText getStaticText3() {
        return staticText3;
    }

    public void setStaticText3(StaticText st) {
        this.staticText3 = st;
    }
    private TableColumn tableColumn4 = new TableColumn();

    public TableColumn getTableColumn4() {
        return tableColumn4;
    }

    public void setTableColumn4(TableColumn tc) {
        this.tableColumn4 = tc;
    }
    private StaticText staticText4 = new StaticText();

    public StaticText getStaticText4() {
        return staticText4;
    }

    public void setStaticText4(StaticText st) {
        this.staticText4 = st;
    }
    private TableColumn tableColumn6 = new TableColumn();

    public TableColumn getTableColumn6() {
        return tableColumn6;
    }

    public void setTableColumn6(TableColumn tc) {
        this.tableColumn6 = tc;
    }
    private Button button2 = new Button();

    public Button getButton2() {
        return button2;
    }

    public void setButton2(Button b) {
        this.button2 = b;
    }
    private MessageGroup messageGroup1 = new MessageGroup();

    public MessageGroup getMessageGroup1() {
        return messageGroup1;
    }

    public void setMessageGroup1(MessageGroup mg) {
        this.messageGroup1 = mg;
    }
    private TableColumn tableColumn8 = new TableColumn();

    public TableColumn getTableColumn8() {
        return tableColumn8;
    }

    public void setTableColumn8(TableColumn tc) {
        this.tableColumn8 = tc;
    }
    private Button button4 = new Button();

    public Button getButton4() {
        return button4;
    }

    public void setButton4(Button b) {
        this.button4 = b;
    }
    private Button button5 = new Button();

    public Button getButton5() {
        return button5;
    }

    public void setButton5(Button b) {
        this.button5 = b;
    }
    private TableColumn tableColumn10 = new TableColumn();

    public TableColumn getTableColumn10() {
        return tableColumn10;
    }

    public void setTableColumn10(TableColumn tc) {
        this.tableColumn10 = tc;
    }
    private Checkbox checkbox2 = new Checkbox();

    public Checkbox getCheckbox2() {
        return checkbox2;
    }

    public void setCheckbox2(Checkbox c) {
        this.checkbox2 = c;
    }
    private TableColumn tableColumn9 = new TableColumn();

    public TableColumn getTableColumn9() {
        return tableColumn9;
    }

    public void setTableColumn9(TableColumn tc) {
        this.tableColumn9 = tc;
    }
    private StaticText staticText5 = new StaticText();

    public StaticText getStaticText5() {
        return staticText5;
    }

    public void setStaticText5(StaticText st) {
        this.staticText5 = st;
    }
    private CachedRowSetDataProvider fluidinfoFullTableDataProvider2 = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getFluidinfoFullTableDataProvider2() {
        return fluidinfoFullTableDataProvider2;
    }

    public void setFluidinfoFullTableDataProvider2(CachedRowSetDataProvider crsdp) {
        this.fluidinfoFullTableDataProvider2 = crsdp;
    }
    private TableColumn tableColumn5 = new TableColumn();

    public TableColumn getTableColumn5() {
        return tableColumn5;
    }

    public void setTableColumn5(TableColumn tc) {
        this.tableColumn5 = tc;
    }
    private Button button1 = new Button();

    public Button getButton1() {
        return button1;
    }

    public void setButton1(Button b) {
        this.button1 = b;
    }
    private CachedRowSetDataProvider deletearticledataporvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getDeletearticledataporvider() {
        return deletearticledataporvider;
    }

    public void setDeletearticledataporvider(CachedRowSetDataProvider crsdp) {
        this.deletearticledataporvider = crsdp;
    }

    // </editor-fold>
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public ReadFluidDB() {
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     */
    protected neqsimserver2.GasQuality.GasQualitySessionBean getGasQuality$GasQualitySessionBean() {
        return (neqsimserver2.GasQuality.GasQualitySessionBean) getBean("GasQuality$GasQualitySessionBean");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     */
    protected ThermoSessionBean getThermo$ThermoSessionBean() {
        return (ThermoSessionBean) getBean("Thermo$ThermoSessionBean");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     */
    protected neqsimserver2.SessionBean1 getSessionBean1() {
        return (neqsimserver2.SessionBean1) getBean("SessionBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     */
    protected neqsimserver2.ApplicationBean1 getApplicationBean1() {
        return (neqsimserver2.ApplicationBean1) getBean("ApplicationBean1");
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
    public void init() {
        // Perform initializations inherited from our superclass
        super.init();
        // Perform application initialization that must complete
        // *before* managed components are initialized
        // TODO - add your own initialiation code here

        // <editor-fold defaultstate="collapsed" desc="Creator-managed Component Initialization">
        // Initialize automatically managed components
        // *Note* - this logic should NOT be modified
        try {
            _init();
        } catch (Exception e) {
            log("ReadFluidDB Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
        }
        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
        try {
            log("accessing session bean ...fluidinfoFullTableDataProvider");
            log("user ID= " + Integer.toString(getSessionBean1().getLoginBean().getUserID()));
            getSessionBean1().getFluidinfoFullTableRowSet().setObject(1, Integer.toString(getSessionBean1().getLoginBean().getUserID()));
            fluidinfoFullTableDataProvider.refresh();
            log("fluid table read and returned " + fluidinfoFullTableDataProvider.getAllRows().length + "rows");
            log(getSessionBean1().getFluidinfoFullTableRowSet().getWarnings().toString());
        } catch (Exception e) {
            e.printStackTrace();
            error(e.getMessage());
        }

        table1.setVisible(true);
    }

    /**
     * <p>Callback method that is called after the component tree has been
     * restored, but before any event processing takes place.  This method
     * will <strong>only</strong> be called on a postback request that
     * is processing a form submit.  Customize this method to allocate
     * resources that will be required in your event handlers.</p>
     */
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
    public void destroy() {
        fluidinfoFullTableDataProvider2.close();
        fluidinfoFullTableDataProvider.close();
        deletearticledataporvider.close();
    }

    public String button2_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.
        TableRowDataProvider rowData = (TableRowDataProvider) getBean("currentRow");
        getSessionBean1().setActiveFluidID(((Integer) rowData.getValue("FLUIDINFO.ID")).intValue());
        return "ReadFluidDBtoAddComponent";
    }

    public String dupbutton_action() {
        try {
            fluidinfoFullTableDataProvider2.refresh();
            fluidinfoFullTableDataProvider2.cursorLast();
            String newLastID = Integer.toString((Integer.parseInt(fluidinfoFullTableDataProvider2.getValue("ID").toString()) + 1));
            log("newLastID " + newLastID);
            RowKey rowKey = tableRowGroup1.getRowKey();
            fluidinfoFullTableDataProvider.setCursorRow(rowKey);
            //getSessionBean1().setActiveFluidID(Integer.parseInt(fluidinfoFullTableDataProvider.getValue("ID").toString()));

            if (!fluidinfoFullTableDataProvider.getValue("USERID").toString().equals(Integer.toString(getSessionBean1().getLoginBean().getUserID()))) {
                error("not allowed to duplicate fluid owned by others");
                return null;
            }
            // TableRowDataProvider rowData = (TableRowDataProvider) getBean("currentRow");
            Integer key = new Integer(fluidinfoFullTableDataProvider.getValue("ID").toString());//((Integer) rowData.getValue("FLUIDINFO.ID")).intValue();

            log("actualRowID " + key.toString());
            //   RowKey rowKey = tableRowGroup1.getRowKey();
            //   fluidinfoFullTableDataProvider.removeRow(rowKey);
            //   fluidinfoFullTableDataProvider.commitChanges();
            //   fluidinfoFullTableDataProvider.refresh();
            //  getApplicationBean1().e
            // getApplicationBean1().executeSQLUpdate("DELETE neqsimdatabase.literatureandarticlestable FROM neqsimdatabase.literatureandarticlestable,neqsimdatabase.litterature WHERE litterature.FLUID_ID = " + key.toString() + " AND literatureandarticlestable.ID = litterature.ARTICLEID");

            getApplicationBean1().executeSQLUpdate("DROP TEMPORARY TABLE IF EXISTS neqsimdatabase.tmptable");
            getApplicationBean1().executeSQLUpdate("CREATE TEMPORARY TABLE neqsimdatabase.tmptable SELECT * FROM neqsimdatabase.fluidinfo WHERE fluidinfo.ID =" + key.toString());
            getApplicationBean1().executeSQLUpdate("UPDATE neqsimdatabase.tmptable SET tmptable.ID =" + newLastID);
            getApplicationBean1().executeSQLUpdate("INSERT INTO neqsimdatabase.fluidinfo SELECT * FROM neqsimdatabase.tmptable");
            getApplicationBean1().executeSQLUpdate("DROP TEMPORARY TABLE IF EXISTS neqsimdatabase.tmptable");
            fluidinfoFullTableDataProvider.refresh();
        } catch (Exception e) {
            e.printStackTrace();
            error(e.getMessage());
        }

        return null;
    }

    public String button1_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.
        try {

            RowKey rowKey = tableRowGroup1.getRowKey();
            fluidinfoFullTableDataProvider.setCursorRow(rowKey);
            //getSessionBean1().setActiveFluidID(Integer.parseInt(fluidinfoFullTableDataProvider.getValue("ID").toString()));

            if (!fluidinfoFullTableDataProvider.getValue("USERID").toString().equals(Integer.toString(getSessionBean1().getLoginBean().getUserID()))) {
                error("not allowed to change fluid properties owned by others");
                return null;
            }
            // TableRowDataProvider rowData = (TableRowDataProvider) getBean("currentRow");
            Integer key = new Integer(fluidinfoFullTableDataProvider.getValue("ID").toString());//((Integer) rowData.getValue("FLUIDINFO.ID")).intValue();

            //   RowKey rowKey = tableRowGroup1.getRowKey();
            //   fluidinfoFullTableDataProvider.removeRow(rowKey);
            //   fluidinfoFullTableDataProvider.commitChanges();
            //   fluidinfoFullTableDataProvider.refresh();
            //  getApplicationBean1().e
            getApplicationBean1().executeSQLUpdate("DELETE neqsimdatabase.literatureandarticlestable FROM neqsimdatabase.literatureandarticlestable,neqsimdatabase.litterature WHERE litterature.FLUID_ID = " + key.toString() + " AND literatureandarticlestable.ID = litterature.ARTICLEID");

            getApplicationBean1().executeSQLUpdate("DELETE FROM neqsimdatabase.fluidinfo WHERE fluidinfo.ID = " + key.toString());
            getApplicationBean1().executeSQLUpdate("DELETE FROM neqsimdatabase.litterature WHERE litterature.FLUID_ID = " + key.toString());
            fluidinfoFullTableDataProvider.refresh();
        } catch (Exception e) {
            e.printStackTrace();
            error(e.getMessage());
        }
        return null;
    }

    public String button4_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.
        RowKey rowKey = tableRowGroup1.getRowKey();
        fluidinfoFullTableDataProvider.setCursorRow(rowKey);
        getSessionBean1().setActiveFluidID(Integer.parseInt(fluidinfoFullTableDataProvider.getValue("ID").toString()));
        log("ative fluid ID " + getSessionBean1().getActiveFluidID());
        return "ReadFluidDBToExperimentalData";
    }

    public String button5_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.
        try {
            System.out.println("1");
            fluidinfoFullTableDataProvider2.refresh();
            System.out.println("2");
            fluidinfoFullTableDataProvider2.cursorLast();
            System.out.println("3");
            RowKey rowKey = fluidinfoFullTableDataProvider2.appendRow();
            System.out.println("4");

            fluidinfoFullTableDataProvider2.setValue("FLUIDINFO.FIELD", rowKey, "new field");
            fluidinfoFullTableDataProvider2.setValue("FLUIDINFO.WELL", rowKey, "new well");
            fluidinfoFullTableDataProvider2.setValue("FLUIDINFO.USERID", rowKey, Integer.toString(getSessionBean1().getLoginBean().getUserID()));
            fluidinfoFullTableDataProvider2.commitChanges();
            getSessionBean1().setActiveFluidID(((Integer) fluidinfoFullTableDataProvider2.getValue("FLUIDINFO.ID")).intValue());

            fluidinfoFullTableDataProvider2.refresh();
            getSessionBean1().getFluidinfoFullTableRowSet().setObject(1, Integer.toString(getSessionBean1().getLoginBean().getUserID()));
            fluidinfoFullTableDataProvider.refresh();

            System.out.println("FLuid_ID " + getSessionBean1().getActiveFluidID());
        } catch (Exception e) {
            error(e.getMessage());
            log(e.getMessage());
            e.printStackTrace();
        }
        
        return null;
    }

    public void checkbox2_processValueChange(javax.faces.event.ValueChangeEvent event) {
        // TODO: Replace with your code
        ;
        RowKey rowKey = tableRowGroup1.getRowKey();
        fluidinfoFullTableDataProvider.setCursorRow(rowKey);
        getSessionBean1().setActiveFluidID(Integer.parseInt(fluidinfoFullTableDataProvider.getValue("ID").toString()));

        if (!fluidinfoFullTableDataProvider.getValue("USERID").toString().equals(Integer.toString(getSessionBean1().getLoginBean().getUserID()))) {
            error("not allowed to change fluid properties owned by others");
            return;
        }
        int value = 0;
        try {

            System.out.println("starting to try...");
            if (event.getNewValue().toString().equals("true")) {
                value = 1;
            }
            fluidinfoFullTableDataProvider.setValue("FLUIDINFO.SHARED", rowKey, Integer.toString(value));

            fluidinfoFullTableDataProvider.commitChanges();
            fluidinfoFullTableDataProvider.refresh();


        } catch (Exception e) {
            System.out.println("error " + event.getNewValue());
            e.printStackTrace();
            error(e.getMessage());

        }
    }

    public String button3_action() {
          // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.
        RowKey rowKey = tableRowGroup1.getRowKey();
        fluidinfoFullTableDataProvider.setCursorRow(rowKey);
        getSessionBean1().setActiveFluidID(Integer.parseInt(fluidinfoFullTableDataProvider.getValue("ID").toString()));
        log("ative fluid ID " + getSessionBean1().getActiveFluidID());
        return "ToPVTdataPage";
    }
}

