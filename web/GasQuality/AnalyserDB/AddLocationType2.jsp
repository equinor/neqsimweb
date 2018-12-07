<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{GasQuality$AnalyserDB$AddLocationType2.page1}" id="page1">
            <ui:html binding="#{GasQuality$AnalyserDB$AddLocationType2.html1}" id="html1">
                <ui:head binding="#{GasQuality$AnalyserDB$AddLocationType2.head1}" id="head1">
                    <ui:link binding="#{GasQuality$AnalyserDB$AddLocationType2.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{GasQuality$AnalyserDB$AddLocationType2.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{GasQuality$AnalyserDB$AddLocationType2.form1}" id="form1">
                        <h:outputText binding="#{GasQuality$AnalyserDB$AddLocationType2.outputText1}" id="outputText1"
                            style="height: 28px; left: 240px; top: 72px; position: absolute; width: 504px" value="Type the name of anaysertype or location in the text field and press Add-button"/>
                        <h:inputText binding="#{GasQuality$AnalyserDB$AddLocationType2.analyserTextField1}" id="analyserTextField1" style="height: 24px; left: 384px; top: 216px; position: absolute; width: 240px"/>
                        <h:graphicImage binding="#{GasQuality$AnalyserDB$AddLocationType2.image1}" height="192" id="image1"
                            style="left: 24px; top: 24px; position: absolute" value="/resources/neqsim_logo.jpg" width="196"/>
                        <h:inputText binding="#{GasQuality$AnalyserDB$AddLocationType2.locationTextField1}" id="locationTextField1" style="height: 24px; left: 384px; top: 144px; position: absolute; width: 240px"/>
                        <h:commandButton action="#{GasQuality$AnalyserDB$AddLocationType2.addTypeButton_action}"
                            binding="#{GasQuality$AnalyserDB$AddLocationType2.addTypeButton1}" id="addTypeButton1"
                            style="height: 24px; left: 648px; top: 216px; position: absolute; width: 48px" value="Add"/>
                        <h:outputText binding="#{GasQuality$AnalyserDB$AddLocationType2.topMenuText1}" id="topMenuText1"
                            style="font-size: 24; height: 23px; left: 240px; top: 24px; position: absolute; width: 408px"
                            styleClass="title1 resources/stylesheet.css" title="title1" value="Add Gas Quality Analyser"/>
                        <h:outputText binding="#{GasQuality$AnalyserDB$AddLocationType2.outputText2}" id="outputText2"
                            style="font-weight: bold; height: 24px; left: 24px; top: 216px; position: absolute; width: 192px" value="Menu"/>
                        <h:outputText binding="#{GasQuality$AnalyserDB$AddLocationType2.outputText3}" id="outputText3"
                            style="height: 24px; left: 240px; top: 144px; position: absolute; width: 120px" value="Add Location"/>
                        <h:commandLink action="#{GasQuality$AnalyserDB$AddLocationType2.linkAction3_action}"
                            binding="#{GasQuality$AnalyserDB$AddLocationType2.linkAction1}" id="linkAction1" style="height: 24px; left: 24px; top: 240px; position: absolute; width: 192px">
                            <h:outputText binding="#{GasQuality$AnalyserDB$AddLocationType2.linkAction1Text1}" id="linkAction1Text1" value="Add Analyser"/>
                        </h:commandLink>
                        <h:commandButton action="#{GasQuality$AnalyserDB$AddLocationType2.addLocationButton_action}"
                            binding="#{GasQuality$AnalyserDB$AddLocationType2.addLocationButton1}" id="addLocationButton1"
                            style="height: 24px; left: 648px; top: 144px; position: absolute; width: 48px" value="Add"/>
                        <h:outputText binding="#{GasQuality$AnalyserDB$AddLocationType2.outputText4}" id="outputText4"
                            style="height: 24px; left: 240px; top: 216px; position: absolute; width: 120px" value="Add Analyser Type"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
