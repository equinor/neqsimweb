/*
 * GasQualitySessionBean.java
 *
 * Created on 1. mars 2005, 10:47
 * Copyright ESOL
 */
package neqsimserver2.GasQuality;

import javax.faces.*;
import com.sun.jsfcl.app.*;
import com.sun.sql.rowset.CachedRowSetXImpl;

public class GasQualitySessionBean extends AbstractSessionBean {
    // <editor-fold defaultstate="collapsed" desc="Creator-managed Component Definition">
    
    private int __placeholder;
    
    /**
     * Holds value of property loaction.
     */
    private String loaction = "Mongstad";
    
    /**
     * Holds value of property type.
     */
    private String type = "Gasskromatograf";
    
    /**
     * Holds value of property specVar.
     */
    private String specVar;
    
    /**
     * Holds value of property analyserID.
     */
    private Integer analyserID = new Integer(1);
    
    /**
     * Holds value of property onlineOffline.
     */
    private String onlineOffline = "online";
    
  
    
    // </editor-fold>
    public GasQualitySessionBean() {
        // TODO - insert any required initialization code
        // <editor-fold defaultstate="collapsed" desc="Creator-managed Component Initialization">
        try {
        } catch (Exception e) {
            System.err.println( "GasQualitySessionBean Initialization Failure"+ e);
        }
        // <editor-fold defaultstate="collapsed" desc="Creator-managed Component Initialization">
       
        // </editor-fold>
        // Additional user provided initialization code
        
//        try {
//            if (getType().equals("*") &&  getLoaction().equals("*")){
//                analysersRowSet.setCommand("SELECT ALL ANALYSERS.ID, ANALYSERS.INSTRUMENTTYPE, ANALYSERS.STED, ANALYSERS.FORMAL, ANALYSERS.INSTRUMENT, ANALYSERS.ANTALL, ANALYSERS.PLASSERING, ANALYSERS.TAGNR, ANALYSERS.KALIBRERINGSRUTINER, ANALYSERS.VEDLIKEHOLDSRUTINER, ANALYSERS.ERFARING, ANALYSERS.ONLINEOFFLINE, ANALYSERS.KONTAKTPERSON, ANALYSERS.KOMMENTARER, ANALYSERS.INSTALLASJONAAR FROM ANALYSERS ORDER BY ANALYSERS.ID ASC");
//            } else if (getType().equals("*")) analysersRowSet.setCommand("SELECT ALL ANALYSERS.ID, ANALYSERS.INSTRUMENTTYPE, ANALYSERS.STED, ANALYSERS.FORMAL, ANALYSERS.INSTRUMENT, ANALYSERS.ANTALL, ANALYSERS.PLASSERING, ANALYSERS.TAGNR, ANALYSERS.KALIBRERINGSRUTINER, ANALYSERS.VEDLIKEHOLDSRUTINER, ANALYSERS.ERFARING, ANALYSERS.ONLINEOFFLINE, ANALYSERS.KONTAKTPERSON, ANALYSERS.KOMMENTARER, ANALYSERS.INSTALLASJONAAR  FROM ANALYSERS WHERE ANALYSERS.STED=? ORDER BY ANALYSERS.ID ASC");
//            else if (getLoaction().equals("*")) analysersRowSet.setCommand("SELECT ALL ANALYSERS.ID, ANALYSERS.INSTRUMENTTYPE, ANALYSERS.STED, ANALYSERS.FORMAL, ANALYSERS.INSTRUMENT, ANALYSERS.ANTALL, ANALYSERS.PLASSERING, ANALYSERS.TAGNR, ANALYSERS.KALIBRERINGSRUTINER, ANALYSERS.VEDLIKEHOLDSRUTINER, ANALYSERS.ERFARING, ANALYSERS.ONLINEOFFLINE, ANALYSERS.KONTAKTPERSON, ANALYSERS.KOMMENTARER, ANALYSERS.INSTALLASJONAAR  FROM ANALYSERS WHERE ANALYSERS.INSTRUMENTTYPE=? ORDER BY ANALYSERS.ID ASC");
//            else analysersRowSet.setCommand("SELECT ALL ANALYSERS.ID, ANALYSERS.INSTRUMENTTYPE, ANALYSERS.STED, ANALYSERS.FORMAL, ANALYSERS.INSTRUMENT, ANALYSERS.ANTALL, ANALYSERS.PLASSERING, ANALYSERS.TAGNR, ANALYSERS.KALIBRERINGSRUTINER, ANALYSERS.VEDLIKEHOLDSRUTINER, ANALYSERS.ERFARING, ANALYSERS.ONLINEOFFLINE, ANALYSERS.KONTAKTPERSON, ANALYSERS.KOMMENTARER, ANALYSERS.INSTALLASJONAAR  FROM ANALYSERS WHERE ANALYSERS.INSTRUMENTTYPE=? AND ANALYSERS.STED=? ORDER BY ANALYSERS.ID ASC");
//        } catch (Exception e) {
//            log("GasQualitySessionBean Initialization Failure", e);
//            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
//        }
        
         

        // </editor-fold>
        // TODO: Add your own initialization code here (optional)    }
    }
    
    protected neqsimserver2.ApplicationBean1 getApplicationBean1() {
        return (neqsimserver2.ApplicationBean1)getBean("ApplicationBean1");
    }
    
    /**
     * Getter for property loaction.
     * @return Value of property loaction.
     */
    public String getLoaction() {
        return this.loaction;
    }
    
    /**
     * Setter for property loaction.
     * @param loaction New value of property loaction.
     */
    public void setLoaction(String loaction) {
        this.loaction = loaction;
    }
    
    /**
     * Getter for property type.
     * @return Value of property type.
     */
    public String getType() {
        return this.type;
    }
    
    /**
     * Setter for property type.
     * @param type New value of property type.
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * Getter for property specVar.
     * @return Value of property specVar.
     */
    public String getSpecVar() {
        return this.specVar;
    }
    
    /**
     * Setter for property specVar.
     * @param specVar New value of property specVar.
     */
    public void setSpecVar(String specVar) {
        this.specVar = specVar;
    }
    
    /**
     * Getter for property analyserID.
     * @return Value of property analyserID.
     */
    public Integer getAnalyserID() {
        return this.analyserID;
    }
    
    /**
     * Setter for property analyserID.
     * @param analyserID New value of property analyserID.
     */
    public void setAnalyserID(Integer analyserID) {
        this.analyserID = analyserID;
    }
    
    /**
     * Getter for property onlineOffline.
     * @return Value of property onlineOffline.
     */
    public String getOnlineOffline() {
        return this.onlineOffline;
    }
    
    /**
     * Setter for property onlineOffline.
     * @param onlineOffline New value of property onlineOffline.
     */
    public void setOnlineOffline(String onlineOffline) {
        if(onlineOffline.trim().equals("online") || onlineOffline.trim().equals("offline")){
            this.onlineOffline = onlineOffline;
        } else{
            this.onlineOffline="offline";
        }
        
    }
    
}
