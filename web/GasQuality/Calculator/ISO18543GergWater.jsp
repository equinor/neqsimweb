<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{GasQuality$Calculator$ISO18543GergWater.page1}" id="page1">
            <ui:html binding="#{GasQuality$Calculator$ISO18543GergWater.html1}" id="html1">
                <ui:head binding="#{GasQuality$Calculator$ISO18543GergWater.head1}" id="head1">
                    <ui:link binding="#{GasQuality$Calculator$ISO18543GergWater.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{GasQuality$Calculator$ISO18543GergWater.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{GasQuality$Calculator$ISO18543GergWater.form1}" id="form1">
                        <h:graphicImage binding="#{GasQuality$Calculator$ISO18543GergWater.image1}" height="192" id="image1"
                            style="left: 24px; top: 24px; position: absolute" value="/resources/neqsim_logo.jpg" width="192"/>
                        <h:outputText binding="#{GasQuality$Calculator$ISO18543GergWater.outputText1}" id="outputText1"
                            style="font-size: 20; height: 26px; left: 264px; top: 24px; position: absolute; width: 480px" styleClass="title1" value="ISO18543 - Calculation of water dew point in natural gas"/>
                        <div style="height: 48px; left: 24px; top: 384px; position: absolute; width: 120px">
                            <jsp:directive.include file="GasQualityCalcRightMenu2.jspf"/>
                        </div>
                        <ui:button action="#{GasQuality$Calculator$ISO18543GergWater.button1_action}"
                            binding="#{GasQuality$Calculator$ISO18543GergWater.button1}" id="button1"
                            style="height: 24px; left: 263px; top: 192px; position: absolute; width: 72px" text="Calculate"/>
                        <h:dataTable binding="#{GasQuality$Calculator$ISO18543GergWater.dataTable1}" headerClass="list-header" id="dataTable1" rendered="false"
                            rowClasses="list-row-even,list-row-odd" style="height: 27px; left: 264px; top: 264px; position: absolute"
                            value="#{Thermo$ThermoSessionBean.ISOstandard.resultTable}" var="currentRow" width="696">
                            <h:column binding="#{GasQuality$Calculator$ISO18543GergWater.column1}" id="column1">
                                <h:outputText binding="#{GasQuality$Calculator$ISO18543GergWater.outputText2}" id="outputText2" value="#{currentRow[0]}"/>
                                <f:facet name="header">
                                    <h:outputText binding="#{GasQuality$Calculator$ISO18543GergWater.outputText3}" id="outputText3" value="Property"/>
                                </f:facet>
                            </h:column>
                            <h:column binding="#{GasQuality$Calculator$ISO18543GergWater.column2}" id="column2">
                                <h:outputText binding="#{GasQuality$Calculator$ISO18543GergWater.outputText4}" id="outputText4" value="#{currentRow[1]}"/>
                                <f:facet name="header">
                                    <h:outputText binding="#{GasQuality$Calculator$ISO18543GergWater.outputText5}" id="outputText5" value="Phase 1"/>
                                </f:facet>
                            </h:column>
                            <h:column binding="#{GasQuality$Calculator$ISO18543GergWater.column3}" id="column3">
                                <h:outputText binding="#{GasQuality$Calculator$ISO18543GergWater.outputText6}" id="outputText6" value="#{currentRow[2]}"/>
                                <f:facet name="header">
                                    <h:outputText binding="#{GasQuality$Calculator$ISO18543GergWater.outputText7}" id="outputText7" value="Phase 2"/>
                                </f:facet>
                            </h:column>
                            <h:column binding="#{GasQuality$Calculator$ISO18543GergWater.column4}" id="column4">
                                <h:outputText binding="#{GasQuality$Calculator$ISO18543GergWater.outputText8}" id="outputText8" value="#{currentRow[3]}"/>
                                <f:facet name="header">
                                    <h:outputText binding="#{GasQuality$Calculator$ISO18543GergWater.outputText9}" id="outputText9" value="Phase 3"/>
                                </f:facet>
                            </h:column>
                            <h:column binding="#{GasQuality$Calculator$ISO18543GergWater.column5}" id="column5">
                                <h:outputText binding="#{GasQuality$Calculator$ISO18543GergWater.outputText10}" id="outputText10" value="#{currentRow[4]}"/>
                                <f:facet name="header">
                                    <h:outputText binding="#{GasQuality$Calculator$ISO18543GergWater.outputText11}" id="outputText11" value="Unit"/>
                                </f:facet>
                            </h:column>
                        </h:dataTable>
                        <ui:staticText binding="#{GasQuality$Calculator$ISO18543GergWater.staticText1}" id="staticText1"
                            style="position: absolute; left: 264px; top: 96px; width: 120px; height: 24px" text="Pressure"/>
                        <ui:textField binding="#{GasQuality$Calculator$ISO18543GergWater.pressureTextField}"
                            converter="#{GasQuality$Calculator$ISO18543GergWater.doubleConverter1}" id="pressureTextField"
                            style="height: 24px; left: 432px; top: 96px; position: absolute; width: 144px" text="50.0"/>
                        <ui:staticText binding="#{GasQuality$Calculator$ISO18543GergWater.staticText2}" id="staticText2"
                            style="height: 22px; left: 288px; top: 264px; position: absolute; width: 166px" text="Dew Point Temperature"/>
                        <ui:staticText binding="#{GasQuality$Calculator$ISO18543GergWater.staticText3}" id="staticText3"
                            style="height: 24px; left: 576px; top: 264px; position: absolute; width: 72px" text="deg Celsius"/>
                        <ui:messageGroup binding="#{GasQuality$Calculator$ISO18543GergWater.messageGroup1}" id="messageGroup1" style="position: absolute; left: 744px; top: 96px; width: 264px; height: 336px"/>
                        <ui:staticText binding="#{GasQuality$Calculator$ISO18543GergWater.dewPointTemperatureText}"
                            converter="#{GasQuality$Calculator$ISO18543GergWater.doubleConverter2}" id="dewPointTemperatureText"
                            style="color: red; font-weight: bold; height: 24px; left: 456px; top: 264px; position: absolute; width: 96px" text="not calculated"/>
                        <ui:staticText binding="#{GasQuality$Calculator$ISO18543GergWater.staticText4}" id="staticText4"
                            style="height: 24px; left: 576px; top: 96px; position: absolute; width: 144px" text="[bara]"/>
                        <div style="position: absolute; left: 24px; top: 216px; width: 24px; height: 24px">
                            <jsp:directive.include file="../GasQualityMenu.jspf"/>
                        </div>
                        <ui:staticText id="staticText5" style="height: 24px; left: 264px; top: 144px; position: absolute; width: 166px" text="Initial temperature estimate"/>
                        <ui:textField binding="#{GasQuality$Calculator$ISO18543GergWater.temperatureTextField}"
                            converter="#{GasQuality$Calculator$ISO18543GergWater.doubleConverter1}" id="temperatureTextField"
                            style="height: 24px; left: 432px; top: 144px; position: absolute; width: 144px" text="50.0"/>
                        <ui:staticText id="staticText6" style="height: 24px; left: 576px; top: 144px; position: absolute; width: 144px" text="[C]"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
