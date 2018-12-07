<?xml version="1.0" encoding="windows-1252"?>
<!-- 
    Document   : PhaseEnvelope2
    Created on : 13.mar.2013, 18:31:26
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
                        <h:outputText id="gergWaterMenuText1" style="font-size: 24px; height: 24px; left: 264px; top: 24px; position: absolute; width: 336px"
                            styleClass="title1" value="Phase Envelope Calculation"/>
                        <h:outputText id="pressureTextField1" style="height: 26px; left: 264px; top: 96px; position: absolute; width: 168px" value="Min. Pressure [bar]"/>
                        <h:commandButton action="#{Thermo$PhaseEnvelope2.okButton_action}" id="okButton"
                            style="height: 24px; left: 408px; top: 360px; position: absolute; width: 72px" value="OK"/>
                        <h:inputText binding="#{Thermo$PhaseEnvelope2.minimumPressureTextInputField}" id="minimumPressureTextInputField"
                            style="height: 24px; left: 456px; top: 96px; position: absolute; width: 120px" value="1.0"/>
                        <h:outputText id="tpFlashSelectorText1" style="height: 30px; left: 264px; top: 216px; position: absolute; width: 286px" title="" value="Hydrocarbon Phase Enevelope"/>
                        <h:outputText id="dewPointText1" style="height: 30px; left: 264px; top: 240px; position: absolute; width: 286px" value="Aqueous Dew Point Line"/>
                        <h:selectBooleanCheckbox binding="#{Thermo$PhaseEnvelope2.hydrocarbonLineCheckBox}" id="hydrocarbonLineCheckBox"
                            style="height: 24px; left: 552px; top: 216px; position: absolute; width: 24px" value="true"/>
                        <h:selectBooleanCheckbox binding="#{Thermo$PhaseEnvelope2.aqueousLineCheckBox}" id="aqueousLineCheckBox" style="height: 24px; left: 552px; top: 240px; position: absolute; width: 24px"/>
                        <h:outputText id="dewPointText2" style="height: 30px; left: 264px; top: 264px; position: absolute; width: 286px" value="Hydrate Formation Line"/>
                        <h:selectBooleanCheckbox binding="#{Thermo$PhaseEnvelope2.hydrateLineCheckBox}" id="hydrateLineCheckBox" style="height: 24px; left: 552px; top: 264px; position: absolute; width: 24px"/>
                        <div style="height: 48px; left: 24px; top: 216px; position: absolute; width: 48px">
                            <jsp:directive.include file="ThermoMenu.jspf"/>
                        </div>
                        <h:outputText id="pressureTextField2" style="height: 26px; left: 264px; top: 144px; position: absolute; width: 168px" value="Max Pressure [bar]"/>
                        <h:inputText binding="#{Thermo$PhaseEnvelope2.maximumPressureTextField}" id="maximumPressureTextField"
                            style="height: 24px; left: 456px; top: 144px; position: absolute; width: 120px" value="200.0"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
