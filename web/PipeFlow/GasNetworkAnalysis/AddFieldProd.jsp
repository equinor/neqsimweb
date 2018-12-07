<?xml version="1.0" encoding="windows-1252"?>
<!-- 
    Document   : AddFieldProd
    Created on : 27.jul.2008, 23:20:58
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
                        <h:outputText id="outputText1" style="height: 26px; left: 240px; top: 72px; position: absolute; width: 670px" styleClass="body-text" value="Please add information about the field production item."/>
                        <h:outputText id="topMenuText1" style="left: 240px; top: 24px; position: absolute; width: 672px" styleClass="title1" title="title1" value="Add field production"/>
                        <ui:staticText id="staticText1" style="position: absolute; left: 240px; top: 120px; width: 120px; height: 24px" text="Field"/>
                        <ui:dropDown id="dropDown1" items="#{PipeFlow$GasNetworkAnalysis$AddFieldProd.dropDown1DefaultOptions.options}" style="position: absolute; left: 408px; top: 120px; width: 192px; height: 24px"/>
                        <ui:staticText id="staticText2" style="height: 24px; left: 240px; top: 168px; position: absolute; width: 120px" text="Delivery point"/>
                        <ui:listbox id="listbox1" items="#{PipeFlow$GasNetworkAnalysis$AddFieldProd.listbox1DefaultOptions.options}" style="position: absolute; left: 408px; top: 168px; width: 192px; height: 24px"/>
                        <ui:dropDown id="dropDown2" items="#{PipeFlow$GasNetworkAnalysis$AddFieldProd.dropDown2DefaultOptions.options}" style="position: absolute; left: 408px; top: 216px; width: 192px; height: 24px"/>
                        <ui:staticText id="staticText3" style="height: 24px; left: 240px; top: 216px; position: absolute; width: 120px" text="Production start year"/>
                        <ui:staticText id="staticText4" style="height: 24px; left: 240px; top: 264px; position: absolute; width: 120px" text="Production end  year"/>
                        <ui:dropDown id="dropDown3" items="#{PipeFlow$GasNetworkAnalysis$AddFieldProd.dropDown3DefaultOptions.options}" style="height: 24px; left: 408px; top: 264px; position: absolute; width: 192px"/>
                        <ui:button id="button1" style="height: 24px; left: 359px; top: 336px; position: absolute; width: 96px" text="Add"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
