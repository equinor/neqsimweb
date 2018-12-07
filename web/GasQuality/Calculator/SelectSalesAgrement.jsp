<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{GasQuality$Calculator$SelectSalesAgrement.page1}" id="page1">
            <ui:html binding="#{GasQuality$Calculator$SelectSalesAgrement.html1}" id="html1">
                <ui:head binding="#{GasQuality$Calculator$SelectSalesAgrement.head1}" id="head1">
                    <ui:link binding="#{GasQuality$Calculator$SelectSalesAgrement.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{GasQuality$Calculator$SelectSalesAgrement.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{GasQuality$Calculator$SelectSalesAgrement.form1}" id="form1">
                        <h:graphicImage binding="#{GasQuality$Calculator$SelectSalesAgrement.image1}" height="192" id="image1"
                            style="left: 24px; top: 24px; position: absolute" value="/resources/neqsim_logo.jpg" width="192"/>
                        <div style="height: 192px; left: 24px; top: 384px; position: absolute; width: 192px">
                            <jsp:directive.include file="GasQualityCalcRightMenu2.jspf"/>
                        </div>
                        <div style="position: absolute; left: 24px; top: 216px; width: 192px; height: 72px">
                            <jsp:directive.include file="../GasQualityMenu.jspf"/>
                        </div>
                        <h:outputText binding="#{GasQuality$Calculator$SelectSalesAgrement.logoOutputText1}" id="logoOutputText1"
                            style="font-size: 24; height: 25px; left: 264px; top: 24px; position: absolute; width: 552px" styleClass="/resources/stylesheet.css" value="Select delivery point/sales contract"/>
                        <ui:dropDown binding="#{GasQuality$Calculator$SelectSalesAgrement.dropDown1}" id="dropDown1"
                            items="#{GasQuality$Calculator$SelectSalesAgrement.cachedRowSetDataProvider2.options['gascontractspecifications.TERMINAL,gascontractspecifications.TERMINAL']}" style="height: 24px; left: 408px; top: 192px; position: absolute; width: 264px"/>
                        <ui:staticText binding="#{GasQuality$Calculator$SelectSalesAgrement.staticText1}" id="staticText1"
                            style="height: 24px; left: 264px; top: 192px; position: absolute; width: 142px" text="Select terminal/contract"/>
                        <ui:button action="#{GasQuality$Calculator$SelectSalesAgrement.button1_action}"
                            binding="#{GasQuality$Calculator$SelectSalesAgrement.button1}" id="button1"
                            style="height: 24px; left: 407px; top: 240px; position: absolute; width: 72px" text="OK"/>
                        <ui:staticText id="staticText2" style="height: 24px; left: 264px; top: 144px; position: absolute; width: 142px" text="Select delivery country"/>
                        <ui:dropDown binding="#{GasQuality$Calculator$SelectSalesAgrement.coutryDropDown2}" id="coutryDropDown2"
                            items="#{GasQuality$Calculator$SelectSalesAgrement.cachedRowSetDataProvider1.options['gascontractspecifications.COUNTRY,gascontractspecifications.COUNTRY']}"
                            onChange="common_timeoutSubmitForm(this.form, 'coutryDropDown2');"
                            style="height: 24px; left: 408px; top: 144px; position: absolute; width: 264px" valueChangeListener="#{GasQuality$Calculator$SelectSalesAgrement.coutryDropDown2_processValueChange}"/>
                        <ui:staticText id="staticText3" style="left: 264px; top: 72px; position: absolute; width: 552px" text="Gas quality check is done against gas quality specification at specified gas delivery point"/>
                        <ui:staticText id="staticText4" style="left: 264px; top: 96px; position: absolute; width: 576px" text="Select country and delivery terminal/contract from the drop down lists below."/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
