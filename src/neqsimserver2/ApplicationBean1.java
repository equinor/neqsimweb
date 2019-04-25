/*
 * ApplicationBean1.java
 *
 * Created on 6. juli 2004, 10:01
 * Copyright Even Solbraa
 */
package neqsimserver2;

import javax.faces.*;
import com.sun.jsfcl.app.*;
import java.sql.SQLException;
import java.sql.*;
import java.sql.SQLException;

public class ApplicationBean1 extends AbstractApplicationBean {
    // <editor-fold defaultstate="collapsed" desc="Creator-managed Component Definition">
    private int __placeholder;

    // </editor-fold>
    public ApplicationBean1() {
        // <editor-fold defaultstate="collapsed" desc="Creator-managed Component Initialization">
        try {
        } catch (Exception e) {
            log("ApplicationBean1 Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
        }
    // </editor-fold>
    // Additional user provided initialization code
    }

    /** 
     * Bean cleanup.
     */
    protected void afterRenderResponse() {
    }

    public void executeSQLUpdate(String query, int id, byte[] filebytes) {
        javax.sql.DataSource ds = null;
        java.sql.Connection conn = null;
        java.sql.PreparedStatement sqlStatement = null;
        try {
            javax.naming.InitialContext ctx = new javax.naming.InitialContext();
            ds = (javax.sql.DataSource) ctx.lookup(
                    "java:comp/env/jdbc/NeqsimDataSource");
            conn = ds.getConnection();
            // setup the connection
            conn.setAutoCommit(false);
            // execute the query
          // query = "UPDATE neqsimdatabase.litterature SET FILE=? WHERE ID=?";
            sqlStatement = conn.prepareStatement(query);
            //      sqlStatement.exec(query);
            //      conn.commit();
            //      modi.setString(1,title); 
            sqlStatement.setBytes(1, filebytes);
            sqlStatement.setInt(2, id);
            sqlStatement.executeUpdate();
            conn.commit();
            sqlStatement.close();
        } catch (Exception ex) {
            error("Exception during update: " + ex.getMessage());
            try {
                if (conn != null) {
                    conn.rollback();
                }
            } catch (SQLException sqle) {
                log("Error on rollback " + sqle.getMessage());
            }
        } finally {
            // close the statement
            if (sqlStatement != null) {
                try {
                    sqlStatement.close();
                } catch (Exception ex) {
                    log("Error Description", ex);
                }
            }
            if (conn != null) {
                // cleanup and close the connection.
                try {
                    conn.close();
                } catch (Exception ex) {
                    log("Error Closing connection ", ex);
                }
            }
        }
    }
    
       public void executeSQLUpdate(String query) {
        javax.sql.DataSource ds = null;
        java.sql.Connection conn = null;
        java.sql.PreparedStatement sqlStatement = null;
        try {
            javax.naming.InitialContext ctx = new javax.naming.InitialContext();
            ds = (javax.sql.DataSource) ctx.lookup(
                    "java:comp/env/jdbc/NeqsimDataSource");
            conn = ds.getConnection();
            // setup the connection
            conn.setAutoCommit(false);
            // execute the query
          // query = "UPDATE neqsimdatabase.litterature SET FILE=? WHERE ID=?";
            sqlStatement = conn.prepareStatement(query);
  //          sqlStatement.executeQuery(query);
            //      conn.commit();
            //      modi.setString(1,title); 
            sqlStatement.executeUpdate();
            conn.commit();
            sqlStatement.close();
        } catch (Exception ex) {
            error("Exception during update: " + ex.getMessage());
            try {
                if (conn != null) {
                    conn.rollback();
                }
            } catch (SQLException sqle) {
                log("Error on rollback " + sqle.getMessage());
            }
        } finally {
            // close the statement
            if (sqlStatement != null) {
                try {
                    sqlStatement.close();
                } catch (Exception ex) {
                    log("Error Description", ex);
                }
            }
            if (conn != null) {
                // cleanup and close the connection.
                try {
                    conn.close();
                } catch (Exception ex) {
                    log("Error Closing connection ", ex);
                }
            }
        }
    }
}
