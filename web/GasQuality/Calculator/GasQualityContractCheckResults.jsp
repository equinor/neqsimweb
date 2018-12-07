<?xml version="1.0" encoding="windows-1252"?>
<!-- 
    Document   : GasQualityContractCheck
    Created on : 21.mar.2009, 08:16:20
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
                        <div style="height: 142px; left: 24px; top: 408px; position: absolute; width: 190px">
                            <jsp:directive.include file="GasQualityCalcRightMenu2.jspf"/>
                        </div>
                        <div style="height: 72px; left: 24px; top: 216px; position: absolute; width: 168px">
                            <jsp:directive.include file="../GasQualityMenu.jspf"/>
                        </div>
                        <h:outputText id="logoOutputText1" style="height: 25px; left: 240px; top: 24px; position: absolute; width: 552px" styleClass="title1" value="Gas quality contract check"/>
                        <h:dataTable headerClass="list-header" id="dataTable1" rowClasses="list-row-even,list-row-odd"
                            style="height: 27px; left: 240px; top: 96px; position: absolute" value="#{Thermo$ThermoSessionBean.salesContractResultTable}"
                            var="currentRow" width="936">
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
                            <h:column id="column6">
                                <h:outputText id="outputText11" value="#{currentRow[5]}"/>
                                <f:facet name="header">
                                    <h:outputText id="outputText15" value="Unit"/>
                                </f:facet>
                            </h:column>
                            <h:column id="column7">
                                <h:outputText id="outputText12" value="#{currentRow[6]}"/>
                                <f:facet name="header">
                                    <h:outputText id="outputText16" value="Unit"/>
                                </f:facet>
                            </h:column>
                            <h:column id="column8">
                                <h:outputText id="outputText13" value="#{currentRow[7]}"/>
                                <f:facet name="header">
                                    <h:outputText id="outputText17" value="Unit"/>
                                </f:facet>
                            </h:column>
                            <h:column id="column9">
                                <h:outputText id="outputText14" value="#{currentRow[8]}"/>
                                <f:facet name="header">
                                    <h:outputText id="outputText18" value="Unit"/>
                                </f:facet>
                            </h:column>
                        </h:dataTable>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
