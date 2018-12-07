/*
 * LoginBean.java
 *
 * Created on 7. februar 2006, 09:16
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package neqsimserver2.Util;

import com.sun.data.provider.RefreshableDataProvider;
import com.sun.data.provider.impl.CachedRowSetDataProvider;
import com.sun.sql.rowset.CachedRowSetXImpl;
import java.io.Serializable;
import neqsimserver2.SessionBean1;
/**
 *
 * @author ESOL
 */
public class LoginBean implements Serializable{
    
    private String username="";
    private String password="";
    private String correctName="statoil";
    private String correctPassword="gpro";
    private String companyName="statoil";
    private String licenceTypeName="full";
    private String licenceExpDate="2014-12-31";
    private int userID = 2;
    private SessionBean1 sessionBean1 = null;
    private int companyID = 1;
     private int correctCompanyID = 1;

    /** Creates a new instance of LoginBean */
    
    public LoginBean() {
    }
    
    public LoginBean(SessionBean1 sesBean) {
        sessionBean1=sesBean;
    }
    
    protected SessionBean1 getSessionBean1() {
        return sessionBean1;
    }
    
    public boolean isLoginGood(){
        boolean ok = true;
        
        CachedRowSetDataProvider usersDataProvider = getSessionBean1().getUserdbDataProvider();
        CachedRowSetDataProvider companyDataProvider = getSessionBean1().getCompanyDataProvider();
        
        CachedRowSetXImpl usersRowSet = getSessionBean1().getUserdbRowSet();
        
        try{
            if(usersDataProvider instanceof RefreshableDataProvider) usersDataProvider.refresh();
            usersDataProvider.setCursorRow(usersDataProvider.findFirst("USERNAME", username));
            
            correctName = (String) usersDataProvider.getValue("USERNAME");
            correctPassword = (String) usersDataProvider.getValue("PASSWORD");
            foreName = (String) usersDataProvider.getValue("FORNAME");
            surName = (String) usersDataProvider.getValue("SURENAME");
            correctCompanyID = Integer.parseInt(usersDataProvider.getValue("COMPANYID").toString());
            userID = Integer.parseInt(usersDataProvider.getValue("ID").toString());
            usersRowSet.release();
            usersRowSet.close();

            if(companyDataProvider instanceof RefreshableDataProvider) companyDataProvider.refresh();
            companyDataProvider.setCursorRow(usersDataProvider.findFirst("ID", correctCompanyID));
            companyName = companyDataProvider.getValue("NAME").toString();
            licenceExpDate = companyDataProvider.getValue("LICENCEEXPDATE").toString();
            licenceTypeName =  companyDataProvider.getValue("LICENCETYPE").toString();

        } catch(Exception e){
//            error("Cannont read USERS DB: " + e.getMessage());
//            log("Cannot read USERS database " + e.getMessage());
            e.printStackTrace();
            usersRowSet.close();
            ok = false;
        }
        
        return (ok && getUsername().equals(correctName) && getPassword().equals(correctPassword) && getCompanyID()==correctCompanyID);
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public int getUserID() {
        return userID;
    }
    
    public void setUserID(int userID) {
        this.userID = userID;
    }

    /**
     * Holds value of property emailAdress.
     */
    private String emailAdress;

    /**
     * Getter for property emailAdress.
     * @return Value of property emailAdress.
     */
    public String getEmailAdress() {

        return this.emailAdress;
    }

    /**
     * Setter for property emailAdress.
     * @param emailAdress New value of property emailAdress.
     */
    public void setEmailAdress(String emailAdress) {

        this.emailAdress = emailAdress;
    }

    /**
     * Holds value of property firstName.
     */
    private String foreName;

    /**
     * Getter for property firstName.
     * @return Value of property firstName.
     */
    public String getFirstName() {

        return this.foreName;
    }

    /**
     * Setter for property firstName.
     * @param firstName New value of property firstName.
     */
    public void setFirstName(String firstName) {

        this.foreName = firstName;
    }

    private String surName;

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    /**
     * @return the companyID
     */
    public int getCompanyID() {
        return companyID;
    }

    /**
     * @param companyID the companyID to set
     */
    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }

    /**
     * @return the companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * @param companyName the companyName to set
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * @return the licenceTypeName
     */
    public String getLicenceTypeName() {
        return licenceTypeName;
    }

    /**
     * @param licenceTypeName the licenceTypeName to set
     */
    public void setLicenceTypeName(String licenceTypeName) {
        this.licenceTypeName = licenceTypeName;
    }

    /**
     * @return the licenceExpDate
     */
    public String getLicenceExpDate() {
        return licenceExpDate;
    }

    /**
     * @param licenceExpDate the licenceExpDate to set
     */
    public void setLicenceExpDate(String licenceExpDate) {
        this.licenceExpDate = licenceExpDate;
    }
    
    
}
