<?xml version="1.0" encoding="windows-1252"?>
<!-- 
    Document   : Compressor
    Created on : 01.jul.2009, 12:45:41
    Author     : esol
-->
<jsp:root version="1.2" xmlns:bp="http://java.sun.com/blueprints/ui/14" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html"
    xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=windows-1252" pageEncoding="windows-1252"/>
    <f:view>
        <ui:page id="page1">
            <ui:html id="html1">
                <ui:head id="head1">
                    <ui:link id="link1" url="/resources/stylesheet.css"/>
                    <ui:script id="script1"/>
                </ui:head>
                <ui:body id="body1" style="-rave-layout: grid">
                    <ui:form id="form1">
                        <h:graphicImage height="192" id="image1" style="left: 24px; top: 24px; position: absolute" value="/resources/neqsim_logo.jpg" width="192"/>
                        <div style="height: 48px; left: 24px; top: 216px; position: absolute; width: 48px">
                            <jsp:directive.include file="../ProcessLeftMenuPage.jspf"/>
                        </div>
                        <div style="height: 24px; left: 24px; top: 408px; position: absolute; width: 24px">
                            <jsp:directive.include file="GasProcessCalcRightMenu2.jspf"/>
                        </div>
                        <h:outputText id="outputText1" style="left: 240px; top: 24px; position: absolute" styleClass="title1" title="title1" value="Compressor"/>
                        <ui:staticText id="staticText1" style="height: 24px; left: 240px; top: 96px; position: absolute; width: 214px" text="Temperature in"/>
                        <ui:staticText id="staticText2" style="height: 24px; left: 240px; top: 144px; position: absolute; width: 214px" text="Pressure in"/>
                        <ui:textField binding="#{Process$calculator$Compressor.temperatureTextField}"
                            converter="#{Process$calculator$Compressor.doubleConverter1}" id="temperatureTextField"
                            style="height: 22px; left: 456px; top: 96px; position: absolute; width: 168px" text="20.0"/>
                        <ui:staticText id="staticText3" style="height: 24px; left: 648px; top: 96px; position: absolute; width: 96px" text="[C]"/>
                        <ui:textField binding="#{Process$calculator$Compressor.pressureTextField}" converter="#{Process$calculator$Compressor.doubleConverter1}"
                            id="pressureTextField" style="height: 22px; left: 456px; top: 144px; position: absolute; width: 168px" text="1.0"/>
                        <ui:staticText id="staticText4" style="height: 24px; left: 648px; top: 144px; position: absolute; width: 96px" text="[bar]"/>
                        <ui:button action="#{Process$calculator$Compressor.calculateButton_action}" binding="#{Process$calculator$Compressor.calculateButton1}"
                            id="calculateButton1" onClick="document.styleSheets[0].rules[0].style.cursor = 'wait';&#xd;&#xa;"
                            style="left: 455px; top: 288px; position: absolute; width: 96px" text="Calculate"/>
                        <h:dataTable binding="#{Process$calculator$Compressor.resultsTable}" headerClass="list-header" id="resultsTable" rendered="false"
                            rowClasses="list-row-even,list-row-odd" style="height: 27px; left: 240px; top: 408px; position: absolute"
                            value="#{Thermo$ThermoSessionBean.resultTable}" var="currentRow" width="696">
                            <h:column id="column1">
                                <h:outputText id="outputText2" value="#{currentRow[0]}"/>
                                <f:facet name="header">
                                    <h:outputText id="outputText3" value="Property"/>
                                </f:facet>
                            </h:column>
                            <h:column id="column2">
                                <h:outputText id="outputText4" value="#{currentRow[1]}"/>
                                <f:facet name="header">
                                    <h:outputText id="outputText5" value="Phase 1"/>
                                </f:facet>
                            </h:column>
                            <h:column id="column3">
                                <h:outputText id="outputText6" value="#{currentRow[2]}"/>
                                <f:facet name="header">
                                    <h:outputText id="outputText7" value="Phase 2"/>
                                </f:facet>
                            </h:column>
                            <h:column id="column4">
                                <h:outputText id="outputText8" value="#{currentRow[3]}"/>
                                <f:facet name="header">
                                    <h:outputText id="outputText9" value="Phase 3"/>
                                </f:facet>
                            </h:column>
                            <h:column id="column5">
                                <h:outputText id="outputText10" value="#{currentRow[4]}"/>
                                <f:facet name="header">
                                    <h:outputText id="outputText11" value="Unit"/>
                                </f:facet>
                            </h:column>
                        </h:dataTable>
                        <ui:staticText id="staticText5" style="height: 24px; left: 240px; top: 192px; position: absolute; width: 214px" text="Pressure out"/>
                        <ui:textField binding="#{Process$calculator$Compressor.pressureOutTextField}"
                            converter="#{Process$calculator$Compressor.doubleConverter1}" id="pressureOutTextField"
                            style="height: 22px; left: 456px; top: 192px; position: absolute; width: 168px" text="2.0" valueChangeListener="#{Process$calculator$Compressor.pressureOutTextField_processValueChange}"/>
                        <ui:textField binding="#{Process$calculator$Compressor.isentropicTextField}"
                            converter="#{Process$calculator$Compressor.doubleConverter1}" id="isentropicTextField"
                            style="height: 22px; left: 648px; top: 240px; position: absolute; width: 96px" text="1.0"/>
                        <ui:staticText id="staticText7" style="height: 24px; left: 648px; top: 192px; position: absolute; width: 96px" text="[bar]"/>
                        <ui:dropDown binding="#{Process$calculator$Compressor.efficiencyTypeDropDown}" id="efficiencyTypeDropDown"
                            items="#{Process$calculator$Compressor.efficiencyTypeDropDownDefaultOptions.options}" style="height: 22px; left: 456px; top: 240px; position: absolute; width: 168px"/>
                        <ui:hyperlink action="#{Process$calculator$Compressor.hyperlink1_action}" id="hyperlink1"
                            style="font-size: 12px; height: 24px; left: 648px; top: 264px; position: absolute; width: 190px" text="Estimate efficiency (show/hide)"/>
                        <ui:staticText id="staticText10" style="height: 24px; left: 240px; top: 336px; position: absolute; width: 214px" text="Compressor work"/>
                        <ui:staticText id="staticText11" style="height: 24px; left: 576px; top: 336px; position: absolute; width: 46px" text="[W]"/>
                        <ui:staticText binding="#{Process$calculator$Compressor.workTextField}" converter="#{Process$calculator$Compressor.doubleConverter1}"
                            id="workTextField" style="height: 24px; left: 456px; top: 336px; position: absolute; width: 118px" text="-"/>
                        <ui:staticText id="staticText12" style="height: 24px; left: 240px; top: 240px; position: absolute; width: 214px" text="Calculation type / efficiency"/>
                        <ui:panelLayout binding="#{Process$calculator$Compressor.temperatureOutPanel}" id="temperatureOutPanel" panelLayout="flow"
                            rendered="false" style="height: 94px; left: 648px; top: 288px; position: absolute; width: 190px; -rave-layout: grid">
                            <ui:button action="#{Process$calculator$Compressor.estimateEfficiencyButton_action}" id="estimateEfficiencyButton"
                                style="left: -1px; top: 72px; position: absolute" text="Estimate"/>
                            <h:panelGrid id="gridPanel1" style="height: 71px; left: 0px; top: 0px; position: absolute" width="143">
                                <ui:staticText id="staticText9" text="Temperature out [C]"/>
                                <ui:textField binding="#{Process$calculator$Compressor.temperatureOutTextField}"
                                    converter="#{Process$calculator$Compressor.doubleConverter1}" id="temperatureOutTextField" style="width: 120px" text="100.0" valueChangeListener="#{Process$calculator$Compressor.temperatureOutTextField_processValueChange}"/>
                            </h:panelGrid>
                        </ui:panelLayout>
                        <h:panelGrid binding="#{Process$calculator$Compressor.calculatingGridPanel}" id="calculatingGridPanel" rendered="false"
                            style="position: absolute; left: 456px; top: 312px; height: 24px" width="168">
                            <ui:staticText id="staticText6" style="color: red; font-weight: bold" text="calculating......."/>
                        </h:panelGrid>
                        <br/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
