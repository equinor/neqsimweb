/*
 * DisplayImage.java
 *
 * Created on October 6, 2005, 4:50 PM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */
package neqsimserver2.Thermo;
//import com.sun.image.codec.jpeg.JPEGCodec;
//import com.sun.image.codec.jpeg.JPEGEncodeParam;
//import com.sun.image.codec.jpeg.JPEGImageEncoder;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import neqsimserver2.SessionBean1;
import org.jfree.chart.JFreeChart;

public class DisplayJFreeChartImage extends HttpServlet {

    String ct = new String();
    String id = new String();
    int idLit = 1;

    /** Creates a new instance of DisplayPicture */
    public DisplayJFreeChartImage() {
    }

    public void init(ServletConfig config) throws ServletException {
        super.init(config);

    }

    public void destroy() {
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {

            SessionBean1 sessionBean1 = (SessionBean1) request.getSession().getAttribute("SessionBean1");
            JFreeChart chart = sessionBean1.getJFreeChartObject();
            response.setContentType("image/png");

            BufferedImage buf = chart.createBufferedImage(640, 400, null);

            // java.awt.image.BufferedImage ChartImage = new java.awt.image.BufferedImage(640, 400, java.awt.image.BufferedImage.TYPE_INT_RGB);
            ImageIO.write(buf, "png", response.getOutputStream());
            response.getOutputStream().flush();
        } catch (Exception e) {
            e.printStackTrace();
            //.....
        } finally {
            if (null != response.getOutputStream()) {
                response.getOutputStream().close();
            }
        }
        /// JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(response.getOutputStream());
        // JPEGEncodeParam param = encoder.getDefaultJPEGEncodeParam(buf);
        //  param.setQuality(0.75f, true);
        //  encoder.encode(buf,param);
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
}
