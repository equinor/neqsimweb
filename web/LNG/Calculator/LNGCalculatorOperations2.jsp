<?xml version="1.0" encoding="windows-1252"?>
<!-- 
    Document   : LNGCalculatorOperations2
    Created on : 02.jul.2008, 12:25:16
    Author     : ESOL
-->
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=windows-1252" pageEncoding="windows-1252"/>
    <f:view>
        <ui:page id="page1">
            <ui:html id="html1">
                <ui:head id="head1">
                    <ui:link id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body id="body1" style="-rave-layout: grid">
                    <ui:form id="form1">
                        <h:graphicImage height="192" id="image1" style="left: 24px; top: 24px; position: absolute" value="/resources/neqsim_logo.jpg" width="192"/>
                        <h:outputText id="outputText1" style="left: 240px; top: 24px; position: absolute" styleClass="title1" title="title1" value="LNG Process Calculations"/>
                        <h:outputText id="outputText2" style="left: 240px; top: 96px; position: absolute; width: 432px" styleClass="body-text" value="Calculations using automatic (best practice) model selection"/>
                        <h:commandLink action="#{LNG$Calculator$LNGCalculatorOperations2.LNGfreezeLinkaction}" id="LNGReezeLink"
                            style="font-size: 14px; height: 28px; left: 240px; top: 120px; position: absolute; width: 432px" styleClass="body-text-hyperlink-box">
                            <h:outputText id="linkAction2Text1" styleClass="body-text-hyperlink-box" value="LNG freezeout calculation"/>
                        </h:commandLink>
                        <h:commandLink action="#{LNG$Calculator$LNGCalculatorOperations2.LNGdensityLinkAction}" id="LNGdensityLink"
                            style="font-size: 14px; height: 28px; left: 240px; top: 144px; position: absolute; width: 432px" styleClass="body-text-hyperlink-box">
                            <h:outputText id="linkAction2Text2" styleClass="body-text-hyperlink-box" value="LNG density calculation (Klosek-McKinley method)"/>
                        </h:commandLink>
                        <div style="position: absolute; left: 24px; top: 216px; width: 144px; height: 96px">
                            <jsp:directive.include file="../LNGLeftMenuPage.jspf"/>
                        </div>
                        <h:commandLink action="#{LNG$Calculator$LNGCalculatorOperations2.LNGshipAgeing_action}" id="LNGshipAgeing"
                            style="font-size: 14px; height: 28px; left: 240px; top: 168px; position: absolute; width: 432px" styleClass="body-text-hyperlink-box">
                            <h:outputText id="linkAction2Text3" styleClass="body-text-hyperlink-box" value="LNG ship ageing "/>
                        </h:commandLink>
                        <h:outputText id="outputText3" style="left: 240px; top: 216px; position: absolute; width: 432px" styleClass="body-text" value="LNG custody transfer calculation"/>
                        <h:commandLink action="#{LNG$Calculator$LNGCalculatorOperations2.lngCustodyTrans_action}" id="lngCustodyTrans"
                            style="font-size: 14px; height: 28px; left: 240px; top: 240px; position: absolute; width: 432px" styleClass="body-text-hyperlink-box">
                            <h:outputText id="linkAction2Text4" styleClass="body-text-hyperlink-box" value="LNG custody transfer"/>
                        </h:commandLink>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
