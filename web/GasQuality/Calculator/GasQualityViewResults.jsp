<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{GasQuality$Calculator$GasQualityViewResults.page1}" id="page1">
            <ui:html binding="#{GasQuality$Calculator$GasQualityViewResults.html1}" id="html1">
                <ui:head binding="#{GasQuality$Calculator$GasQualityViewResults.head1}" id="head1">
                    <ui:link binding="#{GasQuality$Calculator$GasQualityViewResults.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{GasQuality$Calculator$GasQualityViewResults.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{GasQuality$Calculator$GasQualityViewResults.form1}" id="form1">
                        <h:graphicImage binding="#{GasQuality$Calculator$GasQualityViewResults.imageNeqSim1}" height="192" id="imageNeqSim1"
                            style="left: 24px; top: 24px; position: absolute" value="/resources/neqsim_logo.jpg" width="192"/>
                        <h:outputText binding="#{GasQuality$Calculator$GasQualityViewResults.outputText1}" id="outputText1"
                            style="left: 264px; top: 24px; position: absolute" styleClass="title1" title="View Results" value="Results"/>
                        <div style="height: 120px; left: 24px; top: 384px; position: absolute; width: 192px">
                            <jsp:directive.include file="GasQualityCalcRightMenu2.jspf"/>
                        </div>
                        <h:dataTable binding="#{GasQuality$Calculator$GasQualityViewResults.dataTable1}" headerClass="list-header" id="dataTable1"
                            rowClasses="list-row-even,list-row-odd" style="height: 27px; left: 264px; top: 72px; position: absolute"
                            value="#{Thermo$ThermoSessionBean.thermoSystem.resultTable}" var="currentRow" width="696">
                            <h:column binding="#{GasQuality$Calculator$GasQualityViewResults.column1}" id="column1">
                                <h:outputText binding="#{GasQuality$Calculator$GasQualityViewResults.outputText2}" id="outputText2" value="#{currentRow[0]}"/>
                                <f:facet name="header">
                                    <h:outputText binding="#{GasQuality$Calculator$GasQualityViewResults.outputText3}" id="outputText3" value="Property"/>
                                </f:facet>
                            </h:column>
                            <h:column binding="#{GasQuality$Calculator$GasQualityViewResults.column2}" id="column2">
                                <h:outputText binding="#{GasQuality$Calculator$GasQualityViewResults.outputText4}" id="outputText4" value="#{currentRow[1]}"/>
                                <f:facet name="header">
                                    <h:outputText binding="#{GasQuality$Calculator$GasQualityViewResults.outputText5}" id="outputText5" value="Phase 1"/>
                                </f:facet>
                            </h:column>
                            <h:column binding="#{GasQuality$Calculator$GasQualityViewResults.column3}" id="column3">
                                <h:outputText binding="#{GasQuality$Calculator$GasQualityViewResults.outputText6}" id="outputText6" value="#{currentRow[2]}"/>
                                <f:facet name="header">
                                    <h:outputText binding="#{GasQuality$Calculator$GasQualityViewResults.outputText7}" id="outputText7" value="Phase 2"/>
                                </f:facet>
                            </h:column>
                            <h:column binding="#{GasQuality$Calculator$GasQualityViewResults.column4}" id="column4">
                                <h:outputText binding="#{GasQuality$Calculator$GasQualityViewResults.outputText8}" id="outputText8" value="#{currentRow[3]}"/>
                                <f:facet name="header">
                                    <h:outputText binding="#{GasQuality$Calculator$GasQualityViewResults.outputText9}" id="outputText9" value="Phase 3"/>
                                </f:facet>
                            </h:column>
                            <h:column binding="#{GasQuality$Calculator$GasQualityViewResults.column5}" id="column5">
                                <h:outputText binding="#{GasQuality$Calculator$GasQualityViewResults.outputText10}" id="outputText10" value="#{currentRow[4]}"/>
                                <f:facet name="header">
                                    <h:outputText binding="#{GasQuality$Calculator$GasQualityViewResults.outputText11}" id="outputText11" value="Unit"/>
                                </f:facet>
                            </h:column>
                        </h:dataTable>
                        <div style="position: absolute; left: 24px; top: 216px; width: 168px; height: 48px">
                            <jsp:directive.include file="../GasQualityMenu.jspf"/>
                        </div>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
