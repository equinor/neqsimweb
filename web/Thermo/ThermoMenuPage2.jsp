<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{Thermo$ThermoMenuPage2.page1}" id="page1">
            <ui:html binding="#{Thermo$ThermoMenuPage2.html1}" id="html1">
                <ui:head binding="#{Thermo$ThermoMenuPage2.head1}" id="head1">
                    <ui:link binding="#{Thermo$ThermoMenuPage2.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{Thermo$ThermoMenuPage2.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{Thermo$ThermoMenuPage2.form1}" id="form1">
                        <h:graphicImage binding="#{Thermo$ThermoMenuPage2.image1}" height="192" id="image1" style="left: 24px; top: 24px; position: absolute"
                            value="/resources/neqsim_logo.jpg" width="192"/>
                        <div style="position: absolute; left: 24px; top: 216px; width: 48px; height: 24px">
                            <jsp:directive.include file="ThermoMenu.jspf"/>
                        </div>
                        <h:outputText binding="#{Thermo$ThermoMenuPage2.outputText1}" id="outputText1"
                            style="height: 32px; left: 240px; top: 24px; position: absolute; width: 958px" styleClass="title1" title="title1" value="Thermodynamic and Physical Property Calculations"/>
                        <h:outputText binding="#{Thermo$ThermoMenuPage2.outputText2}" id="outputText2"
                            style="left: 240px; top: 72px; position: absolute; width: 432px" styleClass="body-text" value="Calculations with automated (best practice) model selection"/>
                        <h:commandLink action="#{Thermo$ThermoMenuPage2.scaleLinkAction_action}" binding="#{Thermo$ThermoMenuPage2.scaleLinkAction}"
                            id="scaleLinkAction" style="font-size: 14px; height: 26px; left: 240px; top: 432px; position: absolute; width: 432px">
                            <h:outputText binding="#{Thermo$ThermoMenuPage2.scaleLinkActionText1}" id="scaleLinkActionText1"
                                styleClass="body-text-hyperlink-box" value="Scale"/>
                        </h:commandLink>
                        <h:commandLink action="#{Thermo$ThermoMenuPage2.waxLinkAction_action}" binding="#{Thermo$ThermoMenuPage2.waxLinkAction}"
                            id="waxLinkAction" style="font-size: 14px; height: 24px; left: 240px; top: 480px; position: absolute; width: 432px">
                            <h:outputText binding="#{Thermo$ThermoMenuPage2.linkAction1Text1}" id="linkAction1Text1" styleClass="body-text-hyperlink-box" value="Wax"/>
                        </h:commandLink>
                        <h:commandLink action="#{Thermo$ThermoMenuPage2.hydrateLinkAction_action}" binding="#{Thermo$ThermoMenuPage2.hydrateLinkAction}"
                            id="hydrateLinkAction" style="font-size: 14px; height: 26px; left: 240px; top: 408px; position: absolute; width: 432px">
                            <h:outputText binding="#{Thermo$ThermoMenuPage2.scaleLinkActionText2}" id="scaleLinkActionText2"
                                styleClass="body-text-hyperlink-box" value="Natural Gas Hydrate"/>
                        </h:commandLink>
                        <h:commandLink action="#{Thermo$ThermoMenuPage2.tpFlashAction_action}" binding="#{Thermo$ThermoMenuPage2.tpFlashAction}"
                            id="tpFlashAction" style="font-size: 14px; height: 28px; left: 240px; top: 144px; position: absolute; width: 432px" styleClass="body-text-hyperlink-box">
                            <h:outputText binding="#{Thermo$ThermoMenuPage2.linkAction2Text1}" id="linkAction2Text1" styleClass="body-text-hyperlink-box" value="TP Flash"/>
                        </h:commandLink>
                        <h:commandLink action="#{Thermo$ThermoMenuPage2.bubblePointLinkAction_action}" binding="#{Thermo$ThermoMenuPage2.bubblePointLinkAction}"
                            id="bubblePointLinkAction" style="font-size: 14px; height: 26px; left: 240px; top: 312px; position: absolute; width: 432px" styleClass="/resources/stylesheet.css">
                            <h:outputText binding="#{Thermo$ThermoMenuPage2.linkAction1Text2}" id="linkAction1Text2" styleClass="body-text-hyperlink-box" value="Bubble Point"/>
                        </h:commandLink>
                        <h:commandLink action="#{Thermo$ThermoMenuPage2.phaseEnvelopeLinkAction_action}"
                            binding="#{Thermo$ThermoMenuPage2.phaseEnvelopeLinkAction}" id="phaseEnvelopeLinkAction" style="font-size: 14px; height: 26px; left: 240px; top: 216px; position: absolute; width: 432px">
                            <h:outputText binding="#{Thermo$ThermoMenuPage2.linkAction1Text3}" id="linkAction1Text3" styleClass="body-text-hyperlink-box" value="Phase Envelope"/>
                        </h:commandLink>
                        <h:commandLink action="#{Thermo$ThermoMenuPage2.dewPointLinkActin_action}" binding="#{Thermo$ThermoMenuPage2.dewPointLinkActin}"
                            id="dewPointLinkActin" style="font-size: 14px; height: 24px; left: 240px; top: 240px; position: absolute; width: 432px">
                            <h:outputText binding="#{Thermo$ThermoMenuPage2.linkAction2Text2}" id="linkAction2Text2" styleClass="body-text-hyperlink-box" value="Aqueous Dew Point (water, ice, hydrate and inhibitor)"/>
                        </h:commandLink>
                        <h:commandLink action="#{Thermo$ThermoMenuPage2.asphalteneLinkAction_action}" binding="#{Thermo$ThermoMenuPage2.asphalteneLinkAction}"
                            id="asphalteneLinkAction" style="font-size: 14px; height: 28px; left: 240px; top: 456px; position: absolute; width: 432px">
                            <h:outputText binding="#{Thermo$ThermoMenuPage2.linkAction1Text4}" id="linkAction1Text4" styleClass="body-text-hyperlink-box" value="Asphaltenes"/>
                        </h:commandLink>
                        <h:commandLink action="#{Thermo$ThermoMenuPage2.dewPointLinkAction_action}" binding="#{Thermo$ThermoMenuPage2.dewPointLinkAction}"
                            id="dewPointLinkAction" style="font-size: 14px; height: 26px; left: 240px; top: 288px; position: absolute; width: 432px" styleClass="/resources/stylesheet.css">
                            <h:outputText binding="#{Thermo$ThermoMenuPage2.linkAction1Text5}" id="linkAction1Text5" styleClass="body-text-hyperlink-box" value="Dew Point"/>
                        </h:commandLink>
                        <h:outputText id="outputText3" style="left: 240px; top: 528px; position: absolute; width: 432px" styleClass="body-text" value="Physical- and interfacial properties calculations"/>
                        <h:commandLink action="#{Thermo$ThermoMenuPage2.interfaceTensionLinkAction_action}" id="interfaceTensionLinkAction" style="font-size: 14px; height: 24px; left: 240px; top: 552px; position: absolute; width: 432px">
                            <h:outputText id="linkAction1Text6" styleClass="body-text-hyperlink-box" value="Interfacial Tension"/>
                        </h:commandLink>
                        <ui:staticText id="staticText1" style="font-size: 14px; height: 24px; left: 240px; top: 120px; position: absolute; width: 432px" text="Flash calculations"/>
                        <ui:staticText id="staticText2" style="font-size: 14px; height: 24px; left: 240px; top: 192px; position: absolute; width: 432px" text="Saturation point calculations"/>
                        <ui:staticText id="staticText3" style="font-size: 14px; height: 24px; left: 240px; top: 384px; position: absolute; width: 432px" text="Flow Assurance"/>
                        <h:commandLink action="#{Thermo$ThermoMenuPage2.freezingPointLinkAction_action}" id="freezingPointLinkAction"
                            style="font-size: 14px; height: 26px; left: 240px; top: 336px; position: absolute; width: 432px" styleClass="/resources/stylesheet.css">
                            <h:outputText id="linkAction1Text7" styleClass="body-text-hyperlink-box" value="Freezing point"/>
                        </h:commandLink>
                        <h:commandLink action="#{Thermo$ThermoMenuPage2.saturatewaterPointLinkActin_action}" id="saturatewaterPointLinkActin" style="font-size: 14px; height: 24px; left: 240px; top: 264px; position: absolute; width: 432px">
                            <h:outputText id="linkAction2Text3" styleClass="body-text-hyperlink-box" value="Saturate with water"/>
                        </h:commandLink>
                        <h:commandLink action="#{Thermo$ThermoMenuPage2.adsoprtionLinkAction_action}" id="adsoprtionLinkAction" style="font-size: 14px; height: 24px; left: 240px; top: 600px; position: absolute; width: 432px">
                            <h:outputText id="linkAction1Text8" styleClass="body-text-hyperlink-box" value="Adsorption"/>
                        </h:commandLink>
                        <h:commandLink action="#{Thermo$ThermoMenuPage2.viscosityLinkAction_action}" id="viscosityLinkAction" style="font-size: 14px; height: 24px; left: 240px; top: 576px; position: absolute; width: 432px">
                            <h:outputText id="linkAction1Text9" styleClass="body-text-hyperlink-box" value="Viscosity"/>
                        </h:commandLink>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
