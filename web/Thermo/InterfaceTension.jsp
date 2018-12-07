<?xml version="1.0" encoding="windows-1252"?>
<!-- 
    Document   : InterfaceTension
    Created on : 09.mar.2011, 12:09:16
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
                        <div style="height: 24px; left: 24px; top: 216px; position: absolute; width: 48px">
                            <jsp:directive.include file="ThermoMenu.jspf"/>
                        </div>
                        <h:outputText id="outputText1" style="height: 32px; left: 240px; top: 24px; position: absolute; width: 958px" styleClass="title1"
                            title="title1" value="Interfacial Tension Calculation"/>
                        <h:inputText binding="#{Thermo$InterfaceTension.pressureTextField}" id="pressureTextField"
                            style="height: 24px; left: 504px; top: 144px; position: absolute; width: 168px"
                            validator="#{Thermo$InterfaceTension.doubleRangeValidator1.validate}" value="1.0"/>
                        <h:outputText id="pressureTextField2" style="height: 24px; left: 240px; top: 144px; position: absolute; width: 214px" value="Pressure [bar]"/>
                        <ui:button action="#{Thermo$InterfaceTension.button1_action}" id="button1"
                            style="height: 24px; left: 383px; top: 264px; position: absolute; width: 96px" text="Ok"/>
                        <ui:staticText id="staticText1" style="height: 24px; left: 240px; top: 312px; position: absolute; width: 144px" text="Interfacial tension:"/>
                        <ui:staticText binding="#{Thermo$InterfaceTension.interfaceTensionValue}" id="interfaceTensionValue"
                            style="height: 24px; left: 504px; top: 312px; position: absolute; width: 118px" text="NaN"/>
                        <ui:messageGroup id="messageGroup1" style="height: 216px; left: 720px; top: 96px; position: absolute; width: 288px"/>
                        <ui:staticText id="staticText2" style="height: 24px; left: 576px; top: 312px; position: absolute; width: 96px" text="[mN/m]"/>
                        <ui:checkbox binding="#{Thermo$InterfaceTension.useGradientTheoryCheckbox}" id="useGradientTheoryCheckbox" label="Use Gradient Theory" style="left: 240px; top: 192px; position: absolute"/>
                        <h:outputText id="pressureTextField3" style="height: 24px; left: 240px; top: 96px; position: absolute; width: 214px" value="Temperature [C]"/>
                        <h:inputText binding="#{Thermo$InterfaceTension.temperatureTextField}" id="temperatureTextField" required="true"
                            style="height: 24px; left: 504px; top: 96px; position: absolute; width: 168px" value="5.0"/>
                        <div style="height: 96px; left: 240px; top: 480px; position: absolute; width: 216px">
                            <jsp:directive.include file="DocumentStatistics.jspf"/>
                        </div>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
