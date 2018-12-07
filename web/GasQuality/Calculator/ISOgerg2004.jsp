<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{GasQuality$Calculator$ISOgerg2004.page1}" id="page1">
            <ui:html binding="#{GasQuality$Calculator$ISOgerg2004.html1}" id="html1">
                <ui:head binding="#{GasQuality$Calculator$ISOgerg2004.head1}" id="head1">
                    <ui:link binding="#{GasQuality$Calculator$ISOgerg2004.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{GasQuality$Calculator$ISOgerg2004.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{GasQuality$Calculator$ISOgerg2004.form1}" id="form1">
                        <h:graphicImage binding="#{GasQuality$Calculator$ISOgerg2004.image1}" height="192" id="image1"
                            style="left: 24px; top: 24px; position: absolute" value="/resources/neqsim_logo.jpg" width="192"/>
                        <h:outputText binding="#{GasQuality$Calculator$ISOgerg2004.outputText1}" id="outputText1"
                            style="font-size: 20; height: 22px; left: 264px; top: 24px; position: absolute; width: 670px" styleClass="title1" value="GERG 2004 EOS - GERG thermodynamic reference equation"/>
                        <div style="height: 48px; left: 24px; top: 384px; position: absolute; width: 120px">
                            <jsp:directive.include file="GasQualityCalcRightMenu2.jspf"/>
                        </div>
                        <ui:button action="#{GasQuality$Calculator$ISOgerg2004.button1_action}" binding="#{GasQuality$Calculator$ISOgerg2004.button1}"
                            id="button1" style="height: 24px; left: 263px; top: 264px; position: absolute; width: 72px" text="Calculate"/>
                        <h:dataTable binding="#{GasQuality$Calculator$ISOgerg2004.dataTable1}" headerClass="list-header" id="dataTable1"
                            rowClasses="list-row-even,list-row-odd" style="height: 27px; left: 264px; top: 336px; position: absolute"
                            value="#{Thermo$ThermoSessionBean.ISOstandard.resultTable}" var="currentRow" width="696">
                            <h:column binding="#{GasQuality$Calculator$ISOgerg2004.column1}" id="column1">
                                <h:outputText binding="#{GasQuality$Calculator$ISOgerg2004.outputText2}" id="outputText2" value="#{currentRow[0]}"/>
                                <f:facet name="header">
                                    <h:outputText binding="#{GasQuality$Calculator$ISOgerg2004.outputText3}" id="outputText3" value="Property"/>
                                </f:facet>
                            </h:column>
                            <h:column binding="#{GasQuality$Calculator$ISOgerg2004.column2}" id="column2">
                                <h:outputText binding="#{GasQuality$Calculator$ISOgerg2004.outputText4}" id="outputText4" value="#{currentRow[1]}"/>
                                <f:facet name="header">
                                    <h:outputText binding="#{GasQuality$Calculator$ISOgerg2004.outputText5}" id="outputText5" value="Phase 1"/>
                                </f:facet>
                            </h:column>
                            <h:column binding="#{GasQuality$Calculator$ISOgerg2004.column3}" id="column3">
                                <h:outputText binding="#{GasQuality$Calculator$ISOgerg2004.outputText6}" id="outputText6" value="#{currentRow[2]}"/>
                                <f:facet name="header">
                                    <h:outputText binding="#{GasQuality$Calculator$ISOgerg2004.outputText7}" id="outputText7" value="Phase 2"/>
                                </f:facet>
                            </h:column>
                            <h:column binding="#{GasQuality$Calculator$ISOgerg2004.column4}" id="column4">
                                <h:outputText binding="#{GasQuality$Calculator$ISOgerg2004.outputText8}" id="outputText8" value="#{currentRow[3]}"/>
                                <f:facet name="header">
                                    <h:outputText binding="#{GasQuality$Calculator$ISOgerg2004.outputText9}" id="outputText9" value="Phase 3"/>
                                </f:facet>
                            </h:column>
                            <h:column binding="#{GasQuality$Calculator$ISOgerg2004.column5}" id="column5">
                                <h:outputText binding="#{GasQuality$Calculator$ISOgerg2004.outputText10}" id="outputText10" value="#{currentRow[4]}"/>
                                <f:facet name="header">
                                    <h:outputText binding="#{GasQuality$Calculator$ISOgerg2004.outputText11}" id="outputText11" value="Unit"/>
                                </f:facet>
                            </h:column>
                        </h:dataTable>
                        <ui:imageHyperlink action="#{GasQuality$Calculator$ISOgerg2004.imageHyperlink1_action}"
                            binding="#{GasQuality$Calculator$ISOgerg2004.imageHyperlink1}" height="24" id="imageHyperlink1"
                            style="left: 264px; top: 96px; position: absolute" text="Open ISO-standard" width="216"/>
                        <div style="height: 24px; left: 24px; top: 216px; position: absolute; width: 72px">
                            <jsp:directive.include file="../GasQualityMenu.jspf"/>
                        </div>
                        <h:inputText binding="#{GasQuality$Calculator$ISOgerg2004.temperatureTextField}" id="temperatureTextField"
                            style="height: 24px; left: 384px; top: 144px; position: absolute; width: 120px"
                            validator="#{GasQuality$Calculator$ISOgerg2004.doubleRangeValidator1.validate}" value="1.0"/>
                        <h:inputText binding="#{GasQuality$Calculator$ISOgerg2004.pressureTextField}" id="pressureTextField"
                            style="height: 24px; left: 384px; top: 192px; position: absolute; width: 120px"
                            validator="#{GasQuality$Calculator$ISOgerg2004.doubleRangeValidator1.validate}" value="20.0"/>
                        <h:outputText binding="#{GasQuality$Calculator$ISOgerg2004.outputText12}" id="outputText12"
                            style="position: absolute; left: 264px; top: 144px" value="Temperature"/>
                        <h:outputText binding="#{GasQuality$Calculator$ISOgerg2004.outputText13}" id="outputText13"
                            style="left: 264px; top: 192px; position: absolute" value="Pressure"/>
                        <h:outputText binding="#{GasQuality$Calculator$ISOgerg2004.outputText14}" id="outputText14"
                            style="left: 528px; top: 192px; position: absolute" value="bara"/>
                        <h:outputText binding="#{GasQuality$Calculator$ISOgerg2004.outputText15}" id="outputText15"
                            style="left: 528px; top: 144px; position: absolute" value="Celsius"/>
                        <h:message binding="#{GasQuality$Calculator$ISOgerg2004.inlineMessage1}" errorClass="errorMessage" fatalClass="fatalMessage"
                            for="temperatureTextField" id="inlineMessage1" infoClass="infoMessage" showDetail="false" showSummary="true"
                            style="position: absolute; left: 600px; top: 144px; width: 240px; height: 24px" warnClass="warnMessage"/>
                        <h:message binding="#{GasQuality$Calculator$ISOgerg2004.inlineMessage2}" errorClass="errorMessage" fatalClass="fatalMessage"
                            for="pressureTextField" id="inlineMessage2" infoClass="infoMessage" showDetail="false" showSummary="true"
                            style="position: absolute; left: 600px; top: 192px; width: 240px; height: 24px" warnClass="warnMessage"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
