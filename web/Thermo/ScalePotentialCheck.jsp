<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{Thermo$ScalePotentialCheck.page1}" id="page1">
            <ui:html binding="#{Thermo$ScalePotentialCheck.html1}" id="html1">
                <ui:head binding="#{Thermo$ScalePotentialCheck.head1}" id="head1">
                    <ui:link binding="#{Thermo$ScalePotentialCheck.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{Thermo$ScalePotentialCheck.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{Thermo$ScalePotentialCheck.form1}" id="form1">
                        <h:graphicImage binding="#{Thermo$ScalePotentialCheck.imageNeqSIm1}" height="192" id="imageNeqSIm1"
                            style="left: 24px; top: 24px; position: absolute" value="../resources/neqsim_logo.jpg" width="192"/>
                        <div style="height: 48px; left: 24px; top: 216px; position: absolute; width: 120px">
                            <jsp:directive.include file="ThermoMenu.jspf"/>
                        </div>
                        <h:outputText binding="#{Thermo$ScalePotentialCheck.gergWaterMenuText1}" id="gergWaterMenuText1"
                            style="font-size: 24; height: 22px; left: 264px; top: 24px; position: absolute; width: 454px" styleClass="title1" value="Scale Potential Check"/>
                        <h:inputText binding="#{Thermo$ScalePotentialCheck.pressureTextField}" id="pressureTextField"
                            style="height: 24px; left: 408px; top: 144px; position: absolute; width: 192px" value="1.0"/>
                        <h:outputText binding="#{Thermo$ScalePotentialCheck.pressureTextField1}" id="pressureTextField1"
                            style="height: 24px; left: 264px; top: 144px; position: absolute; width: 120px" value="Pressure [bar]"/>
                        <ui:button action="#{Thermo$ScalePotentialCheck.button1_action}" binding="#{Thermo$ScalePotentialCheck.button1}" id="button1"
                            style="height: 24px; left: 407px; top: 192px; position: absolute; width: 96px" text="Ok"/>
                        <ui:messageGroup binding="#{Thermo$ScalePotentialCheck.messageGroup1}" id="messageGroup1" style="height: 216px; left: 720px; top: 96px; position: absolute; width: 288px"/>
                        <h:outputText binding="#{Thermo$ScalePotentialCheck.pressureTextField2}" id="pressureTextField2"
                            style="height: 24px; left: 264px; top: 96px; position: absolute; width: 120px" value="Temperature [C]"/>
                        <h:inputText binding="#{Thermo$ScalePotentialCheck.temperatureTextField}" id="temperatureTextField"
                            style="height: 24px; left: 408px; top: 96px; position: absolute; width: 192px" value="1.0"/>
                        <ui:staticText binding="#{Thermo$ScalePotentialCheck.staticText1}" id="staticText1"
                            style="height: 24px; left: 264px; top: 264px; position: absolute; width: 72px" text="pH:"/>
                        <ui:staticText binding="#{Thermo$ScalePotentialCheck.phTextField}" id="phTextField"
                            style="height: 22px; left: 408px; top: 264px; position: absolute; width: 190px" text="NaN"/>
                        <h:dataTable binding="#{Thermo$ScalePotentialCheck.scaleTable}" headerClass="list-header" id="scaleTable"
                            rowClasses="list-row-even,list-row-odd" style="height: 27px; left: 264px; top: 336px; position: absolute" var="currentRow" width="456">
                            <h:column binding="#{Thermo$ScalePotentialCheck.scaleTable2}" id="scaleTable2">
                                <h:outputText binding="#{Thermo$ScalePotentialCheck.outputText7}" id="outputText7" value="#{currentRow[0]}"/>
                                <f:facet name="header">
                                    <h:outputText binding="#{Thermo$ScalePotentialCheck.outputText8}" id="outputText8" value="Salt"/>
                                </f:facet>
                            </h:column>
                            <h:column binding="#{Thermo$ScalePotentialCheck.column5}" id="column5">
                                <h:outputText binding="#{Thermo$ScalePotentialCheck.outputText9}" id="outputText9" value="#{currentRow[1]}"/>
                                <f:facet name="header">
                                    <h:outputText binding="#{Thermo$ScalePotentialCheck.outputText10}" id="outputText10" value="Relative Solubilty (rel Ksp)"/>
                                </f:facet>
                            </h:column>
                            <h:column binding="#{Thermo$ScalePotentialCheck.column6}" id="column6">
                                <h:outputText binding="#{Thermo$ScalePotentialCheck.outputText11}" id="outputText11" value="#{currentRow[2]}"/>
                                <f:facet name="header">
                                    <h:outputText binding="#{Thermo$ScalePotentialCheck.outputText12}" id="outputText12" value="Unit"/>
                                </f:facet>
                            </h:column>
                        </h:dataTable>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
