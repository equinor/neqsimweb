<?xml version="1.0" encoding="windows-1252"?>
<!-- 
    Document   : GasNetworkAnalysis
    Created on : 21.jul.2008, 14:51:19
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
                        <h:outputText id="topMenuText1" style="left: 240px; top: 24px; position: absolute; width: 672px" styleClass="title1" title="title1" value="Gas Network Analysis"/>
                        <ui:table augmentTitle="false" id="table1" style="height: 288px; left: 240px; top: 240px; position: absolute; width: 434px"
                            title="Field Production" width="434">
                            <ui:tableRowGroup binding="#{PipeFlow$GasNetworkAnalysis$GasNetworkFieldAnalysis.tableRowGroup1}" id="tableRowGroup1" rows="10"
                                sourceData="#{PipeFlow$GasNetworkAnalysis$GasNetworkFieldAnalysis.cachedRowSetDataProvider1}" sourceVar="currentRow">
                                <ui:tableColumn headerText="ID" id="tableColumn1" sort="fielddb.ID">
                                    <ui:staticText id="staticText1" text="#{currentRow.value['fielddb.ID']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn headerText="NAME" id="tableColumn6" sort="fielddb.NAME" width="142">
                                    <ui:staticText id="staticText6" text="#{currentRow.value['fielddb.NAME']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn headerText="PRODUCTION" id="tableColumn2" sort="fieldproductiondb.Production">
                                    <ui:staticText id="staticText2" text="#{currentRow.value['fieldproductiondb.Production']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn headerText="YEAR" id="tableColumn3" sort="fieldproductiondb.YEAR">
                                    <ui:staticText id="staticText3" text="#{currentRow.value['fieldproductiondb.YEAR']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn headerText="DELIVERYPIPE/PLANT" id="tableColumn7" sort="pipeplantdb.NAME">
                                    <ui:staticText id="staticText4" text="#{currentRow.value['pipeplantdb.NAME']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn headerText="DELIVERYPOINT" id="tableColumn10" sort="dieliverypointdb.NAME">
                                    <ui:staticText id="staticText10" text="#{currentRow.value['dieliverypointdb.NAME']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn headerText="DELETE" id="tableColumn8">
                                    <ui:button action="#{PipeFlow$GasNetworkAnalysis$GasNetworkFieldAnalysis.button4_action}" id="button4" text="Delete"/>
                                </ui:tableColumn>
                                <ui:tableColumn headerText="EDIT" id="tableColumn4">
                                    <ui:button id="button1" text="Edit"/>
                                </ui:tableColumn>
                                <ui:tableColumn headerText="OPEN/EDIT FLUID" id="tableColumn5" width="79">
                                    <ui:button action="#{PipeFlow$GasNetworkAnalysis$GasNetworkFieldAnalysis.button2_action}" id="button2" text="Open"/>
                                </ui:tableColumn>
                            </ui:tableRowGroup>
                        </ui:table>
                        <ui:button action="#{PipeFlow$GasNetworkAnalysis$GasNetworkFieldAnalysis.button3_action}" id="button3"
                            style="height: 24px; left: 479px; top: 192px; position: absolute; width: 72px" text="Add"/>
                        <ui:staticText id="staticText7" style="height: 24px; left: 240px; top: 192px; position: absolute; width: 214px" text="Click button to add production data"/>
                        <ui:staticText id="staticText8" style="height: 24px; left: 240px; top: 96px; position: absolute; width: 192px" text="Year"/>
                        <ui:textField binding="#{PipeFlow$GasNetworkAnalysis$GasNetworkFieldAnalysis.yearTextField}"
                            converter="#{PipeFlow$GasNetworkAnalysis$GasNetworkPipeFieldAnalysis.integerConverter1}" id="yearTextField"
                            style="height: 24px; left: 432px; top: 96px; position: absolute; width: 120px" text="2009"/>
                        <ui:staticText id="staticText9" style="height: 24px; left: 552px; top: 96px; position: absolute; width: 144px" text="[yyyy]"/>
                        <ui:textField binding="#{PipeFlow$GasNetworkAnalysis$GasNetworkFieldAnalysis.productionTextField}"
                            converter="#{PipeFlow$GasNetworkAnalysis$GasNetworkPipeFieldAnalysis.doubleConverter1}" id="productionTextField"
                            style="height: 24px; left: 432px; top: 144px; position: absolute; width: 120px" text="20.0"/>
                        <ui:staticText id="staticText11" style="height: 24px; left: 552px; top: 144px; position: absolute; width: 144px" text="[MSm^3/day]"/>
                        <ui:staticText id="staticText12" style="height: 24px; left: 240px; top: 144px; position: absolute; width: 192px" text="Production"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
