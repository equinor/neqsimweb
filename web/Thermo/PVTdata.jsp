<?xml version="1.0" encoding="windows-1252"?>
<!-- 
    Document   : PVTdata
    Created on : 27.feb.2013, 22:07:40
    Author     : ESOL
-->
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="windows-1252"/>
    <f:view>
        <ui:page id="page1">
            <ui:html id="html1">
                <ui:head id="head1">
                    <ui:link id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body id="body1" style="-rave-layout: grid">
                    <ui:form id="form1">
                        <h:graphicImage height="192" id="image1" style="left: 24px; top: 24px; position: absolute" value="/resources/neqsim_logo.jpg" width="192"/>
                        <ui:staticText id="staticText1" style="left: 264px; top: 24px; position: absolute" styleClass="title1" text="PVTdata"/>
                        <ui:table augmentTitle="false" id="table1" style="height: 48px; left: 264px; top: 360px; position: absolute; width: 0px"
                            title="Saturation Data" width="0">
                            <ui:tableRowGroup id="tableRowGroup1" rows="10" sourceData="#{Thermo$PVTdata.pvt_satptDataProvider1}" sourceVar="currentRow">
                                <ui:tableColumn headerText="ID" id="tableColumn1" sort="pvt_satpt.ID">
                                    <ui:staticText id="staticText2" text="#{currentRow.value['pvt_satpt.ID']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn headerText="Text" id="tableColumn4" sort="pvt_satpt.Text">
                                    <ui:staticText id="staticText5" text="#{currentRow.value['pvt_satpt.Text']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn headerText="Pressure" id="tableColumn2" sort="pvt_satpt.Pressure">
                                    <ui:staticText id="staticText3" text="#{currentRow.value['pvt_satpt.Pressure']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn headerText="Temperature" id="tableColumn3" sort="pvt_satpt.Temperature">
                                    <ui:staticText id="staticText4" text="#{currentRow.value['pvt_satpt.Temperature']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn headerText="Weight" id="tableColumn5" sort="pvt_satpt.Weight">
                                    <ui:staticText id="staticText6" text="#{currentRow.value['pvt_satpt.Weight']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn headerText="Delete" id="tableColumn6">
                                    <ui:button action="#{Thermo$PVTdata.deleteButton_action}" id="deleteButton" text="Delete"/>
                                </ui:tableColumn>
                            </ui:tableRowGroup>
                        </ui:table>
                        <ui:button action="#{Thermo$PVTdata.button1_action}" id="button1"
                            style="height: 24px; left: 263px; top: 312px; position: absolute; width: 72px" text="Add point"/>
                        <div style="height: 96px; left: 24px; top: 216px; position: absolute; width: 120px">
                            <jsp:directive.include file="ThermoMenu.jspf"/>
                        </div>
                        <ui:textField binding="#{Thermo$PVTdata.temperatureTextField}" id="temperatureTextField"
                            style="height: 24px; left: 432px; top: 264px; position: absolute; width: 144px" text="120"/>
                        <ui:staticText id="staticText7" style="height: 24px; left: 432px; top: 240px; position: absolute; width: 144px" text="Temperature [C]"/>
                        <ui:staticText id="staticText8" style="height: 24px; left: 600px; top: 240px; position: absolute; width: 144px" text="Pressure [bara]"/>
                        <ui:textField binding="#{Thermo$PVTdata.pressureTextField}" id="pressureTextField"
                            style="height: 24px; left: 600px; top: 264px; position: absolute; width: 144px" text="100"/>
                        <ui:staticText id="staticText9" style="height: 24px; left: 768px; top: 240px; position: absolute; width: 144px" text="Weight factor [-]"/>
                        <ui:textField binding="#{Thermo$PVTdata.weigthTextField}" id="weigthTextField"
                            style="height: 24px; left: 768px; top: 264px; position: absolute; width: 144px" text="1"/>
                        <ui:staticText id="staticText10" style="height: 24px; left: 264px; top: 240px; position: absolute; width: 144px" text="Description"/>
                        <ui:textField binding="#{Thermo$PVTdata.descriptionTextField}" id="descriptionTextField"
                            style="height: 24px; left: 264px; top: 264px; position: absolute; width: 144px" text="Saturatipn point"/>
                        <ui:staticText id="staticText11" style="height: 24px; left: 264px; top: 192px; position: absolute; width: 240px" text="Saturation data"/>
                        <ui:button action="#{Thermo$PVTdata.button2_action}" id="button2"
                            style="height: 24px; left: 263px; top: 120px; position: absolute; width: 120px" text="Run PVT tuning"/>
                        <ui:staticText id="staticText12" style="height: 24px; left: 408px; top: 120px; position: absolute; width: 96px" text="Status"/>
                        <ui:staticText binding="#{Thermo$PVTdata.statusTextField}" id="statusTextField"
                            style="height: 24px; left: 504px; top: 120px; position: absolute; width: 190px" text="not started"/>
                        <ui:staticText id="staticText13" style="height: 24px; left: 264px; top: 72px; position: absolute; width: 526px" text="Add PVTdata and run PVT tuning to optimize fluid parameters to experimental datata "/>
                        <ui:staticText id="staticText14" style="position: absolute; left: 408px; top: 144px; width: 96px; height: 24px" text="Molar mass"/>
                        <ui:textField binding="#{Thermo$PVTdata.molarMassTextFiled}" id="molarMassTextFiled"
                            style="height: 24px; left: 504px; top: 144px; position: absolute; width: 192px" text="250.0"/>
                        <ui:staticText id="staticText15" style="height: 24px; left: 696px; top: 144px; position: absolute; width: 96px" text="[gr/mol]"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
