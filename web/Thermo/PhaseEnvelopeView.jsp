<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view><![CDATA[
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
 "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
]]><html
            lang="no-NO" xml:lang="no-NO">
            <head>
                <meta content="no-cache" http-equiv="Cache-Control"/>
                <meta content="no-cache" http-equiv="Pragma"/>
                <title>Thermo$Page Title</title>
                <link href="/resources/stylesheet.css" rel="stylesheet" type="text/css"/>
            </head>
            <body style="-rave-layout: grid">
                <h:form binding="#{Thermo$PhaseEnvelopeView.form1}" id="form1">
                    <h:outputText binding="#{Thermo$PhaseEnvelopeView.plotOutputText}" id="plotOutputText" style="left: 264px; top: 24px; position: absolute"
                        styleClass="title1" value="Phase Envelope"/>
                    <h:graphicImage binding="#{Thermo$PhaseEnvelopeView.image1}" height="504" id="image1" style="left: 264px; top: 96px; position: absolute"
                        url="c:/temp/NeqSimTempFig1.png" value="/servlet/DisplayJFreeChartImage" width="674"/>
                    <h:commandLink binding="#{Thermo$PhaseEnvelopeView.addComponentLinkAction}" id="addComponentLinkAction" style="height: 26px; left: 24px; top: 264px; position: absolute; width: 192px">
                        <h:outputText binding="#{Thermo$PhaseEnvelopeView.addComponentActionText}" id="addComponentActionText" value="1. Add Components"/>
                    </h:commandLink>
                    <h:commandLink binding="#{Thermo$PhaseEnvelopeView.mainMenuLinkAction}" id="mainMenuLinkAction" style="height: 24px; left: 24px; top: 216px; position: absolute; width: 192px">
                        <h:outputText binding="#{Thermo$PhaseEnvelopeView.linkAction1Text8}" id="linkAction1Text8" value="Start Menu"/>
                    </h:commandLink>
                    <h:commandLink binding="#{Thermo$PhaseEnvelopeView.operationLinkAction}" id="operationLinkAction" style="height: 24px; left: 24px; top: 288px; position: absolute; width: 192px">
                        <h:outputText binding="#{Thermo$PhaseEnvelopeView.operationsText}" id="operationsText" value="2. Select Operation"/>
                    </h:commandLink>
                    <h:commandLink binding="#{Thermo$PhaseEnvelopeView.displayResultsLinkAction}" id="displayResultsLinkAction" style="height: 26px; left: 24px; top: 312px; position: absolute; width: 192px">
                        <h:outputText binding="#{Thermo$PhaseEnvelopeView.displayResultsLinkActionText}" id="displayResultsLinkActionText" value="3. Display Results"/>
                    </h:commandLink>
                    <h:graphicImage binding="#{Thermo$PhaseEnvelopeView.imageNeqSim}" height="192" id="imageNeqSim"
                        style="left: 24px; top: 24px; position: absolute" url="../resources/neqsim_logo.jpg" value="../resources/neqsim_logo.jpg" width="192"/>
                </h:form>
            </body>
        </html>
    </f:view>
</jsp:root>
