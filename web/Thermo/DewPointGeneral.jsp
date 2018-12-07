<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{Thermo$DewPointGeneral.page1}" id="page1">
            <ui:html binding="#{Thermo$DewPointGeneral.html1}" id="html1">
                <ui:head binding="#{Thermo$DewPointGeneral.head1}" id="head1">
                    <ui:link binding="#{Thermo$DewPointGeneral.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{Thermo$DewPointGeneral.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{Thermo$DewPointGeneral.form1}" id="form1">
                        <h:graphicImage binding="#{Thermo$DewPointGeneral.imageNeqSIm1}" height="192" id="imageNeqSIm1"
                            style="left: 24px; top: 24px; position: absolute" value="../resources/neqsim_logo.jpg" width="192"/>
                        <h:outputText binding="#{Thermo$DewPointGeneral.gergWaterMenuText1}" id="gergWaterMenuText1"
                            style="font-size: 20; height: 24px; left: 264px; top: 24px; position: absolute; width: 336px" value="Dew Point Calculation"/>
                        <h:inputText binding="#{Thermo$DewPointGeneral.temperatureTextInputField}" converter="#{Thermo$DewPointGeneral.doubleConverter1}"
                            id="temperatureTextInputField" required="true" style="height: 24px; left: 408px; top: 72px; position: absolute; width: 192px"
                            validator="#{Thermo$DewPointGeneral.doubleRangeValidator1.validate}" value="25.0"/>
                        <h:outputText binding="#{Thermo$DewPointGeneral.temperatureTextField1}" id="temperatureTextField1"
                            style="height: 24px; left: 264px; top: 72px; position: absolute; width: 120px" value="Temperature [C]"/>
                        <h:outputText binding="#{Thermo$DewPointGeneral.pressureTextField1}" id="pressureTextField1"
                            style="height: 24px; left: 264px; top: 120px; position: absolute; width: 120px" value="Pressure [bar]"/>
                        <h:inputText binding="#{Thermo$DewPointGeneral.pressureTextInputField}" converter="#{Thermo$DewPointGeneral.doubleConverter1}"
                            id="pressureTextInputField" required="true" style="height: 24px; left: 408px; top: 120px; position: absolute; width: 192px"
                            validator="#{Thermo$DewPointGeneral.doubleRangeValidator1.validate}" value="1.0"/>
                        <h:selectBooleanCheckbox binding="#{Thermo$DewPointGeneral.bubPointTCheckBox}" id="bubPointTCheckBox"
                            style="height: 24px; left: 432px; top: 168px; position: absolute; width: 24px" value="true" valueChangeListener="#{Thermo$DewPointGeneral.bubPointTCheckBox_processValueChange}"/>
                        <h:outputText binding="#{Thermo$DewPointGeneral.dewPointText1}" id="dewPointText1"
                            style="height: 28px; left: 264px; top: 192px; position: absolute; width: 168px" value="Dew Point Pressure"/>
                        <h:selectBooleanCheckbox binding="#{Thermo$DewPointGeneral.bubPointPCheckBox}" id="bubPointPCheckBox"
                            style="height: 24px; left: 432px; top: 192px; position: absolute; width: 24px" valueChangeListener="#{Thermo$DewPointGeneral.bubPointPCheckBox_processValueChange}"/>
                        <h:outputText binding="#{Thermo$DewPointGeneral.tpFlashSelectorText1}" id="tpFlashSelectorText1"
                            style="height: 28px; left: 264px; top: 168px; position: absolute; width: 166px" title="" value="Dew Point Temperature"/>
                        <ui:button action="#{Thermo$DewPointGeneral.okButton_action}" binding="#{Thermo$DewPointGeneral.okButton}" id="okButton"
                            style="height: 24px; left: 407px; top: 264px; position: absolute; width: 72px" text="Ok"/>
                        <ui:staticText binding="#{Thermo$DewPointGeneral.staticText1}" id="staticText1"
                            style="height: 24px; left: 264px; top: 312px; position: absolute; width: 238px" text="Dew point pressure [bar]:"/>
                        <ui:staticText binding="#{Thermo$DewPointGeneral.staticText2}" id="staticText2"
                            style="height: 24px; left: 264px; top: 336px; position: absolute; width: 238px" text="Dew point temperature [C]:"/>
                        <ui:staticText binding="#{Thermo$DewPointGeneral.bubblePointPressureTextField}" id="bubblePointPressureTextField"
                            style="position: absolute; left: 504px; top: 312px; width: 96px; height: 24px" styleClass="" text="NaN"/>
                        <ui:staticText binding="#{Thermo$DewPointGeneral.bublePointTemperatureTextField}" id="bublePointTemperatureTextField"
                            style="height: 24px; left: 504px; top: 336px; position: absolute; width: 96px" text="NaN"/>
                        <div style="position: absolute; left: 24px; top: 216px; width: 96px; height: 48px">
                            <jsp:directive.include file="ThermoMenu.jspf"/>
                        </div>
                        <ui:messageGroup binding="#{Thermo$DewPointGeneral.messageGroup1}" id="messageGroup1" style="position: absolute; left: 648px; top: 72px; width: 336px; height: 240px"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
