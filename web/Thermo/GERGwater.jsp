<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <html lang="no-NO" xml:lang="no-NO">
            <head>
                <meta content="no-cache" http-equiv="Cache-Control"/>
                <meta content="no-cache" http-equiv="Pragma"/>
                <title>Thermo$TPflash Title</title>
                <link href="resources/stylesheet.css" rel="stylesheet" type="text/css"/>
            </head>
            <body style="-rave-layout: grid">
                <h:form binding="#{Thermo$GERGwater.form1}" id="form1">
                    <h:graphicImage binding="#{Thermo$GERGwater.imageNeqSIm}" height="192" id="imageNeqSIm" style="left: 24px; top: 24px; position: absolute"
                        value="../resources/neqsim_logo.jpg" width="192"/>
                    <h:commandLink action="#{Thermo$GERGwater.startMenuLinkAction_action}" binding="#{Thermo$GERGwater.startMenuLinkAction}"
                        id="startMenuLinkAction" style="height: 24px; left: 24px; top: 216px; position: absolute; width: 192px">
                        <h:outputText binding="#{Thermo$GERGwater.linkAction1Text}" id="linkAction1Text" value="Start Menu"/>
                    </h:commandLink>
                    <h:commandLink action="#{Thermo$GERGwater.thermoMenuLinkAction_action}" binding="#{Thermo$GERGwater.thermoMenuLinkAction}"
                        id="thermoMenuLinkAction" style="height: 24px; left: 24px; top: 240px; position: absolute; width: 192px">
                        <h:outputText binding="#{Thermo$GERGwater.linkAction1Text1}" id="linkAction1Text1" value="Thermo Menu"/>
                    </h:commandLink>
                    <h:outputText binding="#{Thermo$GERGwater.gergWaterMenuText}" id="gergWaterMenuText"
                        style="height: 24px; left: 264px; top: 24px; position: absolute; width: 336px; font-size: 20" value="GERG-water"/>
                    <h:outputText binding="#{Thermo$GERGwater.temperatureTextField}" id="temperatureTextField"
                        style="height: 24px; left: 264px; top: 96px; position: absolute; width: 120px" value="Temperature [C]"/>
                    <h:outputText binding="#{Thermo$GERGwater.pressureTextField}" id="pressureTextField"
                        style="height: 24px; left: 264px; top: 144px; position: absolute; width: 120px" value="Pressure [bar]"/>
                    <h:inputText binding="#{Thermo$GERGwater.temperatureTextInputField}" id="temperatureTextInputField"
                        style="height: 24px; left: 408px; top: 96px; position: absolute; width: 192px" value="25.0"/>
                    <h:commandButton action="#{Thermo$GERGwater.okButton_action}" binding="#{Thermo$GERGwater.okButton}" id="okButton"
                        style="height: 24px; left: 408px; top: 336px; position: absolute; width: 72px" value="OK"/>
                    <h:inputText binding="#{Thermo$GERGwater.pressureTextInputField}" id="pressureTextInputField"
                        style="height: 24px; left: 408px; top: 144px; position: absolute; width: 192px" value="1.0"/>
                    <h:outputText binding="#{Thermo$GERGwater.tpFlashSelectorText}" id="tpFlashSelectorText"
                        style="height: 24px; left: 408px; top: 216px; position: absolute; width: 96px" title="" value="TPflash"/>
                    <h:outputText binding="#{Thermo$GERGwater.dewPointText}" id="dewPointText"
                        style="height: 24px; left: 408px; top: 240px; position: absolute; width: 96px" value="Dew Point"/>
                    <h:selectBooleanCheckbox binding="#{Thermo$GERGwater.tpFlashCheckBox}" id="tpFlashCheckBox"
                        style="height: 24px; left: 504px; top: 216px; position: absolute; width: 24px" value="true"/>
                    <h:selectBooleanCheckbox binding="#{Thermo$GERGwater.dewPointCheckBox}" id="dewPointCheckBox" style="height: 24px; left: 504px; top: 240px; position: absolute; width: 24px"/>
                </h:form>
            </body>
        </html>
    </f:view>
</jsp:root>
