<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <html lang="no-NO" xml:lang="no-NO">
            <head>
                <meta content="no-cache" http-equiv="Cache-Control"/>
                <meta content="no-cache" http-equiv="Pragma"/>
                <title>GasQuality$AnalyserDB$AnalyseSelect Title</title>
                <link href="/resources/stylesheet.css" rel="stylesheet" type="text/css"/>
            </head>
            <body style="-rave-layout: grid">
                <h:form binding="#{GasQuality$AnalyserDB$AnalyseSelect.form1}" id="form1">
                    <h:outputText binding="#{GasQuality$AnalyserDB$AnalyseSelect.topMenuText}" id="topMenuText"
                        style="font-size: 24; height: 25px; left: 264px; top: 24px; position: absolute; width: 552px" styleClass="/resources/stylesheet.css"
                        title="" value="Statoil Gas Quality Analyser Database"/>
                    <h:outputText binding="#{GasQuality$AnalyserDB$AnalyseSelect.loacitionText}" escape="false" id="loacitionText"
                        style="height: 24px; left: 22px; top: 290px; position: absolute; width: 120px" value="Location"/>
                    <h:outputText binding="#{GasQuality$AnalyserDB$AnalyseSelect.typeText}" id="typeText"
                        style="height: 24px; left: 24px; top: 360px; position: absolute; width: 120px" value="Type"/>
                    <h:commandButton action="#{GasQuality$AnalyserDB$AnalyseSelect.submitButton_action}"
                        binding="#{GasQuality$AnalyserDB$AnalyseSelect.typeButton}" id="typeButton"
                        style="height: 24px; left: 120px; top: 432px; position: absolute; width: 96px" value="Submit"/>
                    <h:commandButton action="#{GasQuality$AnalyserDB$AnalyseSelect.addButton_action}" binding="#{GasQuality$AnalyserDB$AnalyseSelect.addButton}"
                        id="addButton" style="height: 24px; left: 120px; top: 480px; position: absolute; width: 96px" value="Add New"/>
                    <h:outputText binding="#{GasQuality$AnalyserDB$AnalyseSelect.outputText8}" id="outputText8"
                        style="height: 96px; left: 264px; top: 96px; position: absolute; width: 414px; z-index: 500" value="Welcome to the Statoil gas quality analyser database. The database is a tool for cooperation and information sharing in Statoil. It should be maintained by persons resonsible for analysis equipment at Statoil operated on- and offshore installations. "/>
                    <h:outputText binding="#{GasQuality$AnalyserDB$AnalyseSelect.outputText7}" id="outputText7"
                        style="font-weight: bold; height: 24px; left: 22px; top: 218px; position: absolute; width: 192px" value="Main Menu"/>
                    <h:commandLink action="#{GasQuality$AnalyserDB$AnalyseSelect.startMenuLinkAction_action}"
                        binding="#{GasQuality$AnalyserDB$AnalyseSelect.startMenuLinkAction}" id="startMenuLinkAction" style="height: 24px; left: 22px; top: 242px; position: absolute; width: 192px">
                        <h:outputText binding="#{GasQuality$AnalyserDB$AnalyseSelect.linkAction1Text}" id="linkAction1Text" value="Start Menu"/>
                    </h:commandLink>
                    <h:graphicImage binding="#{GasQuality$AnalyserDB$AnalyseSelect.image2}" height="624" id="image2"
                        style="left: 672px; top: 96px; position: absolute" value="/resources/analysisNetwork.png" width="366"/>
                    <h:outputText binding="#{GasQuality$AnalyserDB$AnalyseSelect.outputText1}" id="outputText1"
                        style="height: 96px; left: 264px; top: 192px; position: absolute; width: 414px; z-index: 500" value=" Select location and analyser type from the left menu. New analysis equipment can be added by clicking the add new button. Exicting analysers can be modified or deleted be clicking the buttons in the generated tables."/>
                    <h:outputLink binding="#{GasQuality$AnalyserDB$AnalyseSelect.hyperlink1}" id="hyperlink1"
                        style="height: 28px; left: 264px; top: 312px; position: absolute; width: 408px" value="../resources/analysisdoc.doc">
                        <h:outputText binding="#{GasQuality$AnalyserDB$AnalyseSelect.hyperlink1Text}" id="hyperlink1Text" value="Online Analysis Instruments for Gas Quality Measurements in Statoil"/>
                    </h:outputLink>
                    <h:outputText binding="#{GasQuality$AnalyserDB$AnalyseSelect.outputText2}" id="outputText2"
                        style="height: 24px; left: 264px; top: 288px; position: absolute; width: 408px" value="Detailed infomation can be obtained from the document:"/>
                    <h:outputText binding="#{GasQuality$AnalyserDB$AnalyseSelect.outputText3}" id="outputText3"
                        style="height: 32px; left: 264px; top: 360px; position: absolute; width: 432px" value="Comments, updates and suggestions for improvements can be sent to:"/>
                    <h:outputLink binding="#{GasQuality$AnalyserDB$AnalyseSelect.hyperlink2}" id="hyperlink2"
                        style="height: 24px; left: 264px; top: 384px; position: absolute; width: 384px" value="mailto:esol@statoil.com,tvl@statoil.com">
                        <h:outputText binding="#{GasQuality$AnalyserDB$AnalyseSelect.hyperlink2Text}" id="hyperlink2Text" value="Torbjørn Vegard Løkken/Even Solbraa"/>
                    </h:outputLink>
                    <h:graphicImage binding="#{GasQuality$AnalyserDB$AnalyseSelect.image1}" height="192" id="image1"
                        style="left: 24px; top: 24px; position: absolute" value="/resources/neqsim_logo.jpg" width="192"/>
                    <h:selectOneMenu binding="#{GasQuality$AnalyserDB$AnalyseSelect.locationDropdown}" id="locationDropdown" style="height: 24px; left: 24px; top: 312px; position: absolute; width: 192px">
                        <f:selectItems binding="#{GasQuality$AnalyserDB$AnalyseSelect.dropdown1SelectItems}" id="dropdown1SelectItems" value="#{GasQuality$AnalyserDB$AnalyseSelect.analyserlocationviewDataProvider.options['analyserlocations.STED,analyserlocations.STED']}"/>
                    </h:selectOneMenu>
                    <h:selectOneMenu binding="#{GasQuality$AnalyserDB$AnalyseSelect.typeDropdown}" id="typeDropdown" style="position: absolute; left: 24px; top: 384px; width: 192px; height: 24px">
                        <f:selectItems binding="#{GasQuality$AnalyserDB$AnalyseSelect.dropdown1SelectItems1}" id="dropdown1SelectItems1" value="#{GasQuality$AnalyserDB$AnalyseSelect.analysertypeviewDataProvider.options['analysertypes.INSTTYPES,analysertypes.INSTTYPES']}"/>
                    </h:selectOneMenu>
                </h:form>
            </body>
        </html>
    </f:view>
</jsp:root>
