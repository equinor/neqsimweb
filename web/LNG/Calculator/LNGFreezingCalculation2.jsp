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
                        <h:outputText id="outputText1" style="left: 240px; top: 24px; position: absolute" styleClass="title1" title="title1" value="LNG Freezeout Calculation"/>
                        <h:outputText id="outputText2" style="left: 240px; top: 96px; position: absolute; width: 432px" styleClass="body-text" value="Select component to calculate freezing point. Specify pressure and initial temperature guess."/>
                        <ui:textField binding="#{LNG$Calculator$LNGFreezingCalculation2.temperatureTextField}" id="temperatureTextField"
                            style="height: 24px; left: 384px; top: 168px; position: absolute; width: 168px" text="0.0"/>
                        <ui:staticText id="staticText1" style="height: 24px; left: 240px; top: 168px; position: absolute; width: 120px" text="Temperature"/>
                        <ui:staticText id="staticText2" style="height: 24px; left: 240px; top: 216px; position: absolute; width: 120px" text="Pressure"/>
                        <ui:textField binding="#{LNG$Calculator$LNGFreezingCalculation2.pressureTextFIeld}" id="pressureTextFIeld"
                            style="height: 24px; left: 384px; top: 216px; position: absolute; width: 168px" text="1.0"/>
                        <ui:staticText id="staticText3" style="height: 24px; left: 576px; top: 168px; position: absolute; width: 48px" text="[C]"/>
                        <ui:staticText id="staticText4" style="height: 24px; left: 576px; top: 216px; position: absolute; width: 48px" text="[bara]"/>
                        <ui:radioButtonGroup binding="#{LNG$Calculator$LNGFreezingCalculation2.componentButtonGroup}" id="componentButtonGroup"
                            items="#{LNG$Calculator$LNGFreezingCalculation2.componentButtonGroupDefaultOptions.options}"
                            style="height: 144px; left: 384px; top: 264px; position: absolute; width: 168px" valueChangeListener="#{LNG$Calculator$LNGFreezingCalculation2.componentButtonGroup_processValueChange}"/>
                        <ui:button action="#{LNG$Calculator$LNGFreezingCalculation2.button1_action}" id="button1"
                            style="height: 24px; left: 383px; top: 432px; position: absolute; width: 72px" text="OK"/>
                        <ui:staticText id="staticText5" style="height: 24px; left: 240px; top: 480px; position: absolute; width: 166px" text="Freezing point temperature"/>
                        <ui:staticText binding="#{LNG$Calculator$LNGFreezingCalculation2.freezingPointTemperatureTextFIeld}"
                            id="freezingPointTemperatureTextFIeld"
                            style="color: rgb(255, 0, 0); height: 24px; left: 408px; top: 480px; position: absolute; width: 96px" text="NaN"/>
                        <ui:staticText id="staticText6" style="height: 24px; left: 504px; top: 480px; position: absolute; width: 72px" text="[C]"/>
                        <div style="position: absolute; left: 24px; top: 216px; width: 48px; height: 48px">
                            <jsp:directive.include file="../LNGLeftMenuPage.jspf"/>
                        </div>
                        <ui:messageGroup id="messageGroup1" style="position: absolute; left: 672px; top: 168px; width: 168px; height: 168px"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
