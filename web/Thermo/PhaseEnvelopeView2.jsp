<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{Thermo$PhaseEnvelopeView2.page1}" id="page1">
            <ui:html binding="#{Thermo$PhaseEnvelopeView2.html1}" id="html1">
                <ui:head binding="#{Thermo$PhaseEnvelopeView2.head1}" id="head1">
                    <ui:link binding="#{Thermo$PhaseEnvelopeView2.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{Thermo$PhaseEnvelopeView2.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{Thermo$PhaseEnvelopeView2.form1}" id="form1">
                        <h:graphicImage binding="#{Thermo$PhaseEnvelopeView2.imageNeqSim1}" height="192" id="imageNeqSim1"
                            style="left: 24px; top: 24px; position: absolute" value="../resources/neqsim_logo.jpg" width="192"/>
                        <div style="position: absolute; left: 24px; top: 216px; width: 168px; height: 72px">
                            <jsp:directive.include file="ThermoMenu.jspf"/>
                        </div>
                        <h:outputText binding="#{Thermo$PhaseEnvelopeView2.plotOutputText1}" id="plotOutputText1"
                            style="left: 264px; top: 24px; position: absolute" styleClass="title1" value="Phase Envelope"/>
                        <h:graphicImage binding="#{Thermo$PhaseEnvelopeView2.image1}" height="504" id="image1"
                            style="left: 264px; top: 72px; position: absolute" value="/servlet/DisplayJFreeChartImage" width="674"/>
                        <ui:staticText id="staticText1" style="left: 264px; top: 600px; position: absolute" text="Cricondenbar"/>
                        <ui:staticText id="staticText2" style="left: 264px; top: 624px; position: absolute" text="Cricondentherm"/>
                        <ui:staticText id="staticText3" style="left: 264px; top: 648px; position: absolute" text="Critical point"/>
                        <ui:staticText binding="#{Thermo$PhaseEnvelopeView2.cricondenbarTemperatureText}" id="cricondenbarTemperatureText" style="position: absolute; left: 360px; top: 600px; width: 96px; height: 24px"/>
                        <ui:staticText binding="#{Thermo$PhaseEnvelopeView2.cricondenthermTemperatureText1}" id="cricondenthermTemperatureText1" style="height: 24px; left: 360px; top: 624px; position: absolute; width: 96px"/>
                        <ui:staticText binding="#{Thermo$PhaseEnvelopeView2.criticalTemperature}" id="criticalTemperature" style="height: 24px; left: 360px; top: 648px; position: absolute; width: 96px"/>
                        <ui:staticText id="staticText4" style="position: absolute; left: 456px; top: 600px; width: 24px; height: 24px" text="°C"/>
                        <ui:staticText id="staticText5" style="height: 24px; left: 456px; top: 624px; position: absolute; width: 24px" text="°C"/>
                        <ui:staticText id="staticText6" style="height: 24px; left: 456px; top: 648px; position: absolute; width: 24px" text="°C"/>
                        <ui:staticText binding="#{Thermo$PhaseEnvelopeView2.cricondenbarPressureText}" id="cricondenbarPressureText" style="height: 24px; left: 504px; top: 600px; position: absolute; width: 96px"/>
                        <ui:staticText binding="#{Thermo$PhaseEnvelopeView2.cricondenthermPressureText}" id="cricondenthermPressureText" style="height: 24px; left: 504px; top: 624px; position: absolute; width: 96px"/>
                        <ui:staticText binding="#{Thermo$PhaseEnvelopeView2.criticalPressure}" id="criticalPressure" style="height: 24px; left: 504px; top: 648px; position: absolute; width: 96px"/>
                        <ui:staticText id="staticText7" style="height: 24px; left: 600px; top: 600px; position: absolute; width: 46px" text="bara"/>
                        <ui:staticText id="staticText8" style="height: 24px; left: 600px; top: 624px; position: absolute; width: 46px" text="bara"/>
                        <ui:staticText id="staticText9" style="height: 24px; left: 600px; top: 648px; position: absolute; width: 46px" text="bara"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
