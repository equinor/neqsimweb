<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{Process$Documentation$ProcessDocumentation.page1}" id="page1">
            <ui:html binding="#{Process$Documentation$ProcessDocumentation.html1}" id="html1">
                <ui:head binding="#{Process$Documentation$ProcessDocumentation.head1}" id="head1">
                    <ui:link binding="#{Process$Documentation$ProcessDocumentation.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{Process$Documentation$ProcessDocumentation.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{Process$Documentation$ProcessDocumentation.form1}" id="form1">
                        <h:graphicImage binding="#{Process$Documentation$ProcessDocumentation.image1}" height="192" id="image1"
                            style="left: 24px; top: 24px; position: absolute" value="/resources/neqsim_logo.jpg" width="192"/>
                        <ui:staticText binding="#{Process$Documentation$ProcessDocumentation.staticText2}" id="staticText2"
                            style="height: 24px; left: 240px; top: 24px; position: absolute; width: 766px" styleClass="title1" text="Process Documentation"/>
                        <ui:staticText binding="#{Process$Documentation$ProcessDocumentation.staticText3}" id="staticText3"
                            style="height: 24px; left: 240px; top: 72px; position: absolute; width: 552px" styleClass="body-text" text="Description of how to do thermodynamic caluations with the intranet application"/>
                        <ui:staticText binding="#{Process$Documentation$ProcessDocumentation.staticText1}" id="staticText1"
                            style="height: 24px; left: 240px; top: 120px; position: absolute; width: 552px" styleClass="body-text" text="Process documentation"/>
                        <ui:hyperlink action="#{Process$Documentation$ProcessDocumentation.hyperlink6_action}"
                            binding="#{Process$Documentation$ProcessDocumentation.hyperlink6}" id="hyperlink6"
                            style="height: 24px; left: 240px; top: 144px; position: absolute; width: 552px" styleClass="body-text-hyperlink-box" target="_blank"
                            text="1.Documentation" url="http://10.221.8.69:8080/neqsimweblog/thermodynamics/category/Viscosity"/>
                        <div style="position: absolute; left: 24px; top: 216px; width: 96px; height: 48px">
                            <jsp:directive.include file="../ProcessLeftMenuPage.jspf"/>
                        </div>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
