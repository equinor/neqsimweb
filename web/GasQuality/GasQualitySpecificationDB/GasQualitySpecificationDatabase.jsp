<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{GasQuality$GasQualitySpecificationDB$GasQualitySpecificationDatabase.page1}" id="page1">
            <ui:html binding="#{GasQuality$GasQualitySpecificationDB$GasQualitySpecificationDatabase.html1}" id="html1">
                <ui:head binding="#{GasQuality$GasQualitySpecificationDB$GasQualitySpecificationDatabase.head1}" id="head1">
                    <ui:link binding="#{GasQuality$GasQualitySpecificationDB$GasQualitySpecificationDatabase.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{GasQuality$GasQualitySpecificationDB$GasQualitySpecificationDatabase.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{GasQuality$GasQualitySpecificationDB$GasQualitySpecificationDatabase.form1}" id="form1">
                        <h:graphicImage binding="#{GasQuality$GasQualitySpecificationDB$GasQualitySpecificationDatabase.image1}" height="192" id="image1"
                            style="left: 24px; top: 24px; position: absolute" value="/resources/neqsim_logo.jpg" width="192"/>
                        <h:outputText binding="#{GasQuality$GasQualitySpecificationDB$GasQualitySpecificationDatabase.logoOutputText1}" id="logoOutputText1"
                            style="font-size: 24; height: 25px; left: 264px; top: 24px; position: absolute; width: 406px" styleClass="/resources/stylesheet.css" value="Select Entry Point"/>
                        <div style="position: absolute; left: 24px; top: 216px; width: 48px; height: 24px">
                            <jsp:directive.include file="../GasQualityMenu.jspf"/>
                        </div>
                        <ui:staticText binding="#{GasQuality$GasQualitySpecificationDB$GasQualitySpecificationDatabase.staticText1}" id="staticText1"
                            style="height: 24px; left: 264px; top: 96px; position: absolute; width: 142px" text="Select entry point"/>
                        <ui:button binding="#{GasQuality$GasQualitySpecificationDB$GasQualitySpecificationDatabase.button1}" id="button1"
                            style="height: 24px; left: 407px; top: 144px; position: absolute; width: 72px" text="OK"/>
                        <ui:dropDown binding="#{GasQuality$GasQualitySpecificationDB$GasQualitySpecificationDatabase.dropDown1}" id="dropDown1"
                            items="#{GasQuality$GasQualitySpecificationDB$GasQualitySpecificationDatabase.dropDown1DefaultOptions.options}" style="height: 24px; left: 408px; top: 96px; position: absolute; width: 264px"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
