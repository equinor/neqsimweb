<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{GasQuality$Calculator$GasQualityCalcMenu.page1}" id="page1">
            <ui:html binding="#{GasQuality$Calculator$GasQualityCalcMenu.html1}" id="html1">
                <ui:head binding="#{GasQuality$Calculator$GasQualityCalcMenu.head1}" id="head1">
                    <ui:link binding="#{GasQuality$Calculator$GasQualityCalcMenu.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{GasQuality$Calculator$GasQualityCalcMenu.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{GasQuality$Calculator$GasQualityCalcMenu.form1}" id="form1">
                        <h:graphicImage binding="#{GasQuality$Calculator$GasQualityCalcMenu.image1}" height="192" id="image1"
                            style="left: 24px; top: 24px; position: absolute" value="/resources/neqsim_logo.jpg" width="192"/>
                        <h:outputText binding="#{GasQuality$Calculator$GasQualityCalcMenu.outputText1}" id="outputText1"
                            style="height: 46px; left: 240px; top: 72px; position: absolute; width: 552px" styleClass="body-text" value="Select fluid and operation from the left menu.  Select view reults to open report of calculated values."/>
                        <div style="position: absolute; left: 24px; top: 216px; width: 168px; height: 72px">
                            <jsp:directive.include file="../GasQualityMenu.jspf"/>
                        </div>
                        <h:outputText id="logoOutputText1" style="height: 25px; left: 240px; top: 24px; position: absolute; width: 552px" styleClass="title1" value="Gas Quality Calculation"/>
                        <ui:staticText id="staticText1" style="left: 240px; top: 144px; position: absolute" styleClass="body-text" text="The nesessary steps to run a calculation are:"/>
                        <ui:staticText id="staticText2" style="left: 240px; top: 168px; position: absolute" styleClass="body-text" text="1. Select or enter a new fluid composition"/>
                        <ui:staticText id="staticText3" style="left: 288px; top: 192px; position: absolute" styleClass="body-text" text="Previos fluid compositions are store in a database. &#xa;&#x9;"/>
                        <ui:staticText id="staticText4" style="left: 288px; top: 216px; position: absolute" styleClass="body-text" text="Relevant experimental data can also be stored with the fluid."/>
                        <ui:staticText id="staticText5" style="left: 288px; top: 264px; position: absolute" styleClass="body-text" text="Available operations are: TP-flash, dew point, hydrate,etc."/>
                        <ui:staticText id="staticText6" style="left: 240px; top: 240px; position: absolute" styleClass="body-text" text="2. Select thermodynamic operation"/>
                        <ui:staticText id="staticText7" style="left: 240px; top: 288px; position: absolute" styleClass="body-text" text="3. View Results"/>
                        <ui:staticText id="staticText8" style="left: 288px; top: 312px; position: absolute; width: 480px" styleClass="body-text" text="The results will normally display automatically. Eventually press view results."/>
                        <div style="height: 48px; left: 24px; top: 408px; position: absolute; width: 120px">
                            <jsp:directive.include file="GasQualityCalcRightMenu2.jspf"/>
                        </div>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
