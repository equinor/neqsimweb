<?xml version="1.0" encoding="windows-1252"?>
<!-- 
    Document   : GasNetworkStartPage
    Created on : 21.jul.2008, 14:39:23
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
                        <div style="height: 48px; left: 24px; top: 216px; position: absolute; width: 72px">
                            <jsp:directive.include file="../PipeFlowLeftMenuPage.jspf"/>
                        </div>
                        <h:outputText id="topMenuText1" style="left: 240px; top: 24px; position: absolute; width: 672px" styleClass="title1" title="title1" value="Gas Network Analysis Tools"/>
                        <h:outputText id="outputText1" style="height: 26px; left: 240px; top: 72px; position: absolute; width: 670px" styleClass="body-text" value="Welcome to the gas network intranet tools main menu page. "/>
                        <h:outputText id="outputText2" style="height: 26px; left: 240px; top: 96px; position: absolute; width: 670px" styleClass="body-text" value="Select calculation type from the options in the menus below."/>
                        <ui:hyperlink action="#{PipeFlow$GasNetworkAnalysis$GasNetworkStartPage.hyperlink1_action}" id="hyperlink1"
                            style="position: absolute; left: 240px; top: 144px; width: 216px; height: 24px" text="Gas Network Analysis Database"/>
                        <ui:staticText id="staticText1" style="height: 24px; left: 240px; top: 192px; position: absolute; width: 94px" text="Field"/>
                        <ui:button action="#{PipeFlow$GasNetworkAnalysis$GasNetworkStartPage.button1_action}" id="button1"
                            style="height: 24px; left: 623px; top: 192px; position: absolute; width: 72px" text="Open"/>
                        <ui:staticText id="staticText2" style="height: 24px; left: 240px; top: 240px; position: absolute; width: 94px" text="Pipeline"/>
                        <ui:dropDown binding="#{PipeFlow$GasNetworkAnalysis$GasNetworkStartPage.pipelineDropDown}"
                            converter="#{PipeFlow$GasNetworkAnalysis$GasNetworkStartPage.pipelineDropDownConverter}" id="pipelineDropDown"
                            items="#{PipeFlow$GasNetworkAnalysis$GasNetworkStartPage.cachedRowSetDataProvider2.options['pipeplantdb.ID,pipeplantdb.NAME']}" style="height: 24px; left: 360px; top: 240px; position: absolute; width: 240px"/>
                        <ui:button action="#{PipeFlow$GasNetworkAnalysis$GasNetworkStartPage.button2_action}" id="button2"
                            style="height: 24px; left: 623px; top: 240px; position: absolute; width: 71px" text="Open"/>
                        <ui:imageHyperlink height="24" id="imageHyperlink1" style="left: 720px; top: 192px; position: absolute" text="Add Field" width="96"/>
                        <ui:imageHyperlink height="24" id="imageHyperlink2" style="left: 720px; top: 240px; position: absolute" text="Add Pipeline" width="96"/>
                        <ui:dropDown binding="#{PipeFlow$GasNetworkAnalysis$GasNetworkStartPage.fieldDropDown}" id="fieldDropDown"
                            items="#{PipeFlow$GasNetworkAnalysis$GasNetworkStartPage.cachedRowSetDataProvider1.options['fielddb.ID,fielddb.NAME']}" style="height: 24px; left: 360px; top: 192px; position: absolute; width: 240px"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
