<?xml version="1.0" encoding="windows-1252"?>
<!-- 
    Document   : LNGcustodyTransfer
    Created on : 17.mar.2009, 21:37:40
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
                        <div style="height: 48px; left: 24px; top: 216px; position: absolute; width: 72px">
                            <jsp:directive.include file="../LNGLeftMenuPage.jspf"/>
                        </div>
                        <h:outputText id="outputText1" style="left: 264px; top: 24px; position: absolute" styleClass="title1" title="title1" value="LNG custody transfer"/>
                        <ui:staticText id="staticText1" style="height: 24px; left: 264px; top: 96px; position: absolute; width: 214px" text="Loaded/unloaded volume LNG "/>
                        <ui:textField id="textField1" style="height: 24px; left: 480px; top: 96px; position: absolute; width: 144px"/>
                        <ui:staticText id="staticText2" style="height: 24px; left: 648px; top: 96px; position: absolute; width: 48px" text="m^3"/>
                        <ui:staticText id="staticText3" style="height: 24px; left: 264px; top: 144px; position: absolute; width: 214px" text="Density of loaded/unloaded  LNG"/>
                        <ui:textField id="textField2" style="height: 24px; left: 480px; top: 144px; position: absolute; width: 144px"/>
                        <ui:staticText id="staticText4" style="height: 24px; left: 648px; top: 144px; position: absolute; width: 48px" text="kg/m^3"/>
                        <ui:hyperlink action="#{LNG$Calculator$LNGcustodyTransfer.hyperlink1_action}" id="hyperlink1"
                            style="height: 24px; left: 720px; top: 144px; position: absolute; width: 70px" text="Calculate"/>
                        <ui:staticText id="staticText5" style="height: 24px; left: 264px; top: 192px; position: absolute; width: 214px" text="Returned gas volume LNG (boil off)"/>
                        <ui:textField id="textField3" style="height: 24px; left: 480px; top: 192px; position: absolute; width: 144px"/>
                        <ui:staticText id="staticText6" style="height: 24px; left: 648px; top: 192px; position: absolute; width: 48px" text="m^3"/>
                        <ui:button id="button1" style="height: 24px; left: 479px; top: 240px; position: absolute; width: 72px" text="Calculate"/>
                        <ui:staticText id="staticText7" style="height: 24px; left: 264px; top: 288px; position: absolute; width: 144px" text="Total  energy transfered"/>
                        <ui:staticText id="staticText8" style="height: 24px; left: 480px; top: 288px; position: absolute; width: 144px" text="NaN"/>
                        <ui:staticText id="staticText9" style="height: 24px; left: 648px; top: 288px; position: absolute; width: 96px" text="kWh"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
