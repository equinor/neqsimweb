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
                <h:form binding="#{Thermo$DewPoint.form1}" id="form1">
                    <h:graphicImage binding="#{Thermo$DewPoint.imageNeqSIm}" height="192" id="imageNeqSIm" style="left: 24px; top: 24px; position: absolute"
                        value="../resources/neqsim_logo.jpg" width="192"/>
                    <h:outputText binding="#{Thermo$DewPoint.gergWaterMenuText}" id="gergWaterMenuText"
                        style="height: 24px; left: 264px; top: 24px; position: absolute; width: 336px; font-size: 20" value="Dew Point Calculation "/>
                    <h:outputText binding="#{Thermo$DewPoint.temperatureTextField}" id="temperatureTextField"
                        style="height: 24px; left: 264px; top: 96px; position: absolute; width: 120px" value="Temperature [C]"/>
                    <h:outputText binding="#{Thermo$DewPoint.pressureTextField}" id="pressureTextField"
                        style="height: 24px; left: 264px; top: 144px; position: absolute; width: 120px" value="Pressure [bar]"/>
                    <h:inputText binding="#{Thermo$DewPoint.temperatureTextInputField}" id="temperatureTextInputField"
                        style="height: 24px; left: 408px; top: 96px; position: absolute; width: 192px" value="25.0"/>
                    <h:commandButton action="#{Thermo$DewPoint.okButton_action}" binding="#{Thermo$DewPoint.okButton}" id="okButton"
                        style="height: 24px; left: 408px; top: 336px; position: absolute; width: 72px" value="OK"/>
                    <h:inputText binding="#{Thermo$DewPoint.pressureTextInputField}" id="pressureTextInputField"
                        style="height: 24px; left: 408px; top: 144px; position: absolute; width: 192px" value="1.0"/>
                    <h:outputText binding="#{Thermo$DewPoint.tpFlashSelectorText}" id="tpFlashSelectorText"
                        style="height: 28px; left: 264px; top: 216px; position: absolute; width: 168px" title="" value="Dew Point Temperature"/>
                    <h:outputText binding="#{Thermo$DewPoint.dewPointText}" id="dewPointText"
                        style="height: 28px; left: 264px; top: 240px; position: absolute; width: 168px" value="Dew Point Pressure"/>
                    <h:selectBooleanCheckbox binding="#{Thermo$DewPoint.dewPointTCheckBox}" id="dewPointTCheckBox"
                        style="height: 24px; left: 432px; top: 216px; position: absolute; width: 24px" value="true" valueChangeListener="#{Thermo$DewPoint.dewPointTCheckBox_processValueChange}"/>
                    <h:selectBooleanCheckbox binding="#{Thermo$DewPoint.dewPointPCheckBox}" id="dewPointPCheckBox"
                        style="height: 24px; left: 432px; top: 240px; position: absolute; width: 24px" valueChangeListener="#{Thermo$DewPoint.dewPointPCheckBox_processValueChange}"/>
                    <div style="position: absolute; left: 24px; top: 216px; width: 120px; height: 96px">
                        <jsp:directive.include file="ThermoMenu.jspf"/>
                    </div>
                </h:form>
                <div style="height: 72px; left: 24px; top: 216px; position: absolute; width: 120px">
                    <jsp:directive.include file="ThermoMenu.jspf"/>
                </div>
            </body>
        </html>
    </f:view>
</jsp:root>
