<?xml version="1.0" encoding="windows-1252"?>
<!-- 
    Document   : Separator
    Created on : 27.jun.2009, 22:48:40
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
                        <div style="position: absolute; left: 24px; top: 216px; width: 48px; height: 48px">
                            <jsp:directive.include file="../ProcessLeftMenuPage.jspf"/>
                        </div>
                        <div style="position: absolute; left: 24px; top: 408px; width: 24px; height: 24px">
                            <jsp:directive.include file="GasProcessCalcRightMenu2.jspf"/>
                        </div>
                        <h:outputText id="outputText1" style="left: 240px; top: 24px; position: absolute" styleClass="title1" title="title1" value="Separator"/>
                        <ui:staticText id="staticText1" style="height: 24px; left: 240px; top: 96px; position: absolute; width: 94px" text="Temperature"/>
                        <ui:staticText id="staticText2" style="height: 24px; left: 240px; top: 168px; position: absolute; width: 94px" text="Pressure"/>
                        <ui:textField binding="#{Process$calculator$Separator.temperatureTextField}"
                            converter="#{Process$calculator$Separator.doubleConverter1}" id="temperatureTextField" required="true"
                            style="height: 24px; left: 336px; top: 96px; position: absolute; width: 168px" text="20.0"/>
                        <ui:staticText id="staticText3" style="height: 24px; left: 528px; top: 96px; position: absolute; width: 96px" text="[C]"/>
                        <ui:textField binding="#{Process$calculator$Separator.pressureTextField}" converter="#{Process$calculator$Separator.doubleConverter1}"
                            id="pressureTextField" required="true" style="height: 24px; left: 336px; top: 168px; position: absolute; width: 168px" text="1.0"/>
                        <ui:staticText id="staticText4" style="height: 24px; left: 528px; top: 168px; position: absolute; width: 96px" text="[bar]"/>
                        <ui:button action="#{Process$calculator$Separator.calculateButton_action}" id="calculateButton"
                            style="left: 335px; top: 240px; position: absolute; width: 96px" text="Calculate"/>
                        <h:dataTable binding="#{Process$calculator$Separator.resultsTable}" headerClass="list-header" id="resultsTable"
                            rowClasses="list-row-even,list-row-odd" style="height: 27px; left: 264px; top: 288px; position: absolute"
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
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
