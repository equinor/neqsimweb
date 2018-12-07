<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <html lang="no-NO" xml:lang="no-NO">
            <head>
                <meta content="no-cache" http-equiv="Cache-Control"/>
                <meta content="no-cache" http-equiv="Pragma"/>
                <title>GasQuality$AnalyseSelect Title</title>
                <link href="../../resources/stylesheet.css" rel="stylesheet" type="text/css"/>
            </head>
            <body style="-rave-layout: grid">
                <h:form binding="#{GasQuality$MeasurementDB$MeasurementSelect2.form1}" id="form1">
                    <h:outputText binding="#{GasQuality$MeasurementDB$MeasurementSelect2.topMenuText}" id="topMenuText"
                        style="font-size: 24; height: 25px; left: 264px; top: 24px; position: absolute; width: 552px"
                        styleClass="../../resources/stylesheet.css title1" title="title1" value="Statoil Gas Quality Measurement Database"/>
                    <h:outputText binding="#{GasQuality$MeasurementDB$MeasurementSelect2.loacitionText}" escape="false" id="loacitionText"
                        style="height: 24px; left: 24px; top: 288px; position: absolute; width: 120px" value="Field/Installation"/>
                    <h:outputText binding="#{GasQuality$MeasurementDB$MeasurementSelect2.typeText}" id="typeText"
                        style="height: 24px; left: 24px; top: 432px; position: absolute; width: 120px" value="Sample Point"/>
                    <h:commandButton action="#{GasQuality$MeasurementDB$MeasurementSelect2.submitButton_action}"
                        binding="#{GasQuality$MeasurementDB$MeasurementSelect2.submitButton}" id="submitButton"
                        style="height: 24px; left: 120px; top: 504px; position: absolute; width: 96px" value="Submit"/>
                    <h:commandButton action="#{GasQuality$MeasurementDB$MeasurementSelect2.addButton_action}"
                        binding="#{GasQuality$MeasurementDB$MeasurementSelect2.addButton}" id="addButton"
                        style="height: 24px; left: 120px; top: 552px; position: absolute; width: 96px" value="Add New"/>
                    <h:graphicImage binding="#{GasQuality$MeasurementDB$MeasurementSelect2.image1}" height="192" id="image1"
                        style="left: 24px; top: 24px; position: absolute" value="/resources/neqsim_logo.jpg" width="196"/>
                    <h:selectOneMenu binding="#{GasQuality$MeasurementDB$MeasurementSelect2.loactionDropDownList}" id="loactionDropDownList"
                        style="height: 24px; left: 24px; top: 312px; position: absolute; width: 192px" valueChangeListener="#{GasQuality$MeasurementDB$MeasurementSelect2.loactionDropDownList_processValueChange}">
                        <f:selectItems binding="#{GasQuality$MeasurementDB$MeasurementSelect2.dropdown1SelectItems}" id="dropdown1SelectItems" value="#{GasQuality$MeasurementDB$MeasurementSelect2.loactionDropDownListDefaultItems}"/>
                    </h:selectOneMenu>
                    <h:selectOneMenu binding="#{GasQuality$MeasurementDB$MeasurementSelect2.typeDropDownList}" id="typeDropDownList"
                        style="height: 24px; left: 24px; top: 456px; position: absolute; width: 192px" valueChangeListener="#{GasQuality$MeasurementDB$MeasurementSelect2.typeDropDownList_processValueChange}">
                        <f:selectItems binding="#{GasQuality$MeasurementDB$MeasurementSelect2.dropdown1SelectItems1}" id="dropdown1SelectItems1" value="#{GasQuality$MeasurementDB$MeasurementSelect2.typeDropDownListDefaultItems}"/>
                    </h:selectOneMenu>
                    <h:outputText binding="#{GasQuality$MeasurementDB$MeasurementSelect2.outputText8}" id="outputText8"
                        style="height: 96px; left: 264px; top: 96px; position: absolute; width: 414px; z-index: 500" value="Welcome to the Statoil gas quality measurement database. The database is a tool for cooperation and information sharing in Statoil. It should be updated by peoble responisble for field measrements relevant to gas quality. "/>
                    <h:outputText binding="#{GasQuality$MeasurementDB$MeasurementSelect2.outputText7}" id="outputText7"
                        style="font-weight: bold; height: 24px; left: 24px; top: 216px; position: absolute; width: 192px" value="Main Menu"/>
                    <h:commandLink action="#{GasQuality$MeasurementDB$MeasurementSelect2.startMenuLinkAction_action}"
                        binding="#{GasQuality$MeasurementDB$MeasurementSelect2.startMenuLinkAction}" id="startMenuLinkAction" style="height: 24px; left: 24px; top: 240px; position: absolute; width: 192px">
                        <h:outputText binding="#{GasQuality$MeasurementDB$MeasurementSelect2.linkAction1Text}" id="linkAction1Text" value="Start Menu"/>
                    </h:commandLink>
                    <h:graphicImage binding="#{GasQuality$MeasurementDB$MeasurementSelect2.image2}" height="624" id="image2"
                        style="left: 648px; top: 96px; position: absolute" value="/resources/analysisNetwork.png" width="366"/>
                    <h:outputText binding="#{GasQuality$MeasurementDB$MeasurementSelect2.outputText1}" id="outputText1"
                        style="height: 96px; left: 264px; top: 192px; position: absolute; width: 414px; z-index: 500" value=" Select field/installation, sample point and measurement type  from the left menu.New measurment data can be aaded by clicking the add button. Exicting measurements can be modified by clicking the edit button in the generated tables."/>
                    <h:outputLink binding="#{GasQuality$MeasurementDB$MeasurementSelect2.hyperlink1}" id="hyperlink1" style="height: 26px; left: 264px; top: 288px; position: absolute; width: 432px">
                        <h:outputText binding="#{GasQuality$MeasurementDB$MeasurementSelect2.hyperlink1Text}" id="hyperlink1Text" value="A summary report will be available from this page by the end of 2005."/>
                    </h:outputLink>
                    <h:outputText binding="#{GasQuality$MeasurementDB$MeasurementSelect2.outputText3}" id="outputText3"
                        style="height: 26px; left: 264px; top: 336px; position: absolute; width: 432px" value="Comments, updates and suggestions for improvements can be sent to:"/>
                    <h:outputLink binding="#{GasQuality$MeasurementDB$MeasurementSelect2.hyperlink2}" id="hyperlink2"
                        style="height: 24px; left: 264px; top: 360px; position: absolute; width: 384px" value="mailto:esol@statoil.com">
                        <h:outputText binding="#{GasQuality$MeasurementDB$MeasurementSelect2.hyperlink2Text}" id="hyperlink2Text" value="Even Solbraa"/>
                    </h:outputLink>
                    <h:outputText binding="#{GasQuality$MeasurementDB$MeasurementSelect2.typeText1}" id="typeText1"
                        style="height: 24px; left: 24px; top: 360px; position: absolute; width: 120px" value="Measurement Type"/>
                    <h:selectOneMenu binding="#{GasQuality$MeasurementDB$MeasurementSelect2.typeDropDownList1}" id="typeDropDownList1"
                        style="height: 24px; left: 24px; top: 384px; position: absolute; width: 192px" valueChangeListener="#{GasQuality$MeasurementDB$MeasurementSelect2.typeDropDownList1_processValueChange}">
                        <f:selectItems binding="#{GasQuality$MeasurementDB$MeasurementSelect2.dropdown1SelectItems2}" id="dropdown1SelectItems2" value="#{GasQuality$MeasurementDB$MeasurementSelect2.typeDropDownList1DefaultItems}"/>
                    </h:selectOneMenu>
                </h:form>
            </body>
        </html>
    </f:view>
</jsp:root>
