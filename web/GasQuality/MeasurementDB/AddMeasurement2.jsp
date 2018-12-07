<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <html lang="no-NO" xml:lang="no-NO">
            <head>
                <meta content="no-cache" http-equiv="Cache-Control"/>
                <meta content="no-cache" http-equiv="Pragma"/>
                <title>GasQuality$AddAnalyser Title</title>
                <link href="../../resources/stylesheet.css" rel="stylesheet" type="text/css"/>
            </head>
            <body style="-rave-layout: grid">
                <h:form binding="#{GasQuality$MeasurementDB$AddMeasurement2.form1}" id="form1">
                    <h:graphicImage binding="#{GasQuality$MeasurementDB$AddMeasurement2.neqsimLogo}" height="192" id="neqsimLogo"
                        style="left: 24px; top: 24px; position: absolute" value="/resources/neqsim_logo.jpg" width="194"/>
                    <h:outputText binding="#{GasQuality$MeasurementDB$AddMeasurement2.outputText2}" id="outputText2"
                        style="height: 24px; left: 264px; top: 264px; position: absolute; width: 120px" value="Sample Point"/>
                    <h:outputText binding="#{GasQuality$MeasurementDB$AddMeasurement2.topMenuText}" id="topMenuText"
                        style="font-size: 24; height: 23px; left: 264px; top: 24px; position: absolute; width: 408px"
                        styleClass="title1 resources/stylesheet.css" title="title1" value="Add Gas Quality Measurement"/>
                    <h:outputText binding="#{GasQuality$MeasurementDB$AddMeasurement2.outputText1}" id="outputText1"
                        style="height: 26px; left: 264px; top: 120px; position: absolute; width: 122px" value="Field/Installation"/>
                    <h:selectOneMenu binding="#{GasQuality$MeasurementDB$AddMeasurement2.analyserTypeDropDown}" id="analyserTypeDropDown"
                        style="height: 24px; left: 408px; top: 120px; position: absolute; width: 240px" valueChangeListener="#{GasQuality$MeasurementDB$AddMeasurement2.analyserTypeDropDown_processValueChange}">
                        <f:selectItems binding="#{GasQuality$MeasurementDB$AddMeasurement2.dropdown1SelectItems}" id="dropdown1SelectItems" value="#{GasQuality$MeasurementDB$AddMeasurement2.analyserTypeDropDownDefaultItems}"/>
                    </h:selectOneMenu>
                    <h:selectOneMenu binding="#{GasQuality$MeasurementDB$AddMeasurement2.locationDropDown}" id="locationDropDown"
                        style="height: 24px; left: 408px; top: 264px; position: absolute; width: 240px" valueChangeListener="#{GasQuality$MeasurementDB$AddMeasurement2.locationDropDown_processValueChange}">
                        <f:selectItems binding="#{GasQuality$MeasurementDB$AddMeasurement2.dropdown2SelectItems}" id="dropdown2SelectItems" value="#{GasQuality$MeasurementDB$AddMeasurement2.locationDropDownDefaultItems}"/>
                    </h:selectOneMenu>
                    <h:commandLink action="#{GasQuality$MeasurementDB$AddMeasurement2.linkAction1_action}"
                        binding="#{GasQuality$MeasurementDB$AddMeasurement2.linkAction1}" id="linkAction1" style="height: 24px; left: 264px; top: 144px; position: absolute; width: 120px;font-size: 12">
                        <h:outputText binding="#{GasQuality$MeasurementDB$AddMeasurement2.linkAction1Text}" id="linkAction1Text" value="Add Field/Installation"/>
                    </h:commandLink>
                    <h:commandLink action="#{GasQuality$MeasurementDB$AddMeasurement2.linkAction1_action}"
                        binding="#{GasQuality$MeasurementDB$AddMeasurement2.linkAction2}" id="linkAction2" style="font-size: 12; height: 24px; left: 264px; top: 288px; position: absolute; width: 120px">
                        <h:outputText binding="#{GasQuality$MeasurementDB$AddMeasurement2.linkAction1Text1}" id="linkAction1Text1" value="Add Point"/>
                    </h:commandLink>
                    <h:commandLink action="#{GasQuality$MeasurementDB$AddMeasurement2.selectAnalyserLink_action}"
                        binding="#{GasQuality$MeasurementDB$AddMeasurement2.selectAnalyserLink}" id="selectAnalyserLink" style="height: 24px; left: -792px; top: -264px; position: absolute; width: 192px">
                        <h:outputText binding="#{GasQuality$MeasurementDB$AddMeasurement2.linkAction3Text}" id="linkAction3Text" value="Select Analyser"/>
                    </h:commandLink>
                    <h:selectOneMenu binding="#{GasQuality$MeasurementDB$AddMeasurement2.dropdown1}" id="dropdown1" style="height: 24px; left: 0px; top: -96px; position: absolute; width: 144px">
                        <f:selectItems binding="#{GasQuality$MeasurementDB$AddMeasurement2.dropdown1SelectItems1}" id="dropdown1SelectItems1" value="#{GasQuality$MeasurementDB$AddMeasurement2.dropdown1DefaultItems}"/>
                    </h:selectOneMenu>
                    <h:outputText binding="#{GasQuality$MeasurementDB$AddMeasurement2.outputText31}" id="outputText31"
                        style="font-weight: bold; height: 24px; left: 24px; top: 216px; position: absolute; width: 192px" value="Menu"/>
                    <h:commandLink action="#{GasQuality$MeasurementDB$AddMeasurement2.linkAction3_action}"
                        binding="#{GasQuality$MeasurementDB$AddMeasurement2.linkAction3}" id="linkAction3" style="height: 24px; left: 24px; top: 240px; position: absolute; width: 192px">
                        <h:outputText binding="#{GasQuality$MeasurementDB$AddMeasurement2.linkAction1Text2}" id="linkAction1Text2" value="Select Analyser"/>
                    </h:commandLink>
                    <h:commandLink action="#{GasQuality$MeasurementDB$AddMeasurement2.linkAction1_action}"
                        binding="#{GasQuality$MeasurementDB$AddMeasurement2.linkAction4}" id="linkAction4" style="font-size: 12; height: 24px; left: 264px; top: 216px; position: absolute; width: 120px">
                        <h:outputText binding="#{GasQuality$MeasurementDB$AddMeasurement2.linkAction1Text3}" id="linkAction1Text3" value="Add Type"/>
                    </h:commandLink>
                    <h:outputText binding="#{GasQuality$MeasurementDB$AddMeasurement2.outputText3}" id="outputText3"
                        style="height: 24px; left: 264px; top: 192px; position: absolute; width: 120px" value="Analysis Type"/>
                    <h:selectOneMenu binding="#{GasQuality$MeasurementDB$AddMeasurement2.locationDropDown1}" id="locationDropDown1"
                        style="height: 24px; left: 408px; top: 192px; position: absolute; width: 240px" valueChangeListener="#{GasQuality$MeasurementDB$AddMeasurement2.locationDropDown1_processValueChange}">
                        <f:selectItems binding="#{GasQuality$MeasurementDB$AddMeasurement2.dropdown2SelectItems1}" id="dropdown2SelectItems1" value="#{GasQuality$MeasurementDB$AddMeasurement2.locationDropDownDefaultItems}"/>
                    </h:selectOneMenu>
                    <h:outputText binding="#{GasQuality$MeasurementDB$AddMeasurement2.outputText4}" id="outputText4"
                        style="height: 24px; left: 264px; top: 336px; position: absolute; width: 120px" value="Sample Point TAG"/>
                    <h:inputText binding="#{GasQuality$MeasurementDB$AddMeasurement2.textField1}" id="textField1" style="height: 24px; left: 408px; top: 336px; position: absolute; width: 240px"/>
                    <h:commandButton binding="#{GasQuality$MeasurementDB$AddMeasurement2.button1}" id="button1"
                        style="height: 24px; left: 408px; top: 648px; position: absolute; width: 96px" value="Save"/>
                    <h:inputText binding="#{GasQuality$MeasurementDB$AddMeasurement2.textField2}" id="textField2" style="height: 24px; left: 408px; top: 384px; position: absolute; width: 240px"/>
                    <h:outputText binding="#{GasQuality$MeasurementDB$AddMeasurement2.outputText11}" id="outputText11"
                        style="height: 24px; left: 264px; top: 384px; position: absolute; width: 120px" value="Measured By"/>
                    <h:inputText binding="#{GasQuality$MeasurementDB$AddMeasurement2.textField3}" id="textField3" style="height: 24px; left: 408px; top: 432px; position: absolute; width: 240px"/>
                    <h:outputText binding="#{GasQuality$MeasurementDB$AddMeasurement2.outputText12}" id="outputText12"
                        style="height: 24px; left: 264px; top: 432px; position: absolute; width: 120px" value="Analyser Used"/>
                    <h:outputText binding="#{GasQuality$MeasurementDB$AddMeasurement2.outputText13}" id="outputText13"
                        style="height: 24px; left: 264px; top: 480px; position: absolute; width: 120px" value="Comments"/>
                    <h:inputTextarea binding="#{GasQuality$MeasurementDB$AddMeasurement2.textArea1}" id="textArea1" style="height: 144px; left: 408px; top: 480px; position: absolute; width: 240px"/>
                    <h:dataTable binding="#{GasQuality$MeasurementDB$AddMeasurement2.dataTable2}" headerClass="list-header" id="dataTable2"
                        rowClasses="list-row-even,list-row-odd" style="height: 48px; left: 696px; top: 120px; position: absolute"
                        value="#{Thermo$MeasurementDB$AddMeasurement.dataTable1Model}" var="currentRow" width="336">
                        <h:column binding="#{GasQuality$MeasurementDB$AddMeasurement2.column5}" id="column5">
                            <h:outputText binding="#{GasQuality$MeasurementDB$AddMeasurement2.outputText14}" id="outputText14" value="#{currentRow['COLUMN1']}"/>
                            <f:facet name="header">
                                <h:outputText binding="#{GasQuality$MeasurementDB$AddMeasurement2.outputText16}" id="outputText16" value="COMPONENT"/>
                            </f:facet>
                        </h:column>
                        <h:column binding="#{GasQuality$MeasurementDB$AddMeasurement2.column6}" id="column6">
                            <h:outputText binding="#{GasQuality$MeasurementDB$AddMeasurement2.outputText18}" id="outputText18"/>
                            <f:facet name="header">
                                <h:outputText binding="#{GasQuality$MeasurementDB$AddMeasurement2.outputText19}" id="outputText19" value="PROPERTY"/>
                            </f:facet>
                        </h:column>
                        <h:column binding="#{GasQuality$MeasurementDB$AddMeasurement2.column7}" id="column7">
                            <h:outputText binding="#{GasQuality$MeasurementDB$AddMeasurement2.outputText17}" id="outputText17"/>
                            <f:facet name="header">
                                <h:outputText binding="#{GasQuality$MeasurementDB$AddMeasurement2.outputText20}" id="outputText20" value="PHASETYPE"/>
                            </f:facet>
                        </h:column>
                        <h:column binding="#{GasQuality$MeasurementDB$AddMeasurement2.column8}" id="column8">
                            <h:outputText binding="#{GasQuality$MeasurementDB$AddMeasurement2.outputText21}" id="outputText21" value="#{currentRow['COLUMN2']}"/>
                            <f:facet name="header">
                                <h:outputText binding="#{GasQuality$MeasurementDB$AddMeasurement2.outputText22}" id="outputText22" value="VALUE"/>
                            </f:facet>
                        </h:column>
                        <h:column binding="#{GasQuality$MeasurementDB$AddMeasurement2.column9}" id="column9">
                            <h:outputText binding="#{GasQuality$MeasurementDB$AddMeasurement2.outputText23}" id="outputText23" value="#{currentRow['COLUMN3']}"/>
                            <f:facet name="header">
                                <h:outputText binding="#{GasQuality$MeasurementDB$AddMeasurement2.outputText24}" id="outputText24" value="UNIT"/>
                            </f:facet>
                        </h:column>
                        <h:column binding="#{GasQuality$MeasurementDB$AddMeasurement2.column10}" id="column10">
                            <h:commandButton binding="#{GasQuality$MeasurementDB$AddMeasurement2.button3}" id="button3" value="Delete Row"/>
                            <f:facet name="header">
                                <h:outputText binding="#{GasQuality$MeasurementDB$AddMeasurement2.outputText25}" id="outputText25" value="DELETE"/>
                            </f:facet>
                        </h:column>
                    </h:dataTable>
                </h:form>
            </body>
        </html>
    </f:view>
</jsp:root>
