<?xml version="1.0" encoding="windows-1252"?>
<!-- 
    Document   : EditExperimentalData
    Created on : 30.des.2007, 21:32:50
    Author     : ESOL
-->
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=windows-1252" pageEncoding="windows-1252"/>
    <f:view>
        <ui:page binding="#{Thermo$ThermoDAB$EditExperimentalData.page1}" id="page1">
            <ui:html binding="#{Thermo$ThermoDAB$EditExperimentalData.html1}" id="html1">
                <ui:head binding="#{Thermo$ThermoDAB$EditExperimentalData.head1}" id="head1">
                    <ui:link binding="#{Thermo$ThermoDAB$EditExperimentalData.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{Thermo$ThermoDAB$EditExperimentalData.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{Thermo$ThermoDAB$EditExperimentalData.form1}" id="form1" virtualFormsConfig="">
                        <h:graphicImage binding="#{Thermo$ThermoDAB$EditExperimentalData.image1}" height="192" id="image1"
                            style="left: 24px; top: 24px; position: absolute" value="/resources/neqsim_logo.jpg" width="192"/>
                        <div style="position: absolute; left: 24px; top: 216px; width: 48px; height: 48px">
                            <jsp:directive.include file="../ThermoMenu.jspf"/>
                        </div>
                        <ui:staticText binding="#{Thermo$ThermoDAB$EditExperimentalData.staticText1}" id="staticText1"
                            style="left: 264px; top: 24px; position: absolute" styleClass="title1" text="Edit Experimental Data"/>
                        <ui:staticText binding="#{Thermo$ThermoDAB$EditExperimentalData.staticText2}" id="staticText2"
                            style="height: 24px; left: 264px; top: 192px; position: absolute; width: 336px" styleClass="body-text" text="Document name, key words and general information"/>
                        <ui:textField binding="#{Thermo$ThermoDAB$EditExperimentalData.maxTempTextField1}"
                            converter="#{Thermo$ThermoDAB$EditExperimentalData.doubleConverter1}" id="maxTempTextField1"
                            style="left: 456px; top: 336px; position: absolute; width: 120px" styleClass="textbox-normal" text="#{Thermo$ThermoDAB$EditExperimentalData.litDataProvider.value['litterature.MAXTEMPERATURE']}"/>
                        <ui:staticText binding="#{Thermo$ThermoDAB$EditExperimentalData.staticText3}" id="staticText3"
                            style="height: 22px; left: 408px; top: 384px; position: absolute; width: 22px" styleClass="body-text" text="to"/>
                        <ui:textField binding="#{Thermo$ThermoDAB$EditExperimentalData.minPresTextField1}"
                            converter="#{Thermo$ThermoDAB$EditExperimentalData.doubleConverter1}" id="minPresTextField1"
                            style="left: 264px; top: 384px; position: absolute; width: 120px" styleClass="textbox-normal" text="#{Thermo$ThermoDAB$EditExperimentalData.litDataProvider.value['litterature.MINPRESSURE']}"/>
                        <ui:staticText binding="#{Thermo$ThermoDAB$EditExperimentalData.staticText4}" id="staticText4"
                            style="height: 22px; left: 600px; top: 336px; position: absolute; width: 22px" styleClass="body-text" text="[degC]"/>
                        <ui:staticText binding="#{Thermo$ThermoDAB$EditExperimentalData.staticText5}" id="staticText5"
                            style="height: 24px; left: 264px; top: 312px; position: absolute; width: 264px" styleClass="body-text" text="Temperature range"/>
                        <ui:staticText binding="#{Thermo$ThermoDAB$EditExperimentalData.staticText6}" id="staticText6"
                            style="height: 24px; left: 264px; top: 360px; position: absolute; width: 264px" styleClass="body-text" text="Pressure range"/>
                        <ui:button action="#{Thermo$ThermoDAB$EditExperimentalData.button1_action}" binding="#{Thermo$ThermoDAB$EditExperimentalData.button1}"
                            id="button1" style="height: 24px; left: 263px; top: 432px; position: absolute; width: 96px" text="Update"/>
                        <ui:staticText binding="#{Thermo$ThermoDAB$EditExperimentalData.staticText7}" id="staticText7"
                            style="height: 22px; left: 600px; top: 384px; position: absolute; width: 22px" styleClass="body-text" text="[bara]"/>
                        <ui:textField binding="#{Thermo$ThermoDAB$EditExperimentalData.minTempTextField1}"
                            converter="#{Thermo$ThermoDAB$EditExperimentalData.doubleConverter1}" id="minTempTextField1"
                            style="left: 264px; top: 336px; position: absolute; width: 120px" styleClass="textbox-normal" text="#{Thermo$ThermoDAB$EditExperimentalData.litDataProvider.value['litterature.MINTEMPERATURE']}"/>
                        <ui:panelLayout binding="#{Thermo$ThermoDAB$EditExperimentalData.detailsGridPanel}" id="detailsGridPanel" rendered="false"
                            style="height: 310px; left: 696px; top: 96px; position: absolute; width: 576px; -rave-layout: grid" styleClass="body-text">
                            <ui:staticText binding="#{Thermo$ThermoDAB$EditExperimentalData.staticText8}" id="staticText8" styleClass="body-text" text="Authors"/>
                            <ui:textField binding="#{Thermo$ThermoDAB$EditExperimentalData.authorTextField1}" columns="50" id="authorTextField1"
                                style="left: 1px; top: 25px; position: absolute; width: 456px" styleClass="textbox-normal" text="#{Thermo$ThermoDAB$EditExperimentalData.articleDataProvider.value['literatureandarticlestable.AUTHOR']}"/>
                            <ui:staticText binding="#{Thermo$ThermoDAB$EditExperimentalData.staticText9}" id="staticText9"
                                style="position: absolute; left: 0px; top: 48px; width: 384px; height: 24px" styleClass="body-text" text="Title"/>
                            <ui:textField binding="#{Thermo$ThermoDAB$EditExperimentalData.articleTitleTextField1}" id="articleTitleTextField1"
                                style="left: 0px; top: 72px; position: absolute; width: 456px" styleClass="textbox-normal" text="#{Thermo$ThermoDAB$EditExperimentalData.articleDataProvider.value['literatureandarticlestable.NAME']}"/>
                            <ui:staticText binding="#{Thermo$ThermoDAB$EditExperimentalData.staticText10}" id="staticText10"
                                style="position: absolute; left: 0px; top: 96px; width: 96px; height: 24px" styleClass="body-text" text="Journal Name"/>
                            <ui:textField binding="#{Thermo$ThermoDAB$EditExperimentalData.journalNameTextField1}" id="journalNameTextField1"
                                style="left: 0px; top: 120px; position: absolute; width: 456px" styleClass="textbox-normal" text="#{Thermo$ThermoDAB$EditExperimentalData.articleDataProvider.value['literatureandarticlestable.JOURNAL']}"/>
                            <ui:staticText binding="#{Thermo$ThermoDAB$EditExperimentalData.staticText11}" id="staticText11"
                                style="height: 24px; left: 0px; top: 144px; position: absolute; width: 216px" styleClass="body-text" text="Volume"/>
                            <ui:textField binding="#{Thermo$ThermoDAB$EditExperimentalData.volumeTextField1}" columns="10" id="volumeTextField1"
                                style="left: 0px; top: 168px; position: absolute; width: 216px" styleClass="textbox-normal" text="#{Thermo$ThermoDAB$EditExperimentalData.articleDataProvider.value['literatureandarticlestable.VOLUME']}"/>
                            <ui:staticText binding="#{Thermo$ThermoDAB$EditExperimentalData.staticText12}" id="staticText12"
                                style="position: absolute; left: 0px; top: 192px; width: 216px; height: 24px" styleClass="body-text" text="Pages"/>
                            <ui:textField binding="#{Thermo$ThermoDAB$EditExperimentalData.pageTextField1}" id="pageTextField1"
                                style="left: 0px; top: 216px; position: absolute; width: 216px" styleClass="textbox-normal" text="#{Thermo$ThermoDAB$EditExperimentalData.articleDataProvider.value['literatureandarticlestable.PAGES']}"/>
                            <ui:staticText binding="#{Thermo$ThermoDAB$EditExperimentalData.staticText13}" id="staticText13"
                                style="position: absolute; left: 0px; top: 240px; width: 216px; height: 24px" styleClass="body-text" text="Year"/>
                            <ui:textField binding="#{Thermo$ThermoDAB$EditExperimentalData.yearTextField1}" id="yearTextField1"
                                style="left: 0px; top: 264px; position: absolute; width: 216px" styleClass="textbox-normal" text="#{Thermo$ThermoDAB$EditExperimentalData.articleDataProvider.value['literatureandarticlestable.YEAR']}"/>
                        </ui:panelLayout>
                        <ui:textField binding="#{Thermo$ThermoDAB$EditExperimentalData.maxPresTextField1}"
                            converter="#{Thermo$ThermoDAB$EditExperimentalData.doubleConverter1}" id="maxPresTextField1"
                            style="left: 456px; top: 384px; position: absolute; width: 120px" styleClass="textbox-normal" text="#{Thermo$ThermoDAB$EditExperimentalData.litDataProvider.value['litterature.MAXPRESSURE']}"/>
                        <ui:staticText binding="#{Thermo$ThermoDAB$EditExperimentalData.staticText14}" id="staticText14"
                            style="height: 24px; left: 264px; top: 96px; position: absolute; width: 336px" styleClass="body-text" text="Set new file (old file is kept if this field is left blank)"/>
                        <ui:staticText binding="#{Thermo$ThermoDAB$EditExperimentalData.staticText15}" id="staticText15"
                            style="height: 22px; left: 408px; top: 336px; position: absolute; width: 22px" styleClass="body-text" text="to"/>
                        <ui:staticText binding="#{Thermo$ThermoDAB$EditExperimentalData.staticText16}" id="staticText16"
                            style="height: 24px; left: 264px; top: 144px; position: absolute; width: 336px" styleClass="body-text" text="Select experimental data type"/>
                        <ui:textArea binding="#{Thermo$ThermoDAB$EditExperimentalData.textArea1}" id="textArea1"
                            style="height: 72px; left: 264px; top: 216px; position: absolute; width: 312px" text="#{Thermo$ThermoDAB$EditExperimentalData.litDataProvider.value['litterature.TEXT']}"/>
                        <ui:staticText binding="#{Thermo$ThermoDAB$EditExperimentalData.statusText}" id="statusText" style="height: 24px; left: 264px; top: 480px; position: absolute; width: 240px"/>
                        <ui:imageHyperlink action="#{Thermo$ThermoDAB$EditExperimentalData.imageHyperlink1_action}"
                            binding="#{Thermo$ThermoDAB$EditExperimentalData.imageHyperlink1}" height="24" id="imageHyperlink1"
                            style="left: 456px; top: 432px; position: absolute" text="view reference details" width="234"/>
                        <ui:upload binding="#{Thermo$ThermoDAB$EditExperimentalData.fileUpload}" id="fileUpload" style="position: absolute; left: 264px; top: 120px; width: 312px; height: 24px"/>
                        <ui:dropDown binding="#{Thermo$ThermoDAB$EditExperimentalData.expTypeDropDown}"
                            converter="#{Thermo$ThermoDAB$EditExperimentalData.longConverter2}" id="expTypeDropDown"
                            items="#{Thermo$ThermoDAB$EditExperimentalData.expTypeRowSetDataProvider1.options['experimentaldatatype.ID,experimentaldatatype.TYPE']}" style="position: absolute; left: 264px; top: 168px; width: 312px; height: 24px"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
