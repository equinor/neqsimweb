<?xml version="1.0" encoding="windows-1252"?>
<!-- 
    Document   : AddField
    Created on : 27.jul.2008, 23:06:15
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
                        <h:outputText id="topMenuText1" style="left: 240px; top: 24px; position: absolute; width: 672px" styleClass="title1" title="title1" value="Add field"/>
                        <h:outputText id="outputText1" style="height: 26px; left: 240px; top: 72px; position: absolute; width: 670px" styleClass="body-text" value="Please add information about the field."/>
                        <ui:textField id="textField1" label="FIELD NAME" style="height: 24px; left: 240px; top: 120px; position: absolute; width: 286px"/>
                        <ui:button id="button1" style="height: 24px; left: 527px; top: 120px; position: absolute; width: 120px" text="Add"/>
                        <h:outputText id="topMenuText2" style="left: 240px; top: 192px; position: absolute; width: 672px" styleClass="title1" title="title1" value="Add pipe/plant"/>
                        <ui:textField id="textField2" label="PIPE/PLANT NAME" style="height: 24px; left: 240px; top: 240px; position: absolute; width: 286px"/>
                        <ui:button action="#{PipeFlow$GasNetworkAnalysis$AddField.button2_action}" id="button2"
                            style="height: 24px; left: 527px; top: 240px; position: absolute; width: 120px" text="Add"/>
                        <h:outputText id="topMenuText3" style="left: 240px; top: 312px; position: absolute; width: 672px" styleClass="title1" title="title1" value="Add connection point"/>
                        <ui:textField id="textField3" label="CONNECTION POINT" style="height: 24px; left: 240px; top: 360px; position: absolute; width: 286px"/>
                        <ui:button action="#{PipeFlow$GasNetworkAnalysis$AddField.button2_action}" id="button3"
                            style="height: 24px; left: 528px; top: 360px; position: absolute; width: 120px" text="Add"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
