<?xml version="1.0" encoding="windows-1252"?>
<!-- 
    Document   : ProcessPipe
    Created on : 13.jul.2009, 11:01:36
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
                        <div style="height: 144px; left: 24px; top: 408px; position: absolute; width: 144px">
                            <jsp:directive.include file="GasProcessCalcRightMenu2.jspf"/>
                        </div>
                        <h:outputText id="logoOutputText1" style="height: 25px; left: 264px; top: 24px; position: absolute; width: 552px" styleClass="title1" value="Pipe (adiabatic)"/>
                        <ui:staticText id="staticText1" style="height: 24px; left: 264px; top: 168px; position: absolute; width: 120px" text="Length"/>
                        <ui:textField binding="#{Process$calculator$ProcessPipe.lengthTextField}" converter="#{Process$calculator$ProcessPipe.doubleConverter1}"
                            id="lengthTextField" style="height: 24px; left: 384px; top: 168px; position: absolute; width: 144px" text="100.0"/>
                        <ui:staticText id="staticText2" style="height: 24px; left: 552px; top: 168px; position: absolute; width: 72px" text="[m]"/>
                        <ui:staticText id="staticText3" style="height: 24px; left: 264px; top: 216px; position: absolute; width: 120px" text="Diameter"/>
                        <ui:textField binding="#{Process$calculator$ProcessPipe.diameterTextField}"
                            converter="#{Process$calculator$ProcessPipe.doubleConverter1}" id="diameterTextField"
                            style="height: 24px; left: 384px; top: 216px; position: absolute; width: 144px" text="0.5"/>
                        <ui:staticText id="staticText4" style="height: 24px; left: 552px; top: 216px; position: absolute; width: 72px" text="[m]"/>
                        <ui:button action="#{Process$calculator$ProcessPipe.button1_action}" id="button1"
                            style="height: 24px; left: 383px; top: 312px; position: absolute; width: 71px" text="Calculate"/>
                        <ui:staticText id="staticText5" style="height: 24px; left: 264px; top: 264px; position: absolute; width: 120px" text="Surface roughness"/>
                        <ui:textField binding="#{Process$calculator$ProcessPipe.surfaceRoughnessTextField}"
                            converter="#{Process$calculator$ProcessPipe.doubleConverter1}" id="surfaceRoughnessTextField"
                            style="height: 24px; left: 384px; top: 264px; position: absolute; width: 144px" text="10"/>
                        <ui:staticText id="staticText6" style="height: 24px; left: 552px; top: 264px; position: absolute; width: 94px" text="[micro meter ]"/>
                        <ui:staticText id="staticText7" style="height: 24px; left: 264px; top: 360px; position: absolute; width: 120px" text="Pressure drop"/>
                        <ui:staticText binding="#{Process$calculator$ProcessPipe.pressureDropTextField}" id="pressureDropTextField" style="height: 22px; left: 384px; top: 360px; position: absolute; width: 142px"/>
                        <ui:staticText id="staticText9" style="height: 24px; left: 528px; top: 360px; position: absolute; width: 72px" text="[bar]"/>
                        <h:dataTable binding="#{Process$calculator$ProcessPipe.resultsTable}" headerClass="list-header" id="resultsTable"
                            rowClasses="list-row-even,list-row-odd" style="height: 27px; left: 264px; top: 432px; position: absolute"
                            value="#{Thermo$ThermoSessionBean.resultTable}" var="currentRow" width="696">
                            <h:column id="column1">
                                <h:outputText id="outputText1" value="#{currentRow[0]}"/>
                                <f:facet name="header">
                                    <h:outputText id="outputText2" value="Property"/>
                                </f:facet>
                            </h:column>
                            <h:column id="column2">
                                <h:outputText id="outputText3" value="#{currentRow[1]}"/>
                                <f:facet name="header">
                                    <h:outputText id="outputText4" value="Phase 1"/>
                                </f:facet>
                            </h:column>
                            <h:column id="column3">
                                <h:outputText id="outputText5" value="#{currentRow[2]}"/>
                                <f:facet name="header">
                                    <h:outputText id="outputText6" value="Phase 2"/>
                                </f:facet>
                            </h:column>
                            <h:column id="column4">
                                <h:outputText id="outputText7" value="#{currentRow[3]}"/>
                                <f:facet name="header">
                                    <h:outputText id="outputText8" value="Phase 3"/>
                                </f:facet>
                            </h:column>
                            <h:column id="column5">
                                <h:outputText id="outputText9" value="#{currentRow[4]}"/>
                                <f:facet name="header">
                                    <h:outputText id="outputText10" value="Unit"/>
                                </f:facet>
                            </h:column>
                        </h:dataTable>
                        <ui:staticText id="staticText10" style="height: 24px; left: 264px; top: 408px; position: absolute; width: 144px" text="Outlet conditions"/>
                        <ui:staticText id="staticText11" style="height: 24px; left: 264px; top: 72px; position: absolute; width: 120px" text="Inlet temperature"/>
                        <ui:textField binding="#{Process$calculator$ProcessPipe.temperatureTextField}"
                            converter="#{Process$calculator$ProcessPipe.doubleConverter1}" id="temperatureTextField"
                            style="height: 24px; left: 384px; top: 72px; position: absolute; width: 144px" text="25.0"/>
                        <ui:staticText id="staticText12" style="height: 24px; left: 552px; top: 72px; position: absolute; width: 72px" text="[C]"/>
                        <ui:staticText id="staticText13" style="height: 24px; left: 264px; top: 120px; position: absolute; width: 120px" text="Inlet pressure"/>
                        <ui:staticText id="staticText14" style="height: 24px; left: 552px; top: 120px; position: absolute; width: 72px" text="[bara]"/>
                        <ui:textField binding="#{Process$calculator$ProcessPipe.pressureTextField}"
                            converter="#{Process$calculator$ProcessPipe.doubleConverter1}" id="pressureTextField"
                            style="height: 24px; left: 384px; top: 120px; position: absolute; width: 144px" text="100.0"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
