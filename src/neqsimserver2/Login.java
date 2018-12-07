/*
 * Login.java
 *
 * Created on 30. januar 2006, 21:19
 * Copyright ESOL
 */
package neqsimserver2;

import com.sun.data.provider.impl.CachedRowSetDataProvider;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.DropDown;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.Page;
import javax.faces.FacesException;
import com.sun.rave.web.ui.component.TextField;
import com.sun.rave.web.ui.component.PasswordField;
import com.sun.rave.web.ui.component.Button;
import com.sun.rave.web.ui.component.Message;
import com.sun.rave.web.ui.component.StaticText;
import com.sun.data.provider.impl.ObjectDataProvider;
import javax.faces.convert.LongConverter;
import javax.faces.event.ValueChangeEvent;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class Login extends AbstractPageBean {

    // <editor-fold defaultstate="collapsed" desc="Creator-managed Component Definition">
    private int __placeholder;

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        loginDP.setObject(getValue("#{SessionBean1.loginBean}"));
        fluidinfoDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.fluidinfoRowSet1}"));
        fluidinfoDataProvider1.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.fluidinfoRowSet1}"));
        companyDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.companyRowSet}"));
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
    private TextField userName = new TextField();

    public TextField getUserName() {
        return userName;
    }

    public void setUserName(TextField tf) {
        this.userName = tf;
    }
    private PasswordField password = new PasswordField();

    public PasswordField getPassword() {
        return password;
    }

    public void setPassword(PasswordField pf) {
        this.password = pf;
    }
    private Button login = new Button();

    public Button getLogin() {
        return login;
    }

    public void setLogin(Button b) {
        this.login = b;
    }
    private Button reset = new Button();

    public Button getReset() {
        return reset;
    }

    public void setReset(Button b) {
        this.reset = b;
    }
    private Message message1 = new Message();

    public Message getMessage1() {
        return message1;
    }

    public void setMessage1(Message m) {
        this.message1 = m;
    }
    private Message message2 = new Message();

    public Message getMessage2() {
        return message2;
    }

    public void setMessage2(Message m) {
        this.message2 = m;
    }
    private StaticText wrongPassword = new StaticText();

    public StaticText getWrongPassword() {
        return wrongPassword;
    }

    public void setWrongPassword(StaticText st) {
        this.wrongPassword = st;
    }
    private ObjectDataProvider loginDP = new ObjectDataProvider();

    public ObjectDataProvider getLoginDP() {
        return loginDP;
    }

    public void setLoginDP(ObjectDataProvider odp) {
        this.loginDP = odp;
    }
    private CachedRowSetDataProvider fluidinfoDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getFluidinfoDataProvider() {
        return fluidinfoDataProvider;
    }

    public void setFluidinfoDataProvider(CachedRowSetDataProvider crsdp) {
        this.fluidinfoDataProvider = crsdp;
    }
    private CachedRowSetDataProvider fluidinfoDataProvider1 = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getFluidinfoDataProvider1() {
        return fluidinfoDataProvider1;
    }

    public void setFluidinfoDataProvider1(CachedRowSetDataProvider crsdp) {
        this.fluidinfoDataProvider1 = crsdp;
    }
    private CachedRowSetDataProvider companyDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getCompanyDataProvider() {
        return companyDataProvider;
    }

    public void setCompanyDataProvider(CachedRowSetDataProvider crsdp) {
        this.companyDataProvider = crsdp;
    }
    private LongConverter companyDropDownConverter = new LongConverter();

    public LongConverter getCompanyDropDownConverter() {
        return companyDropDownConverter;
    }

    public void setCompanyDropDownConverter(LongConverter lc) {
        this.companyDropDownConverter = lc;
    }
    private DropDown companyDropDown = new DropDown();

    public DropDown getCompanyDropDown() {
        return companyDropDown;
    }

    public void setCompanyDropDown(DropDown dd) {
        this.companyDropDown = dd;
    }

    // </editor-fold>
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public Login() {
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     */
    protected neqsimserver2.Thermo.ThermoSessionBean getThermo$ThermoSessionBean() {
        return (neqsimserver2.Thermo.ThermoSessionBean) getBean("Thermo$ThermoSessionBean");
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
    protected SessionBean1 getSessionBean1() {
        return (SessionBean1) getBean("SessionBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     */
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1) getBean("ApplicationBean1");
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
            log("Login Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
        }
        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
        //   boolean userTested = ((Boolean) loginDP.getValue(loginDP.getFieldKey("userNameTested"))).booleanValue();
        //  if (!userTested) {

        //   log("user ID : " + usernameLocal);
        // default_login_action();
        // }
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
        String usernameLocal = "statoil";//System.getProperty("user.name");
        //usernameLocal = usernameLocal.replace("A_", "");
        //usernameLocal = usernameLocal.replace("STATOIL-NET\\", "");
        //usernameLocal = usernameLocal.replace("WIN-NTNU-NO\\", "");
        usernameLocal = usernameLocal.toLowerCase();
        userName.setText(usernameLocal);
        password.setText(usernameLocal);
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
        fluidinfoDataProvider.close();
        fluidinfoDataProvider1.close();
        companyDataProvider.close();
    }

    public String default_login_action() {
        //   String usernameLocal = System.getProperty("user.name");
        //   usernameLocal = usernameLocal.replace("A_", "");
        //   usernameLocal = usernameLocal.replace("STATOIL-NET\\", "");
        //   usernameLocal = usernameLocal.replace("WIN-NTNU-NO\\", "");
        //   usernameLocal = usernameLocal.toLowerCase();
        //   log("user ID : " + usernameLocal);
        //loginDP.setValue("companyID", Integer.parseInt(getCompanyDropDown().getSelected().toString()));
        boolean loginok = true;
        try {
            loginok = ((Boolean) loginDP.getValue(loginDP.getFieldKey("loginGood"))).booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (loginok) {
            wrongPassword.setText("");
            reset_action();
            log("user ID : " + getSessionBean1().getLoginBean().getUserID() + " logged in ok for user " + getSessionBean1().getLoginBean().getUsername());
            return "LoginToStartMenu";
        } else {
            wrongPassword.setText("Wrong username or password. Please try again");
            return reset_action();
        }

    }

    public String login_action() {
        loginDP.setValue("companyID", Integer.parseInt(getCompanyDropDown().getSelected().toString()));
        boolean loginok = ((Boolean) loginDP.getValue(loginDP.getFieldKey("loginGood"))).booleanValue();
        if (loginok) {
            wrongPassword.setText("");
            reset_action();
            log("user ID : " + getSessionBean1().getLoginBean().getUserID() + " logged in ok for user " + getSessionBean1().getLoginBean().getUsername());
            return "LoginToStartMenu";
        } else {
            wrongPassword.setText("Wrong username or password. Please try again");
            return reset_action();
        }
    }

    public String reset_action() {
        form1.discardSubmittedValue(userName);
        form1.discardSubmittedValue(password);
        userName.setText("");
        password.setText("");
        return null;
    }

    public void userName_processValueChange(ValueChangeEvent event) {
    }
}

