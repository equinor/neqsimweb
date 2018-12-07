<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{NonEquilibrium$Documentation$NonEquilibriumDocumentation.page1}" id="page1">
            <ui:html binding="#{NonEquilibrium$Documentation$NonEquilibriumDocumentation.html1}" id="html1">
                <ui:head binding="#{NonEquilibrium$Documentation$NonEquilibriumDocumentation.head1}" id="head1">
                    <ui:link binding="#{NonEquilibrium$Documentation$NonEquilibriumDocumentation.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{NonEquilibrium$Documentation$NonEquilibriumDocumentation.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{NonEquilibrium$Documentation$NonEquilibriumDocumentation.form1}" id="form1">
                        <h:graphicImage binding="#{NonEquilibrium$Documentation$NonEquilibriumDocumentation.image1}" height="192" id="image1"
                            style="left: 24px; top: 24px; position: absolute" value="/resources/neqsim_logo.jpg" width="192"/>
                        <ui:staticText binding="#{NonEquilibrium$Documentation$NonEquilibriumDocumentation.staticText2}" id="staticText2"
                            style="height: 24px; left: 240px; top: 24px; position: absolute; width: 766px" styleClass="title1" text="Non-Equilibrium Documentation"/>
                        <ui:staticText binding="#{NonEquilibrium$Documentation$NonEquilibriumDocumentation.staticText3}" id="staticText3"
                            style="height: 24px; left: 240px; top: 72px; position: absolute; width: 552px" styleClass="body-text" text="Description of how to do thermodynamic caluations with the intranet application"/>
                        <ui:staticText binding="#{NonEquilibrium$Documentation$NonEquilibriumDocumentation.staticText1}" id="staticText1"
                            style="height: 24px; left: 240px; top: 120px; position: absolute; width: 552px" styleClass="body-text" text="Non Equilibrium"/>
                        <ui:hyperlink action="#{NonEquilibrium$Documentation$NonEquilibriumDocumentation.hyperlink6_action}"
                            binding="#{NonEquilibrium$Documentation$NonEquilibriumDocumentation.hyperlink6}" id="hyperlink6"
                            style="height: 24px; left: 240px; top: 144px; position: absolute; width: 552px" styleClass="body-text-hyperlink-box" target="_blank"
                            text="1.Documentation" url="http://10.221.8.69:8080/neqsimweblog/thermodynamics/category/Viscosity"/>
                        <div style="position: absolute; left: 24px; top: 216px; width: 144px; height: 72px">
                            <jsp:directive.include file="../NonEquilibriumLeftMenu.jspf"/>
                        </div>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
