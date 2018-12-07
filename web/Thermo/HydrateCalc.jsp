<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{Thermo$HydrateCalc.page1}" id="page1">
            <ui:html binding="#{Thermo$HydrateCalc.html1}" id="html1">
                <ui:head binding="#{Thermo$HydrateCalc.head1}" id="head1">
                    <ui:link binding="#{Thermo$HydrateCalc.link1}" id="link1" url="/resources/stylesheet.css"/>
                    <script type="text/javascript"><![CDATA[
                    function disableButton() {
                    var domNode = document.getElementById('form1:button1')
                    domNode.disabled = true;
                    }]]></script>
                </ui:head>
                <ui:body binding="#{Thermo$HydrateCalc.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{Thermo$HydrateCalc.form1}" id="form1">
                        <h:graphicImage binding="#{Thermo$HydrateCalc.imageNeqSIm1}" height="192" id="imageNeqSIm1"
                            style="left: 24px; top: 24px; position: absolute" value="../resources/neqsim_logo.jpg" width="192"/>
                        <div style="position: absolute; left: 24px; top: 216px; width: 120px; height: 48px">
                            <jsp:directive.include file="ThermoMenu.jspf"/>
                        </div>
                        <h:outputText binding="#{Thermo$HydrateCalc.gergWaterMenuText1}" id="gergWaterMenuText1"
                            style="font-size: 24; height: 22px; left: 264px; top: 24px; position: absolute; width: 478px" styleClass="title1" value="Calculations of hydrate equilibrium temperature "/>
                        <h:inputText binding="#{Thermo$HydrateCalc.pressureTextField}" id="pressureTextField"
                            style="height: 24px; left: 408px; top: 96px; position: absolute; width: 192px" value="1.0"/>
                        <h:outputText binding="#{Thermo$HydrateCalc.pressureTextField1}" id="pressureTextField1"
                            style="height: 24px; left: 264px; top: 96px; position: absolute; width: 120px" value="Pressure [bar]"/>
                        <ui:button action="#{Thermo$HydrateCalc.button1_action}" binding="#{Thermo$HydrateCalc.button1}" id="button1"
                            onClick="setTimeOut('disableButton()',10)" style="height: 24px; left: 407px; top: 192px; position: absolute; width: 96px" text="Ok"/>
                        <ui:staticText binding="#{Thermo$HydrateCalc.staticText3}" id="staticText3"
                            style="height: 24px; left: 264px; top: 240px; position: absolute; width: 190px" text="Hydrate equilibrium temperature:"/>
                        <ui:staticText binding="#{Thermo$HydrateCalc.hydrateFormationTemperatureTextField}" id="hydrateFormationTemperatureTextField"
                            style="height: 24px; left: 480px; top: 240px; position: absolute; width: 118px" text="NaN"/>
                        <ui:messageGroup binding="#{Thermo$HydrateCalc.messageGroup1}" id="messageGroup1" style="height: 216px; left: 720px; top: 96px; position: absolute; width: 288px"/>
                        <ui:staticText binding="#{Thermo$HydrateCalc.staticText6}" id="staticText6"
                            style="height: 24px; left: 600px; top: 240px; position: absolute; width: 96px" text="[C]"/>
                        <ui:staticText binding="#{Thermo$HydrateCalc.staticText7}" id="staticText7"
                            style="height: 24px; left: 336px; top: 264px; position: absolute; width: 120px" text="Hydrate structure"/>
                        <ui:staticText binding="#{Thermo$HydrateCalc.hydrateStructureTextField}" id="hydrateStructureTextField"
                            style="height: 24px; left: 480px; top: 264px; position: absolute; width: 120px" text="NaN"/>
                        <ui:checkbox binding="#{Thermo$HydrateCalc.TOLhydratecheckbox}" id="TOLhydratecheckbox"
                            label="Top Of Line Hydrate Equilibrium Temperature" style="left: 264px; top: 144px; position: absolute"/>
                        <div style="position: absolute; left: 0px; top: 0px"></div>
                        <div style="height: 72px; left: 264px; top: 504px; position: absolute; width: 72px">
                            <jsp:directive.include file="DocumentStatistics.jspf"/>
                        </div>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
