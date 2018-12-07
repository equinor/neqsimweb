<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{Thermo$ViewResults2.page1}" id="page1">
            <ui:html binding="#{Thermo$ViewResults2.html1}" id="html1">
                <ui:head binding="#{Thermo$ViewResults2.head1}" id="head1">
                    <ui:link binding="#{Thermo$ViewResults2.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{Thermo$ViewResults2.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{Thermo$ViewResults2.form1}" id="form1">
                        <h:graphicImage binding="#{Thermo$ViewResults2.imageNeqSim1}" height="192" id="imageNeqSim1"
                            style="left: 24px; top: 24px; position: absolute" value="/resources/neqsim_logo.jpg" width="192"/>
                        <h:outputText binding="#{Thermo$ViewResults2.outputText1}" id="outputText1" style="left: 264px; top: 24px; position: absolute"
                            styleClass="title1" title="View Results" value="Results"/>
                        <h:dataTable binding="#{Thermo$ViewResults2.dataTable1}" headerClass="list-header" id="dataTable1"
                            rowClasses="list-row-even,list-row-odd" style="height: 27px; left: 264px; top: 72px; position: absolute"
                            value="#{Thermo$ThermoSessionBean.resultTable}" var="currentRow" width="792">
                            <h:column binding="#{Thermo$ViewResults2.column1}" id="column1">
                                <h:outputText binding="#{Thermo$ViewResults2.outputText2}" id="outputText2" value="#{currentRow[0]}"/>
                                <f:facet name="header">
                                    <h:outputText binding="#{Thermo$ViewResults2.outputText3}" id="outputText3" value="Property"/>
                                </f:facet>
                            </h:column>
                            <h:column binding="#{Thermo$ViewResults2.column2}" id="column2">
                                <h:outputText binding="#{Thermo$ViewResults2.outputText4}" id="outputText4" value="#{currentRow[1]}"/>
                                <f:facet name="header">
                                    <h:outputText binding="#{Thermo$ViewResults2.outputText5}" id="outputText5" value="Feed          "/>
                                </f:facet>
                            </h:column>
                            <h:column binding="#{Thermo$ViewResults2.column3}" id="column3">
                                <h:outputText binding="#{Thermo$ViewResults2.outputText6}" id="outputText6" value="#{currentRow[2]}"/>
                                <f:facet name="header">
                                    <h:outputText binding="#{Thermo$ViewResults2.outputText7}" id="outputText7" value="Phase 1"/>
                                </f:facet>
                            </h:column>
                            <h:column binding="#{Thermo$ViewResults2.column4}" id="column4">
                                <h:outputText binding="#{Thermo$ViewResults2.outputText8}" id="outputText8" value="#{currentRow[3]}"/>
                                <f:facet name="header">
                                    <h:outputText binding="#{Thermo$ViewResults2.outputText9}" id="outputText9" value="Phase 2"/>
                                </f:facet>
                            </h:column>
                            <h:column binding="#{Thermo$ViewResults2.column5}" id="column5">
                                <h:outputText binding="#{Thermo$ViewResults2.outputText10}" id="outputText10" value="#{currentRow[4]}"/>
                                <f:facet name="header">
                                    <h:outputText binding="#{Thermo$ViewResults2.outputText11}" id="outputText11" value="Phase 3"/>
                                </f:facet>
                            </h:column>
                            <h:column binding="#{Thermo$ViewResults2.column6}" id="column6">
                                <h:outputText id="outputText14" value="#{currentRow[5]}"/>
                                <f:facet name="header">
                                    <h:outputText id="outputText16" value="Phase 4"/>
                                </f:facet>
                            </h:column>
                            <h:column id="column7">
                                <h:outputText id="outputText15" value="#{currentRow[6]}"/>
                                <f:facet name="header">
                                    <h:outputText id="outputText17" value="Unit   "/>
                                </f:facet>
                            </h:column>
                        </h:dataTable>
                        <div style="position: absolute; left: 24px; top: 216px; width: 192px; height: 288px">
                            <jsp:directive.include file="ThermoMenu.jspf"/>
                        </div>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
