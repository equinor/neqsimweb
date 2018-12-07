<?xml version="1.0" encoding="windows-1252"?>
<!-- 
    Document   : FluidOptions
    Created on : 09.jul.2009, 09:04:12
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
                        <h:graphicImage height="192" id="imageNeqSIm1" style="left: 24px; top: 24px; position: absolute" value="/resources/neqsim_logo.jpg" width="192"/>
                        <div style="height: 48px; left: 24px; top: 216px; position: absolute; width: 72px">
                            <jsp:directive.include file="ThermoMenu.jspf"/>
                        </div>
                        <h:outputText id="gergWaterMenuText1" style="font-size: 18px; height: 24px; left: 264px; top: 24px; position: absolute; width: 336px" value="Fluid Options"/>
                        <ui:staticText id="staticText1" style="height: 24px; left: 288px; top: 72px; position: absolute; width: 214px" text="Select thermodynamic  model:"/>
                        <ui:dropDown binding="#{Thermo$FluidOptions.thermoModelDropDown}" id="thermoModelDropDown"
                            items="#{Thermo$FluidOptions.thermoModelOptions.options}"
                            style="height: 24px; left: 288px; top: 96px; position: absolute; width: 216px" valueChangeListener="#{Thermo$FluidOptions.thermoModelDropDown_processValueChange}"/>
                        <ui:staticText id="staticText2" style="height: 24px; left: 288px; top: 144px; position: absolute; width: 214px" text="Select interfacial tension model:"/>
                        <ui:dropDown binding="#{Thermo$FluidOptions.interfaceDropDown}" id="interfaceDropDown"
                            items="#{Thermo$FluidOptions.interfaceOption.options}" style="height: 24px; left: 288px; top: 168px; position: absolute; width: 216px"/>
                        <ui:button action="#{Thermo$FluidOptions.button1_action}" id="button1"
                            style="height: 24px; left: 359px; top: 336px; position: absolute; width: 72px" text="OK"/>
                        <ui:listbox binding="#{Thermo$FluidOptions.capeOpenListBox}" id="capeOpenListBox"
                            items="#{Thermo$FluidOptions.capeOpenListBoxDefaultOptions.options}" multiple="true" style="height: 72px; left: 288px; top: 240px; position: absolute; width: 216px"/>
                        <ui:staticText id="staticText3" style="height: 24px; left: 288px; top: 216px; position: absolute; width: 214px" text="Select optional Cape Open properties"/>
                        <ui:staticText id="staticText4" style="height: 24px; left: 288px; top: 408px; position: absolute; width: 214px" text="Create new fluid from selected phase"/>
                        <ui:dropDown binding="#{Thermo$FluidOptions.phaseDropDown1}" converter="#{Process$calculator$ProcessOptions.phaseDropDownConverter}"
                            id="phaseDropDown1" items="#{Thermo$FluidOptions.phaseDropDownDefaultOptions1.options}"
                            selected="#{Thermo$FluidOptions.phaseDropDownDefaultOptions1.selectedValue}" style="height: 24px; left: 288px; top: 432px; position: absolute; width: 216px"/>
                        <ui:button action="#{Thermo$FluidOptions.button2_action}" id="button2"
                            style="height: 24px; left: 359px; top: 480px; position: absolute; width: 72px" text="Ok"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
