<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{Thermo$ThermoDAB$MeasurementSelect2.page1}" id="page1">
            <ui:html binding="#{Thermo$ThermoDAB$MeasurementSelect2.html1}" id="html1">
                <ui:head binding="#{Thermo$ThermoDAB$MeasurementSelect2.head1}" id="head1">
                    <ui:link binding="#{Thermo$ThermoDAB$MeasurementSelect2.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{Thermo$ThermoDAB$MeasurementSelect2.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{Thermo$ThermoDAB$MeasurementSelect2.form1}" id="form1">
                        <h:graphicImage binding="#{Thermo$ThermoDAB$MeasurementSelect2.image1}" height="192" id="image1"
                            style="left: 24px; top: 24px; position: absolute" value="/resources/neqsim_logo.jpg" width="196"/>
                        <h:outputText binding="#{Thermo$ThermoDAB$MeasurementSelect2.outputText2}" id="outputText2"
                            style="height: 96px; left: 264px; top: 72px; position: absolute; width: 414px; z-index: 500" styleClass="body-text" value="Welcome to the Statoil thermodynamic and physical property database. The database is a tool for cooperation and information sharing in Statoil. It should be updated by people resbonisble for collection and measurement of data relevant for Statoil."/>
                        <h:outputText binding="#{Thermo$ThermoDAB$MeasurementSelect2.typeText1}" id="typeText1"
                            style="height: 24px; left: 264px; top: 720px; position: absolute; width: 120px" styleClass="body-text" value="Select Data Type"/>
                        <h:outputText binding="#{Thermo$ThermoDAB$MeasurementSelect2.loacitionText1}" escape="false" id="loacitionText1"
                            style="height: 24px; left: 264px; top: 264px; position: absolute; width: 142px" value="Select Components or"/>
                        <h:outputText binding="#{Thermo$ThermoDAB$MeasurementSelect2.topMenuText1}" id="topMenuText1"
                            style="font-size: 24px; height: 48px; left: 264px; top: 24px; position: absolute; width: 624px" styleClass="title1" title="title1" value="Statoil Phase Equilibrium and Physical Property Database"/>
                        <h:outputText binding="#{Thermo$ThermoDAB$MeasurementSelect2.outputText3}" id="outputText3"
                            style="height: 70px; left: 264px; top: 168px; position: absolute; width: 414px; z-index: 500" styleClass="body-text" value="Select component names and data type you want to search for. The data can be modified by clicking the edit button in the generated table."/>
                        <ui:button action="#{Thermo$ThermoDAB$MeasurementSelect2.button1_action}" binding="#{Thermo$ThermoDAB$MeasurementSelect2.button1}"
                            id="button1" style="height: 24px; left: 263px; top: 864px; position: absolute; width: 120px" text="Search"/>
                        <ui:dropDown binding="#{Thermo$ThermoDAB$MeasurementSelect2.dataTypeList}" id="dataTypeList"
                            items="#{Thermo$ThermoDAB$MeasurementSelect2.datatTypeDataProvider.options['experimentaldatatype.TYPE,experimentaldatatype.TYPE']}" style="height: 24px; left: 264px; top: 744px; position: absolute; width: 192px"/>
                        <ui:addRemove availableItemsLabel="Available:" binding="#{Thermo$ThermoDAB$MeasurementSelect2.componentsAddRemoveList}"
                            id="componentsAddRemoveList"
                            items="#{Thermo$ThermoDAB$MeasurementSelect2.webcomponentsDataProvider.options['webcomponents.TABLEROWNAME,webcomponents.NAME']}"
                            selectAll="true" selected="#{SessionBean1.expTypeChoices}" selectedItemsLabel="Selected:" style="left: 264px; top: 288px; position: absolute; width: 406px"/>
                        <ui:checkbox binding="#{Thermo$ThermoDAB$MeasurementSelect2.allComponentsCheckbox}" id="allComponentsCheckbox"
                            label="Only inculde data where all components are present" selectedValue="t" style="height: 24px; left: 264px; top: 552px; position: absolute; width: 408px"/>
                        <div style="position: absolute; left: 24px; top: 216px; width: 192px; height: 144px">
                            <jsp:directive.include file="DatabaseMenu.jspf"/>
                        </div>
                        <ui:staticText binding="#{Thermo$ThermoDAB$MeasurementSelect2.staticText1}" id="staticText1"
                            style="height: 22px; left: 600px; top: 672px; position: absolute; width: 22px" styleClass="body-text" text="[bara]"/>
                        <ui:staticText binding="#{Thermo$ThermoDAB$MeasurementSelect2.staticText2}" id="staticText2"
                            style="height: 24px; left: 264px; top: 600px; position: absolute; width: 264px" styleClass="body-text" text="Temperature range"/>
                        <ui:staticText binding="#{Thermo$ThermoDAB$MeasurementSelect2.staticText3}" id="staticText3"
                            style="height: 24px; left: 264px; top: 648px; position: absolute; width: 264px" styleClass="body-text" text="Pressure range"/>
                        <ui:staticText binding="#{Thermo$ThermoDAB$MeasurementSelect2.staticText4}" id="staticText4"
                            style="height: 22px; left: 408px; top: 672px; position: absolute; width: 22px" styleClass="body-text" text="to"/>
                        <ui:staticText binding="#{Thermo$ThermoDAB$MeasurementSelect2.staticText5}" id="staticText5"
                            style="height: 22px; left: 408px; top: 624px; position: absolute; width: 22px" styleClass="body-text" text="to"/>
                        <ui:staticText binding="#{Thermo$ThermoDAB$MeasurementSelect2.staticText6}" id="staticText6"
                            style="height: 22px; left: 600px; top: 624px; position: absolute; width: 22px" styleClass="body-text" text="[degC]"/>
                        <ui:textField binding="#{Thermo$ThermoDAB$MeasurementSelect2.maxTempTextField}"
                            converter="#{Thermo$ThermoDAB$MeasurementSelect2.doubleConverter1}" id="maxTempTextField" required="true"
                            style="left: 456px; top: 624px; position: absolute" styleClass="textbox-normal" text="1000" validator="#{Thermo$ThermoDAB$MeasurementSelect2.doubleRangeValidator1.validate}"/>
                        <ui:textField binding="#{Thermo$ThermoDAB$MeasurementSelect2.maxPresTextField}"
                            converter="#{Thermo$ThermoDAB$MeasurementSelect2.doubleConverter1}" id="maxPresTextField" required="true"
                            style="left: 456px; top: 672px; position: absolute" styleClass="textbox-normal" text="1000" validator="#{Thermo$ThermoDAB$MeasurementSelect2.doubleRangeValidator1.validate}"/>
                        <ui:textField binding="#{Thermo$ThermoDAB$MeasurementSelect2.minPresTextField}"
                            converter="#{Thermo$ThermoDAB$MeasurementSelect2.doubleConverter1}" id="minPresTextField" required="true"
                            style="left: 264px; top: 672px; position: absolute" styleClass="textbox-normal" text="0" validator="#{Thermo$ThermoDAB$MeasurementSelect2.doubleRangeValidator1.validate}"/>
                        <ui:textField binding="#{Thermo$ThermoDAB$MeasurementSelect2.minTempTextField}"
                            converter="#{Thermo$ThermoDAB$MeasurementSelect2.doubleConverter1}" id="minTempTextField" required="true"
                            style="left: 264px; top: 624px; position: absolute" styleClass="textbox-normal" text="0" validator="#{Thermo$ThermoDAB$MeasurementSelect2.doubleRangeValidator1.validate}"/>
                        <ui:messageGroup binding="#{Thermo$ThermoDAB$MeasurementSelect2.messageGroup1}" id="messageGroup1" style="height: 288px; left: 696px; top: 288px; position: absolute; width: 240px"/>
                        <ui:hyperlink action="#{Thermo$ThermoDAB$MeasurementSelect2.useActivFLuidCompLink_action}"
                            binding="#{Thermo$ThermoDAB$MeasurementSelect2.useActivFLuidCompLink}" id="useActivFLuidCompLink"
                            style="position: absolute; left: 432px; top: 264px; width: 240px; height: 24px" text="use active fluid composition"/>
                        <ui:textField binding="#{Thermo$ThermoDAB$MeasurementSelect2.freeTextField}" id="freeTextField" style="height: 24px; left: 264px; top: 816px; position: absolute; width: 384px"/>
                        <h:outputText id="typeText2" style="height: 24px; left: 264px; top: 792px; position: absolute; width: 430px" styleClass="body-text" value="Restrict search to data containing text phrase "/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
