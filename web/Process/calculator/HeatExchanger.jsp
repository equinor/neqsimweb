<?xml version="1.0" encoding="windows-1252"?>
<!-- 
    Document   : HeatExchanger
    Created on : 03.jul.2009, 11:05:08
    Author     : esol
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
                        <div style="height: 48px; left: 24px; top: 216px; position: absolute; width: 48px">
                            <jsp:directive.include file="../ProcessLeftMenuPage.jspf"/>
                        </div>
                        <div style="height: 24px; left: 24px; top: 408px; position: absolute; width: 24px">
                            <jsp:directive.include file="GasProcessCalcRightMenu2.jspf"/>
                        </div>
                        <h:outputText id="outputText1" style="left: 240px; top: 24px; position: absolute" styleClass="title1" title="title1" value="Heat Exchanger"/>
                        <ui:staticText id="staticText1" style="height: 24px; left: 240px; top: 120px; position: absolute; width: 214px" text="Temperature in"/>
                        <ui:staticText id="staticText2" style="height: 24px; left: 240px; top: 168px; position: absolute; width: 214px" text="Pressure in"/>
                        <ui:textField binding="#{Process$calculator$HeatExchanger.temperatureInTextField}"
                            converter="#{Process$calculator$HeatExchanger.doubleConverter1}" id="temperatureInTextField"
                            style="height: 24px; left: 456px; top: 120px; position: absolute; width: 144px" text="20.0"/>
                        <ui:staticText id="staticText3" style="height: 24px; left: 624px; top: 120px; position: absolute; width: 96px" text="[C]"/>
                        <ui:textField binding="#{Process$calculator$HeatExchanger.pressureInTextField}"
                            converter="#{Process$calculator$HeatExchanger.doubleConverter1}" id="pressureInTextField"
                            style="height: 24px; left: 456px; top: 168px; position: absolute; width: 144px" text="1.0"/>
                        <ui:staticText id="staticText4" style="height: 24px; left: 624px; top: 168px; position: absolute; width: 96px" text="[bar]"/>
                        <ui:staticText id="staticText5" style="height: 24px; left: 240px; top: 240px; position: absolute; width: 214px" text="Temperature out"/>
                        <ui:staticText id="staticText6" style="height: 24px; left: 240px; top: 288px; position: absolute; width: 214px" text="Pressure drop (dP)"/>
                        <ui:textField binding="#{Process$calculator$HeatExchanger.temperatureOutTextField}"
                            converter="#{Process$calculator$HeatExchanger.doubleConverter1}" id="temperatureOutTextField"
                            style="height: 24px; left: 456px; top: 240px; position: absolute; width: 144px" text="10.0"/>
                        <ui:staticText id="staticText7" style="height: 24px; left: 624px; top: 240px; position: absolute; width: 96px" text="[C]"/>
                        <ui:textField binding="#{Process$calculator$HeatExchanger.pressureDropTextField}"
                            converter="#{Process$calculator$HeatExchanger.doubleConverter1}" id="pressureDropTextField"
                            style="height: 24px; left: 456px; top: 288px; position: absolute; width: 144px" text="0.1"/>
                        <ui:staticText id="staticText8" style="height: 24px; left: 624px; top: 288px; position: absolute; width: 96px" text="[bar]"/>
                        <ui:button action="#{Process$calculator$HeatExchanger.calculateButton_action}" id="calculateButton1"
                            style="left: 456px; top: 336px; position: absolute; width: 95px" text="Calculate"/>
                        <h:dataTable binding="#{Process$calculator$HeatExchanger.resultsTable}" headerClass="list-header" id="resultsTable"
                            rowClasses="list-row-even,list-row-odd" style="height: 27px; left: 240px; top: 432px; position: absolute"
                            value="#{Thermo$ThermoSessionBean.resultTable}" var="currentRow" width="696">
                            <h:column id="column1">
                                <h:outputText id="outputText2" value="#{currentRow[0]}"/>
                                <f:facet name="header">
                                    <h:outputText id="outputText3" value="Property"/>
                                </f:facet>
                            </h:column>
                            <h:column id="column2">
                                <h:outputText id="outputText4" value="#{currentRow[1]}"/>
                                <f:facet name="header">
                                    <h:outputText id="outputText5" value="Phase 1"/>
                                </f:facet>
                            </h:column>
                            <h:column id="column3">
                                <h:outputText id="outputText6" value="#{currentRow[2]}"/>
                                <f:facet name="header">
                                    <h:outputText id="outputText7" value="Phase 2"/>
                                </f:facet>
                            </h:column>
                            <h:column id="column4">
                                <h:outputText id="outputText8" value="#{currentRow[3]}"/>
                                <f:facet name="header">
                                    <h:outputText id="outputText9" value="Phase 3"/>
                                </f:facet>
                            </h:column>
                            <h:column id="column5">
                                <h:outputText id="outputText10" value="#{currentRow[4]}"/>
                                <f:facet name="header">
                                    <h:outputText id="outputText11" value="Unit"/>
                                </f:facet>
                            </h:column>
                        </h:dataTable>
                        <ui:staticText id="staticText9" style="height: 24px; left: 240px; top: 384px; position: absolute; width: 214px" text="Heat/cooling duty"/>
                        <ui:staticText binding="#{Process$calculator$HeatExchanger.dutyField}" converter="#{Process$calculator$Compressor.doubleConverter1}"
                            id="dutyField" style="height: 24px; left: 456px; top: 384px; position: absolute; width: 168px" text="-"/>
                        <ui:staticText id="staticText10" style="height: 24px; left: 624px; top: 384px; position: absolute; width: 96px" text="[W]"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
