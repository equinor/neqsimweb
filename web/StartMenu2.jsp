<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{StartMenu2.page1}" id="page1">
            <ui:html binding="#{StartMenu2.html1}" id="html1">
                <ui:head binding="#{StartMenu2.head1}" id="head1">
                    <ui:link binding="#{StartMenu2.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{StartMenu2.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{StartMenu2.form1}" id="form1">
                        <h:commandLink action="#{StartMenu2.thermoCalculatorLinkAction_action}" binding="#{StartMenu2.thermoCalculatorLinkAction1}"
                            id="thermoCalculatorLinkAction1" style="height: 30px; left: 240px; top: 192px; position: absolute; width: 288px" styleClass="body-text-hyperlink-box">
                            <h:outputText binding="#{StartMenu2.linkAction1Text1}" id="linkAction1Text1" styleClass="body-text-hyperlink-box" value="Calculator"/>
                        </h:commandLink>
                        <div style="height: 72px; left: 0px; top: 384px; position: absolute; width: 216px">
                            <jsp:directive.include file="UserLoginInformation.jspf"/>
                        </div>
                        <h:outputText binding="#{StartMenu2.outputText2}" id="outputText2"
                            style="font-family: 'Times New Roman','Times',serif; height: 24px; left: 24px; top: 216px; position: absolute; width: 192px"
                            styleClass="body-text-bold" value="Main Menu"/>
                        <h:outputText binding="#{StartMenu2.gasQualityoutputText1}" id="gasQualityoutputText1"
                            style="height: 28px; left: 240px; top: 384px; position: absolute; width: 336px" styleClass="body-text-bold" value="Gas Quality"/>
                        <h:commandLink action="#{StartMenu2.thermoDatabaseLinkAction_action}" binding="#{StartMenu2.thermoDatabaseLinkAction1}"
                            id="thermoDatabaseLinkAction1" style="height: 22px; left: 240px; top: 216px; position: absolute; width: 288px" styleClass="body-text-hyperlink-box">
                            <h:outputText binding="#{StartMenu2.linkAction1Text2}" id="linkAction1Text2" styleClass="body-text-hyperlink-box" value="Database"/>
                        </h:commandLink>
                        <h:outputText binding="#{StartMenu2.outputText3}" id="outputText3"
                            style="height: 22px; left: 576px; top: 336px; position: absolute; width: 336px" styleClass="body-text-bold" value="Liquefied Natural Gas"/>
                        <h:commandLink action="#{StartMenu2.pipeCalcLinkAction1_action}" binding="#{StartMenu2.pipeCalcLinkAction1}" id="pipeCalcLinkAction1"
                            style="font-size: 14px; height: 28px; left: 240px; top: 624px; position: absolute; width: 288px" styleClass="body-text-hyperlink-box">
                            <h:outputText binding="#{StartMenu2.linkAction4Text2}" id="linkAction4Text2" style="height: 17px; width: 71px"
                                styleClass="body-text-hyperlink-box" value="Calculator"/>
                        </h:commandLink>
                        <h:commandLink action="#{StartMenu2.gasQualitySpecificationLinkAction_action}"
                            binding="#{StartMenu2.gasQualitySpecificationLinkAction1}" id="gasQualitySpecificationLinkAction1"
                            style="font-size: 14px; height: 30px; left: 240px; top: 528px; position: absolute; width: 288px" styleClass="body-text-hyperlink-box">
                            <h:outputText binding="#{StartMenu2.linkAction2Text1}" id="linkAction2Text1" styleClass="body-text-hyperlink-box" value="Entry Point Specification Database"/>
                        </h:commandLink>
                        <h:commandLink action="#{StartMenu2.gasQualityPipeDatabaseLinkAction_action}" binding="#{StartMenu2.gasQualityPipeDatabaseLinkAction1}"
                            id="gasQualityPipeDatabaseLinkAction1"
                            style="font-size: 14px; height: 30px; left: 240px; top: 504px; position: absolute; width: 288px" styleClass="body-text-hyperlink-box">
                            <h:outputText binding="#{StartMenu2.linkAction2Text4}" id="linkAction2Text4" styleClass="body-text-hyperlink-box" value="Pipeline Gas Quality Database"/>
                        </h:commandLink>
                        <h:outputText binding="#{StartMenu2.outputText4}" id="outputText4"
                            style="height: 26px; left: 576px; top: 480px; position: absolute; width: 336px" styleClass="body-text-bold" value="Process Economy"/>
                        <h:outputText binding="#{StartMenu2.outputText5}" id="outputText5"
                            style="height: 28px; left: 240px; top: 576px; position: absolute; width: 336px" styleClass="body-text-bold" value="Pipeline Transport"/>
                        <h:outputText binding="#{StartMenu2.outputText6}" id="outputText6"
                            style="height: 22px; left: 240px; top: 144px; position: absolute; width: 336px" styleClass="body-text-bold" value="Thermodynamics and Physical Properties"/>
                        <h:commandLink action="#{StartMenu2.gasQualityStandardsLinkAction1_action}" binding="#{StartMenu2.gasQualityStandardsLinkAction1}"
                            id="gasQualityStandardsLinkAction1" style="font-size: 14px; height: 22px; left: 240px; top: 456px; position: absolute; width: 288px" styleClass="body-text-hyperlink-box">
                            <h:outputText binding="#{StartMenu2.linkAction2Text5}" id="linkAction2Text5" styleClass="body-text-hyperlink-box" value="Standards Database"/>
                        </h:commandLink>
                        <h:commandLink action="StarMenuToEconomyMenuPage" binding="#{StartMenu2.procEconLinkAction1}" id="procEconLinkAction1"
                            style="font-size: 14px; height: 24px; left: 576px; top: 528px; position: absolute; width: 290px" styleClass="body-text-hyperlink-box">
                            <h:outputText binding="#{StartMenu2.linkAction6Text1}" id="linkAction6Text1" styleClass="body-text-hyperlink-box" value="Calculator"/>
                        </h:commandLink>
                        <h:commandLink action="#{StartMenu2.gasQualityAnalyserDatabaseLinkAction1_action}"
                            binding="#{StartMenu2.gasQualityAnalyserDatabaseLinkAction1}" id="gasQualityAnalyserDatabaseLinkAction1"
                            style="font-size: 14; height: 22px; left: 240px; top: 480px; position: absolute; width: 288px" styleClass="body-text-hyperlink-box">
                            <h:outputText binding="#{StartMenu2.linkAction2Text7}" id="linkAction2Text7" styleClass="body-text-hyperlink-box" value="Analysis Equipment Database"/>
                        </h:commandLink>
                        <h:commandLink action="#{StartMenu2.processCalcLinkAction1_action}" binding="#{StartMenu2.processCalcLinkAction1}"
                            id="processCalcLinkAction1" style="font-size: 14px; height: 30px; left: 576px; top: 192px; position: absolute; width: 288px" styleClass="body-text-hyperlink-box">
                            <h:outputText binding="#{StartMenu2.linkAction5Text1}" id="linkAction5Text1" styleClass="body-text-hyperlink-box" value="Calculator- unit operation"/>
                        </h:commandLink>
                        <h:outputText binding="#{StartMenu2.processLinkOutputText1}" id="processLinkOutputText1"
                            style="height: 28px; left: 576px; top: 144px; position: absolute; width: 336px" styleClass="body-text-bold" value="Gas Production and Processing"/>
                        <h:outputText binding="#{StartMenu2.outputText7}" id="outputText7"
                            style="height: 22px; left: 240px; top: 264px; position: absolute; width: 334px" styleClass="body-text-bold" value="Non-Equilibrium and Mass Transfer"/>
                        <h:outputText binding="#{StartMenu2.topMenuText1}" id="topMenuText1" style="left: 240px; top: 24px; position: absolute; width: 672px"
                            styleClass="title1" title="title1" value="NeqSim Web"/>
                        <h:commandLink binding="#{StartMenu2.masstransLDatabaseinkAction1}" id="masstransLDatabaseinkAction1"
                            style="font-size: 14px; height: 22px; left: 240px; top: 336px; position: absolute; width: 288px" styleClass="body-text-hyperlink-box">
                            <h:outputText binding="#{StartMenu2.linkAction2Text8}" id="linkAction2Text8" styleClass="body-text-hyperlink-box" value="Database"/>
                        </h:commandLink>
                        <h:commandLink binding="#{StartMenu2.pipeDatabseLinkAction1}" id="pipeDatabseLinkAction1"
                            style="font-size: 14px; height: 22px; left: 240px; top: 696px; position: absolute; width: 288px" styleClass="body-text-hyperlink-box">
                            <h:outputText binding="#{StartMenu2.linkAction4Text4}" id="linkAction4Text4" styleClass="body-text-hyperlink-box" value="Pipeline Database"/>
                        </h:commandLink>
                        <h:commandLink action="#{StartMenu2.procEconLinkAction2_action}" binding="#{StartMenu2.procEconLinkAction2}" id="procEconLinkAction2"
                            style="font-size: 14px; height: 30px; left: 576px; top: 576px; position: absolute; width: 288px" styleClass="body-text-hyperlink-box">
                            <h:outputText binding="#{StartMenu2.linkAction6Text2}" id="linkAction6Text2" styleClass="body-text-hyperlink-box" value="Equipment Cost Database"/>
                        </h:commandLink>
                        <h:commandLink action="#{StartMenu2.processUnitDesignLink_action}" binding="#{StartMenu2.processUnitDesignLink}"
                            id="processUnitDesignLink" style="font-size: 14px; height: 30px; left: 576px; top: 216px; position: absolute; width: 288px" styleClass="body-text-hyperlink-box">
                            <h:outputText binding="#{StartMenu2.linkAction5Text3}" id="linkAction5Text3" styleClass="body-text-hyperlink-box" value="Calculator - unit operation design"/>
                        </h:commandLink>
                        <h:commandLink action="#{StartMenu2.masstransCalcLinkAction1_action}" binding="#{StartMenu2.masstransCalcLinkAction1}"
                            id="masstransCalcLinkAction1" style="font-size: 14px; height: 22px; left: 240px; top: 312px; position: absolute; width: 288px" styleClass="body-text-hyperlink-box">
                            <h:outputText binding="#{StartMenu2.linkAction2Text9}" id="linkAction2Text9" styleClass="body-text-hyperlink-box" value="Calculator"/>
                        </h:commandLink>
                        <h:commandLink action="#{StartMenu2.LNGDatabseLinkAction1_action}" binding="#{StartMenu2.pipeDatabseLinkAction2}"
                            id="pipeDatabseLinkAction2" style="font-size: 14px; height: 28px; left: 576px; top: 432px; position: absolute; width: 288px" styleClass="body-text-hyperlink-box">
                            <h:outputText binding="#{StartMenu2.linkAction4Text5}" id="linkAction4Text5" styleClass="body-text-hyperlink-box" value="Database"/>
                        </h:commandLink>
                        <h:graphicImage binding="#{StartMenu2.image1}" height="192" id="image1" style="left: 24px; top: 24px; position: absolute"
                            value="/resources/neqsim_logo.jpg" width="192"/>
                        <h:commandLink action="#{StartMenu2.gasQualityCalcLinkAction_action}" binding="#{StartMenu2.gasQualityCalcLinkAction1}"
                            id="gasQualityCalcLinkAction1" style="font-size: 14px; height: 22px; left: 240px; top: 432px; position: absolute; width: 288px" styleClass="body-text-hyperlink-box">
                            <h:outputText binding="#{StartMenu2.linkAction2Text10}" id="linkAction2Text10" styleClass="body-text-hyperlink-box" value="Calculator"/>
                        </h:commandLink>
                        <h:commandLink action="#{StartMenu2.linkAction2_action}" binding="#{StartMenu2.linkAction2}" id="linkAction2"
                            style="height: 24px; left: 24px; top: 240px; position: absolute; width: 192px" styleClass="body-text-hyperlink-box">
                            <h:outputText binding="#{StartMenu2.linkAction1Text4}" id="linkAction1Text4" styleClass="body-text-hyperlink-box" value="Home"/>
                        </h:commandLink>
                        <div style="height: 76px; left: 240px; top: 720px; position: absolute; width: 696px">
                            <jsp:directive.include file="BottomText.jspf"/>
                        </div>
                        <h:outputText binding="#{StartMenu2.outputText8}" id="outputText8"
                            style="height: 70px; left: 240px; top: 72px; position: absolute; width: 622px" styleClass="body-text" value="Select the preferred link from the available menus. If you have questions or suggestions related to NeqSim - please see the documentation or forum pages on the left menu. The learning link on the left menu leads to Wiki pages focusing on sharing knowledge related to oil and gas processing. "/>
                        <h:commandLink action="#{StartMenu2.statoilProcessSimAction_action}" binding="#{StartMenu2.statoilProcessSimAction1}"
                            id="statoilProcessSimAction1" style="font-size: 14px; height: 22px; left: 576px; top: 288px; position: absolute; width: 288px" styleClass="body-text-hyperlink-box">
                            <h:outputText binding="#{StartMenu2.linkAction6Text4}" id="linkAction6Text4" styleClass="body-text-hyperlink-box" value="Process Simulation Model Database"/>
                        </h:commandLink>
                        <h:commandLink action="#{StartMenu2.gasQualityStandardsLinkAction2_action}" id="gasQualityStandardsLinkAction2"
                            style="font-size: 14px; height: 22px; left: 576px; top: 264px; position: absolute; width: 288px" styleClass="body-text-hyperlink-box">
                            <h:outputText id="linkAction2Text11" styleClass="body-text-hyperlink-box" value="Standards Database"/>
                        </h:commandLink>
                        <h:commandLink action="#{StartMenu2.piplineStandardStandardsLinkAction_action}" id="piplineStandardStandardsLinkAction"
                            style="font-size: 14px; height: 22px; left: 240px; top: 672px; position: absolute; width: 288px" styleClass="body-text-hyperlink-box">
                            <h:outputText id="linkAction2Text12" styleClass="body-text-hyperlink-box" value="Standards Database"/>
                        </h:commandLink>
                        <h:commandLink action="#{StartMenu2.processEconomyStandardsLinkAction_action}" id="processEconomyStandardsLinkAction"
                            style="font-size: 14px; height: 22px; left: 576px; top: 552px; position: absolute; width: 288px" styleClass="body-text-hyperlink-box">
                            <h:outputText id="linkAction2Text13" styleClass="body-text-hyperlink-box" value="Standards Database"/>
                        </h:commandLink>
                        <h:commandLink action="#{StartMenu2.LNGStandardsLinkAction5_action}" id="LNGStandardsLinkAction5"
                            style="font-size: 14px; height: 22px; left: 576px; top: 408px; position: absolute; width: 288px" styleClass="body-text-hyperlink-box">
                            <h:outputText id="linkAction2Text14" styleClass="body-text-hyperlink-box" value="Standards Database"/>
                        </h:commandLink>
                        <h:commandLink action="#{StartMenu2.LNGLinkAction2_action}" id="gasQualityCalcLinkAction3"
                            style="font-size: 14px; height: 22px; left: 576px; top: 384px; position: absolute; width: 288px" styleClass="body-text-hyperlink-box">
                            <h:outputText id="linkAction2Text15" styleClass="body-text-hyperlink-box" value="Calculator"/>
                        </h:commandLink>
                        <h:commandLink action="#{StartMenu2.gasNetworkActionLink_action}" id="gasNetworkActionLink"
                            style="font-size: 14px; height: 22px; left: 240px; top: 648px; position: absolute; width: 288px" styleClass="body-text-hyperlink-box">
                            <h:outputText id="linkAction4Text3" styleClass="body-text-hyperlink-box" value="Gas Network Analysis"/>
                        </h:commandLink>
                        <ui:hyperlink id="hyperlink2"
                            style="color: blue; height: 24px; left: 24px; top: 264px; position: absolute; text-decoration: underline; width: 192px"
                            styleClass="body-text-hyperlink-box" target="_blank" text="Documentation" toolTip="Learn how to use NeqSim" url="https://wiki.equinor.com/wiki/index.php/NeqSim"/>
                        <ui:hyperlink action="#{StartMenu2.thermoDocumentationLink_action}" id="thermoDocumentationLink"
                            style="color: blue; height: 24px; left: 240px; top: 168px; position: absolute; text-decoration: underline; width: 286px"
                            styleClass="body-text-hyperlink-box" target="_blank" text="Documentation" url="http://129.241.62.72:8080/NeqSimWiki/en/Thermodynamic_and_physical_properties"/>
                        <ui:hyperlink id="gasProcessDocumentationLink"
                            style="color: blue; height: 24px; left: 576px; top: 168px; position: absolute; text-decoration: underline; width: 286px"
                            styleClass="body-text-hyperlink-box" target="_blank" text="Documentation" url="http://129.241.62.72:8080/NeqSimWiki/en/Gas_Processing_calculations_and_design"/>
                        <h:commandLink action="#{StartMenu2.processSystemDesignLink_action}" id="processSystemDesignLink1"
                            style="font-size: 14px; height: 30px; left: 576px; top: 240px; position: absolute; width: 288px" styleClass="body-text-hyperlink-box">
                            <h:outputText id="linkAction5Text2" styleClass="body-text-hyperlink-box" value="Calculator - process system design"/>
                        </h:commandLink>
                        <ui:hyperlink action="#{StartMenu2.thermoDocumentationLink_action}" id="massTransferDocumentationLink"
                            style="color: blue; height: 24px; left: 240px; top: 288px; position: absolute; text-decoration: underline; width: 286px"
                            styleClass="body-text-hyperlink-box" target="_blank" text="Documentation" url="http://129.241.62.72:8080/NeqSimWiki/en/Non-Equilibrium_and_Mass_Transfer"/>
                        <ui:hyperlink action="#{StartMenu2.thermoDocumentationLink_action}" id="gasQUalityDocumentationLink1"
                            style="color: blue; height: 24px; left: 240px; top: 408px; position: absolute; text-decoration: underline; width: 286px"
                            styleClass="body-text-hyperlink-box" text="Documentation" url="http://129.241.62.72:8080/NeqSimWiki/en/Gas_Quality"/>
                        <ui:hyperlink action="#{StartMenu2.thermoDocumentationLink_action}" id="pipelineTransportDocumentationLink2"
                            style="color: blue; height: 24px; left: 240px; top: 600px; position: absolute; text-decoration: underline; width: 286px"
                            styleClass="body-text-hyperlink-box" text="Documentation" url="http://129.241.62.72:8080/NeqSimWiki/en/Pipeline_Transport"/>
                        <ui:hyperlink action="#{StartMenu2.thermoDocumentationLink_action}" id="LNGDocumentationLink1"
                            style="color: blue; height: 24px; left: 576px; top: 360px; position: absolute; text-decoration: underline; width: 286px"
                            styleClass="body-text-hyperlink-box" target="_blank" text="Documentation" url="http://129.241.62.72:8080/NeqSimWiki/en/Liquefied_Natural_Gas"/>
                        <ui:hyperlink action="#{StartMenu2.thermoDocumentationLink_action}" id="LNGDocumentationLink2"
                            style="color: blue; height: 24px; left: 576px; top: 504px; position: absolute; text-decoration: underline; width: 286px"
                            styleClass="body-text-hyperlink-box" text="Documentation" url="http://129.241.62.72:8080/NeqSimWiki/en/Process_Economy"/>
                        <ui:hyperlink id="hyperlink3"
                            style="color: blue; height: 24px; left: 24px; top: 288px; position: absolute; text-decoration: underline; width: 192px"
                            styleClass="body-text-hyperlink-box" target="_blank" text="NeqSim Wiki" toolTip="NeqSim Wiki" url="https://wiki.equinor.com/wiki/index.php/WIKIHOW:How_to_use_NeqSim"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
