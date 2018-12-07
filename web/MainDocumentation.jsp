<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{MainDocumentation.page1}" id="page1">
            <ui:html binding="#{MainDocumentation.html1}" id="html1">
                <ui:head binding="#{MainDocumentation.head1}" id="head1">
                    <ui:link binding="#{MainDocumentation.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{MainDocumentation.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{MainDocumentation.form1}" id="form1">
                        <h:graphicImage binding="#{MainDocumentation.image1}" height="192" id="image1" style="left: 24px; top: 24px; position: absolute"
                            value="/resources/neqsim_logo.jpg" width="192"/>
                        <h:outputText binding="#{MainDocumentation.outputText1}" id="outputText1"
                            style="font-size: 24; height: 32px; left: 240px; top: 24px; position: absolute; width: 840px" styleClass="title1" title="title1" value="Natural Gas Quality Tools Documentation"/>
                        <h:outputLink binding="#{MainDocumentation.hyperlink1}" id="hyperlink1" style="left: 24px; top: 288px; position: absolute; width: 190px"
                            styleClass="body-text-hyperlink-box" target="_blank" title="Forum" value="/GasQualityForum">
                            <h:outputText binding="#{MainDocumentation.hyperlink1Text1}" id="hyperlink1Text1" styleClass="body-text-hyperlink-box" value="Forum"/>
                        </h:outputLink>
                        <h:outputText binding="#{MainDocumentation.outputText2}" id="outputText2"
                            style="font-family: 'Times New Roman','Times',serif; height: 24px; left: 24px; top: 216px; position: absolute; width: 192px"
                            styleClass="body-text-bold" value="Main Menu"/>
                        <h:commandLink action="#{MainDocumentation.linkAction2_action}" binding="#{MainDocumentation.linkAction1}" id="linkAction1"
                            style="height: 24px; left: 24px; top: 264px; position: absolute; width: 192px" styleClass="body-text-hyperlink-box">
                            <h:outputText binding="#{MainDocumentation.linkAction2Text1}" id="linkAction2Text1" styleClass="body-text-hyperlink-box" value="Documentation"/>
                        </h:commandLink>
                        <h:commandLink action="#{MainDocumentation.linkAction1_action}" binding="#{MainDocumentation.linkAction2}" id="linkAction2"
                            style="height: 24px; left: 24px; top: 240px; position: absolute; width: 192px" styleClass="body-text-hyperlink-box">
                            <h:outputText binding="#{MainDocumentation.linkAction1Text1}" id="linkAction1Text1" styleClass="body-text-hyperlink-box" value="Home"/>
                        </h:commandLink>
                        <ui:hyperlink action="#{MainDocumentation.hyperlink2_action}" binding="#{MainDocumentation.hyperlink2}" id="hyperlink2"
                            style="position: absolute; left: 240px; top: 96px; width: 384px; height: 24px" styleClass="body-text-hyperlink-box" text="1. Thermodynamic and physical properties documentation"/>
                        <ui:hyperlink action="#{MainDocumentation.hyperlink3_action}" id="hyperlink3"
                            style="height: 24px; left: 240px; top: 120px; position: absolute; width: 384px" styleClass="body-text-hyperlink-box" text="2. Non-Equilibrium documentation"/>
                        <ui:hyperlink action="#{MainDocumentation.hyperlink4_action}" id="hyperlink4"
                            style="height: 24px; left: 240px; top: 144px; position: absolute; width: 384px" styleClass="body-text-hyperlink-box" text="3. Gas quality documentation"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
