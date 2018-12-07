<?xml version="1.0" encoding="windows-1252"?>
<!-- 
    Document   : SaturateWithWater
    Created on : 16.apr.2013, 08:46:22
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
                        <h:graphicImage height="192" id="imageNeqSIm1" style="left: 24px; top: 24px; position: absolute" value="/resources/neqsim_logo.jpg" width="192"/>
                        <h:outputText id="gergWaterMenuText1" style="font-size: 18px; height: 24px; left: 240px; top: 24px; position: absolute; width: 336px" value="Saturate with water"/>
                        <div style="height: 48px; left: 24px; top: 216px; position: absolute; width: 72px">
                            <jsp:directive.include file="ThermoMenu.jspf"/>
                        </div>
                        <div style="height: 24px; left: 240px; top: 480px; position: absolute; width: 48px">
                            <jsp:directive.include file="DocumentStatistics.jspf"/>
                        </div>
                        <h:outputText id="temperatureLableText1" style="font-size: 14px; height: 26px; left: 240px; top: 96px; position: absolute; width: 168px" value="Temperature [C]"/>
                        <h:outputText id="pressureLabelText1" style="font-size: 14px; height: 26px; left: 240px; top: 144px; position: absolute; width: 168px" value="Pressure [bara]"/>
                        <h:inputText binding="#{Thermo$SaturateWithWater.temperatureTextField}" id="temperatureTextField"
                            style="height: 24px; left: 432px; top: 96px; position: absolute; width: 216px" value="25"/>
                        <h:inputText binding="#{Thermo$SaturateWithWater.pressureTextField}" id="pressureTextField"
                            style="height: 24px; left: 432px; top: 144px; position: absolute; width: 216px" value="1.0"/>
                        <h:commandButton action="#{Thermo$SaturateWithWater.okFlashButton_action}" id="okFlashButton1"
                            style="height: 24px; left: 432px; top: 216px; position: absolute; width: 96px" value="OK"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
