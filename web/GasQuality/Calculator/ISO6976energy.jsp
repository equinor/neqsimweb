<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{GasQuality$Calculator$ISO6976energy.page1}" id="page1">
            <ui:html binding="#{GasQuality$Calculator$ISO6976energy.html1}" id="html1">
                <ui:head binding="#{GasQuality$Calculator$ISO6976energy.head1}" id="head1">
                    <ui:link binding="#{GasQuality$Calculator$ISO6976energy.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{GasQuality$Calculator$ISO6976energy.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{GasQuality$Calculator$ISO6976energy.form1}" id="form1" virtualFormsConfig="">
                        <h:graphicImage binding="#{GasQuality$Calculator$ISO6976energy.image1}" height="192" id="image1"
                            style="left: 24px; top: 24px; position: absolute" value="/resources/neqsim_logo.jpg" width="192"/>
                        <h:outputText binding="#{GasQuality$Calculator$ISO6976energy.outputText1}" id="outputText1"
                            style="font-size: 20; height: 26px; left: 264px; top: 24px; position: absolute; width: 480px" styleClass="title1" value="ISO6976 - energy, density"/>
                        <div style="height: 48px; left: 24px; top: 384px; position: absolute; width: 120px">
                            <jsp:directive.include file="GasQualityCalcRightMenu2.jspf"/>
                        </div>
                        <ui:button action="#{GasQuality$Calculator$ISO6976energy.button1_action}" binding="#{GasQuality$Calculator$ISO6976energy.button1}"
                            id="button1" style="height: 24px; left: 263px; top: 360px; position: absolute; width: 72px" text="Calculate"/>
                        <h:dataTable binding="#{GasQuality$Calculator$ISO6976energy.dataTable1}" headerClass="list-header" id="dataTable1"
                            rowClasses="list-row-even,list-row-odd" style="height: 27px; left: 264px; top: 456px; position: absolute"
                            value="#{Thermo$ThermoSessionBean.ISOstandard.resultTable}" var="currentRow" width="696">
                            <h:column binding="#{GasQuality$Calculator$ISO6976energy.column1}" id="column1">
                                <h:outputText binding="#{GasQuality$Calculator$ISO6976energy.outputText2}" id="outputText2" value="#{currentRow[0]}"/>
                                <f:facet name="header">
                                    <h:outputText binding="#{GasQuality$Calculator$ISO6976energy.outputText3}" id="outputText3" value="Property"/>
                                </f:facet>
                            </h:column>
                            <h:column binding="#{GasQuality$Calculator$ISO6976energy.column2}" id="column2">
                                <h:outputText binding="#{GasQuality$Calculator$ISO6976energy.outputText4}" id="outputText4" value="#{currentRow[1]}"/>
                                <f:facet name="header">
                                    <h:outputText binding="#{GasQuality$Calculator$ISO6976energy.outputText5}" id="outputText5" value="Phase 1"/>
                                </f:facet>
                            </h:column>
                            <h:column binding="#{GasQuality$Calculator$ISO6976energy.column3}" id="column3">
                                <h:outputText binding="#{GasQuality$Calculator$ISO6976energy.outputText6}" id="outputText6" value="#{currentRow[2]}"/>
                                <f:facet name="header">
                                    <h:outputText binding="#{GasQuality$Calculator$ISO6976energy.outputText7}" id="outputText7" value="Phase 2"/>
                                </f:facet>
                            </h:column>
                            <h:column binding="#{GasQuality$Calculator$ISO6976energy.column4}" id="column4">
                                <h:outputText binding="#{GasQuality$Calculator$ISO6976energy.outputText8}" id="outputText8" value="#{currentRow[3]}"/>
                                <f:facet name="header">
                                    <h:outputText binding="#{GasQuality$Calculator$ISO6976energy.outputText9}" id="outputText9" value="Phase 3"/>
                                </f:facet>
                            </h:column>
                            <h:column binding="#{GasQuality$Calculator$ISO6976energy.column5}" id="column5">
                                <h:outputText binding="#{GasQuality$Calculator$ISO6976energy.outputText10}" id="outputText10" value="#{currentRow[4]}"/>
                                <f:facet name="header">
                                    <h:outputText binding="#{GasQuality$Calculator$ISO6976energy.outputText11}" id="outputText11" value="Unit"/>
                                </f:facet>
                            </h:column>
                        </h:dataTable>
                        <ui:imageHyperlink action="#{GasQuality$Calculator$ISO6976energy.imageHyperlink1_action}"
                            binding="#{GasQuality$Calculator$ISO6976energy.imageHyperlink1}" height="24" id="imageHyperlink1"
                            style="left: 360px; top: 360px; position: absolute" text="View ISO-standard" width="216"/>
                        <div style="height: 24px; left: 24px; top: 216px; position: absolute; width: 72px">
                            <jsp:directive.include file="../GasQualityMenu.jspf"/>
                        </div>
                        <ui:staticText binding="#{GasQuality$Calculator$ISO6976energy.staticText1}" id="staticText1"
                            style="height: 24px; left: 264px; top: 192px; position: absolute; width: 238px" text="Reference temperature of combustion[C]"/>
                        <ui:staticText binding="#{GasQuality$Calculator$ISO6976energy.staticText2}" id="staticText2"
                            style="height: 24px; left: 264px; top: 72px; position: absolute; width: 262px" text="Reference temperature of measurement [C]"/>
                        <ui:staticText binding="#{GasQuality$Calculator$ISO6976energy.staticText3}" id="staticText3"
                            style="height: 24px; left: 648px; top: 72px; position: absolute; width: 70px" text="Output unit"/>
                        <ui:radioButtonGroup binding="#{GasQuality$Calculator$ISO6976energy.refMeasTempCheckBoxGroup}"
                            converter="#{GasQuality$Calculator$ISO6976energy.doubleConverter1}" id="refMeasTempCheckBoxGroup"
                            items="#{GasQuality$Calculator$ISO6976energy.refMeasTempCheckBoxGroupDefaultOptions.options}" required="true"
                            selected="#{GasQuality$Calculator$ISO6976energy.refMeasTempCheckBoxGroupDefaultOptions.selectedValue}" style="height: 96px; left: 528px; top: 72px; position: absolute; width: 96px"/>
                        <ui:radioButtonGroup binding="#{GasQuality$Calculator$ISO6976energy.outputRadioButtonGroup}" id="outputRadioButtonGroup"
                            items="#{GasQuality$Calculator$ISO6976energy.outputRadioButtonGroupDefaultOptions.options}" required="true"
                            selected="#{GasQuality$Calculator$ISO6976energy.outputRadioButtonGroupDefaultOptions.selectedValue}" style="height: 48px; left: 720px; top: 72px; position: absolute; width: 96px"/>
                        <ui:radioButtonGroup binding="#{GasQuality$Calculator$ISO6976energy.refCompustTempCheckBoxGroup}"
                            converter="#{GasQuality$Calculator$ISO6976energy.doubleConverter1}" id="refCompustTempCheckBoxGroup"
                            items="#{GasQuality$Calculator$ISO6976energy.refCompustTempCheckBoxGroupDefaultOptions.options}" required="true"
                            selected="#{GasQuality$Calculator$ISO6976energy.refCompustTempCheckBoxGroupDefaultOptions.selectedValue}" style="height: 72px; left: 528px; top: 192px; position: absolute; width: 96px"/>
                        <ui:messageGroup binding="#{GasQuality$Calculator$ISO6976energy.messageGroup1}" id="messageGroup1" style="position: absolute; left: 864px; top: 72px; width: 216px; height: 216px"/>
                        <ui:staticText id="staticText4" style="height: 24px; left: 648px; top: 192px; position: absolute; width: 94px" text="Gas behavior"/>
                        <ui:radioButtonGroup binding="#{GasQuality$Calculator$ISO6976energy.gasBehaviorButtonGroup}" id="gasBehaviorButtonGroup"
                            items="#{GasQuality$Calculator$ISO6976energy.gasBehaviorButtonGroupDefaultOptions.options}"
                            selected="#{GasQuality$Calculator$ISO6976energy.gasBehaviorButtonGroupDefaultOptions.selectedValue}" style="height: 48px; left: 720px; top: 216px; position: absolute; width: 96px"/>
                        <ui:staticText id="staticText5" style="height: 24px; left: 648px; top: 288px; position: absolute; width: 118px" text="Standard version"/>
                        <ui:radioButtonGroup id="standardNameGroup" items="#{GasQuality$Calculator$ISO6976energy.standardNameGroupDefaultOptions.options}"
                            selected="#{GasQuality$Calculator$ISO6976energy.standardNameGroupDefaultOptions.selectedValue}" style="height: 48px; left: 720px; top: 312px; position: absolute; width: 96px"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
