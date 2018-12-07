<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <jsp:text><![CDATA[
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
 "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
]]></jsp:text>
    <f:view>
        <html lang="no-NO" xml:lang="no-NO">
            <head>
                <meta content="no-cache" http-equiv="Cache-Control"/>
                <meta content="no-cache" http-equiv="Pragma"/>
                <title>GasQuality$AddAnalyser Title</title>
                <link href="/resources/stylesheet.css" rel="stylesheet" type="text/css"/>
            </head>
            <body style="-rave-layout: grid">
                <h:form binding="#{Thermo$ThermoDAB$AddMeasurement.form1}" id="form1">
                    <h:graphicImage binding="#{Thermo$ThermoDAB$AddMeasurement.neqsimLogo}" height="192" id="neqsimLogo"
                        style="left: 24px; top: 24px; position: absolute" value="/resources/neqsim_logo.jpg" width="194"/>
                    <h:outputText binding="#{Thermo$ThermoDAB$AddMeasurement.topMenuText}" id="topMenuText"
                        style="height: 25px; position: absolute; width: 624px; font-size: 24px; left: 264px; top: 24px"
                        styleClass="title1 resources/stylesheet.css" title="title1" value="Add Phase or Physical Property Measurement"/>
                    <h:commandLink action="#{Thermo$ThermoDAB$AddMeasurement.selectAnalyserLink_action}"
                        binding="#{Thermo$ThermoDAB$AddMeasurement.selectAnalyserLink}" id="selectAnalyserLink" style="height: 24px; left: -792px; top: -264px; position: absolute; width: 192px">
                        <h:outputText binding="#{Thermo$ThermoDAB$AddMeasurement.linkAction3Text}" id="linkAction3Text" value="Select Analyser"/>
                    </h:commandLink>
                    <h:selectOneMenu binding="#{Thermo$ThermoDAB$AddMeasurement.dropdown1}" id="dropdown1" style="height: 24px; left: 0px; top: -96px; position: absolute; width: 144px">
                        <f:selectItems binding="#{Thermo$ThermoDAB$AddMeasurement.dropdown1SelectItems1}" id="dropdown1SelectItems1" value="#{Thermo$ThermoDAB$AddMeasurement.dropdown1DefaultItems}"/>
                    </h:selectOneMenu>
                    <h:outputText binding="#{Thermo$ThermoDAB$AddMeasurement.outputText31}" id="outputText31"
                        style="font-weight: bold; height: 24px; left: 24px; top: 216px; position: absolute; width: 192px" value="Menu"/>
                    <h:commandLink action="#{Thermo$ThermoDAB$AddMeasurement.linkAction3_action}" binding="#{Thermo$ThermoDAB$AddMeasurement.linkAction3}"
                        id="linkAction3" style="height: 24px; left: 24px; top: 240px; position: absolute; width: 192px">
                        <h:outputText binding="#{Thermo$ThermoDAB$AddMeasurement.linkAction1Text2}" id="linkAction1Text2" value="Select Analyser"/>
                    </h:commandLink>
                    <h:commandLink action="#{Thermo$ThermoDAB$AddMeasurement.linkAction1_action}" binding="#{Thermo$ThermoDAB$AddMeasurement.linkAction4}"
                        id="linkAction4" style="font-size: 12; height: 24px; left: 264px; top: 144px; position: absolute; width: 120px">
                        <h:outputText binding="#{Thermo$ThermoDAB$AddMeasurement.linkAction1Text3}" id="linkAction1Text3" value="Add Type"/>
                    </h:commandLink>
                    <h:outputText binding="#{Thermo$ThermoDAB$AddMeasurement.outputText3}" id="outputText3"
                        style="height: 24px; left: 264px; top: 120px; position: absolute; width: 120px" value="Measurement Type"/>
                    <h:dataTable binding="#{Thermo$ThermoDAB$AddMeasurement.dataTable1}" headerClass="list-header" id="dataTable1"
                        rowClasses="list-row-even,list-row-odd" style="height: 48px; left: 696px; top: 96px; position: absolute"
                        value="#{Thermo$ThermoDAB$AddMeasurement.dataTable1Model}" var="currentRow" width="336">
                        <h:column binding="#{Thermo$ThermoDAB$AddMeasurement.column1}" id="column1">
                            <h:inputText binding="#{Thermo$ThermoDAB$AddMeasurement.textField1}" id="textField1" value="#{currentRow['COLUMN1']}"/>
                            <f:facet name="header">
                                <h:outputText binding="#{Thermo$ThermoDAB$AddMeasurement.outputText6}" id="outputText6" value="COMPONENT"/>
                            </f:facet>
                        </h:column>
                        <h:column binding="#{Thermo$ThermoDAB$AddMeasurement.column6}" id="column6">
                            <h:inputText binding="#{Thermo$ThermoDAB$AddMeasurement.textField4}" id="textField4"/>
                            <f:facet name="header">
                                <h:outputText binding="#{Thermo$ThermoDAB$AddMeasurement.outputText19}" id="outputText19" value="PROPERTY"/>
                            </f:facet>
                        </h:column>
                        <h:column binding="#{Thermo$ThermoDAB$AddMeasurement.column5}" id="column5">
                            <h:inputText binding="#{Thermo$ThermoDAB$AddMeasurement.textField5}" id="textField5"/>
                            <f:facet name="header">
                                <h:outputText binding="#{Thermo$ThermoDAB$AddMeasurement.outputText17}" id="outputText17" value="PHASETYPE"/>
                            </f:facet>
                        </h:column>
                        <h:column binding="#{Thermo$ThermoDAB$AddMeasurement.column2}" id="column2">
                            <h:inputText binding="#{Thermo$ThermoDAB$AddMeasurement.textField6}" id="textField6" value="#{currentRow['COLUMN2']}"/>
                            <f:facet name="header">
                                <h:outputText binding="#{Thermo$ThermoDAB$AddMeasurement.outputText8}" id="outputText8" value="VALUE"/>
                            </f:facet>
                        </h:column>
                        <h:column binding="#{Thermo$ThermoDAB$AddMeasurement.column3}" id="column3">
                            <h:inputText binding="#{Thermo$ThermoDAB$AddMeasurement.textField7}" id="textField7" value="#{currentRow['COLUMN3']}"/>
                            <f:facet name="header">
                                <h:outputText binding="#{Thermo$ThermoDAB$AddMeasurement.outputText10}" id="outputText10" value="UNIT"/>
                            </f:facet>
                        </h:column>
                        <h:column binding="#{Thermo$ThermoDAB$AddMeasurement.column4}" id="column4">
                            <h:commandButton binding="#{Thermo$ThermoDAB$AddMeasurement.button2}" id="button2" value="Delete Row"/>
                            <f:facet name="header">
                                <h:outputText binding="#{Thermo$ThermoDAB$AddMeasurement.outputText15}" id="outputText15" value="DELETE"/>
                            </f:facet>
                        </h:column>
                        <h:column binding="#{Thermo$ThermoDAB$AddMeasurement.column7}" id="column7">
                            <h:commandButton binding="#{Thermo$ThermoDAB$AddMeasurement.button3}" id="button3" value="Add Row"/>
                            <f:facet name="header">
                                <h:outputText binding="#{Thermo$ThermoDAB$AddMeasurement.outputText1}" id="outputText1" value="ADD ROW"/>
                            </f:facet>
                        </h:column>
                    </h:dataTable>
                    <h:commandButton action="#{Thermo$ThermoDAB$AddMeasurement.button1_action}" binding="#{Thermo$ThermoDAB$AddMeasurement.button1}"
                        id="button1" style="height: 24px; left: 408px; top: 624px; position: absolute; width: 96px" value="Save"/>
                    <h:inputText binding="#{Thermo$ThermoDAB$AddMeasurement.textField2}" id="textField2" style="height: 24px; left: 408px; top: 192px; position: absolute; width: 240px"/>
                    <h:outputText binding="#{Thermo$ThermoDAB$AddMeasurement.outputText11}" id="outputText11"
                        style="height: 24px; left: 264px; top: 192px; position: absolute; width: 120px" value="Measured By"/>
                    <h:inputText binding="#{Thermo$ThermoDAB$AddMeasurement.textField3}" id="textField3" style="height: 24px; left: 408px; top: 240px; position: absolute; width: 240px"/>
                    <h:outputText binding="#{Thermo$ThermoDAB$AddMeasurement.outputText12}" id="outputText12"
                        style="height: 24px; left: 264px; top: 240px; position: absolute; width: 120px" value="Analyser Used"/>
                    <h:outputText binding="#{Thermo$ThermoDAB$AddMeasurement.outputText13}" id="outputText13"
                        style="height: 28px; left: 264px; top: 456px; position: absolute; width: 124px" value="Comments"/>
                    <h:inputTextarea binding="#{Thermo$ThermoDAB$AddMeasurement.textArea1}" id="textArea1" style="height: 144px; left: 408px; top: 456px; position: absolute; width: 240px"/>
                    <h:outputText binding="#{Thermo$ThermoDAB$AddMeasurement.outputText14}" id="outputText14"
                        style="height: 24px; left: 264px; top: 288px; position: absolute; width: 120px" value="Reference"/>
                    <h:inputTextarea binding="#{Thermo$ThermoDAB$AddMeasurement.textArea2}" id="textArea2" style="height: 144px; left: 408px; top: 288px; position: absolute; width: 240px"/>
                    <h:selectOneMenu binding="#{Thermo$ThermoDAB$AddMeasurement.typeDropDown}" id="typeDropDown" style="height: 24px; left: 408px; top: 120px; position: absolute; width: 240px">
                        <f:selectItems binding="#{Thermo$ThermoDAB$AddMeasurement.dropdown2SelectItems}" id="dropdown2SelectItems" value="#{Thermo$ThermoDAB$AddMeasurement.experimentaldatatypeDataProvider.options['experimentaldatatype.TYPE,experimentaldatatype.TYPE']}"/>
                    </h:selectOneMenu>
                </h:form>
            </body>
        </html>
    </f:view>
</jsp:root>
