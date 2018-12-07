<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{Thermo$BubblePoint2.page1}" id="page1">
            <ui:html binding="#{Thermo$BubblePoint2.html1}" id="html1">
                <ui:head binding="#{Thermo$BubblePoint2.head1}" id="head1">
                    <ui:link binding="#{Thermo$BubblePoint2.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{Thermo$BubblePoint2.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{Thermo$BubblePoint2.form1}" id="form1">
                        <h:graphicImage binding="#{Thermo$BubblePoint2.imageNeqSIm1}" height="192" id="imageNeqSIm1"
                            style="left: 24px; top: 24px; position: absolute" value="../resources/neqsim_logo.jpg" width="192"/>
                        <h:outputText binding="#{Thermo$BubblePoint2.gergWaterMenuText1}" id="gergWaterMenuText1"
                            style="font-size: 20; height: 24px; left: 264px; top: 24px; position: absolute; width: 336px" value="Bubble Point Calculation"/>
                        <h:inputText binding="#{Thermo$BubblePoint2.temperatureTextInputField}" converter="#{Thermo$BubblePoint2.doubleConverter1}"
                            id="temperatureTextInputField" required="true" style="height: 24px; left: 408px; top: 72px; position: absolute; width: 192px"
                            validator="#{Thermo$BubblePoint2.doubleRangeValidator1.validate}" value="25.0"/>
                        <h:outputText binding="#{Thermo$BubblePoint2.temperatureTextField1}" id="temperatureTextField1"
                            style="height: 24px; left: 264px; top: 72px; position: absolute; width: 120px" value="Temperature [C]"/>
                        <h:outputText binding="#{Thermo$BubblePoint2.pressureTextField1}" id="pressureTextField1"
                            style="height: 24px; left: 264px; top: 120px; position: absolute; width: 120px" value="Pressure [bar]"/>
                        <h:inputText binding="#{Thermo$BubblePoint2.pressureTextInputField}" converter="#{Thermo$BubblePoint2.doubleConverter1}"
                            id="pressureTextInputField" required="true" style="height: 24px; left: 408px; top: 120px; position: absolute; width: 192px"
                            validator="#{Thermo$BubblePoint2.doubleRangeValidator1.validate}" value="1.0"/>
                        <h:outputText binding="#{Thermo$BubblePoint2.tpFlashSelectorText1}" id="tpFlashSelectorText1"
                            style="height: 28px; left: 264px; top: 168px; position: absolute; width: 142px" title="" value="Select calcuation:"/>
                        <ui:button action="#{Thermo$BubblePoint2.okButton_action}" binding="#{Thermo$BubblePoint2.okButton}" id="okButton"
                            style="height: 24px; left: 407px; top: 264px; position: absolute; width: 72px" text="Ok"/>
                        <ui:staticText binding="#{Thermo$BubblePoint2.staticText1}" id="staticText1"
                            style="height: 24px; left: 264px; top: 312px; position: absolute; width: 238px" text="Bubble point pressure [bar]:"/>
                        <ui:staticText binding="#{Thermo$BubblePoint2.staticText2}" id="staticText2"
                            style="height: 24px; left: 264px; top: 336px; position: absolute; width: 238px" text="Bubble point temperature [C]:"/>
                        <ui:staticText binding="#{Thermo$BubblePoint2.bubblePointPressureTextField}" id="bubblePointPressureTextField"
                            style="position: absolute; left: 504px; top: 312px; width: 96px; height: 24px" styleClass="" text="NaN"/>
                        <ui:staticText binding="#{Thermo$BubblePoint2.bublePointTemperatureTextField}" id="bublePointTemperatureTextField"
                            style="height: 24px; left: 504px; top: 336px; position: absolute; width: 96px" text="NaN"/>
                        <div style="position: absolute; left: 24px; top: 216px; width: 96px; height: 48px">
                            <jsp:directive.include file="ThermoMenu.jspf"/>
                        </div>
                        <ui:messageGroup binding="#{Thermo$BubblePoint2.messageGroup1}" id="messageGroup1" style="position: absolute; left: 648px; top: 72px; width: 336px; height: 240px"/>
                        <ui:radioButtonGroup binding="#{Thermo$BubblePoint2.calcuationRadioButtonGroup}" id="calcuationRadioButtonGroup"
                            items="#{Thermo$BubblePoint2.calcuationRadioButtonGroupDefaultOptions.options}" required="true"
                            selected="#{Thermo$BubblePoint2.calcuationRadioButtonGroupDefaultOptions.selectedValue}" style="height: 48px; left: 408px; top: 168px; position: absolute; width: 192px"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
