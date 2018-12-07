<?xml version="1.0" encoding="windows-1252"?>
<!-- 
    Document   : ProcessOperations
    Created on : 27.jun.2009, 22:20:38
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
                        <h:outputText id="logoOutputText1" style="height: 25px; left: 264px; top: 24px; position: absolute; width: 552px" styleClass="title1" value="Gas Process Unit Operations"/>
                        <div style="position: absolute; left: 24px; top: 216px; width: 48px; height: 48px">
                            <jsp:directive.include file="../ProcessLeftMenuPage.jspf"/>
                        </div>
                        <div style="position: absolute; left: 24px; top: 408px; width: 144px; height: 144px">
                            <jsp:directive.include file="GasProcessCalcRightMenu2.jspf"/>
                        </div>
                        <h:commandLink action="#{Process$calculator$ProcessOperations.separatorLink_action}" id="separatorLink" style="height: 24px; left: 265px; top: 119px; position: absolute; width: 238px">
                            <h:outputText id="linkAction1Text1" value="Two/Three Phase Separator"/>
                        </h:commandLink>
                        <h:commandLink action="#{Process$calculator$ProcessOperations.compressorLink_action}" id="compressorLink" style="height: 24px; left: 264px; top: 240px; position: absolute; width: 238px">
                            <h:outputText id="linkAction1Text2" value="Compressor"/>
                        </h:commandLink>
                        <ui:staticText id="staticText1" style="height: 24px; left: 265px; top: 95px; position: absolute; width: 240px" text="Standard operations"/>
                        <ui:staticText id="staticText2" style="height: 24px; left: 264px; top: 216px; position: absolute; width: 240px" text="Pumps,  Compressors and Expanders"/>
                        <h:commandLink action="#{Process$calculator$ProcessOperations.iso6976Action3_action}" id="iso6976Action3" style="height: 24px; left: 264px; top: 264px; position: absolute; width: 238px">
                            <h:outputText id="linkAction1Text3" value="Pump"/>
                        </h:commandLink>
                        <ui:staticText id="staticText3" style="height: 24px; left: 264px; top: 336px; position: absolute; width: 240px" text="Absorption/Destillation"/>
                        <h:commandLink action="#{Process$calculator$ProcessOperations.valveAction_action}" id="valveAction" style="height: 24px; left: 264px; top: 144px; position: absolute; width: 238px">
                            <h:outputText id="linkAction1Text4" value="Valve"/>
                        </h:commandLink>
                        <h:commandLink action="#{Process$calculator$ProcessOperations.iso6976Action5_action}" id="iso6976Action5" style="height: 24px; left: 264px; top: 360px; position: absolute; width: 238px">
                            <h:outputText id="linkAction1Text5" value="Destillation column"/>
                        </h:commandLink>
                        <h:commandLink action="#{Process$calculator$ProcessOperations.iso6976Action_action}" id="iso6976Action6" style="height: 24px; left: 264px; top: 384px; position: absolute; width: 238px">
                            <h:outputText id="linkAction1Text8" value="Absorption column"/>
                        </h:commandLink>
                        <ui:staticText id="staticText4" style="height: 24px; left: 264px; top: 432px; position: absolute; width: 240px" text="Heat Exchanger"/>
                        <h:commandLink action="#{Process$calculator$ProcessOperations.heatExchangerLink_action}" id="heatExchangerLink" style="height: 24px; left: 264px; top: 456px; position: absolute; width: 238px">
                            <h:outputText id="linkAction1Text6" value="Standard heat exchanger"/>
                        </h:commandLink>
                        <h:commandLink action="#{Process$calculator$ProcessOperations.gasScrubberLink_action}" id="gasScrubberLink" style="height: 24px; left: 264px; top: 168px; position: absolute; width: 238px">
                            <h:outputText id="linkAction1Text7" value="Gas scrubber"/>
                        </h:commandLink>
                        <h:commandLink action="#{Process$calculator$ProcessOperations.expanderLink_action}" id="expanderLink" style="height: 24px; left: 264px; top: 288px; position: absolute; width: 238px">
                            <h:outputText id="linkAction1Text9" value="Expander"/>
                        </h:commandLink>
                        <ui:staticText id="staticText5" style="height: 24px; left: 264px; top: 504px; position: absolute; width: 240px" text="Pipe"/>
                        <h:commandLink action="#{Process$calculator$ProcessOperations.processPipeLink_action}" id="processPipeLink" style="height: 24px; left: 264px; top: 528px; position: absolute; width: 238px">
                            <h:outputText id="linkAction1Text10" value="Pipe (adiabatic)"/>
                        </h:commandLink>
                        <h:commandLink action="#{Process$calculator$ProcessOperations.pipelineLink_action}" id="pipelineLink" style="height: 24px; left: 264px; top: 552px; position: absolute; width: 238px">
                            <h:outputText id="linkAction1Text11" value="Pipeline (onephase/multiphase)"/>
                        </h:commandLink>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
