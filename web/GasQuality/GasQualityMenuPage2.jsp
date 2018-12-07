<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{GasQuality$GasQualityMenuPage2.page1}" id="page1">
            <ui:html binding="#{GasQuality$GasQualityMenuPage2.html1}" id="html1">
                <ui:head binding="#{GasQuality$GasQualityMenuPage2.head1}" id="head1">
                    <ui:link binding="#{GasQuality$GasQualityMenuPage2.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{GasQuality$GasQualityMenuPage2.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{GasQuality$GasQualityMenuPage2.form1}" id="form1">
                        <h:graphicImage binding="#{GasQuality$GasQualityMenuPage2.image1}" height="192" id="image1"
                            style="left: 24px; top: 24px; position: absolute" value="/resources/neqsim_logo.jpg" width="192"/>
                        <h:outputText binding="#{GasQuality$GasQualityMenuPage2.logoOutputText1}" id="logoOutputText1"
                            style="height: 25px; left: 264px; top: 24px; position: absolute; width: 552px" styleClass="title1" value="Gas Quality Documentation"/>
                        <div style="height: 144px; left: 24px; top: 216px; position: absolute; width: 192px">
                            <jsp:directive.include file="GasQualityMenu.jspf"/>
                        </div>
                        <ui:staticText binding="#{GasQuality$GasQualityMenuPage2.staticText1}" id="staticText1"
                            style="height: 24px; left: 264px; top: 120px; position: absolute; width: 552px" text="1. Documentation related to gas quality measurements:"/>
                        <ui:staticText binding="#{GasQuality$GasQualityMenuPage2.staticText2}" id="staticText2"
                            style="height: 24px; left: 264px; top: 216px; position: absolute; width: 552px" text="2. Documentation related to gas quality calculations"/>
                        <ui:hyperlink action="#{GasQuality$GasQualityMenuPage2.hyperlink1_action}" binding="#{GasQuality$GasQualityMenuPage2.hyperlink1}"
                            id="hyperlink1" style="position: absolute; left: 264px; top: 72px; width: 144px; height: 24px" text="Add Document"/>
                        <ui:staticText binding="#{GasQuality$GasQualityMenuPage2.staticText3}" id="staticText3"
                            style="height: 24px; left: 264px; top: 312px; position: absolute; width: 360px" text="3. Standards related to gas quality analysis and calculation"/>
                        <ui:hyperlink action="#{GasQuality$GasQualityMenuPage2.hyperlink2_action}" binding="#{GasQuality$GasQualityMenuPage2.hyperlink2}"
                            id="hyperlink2" style="position: absolute; left: 288px; top: 144px; width: 216px; height: 24px" text="1. International standards"/>
                        <ui:hyperlink action="#{GasQuality$GasQualityMenuPage2.hyperlink3_action}" binding="#{GasQuality$GasQualityMenuPage2.hyperlink3}"
                            id="hyperlink3" style="height: 24px; left: 288px; top: 240px; position: absolute; width: 216px" text="1. International standards"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
