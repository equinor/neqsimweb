<?xml version="1.0" encoding="windows-1252"?>
<!-- 
    Document   : test
    Created on : 16.jul.2009, 14:47:47
    Author     : esol
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
                        <ui:button id="button1" style="position: absolute; left: 384px; top: 48px; width: 96px; height: 24px" text="Button"/>
                        <ui:table augmentTitle="false" id="table1" style="position: absolute; left: 264px; top: 168px; height: 312px" title="Table" width="0">
                            <ui:tableRowGroup id="tableRowGroup1" rows="10" sourceData="#{NonEquilibrium$Calculator$test.pipelineparametersDataProvider}" sourceVar="currentRow">
                                <ui:tableColumn headerText="ID" id="tableColumn1" sort="pipelineparameters.ID">
                                    <ui:staticText id="staticText1" text="#{currentRow.value['pipelineparameters.ID']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn headerText="POSITION" id="tableColumn2" sort="pipelineparameters.POSITION">
                                    <ui:staticText id="staticText2" text="#{currentRow.value['pipelineparameters.POSITION']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn headerText="HEIGHT" id="tableColumn3" sort="pipelineparameters.HEIGHT">
                                    <ui:staticText id="staticText3" text="#{currentRow.value['pipelineparameters.HEIGHT']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn headerText="DIAMETER" id="tableColumn4" sort="pipelineparameters.DIAMETER">
                                    <ui:staticText id="staticText4" text="#{currentRow.value['pipelineparameters.DIAMETER']}"/>
                                </ui:tableColumn>
                            </ui:tableRowGroup>
                        </ui:table>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
