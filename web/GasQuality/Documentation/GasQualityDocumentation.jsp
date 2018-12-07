<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{GasQuality$Documentation$GasQualityDocumentation.page1}" id="page1">
            <ui:html binding="#{GasQuality$Documentation$GasQualityDocumentation.html1}" id="html1">
                <ui:head binding="#{GasQuality$Documentation$GasQualityDocumentation.head1}" id="head1">
                    <ui:link binding="#{GasQuality$Documentation$GasQualityDocumentation.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{GasQuality$Documentation$GasQualityDocumentation.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{GasQuality$Documentation$GasQualityDocumentation.form1}" id="form1">
                        <h:graphicImage binding="#{GasQuality$Documentation$GasQualityDocumentation.image1}" height="192" id="image1"
                            style="left: 24px; top: 24px; position: absolute" value="/resources/neqsim_logo.jpg" width="192"/>
                        <ui:staticText binding="#{GasQuality$Documentation$GasQualityDocumentation.staticText2}" id="staticText2"
                            style="height: 24px; left: 240px; top: 24px; position: absolute; width: 766px" styleClass="title1" text="Gas Quality Documentation"/>
                        <ui:hyperlink action="#{GasQuality$Documentation$GasQualityDocumentation.hyperlink5_action}"
                            binding="#{GasQuality$Documentation$GasQualityDocumentation.hyperlink5}" id="hyperlink5"
                            style="font-size: 14px; height: 24px; left: 240px; top: 96px; position: absolute; width: 552px" styleClass="body-text-hyperlink-box"
                            target="_blank" text="1. Gas Quality Methods and Tools" url="/../neqsimweblog/gasquality/category/Methods+and+tools"/>
                        <ui:staticText binding="#{GasQuality$Documentation$GasQualityDocumentation.staticText3}" id="staticText3"
                            style="height: 24px; left: 240px; top: 72px; position: absolute; width: 552px" styleClass="body-text" text="Gas Quality Method Documentation"/>
                        <ui:staticText binding="#{GasQuality$Documentation$GasQualityDocumentation.staticText4}" id="staticText4"
                            style="height: 24px; left: 240px; top: 144px; position: absolute; width: 552px" styleClass="body-text" text="Standards documentation"/>
                        <div style="position: absolute; left: 24px; top: 216px; width: 120px; height: 48px">
                            <jsp:directive.include file="../GasQualityMenu.jspf"/>
                        </div>
                        <ui:hyperlink id="hyperlink1" style="font-size: 14px; height: 24px; left: 240px; top: 168px; position: absolute; width: 552px"
                            styleClass="body-text-hyperlink-box" target="_blank" text="1. Standarads Documentation" url="/../neqsimweblog/gasquality/category/Standards"/>
                        <ui:staticText id="staticText5" style="height: 24px; left: 240px; top: 216px; position: absolute; width: 552px" styleClass="body-text" text="Gas Quality Analysis"/>
                        <ui:hyperlink action="#{GasQuality$Documentation$GasQualityDocumentation.hyperlink2_action}" id="hyperlink2"
                            style="font-size: 14px; height: 24px; left: 240px; top: 240px; position: absolute; width: 552px"
                            styleClass="body-text-hyperlink-box" target="_blank" text="1. Analyser Documentation" url="/../neqsimweblog/gasquality/category/Analysis+equipment"/>
                        <ui:staticText id="staticText1" style="height: 24px; left: 240px; top: 288px; position: absolute; width: 552px" styleClass="body-text" text="Gas Quality Specifications"/>
                        <ui:hyperlink action="#{GasQuality$Documentation$GasQualityDocumentation.hyperlink2_action}" id="hyperlink3"
                            style="font-size: 14px; height: 24px; left: 240px; top: 312px; position: absolute; width: 552px"
                            styleClass="body-text-hyperlink-box" target="_blank" text="1. Gas Quality Specifications Documentation" url="/../neqsimweblog/gasquality/category/Gas+quality+specifications"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
