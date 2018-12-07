<?xml version="1.0" encoding="windows-1252"?>
<!-- 
    Document   : AdsorptionCalc
    Created on : 02.jun.2013, 08:07:41
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
                        <h:outputText id="outputText1" style="height: 32px; left: 240px; top: 24px; position: absolute; width: 238px" styleClass="title1"
                            title="title1" value="Adsorption"/>
                        <ui:staticText id="staticText1" style="height: 24px; left: 240px; top: 72px; position: absolute; width: 432px" text="Adsorption  will be calculated based on potetial theory. This method"/>
                        <ui:staticText id="staticText2" style="height: 24px; left: 240px; top: 96px; position: absolute; width: 432px" text="is computational demanding, but beleived to be accurate."/>
                        <h:outputText id="pressureTextField1" style="height: 24px; left: 240px; top: 192px; position: absolute; width: 214px" value="Pressure [bar]"/>
                        <ui:button action="#{Thermo$AdsorptionCalc.button1_action}" id="button1"
                            style="height: 24px; left: 407px; top: 384px; position: absolute; width: 96px" text="Ok"/>
                        <h:outputText id="pressureTextField2" style="height: 24px; left: 240px; top: 144px; position: absolute; width: 214px" value="Temperature [C]"/>
                        <ui:textField id="temperatureTextField" style="position: absolute; left: 456px; top: 144px; width: 216px; height: 24px" text="25" validator="#{Thermo$AdsorptionCalc.doubleRangeValidator1.validate}"/>
                        <ui:textField id="pressureTextField" style="height: 24px; left: 456px; top: 192px; position: absolute; width: 216px" text="1.0" validator="#{Thermo$AdsorptionCalc.doubleRangeValidator1.validate}"/>
                        <ui:radioButtonGroup id="radioButtonGroup1" items="#{Thermo$AdsorptionCalc.radioButtonGroup1DefaultOptions.options}" style="height: 120px; left: 240px; top: 240px; position: absolute; width: 432px"/>
                        <div style="position: absolute; left: 240px; top: 504px; width: 312px; height: 96px">
                            <jsp:directive.include file="DocumentStatistics.jspf"/>
                        </div>
                        <div style="position: absolute; left: 24px; top: 216px; width: 96px; height: 72px">
                            <jsp:directive.include file="ThermoMenu.jspf"/>
                        </div>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
