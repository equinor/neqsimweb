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
                        <ui:table augmentTitle="false" id="table1" style="height: 68px; left: 264px; top: 216px; position: absolute; width: 767px"
                            title="LNG quality" width="767">
                            <ui:tableRowGroup id="tableRowGroup1" rows="10" sourceData="#{LNG$Calculator$LNGshipAgeingResults.cachedRowSetDataProvider1}" sourceVar="currentRow">
                                <ui:tableColumn headerText="TIME [hrs]" id="tableColumn1" sort="lngageingtable.TIME">
                                    <ui:staticText id="staticText1" text="#{currentRow.value['lngageingtable.TIME']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn headerText="WI [MJ/m^3]" id="tableColumn2" sort="lngageingtable.WI" width="101">
                                    <ui:staticText id="staticText2" text="#{currentRow.value['lngageingtable.WI']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn headerText="GCV [MJ/m^3]" id="tableColumn3" sort="lngageingtable.GCV" width="121">
                                    <ui:staticText id="staticText3" text="#{currentRow.value['lngageingtable.GCV']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn headerText="GCV [MJ/kg]" id="tableColumn8" sort="lngageingtable.GCVmass" width="96">
                                    <ui:staticText id="staticText12" text="#{currentRow.value['lngageingtable.GCVmass']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn headerText="DENSITY [kg/m^3]" id="tableColumn5" sort="lngageingtable.DENSITY">
                                    <ui:staticText id="staticText5" text="#{currentRow.value['lngageingtable.DENSITY']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn headerText="TEMPERATURE [C]" id="tableColumn4" sort="lngageingtable.TEMPERATURE">
                                    <ui:staticText id="staticText4" text="#{currentRow.value['lngageingtable.TEMPERATURE']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn headerText="VOLUME [m^3]" id="tableColumn6" sort="lngageingtable.VOLUME">
                                    <ui:staticText id="staticText6" text="#{currentRow.value['lngageingtable.VOLUME']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn headerText="ENERGY [MJ]" id="tableColumn7" sort="lngageingtable.ENERGY">
                                    <ui:staticText id="staticText11" text="#{currentRow.value['lngageingtable.ENERGY']}"/>
                                </ui:tableColumn>
                            </ui:tableRowGroup>
                        </ui:table>
                        <ui:hyperlink action="#{LNG$Calculator$LNGshipAgeingResults.hyperlink1_action}" id="hyperlink1"
                            style="height: 24px; left: 264px; top: 192px; position: absolute; width: 144px" text="View composition details"/>
                        <ui:staticText id="staticText8" style="height: 24px; left: 264px; top: 72px; position: absolute; width: 574px" text="Calculates LNG ageing during ship transport based on an accurate equation of state."/>
                        <ui:staticText id="staticText10" style="height: 24px; left: 264px; top: 120px; position: absolute; width: 574px" text="LNG density calculations are done based on the Klosek-Mc Kinley method (ISO6578)"/>
                        <ui:staticText id="staticText7" style="height: 24px; left: 264px; top: 96px; position: absolute; width: 622px" text="Energy calculations are  based on ISO6976."/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
