<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <html lang="no-NO" xml:lang="no-NO">
            <head>
                <meta content="no-cache" http-equiv="Cache-Control"/>
                <meta content="no-cache" http-equiv="Pragma"/>
                <title>Process$StatoilProcessSimulation$StatoilProcessMenuPage Title</title>
                <link href="/resources/stylesheet.css" rel="stylesheet" type="text/css"/>
            </head>
            <body style="-rave-layout: grid">
                <h:form binding="#{Process$StatoilProcessSimulation$StatoilProcessMenuPage.form1}" id="form1">
                    <h:graphicImage binding="#{Process$StatoilProcessSimulation$StatoilProcessMenuPage.image1}" height="192" id="image1"
                        style="left: 24px; top: 24px; position: absolute" value="/resources/neqsim_logo.jpg" width="192"/>
                    <h:outputText binding="#{Process$StatoilProcessSimulation$StatoilProcessMenuPage.topMenuText}" id="topMenuText"
                        style="font-size: 24; height: 23px; left: 264px; top: 24px; position: absolute; width: 408px" styleClass="/resources/stylesheet.css"
                        title="title1" value="Statoil Process Simulation"/>
                    <h:outputText binding="#{Process$StatoilProcessSimulation$StatoilProcessMenuPage.outputText1}" id="outputText1"
                        style="font-style: italic; height: 28px; left: 264px; top: 72px; position: absolute; width: 672px" value="Select process from the menus:"/>
                    <h:outputText binding="#{Process$StatoilProcessSimulation$StatoilProcessMenuPage.outputText2}" id="outputText2"
                        style="font-weight: bold; height: 28px; left: 264px; top: 144px; position: absolute; width: 288px" value="Åsgard B"/>
                    <h:outputText binding="#{Process$StatoilProcessSimulation$StatoilProcessMenuPage.outputText3}" id="outputText3"
                        style="font-weight: bold; height: 28px; left: 264px; top: 240px; position: absolute; width: 288px" value="Sleipner T"/>
                    <h:commandLink action="#{Process$StatoilProcessSimulation$StatoilProcessMenuPage.asgardH2SLinkAction_action}"
                        binding="#{Process$StatoilProcessSimulation$StatoilProcessMenuPage.asgardH2SLinkAction}" id="asgardH2SLinkAction" style="font-size: 14; height: 30px; left: 264px; top: 168px; position: absolute; width: 288px">
                        <h:outputText binding="#{Process$StatoilProcessSimulation$StatoilProcessMenuPage.linkAction1Text1}" id="linkAction1Text1" value="H2S/CO2 removal plant"/>
                    </h:commandLink>
                    <h:commandLink action="#{Process$StatoilProcessSimulation$StatoilProcessMenuPage.asgardH2SLinkAction_action}"
                        binding="#{Process$StatoilProcessSimulation$StatoilProcessMenuPage.sleipnerCO2LinkAction}" id="sleipnerCO2LinkAction" style="font-size: 14; height: 30px; left: 264px; top: 264px; position: absolute; width: 288px">
                        <h:outputText binding="#{Process$StatoilProcessSimulation$StatoilProcessMenuPage.linkAction1Text2}" id="linkAction1Text2" value="CO2-removal process"/>
                    </h:commandLink>
                    <h:outputText binding="#{Process$StatoilProcessSimulation$StatoilProcessMenuPage.outputText4}" id="outputText4"
                        style="font-weight: bold; height: 26px; left: 264px; top: 336px; position: absolute; width: 336px" value="Snøhvit"/>
                    <h:commandLink action="#{Process$StatoilProcessSimulation$StatoilProcessMenuPage.snohvitCO2LinkAction_action}"
                        binding="#{Process$StatoilProcessSimulation$StatoilProcessMenuPage.snohvitCO2LinkAction}" id="snohvitCO2LinkAction" style="font-size: 14; height: 30px; left: 264px; top: 360px; position: absolute; width: 288px">
                        <h:outputText binding="#{Process$StatoilProcessSimulation$StatoilProcessMenuPage.linkAction1Text3}" id="linkAction1Text3" value="CO2-removal process"/>
                    </h:commandLink>
                </h:form>
            </body>
        </html>
    </f:view>
</jsp:root>
