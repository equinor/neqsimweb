/*
 * DisplayImage.java
 *
 * Created on October 6, 2005, 4:50 PM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package neqsimserver2.Util;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import neqsimserver2.SessionBean1;

public class DisplayDocument  extends HttpServlet {
    
    String ct= new String();
    int id= 1;
    String idName= new String();
    String idLit = "";
    
    /** Creates a new instance of DisplayPicture */
    public DisplayDocument() {
    }
    
    
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        
    }
    
    public void destroy() {
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
         System.out.println("Trying to dispaly document");
        SessionBean1 sessionBean1 = (SessionBean1) request.getSession().getAttribute("SessionBean1");
        id = sessionBean1.getDocumentID();
        
        readLitID();
        
        try {
            ServletOutputStream out = response.getOutputStream();
            
            response.setContentType(ct);
            out.write(this.getImage(id));
            System.out.println("Now displaying file with ID: "+id);
            System.out.println("Now displaying file of type: "+ct);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    
    /** Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
    
    /** Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
    
    /** Returns a short description of the servlet.
     */
    public String getServletInfo() {
        return "Displays a picture from the database identified by a parameter IMAGEID";
    }
    
    private void readLitID(){
         try {
            Context initContext = new InitialContext();
            DataSource ds = (DataSource)initContext.lookup("jdbc/neqsimdatabase_MySQL");
            Connection conn = ds.getConnection();
            
            Statement sta=null;
            Connection con=null;
            ResultSet rs=null;
            byte[] result=null;
            
            sta = conn.createStatement();
            rs=sta.executeQuery("SELECT * FROM documents where ID='"+id+"'");
            if (rs.next()) {
                ct = rs.getString("FILETYPE");
                idName = rs.getString("FILEID");
                id = Integer.parseInt(rs.getString("ID").toString());
            } else {
                System.out.println("Could find image with the ID specified or there is a problem with the database connection");
            }
            rs.close();
            sta.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    
    private byte[] getImage(int id) throws IOException {
        Statement sta=null;
        Connection con=null;
        ResultSet rs=null;
        byte[] result=null;
        
        try {
            Context initContext = new InitialContext();
            DataSource ds = (DataSource)initContext.lookup("jdbc/neqsimdatabase_MySQL");
            Connection conn = ds.getConnection();
            
            sta = conn.createStatement();
            rs=sta.executeQuery("SELECT * FROM documents where ID='"+id+"'");
            if (rs.next()) {
                result=rs.getBytes("FILE");
            } else {
                System.out.println("Could find image with the ID specified or there is a problem with the database connection");
            }
            rs.close();
            sta.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        
//        ByteArrayOutputStream output = new ByteArrayOutputStream();
//        output.write(result, 78, result.length-78);
//        output.flush();
//        output.close();
//        return output.toByteArray();
        return result;
    }
    
}