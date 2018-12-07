<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <html lang="no-NO" xml:lang="no-NO">
            <head>
                <meta content="no-cache" http-equiv="Cache-Control"/>
                <meta content="no-cache" http-equiv="Pragma"/>
                <title>GasQuality$AnalyseDB Title</title>
                <link href="../../resources/stylesheet.css" rel="stylesheet" type="text/css"/>
            </head>
            <body style="-rave-layout: grid">
                <h:form binding="#{GasQuality$MeasurementDB$MeasurementDB2.form1}" id="form1">
                    <h:outputText binding="#{GasQuality$MeasurementDB$MeasurementDB2.topMenuText}" id="topMenuText"
                        style="font-size: 24; height: 23px; left: 264px; top: 24px; position: absolute; width: 408px"
                        styleClass="title1 resources/stylesheet.css" title="title1" value="Measurement Database"/>
                    <h:graphicImage binding="#{GasQuality$MeasurementDB$MeasurementDB2.image1}" height="192" id="image1"
                        style="left: 24px; top: 24px; position: absolute" value="/resources/neqsim_logo.jpg" width="194"/>
                    <h:outputText binding="#{GasQuality$MeasurementDB$MeasurementDB2.outputText31}" id="outputText31"
                        style="font-weight: bold; height: 24px; left: 24px; top: 216px; position: absolute; width: 192px" value="Menu"/>
                    <h:commandLink action="#{GasQuality$MeasurementDB$MeasurementDB2.linkAction1_action}"
                        binding="#{GasQuality$MeasurementDB$MeasurementDB2.linkAction1}" id="linkAction1" style="height: 24px; left: 24px; top: 240px; position: absolute; width: 192px">
                        <h:outputText binding="#{GasQuality$MeasurementDB$MeasurementDB2.linkAction1Text}" id="linkAction1Text" value="Select Measurement"/>
                    </h:commandLink>
                    <h:dataTable binding="#{GasQuality$MeasurementDB$MeasurementDB2.dataTable1}" headerClass="list-header" id="dataTable1"
                        rowClasses="list-row-even,list-row-odd" style="height: 151px; left: 264px; top: 96px; position: absolute"
                        value="#{GasQuality$MeasurementDB$MeasurementDB2.dataTable1Model1}" var="currentRow" width="600">
                        <h:column binding="#{GasQuality$MeasurementDB$MeasurementDB2.column1}" id="column1">
                            <h:outputText binding="#{GasQuality$MeasurementDB$MeasurementDB2.outputText1}" id="outputText1" value="#{currentRow['COLUMN1']}"/>
                            <f:facet name="header">
                                <h:outputText binding="#{GasQuality$MeasurementDB$MeasurementDB2.outputText2}" id="outputText2" value="column1"/>
                            </f:facet>
                        </h:column>
                        <h:column binding="#{GasQuality$MeasurementDB$MeasurementDB2.column2}" id="column2">
                            <h:outputText binding="#{GasQuality$MeasurementDB$MeasurementDB2.outputText3}" id="outputText3" value="#{currentRow['COLUMN2']}"/>
                            <f:facet name="header">
                                <h:outputText binding="#{GasQuality$MeasurementDB$MeasurementDB2.outputText4}" id="outputText4" value="column2"/>
                            </f:facet>
                        </h:column>
                        <h:column binding="#{GasQuality$MeasurementDB$MeasurementDB2.column3}" id="column3">
                            <h:outputText binding="#{GasQuality$MeasurementDB$MeasurementDB2.outputText5}" id="outputText5" value="#{currentRow['COLUMN3']}"/>
                            <f:facet name="header">
                                <h:outputText binding="#{GasQuality$MeasurementDB$MeasurementDB2.outputText6}" id="outputText6" value="column3"/>
                            </f:facet>
                        </h:column>
                        <h:column binding="#{GasQuality$MeasurementDB$MeasurementDB2.column4}" id="column4">
                            <h:commandButton binding="#{GasQuality$MeasurementDB$MeasurementDB2.button1}" id="button1" value="View/Edit"/>
                            <f:facet name="header">
                                <h:outputText binding="#{GasQuality$MeasurementDB$MeasurementDB2.outputText7}" id="outputText7" value="VIEW/EDIT"/>
                            </f:facet>
                        </h:column>
                        <h:column binding="#{GasQuality$MeasurementDB$MeasurementDB2.column5}" id="column5">
                            <h:commandButton action="#{GasQuality$MeasurementDB$MeasurementDB2.button2_action}"
                                binding="#{GasQuality$MeasurementDB$MeasurementDB2.button2}" id="button2" value="Delete"/>
                            <f:facet name="header">
                                <h:outputText binding="#{GasQuality$MeasurementDB$MeasurementDB2.outputText8}" id="outputText8" value="DELETE"/>
                            </f:facet>
                        </h:column>
                    </h:dataTable>
                </h:form>
            </body>
        </html>
    </f:view>
</jsp:root>
