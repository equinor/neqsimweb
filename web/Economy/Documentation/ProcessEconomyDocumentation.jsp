<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{Economy$Documentation$ProcessEconomyDocumentation.page1}" id="page1">
            <ui:html binding="#{Economy$Documentation$ProcessEconomyDocumentation.html1}" id="html1">
                <ui:head binding="#{Economy$Documentation$ProcessEconomyDocumentation.head1}" id="head1">
                    <ui:link binding="#{Economy$Documentation$ProcessEconomyDocumentation.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{Economy$Documentation$ProcessEconomyDocumentation.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{Economy$Documentation$ProcessEconomyDocumentation.form1}" id="form1">
                        <h:graphicImage binding="#{Economy$Documentation$ProcessEconomyDocumentation.image1}" height="192" id="image1"
                            style="left: 24px; top: 24px; position: absolute" value="/resources/neqsim_logo.jpg" width="192"/>
                        <ui:staticText binding="#{Economy$Documentation$ProcessEconomyDocumentation.staticText3}" id="staticText3"
                            style="height: 24px; left: 240px; top: 72px; position: absolute; width: 552px" styleClass="body-text" text="Description of how to do thermodynamic caluations with the intranet application"/>
                        <ui:staticText binding="#{Economy$Documentation$ProcessEconomyDocumentation.staticText1}" id="staticText1"
                            style="height: 24px; left: 240px; top: 120px; position: absolute; width: 552px" styleClass="body-text" text="Process economy"/>
                        <ui:hyperlink action="#{Economy$Documentation$ProcessEconomyDocumentation.hyperlink6_action}"
                            binding="#{Economy$Documentation$ProcessEconomyDocumentation.hyperlink6}" id="hyperlink6"
                            style="height: 24px; left: 240px; top: 144px; position: absolute; width: 552px" styleClass="body-text-hyperlink-box" target="_blank"
                            text="1.Documentation" url="http://10.221.8.69:8080/neqsimweblog/thermodynamics/category/Viscosity"/>
                        <div style="position: absolute; left: 24px; top: 216px; width: 120px; height: 96px">
                            <jsp:directive.include file="../ProcessEconomyMenuPage.jspf"/>
                        </div>
                        <h:outputText id="outputText1" style="font-size: 24; height: 32px; left: 240px; top: 24px; position: absolute; width: 840px"
                            styleClass="title1" title="title1" value="Process Economy Documentation"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
