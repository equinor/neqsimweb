<?xml version="1.0" encoding="windows-1252"?>
<!-- 
    Document   : Evaporation
    Created on : 15.jul.2009, 22:15:32
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
                        <ui:button id="button1" style="position: absolute; left: 360px; top: 48px; width: 72px; height: 24px" text="Button"/>
                        <ui:table augmentTitle="false" id="table1" style="position: absolute; left: 120px; top: 120px; height: 264px" title="Table" width="600">
                            <ui:tableRowGroup id="tableRowGroup1" rows="10" sourceData="#{NonEquilibrium$Calculator$Evaporation.defaultTableDataProvider}" sourceVar="currentRow">
                                <ui:tableColumn headerText="column1" id="tableColumn1" sort="column1">
                                    <ui:staticText id="staticText1" text="#{currentRow.value['column1']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn headerText="column2" id="tableColumn2" sort="column2">
                                    <ui:staticText id="staticText2" text="#{currentRow.value['column2']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn headerText="column3" id="tableColumn3" sort="column3">
                                    <ui:staticText id="staticText3" text="#{currentRow.value['column3']}"/>
                                </ui:tableColumn>
                            </ui:tableRowGroup>
                        </ui:table>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
