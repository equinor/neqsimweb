<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <html lang="no-NO" xml:lang="no-NO">
            <head>
                <meta content="no-cache" http-equiv="Cache-Control"/>
                <meta content="no-cache" http-equiv="Pragma"/>
                <title>GasQuality$AddAnalyser Title</title>
                <link href="/resources/stylesheet.css" rel="stylesheet" type="text/css"/>
            </head>
            <body style="-rave-layout: grid">
                <h:form binding="#{GasQuality$AnalyserDB$AddAnalyser.form1}" id="form1">
                    <h:graphicImage binding="#{GasQuality$AnalyserDB$AddAnalyser.neqsimLogo}" height="192" id="neqsimLogo"
                        style="left: 24px; top: 24px; position: absolute" value="/resources/neqsim_logo.jpg" width="194"/>
                    <h:outputText binding="#{GasQuality$AnalyserDB$AddAnalyser.outputText2}" id="outputText2"
                        style="height: 24px; left: 264px; top: 120px; position: absolute; width: 120px" value="Location"/>
                    <h:outputText binding="#{GasQuality$AnalyserDB$AddAnalyser.outputText3}" id="outputText3"
                        style="height: 24px; left: 264px; top: 264px; position: absolute; width: 120px" value="Purpose"/>
                    <h:outputText binding="#{GasQuality$AnalyserDB$AddAnalyser.outputText4}" id="outputText4"
                        style="height: 24px; left: 264px; top: 408px; position: absolute; width: 120px" value="Instrument"/>
                    <h:outputText binding="#{GasQuality$AnalyserDB$AddAnalyser.outputText5}" id="outputText5"
                        style="height: 24px; left: 264px; top: 456px; position: absolute; width: 120px" value="Number of instruments"/>
                    <h:inputText binding="#{GasQuality$AnalyserDB$AddAnalyser.instrumentNameTextField}" id="instrumentNameTextField"
                        style="height: 24px; left: 408px; top: 408px; position: absolute; width: 240px"
                        value="#{GasQuality$AnalyserDB$AddAnalyser.addAnalysersDataProvider.value['analysers.INSTRUMENT']}" valueChangeListener="#{GasQuality$AnalyserDB$AddAnalyser.instrumentNameTextField_processValueChange}"/>
                    <h:inputTextarea binding="#{GasQuality$AnalyserDB$AddAnalyser.purposeTextArea}" id="purposeTextArea"
                        style="height: 120px; left: 408px; top: 264px; position: absolute; width: 240px"
                        value="#{GasQuality$AnalyserDB$AddAnalyser.addAnalysersDataProvider.value['analysers.FORMAL']}" valueChangeListener="#{GasQuality$AnalyserDB$AddAnalyser.purposeTextArea_processValueChange}"/>
                    <h:inputText binding="#{GasQuality$AnalyserDB$AddAnalyser.numberInstTextField}" id="numberInstTextField"
                        style="height: 24px; left: 408px; top: 456px; position: absolute; width: 240px" value="#{GasQuality$AnalyserDB$AddAnalyser.addAnalysersDataProvider.value['analysers.ANTALL']}"/>
                    <h:outputText binding="#{GasQuality$AnalyserDB$AddAnalyser.outputText6}" id="outputText6"
                        style="height: 24px; left: 264px; top: 504px; position: absolute; width: 120px" value="Field Location"/>
                    <h:inputText binding="#{GasQuality$AnalyserDB$AddAnalyser.fieldLocationTextField}" id="fieldLocationTextField"
                        style="height: 24px; left: 408px; top: 504px; position: absolute; width: 240px" value="#{GasQuality$AnalyserDB$AddAnalyser.addAnalysersDataProvider.value['analysers.PLASSERING']}"/>
                    <h:outputText binding="#{GasQuality$AnalyserDB$AddAnalyser.outputText7}" id="outputText7"
                        style="height: 24px; left: 264px; top: 552px; position: absolute; width: 120px" value="Tag number"/>
                    <h:inputText binding="#{GasQuality$AnalyserDB$AddAnalyser.tagNumberTextField}" id="tagNumberTextField"
                        style="height: 24px; left: 408px; top: 552px; position: absolute; width: 240px" value="#{GasQuality$AnalyserDB$AddAnalyser.addAnalysersDataProvider.value['analysers.TAGNR']}"/>
                    <h:outputText binding="#{GasQuality$AnalyserDB$AddAnalyser.outputText8}" id="outputText8"
                        style="height: 24px; left: 264px; top: 600px; position: absolute; width: 120px" value="Calibration Routines"/>
                    <h:inputTextarea binding="#{GasQuality$AnalyserDB$AddAnalyser.calibrationRoutinesTextField}" id="calibrationRoutinesTextField"
                        style="height: 120px; left: 408px; top: 600px; position: absolute; width: 240px" value="#{GasQuality$AnalyserDB$AddAnalyser.addAnalysersDataProvider.value['analysers.KALIBRERINGSRUTINER']}"/>
                    <h:outputText binding="#{GasQuality$AnalyserDB$AddAnalyser.outputText9}" id="outputText9"
                        style="height: 24px; left: 672px; top: 192px; position: absolute; width: 120px" value="Maintainance Routines"/>
                    <h:inputTextarea binding="#{GasQuality$AnalyserDB$AddAnalyser.maintainanceTextField}" id="maintainanceTextField"
                        style="height: 120px; left: 816px; top: 192px; position: absolute; width: 240px" value="#{GasQuality$AnalyserDB$AddAnalyser.addAnalysersDataProvider.value['analysers.VEDLIKEHOLDSRUTINER']}"/>
                    <h:outputText binding="#{GasQuality$AnalyserDB$AddAnalyser.outputText10}" id="outputText10"
                        style="height: 24px; left: 672px; top: 336px; position: absolute; width: 120px" value="Experience"/>
                    <h:inputTextarea binding="#{GasQuality$AnalyserDB$AddAnalyser.experienceTextField}" id="experienceTextField"
                        style="height: 120px; left: 816px; top: 336px; position: absolute; width: 240px" value="#{GasQuality$AnalyserDB$AddAnalyser.addAnalysersDataProvider.value['analysers.ERFARING']}"/>
                    <h:outputText binding="#{GasQuality$AnalyserDB$AddAnalyser.outputText11}" id="outputText11"
                        style="height: 24px; left: 672px; top: 504px; position: absolute; width: 120px" value="Online/Offline"/>
                    <h:inputText binding="#{GasQuality$AnalyserDB$AddAnalyser.contactTextField}" id="contactTextField"
                        style="height: 24px; left: 816px; top: 552px; position: absolute; width: 240px" value="#{GasQuality$AnalyserDB$AddAnalyser.addAnalysersDataProvider.value['analysers.KONTAKTPERSON']}"/>
                    <h:outputText binding="#{GasQuality$AnalyserDB$AddAnalyser.outputText12}" id="outputText12"
                        style="height: 24px; left: 672px; top: 552px; position: absolute; width: 120px" value="Contact Person"/>
                    <h:outputText binding="#{GasQuality$AnalyserDB$AddAnalyser.outputText13}" id="outputText13"
                        style="height: 24px; left: 672px; top: 600px; position: absolute; width: 120px" value="Comments"/>
                    <h:commandButton action="#{GasQuality$AnalyserDB$AddAnalyser.saveButton_action}" binding="#{GasQuality$AnalyserDB$AddAnalyser.saveButton}"
                        id="saveButton" style="height: 24px; left: 816px; top: 744px; position: absolute; width: 96px" value="Save"/>
                    <h:commandButton action="#{GasQuality$AnalyserDB$AddAnalyser.clearButton_action}" binding="#{GasQuality$AnalyserDB$AddAnalyser.clearButton}"
                        id="clearButton" style="height: 24px; left: 960px; top: 744px; position: absolute; width: 96px" value="Celar All"/>
                    <h:outputText binding="#{GasQuality$AnalyserDB$AddAnalyser.topMenuText}" id="topMenuText"
                        style="font-size: 24; height: 23px; left: 264px; top: 24px; position: absolute; width: 408px" styleClass="title1" title="" value="Add Gas Quality Analyser"/>
                    <h:outputText binding="#{GasQuality$AnalyserDB$AddAnalyser.outputText1}" id="outputText1"
                        style="height: 26px; left: 264px; top: 192px; position: absolute; width: 122px" value="Type"/>
                    <h:selectOneMenu binding="#{GasQuality$AnalyserDB$AddAnalyser.locationDropDown}" id="locationDropDown" style="height: 24px; left: 408px; top: 120px; position: absolute; width: 240px">
                        <f:selectItems binding="#{GasQuality$AnalyserDB$AddAnalyser.dropdown2SelectItems}" id="dropdown2SelectItems" value="#{GasQuality$AnalyserDB$AddAnalyser.analyserlocationviewDataProvider.options['analyserlocations.STED,analyserlocations.STED']}"/>
                    </h:selectOneMenu>
                    <h:inputTextarea binding="#{GasQuality$AnalyserDB$AddAnalyser.commentTextFeild}" id="commentTextFeild"
                        style="height: 120px; left: 816px; top: 600px; position: absolute; width: 240px" value="#{GasQuality$AnalyserDB$AddAnalyser.addAnalysersDataProvider.value['analysers.KONTAKTPERSON']}"/>
                    <h:commandLink action="#{GasQuality$AnalyserDB$AddAnalyser.linkAction1_action}" binding="#{GasQuality$AnalyserDB$AddAnalyser.linkAction1}"
                        id="linkAction1" style="font-size: 12; height: 24px; left: 264px; top: 216px; position: absolute; width: 120px">
                        <h:outputText binding="#{GasQuality$AnalyserDB$AddAnalyser.linkAction1Text}" id="linkAction1Text" value="Add Type"/>
                    </h:commandLink>
                    <h:commandLink action="#{GasQuality$AnalyserDB$AddAnalyser.linkAction1_action}" binding="#{GasQuality$AnalyserDB$AddAnalyser.linkAction2}"
                        id="linkAction2" style="font-size: 12; height: 24px; left: 264px; top: 144px; position: absolute; width: 120px">
                        <h:outputText binding="#{GasQuality$AnalyserDB$AddAnalyser.linkAction1Text1}" id="linkAction1Text1" value="Add Location"/>
                    </h:commandLink>
                    <h:commandLink action="#{GasQuality$AnalyserDB$AddAnalyser.selectAnalyserLink_action}"
                        binding="#{GasQuality$AnalyserDB$AddAnalyser.selectAnalyserLink}" id="selectAnalyserLink" style="height: 24px; left: -792px; top: -264px; position: absolute; width: 192px">
                        <h:outputText binding="#{GasQuality$AnalyserDB$AddAnalyser.linkAction3Text}" id="linkAction3Text" value="Select Analyser"/>
                    </h:commandLink>
                    <h:outputText binding="#{GasQuality$AnalyserDB$AddAnalyser.outputText14}" id="outputText14"
                        style="height: 24px; left: 672px; top: 120px; position: absolute; width: 120px" value="Installation Year"/>
                    <h:inputText binding="#{GasQuality$AnalyserDB$AddAnalyser.installationTextField}" id="installationTextField"
                        style="height: 24px; left: 816px; top: 120px; position: absolute; width: 240px" value="#{GasQuality$AnalyserDB$AddAnalyser.addAnalysersDataProvider.value['analysers.INSTALLASJONAAR']}"/>
                    <h:outputText binding="#{GasQuality$AnalyserDB$AddAnalyser.outputText31}" id="outputText31"
                        style="font-weight: bold; height: 24px; left: 28px; top: 216px; position: absolute; width: 192px" value="Menu"/>
                    <h:commandLink action="#{GasQuality$AnalyserDB$AddAnalyser.linkAction3_action}" binding="#{GasQuality$AnalyserDB$AddAnalyser.linkAction3}"
                        id="linkAction3" style="height: 24px; left: 28px; top: 240px; position: absolute; width: 192px">
                        <h:outputText binding="#{GasQuality$AnalyserDB$AddAnalyser.linkAction1Text2}" id="linkAction1Text2" value="Select Analyser"/>
                    </h:commandLink>
                    <h:selectOneMenu binding="#{GasQuality$AnalyserDB$AddAnalyser.analyserTypeDropDown}" id="analyserTypeDropDown" style="height: 24px; left: 408px; top: 192px; position: absolute; width: 240px">
                        <f:selectItems binding="#{GasQuality$AnalyserDB$AddAnalyser.dropdown2SelectItems1}" id="dropdown2SelectItems1" value="#{GasQuality$AnalyserDB$AddAnalyser.analysertypeviewDataProvider.options['analysertypes.INSTTYPES,analysertypes.INSTTYPES']}"/>
                    </h:selectOneMenu>
                </h:form>
            </body>
        </html>
    </f:view>
</jsp:root>
