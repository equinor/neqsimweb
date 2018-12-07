<?xml version="1.0" encoding="windows-1252"?>
<!-- 
    Document   : LNGFreezingCalculation2
    Created on : 02.jul.2008, 12:31:06
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
                        <h:outputText id="outputText1" style="left: 240px; top: 24px; position: absolute" styleClass="title1" title="title1" value="Freezeout Calculation"/>
                        <h:outputText id="outputText2" style="left: 240px; top: 96px; position: absolute; width: 432px" styleClass="body-text" value="Select component to calculate freezing point. Specify pressure and initial temperature guess."/>
                        <ui:textField binding="#{Thermo$FreezingCalculation.temperatureTextField}" id="temperatureTextField"
                            style="height: 24px; left: 384px; top: 168px; position: absolute; width: 168px" text="0.0"/>
                        <ui:staticText id="staticText1" style="height: 24px; left: 240px; top: 168px; position: absolute; width: 120px" text="Temperature"/>
                        <ui:staticText id="staticText2" style="height: 24px; left: 240px; top: 216px; position: absolute; width: 120px" text="Pressure"/>
                        <ui:textField binding="#{Thermo$FreezingCalculation.pressureTextFIeld}" id="pressureTextFIeld"
                            style="height: 24px; left: 384px; top: 216px; position: absolute; width: 168px" text="1.0"/>
                        <ui:staticText id="staticText3" style="height: 24px; left: 576px; top: 168px; position: absolute; width: 48px" text="[C]"/>
                        <ui:staticText id="staticText4" style="height: 24px; left: 576px; top: 216px; position: absolute; width: 48px" text="[bara]"/>
                        <ui:radioButtonGroup binding="#{Thermo$FreezingCalculation.componentButtonGroup}" id="componentButtonGroup"
                            items="#{Thermo$FreezingCalculation.componentButtonGroupDefaultOptions.options}" required="true"
                            selected="#{Thermo$FreezingCalculation.componentButtonGroupDefaultOptions.selectedValue}"
                            style="height: 168px; left: 240px; top: 288px; position: absolute; width: 192px" valueChangeListener="#{Thermo$FreezingCalculation.componentButtonGroup_processValueChange}"/>
                        <ui:button action="#{Thermo$FreezingCalculation.button1_action}" id="button1"
                            style="height: 24px; left: 359px; top: 504px; position: absolute; width: 72px" text="OK"/>
                        <ui:staticText id="staticText5" style="height: 24px; left: 240px; top: 552px; position: absolute; width: 190px" text="Solid formation temperature"/>
                        <ui:staticText binding="#{Thermo$FreezingCalculation.freezingPointTemperatureTextFIeld}" id="freezingPointTemperatureTextFIeld"
                            style="color: rgb(255, 0, 0); height: 24px; left: 432px; top: 552px; position: absolute; width: 96px" text="NaN"/>
                        <ui:staticText id="staticText6" style="height: 24px; left: 528px; top: 552px; position: absolute; width: 72px" text="[C]"/>
                        <ui:messageGroup id="messageGroup1" style="position: absolute; left: 672px; top: 168px; width: 168px; height: 168px"/>
                        <ui:staticText id="staticText7" style="height: 24px; left: 240px; top: 264px; position: absolute; width: 190px" text="Solid phase"/>
                        <div style="position: absolute; left: 24px; top: 216px; width: 168px; height: 96px">
                            <jsp:directive.include file="ThermoMenu.jspf"/>
                        </div>
                        <div style="height: 24px; left: 240px; top: 744px; position: absolute; width: 96px">
                            <jsp:directive.include file="DocumentStatistics.jspf"/>
                        </div>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
