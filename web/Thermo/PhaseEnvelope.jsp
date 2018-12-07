<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page">
    <jsp:directive.page contentType="text/html;charset=windows-1252" pageEncoding="UTF-8"/>
    <f:view>
        <html lang="no-NO" xml:lang="no-NO">
            <head>
                <meta content="no-cache" http-equiv="Cache-Control"/>
                <meta content="no-cache" http-equiv="Pragma"/>
                <title>Thermo$TPflash Title</title>
                <link href="/resources/stylesheet.css" rel="stylesheet" type="text/css"/>
            </head>
            <body style="-rave-layout: grid">
                <h:form binding="#{Thermo$PhaseEnvelope.form1}" id="form1">
                    <h:graphicImage binding="#{Thermo$PhaseEnvelope.imageNeqSIm}" height="192" id="imageNeqSIm"
                        style="left: 24px; top: 24px; position: absolute" value="../resources/neqsim_logo.jpg" width="192"/>
                    <h:outputText binding="#{Thermo$PhaseEnvelope.gergWaterMenuText}" id="gergWaterMenuText"
                        style="height: 24px; left: 264px; top: 24px; position: absolute; width: 336px; font-size: 20" value="Phase Envelope Calculation"/>
                    <h:outputText binding="#{Thermo$PhaseEnvelope.pressureTextField}" id="pressureTextField"
                        style="height: 26px; left: 264px; top: 96px; position: absolute; width: 168px" value="Min. Pressure [bar]"/>
                    <h:commandButton action="#{Thermo$PhaseEnvelope.okButton_action}" binding="#{Thermo$PhaseEnvelope.okButton}" id="okButton"
                        onmouseover="document.body.style.cursor = 'wait'" style="height: 24px; left: 408px; top: 288px; position: absolute; width: 72px" value="OK"/>
                    <h:inputText binding="#{Thermo$PhaseEnvelope.pressureTextInputField}" id="pressureTextInputField"
                        style="height: 24px; left: 456px; top: 96px; position: absolute; width: 192px" value="1.0"/>
                    <h:outputText binding="#{Thermo$PhaseEnvelope.tpFlashSelectorText}" id="tpFlashSelectorText"
                        style="height: 30px; left: 264px; top: 168px; position: absolute; width: 286px" title="" value="Hydrocarbon Phase Enevelope"/>
                    <h:outputText binding="#{Thermo$PhaseEnvelope.dewPointText}" id="dewPointText"
                        style="height: 30px; left: 264px; top: 192px; position: absolute; width: 286px" value="Aqueous Dew Point Line"/>
                    <h:selectBooleanCheckbox binding="#{Thermo$PhaseEnvelope.bubPointTCheckBox}" id="bubPointTCheckBox"
                        style="height: 24px; left: 552px; top: 168px; position: absolute; width: 24px" value="true"/>
                    <h:selectBooleanCheckbox binding="#{Thermo$PhaseEnvelope.bubPointPCheckBox}" id="bubPointPCheckBox" style="height: 24px; left: 552px; top: 192px; position: absolute; width: 24px"/>
                    <div style="height: 72px; left: 24px; top: 216px; position: absolute; width: 144px">
                        <jsp:directive.include file="ThermoMenu.jspf"/>
                    </div>
                    <h:outputText binding="#{Thermo$PhaseEnvelope.dewPointText1}" id="dewPointText1"
                        style="height: 30px; left: 264px; top: 216px; position: absolute; width: 286px" value="Hydrate Formation Line"/>
                    <h:selectBooleanCheckbox binding="#{Thermo$PhaseEnvelope.hydrateCheckBox}" id="hydrateCheckBox" style="height: 24px; left: 552px; top: 216px; position: absolute; width: 24px"/>
                </h:form>
                <div style="height: 24px; left: 24px; top: 216px; position: absolute; width: 48px">
                    <jsp:directive.include file="ThermoMenu.jspf"/>
                </div>
            </body>
        </html>
    </f:view>
</jsp:root>
