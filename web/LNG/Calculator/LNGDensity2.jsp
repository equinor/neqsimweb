<?xml version="1.0" encoding="windows-1252"?>
<!-- 
    Document   : LNGDensity2
    Created on : 02.jul.2008, 12:41:20
    Author     : ESOL
-->
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=windows-1252" pageEncoding="windows-1252"/>
    <f:view>
        <ui:page id="page1">
            <ui:html id="html1">
                <ui:head id="head1">
                    <ui:link id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body id="body1" style="-rave-layout: grid">
                    <ui:form id="form1">
                        <h:graphicImage height="192" id="image1" style="left: 24px; top: 24px; position: absolute" value="/resources/neqsim_logo.jpg" width="192"/>
                        <h:outputText id="outputText1" style="left: 240px; top: 24px; position: absolute" styleClass="title1" title="title1" value="LNG Density"/>
                        <div style="height: 48px; left: 24px; top: 216px; position: absolute; width: 72px">
                            <jsp:directive.include file="../LNGLeftMenuPage.jspf"/>
                        </div>
                        <ui:staticText id="staticText1" style="height: 22px; left: 240px; top: 96px; position: absolute; width: 598px" text="LNG density at atmospheric pressure estimation using the Klosek-McKinley algorithm (ISO 6578:1991)."/>
                        <ui:staticText id="staticText2" style="height: 24px; left: 240px; top: 144px; position: absolute; width: 142px" text="Temperature"/>
                        <ui:textField binding="#{LNG$Calculator$LNGDensity2.temperatureTextField}" id="temperatureTextField"
                            style="height: 24px; left: 384px; top: 144px; position: absolute; width: 144px" text="-163"/>
                        <ui:staticText id="staticText4" style="position: absolute; left: 552px; top: 144px; width: 48px; height: 24px" text="°C"/>
                        <ui:button action="#{LNG$Calculator$LNGDensity2.button1_action}" id="button1"
                            style="height: 24px; left: 383px; top: 288px; position: absolute; width: 72px" text="Calculate"/>
                        <ui:staticText id="staticText6" style="height: 24px; left: 240px; top: 336px; position: absolute; width: 120px" text="LNG density"/>
                        <ui:staticText binding="#{LNG$Calculator$LNGDensity2.lngDensityText}" id="lngDensityText"
                            style="height: 24px; left: 384px; top: 336px; position: absolute; width: 168px" text="NaN"/>
                        <ui:staticText id="staticText3" style="height: 24px; left: 552px; top: 336px; position: absolute; width: 48px" text="kg/m^3"/>
                        <ui:messageGroup id="messageGroup1" style="height: 192px; left: 648px; top: 144px; position: absolute; width: 240px"/>
                        <h:panelGrid binding="#{LNG$Calculator$LNGDensity2.detailsPanel}" columns="2" id="detailsPanel" rendered="false"
                            style="height: 96px; left: 240px; top: 432px; position: absolute" width="360">
                            <ui:staticText id="staticText5" text="Correction factor 1"/>
                            <ui:staticText binding="#{LNG$Calculator$LNGDensity2.corrFactor1Value}" id="corrFactor1Value"/>
                            <ui:staticText id="staticText7" text="Correction factor 2"/>
                            <ui:staticText binding="#{LNG$Calculator$LNGDensity2.corrFactor2Value}" id="corrFactor2Value"/>
                        </h:panelGrid>
                        <ui:hyperlink action="#{LNG$Calculator$LNGDensity2.hyperlink1_action}" id="hyperlink1"
                            style="height: 24px; left: 384px; top: 384px; position: absolute; width: 94px" text="Show details"/>
                        <ui:radioButtonGroup binding="#{LNG$Calculator$LNGDensity2.radioButtonGroup1}" id="radioButtonGroup1"
                            items="#{LNG$Calculator$LNGDensity2.volumeCorrectinButtonGroup.options}" required="true"
                            selected="#{LNG$Calculator$LNGDensity2.volumeCorrectinButtonGroup.selectedValue}" style="left: 240px; top: 216px; position: absolute; width: 360px"/>
                        <ui:staticText id="staticText8" style="height: 24px; left: 240px; top: 192px; position: absolute; width: 214px" text="Volume correction factor datasource"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
