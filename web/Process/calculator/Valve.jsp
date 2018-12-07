<?xml version="1.0" encoding="windows-1252"?>
<!-- 
    Document   : Valve
    Created on : 01.jul.2009, 12:45:41
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
                        <h:outputText id="outputText1" style="left: 240px; top: 24px; position: absolute" styleClass="title1" title="title1" value="Valve"/>
                        <ui:staticText id="staticText1" style="height: 24px; left: 240px; top: 96px; position: absolute; width: 214px" text="Temperature in"/>
                        <ui:staticText id="staticText2" style="height: 24px; left: 240px; top: 144px; position: absolute; width: 214px" text="Pressure in"/>
                        <ui:textField binding="#{Process$calculator$Valve.temperatureTextField}" converter="#{Process$calculator$Valve.doubleConverter1}"
                            id="temperatureTextField" required="true" style="height: 24px; left: 456px; top: 96px; position: absolute; width: 168px" text="20.0"/>
                        <ui:staticText id="staticText3" style="height: 24px; left: 648px; top: 96px; position: absolute; width: 96px" text="[C]"/>
                        <ui:textField binding="#{Process$calculator$Valve.pressureTextField}" converter="#{Process$calculator$Valve.doubleConverter1}"
                            id="pressureTextField" required="true" style="height: 24px; left: 456px; top: 144px; position: absolute; width: 168px" text="10.0"/>
                        <ui:staticText id="staticText4" style="height: 24px; left: 648px; top: 144px; position: absolute; width: 96px" text="[bar]"/>
                        <ui:button action="#{Process$calculator$Valve.calculateButton_action}" id="calculateButton1"
                            style="left: 455px; top: 240px; position: absolute; width: 96px" text="Calculate"/>
                        <h:dataTable binding="#{Process$calculator$Valve.resultsTable}" headerClass="list-header" id="resultsTable" rendered="false"
                            rowClasses="list-row-even,list-row-odd" style="height: 27px; left: 240px; top: 336px; position: absolute"
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
                        <ui:staticText id="staticText5" style="height: 24px; left: 240px; top: 192px; position: absolute; width: 214px" text="Pressure out"/>
                        <ui:textField binding="#{Process$calculator$Valve.pressureOutTextField}" converter="#{Process$calculator$Valve.doubleConverter1}"
                            id="pressureOutTextField" required="true" style="height: 24px; left: 456px; top: 192px; position: absolute; width: 168px" text="5.0"/>
                        <ui:staticText id="staticText7" style="height: 24px; left: 648px; top: 192px; position: absolute; width: 96px" text="[bar]"/>
                        <ui:staticText id="staticText6" style="height: 24px; left: 240px; top: 288px; position: absolute; width: 214px" text="Temperature out"/>
                        <ui:staticText binding="#{Process$calculator$Valve.temperatureOutText}" id="temperatureOutText" style="height: 24px; left: 456px; top: 288px; position: absolute; width: 168px"/>
                        <ui:staticText id="staticText9" style="height: 24px; left: 624px; top: 288px; position: absolute; width: 96px" text="[C]"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
