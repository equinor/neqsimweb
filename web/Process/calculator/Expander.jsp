<?xml version="1.0" encoding="windows-1252"?>
<!-- 
    Document   : Expander
    Created on : 07.jul.2009, 16:20:38
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
                        <h:graphicImage height="192" id="image1" style="left: 24px; top: 24px; position: absolute" value="/resources/neqsim_logo.jpg" width="192"/>
                        <div style="height: 48px; left: 24px; top: 216px; position: absolute; width: 48px">
                            <jsp:directive.include file="../ProcessLeftMenuPage.jspf"/>
                        </div>
                        <div style="height: 24px; left: 24px; top: 408px; position: absolute; width: 24px">
                            <jsp:directive.include file="GasProcessCalcRightMenu2.jspf"/>
                        </div>
                        <h:outputText id="outputText1" style="left: 240px; top: 24px; position: absolute" styleClass="title1" title="title1" value="Expander"/>
                        <ui:staticText id="staticText1" style="height: 24px; left: 240px; top: 96px; position: absolute; width: 214px" text="Temperature in"/>
                        <ui:staticText id="staticText2" style="height: 24px; left: 240px; top: 144px; position: absolute; width: 214px" text="Pressure in"/>
                        <ui:textField binding="#{Process$calculator$Expander.temperatureTextField}" converter="#{Process$calculator$Expander.doubleConverter1}"
                            id="temperatureTextField" style="height: 24px; left: 456px; top: 96px; position: absolute; width: 144px" text="20.0"/>
                        <ui:staticText id="staticText3" style="height: 24px; left: 624px; top: 96px; position: absolute; width: 96px" text="[C]"/>
                        <ui:textField binding="#{Process$calculator$Expander.pressureTextField}" converter="#{Process$calculator$Expander.doubleConverter1}"
                            id="pressureTextField" style="height: 24px; left: 456px; top: 144px; position: absolute; width: 144px" text="1.0"/>
                        <ui:staticText id="staticText4" style="height: 24px; left: 624px; top: 144px; position: absolute; width: 96px" text="[bar]"/>
                        <ui:button action="#{Process$calculator$Expander.calculateButton_action}" id="calculateButton1"
                            style="left: 455px; top: 312px; position: absolute; width: 96px" text="Calculate"/>
                        <h:dataTable binding="#{Process$calculator$Expander.resultsTable}" headerClass="list-header" id="resultsTable"
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
                        <ui:textField binding="#{Process$calculator$Expander.pressureOutTextField}" converter="#{Process$calculator$Expander.doubleConverter1}"
                            id="pressureOutTextField" style="height: 24px; left: 456px; top: 192px; position: absolute; width: 144px" text="2.0"/>
                        <ui:staticText id="staticText6" style="height: 24px; left: 240px; top: 240px; position: absolute; width: 214px" text="Efficientcy"/>
                        <ui:textField binding="#{Process$calculator$Expander.isentropicTextField}" converter="#{Process$calculator$Expander.doubleConverter1}"
                            id="isentropicTextField" style="height: 24px; left: 456px; top: 240px; position: absolute; width: 144px" text="0.9"/>
                        <ui:staticText id="staticText7" style="height: 24px; left: 624px; top: 192px; position: absolute; width: 96px" text="[bar]"/>
                        <ui:staticText id="staticText8" style="height: 24px; left: 624px; top: 240px; position: absolute; width: 96px" text="[-]"/>
                        <ui:hyperlink action="#{Process$calculator$Expander.hyperlink1_action}" id="hyperlink1"
                            style="height: 24px; left: 456px; top: 264px; position: absolute; width: 190px" text="Estimate efficiency (show/hide)"/>
                        <ui:staticText id="staticText9" style="height: 24px; left: 240px; top: 360px; position: absolute; width: 214px" text="Expander output"/>
                        <ui:staticText id="staticText10" style="height: 24px; left: 624px; top: 360px; position: absolute; width: 96px" text="[W]"/>
                        <ui:staticText binding="#{Process$calculator$Expander.workTextField}" converter="#{Process$calculator$Compressor.doubleConverter1}"
                            id="workTextField" style="height: 24px; left: 456px; top: 360px; position: absolute; width: 168px" text="-"/>
                        <ui:panelLayout binding="#{Process$calculator$Expander.temperatureOutPanel}" id="temperatureOutPanel" panelLayout="flow"
                            rendered="false" style="height: 94px; left: 768px; top: 264px; position: absolute; width: 262px">
                            <h:panelGrid id="gridPanel1" style="height: 47px" width="287">
                                <ui:staticText id="staticText11" text="Temperature out [C]"/>
                                <ui:textField binding="#{Process$calculator$Expander.temperatureOutTextField}"
                                    converter="#{Process$calculator$Compressor.doubleConverter1}" id="temperatureOutTextField" text="100.0"/>
                            </h:panelGrid>
                            <ui:button action="#{Process$calculator$Expander.estimateEfficiencyButton_action}" id="estimateEfficiencyButton" text="Estimate"/>
                        </ui:panelLayout>
                        <ui:dropDown binding="#{Process$calculator$Expander.efficiencyTypeDropDown}" id="efficiencyTypeDropDown"
                            items="#{Process$calculator$Expander.efficiencyTypeDropDownDefaultOptions.options}" style="height: 24px; left: 240px; top: 264px; position: absolute; width: 216px"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
