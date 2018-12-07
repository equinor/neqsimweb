<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{Thermo$AsphalteneCalc.page1}" id="page1">
            <ui:html binding="#{Thermo$AsphalteneCalc.html1}" id="html1">
                <ui:head binding="#{Thermo$AsphalteneCalc.head1}" id="head1">
                    <ui:link binding="#{Thermo$AsphalteneCalc.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{Thermo$AsphalteneCalc.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{Thermo$AsphalteneCalc.form1}" id="form1">
                        <h:graphicImage binding="#{Thermo$AsphalteneCalc.imageNeqSIm1}" height="192" id="imageNeqSIm1"
                            style="left: 24px; top: 24px; position: absolute" value="../resources/neqsim_logo.jpg" width="192"/>
                        <div style="position: absolute; left: 24px; top: 216px; width: 120px; height: 48px">
                            <jsp:directive.include file="ThermoMenu.jspf"/>
                        </div>
                        <h:outputText binding="#{Thermo$AsphalteneCalc.gergWaterMenuText1}" id="gergWaterMenuText1"
                            style="font-size: 24; height: 22px; left: 264px; top: 24px; position: absolute; width: 478px" styleClass="title1" value="Check of potential aspahltene problems"/>
                        <h:inputText binding="#{Thermo$AsphalteneCalc.reservoirPressureTextField}" id="reservoirPressureTextField"
                            style="height: 24px; left: 478px; top: 167px; position: absolute; width: 192px" value="1.0"/>
                        <h:outputText binding="#{Thermo$AsphalteneCalc.pressureTextField1}" id="pressureTextField1"
                            style="height: 24px; left: 262px; top: 167px; position: absolute; width: 190px" value="Reservoir Pressure [bar]"/>
                        <ui:button action="#{Thermo$AsphalteneCalc.button1_action}" binding="#{Thermo$AsphalteneCalc.button1}" id="button1"
                            style="height: 24px; left: 479px; top: 288px; position: absolute; width: 96px" text="Ok"/>
                        <h:inputText binding="#{Thermo$AsphalteneCalc.reservoirTemperatureTextField}" id="reservoirTemperatureTextField"
                            style="height: 24px; left: 478px; top: 215px; position: absolute; width: 192px" value="1.0"/>
                        <h:outputText binding="#{Thermo$AsphalteneCalc.pressureTextField3}" id="pressureTextField3"
                            style="height: 24px; left: 262px; top: 215px; position: absolute; width: 190px" value="Reservoir Temperature [C]"/>
                        <ui:image binding="#{Thermo$AsphalteneCalc.image1}" height="432" id="image1" style="left: 264px; top: 432px; position: absolute"
                            url="/resources/de%20Boer.gif" width="640"/>
                        <ui:staticText binding="#{Thermo$AsphalteneCalc.staticText2}" id="staticText2"
                            style="height: 22px; left: 264px; top: 360px; position: absolute; width: 310px" text="Calculated density of reservoir oil [kg/m^3]:"/>
                        <ui:staticText binding="#{Thermo$AsphalteneCalc.staticText3}" id="staticText3"
                            style="height: 22px; left: 264px; top: 384px; position: absolute; width: 312px" text="Reservoir pressure minus bubble point pressure [bar]:"/>
                        <h:outputText binding="#{Thermo$AsphalteneCalc.pressureTextField2}" id="pressureTextField2"
                            style="height: 24px; left: 264px; top: 120px; position: absolute; width: 190px" value="Temperature [C]"/>
                        <h:outputText binding="#{Thermo$AsphalteneCalc.pressureTextField4}" id="pressureTextField4"
                            style="height: 24px; left: 264px; top: 72px; position: absolute; width: 190px" value="Pressure [bar]"/>
                        <h:inputText binding="#{Thermo$AsphalteneCalc.pressureTextField}" id="pressureTextField"
                            style="height: 24px; left: 480px; top: 72px; position: absolute; width: 192px" value="1.0"/>
                        <h:inputText binding="#{Thermo$AsphalteneCalc.temperatureTextField}" id="temperatureTextField"
                            style="height: 24px; left: 480px; top: 120px; position: absolute; width: 192px" value="1.0"/>
                        <ui:staticText binding="#{Thermo$AsphalteneCalc.calculatedDensityTextField}" id="calculatedDensityTextField"
                            style="height: 24px; left: 576px; top: 360px; position: absolute; width: 96px" text="NaN"/>
                        <ui:staticText binding="#{Thermo$AsphalteneCalc.calcPresDiffTextField}" id="calcPresDiffTextField"
                            style="height: 24px; left: 576px; top: 384px; position: absolute; width: 96px" text="NaN"/>
                        <ui:staticText binding="#{Thermo$AsphalteneCalc.staticText1}" id="staticText1"
                            style="height: 22px; left: 264px; top: 408px; position: absolute; width: 310px" text="Calculated buble point pressure [bar]"/>
                        <ui:staticText binding="#{Thermo$AsphalteneCalc.bublePointPressureTextField}" id="bublePointPressureTextField"
                            style="height: 24px; left: 576px; top: 408px; position: absolute; width: 96px" text="NaN"/>
                        <ui:messageGroup binding="#{Thermo$AsphalteneCalc.messageGroup1}" id="messageGroup1" style="position: absolute; left: 696px; top: 72px; width: 360px; height: 312px"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
