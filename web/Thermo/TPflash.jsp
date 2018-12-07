<?xml version="1.0" encoding="windows-1252"?>
<!-- 
    Document   : TPflash4
    Created on : 28.jan.2008, 00:26:07
    Author     : ESOL
-->
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=windows-1252" pageEncoding="windows-1252"/>
    <f:view>
        <ui:page binding="#{Thermo$TPflash4.page1}" id="page1">
            <ui:html binding="#{Thermo$TPflash4.html1}" id="html1">
                <ui:head binding="#{Thermo$TPflash4.head1}" id="head1">
                    <ui:link binding="#{Thermo$TPflash4.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{Thermo$TPflash4.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{Thermo$TPflash4.form1}" id="form1">
                        <h:graphicImage binding="#{Thermo$TPflash4.imageNeqSIm1}" height="192" id="imageNeqSIm1"
                            style="left: 24px; top: 24px; position: absolute" value="/resources/neqsim_logo.jpg" width="192"/>
                        <h:outputText binding="#{Thermo$TPflash4.gergWaterMenuText1}" id="gergWaterMenuText1"
                            style="font-size: 18px; height: 24px; left: 240px; top: 24px; position: absolute; width: 336px" value="TPflash"/>
                        <div style="height: 96px; left: 192px; top: 48px; position: absolute; width: 72px">
                            <jsp:directive.include file="TempPresSetter.jspf"/>
                        </div>
                        <div style="height: 48px; left: 24px; top: 216px; position: absolute; width: 72px">
                            <jsp:directive.include file="ThermoMenu.jspf"/>
                        </div>
                        <div style="height: 24px; left: 240px; top: 408px; position: absolute; width: 48px">
                            <jsp:directive.include file="DocumentStatistics.jspf"/>
                        </div>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
