<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{Thermo$ThermoStartPage.page1}" id="page1">
            <ui:html binding="#{Thermo$ThermoStartPage.html1}" id="html1">
                <ui:head binding="#{Thermo$ThermoStartPage.head1}" id="head1" title="Thermo Start Page">
                    <ui:link binding="#{Thermo$ThermoStartPage.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{Thermo$ThermoStartPage.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{Thermo$ThermoStartPage.form1}" id="form1">
                        <h:graphicImage binding="#{Thermo$ThermoStartPage.image1}" height="192" id="image1" style="left: 24px; top: 24px; position: absolute"
                            value="/resources/neqsim_logo.jpg" width="192"/>
                        <h:outputText binding="#{Thermo$ThermoStartPage.outputText1}" id="outputText1" style="left: 240px; top: 24px; position: absolute"
                            styleClass="title1" title="title1" value="Thermodynamic and Physical Property Calculations"/>
                        <div style="height: 288px; left: 24px; top: 216px; position: absolute; width: 192px">
                            <jsp:directive.include file="ThermoMenu.jspf"/>
                        </div>
                        <ui:staticText binding="#{Thermo$ThermoStartPage.staticText1}" id="staticText1" style="left: 240px; top: 96px; position: absolute"
                            styleClass="body-text" text="Please use the thermo menu to enter fluid composition and run calculations. "/>
                        <ui:staticText binding="#{Thermo$ThermoStartPage.staticText2}" id="staticText2" style="left: 240px; top: 144px; position: absolute"
                            styleClass="body-text" text="The nesessary steps to run a calculation are:"/>
                        <ui:staticText binding="#{Thermo$ThermoStartPage.staticText3}" id="staticText3" style="left: 240px; top: 168px; position: absolute"
                            styleClass="body-text" text="1. Select or enter a new fluid composition"/>
                        <ui:staticText binding="#{Thermo$ThermoStartPage.staticText4}" id="staticText4" style="left: 288px; top: 192px; position: absolute"
                            styleClass="body-text" text="Previos fluid compositions are store in a database. &#xa;&#x9;"/>
                        <ui:staticText binding="#{Thermo$ThermoStartPage.staticText5}" id="staticText5" style="left: 288px; top: 216px; position: absolute"
                            styleClass="body-text" text="Relevant experimental data can also be stored with the fluid."/>
                        <ui:staticText binding="#{Thermo$ThermoStartPage.staticText6}" id="staticText6" style="left: 240px; top: 240px; position: absolute"
                            styleClass="body-text" text="2. Select thermodynamic operation"/>
                        <ui:staticText binding="#{Thermo$ThermoStartPage.staticText7}" id="staticText7" style="left: 288px; top: 264px; position: absolute"
                            styleClass="body-text" text="Available operations are: TP-flash, dew point, hydrate,etc."/>
                        <ui:staticText binding="#{Thermo$ThermoStartPage.staticText8}" id="staticText8" style="left: 240px; top: 288px; position: absolute"
                            styleClass="body-text" text="3. View Results"/>
                        <ui:staticText binding="#{Thermo$ThermoStartPage.staticText9}" id="staticText9"
                            style="left: 288px; top: 312px; position: absolute; width: 480px" styleClass="body-text" text="The results will normally display automatically. Eventually press view results."/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
