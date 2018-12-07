<?xml version="1.0" encoding="windows-1252"?>
<!-- 
    Document   : ProcessOptions
    Created on : 09.jul.2009, 09:23:27
    Author     : esol
-->
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=windows-1252" pageEncoding="windows-1252"/>
    <f:view>
        <ui:page id="page1">
            <ui:html id="html1">
                <ui:head id="head1">
                    <ui:link id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body id="body1" style="-rave-layout: grid">
                    <ui:form id="form1">
                        <h:graphicImage height="192" id="image1" style="left: 24px; top: 24px; position: absolute" value="/resources/neqsim_logo.jpg" width="192"/>
                        <div style="height: 48px; left: 24px; top: 216px; position: absolute; width: 48px">
                            <jsp:directive.include file="../ProcessLeftMenuPage.jspf"/>
                        </div>
                        <div style="height: 144px; left: 24px; top: 408px; position: absolute; width: 144px">
                            <jsp:directive.include file="GasProcessCalcRightMenu2.jspf"/>
                        </div>
                        <h:outputText id="logoOutputText1" style="height: 25px; left: 264px; top: 24px; position: absolute; width: 552px" styleClass="title1" value="Process Options"/>
                        <ui:staticText id="staticText1" style="position: absolute; left: 264px; top: 96px; width: 192px; height: 24px" text="Select phase"/>
                        <ui:dropDown binding="#{Process$calculator$ProcessOptions.phaseDropDown}"
                            converter="#{Process$calculator$ProcessOptions.phaseDropDownConverter}" id="phaseDropDown"
                            items="#{Process$calculator$ProcessOptions.phaseDropDownDefaultOptions.options}" style="position: absolute; left: 456px; top: 96px; width: 168px; height: 24px"/>
                        <ui:button action="#{Process$calculator$ProcessOptions.button1_action}" id="button1"
                            style="height: 24px; left: 455px; top: 168px; position: absolute; width: 72px" text="Ok"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
