<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{Thermo$DewPoint2.page1}" id="page1">
            <ui:html binding="#{Thermo$DewPoint2.html1}" id="html1">
                <ui:head binding="#{Thermo$DewPoint2.head1}" id="head1">
                    <ui:link binding="#{Thermo$DewPoint2.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{Thermo$DewPoint2.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{Thermo$DewPoint2.form1}" id="form1">
                        <h:graphicImage binding="#{Thermo$DewPoint2.imageNeqSIm1}" height="192" id="imageNeqSIm1"
                            style="left: 24px; top: 24px; position: absolute" value="../resources/neqsim_logo.jpg" width="192"/>
                        <div style="position: absolute; left: 24px; top: 216px; width: 120px; height: 48px">
                            <jsp:directive.include file="ThermoMenu.jspf"/>
                        </div>
                        <h:outputText binding="#{Thermo$DewPoint2.gergWaterMenuText1}" id="gergWaterMenuText1"
                            style="font-size: 24; height: 22px; left: 264px; top: 24px; position: absolute; width: 478px" styleClass="title1" value="Water, ice and hydrate formation temperature "/>
                        <h:inputText binding="#{Thermo$DewPoint2.pressureTextField}" id="pressureTextField"
                            style="height: 24px; left: 528px; top: 144px; position: absolute; width: 168px"
                            validator="#{Thermo$DewPoint2.doubleRangeValidator1.validate}" value="1.0"/>
                        <h:outputText binding="#{Thermo$DewPoint2.pressureTextField1}" id="pressureTextField1"
                            style="height: 24px; left: 264px; top: 144px; position: absolute; width: 214px" value="Pressure [bar]"/>
                        <ui:button action="#{Thermo$DewPoint2.button1_action}" binding="#{Thermo$DewPoint2.button1}" id="button1"
                            style="height: 24px; left: 407px; top: 240px; position: absolute; width: 96px" text="Ok"/>
                        <ui:staticText binding="#{Thermo$DewPoint2.staticText1}" id="staticText1"
                            style="height: 24px; left: 264px; top: 288px; position: absolute; width: 144px" text="Aqueous dew point:"/>
                        <ui:staticText binding="#{Thermo$DewPoint2.staticText2}" id="staticText2"
                            style="height: 24px; left: 264px; top: 312px; position: absolute; width: 166px" text="Ice precipitation temperature:"/>
                        <ui:staticText binding="#{Thermo$DewPoint2.staticText3}" id="staticText3"
                            style="height: 24px; left: 264px; top: 336px; position: absolute; width: 190px" text="Hydrate formation temperature:"/>
                        <ui:staticText binding="#{Thermo$DewPoint2.waterDewPointTextFIeld}" id="waterDewPointTextFIeld"
                            style="height: 24px; left: 480px; top: 288px; position: absolute; width: 118px" text="NaN"/>
                        <ui:staticText binding="#{Thermo$DewPoint2.iceFormationTemperatureTextField}" id="iceFormationTemperatureTextField"
                            style="height: 24px; left: 480px; top: 312px; position: absolute; width: 118px" text="NaN"/>
                        <ui:staticText binding="#{Thermo$DewPoint2.hydrateFormationTemperatureTextField}" id="hydrateFormationTemperatureTextField"
                            style="height: 24px; left: 480px; top: 336px; position: absolute; width: 118px" text="NaN"/>
                        <ui:messageGroup binding="#{Thermo$DewPoint2.messageGroup1}" id="messageGroup1" style="height: 216px; left: 744px; top: 96px; position: absolute; width: 288px"/>
                        <ui:staticText binding="#{Thermo$DewPoint2.staticText4}" id="staticText4"
                            style="height: 24px; left: 600px; top: 288px; position: absolute; width: 96px" text="[C]"/>
                        <ui:staticText binding="#{Thermo$DewPoint2.staticText5}" id="staticText5"
                            style="height: 24px; left: 600px; top: 312px; position: absolute; width: 96px" text="[C]"/>
                        <ui:staticText binding="#{Thermo$DewPoint2.staticText6}" id="staticText6"
                            style="height: 24px; left: 600px; top: 336px; position: absolute; width: 96px" text="[C]"/>
                        <ui:staticText binding="#{Thermo$DewPoint2.staticText7}" id="staticText7"
                            style="height: 24px; left: 312px; top: 360px; position: absolute; width: 120px" text="Hydrate structure"/>
                        <ui:staticText binding="#{Thermo$DewPoint2.hydrateStructureTextField}" id="hydrateStructureTextField"
                            style="height: 24px; left: 480px; top: 360px; position: absolute; width: 120px" text="NaN"/>
                        <ui:checkbox binding="#{Thermo$DewPoint2.checkbox1}" id="checkbox1"
                            label="Calculate hydrate inhibitor or complex freeze out temperature" style="left: 264px; top: 192px; position: absolute"/>
                        <h:outputText id="pressureTextField2" style="height: 24px; left: 264px; top: 96px; position: absolute; width: 214px" value="Guessed dew point temperature [C]"/>
                        <h:inputText binding="#{Thermo$DewPoint2.temperatureTextField}" id="temperatureTextField"
                            style="height: 24px; left: 528px; top: 96px; position: absolute; width: 168px"
                            validator="#{Thermo$DewPoint2.doubleRangeValidator1.validate}" value="5.0"/>
                        <div style="height: 72px; left: 264px; top: 528px; position: absolute; width: 96px">
                            <jsp:directive.include file="DocumentStatistics.jspf"/>
                        </div>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
