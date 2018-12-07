<?xml version="1.0" encoding="windows-1252"?>
<!-- 
    Document   : WaxTemperature3
    Created on : 09.apr.2013, 22:57:28
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
                        <h:graphicImage height="192" id="imageNeqSIm1" style="left: 24px; top: 24px; position: absolute" value="../resources/neqsim_logo.jpg" width="192"/>
                        <h:outputText id="gergWaterMenuText1" style="font-size: 24px; height: 24px; left: 264px; top: 24px; position: absolute; width: 336px" value="WAT calculation"/>
                        <h:outputText id="pressureTextField1" style="height: 24px; left: 264px; top: 120px; position: absolute; width: 120px" value="Pressure [bar]"/>
                        <h:inputText binding="#{Thermo$WaxTemperature3.pressureTextInputField}" converter="#{Thermo$BubblePoint2.doubleConverter1}"
                            id="pressureTextInputField" required="true" style="height: 24px; left: 408px; top: 120px; position: absolute; width: 192px"
                            validator="#{Thermo$WaxTemperature3.doubleRangeValidator1.validate}" value="1.0"/>
                        <ui:button action="#{Thermo$WaxTemperature3.okButton1_action}" id="okButton1"
                            style="height: 24px; left: 407px; top: 168px; position: absolute; width: 72px" text="Ok"/>
                        <ui:staticText id="staticText1" style="height: 24px; left: 264px; top: 240px; position: absolute; width: 238px" text="Wax apperance temperature [WAT] [°C]:"/>
                        <ui:staticText binding="#{Thermo$WaxTemperature3.waxTemperatureTextField}" id="waxTemperatureTextField"
                            style="height: 24px; left: 504px; top: 240px; position: absolute; width: 96px" text="NaN"/>
                        <div style="height: 48px; left: 24px; top: 216px; position: absolute; width: 96px">
                            <jsp:directive.include file="ThermoMenu.jspf"/>
                        </div>
                        <ui:messageGroup id="messageGroup1" style="height: 240px; left: 648px; top: 72px; position: absolute; width: 336px"/>
                        <ui:staticText id="staticText2" style="height: 24px; left: 264px; top: 72px; position: absolute; width: 360px" text="Calculation of wax apperance temperature at given pressure"/>
                        <div style="height: 48px; left: 264px; top: 336px; position: absolute; width: 144px">
                            <jsp:directive.include file="DocumentStatistics.jspf"/>
                        </div>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
