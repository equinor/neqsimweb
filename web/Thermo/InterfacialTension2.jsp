<?xml version="1.0" encoding="windows-1252"?>
<!-- 
    Document   : InterfacialTension2
    Created on : 31.mai.2013, 23:18:15
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
                        <h:outputText id="outputText1" style="height: 32px; left: 240px; top: 24px; position: absolute; width: 958px" styleClass="title1"
                            title="title1" value="Interfacial Tension Calculation"/>
                        <ui:messageGroup id="messageGroup1" style="position: absolute; left: 696px; top: 96px; width: 360px; height: 216px"/>
                        <ui:staticText id="staticText1" style="height: 24px; left: 240px; top: 72px; position: absolute; width: 432px" text="Interfacial tesion will be calculated based on gradient theory. This method"/>
                        <ui:staticText id="staticText2" style="height: 24px; left: 240px; top: 96px; position: absolute; width: 432px" text="is computational demanding, but beleived to be the most accurate."/>
                        <h:inputText binding="#{Thermo$InterfacialTension2.pressureTextField}" id="pressureTextField"
                            style="height: 24px; left: 504px; top: 192px; position: absolute; width: 168px"
                            validator="#{Thermo$InterfacialTension2.doubleRangeValidator1.validate}" value="1.0"/>
                        <h:outputText id="pressureTextField2" style="height: 24px; left: 240px; top: 192px; position: absolute; width: 214px" value="Pressure [bar]"/>
                        <ui:button action="#{Thermo$InterfacialTension2.button1_action}" id="button1"
                            style="height: 24px; left: 383px; top: 240px; position: absolute; width: 96px" text="Ok"/>
                        <h:outputText id="pressureTextField3" style="height: 24px; left: 240px; top: 144px; position: absolute; width: 214px" value="Temperature [C]"/>
                        <h:inputText binding="#{Thermo$InterfacialTension2.temperatureTextField}" id="temperatureTextField" required="true"
                            style="height: 24px; left: 504px; top: 144px; position: absolute; width: 168px"
                            validator="#{Thermo$InterfacialTension2.doubleRangeValidator1.validate}" value="25" valueChangeListener="#{Thermo$InterfacialTension2.temperatureTextField_processValueChange}"/>
                        <div style="height: 48px; left: 24px; top: 216px; position: absolute; width: 72px">
                            <jsp:directive.include file="ThermoMenu.jspf"/>
                            <div></div>
                        </div>
                       <div style="height: 48px; left: 240px; top: 360px; position: absolute; width: 120px">
                            <jsp:directive.include file="DocumentStatistics.jspf"/>
                        </div>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
