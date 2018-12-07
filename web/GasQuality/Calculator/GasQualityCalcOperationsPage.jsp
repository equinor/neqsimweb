<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{GasQuality$Calculator$GasQualityCalcOperationsPage.page1}" id="page1">
            <ui:html binding="#{GasQuality$Calculator$GasQualityCalcOperationsPage.html1}" id="html1">
                <ui:head binding="#{GasQuality$Calculator$GasQualityCalcOperationsPage.head1}" id="head1">
                    <ui:link binding="#{GasQuality$Calculator$GasQualityCalcOperationsPage.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{GasQuality$Calculator$GasQualityCalcOperationsPage.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{GasQuality$Calculator$GasQualityCalcOperationsPage.form1}" id="form1">
                        <h:graphicImage binding="#{GasQuality$Calculator$GasQualityCalcOperationsPage.image1}" height="192" id="image1"
                            style="left: 24px; top: 24px; position: absolute" value="/resources/neqsim_logo.jpg" width="192"/>
                        <h:commandLink action="#{GasQuality$Calculator$GasQualityCalcOperationsPage.gergWaterAction1_action}"
                            binding="#{GasQuality$Calculator$GasQualityCalcOperationsPage.gergWaterAction1}" id="gergWaterAction1" style="height: 24px; left: 240px; top: 120px; position: absolute; width: 238px">
                            <h:outputText binding="#{GasQuality$Calculator$GasQualityCalcOperationsPage.linkAction1Text1}" id="linkAction1Text1" value="GERG-water (ISO  18453)"/>
                        </h:commandLink>
                        <h:commandLink action="#{GasQuality$Calculator$GasQualityCalcOperationsPage.iso6976Action_action}"
                            binding="#{GasQuality$Calculator$GasQualityCalcOperationsPage.iso6976Action1}" id="iso6976Action1" style="height: 24px; left: 240px; top: 96px; position: absolute; width: 238px">
                            <h:outputText binding="#{GasQuality$Calculator$GasQualityCalcOperationsPage.linkAction1Text2}" id="linkAction1Text2" value="Energy and density (ISO6976)"/>
                        </h:commandLink>
                        <div style="height: 192px; left: 24px; top: 384px; position: absolute; width: 192px">
                            <jsp:directive.include file="GasQualityCalcRightMenu2.jspf"/>
                        </div>
                        <ui:imageHyperlink action="#{GasQuality$Calculator$GasQualityCalcOperationsPage.imageHyperlink1_action}"
                            binding="#{GasQuality$Calculator$GasQualityCalcOperationsPage.imageHyperlink1}" height="24" id="imageHyperlink1"
                            style="left: 480px; top: 96px; position: absolute" text="Open ISO-standard" width="216"/>
                        <ui:imageHyperlink action="#{GasQuality$Calculator$GasQualityCalcOperationsPage.imageHyperlink2_action}"
                            binding="#{GasQuality$Calculator$GasQualityCalcOperationsPage.imageHyperlink2}" height="24" id="imageHyperlink2"
                            style="left: 480px; top: 120px; position: absolute" text="Open ISO-standard" width="216"/>
                        <div style="position: absolute; left: 24px; top: 216px; width: 216px; height: 144px">
                            <jsp:directive.include file="../GasQualityMenu.jspf"/>
                        </div>
                        <h:commandLink binding="#{GasQuality$Calculator$GasQualityCalcOperationsPage.agaAction2}" id="agaAction2" style="height: 24px; left: 240px; top: 144px; position: absolute; width: 238px">
                            <h:outputText binding="#{GasQuality$Calculator$GasQualityCalcOperationsPage.linkAction1Text3}" id="linkAction1Text3" value="AGA-8 gas density (ISO 12213-2)"/>
                        </h:commandLink>
                        <ui:imageHyperlink action="#{GasQuality$Calculator$GasQualityCalcOperationsPage.imageHyperlink3_action}"
                            binding="#{GasQuality$Calculator$GasQualityCalcOperationsPage.imageHyperlink3}" height="24" id="imageHyperlink3"
                            style="left: 480px; top: 144px; position: absolute" text="Open ISO-standard" width="216"/>
                        <h:commandLink binding="#{GasQuality$Calculator$GasQualityCalcOperationsPage.sgergAction3}" id="sgergAction3" style="height: 24px; left: 240px; top: 168px; position: absolute; width: 238px">
                            <h:outputText binding="#{GasQuality$Calculator$GasQualityCalcOperationsPage.linkAction1Text4}" id="linkAction1Text4" value="sGERG gas density (ISO 12213-3)"/>
                        </h:commandLink>
                        <ui:imageHyperlink action="#{GasQuality$Calculator$GasQualityCalcOperationsPage.imageHyperlink4_action}"
                            binding="#{GasQuality$Calculator$GasQualityCalcOperationsPage.imageHyperlink4}" height="24" id="imageHyperlink4"
                            style="left: 480px; top: 168px; position: absolute" text="Open ISO-standard" width="216"/>
                        <ui:staticText binding="#{GasQuality$Calculator$GasQualityCalcOperationsPage.staticText1}" id="staticText1"
                            style="font-weight: bold; height: 24px; left: 240px; top: 72px; position: absolute; width: 336px" text="Accepted ISO-standards"/>
                        <ui:staticText binding="#{GasQuality$Calculator$GasQualityCalcOperationsPage.staticText2}" id="staticText2"
                            style="font-weight: bold; height: 24px; left: 240px; top: 216px; position: absolute; width: 336px" text=" ISO-drafts"/>
                        <ui:imageHyperlink action="#{GasQuality$Calculator$GasQualityCalcOperationsPage.imageHyperlink5_action}"
                            binding="#{GasQuality$Calculator$GasQualityCalcOperationsPage.imageHyperlink5}" height="24" id="imageHyperlink5"
                            style="left: 480px; top: 240px; position: absolute" text="Open ISO-standard" width="216"/>
                        <h:commandLink action="#{GasQuality$Calculator$GasQualityCalcOperationsPage.gerg2004Action_action}"
                            binding="#{GasQuality$Calculator$GasQualityCalcOperationsPage.gerg2004Action}" id="gerg2004Action" style="height: 24px; left: 240px; top: 240px; position: absolute; width: 238px">
                            <h:outputText binding="#{GasQuality$Calculator$GasQualityCalcOperationsPage.linkAction1Text5}" id="linkAction1Text5" value="GERG-2004 reference EOS"/>
                        </h:commandLink>
                        <ui:staticText binding="#{GasQuality$Calculator$GasQualityCalcOperationsPage.staticText3}" id="staticText3"
                            style="font-weight: bold; height: 24px; left: 240px; top: 288px; position: absolute; width: 336px" text="Compoare to entry point gas quality specifiaction"/>
                        <h:commandLink action="#{GasQuality$Calculator$GasQualityCalcOperationsPage.salesAgreement_action}"
                            binding="#{GasQuality$Calculator$GasQualityCalcOperationsPage.salesAgreement}" id="salesAgreement" style="height: 24px; left: 240px; top: 312px; position: absolute; width: 238px">
                            <h:outputText binding="#{GasQuality$Calculator$GasQualityCalcOperationsPage.linkAction1Text6}" id="linkAction1Text6" value="Select entry point"/>
                        </h:commandLink>
                        <ui:imageHyperlink action="#{GasQuality$Calculator$GasQualityCalcOperationsPage.imageHyperlink6_action}"
                            binding="#{GasQuality$Calculator$GasQualityCalcOperationsPage.imageHyperlink6}" height="24" id="imageHyperlink6"
                            style="left: 480px; top: 312px; position: absolute" text="View sales agreement" width="216"/>
                        <h:outputText id="outputText1" style="left: 240px; top: 24px; position: absolute" styleClass="title1" title="title1" value="Gas Quality Calculations"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
