<?xml version="1.0" encoding="windows-1252"?>
<!-- 
    Document   : LNGshipAgeing
    Created on : 16.mar.2009, 09:58:34
    Author     : esol
-->
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=windows-1252" pageEncoding="windows-1252"/>
    <f:view>
        <ui:page id="page1">
            <ui:html id="html1">
                <ui:head id="head1" title="">
                    <ui:link id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body id="body1" style="-rave-layout: grid">
                    <ui:form id="form1">
                        <h:graphicImage height="192" id="image1" style="left: 24px; top: 24px; position: absolute" value="/resources/neqsim_logo.jpg" width="192"/>
                        <div style="height: 96px; left: 24px; top: 216px; position: absolute; width: 144px">
                            <jsp:directive.include file="../LNGLeftMenuPage.jspf"/>
                        </div>
                        <h:outputText id="outputText1" style="left: 264px; top: 24px; position: absolute" styleClass="title1" title="title1" value="LNG ship ageing results"/>
                        <ui:table augmentTitle="false" id="table1" style="height: 68px; left: 264px; top: 216px; position: absolute; width: 1127px"
                            title="LNG quality" width="1127">
                            <ui:tableRowGroup id="tableRowGroup1" rows="10" sourceData="#{LNG$Calculator$LNGshipAgeingCompResults.cachedRowSetDataProvider1}" sourceVar="currentRow">
                                <ui:tableColumn headerText="TIME [hrs]" id="tableColumn1" sort="lngageingtable.TIME">
                                    <ui:staticText id="staticText1" text="#{currentRow.value['lngageingtable.TIME']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn headerText="NITROGEN" id="tableColumn2" sort="lngageingtable.xNITROGEN">
                                    <ui:staticText id="staticText2" text="#{currentRow.value['lngageingtable.xNITROGEN']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn headerText="METHANE" id="tableColumn4" sort="lngageingtable.XMETHANE">
                                    <ui:staticText id="staticText4" text="#{currentRow.value['lngageingtable.XMETHANE']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn headerText="ETHANE" id="tableColumn7" sort="lngageingtable.XETHANE">
                                    <ui:staticText id="staticText7" text="#{currentRow.value['lngageingtable.XETHANE']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn headerText="PROPANE" id="tableColumn8" sort="lngageingtable.xpropane">
                                    <ui:staticText id="staticText8" text="#{currentRow.value['lngageingtable.xpropane']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn headerText="i-BUTANE" id="tableColumn9" sort="lngageingtable.xiC4">
                                    <ui:staticText id="staticText9" text="#{currentRow.value['lngageingtable.xiC4']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn headerText="n-BUTANE" id="tableColumn10" sort="lngageingtable.xnC4">
                                    <ui:staticText id="staticText10" text="#{currentRow.value['lngageingtable.xnC4']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn headerText="i-PENTANE" id="tableColumn11" sort="lngageingtable.xiC5">
                                    <ui:staticText id="staticText11" text="#{currentRow.value['lngageingtable.xiC5']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn headerText="n-PENTANE" id="tableColumn12" sort="lngageingtable.xnC5">
                                    <ui:staticText id="staticText12" text="#{currentRow.value['lngageingtable.xnC5']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn headerText="n-HEXANE" id="tableColumn13" sort="lngageingtable.xnC6">
                                    <ui:staticText id="staticText13" text="#{currentRow.value['lngageingtable.xnC6']}"/>
                                </ui:tableColumn>
                            </ui:tableRowGroup>
                        </ui:table>
                        <ui:hyperlink action="#{LNG$Calculator$LNGshipAgeingCompResults.hyperlink1_action}" id="hyperlink1"
                            style="height: 24px; left: 264px; top: 192px; position: absolute; width: 144px" text="View ageing results"/>
                        <ui:staticText id="staticText3" style="height: 24px; left: 264px; top: 72px; position: absolute; width: 598px" text="Calculates LNG ageing during ship transport based on an accurate equation of state."/>
                        <ui:staticText id="staticText6" style="height: 24px; left: 264px; top: 120px; position: absolute; width: 598px" text="LNG density calculations are done based on the Klosek-Mc Kinley method (ISO6578)"/>
                        <ui:hyperlink action="#{LNG$Calculator$LNGshipAgeingCompResults.hyperlink2_action}" id="hyperlink2"
                            style="height: 24px; left: 432px; top: 192px; position: absolute; width: 144px" text="View gas composition"/>
                        <ui:staticText id="staticText5" style="height: 24px; left: 264px; top: 96px; position: absolute; width: 622px" text="Energy calculations are  based on ISO6976."/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
