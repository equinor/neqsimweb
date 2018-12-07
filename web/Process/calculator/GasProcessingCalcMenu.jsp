<?xml version="1.0" encoding="windows-1252"?>
<!-- 
    Document   : GasProcessingCalcMenu
    Created on : 27.jun.2009, 21:55:24
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
                        <ui:staticText id="staticText1" style="left: 288px; top: 312px; position: absolute; width: 480px" styleClass="body-text" text="The results will normally display automatically. Eventually press view results."/>
                        <ui:staticText id="staticText2" style="left: 240px; top: 288px; position: absolute" styleClass="body-text" text="3. View Results"/>
                        <ui:staticText id="staticText3" style="left: 288px; top: 264px; position: absolute" styleClass="body-text" text="Available operations are: TP-flash, dew point, hydrate,etc."/>
                        <ui:staticText id="staticText4" style="left: 240px; top: 240px; position: absolute" styleClass="body-text" text="2. Select thermodynamic operation"/>
                        <ui:staticText id="staticText5" style="left: 288px; top: 192px; position: absolute" styleClass="body-text" text="Previos fluid compositions are store in a database. &#xa;&#x9;"/>
                        <ui:staticText id="staticText6" style="left: 288px; top: 216px; position: absolute" styleClass="body-text" text="Relevant experimental data can also be stored with the fluid."/>
                        <ui:staticText id="staticText7" style="left: 240px; top: 168px; position: absolute" styleClass="body-text" text="1. Select or enter a new fluid composition"/>
                        <ui:staticText id="staticText8" style="left: 240px; top: 144px; position: absolute" styleClass="body-text" text="The nesessary steps to run a calculation are:"/>
                        <h:outputText id="outputText1" style="height: 46px; left: 240px; top: 72px; position: absolute; width: 552px" styleClass="body-text" value="Select fluid and operation from the left menu.  Select view reults to open report of calculated values."/>
                        <h:outputText id="logoOutputText1" style="height: 25px; left: 240px; top: 24px; position: absolute; width: 552px" styleClass="title1" value="Gas Processing Unit Operation Calculator"/>
                        <div style="position: absolute; left: 24px; top: 216px; width: 48px; height: 24px">
                            <jsp:directive.include file="../ProcessLeftMenuPage.jspf"/>
                        </div>
                        <div style="position: absolute; left: 24px; top: 408px; width: 48px; height: 24px">
                            <jsp:directive.include file="GasProcessCalcRightMenu2.jspf"/>
                        </div>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
