/*
 * Copyright 2005 Sun Microsystems, Inc. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * - Redistributions of source code must retain the above copyright
 *   notice, this list of conditions and the following disclaimer.
 *
 * - Redistribution in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in
 *   the documentation and/or other materials provided with the
 *   distribution.
 *
 * Neither the name of Sun Microsystems, Inc. or the names of
 * contributors may be used to endorse or promote products derived
 * from this software without specific prior written permission.
 *
 * This software is provided "AS IS," without a warranty of any
 * kind. ALL EXPRESS OR IMPLIED CONDITIONS, REPRESENTATIONS AND
 * WARRANTIES, INCLUDING ANY IMPLIED WARRANTY OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE OR NON-INFRINGEMENT, ARE HEREBY
 * EXCLUDED. SUN AND ITS LICENSORS SHALL NOT BE LIABLE FOR ANY DAMAGES
 * SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR
 * DISTRIBUTING THE SOFTWARE OR ITS DERIVATIVES. IN NO EVENT WILL SUN
 * OR ITS LICENSORS BE LIABLE FOR ANY LOST REVENUE, PROFIT OR DATA, OR
 * FOR DIRECT, INDIRECT, SPECIAL, CONSEQUENTIAL, INCIDENTAL OR
 * PUNITIVE DAMAGES, HOWEVER CAUSED AND REGARDLESS OF THE THEORY OF
 * LIABILITY, ARISING OUT OF THE USE OF OR INABILITY TO USE SOFTWARE,
 * EVEN IF SUN HAS BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGES.
 *
 * You acknowledge that Software is not designed, licensed or intended
 * for use in the design, construction, operation or maintenance of
 * any nuclear facility.
 */

package neqsimserver2.Util;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class SecurityFilter implements Filter{
    
    /** Creates a new instance of SecurityFilter */
    private final static String FILTER_APPLIED = "_security_filter_applied";
    
    public SecurityFilter() {
    }
    
    
    public void init(FilterConfig filterConfig) {
        
    }
    
    
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws java.io.IOException, ServletException{
        
        HttpServletRequest req = (HttpServletRequest)request;
        HttpServletResponse res = (HttpServletResponse)response;
        HttpSession session = req.getSession();
        
        String requestedPage = req.getPathTranslated();
        String user=null;
        
        //We dont want to filter certain pages which include the Login.jsp/Register.jsp/Help.jsp
        System.out.println("here I am...");
        //   if(request.getAttribute(FILTER_APPLIED) == null) {
        request.setAttribute(FILTER_APPLIED, Boolean.TRUE);
        //check if the page requested is the login page or register page
        if((!requestedPage.endsWith("Login.jsp"))){
            //Requested page is not login.jsp or register.jsp therefore check for user logged in..
            //set the FILTER_APPLIED attribute to true
            request.setAttribute(FILTER_APPLIED, Boolean.TRUE);
            //Check that the session bean is not null and get the session bean property username.
//                if(((jaasauthentication.SessionBean1)session.getAttribute("SessionBean1"))!=null) {
//                    user = ((jaasauthentication.SessionBean1)session.getAttribute("SessionBean1")).getUsername();
//                }
            System.out.println("here I am...");
//                if((user==null)||(user.equals(""))) {
//                    res.sendRedirect("Login.jsp");
//                    return;
//                }
            if(((neqsimserver2.SessionBean1)session.getAttribute("SessionBean1"))!=null) {
                if(!((neqsimserver2.SessionBean1)session.getAttribute("SessionBean1")).getLoginBean().isLoginGood()){
                    System.out.println("logon failed");
                    res.sendRedirect("/neqsimserver2");
                    return;
                }
            } else{
                res.sendRedirect("/neqsimserver2");
                return;
            }
        }
        
        //deliver request to next filter
        chain.doFilter(request, response);
        
    }
    
    public void destroy(){
        
    }
}