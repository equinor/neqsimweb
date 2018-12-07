<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{GasQuality$GasQualityAnalysisStandards$GasQualityAnalysisStandards.page1}" id="page1">
            <ui:html binding="#{GasQuality$GasQualityAnalysisStandards$GasQualityAnalysisStandards.html1}" id="html1">
                <ui:head binding="#{GasQuality$GasQualityAnalysisStandards$GasQualityAnalysisStandards.head1}" id="head1">
                    <ui:link binding="#{GasQuality$GasQualityAnalysisStandards$GasQualityAnalysisStandards.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{GasQuality$GasQualityAnalysisStandards$GasQualityAnalysisStandards.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{GasQuality$GasQualityAnalysisStandards$GasQualityAnalysisStandards.form1}" id="form1">
                        <h:graphicImage binding="#{GasQuality$GasQualityAnalysisStandards$GasQualityAnalysisStandards.image1}" height="192" id="image1"
                            style="left: 24px; top: 24px; position: absolute" value="/resources/neqsim_logo.jpg" width="192"/>
                        <h:outputText binding="#{GasQuality$GasQualityAnalysisStandards$GasQualityAnalysisStandards.logoOutputText1}" id="logoOutputText1"
                            style="font-size: 24; height: 25px; left: 264px; top: 24px; position: absolute; width: 552px" styleClass="/resources/stylesheet.css" value="Gas Quality Analysis Standards"/>
                        <div style="position: absolute; left: 24px; top: 216px; width: 168px; height: 120px">
                            <jsp:directive.include file="../GasQualityMenu.jspf"/>
                        </div>
                        <ui:staticText binding="#{GasQuality$GasQualityAnalysisStandards$GasQualityAnalysisStandards.staticText1}" id="staticText1"
                            style="position: absolute; left: 264px; top: 96px; width: 168px; height: 24px" text="Water analysis"/>
                        <ui:staticText binding="#{GasQuality$GasQualityAnalysisStandards$GasQualityAnalysisStandards.staticText2}" id="staticText2"
                            style="position: absolute; left: 264px; top: 192px; width: 168px; height: 24px" text="Hydrocarbon dew point"/>
                        <ui:staticText binding="#{GasQuality$GasQualityAnalysisStandards$GasQualityAnalysisStandards.staticText3}" id="staticText3"
                            style="height: 22px; left: 264px; top: 288px; position: absolute; width: 190px" text="GC-analysis"/>
                        <ui:staticText binding="#{GasQuality$GasQualityAnalysisStandards$GasQualityAnalysisStandards.staticText4}" id="staticText4"
                            style="height: 24px; left: 264px; top: 384px; position: absolute; width: 240px" text="Mercury analysis"/>
                        <ui:staticText binding="#{GasQuality$GasQualityAnalysisStandards$GasQualityAnalysisStandards.staticText5}" id="staticText5"
                            style="height: 24px; left: 264px; top: 480px; position: absolute; width: 264px" text="Sulphur analysis"/>
                        <ui:imageHyperlink action="#{GasQuality$GasQualityAnalysisStandards$GasQualityAnalysisStandards.imageHyperlink1_action}"
                            binding="#{GasQuality$GasQualityAnalysisStandards$GasQualityAnalysisStandards.imageHyperlink1}" height="24" id="imageHyperlink1"
                            style="left: 504px; top: 120px; position: absolute" text="Open ISO-standard" width="216"/>
                        <ui:staticText binding="#{GasQuality$GasQualityAnalysisStandards$GasQualityAnalysisStandards.staticText6}" id="staticText6"
                            style="height: 24px; left: 288px; top: 120px; position: absolute; width: 192px" text="1. Water using GC (ISO???)"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
