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
                <h:form binding="#{Thermo$WaxTemperature.form1}" id="form1">
                    <h:graphicImage binding="#{Thermo$WaxTemperature.imageNeqSIm}" height="192" id="imageNeqSIm"
                        style="left: 24px; top: 24px; position: absolute" value="../resources/neqsim_logo.jpg" width="192"/>
                    <h:outputText binding="#{Thermo$WaxTemperature.gergWaterMenuText}" id="gergWaterMenuText"
                        style="height: 24px; left: 264px; top: 24px; position: absolute; width: 336px; font-size: 20" value="WAX Temperature Calculation"/>
                    <h:outputText binding="#{Thermo$WaxTemperature.temperatureTextField}" id="temperatureTextField"
                        style="height: 24px; left: 264px; top: 96px; position: absolute; width: 120px" value="Temperature [C]"/>
                    <h:outputText binding="#{Thermo$WaxTemperature.pressureTextField}" id="pressureTextField"
                        style="height: 24px; left: 264px; top: 144px; position: absolute; width: 120px" value="Pressure [bar]"/>
                    <h:inputText binding="#{Thermo$WaxTemperature.temperatureTextInputField}" id="temperatureTextInputField"
                        style="height: 24px; left: 408px; top: 96px; position: absolute; width: 192px" value="25.0"/>
                    <h:commandButton action="#{Thermo$WaxTemperature.okButton_action}" binding="#{Thermo$WaxTemperature.okButton}" id="okButton"
                        style="height: 24px; left: 408px; top: 216px; position: absolute; width: 72px" value="OK"/>
                    <h:inputText binding="#{Thermo$WaxTemperature.pressureTextInputField}" id="pressureTextInputField"
                        style="height: 24px; left: 408px; top: 144px; position: absolute; width: 192px" value="1.0"/>
                    <div style="position: absolute; left: 24px; top: 216px; width: 120px; height: 96px">
                        <jsp:directive.include file="ThermoMenu.jspf"/>
                    </div>
                </h:form>
            </body>
        </html>
    </f:view>
</jsp:root>
