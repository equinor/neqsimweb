<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{Thermo$Documentation$ThermoDocumentation2.page1}" id="page1">
            <ui:html binding="#{Thermo$Documentation$ThermoDocumentation2.html1}" id="html1">
                <ui:head binding="#{Thermo$Documentation$ThermoDocumentation2.head1}" id="head1">
                    <ui:link binding="#{Thermo$Documentation$ThermoDocumentation2.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{Thermo$Documentation$ThermoDocumentation2.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{Thermo$Documentation$ThermoDocumentation2.form1}" id="form1">
                        <h:graphicImage binding="#{Thermo$Documentation$ThermoDocumentation2.image1}" height="192" id="image1"
                            style="left: 24px; top: 24px; position: absolute" value="/resources/neqsim_logo.jpg" width="192"/>
                        <div style="position: absolute; left: 24px; top: 216px; width: 144px; height: 72px">
                            <jsp:directive.include file="ThermoDocumentationMenuPage.jspf"/>
                        </div>
                        <ui:hyperlink action="#{Thermo$Documentation$ThermoDocumentation2.hyperlink1_action}"
                            binding="#{Thermo$Documentation$ThermoDocumentation2.hyperlink1}" id="hyperlink1"
                            style="height: 24px; left: 240px; top: 192px; position: absolute; width: 552px" styleClass="body-text-hyperlink-box" target="_blank"
                            text="2. Thermodynamics of alkanolamines for CO2 and H2S removal " url="/../neqsimweblog/thermodynamics/category/Alkonolamines"/>
                        <ui:hyperlink action="#{Thermo$Documentation$ThermoDocumentation2.hyperlink2_action}"
                            binding="#{Thermo$Documentation$ThermoDocumentation2.hyperlink2}" id="hyperlink2"
                            style="height: 24px; left: 240px; top: 216px; position: absolute; width: 552px" styleClass="body-text-hyperlink-box" target="_blank"
                            text="3. Thermodynamics of glycols" url="/../neqsimweblog/thermodynamics/category/Glycols"/>
                        <ui:hyperlink binding="#{Thermo$Documentation$ThermoDocumentation2.hyperlink3}" id="hyperlink3"
                            style="height: 24px; left: 240px; top: 240px; position: absolute; width: 552px" styleClass="body-text-hyperlink-box" target="_blank"
                            text="4. Thermodynamics of hydrocarbon dew point and cricondenbar calcuations" url="/../neqsimweblog/thermodynamics/category/Hydrocarbon+dew+point"/>
                        <ui:hyperlink binding="#{Thermo$Documentation$ThermoDocumentation2.hyperlink4}" id="hyperlink4"
                            style="height: 24px; left: 240px; top: 264px; position: absolute; width: 552px" styleClass="body-text-hyperlink-box" target="_blank"
                            text="5. Water, ice and hydrate precipitation calcuations (water dew point)" url="/../neqsimweblog/thermodynamics/category/Water+dew+point"/>
                        <ui:staticText binding="#{Thermo$Documentation$ThermoDocumentation2.staticText2}" id="staticText2"
                            style="height: 24px; left: 240px; top: 24px; position: absolute; width: 766px" styleClass="title1" text="Thermodynamic and Physical Property Documentation"/>
                        <ui:hyperlink binding="#{Thermo$Documentation$ThermoDocumentation2.hyperlink5}" id="hyperlink5"
                            style="font-size: 14px; height: 24px; left: 240px; top: 96px; position: absolute; width: 552px" styleClass="body-text-hyperlink-box"
                            target="_blank" text="1. User  documentation - Thermodynamic and physical property calculations" url="/../neqsimweblog/thermodynamics/category/Documentation"/>
                        <ui:staticText binding="#{Thermo$Documentation$ThermoDocumentation2.staticText3}" id="staticText3"
                            style="height: 24px; left: 240px; top: 72px; position: absolute; width: 552px" styleClass="body-text" text="Description of how to do thermodynamic caluations with the intranet application"/>
                        <ui:staticText binding="#{Thermo$Documentation$ThermoDocumentation2.staticText4}" id="staticText4"
                            style="height: 24px; left: 240px; top: 144px; position: absolute; width: 552px" styleClass="body-text" text="Thermodynamics method documentation"/>
                        <ui:staticText binding="#{Thermo$Documentation$ThermoDocumentation2.staticText1}" id="staticText1"
                            style="height: 24px; left: 240px; top: 432px; position: absolute; width: 552px" styleClass="body-text" text="Physical property method documentation"/>
                        <ui:hyperlink action="#{Thermo$Documentation$ThermoDocumentation2.hyperlink1_action}"
                            binding="#{Thermo$Documentation$ThermoDocumentation2.hyperlink6}" id="hyperlink6"
                            style="height: 24px; left: 240px; top: 456px; position: absolute; width: 552px" styleClass="body-text-hyperlink-box" target="_blank"
                            text="1.Viscosity of gases and liquids" url="/../neqsimweblog/thermodynamics/category/Viscosity"/>
                        <ui:hyperlink action="#{Thermo$Documentation$ThermoDocumentation2.hyperlink1_action}"
                            binding="#{Thermo$Documentation$ThermoDocumentation2.hyperlink7}" id="hyperlink7"
                            style="height: 24px; left: 240px; top: 480px; position: absolute; width: 552px" styleClass="body-text-hyperlink-box" target="_blank"
                            text="2.Density of gases and liquids" url="/../neqsimweblog/thermodynamics/category/Density"/>
                        <ui:hyperlink binding="#{Thermo$Documentation$ThermoDocumentation2.hyperlink8}" id="hyperlink8"
                            style="height: 24px; left: 240px; top: 288px; position: absolute; width: 552px" styleClass="body-text-hyperlink-box" target="_blank"
                            text="6. Gas hydrates" url="/../neqsimweblog/thermodynamics/category/Gas+hydrates"/>
                        <ui:hyperlink binding="#{Thermo$Documentation$ThermoDocumentation2.hyperlink9}" id="hyperlink9"
                            style="height: 24px; left: 240px; top: 312px; position: absolute; width: 552px" styleClass="body-text-hyperlink-box" target="_blank"
                            text="7. Wax" url="/../neqsimweblog/thermodynamics/category/Wax"/>
                        <ui:hyperlink binding="#{Thermo$Documentation$ThermoDocumentation2.hyperlink10}" id="hyperlink10"
                            style="height: 24px; left: 240px; top: 336px; position: absolute; width: 552px" styleClass="body-text-hyperlink-box" target="_blank"
                            text="8. Asphaltenes" url="/../neqsimweblog/thermodynamics/category/Asphaltenes"/>
                        <ui:hyperlink action="#{Thermo$Documentation$ThermoDocumentation2.hyperlink11_action}"
                            binding="#{Thermo$Documentation$ThermoDocumentation2.hyperlink11}" id="hyperlink11"
                            style="height: 24px; left: 240px; top: 168px; position: absolute; width: 552px" styleClass="body-text-hyperlink-box" target="_blank"
                            text="1. Selection of equations of state (EoS)" url="/../neqsimweblog/thermodynamics/category/Equations+of+State"/>
                        <ui:hyperlink binding="#{Thermo$Documentation$ThermoDocumentation2.hyperlink12}" id="hyperlink12"
                            style="height: 24px; left: 240px; top: 360px; position: absolute; width: 552px" styleClass="body-text-hyperlink-box" target="_blank"
                            text="9. Characterization of hydrocarbon fluids" url="/../neqsimweblog/thermodynamics/category/Hydrocarbon+characterization"/>
                        <ui:hyperlink action="#{Thermo$Documentation$ThermoDocumentation2.hyperlink1_action}"
                            binding="#{Thermo$Documentation$ThermoDocumentation2.hyperlink13}" id="hyperlink13"
                            style="height: 24px; left: 240px; top: 504px; position: absolute; width: 552px" styleClass="body-text-hyperlink-box" target="_blank"
                            text="3.Conductivity og gases and liquids" url="/../neqsimweblog/thermodynamics/category/Conductivity"/>
                        <ui:hyperlink action="#{Thermo$Documentation$ThermoDocumentation2.hyperlink14_action}"
                            binding="#{Thermo$Documentation$ThermoDocumentation2.hyperlink14}" id="hyperlink14"
                            style="height: 24px; left: 240px; top: 384px; position: absolute; width: 552px" styleClass="body-text-hyperlink-box" target="_blank"
                            text="10. Trace components (mercury, sulfur,other)" url="/../neqsimweblog/thermodynamics/category/Trace+components"/>
                        <ui:hyperlink action="#{Thermo$Documentation$ThermoDocumentation2.hyperlink1_action}" id="hyperlink15"
                            style="height: 24px; left: 240px; top: 528px; position: absolute; width: 552px" styleClass="body-text-hyperlink-box" target="_blank"
                            text="4.Surface/Inerfacial tension" url="/../neqsimweblog/thermodynamics/category/Interfacial+tension"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
