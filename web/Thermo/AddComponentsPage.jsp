<?xml version="1.0" encoding="windows-1252"?>
<!--
    Document   : AddComponentsPage2
    Created on : 05.jan.2008, 21:24:15
    Author     : ESOL
-->
<jsp:root version="1.2" xmlns:bp="http://java.sun.com/blueprints/ui/14" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html"
    xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=windows-1252" pageEncoding="windows-1252"/>
    <f:view>
        <ui:page binding="#{Thermo$AddComponentsPage.page1}" id="page1">
            <ui:html binding="#{Thermo$AddComponentsPage.html1}" id="html1">
                <ui:head binding="#{Thermo$AddComponentsPage.head1}" id="head1">
                    <ui:link binding="#{Thermo$AddComponentsPage.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{Thermo$AddComponentsPage.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{Thermo$AddComponentsPage.form1}" id="form1">
                        <h:graphicImage binding="#{Thermo$AddComponentsPage.imageNeqSIm1}" height="192" id="imageNeqSIm1"
                            style="left: 24px; top: 24px; position: absolute" value="/resources/neqsim_logo.jpg" width="192"/>
                        <ui:message binding="#{Thermo$AddComponentsPage.message1}" for="SO4minusMinusTextField1" id="message1" showDetail="false"
                            showSummary="true" style="left: 1944px; top: 1008px; position: absolute; width: 142px"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.molarMassC10TextField1}" id="molarMassC10TextField1" required="true"
                            style="height: 24px; left: 1248px; top: 480px; position: absolute; width: 144px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C10MOLARMASS']}"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.fluidTextField1}" id="fluidTextField1"
                            style="height: 24px; left: 816px; top: 96px; position: absolute; width: 168px" tabindex="3" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.FIELD']}"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.methanolTextID1}" id="methanolTextID1"
                            style="font-size: 14px; height: 24px; left: 1680px; top: 408px; position: absolute; width: 166px" value="methanol"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.caplusplusTextField1}" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="caplusplusTextField1" required="true" style="height: 24px; left: 1848px; top: 840px; position: absolute; width: 96px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.CAPLUS']}"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.mdeaTextID1}" id="mdeaTextID1"
                            style="font-size: 14px; height: 24px; left: 1680px; top: 576px; position: absolute; width: 166px" value="MDEA"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.componentTextID1}" id="componentTextID1"
                            style="font-size: 14px; height: 24px; left: 624px; top: 648px; position: absolute; width: 142px" value="o-Xylene"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.outputText1}" id="outputText1"
                            style="font-size: 12px; height: 24px; left: 240px; top: 96px; position: absolute; width: 46px" value="Well/System"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.c8TextField1}" id="c8TextField1" required="true"
                            style="height: 24px; left: 1152px; top: 432px; position: absolute; width: 96px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C8']}"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.hexaneTextID1}" id="hexaneTextID1"
                            style="font-size: 14px; height: 24px; left: 240px; top: 960px; position: absolute; width: 240px" value="n-hexane"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.c13TextID1}" id="c13TextID1"
                            style="font-size: 14px; height: 24px; left: 1008px; top: 552px; position: absolute; width: 142px" value="PC_8"/>
                        <ui:message binding="#{Thermo$AddComponentsPage.message2}" for="piperazineTextField1" id="message2" showDetail="false"
                            showSummary="true" style="left: 1944px; top: 600px; position: absolute; width: 142px"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.ibutaneTextField1}" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="ibutaneTextField1" required="true" style="height: 24px; left: 384px; top: 696px; position: absolute; width: 96px" tabindex="13" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.IBUTANE']}"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.feTextID1}" id="feTextID1"
                            style="font-size: 14px; height: 24px; left: 1680px; top: 912px; position: absolute; width: 166px" value="Fe++"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.ohTextID1}" id="ohTextID1"
                            style="font-size: 14px; height: 24px; left: 1680px; top: 1056px; position: absolute; width: 166px" value="OH-"/>
                        <ui:message binding="#{Thermo$AddComponentsPage.message3}" for="co3MinusTextField1" id="message3" showDetail="false" showSummary="true" style="left: 1944px; top: 1104px; position: absolute; width: 142px"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.degTextField1}" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="degTextField1" required="true" style="height: 24px; left: 1848px; top: 480px; position: absolute; width: 96px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.DEG']}"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.megTextID1}" id="megTextID1"
                            style="font-size: 14px; height: 24px; left: 1680px; top: 456px; position: absolute; width: 166px" value="MEG"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.clMinusTextField1}" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="clMinusTextField1" required="true" style="height: 24px; left: 1848px; top: 960px; position: absolute; width: 96px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.CLMINUS']}"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.h2sTextField1}" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="h2sTextField1" required="true" style="height: 24px; left: 384px; top: 408px; position: absolute; width: 96px" tabindex="8" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.H2S']}"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.wellTextField1}" id="wellTextField1"
                            style="height: 24px; left: 312px; top: 96px; position: absolute; width: 168px" tabindex="2" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.WELL']}"/>
                        <ui:message binding="#{Thermo$AddComponentsPage.message4}" for="megTextField1" id="message4" showDetail="false" showSummary="true" style="left: 1944px; top: 456px; position: absolute; width: 142px"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.waterTextID1}" id="waterTextID1"
                            style="font-size: 14px; height: 24px; left: 1680px; top: 384px; position: absolute; width: 166px" value="water"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.polarComponentName1}" id="polarComponentName1"
                            style="font-size: 14px; font-weight: bold; height: 24px; left: 1680px; top: 360px; position: absolute; width: 166px" value="Polar components"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.acidsName1}" id="acidsName1"
                            style="font-size: 14px; font-weight: bold; height: 24px; left: 1680px; top: 648px; position: absolute; width: 166px" value="Acids"/>
                        <ui:message binding="#{Thermo$AddComponentsPage.message5}" for="c8TextField1" id="message5" showDetail="false" showSummary="true" style="left: 1536px; top: 432px; position: absolute; width: 142px"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.waterTextField1}" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="waterTextField1" required="true" style="height: 24px; left: 1848px; top: 384px; position: absolute; width: 96px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.WATER']}"/>
                        <ui:message binding="#{Thermo$AddComponentsPage.message6}" for="oxyleneTextField1" id="message6" showDetail="false" showSummary="true" style="height: 24px; left: 864px; top: 648px; position: absolute; width: 142px"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.nbutaneTextID1}" id="nbutaneTextID1"
                            style="font-size: 14px; height: 24px; left: 240px; top: 720px; position: absolute; width: 240px" value="n-butane"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.carbonDioxideTextField1}" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="carbonDioxideTextField1" onchange="" required="true"
                            style="height: 24px; left: 384px; top: 384px; position: absolute; width: 96px" tabindex="7" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.CO2']}"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.carbondioxTextID1}" id="carbondioxTextID1"
                            style="font-size: 14px; height: 24px; left: 240px; top: 384px; position: absolute; width: 142px" value="CO2"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.testTextField1}" id="testTextField1"
                            style="height: 24px; left: 816px; top: 144px; position: absolute; width: 168px" tabindex="5" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.TEXT']}"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.ohMinusTexField1}" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="ohMinusTexField1" required="true" style="height: 24px; left: 1848px; top: 1056px; position: absolute; width: 96px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.OHMINUS']}"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.testTextField2}" id="testTextField2"
                            style="height: 24px; left: 552px; top: 96px; position: absolute; width: 168px" tabindex="3" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.TEST']}"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.clTextID1}" id="clTextID1"
                            style="font-size: 14px; height: 24px; left: 1680px; top: 960px; position: absolute; width: 166px" value="Cl-"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.componentTextID2}" id="componentTextID2"
                            style="font-size: 14px; height: 24px; left: 624px; top: 456px; position: absolute; width: 142px" value="n-heptane"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.clTextID2}" id="clTextID2"
                            style="font-size: 14px; height: 24px; left: 1680px; top: 1104px; position: absolute; width: 166px" value="CO3--"/>
                        <ui:message binding="#{Thermo$AddComponentsPage.message7}" for="benzeneTextField1" id="message7" showDetail="false" showSummary="true" style="left: 864px; top: 432px; position: absolute; width: 142px"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.c11TextField1}" id="c11TextField1" required="true"
                            style="height: 24px; left: 1152px; top: 504px; position: absolute; width: 96px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C11']}"/>
                        <ui:message binding="#{Thermo$AddComponentsPage.message8}" for="ohMinusTexField1" id="message8" showDetail="false" showSummary="true" style="left: 1944px; top: 1056px; position: absolute; width: 142px"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.tegTextID1}" id="tegTextID1"
                            style="font-size: 14px; height: 24px; left: 1680px; top: 504px; position: absolute; width: 166px" value="TEG"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.propionicAcidTextField1}" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="propionicAcidTextField1" required="true" style="height: 24px; left: 1848px; top: 696px; position: absolute; width: 96px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.PROPIONICACID']}"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.megTextField1}" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="megTextField1" required="true" style="height: 24px; left: 1848px; top: 456px; position: absolute; width: 96px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.MEG']}"/>
                        <ui:message binding="#{Thermo$AddComponentsPage.message9}" for="aceticAcidTextField1" id="message9" showDetail="false"
                            showSummary="true" style="left: 1944px; top: 672px; position: absolute; width: 142px"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.c12TextID1}" id="c12TextID1"
                            style="font-size: 14px; height: 24px; left: 1008px; top: 528px; position: absolute; width: 142px" value="PC_7"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.c10TextID1}" id="c10TextID1"
                            style="font-size: 14px; height: 24px; left: 1008px; top: 480px; position: absolute; width: 142px" value="PC_5"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.aceticAcidTextField1}" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="aceticAcidTextField1" required="true" style="height: 24px; left: 1848px; top: 672px; position: absolute; width: 96px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.ACETICACID']}"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.c9TextID1}" id="c9TextID1"
                            style="font-size: 14px; height: 24px; left: 1008px; top: 456px; position: absolute; width: 142px" value="PC_4"/>
                        <ui:message binding="#{Thermo$AddComponentsPage.message10}" for="nbutaneTextField1" id="message10" showDetail="false" showSummary="true" style="left: 480px; top: 720px; position: absolute; width: 142px"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.aminesName1}" id="aminesName1"
                            style="font-size: 14px; font-weight: bold; height: 24px; left: 1680px; top: 552px; position: absolute; width: 166px" value="Alkanol amines"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.componentTextID3}" id="componentTextID3"
                            style="font-size: 14px; height: 24px; left: 624px; top: 432px; position: absolute; width: 142px" value="benzene"/>
                        <ui:message binding="#{Thermo$AddComponentsPage.message11}" for="ethaneTextField1" id="message11" showDetail="false" showSummary="true" style="left: 480px; top: 624px; position: absolute; width: 142px"/>
                        <ui:textField binding="#{Thermo$AddComponentsPage.ndecaneTextField1}" columns="10"
                            converter="#{Thermo$AddComponentsPage.doubleConverter1}" id="ndecaneTextField1" required="true"
                            style="height: 24px; left: 768px; top: 696px; position: absolute; width: 96px" text="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.NDECANE']}"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.c6TextID1}" id="c6TextID1"
                            style="font-size: 14px; height: 24px; left: 1008px; top: 384px; position: absolute; width: 142px" value="PC_1"/>
                        <ui:message binding="#{Thermo$AddComponentsPage.message12}" for="c7TextField1" id="message12" showDetail="false" showSummary="true" style="left: 1536px; top: 408px; position: absolute; width: 142px"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.standardCompText1}" id="standardCompText1"
                            style="font-size: 14px; font-weight: bold; height: 26px; left: 240px; top: 360px; position: absolute; width: 190px" value="Standard gases"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.densityC8TextField1}" id="densityC8TextField1" required="true"
                            style="height: 24px; left: 1392px; top: 432px; position: absolute; width: 144px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C8DENSITY']}"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.densityC12TextField1}" id="densityC12TextField1" required="true"
                            style="height: 24px; left: 1392px; top: 528px; position: absolute; width: 144px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C12DENSITY']}"/>
                        <ui:textField binding="#{Thermo$AddComponentsPage.benzeneTextField1}" columns="10"
                            converter="#{Thermo$AddComponentsPage.doubleConverter1}" id="benzeneTextField1" required="true"
                            style="height: 24px; left: 768px; top: 432px; position: absolute; width: 96px" text="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.BENZENE']}"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.molarMassC13TextField1}" id="molarMassC13TextField1" required="true"
                            style="height: 24px; left: 1248px; top: 552px; position: absolute; width: 144px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C13MOLARMASS']}"/>
                        <ui:message binding="#{Thermo$AddComponentsPage.message13}" for="noctaneTextField1" id="message13" showDetail="false" showSummary="true" style="left: 864px; top: 528px; position: absolute; width: 142px"/>
                        <ui:message binding="#{Thermo$AddComponentsPage.message14}" for="feplusplusTextField1" id="message14" showDetail="false"
                            showSummary="true" style="left: 1944px; top: 912px; position: absolute; width: 142px"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.nbutaneTextField1}" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="nbutaneTextField1" required="true" style="height: 24px; left: 384px; top: 720px; position: absolute; width: 96px" tabindex="14" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.NBUTANE']}"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.SO4TextID1}" id="SO4TextID1"
                            style="font-size: 14px; height: 24px; left: 1680px; top: 1008px; position: absolute; width: 166px" value="SO4--"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.slatsName1}" id="slatsName1"
                            style="font-size: 14px; font-weight: bold; height: 24px; left: 1680px; top: 744px; position: absolute; width: 166px" value="Ions"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.co3MinusTextField1}" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="co3MinusTextField1" required="true" style="height: 24px; left: 1848px; top: 1104px; position: absolute; width: 96px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.CO3MINUS']}"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.methanolTextField1}" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="methanolTextField1" required="true" style="height: 24px; left: 1848px; top: 408px; position: absolute; width: 96px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.METHANOL']}"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.ibutaneTextID1}" id="ibutaneTextID1"
                            style="font-size: 14px; height: 24px; left: 240px; top: 696px; position: absolute; width: 142px" value="i-butane"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.propaneTextID1}" id="propaneTextID1"
                            style="font-size: 14px; height: 24px; left: 240px; top: 648px; position: absolute; width: 240px" value="propane"/>
                        <ui:message binding="#{Thermo$AddComponentsPage.message15}" for="methanolTextField1" id="message15" showDetail="false"
                            showSummary="true" style="left: 1944px; top: 408px; position: absolute; width: 142px"/>
                        <h:inputTextarea binding="#{Thermo$AddComponentsPage.historyTextArea1}" id="historyTextArea1"
                            style="height: 120px; left: 312px; top: 192px; position: absolute; width: 408px" tabindex="6"
                            value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.HISTORY']}" valueChangeListener="#{Thermo$AddComponentsPage.historyTextArea_processValueChange}"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.componentTextID4}" id="componentTextID4"
                            style="font-size: 14px; height: 24px; left: 624px; top: 600px; position: absolute; width: 142px" value="m-Xylene"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.componentTextID5}" id="componentTextID5"
                            style="font-size: 14px; height: 24px; left: 624px; top: 624px; position: absolute; width: 142px" value="p-Xylene"/>
                        <ui:textField binding="#{Thermo$AddComponentsPage.oxyleneTextField1}" columns="10"
                            converter="#{Thermo$AddComponentsPage.doubleConverter1}" id="oxyleneTextField1" required="true"
                            style="height: 24px; left: 768px; top: 648px; position: absolute; width: 96px" text="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.OXYLENE']}"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.SO4minusMinusTextField1}" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="SO4minusMinusTextField1" required="true" style="height: 24px; left: 1848px; top: 1008px; position: absolute; width: 96px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.SO4MINUS']}"/>
                        <ui:message binding="#{Thermo$AddComponentsPage.message16}" for="clMinusTextField1" id="message16" showDetail="false" showSummary="true" style="left: 1944px; top: 960px; position: absolute; width: 142px"/>
                        <ui:message binding="#{Thermo$AddComponentsPage.message17}" for="propionicAcidTextField1" id="message17" showDetail="false"
                            showSummary="true" style="left: 1944px; top: 696px; position: absolute; width: 142px"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.densityC10TextField1}" id="densityC10TextField1" required="true"
                            style="height: 24px; left: 1392px; top: 480px; position: absolute; width: 144px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C10DENSITY']}"/>
                        <ui:staticText binding="#{Thermo$AddComponentsPage.staticText3}" id="staticText3"
                            style="font-size: 14px;left: 624px; top: 408px; position: absolute; width: 142px" text="cyclo-hexane"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.outputText2}" id="outputText2"
                            style="font-size: 12px; height: 24px; left: 744px; top: 144px; position: absolute; width: 46px" value="Text"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.densityC9TextField1}" id="densityC9TextField1" required="true"
                            style="height: 24px; left: 1392px; top: 456px; position: absolute; width: 144px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C9DENSITY']}"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.tegTextField1}" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="tegTextField1" required="true" style="height: 24px; left: 1848px; top: 504px; position: absolute; width: 96px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.TEG']}"/>
                        <ui:message binding="#{Thermo$AddComponentsPage.message18}" for="c6TextField1" id="message18" showDetail="false" showSummary="true" style="left: 1536px; top: 384px; position: absolute; width: 142px"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.densityC11TextField1}" id="densityC11TextField1" required="true"
                            style="height: 24px; left: 1392px; top: 504px; position: absolute; width: 144px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C11DENSITY']}"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.molprsectext1}" id="molprsectext1"
                            style="font-size: 14px; height: 24px; left: 1152px; top: 360px; position: absolute; width: 96px" value="rate [mol/sec]"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.pentaneTextID1}" id="pentaneTextID1"
                            style="font-size: 14px; height: 24px; left: 240px; top: 816px; position: absolute; width: 240px" value="n-pentane"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.densitytext1}" id="densitytext1"
                            style="font-size: 14px; height: 24px; left: 1392px; top: 360px; position: absolute; width: 142px" value="density [gr/cm^3]"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.c13TextField1}" id="c13TextField1" required="true"
                            style="height: 24px; left: 1152px; top: 552px; position: absolute; width: 96px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C13']}"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.piperazineTextField1}" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="piperazineTextField1" required="true" style="height: 24px; left: 1848px; top: 600px; position: absolute; width: 96px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.PIPERAZINE']}"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.componentTextID6}" id="componentTextID6"
                            style="font-size: 14px; height: 24px; left: 624px; top: 504px; position: absolute; width: 142px" value="toluene"/>
                        <ui:message binding="#{Thermo$AddComponentsPage.message19}" for="naplusTextField1" id="message19" showDetail="false" showSummary="true" style="left: 1944px; top: 768px; position: absolute; width: 142px"/>
                        <ui:textField binding="#{Thermo$AddComponentsPage.mxyleneTextField1}" columns="10"
                            converter="#{Thermo$AddComponentsPage.doubleConverter1}" id="mxyleneTextField1" required="true"
                            style="height: 24px; left: 768px; top: 600px; position: absolute; width: 96px" text="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.MXYLENE']}"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.componentTextID7}" id="componentTextID7"
                            style="font-size: 14px; height: 24px; left: 240px; top: 408px; position: absolute; width: 142px" value="H2S"/>
                        <ui:message binding="#{Thermo$AddComponentsPage.message20}" for="waterTextField1" id="message20" showDetail="false" showSummary="true" style="left: 1944px; top: 384px; position: absolute; width: 142px"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.molarMassC8TextField1}" id="molarMassC8TextField1" required="true"
                            style="height: 24px; left: 1248px; top: 432px; position: absolute; width: 144px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C8MOLARMASS']}"/>
                        <ui:message binding="#{Thermo$AddComponentsPage.message21}" for="c12TextField1" id="message21" showDetail="false" showSummary="true" style="left: 1536px; top: 528px; position: absolute; width: 142px"/>
                        <ui:message binding="#{Thermo$AddComponentsPage.message22}" for="nnonaneTextField1" id="message22" showDetail="false" showSummary="true" style="left: 864px; top: 672px; position: absolute; width: 142px"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.pentaneTextField1}" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="pentaneTextField1" required="true" style="height: 24px; left: 384px; top: 816px; position: absolute; width: 96px" tabindex="16" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.PENTANE']}"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.propaneTextField1}" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="propaneTextField1" required="true" style="height: 24px; left: 384px; top: 648px; position: absolute; width: 96px" tabindex="13" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.PROPANE']}"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.molarMassC9TextField1}" id="molarMassC9TextField1" required="true"
                            style="height: 24px; left: 1248px; top: 456px; position: absolute; width: 144px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C9MOLARMASS']}"/>
                        <ui:message binding="#{Thermo$AddComponentsPage.message23}" for="c13TextField1" id="message23" showDetail="false" showSummary="true" style="left: 1536px; top: 552px; position: absolute; width: 142px"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.c12TextField1}" id="c12TextField1" required="true"
                            style="height: 24px; left: 1152px; top: 528px; position: absolute; width: 96px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C12']}"/>
                        <ui:message binding="#{Thermo$AddComponentsPage.message24}" for="c11TextField1" id="message24" showDetail="false" showSummary="true" style="left: 1536px; top: 480px; position: absolute; width: 142px"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.sampleTextField1}" id="sampleTextField1"
                            style="height: 24px; left: 312px; top: 144px; position: absolute; width: 408px" tabindex="4" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.SAMPLE']}"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.molprsectext2}" id="molprsectext2"
                            style="font-size: 14px; height: 26px; left: 384px; top: 360px; position: absolute; width: 144px" value="rate [mol/sec]"/>
                        <ui:message binding="#{Thermo$AddComponentsPage.message25}" for="ibutaneTextField1" id="message25" showDetail="false" showSummary="true" style="left: 480px; top: 696px; position: absolute; width: 142px"/>
                        <ui:textField binding="#{Thermo$AddComponentsPage.noctaneTextField1}" columns="10"
                            converter="#{Thermo$AddComponentsPage.doubleConverter1}" id="noctaneTextField1" required="true"
                            style="height: 24px; left: 768px; top: 528px; position: absolute; width: 96px" text="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.NOCTANE']}"/>
                        <ui:textField binding="#{Thermo$AddComponentsPage.nheptaneTextField1}" columns="10"
                            converter="#{Thermo$AddComponentsPage.doubleConverter1}" id="nheptaneTextField1" required="true"
                            style="height: 24px; left: 768px; top: 456px; position: absolute; width: 96px" text="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.NHEPTANE']}"/>
                        <ui:message binding="#{Thermo$AddComponentsPage.message26}" for="degTextField1" id="message26" showDetail="false" showSummary="true" style="left: 1944px; top: 480px; position: absolute; width: 142px"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.outputText3}" id="outputText3"
                            style="font-size: 12px; height: 24px; left: 240px; top: 192px; position: absolute; width: 46px" value="History"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.feplusplusTextField1}" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="feplusplusTextField1" required="true" style="height: 24px; left: 1848px; top: 912px; position: absolute; width: 96px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.FEPLUS']}"/>
                        <ui:message binding="#{Thermo$AddComponentsPage.message27}" for="h2sTextField1" id="message27" showDetail="false" showSummary="true" style="left: 480px; top: 408px; position: absolute; width: 142px"/>
                        <ui:message binding="#{Thermo$AddComponentsPage.message28}" for="pxyleneTextField1" id="message28" showDetail="false" showSummary="true" style="height: 24px; left: 864px; top: 624px; position: absolute; width: 142px"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.mdeaTextField1}" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="mdeaTextField1" required="true" style="height: 24px; left: 1848px; top: 576px; position: absolute; width: 96px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.MDEA']}"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.molarMassC12TextField1}" id="molarMassC12TextField1" required="true"
                            style="height: 24px; left: 1248px; top: 528px; position: absolute; width: 144px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C12MOLARMASS']}"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.armoathicHCText1}" id="armoathicHCText1"
                            style="font-size: 14px; font-weight: bold; height: 26px; left: 624px; top: 360px; position: absolute; width: 142px" value="C6+ hydrocarbons"/>
                        <ui:textField binding="#{Thermo$AddComponentsPage.cc6TextField1}" columns="10" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="cc6TextField1" required="true" style="height: 24px; left: 768px; top: 408px; position: absolute; width: 96px" text="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.CYCHEXANE']}"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.densityC13TextField1}" id="densityC13TextField1" required="true"
                            style="height: 24px; left: 1392px; top: 552px; position: absolute; width: 144px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C13DENSITY']}"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.molarMassC7TextField1}" id="molarMassC7TextField1" required="true"
                            style="height: 24px; left: 1248px; top: 408px; position: absolute; width: 144px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C7MOLARMASS']}"/>
                        <ui:message binding="#{Thermo$AddComponentsPage.message29}" for="methaneTextField1" id="message29" showDetail="false" showSummary="true" style="left: 480px; top: 600px; position: absolute; width: 142px"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.methaneTextID1}" id="methaneTextID1"
                            style="font-size: 14px; height: 24px; left: 240px; top: 600px; position: absolute; width: 240px" value="methane"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.aceticAcidTextID1}" id="aceticAcidTextID1"
                            style="font-size: 14px; height: 24px; left: 1680px; top: 672px; position: absolute; width: 166px" value="acetic aicd"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.naplusTextField1}" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="naplusTextField1" required="true" style="height: 24px; left: 1848px; top: 768px; position: absolute; width: 96px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.NAPLUS']}"/>
                        <ui:message binding="#{Thermo$AddComponentsPage.message30}" for="tegTextField1" id="message30" showDetail="false" showSummary="true" style="left: 1944px; top: 504px; position: absolute; width: 142px"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.c8TextID1}" id="c8TextID1"
                            style="font-size: 14px; height: 24px; left: 1008px; top: 432px; position: absolute; width: 142px" value="PC_3"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.testoutputText1}" id="testoutputText1"
                            style="font-size: 12px; height: 24px; left: 504px; top: 96px; position: absolute; width: 48px" value="Test"/>
                        <ui:message binding="#{Thermo$AddComponentsPage.message31}" for="mdeaTextField1" id="message31" showDetail="false" showSummary="true" style="left: 1944px; top: 576px; position: absolute; width: 142px"/>
                        <ui:staticText binding="#{Thermo$AddComponentsPage.staticText4}" id="staticText4"
                            style="font-size: 14px; left: 240px; top: 840px; position: absolute; width: 142px" text="cyclo-pentane"/>
                        <ui:message binding="#{Thermo$AddComponentsPage.message32}" for="hexaneTextField1" id="message32" showDetail="false" showSummary="true" style="left: 480px; top: 960px; position: absolute; width: 142px"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.molprsectext3}" id="molprsectext3"
                            style="font-size: 14px; height: 26px; left: 1848px; top: 360px; position: absolute; width: 144px" value="rate [mol/sec]"/>
                        <ui:message binding="#{Thermo$AddComponentsPage.message33}" for="mxyleneTextField1" id="message33" showDetail="false" showSummary="true" style="height: 24px; left: 864px; top: 600px; position: absolute; width: 142px"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.c11TextID1}" id="c11TextID1"
                            style="font-size: 14px; height: 24px; left: 1008px; top: 504px; position: absolute; width: 142px" value="PC_6"/>
                        <ui:textField binding="#{Thermo$AddComponentsPage.pxyleneTextField1}" columns="10"
                            converter="#{Thermo$AddComponentsPage.doubleConverter1}" id="pxyleneTextField1" required="true"
                            style="height: 24px; left: 768px; top: 624px; position: absolute; width: 96px" text="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.PXYLENE']}"/>
                        <ui:message binding="#{Thermo$AddComponentsPage.message34}" for="pentaneTextField1" id="message34" showDetail="false" showSummary="true" style="left: 480px; top: 816px; position: absolute; width: 142px"/>
                        <ui:message binding="#{Thermo$AddComponentsPage.message35}" for="nitrogenTextField1" id="message35" showDetail="false"
                            showSummary="true" style="left: 480px; top: 432px; position: absolute; width: 142px"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.degTextID1}" id="degTextID1"
                            style="font-size: 14px; height: 24px; left: 1680px; top: 480px; position: absolute; width: 166px" value="DEG"/>
                        <ui:message binding="#{Thermo$AddComponentsPage.message36}" for="propaneTextField1" id="message36" showDetail="false" showSummary="true" style="left: 480px; top: 648px; position: absolute; width: 142px"/>
                        <ui:message binding="#{Thermo$AddComponentsPage.message37}" for="c10TextField1" id="message37" showDetail="false" showSummary="true" style="left: 1536px; top: 504px; position: absolute; width: 142px"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.molarMassC11TextField1}" id="molarMassC11TextField1" required="true"
                            style="height: 24px; left: 1248px; top: 504px; position: absolute; width: 144px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C11MOLARMASS']}"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.ethaneTextField1}" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="ethaneTextField1" required="true" style="height: 24px; left: 384px; top: 624px; position: absolute; width: 96px" tabindex="11" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.ETHANE']}"/>
                        <ui:message binding="#{Thermo$AddComponentsPage.message38}" for="tolueneTextField1" id="message38" showDetail="false" showSummary="true" style="height: 24px; left: 864px; top: 504px; position: absolute; width: 142px"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.molmasstext1}" id="molmasstext1"
                            style="font-size: 14px; height: 24px; left: 1248px; top: 360px; position: absolute; width: 142px" value="molar mass [gr/mol]"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.nitrogenTextID1}" id="nitrogenTextID1"
                            style="font-size: 14px; height: 24px; left: 240px; top: 432px; position: absolute; width: 240px" value="nitrogen"/>
                        <ui:textField binding="#{Thermo$AddComponentsPage.cc5TextField1}" columns="10" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="cc5TextField1" required="true" style="height: 24px; left: 384px; top: 840px; position: absolute; width: 96px" text="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.CYCPENTANE']}"/>
                        <ui:message binding="#{Thermo$AddComponentsPage.message39}" for="caplusplusTextField1" id="message39" showDetail="false"
                            showSummary="true" style="left: 1944px; top: 840px; position: absolute; width: 142px"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.pzTextID1}" id="pzTextID1"
                            style="font-size: 14px; height: 24px; left: 1680px; top: 600px; position: absolute; width: 166px" value="Piperazine"/>
                        <ui:message binding="#{Thermo$AddComponentsPage.message41}" for="c9TextField1" id="message41" showDetail="false" showSummary="true" style="left: 1536px; top: 456px; position: absolute; width: 142px"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.c7TextID1}" id="c7TextID1"
                            style="font-size: 14px; height: 24px; left: 1008px; top: 408px; position: absolute; width: 142px" value="PC_2"/>
                        <ui:textField binding="#{Thermo$AddComponentsPage.nnonaneTextField1}" columns="10"
                            converter="#{Thermo$AddComponentsPage.doubleConverter1}" id="nnonaneTextField1" required="true"
                            style="height: 24px; left: 768px; top: 672px; position: absolute; width: 96px" text="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.NNONANE']}"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.c10TextField1}" id="c10TextField1" required="true"
                            style="height: 24px; left: 1152px; top: 480px; position: absolute; width: 96px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C10']}"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.outputText4}" id="outputText4"
                            style="font-size: 12px; height: 24px; left: 240px; top: 144px; position: absolute; width: 46px" value="Sample"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.nitrogenTextField1}" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="nitrogenTextField1" required="true" style="height: 24px; left: 384px; top: 432px; position: absolute; width: 96px" tabindex="9" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.NITROGEN']}"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.densityC7TextField1}" id="densityC7TextField1" required="true"
                            style="height: 24px; left: 1392px; top: 408px; position: absolute; width: 144px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C7DENSITY']}"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.hexaneTextField1}" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="hexaneTextField1" required="true" style="height: 24px; left: 384px; top: 960px; position: absolute; width: 96px" tabindex="17"
                            value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.NHEXANE']}" valueChangeListener="#{Thermo$AddComponentsPage.hexaneTextField_processValueChange}"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.heavyCompText1}" id="heavyCompText1"
                            style="font-size: 14px; font-weight: bold; height: 26px; left: 1008px; top: 360px; position: absolute; width: 142px" value="TBP fraction"/>
                        <ui:button action="#{Thermo$AddComponentsPage.open_action}" binding="#{Thermo$AddComponentsPage.open1}" disabled="true" id="open1"
                            style="font-size: 12px; height: 24px; left: 743px; top: 240px; position: absolute; width: 72px" text="Open/Add"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.densityC6TextField1}" id="densityC6TextField1" required="true"
                            style="height: 24px; left: 1392px; top: 384px; position: absolute; width: 144px"
                            value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C6DENSITY']}" valueChangeListener="#{Thermo$AddComponentsPage.densityC6TextField_processValueChange}"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.methaneTextField1}" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="methaneTextField1" required="true" style="height: 24px; left: 384px; top: 600px; position: absolute; width: 96px" tabindex="10" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.METHANE']}"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.molarMassC6TextField1}" id="molarMassC6TextField1" required="true"
                            style="height: 24px; left: 1248px; top: 384px; position: absolute; width: 144px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C6MOLARMASS']}"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.ethaneTextID1}" id="ethaneTextID1"
                            style="font-size: 14px; height: 24px; left: 240px; top: 624px; position: absolute; width: 142px" value="ethane"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.c9TextField1}" id="c9TextField1" required="true"
                            style="height: 24px; left: 1152px; top: 456px; position: absolute; width: 96px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C9']}"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.naTextID1}" id="naTextID1"
                            style="font-size: 14px; height: 24px; left: 1680px; top: 768px; position: absolute; width: 166px" value="Na+"/>
                        <ui:message binding="#{Thermo$AddComponentsPage.message42}" for="nheptaneTextField1" id="message42" showDetail="false"
                            showSummary="true" style="left: 864px; top: 456px; position: absolute; width: 142px"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.caTextID1}" id="caTextID1"
                            style="font-size: 14px; height: 24px; left: 1680px; top: 840px; position: absolute; width: 166px" value="Ca++"/>
                        <ui:textField binding="#{Thermo$AddComponentsPage.tolueneTextField1}" columns="10"
                            converter="#{Thermo$AddComponentsPage.doubleConverter1}" id="tolueneTextField1" required="true"
                            style="height: 24px; left: 768px; top: 504px; position: absolute; width: 96px" text="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.TOLUENE']}"/>
                        <ui:message binding="#{Thermo$AddComponentsPage.message43}" for="cc6TextField1" id="message43" showDetail="false" showSummary="true" style="left: 864px; top: 408px; position: absolute; width: 142px"/>
                        <ui:message binding="#{Thermo$AddComponentsPage.message44}" for="carbonDioxideTextField1" id="message44" showDetail="false"
                            showSummary="true" style="left: 480px; top: 384px; position: absolute; width: 142px"/>
                        <ui:message binding="#{Thermo$AddComponentsPage.message45}" for="ndecaneTextField1" id="message45" showDetail="false" showSummary="true" style="left: 864px; top: 696px; position: absolute; width: 142px"/>
                        <ui:message binding="#{Thermo$AddComponentsPage.message46}" for="cc5TextField1" id="message46" showDetail="false" showSummary="true" style="left: 480px; top: 840px; position: absolute; width: 142px"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.propionicAcidTextID1}" id="propionicAcidTextID1"
                            style="font-size: 14px; height: 24px; left: 1680px; top: 696px; position: absolute; width: 166px" value="propionic acid"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.outputText5}" id="outputText5"
                            style="font-size: 12px; height: 24px; left: 744px; top: 96px; position: absolute; width: 46px" value="Field/Plant"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.gergWaterMenuText1}" id="gergWaterMenuText1"
                            style="font-size: 18px; height: 24px; left: 240px; top: 24px; position: absolute; width: 336px" value="Add Components"/>
                        <div style="height: 96px; left: 24px; top: 216px; position: absolute; width: 168px">
                            <jsp:directive.include file="ThermoMenu.jspf"/>
                        </div>
                        <h:outputText binding="#{Thermo$AddComponentsPage.pentaneTextID2}" id="pentaneTextID2"
                            style="font-size: 14px; height: 24px; left: 240px; top: 792px; position: absolute; width: 142px" value="i-pentane"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.ipentaneTextField}" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="ipentaneTextField" required="true" style="height: 24px; left: 384px; top: 792px; position: absolute; width: 96px" tabindex="15" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.iPENTANE']}"/>
                        <ui:message binding="#{Thermo$AddComponentsPage.message47}" for="ipentaneTextField" id="message47" showDetail="false" showSummary="true" style="left: 480px; top: 792px; position: absolute; width: 142px"/>
                        <ui:button action="#{Thermo$AddComponentsPage.calculateButton_action}" binding="#{Thermo$AddComponentsPage.button1}" id="button1"
                            style="height: 24px; left: 743px; top: 288px; position: absolute; width: 72px" tabIndex="1" text="Ok"/>
                        <ui:staticText binding="#{Thermo$AddComponentsPage.staticText6}" id="staticText6"
                            style="font-size: 14px; height: 24px; left: 624px; top: 528px; position: absolute; width: 142px" text="n-octane"/>
                        <ui:staticText binding="#{Thermo$AddComponentsPage.staticText1}" id="staticText1"
                            style="font-size: 14px; height: 24px; left: 624px; top: 672px; position: absolute; width: 142px" text="n-nonane"/>
                        <ui:staticText binding="#{Thermo$AddComponentsPage.staticText2}" id="staticText2"
                            style="font-size: 14px; height: 24px; left: 624px; top: 696px; position: absolute; width: 142px" text="n-C10"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.c14TextID}" id="c14TextID"
                            style="font-size: 14px; height: 24px; left: 1008px; top: 576px; position: absolute; width: 142px" value="PC_9"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.c14TextField}" id="c14TextField" required="true"
                            style="height: 24px; left: 1152px; top: 576px; position: absolute; width: 96px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C14']}"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.molarMassC14TextField}" id="molarMassC14TextField" required="true"
                            style="height: 24px; left: 1248px; top: 576px; position: absolute; width: 144px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C14MOLARMASS']}"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.densityC14TextField}" id="densityC14TextField" required="true"
                            style="height: 24px; left: 1392px; top: 576px; position: absolute; width: 144px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C14DENSITY']}"/>
                        <ui:message binding="#{Thermo$AddComponentsPage.message40}" for="densityC14TextField2" id="message40" showDetail="false"
                            showSummary="true" style="left: 1536px; top: 576px; position: absolute; width: 142px"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.c15TextID}" id="c15TextID"
                            style="font-size: 14px; height: 24px; left: 1008px; top: 600px; position: absolute; width: 142px" value="PC_10"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.c15TextField}" id="c15TextField" required="true"
                            style="height: 24px; left: 1152px; top: 600px; position: absolute; width: 96px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C15']}"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.molarMassC15TextField}" id="molarMassC15TextField" required="true"
                            style="height: 24px; left: 1248px; top: 600px; position: absolute; width: 144px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C15MOLARMASS']}"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.densityC15TextField}" id="densityC15TextField" required="true"
                            style="height: 24px; left: 1392px; top: 600px; position: absolute; width: 144px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C15DENSITY']}"/>
                        <ui:message binding="#{Thermo$AddComponentsPage.message48}" for="densityC14TextField2" id="message48" showDetail="false"
                            showSummary="true" style="left: 1536px; top: 600px; position: absolute; width: 142px"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.c16TextID}" id="c16TextID"
                            style="font-size: 14px; height: 24px; left: 1008px; top: 624px; position: absolute; width: 142px" value="PC_11"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.c16TextField}" id="c16TextField" required="true"
                            style="height: 24px; left: 1152px; top: 624px; position: absolute; width: 96px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C16']}"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.molarMassC16TextField}" id="molarMassC16TextField" required="true"
                            style="height: 24px; left: 1248px; top: 624px; position: absolute; width: 144px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C16MOLARMASS']}"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.densityC16TextField}" id="densityC16TextField" required="true"
                            style="height: 24px; left: 1392px; top: 624px; position: absolute; width: 144px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C16DENSITY']}"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.c17TextID}" id="c17TextID"
                            style="font-size: 14px; height: 24px; left: 1008px; top: 648px; position: absolute; width: 142px" value="PC_12"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.c17TextField}" id="c17TextField" required="true"
                            style="height: 24px; left: 1152px; top: 648px; position: absolute; width: 96px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C17']}"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.molarMassC17TextField}" id="molarMassC17TextField" required="true"
                            style="height: 24px; left: 1248px; top: 648px; position: absolute; width: 144px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C17MOLARMASS']}"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.densityC17TextField}" id="densityC17TextField" required="true"
                            style="height: 24px; left: 1392px; top: 648px; position: absolute; width: 144px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C17DENSITY']}"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.c18TextID}" id="c18TextID"
                            style="font-size: 14px; height: 24px; left: 1008px; top: 672px; position: absolute; width: 142px" value="PC_13"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.c18TextField}" id="c18TextField" required="true"
                            style="height: 24px; left: 1152px; top: 672px; position: absolute; width: 96px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C18']}"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.molarMassC18TextField}" id="molarMassC18TextField" required="true"
                            style="height: 24px; left: 1248px; top: 672px; position: absolute; width: 144px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C18MOLARMASS']}"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.densityC18TextField}" id="densityC18TextField" required="true"
                            style="height: 24px; left: 1392px; top: 672px; position: absolute; width: 144px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C18DENSITY']}"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.c19TextID}" id="c19TextID"
                            style="font-size: 14px; height: 24px; left: 1008px; top: 696px; position: absolute; width: 142px" value="PC_14"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.c19TextField}" id="c19TextField" required="true"
                            style="height: 24px; left: 1152px; top: 696px; position: absolute; width: 96px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C19']}"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.molarMassC19TextField}" id="molarMassC19TextField" required="true"
                            style="height: 24px; left: 1248px; top: 696px; position: absolute; width: 144px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C19MOLARMASS']}"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.densityC19TextField}" id="densityC19TextField" required="true"
                            style="height: 24px; left: 1392px; top: 696px; position: absolute; width: 144px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C19DENSITY']}"/>
                        <h:outputText binding="#{Thermo$AddComponentsPage.c20TextID}" id="c20TextID"
                            style="font-size: 14px; height: 24px; left: 1008px; top: 720px; position: absolute; width: 142px" value="PC_15"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.c20TextField}" id="c20TextField" required="true"
                            style="height: 24px; left: 1152px; top: 720px; position: absolute; width: 96px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C20']}"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.molarMassC20TextField}" id="molarMassC20TextField" required="true"
                            style="height: 24px; left: 1248px; top: 720px; position: absolute; width: 144px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C20MOLARMASS']}"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.densityC20TextField}" id="densityC20TextField" required="true"
                            style="height: 24px; left: 1392px; top: 720px; position: absolute; width: 144px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C20DENSITY']}"/>
                        <ui:textField binding="#{Thermo$AddComponentsPage.c7TextField1}" id="c7TextField1"
                            style="height: 24px; left: 1152px; top: 408px; position: absolute; width: 96px" text="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C7']}"/>
                        <ui:textField binding="#{Thermo$AddComponentsPage.c6TextField1}" id="c6TextField1"
                            style="height: 24px; left: 1152px; top: 384px; position: absolute; width: 96px" text="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C6']}"/>
                        <h:outputText id="outputText6" style="font-size: 12px; height: 24px; left: 1008px; top: 96px; position: absolute; width: 118px" value="Sample date/time"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.kplusTextField}" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="kplusTextField" required="true" style="height: 24px; left: 1848px; top: 792px; position: absolute; width: 96px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.NAPLUS']}"/>
                        <h:outputText id="naTextID2" style="font-size: 14px; height: 24px; left: 1680px; top: 792px; position: absolute; width: 166px" value="K+"/>
                        <ui:message for="MG2plusTextField" id="message50" showDetail="false" showSummary="true" style="left: 1944px; top: 816px; position: absolute; width: 142px"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.MG2plusTextField}" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="MG2plusTextField" required="true" style="height: 24px; left: 1848px; top: 816px; position: absolute; width: 96px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.NAPLUS']}"/>
                        <h:outputText id="naTextID3" style="font-size: 14px; height: 24px; left: 1680px; top: 816px; position: absolute; width: 166px" value="Mg++"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.BAplusplusTextField}" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="BAplusplusTextField" required="true" style="height: 24px; left: 1848px; top: 864px; position: absolute; width: 96px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.CAPLUS']}"/>
                        <ui:message for="BAplusplusTextField" id="message51" showDetail="false" showSummary="true" style="left: 1944px; top: 864px; position: absolute; width: 142px"/>
                        <h:outputText id="caTextID2" style="font-size: 14px; height: 24px; left: 1680px; top: 864px; position: absolute; width: 166px" value="Ba++"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.SRlusplusTextField}" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="SRlusplusTextField" required="true" style="height: 24px; left: 1848px; top: 888px; position: absolute; width: 96px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.CAPLUS']}"/>
                        <ui:message for="SRlusplusTextField" id="message52" showDetail="false" showSummary="true" style="left: 1944px; top: 888px; position: absolute; width: 142px"/>
                        <h:outputText id="caTextID3" style="font-size: 14px; height: 24px; left: 1680px; top: 888px; position: absolute; width: 166px" value="Sr++"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.BRMinusTextField}" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="BRMinusTextField" required="true" style="height: 24px; left: 1848px; top: 984px; position: absolute; width: 96px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.CLMINUS']}"/>
                        <h:outputText id="clTextID3" style="font-size: 14px; height: 24px; left: 1680px; top: 984px; position: absolute; width: 166px" value="Br-"/>
                        <ui:message for="BRMinusTextField" id="message53" showDetail="false" showSummary="true" style="left: 1944px; top: 984px; position: absolute; width: 142px"/>
                        <h:outputText id="ohTextID2" style="font-size: 14px; height: 24px; left: 1680px; top: 1080px; position: absolute; width: 166px" value="HCO3-"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.HCO3MinusTexField}" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="HCO3MinusTexField" required="true" style="height: 24px; left: 1848px; top: 1080px; position: absolute; width: 96px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.OHMINUS']}"/>
                        <ui:message for="HCO3MinusTexField" id="message54" showDetail="false" showSummary="true" style="left: 1944px; top: 1080px; position: absolute; width: 142px"/>
                        <ui:calendar id="calendar1" style="position: absolute; left: 1128px; top: 96px"/>
                        <h:outputText id="ethanolTextID" style="font-size: 14px; height: 24px; left: 1680px; top: 432px; position: absolute; width: 166px" value="ethanol"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.ethanolTextField}" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="ethanolTextField" required="true" style="height: 24px; left: 1848px; top: 432px; position: absolute; width: 96px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.ETHANOL']}"/>
                        <ui:message for="ethanolTextField" id="message49" showDetail="false" showSummary="true" style="left: 1944px; top: 432px; position: absolute; width: 142px"/>
                        <h:commandLink action="#{Thermo$AddComponentsPage.linkAction2_action}" id="linkAction2" style="height: 24px; left: 1128px; top: 240px; position: absolute; width: 166px">
                            <h:outputText id="linkAction1Text2" value="View/add experimental data"/>
                        </h:commandLink>
                        <ui:hyperlink binding="#{Thermo$AddComponentsPage.helpHyperlink}" id="helpHyperlink"
                            style="height: 24px; left: 1128px; top: 288px; position: absolute; width: 168px" text="Help"/>
                        <ui:radioButtonGroup binding="#{Thermo$AddComponentsPage.fluidTypeRadioButtonGroup}" id="fluidTypeRadioButtonGroup"
                            items="#{Thermo$AddComponentsPage.fluidTypeRadioButtonGroupDefaultOptions.options}"
                            selected="#{Thermo$AddComponentsPage.fluidTypeRadioButtonGroupDefaultOptions.selectedValue}" style="height: 96px; left: 840px; top: 216px; position: absolute; width: 144px"/>
                        <h:outputText id="outputText7" style="font-size: 12px; height: 22px; left: 840px; top: 192px; position: absolute; width: 142px" value="Fluid type"/>
                        <h:commandLink action="#{Thermo$AddComponentsPage.linkAction1_action}" id="linkAction1" style="height: 24px; left: 1128px; top: 192px; position: absolute; width: 166px">
                            <h:outputText id="linkAction1Text1" value="View/add/fit PVT data"/>
                        </h:commandLink>
                        <h:outputText id="outputText8" style="font-size: 12px; height: 22px; left: 1008px; top: 192px; position: absolute; width: 118px" value="Include phase"/>
                        <ui:checkbox binding="#{Thermo$AddComponentsPage.waxCheckBox}" id="waxCheckBox" label="Wax" style="height: 24px; left: 1008px; top: 216px; position: absolute; width: 120px"/>
                        <h:outputText id="c20TextID1" style="font-size: 14px; height: 24px; left: 1008px; top: 744px; position: absolute; width: 142px" value="PC_16"/>
                        <h:outputText id="c20TextID2" style="font-size: 14px; height: 24px; left: 1008px; top: 768px; position: absolute; width: 142px" value="PC_17"/>
                        <h:outputText id="c20TextID3" style="font-size: 14px; height: 24px; left: 1008px; top: 792px; position: absolute; width: 142px" value="PC_18"/>
                        <h:outputText id="c20TextID4" style="font-size: 14px; height: 24px; left: 1008px; top: 816px; position: absolute; width: 142px" value="PC_19"/>
                        <h:outputText id="c20TextID5" style="font-size: 14px; height: 24px; left: 1008px; top: 840px; position: absolute; width: 142px" value="PC_20"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.c21TextField1}" id="c21TextField1" required="true"
                            style="height: 24px; left: 1152px; top: 744px; position: absolute; width: 96px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C21']}"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.c22TextField2}" id="c22TextField2" required="true"
                            style="height: 24px; left: 1152px; top: 768px; position: absolute; width: 96px"
                            value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C22']}" valueChangeListener="#{Thermo$AddComponentsPage.c22TextField2_processValueChange}"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.c23TextField3}" id="c23TextField3" required="true"
                            style="height: 24px; left: 1152px; top: 792px; position: absolute; width: 96px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C23']}"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.c24TextField4}" id="c24TextField4" required="true"
                            style="height: 24px; left: 1152px; top: 816px; position: absolute; width: 96px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C24']}"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.c25TextField5}" id="c25TextField5" required="true"
                            style="height: 24px; left: 1152px; top: 840px; position: absolute; width: 96px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C25']}"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.molarMassC21TextField1}" id="molarMassC21TextField1" required="true"
                            style="height: 24px; left: 1248px; top: 744px; position: absolute; width: 144px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C21MOLARMASS']}"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.molarMassC22TextField2}" id="molarMassC22TextField2" required="true"
                            style="height: 24px; left: 1248px; top: 768px; position: absolute; width: 144px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C22MOLARMASS']}"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.molarMassC23TextField3}" id="molarMassC23TextField3" required="true"
                            style="height: 24px; left: 1248px; top: 792px; position: absolute; width: 144px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C23MOLARMASS']}"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.molarMassC24TextField4}" id="molarMassC24TextField4" required="true"
                            style="height: 24px; left: 1248px; top: 816px; position: absolute; width: 144px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C24MOLARMASS']}"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.molarMassC25TextField5}" id="molarMassC25TextField5" required="true"
                            style="height: 24px; left: 1248px; top: 840px; position: absolute; width: 144px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C25MOLARMASS']}"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.densityC21TextField1}" id="densityC21TextField1" required="true"
                            style="height: 24px; left: 1392px; top: 744px; position: absolute; width: 144px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C21DENSITY']}"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.densityC22TextField2}" id="densityC22TextField2" required="true"
                            style="height: 24px; left: 1392px; top: 768px; position: absolute; width: 144px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C22DENSITY']}"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.densityC23TextField3}" id="densityC23TextField3" required="true"
                            style="height: 24px; left: 1392px; top: 792px; position: absolute; width: 144px"
                            value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C23DENSITY']}" valueChangeListener="#{Thermo$AddComponentsPage.densityC23TextField3_processValueChange}"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.densityC24TextField4}" id="densityC24TextField4" required="true"
                            style="height: 24px; left: 1392px; top: 816px; position: absolute; width: 144px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C24DENSITY']}"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.densityC25TextField5}" id="densityC25TextField5" required="true"
                            style="height: 24px; left: 1392px; top: 840px; position: absolute; width: 144px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.C25DENSITY']}"/>
                        <h:outputText id="mercuryTextID2" style="font-size: 14px; height: 24px; left: 240px; top: 528px; position: absolute; width: 142px" value="mercury"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.mercuryTextField2}" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="mercuryTextField2" required="true" style="height: 24px; left: 384px; top: 528px; position: absolute; width: 96px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.mercury']}"/>
                        <h:outputText id="nitrogenTextID2" style="font-size: 14px; height: 24px; left: 240px; top: 456px; position: absolute; width: 142px" value="hydrogen"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.hydrogenTextField}" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="hydrogenTextField" required="true" style="height: 24px; left: 384px; top: 456px; position: absolute; width: 96px" tabindex="9" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.hydrogen']}"/>
                        <h:outputText id="oxygenTextID" style="font-size: 14px; height: 24px; left: 240px; top: 480px; position: absolute; width: 142px" value="oxygen"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.oxygenTextField}" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="oxygenTextField" required="true" style="height: 24px; left: 384px; top: 480px; position: absolute; width: 96px" tabindex="9" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.oxygen']}"/>
                        <h:outputText id="mercuryTextID1" style="font-size: 14px; height: 24px; left: 240px; top: 504px; position: absolute; width: 142px" value="argon"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.argonTextField}" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="argonTextField" required="true" style="height: 24px; left: 384px; top: 504px; position: absolute; width: 96px" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.argon']}"/>
                        <h:outputText id="armoathicHCText2"
                            style="font-size: 14px; font-weight: bold; height: 26px; left: 240px; top: 576px; position: absolute; width: 142px" value="Light hydrocarbons"/>
                        <h:outputText id="cpropaneTextID" style="font-size: 14px; height: 22px; left: 240px; top: 672px; position: absolute; width: 142px" value="cyclo-propane"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.cpropaneTextField}" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="cpropaneTextField" required="true" style="height: 24px; left: 384px; top: 672px; position: absolute; width: 96px" tabindex="13" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.cpropane']}"/>
                        <h:outputText id="cbutaneTextID2" style="font-size: 14px; height: 22px; left: 240px; top: 768px; position: absolute; width: 142px" value="cyclo-butane"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.cbutaneTextField}" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="cbutaneTextField" required="true" style="height: 24px; left: 384px; top: 768px; position: absolute; width: 96px" tabindex="14" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.cbutane']}"/>
                        <h:outputText id="cbutaneTextID1" style="font-size: 14px; height: 22px; left: 240px; top: 744px; position: absolute; width: 142px" value="2-2-dim-C3"/>
                        <h:inputText binding="#{Thermo$AddComponentsPage.i22dimC3TextField}" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="i22dimC3TextField" required="true" style="height: 24px; left: 384px; top: 744px; position: absolute; width: 96px" tabindex="14" value="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.i22dimC3']}"/>
                        <ui:staticText id="staticText5" style="font-size: 14px; left: 240px; top: 864px; position: absolute; width: 142px" text="2,2-dim-C4"/>
                        <ui:textField binding="#{Thermo$AddComponentsPage.i22dimC4TextField2}" columns="10"
                            converter="#{Thermo$AddComponentsPage.doubleConverter1}" id="i22dimC4TextField2" required="true"
                            style="height: 24px; left: 384px; top: 864px; position: absolute; width: 96px" text="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.i22dimC3']}"/>
                        <ui:staticText id="staticText7" style="font-size: 14px; left: 240px; top: 888px; position: absolute; width: 142px" text="2,3-dim-C4"/>
                        <ui:textField binding="#{Thermo$AddComponentsPage.i23dimC4TextField}" columns="10"
                            converter="#{Thermo$AddComponentsPage.doubleConverter1}" id="i23dimC4TextField" required="true"
                            style="height: 24px; left: 384px; top: 888px; position: absolute; width: 96px" text="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.i23dimC4']}"/>
                        <ui:staticText id="staticText8" style="font-size: 14px; left: 240px; top: 912px; position: absolute; width: 142px" text="2-m-C5"/>
                        <ui:textField binding="#{Thermo$AddComponentsPage.i2mC5TextField}" columns="10" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="i2mC5TextField" required="true" style="height: 24px; left: 384px; top: 912px; position: absolute; width: 96px" text="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.i2mC5']}"/>
                        <ui:staticText id="staticText9" style="font-size: 14px; left: 240px; top: 936px; position: absolute; width: 142px" text="3-m-C5"/>
                        <ui:textField binding="#{Thermo$AddComponentsPage.i3mC5TextField}" columns="10" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="i3mC5TextField" required="true" style="height: 24px; left: 384px; top: 936px; position: absolute; width: 96px" text="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.i3mC5']}"/>
                        <ui:staticText id="staticText10" style="font-size: 14px; left: 624px; top: 384px; position: absolute; width: 142px" text="m-c-pentane"/>
                        <ui:textField binding="#{Thermo$AddComponentsPage.m_c_pentaneTextField}" columns="10"
                            converter="#{Thermo$AddComponentsPage.doubleConverter1}" id="m_c_pentaneTextField" required="true"
                            style="height: 24px; left: 768px; top: 384px; position: absolute; width: 96px" text="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.mcpentane']}"/>
                        <ui:staticText id="staticText11" style="font-size: 14px; height: 24px; left: 624px; top: 480px; position: absolute; width: 142px" text="c-heptane"/>
                        <ui:textField binding="#{Thermo$AddComponentsPage.cheptaneTextField}" columns="10"
                            converter="#{Thermo$AddComponentsPage.doubleConverter1}" id="cheptaneTextField" required="true"
                            style="height: 24px; left: 768px; top: 480px; position: absolute; width: 96px" text="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.cheptane']}"/>
                        <ui:message for="cheptaneTextField" id="message55" showDetail="false" showSummary="true" style="height: 24px; left: 864px; top: 480px; position: absolute; width: 120px"/>
                        <ui:message for="m_c_pentaneTextField" id="message56" showDetail="false" showSummary="true" style="height: 24px; left: 864px; top: 384px; position: absolute; width: 142px"/>
                        <ui:staticText id="staticText12" style="font-size: 14px; height: 24px; left: 624px; top: 552px; position: absolute; width: 142px" text="et-cyclo-hexane"/>
                        <ui:textField binding="#{Thermo$AddComponentsPage.m_c_heptaneTextField}" columns="10"
                            converter="#{Thermo$AddComponentsPage.doubleConverter1}" id="m_c_heptaneTextField" required="true"
                            style="height: 24px; left: 768px; top: 552px; position: absolute; width: 96px" text="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.mcheptane']}"/>
                        <ui:staticText id="staticText13" style="font-size: 14px; height: 24px; left: 624px; top: 576px; position: absolute; width: 142px" text="cyclo-octane"/>
                        <ui:textField binding="#{Thermo$AddComponentsPage.c_octaneTextField}" columns="10"
                            converter="#{Thermo$AddComponentsPage.doubleConverter1}" id="c_octaneTextField" required="true"
                            style="height: 24px; left: 768px; top: 576px; position: absolute; width: 96px" text="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.coctane']}"/>
                        <ui:staticText id="staticText14" style="font-size: 14px; height: 24px; left: 624px; top: 720px; position: absolute; width: 142px" text="n-C11"/>
                        <ui:staticText id="staticText15" style="font-size: 14px; height: 24px; left: 624px; top: 744px; position: absolute; width: 142px" text="n-C12"/>
                        <ui:staticText id="staticText16" style="font-size: 14px; height: 24px; left: 624px; top: 768px; position: absolute; width: 142px" text="n-C13"/>
                        <ui:staticText id="staticText17" style="font-size: 14px; height: 24px; left: 624px; top: 792px; position: absolute; width: 142px" text="n-C14"/>
                        <ui:staticText id="staticText18" style="font-size: 14px; height: 24px; left: 624px; top: 816px; position: absolute; width: 142px" text="n-C15"/>
                        <ui:staticText id="staticText19" style="font-size: 14px; height: 24px; left: 624px; top: 840px; position: absolute; width: 142px" text="n-C16"/>
                        <ui:staticText id="staticText20" style="font-size: 14px; height: 24px; left: 624px; top: 864px; position: absolute; width: 142px" text="n-C17"/>
                        <ui:staticText id="staticText21" style="font-size: 14px; height: 24px; left: 624px; top: 888px; position: absolute; width: 142px" text="n-C18"/>
                        <ui:staticText id="staticText22" style="font-size: 14px; height: 24px; left: 624px; top: 912px; position: absolute; width: 142px" text="n-C19"/>
                        <ui:staticText id="staticText23" style="font-size: 14px; height: 24px; left: 624px; top: 936px; position: absolute; width: 142px" text="n-C20"/>
                        <ui:textField binding="#{Thermo$AddComponentsPage.nc11TextField}" columns="10" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="nc11TextField" required="true" style="height: 24px; left: 768px; top: 720px; position: absolute; width: 96px"
                            text="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.nc11']}" valueChangeListener="#{Thermo$AddComponentsPage.nc11TextField_processValueChange}"/>
                        <ui:textField binding="#{Thermo$AddComponentsPage.nc12TextField}" columns="10" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="nc12TextField" required="true" style="height: 24px; left: 768px; top: 744px; position: absolute; width: 96px" text="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.nc12']}"/>
                        <ui:textField binding="#{Thermo$AddComponentsPage.nc13TextField}" columns="10" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="nc13TextField" required="true" style="height: 24px; left: 768px; top: 768px; position: absolute; width: 96px" text="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.nc13']}"/>
                        <ui:textField binding="#{Thermo$AddComponentsPage.nc14TextField}" columns="10" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="nc14TextField" required="true" style="height: 24px; left: 768px; top: 792px; position: absolute; width: 96px" text="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.nc14']}"/>
                        <ui:textField binding="#{Thermo$AddComponentsPage.nc15TextField}" columns="10" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="nc15TextField" required="true" style="height: 24px; left: 768px; top: 816px; position: absolute; width: 96px" text="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.nc15']}"/>
                        <ui:textField binding="#{Thermo$AddComponentsPage.nc16TextField}" columns="10" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="nc16TextField" required="true" style="height: 24px; left: 768px; top: 840px; position: absolute; width: 96px" text="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.nc16']}"/>
                        <ui:textField binding="#{Thermo$AddComponentsPage.nc17TextField}" columns="10" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="nc17TextField" required="true" style="height: 24px; left: 768px; top: 864px; position: absolute; width: 96px" text="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.nc17']}"/>
                        <ui:textField binding="#{Thermo$AddComponentsPage.nc18TextField}" columns="10" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="nc18TextField" required="true" style="height: 24px; left: 768px; top: 888px; position: absolute; width: 96px" text="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.nc18']}"/>
                        <ui:textField binding="#{Thermo$AddComponentsPage.nc19TextField}" columns="10" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="nc19TextField" required="true" style="height: 24px; left: 768px; top: 912px; position: absolute; width: 96px" text="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.nc19']}"/>
                        <ui:textField binding="#{Thermo$AddComponentsPage.nc20TextField}" columns="10" converter="#{Thermo$AddComponentsPage.doubleConverter1}"
                            id="nc20TextField" required="true" style="height: 24px; left: 768px; top: 936px; position: absolute; width: 96px" text="#{Thermo$AddComponentsPage.fieldsFluidDataProvider.value['fluidinfo.nc20']}"/>
                        <ui:message for="c16TextField" id="message57" showDetail="false" showSummary="true" style="left: 1536px; top: 624px; position: absolute; width: 118px"/>
                        <h:outputText id="molprsectext4" style="font-size: 14px; height: 26px; left: 768px; top: 360px; position: absolute; width: 144px" value="rate [mol/sec]"/>
                        <ui:message for="hydrogenTextField" id="message58" showDetail="false" showSummary="true" style="left: 480px; top: 456px; position: absolute; width: 142px"/>
                        <ui:message for="oxygenTextField" id="message59" showDetail="false" showSummary="true" style="left: 480px; top: 480px; position: absolute; width: 142px"/>
                        <ui:message for="argonTextField" id="message60" showDetail="false" showSummary="true" style="left: 480px; top: 504px; position: absolute; width: 142px"/>
                        <ui:message for="mercuryTextField2" id="message61" showDetail="false" showSummary="true" style="left: 480px; top: 528px; position: absolute; width: 142px"/>
                        <ui:message for="cpropaneTextField" id="message62" showDetail="false" showSummary="true" style="left: 480px; top: 672px; position: absolute; width: 142px"/>
                        <ui:message for="i22dimC3TextField" id="message63" showDetail="false" showSummary="true" style="left: 480px; top: 744px; position: absolute; width: 142px"/>
                        <ui:message for="cbutaneTextField" id="message64" showDetail="false" showSummary="true" style="left: 480px; top: 768px; position: absolute; width: 142px"/>
                        <ui:message for="i22dimC4TextField2" id="message65" showDetail="false" showSummary="true" style="left: 480px; top: 864px; position: absolute; width: 142px"/>
                        <ui:message for="i23dimC4TextField" id="message66" showDetail="false" showSummary="true" style="left: 480px; top: 888px; position: absolute; width: 142px"/>
                        <ui:message for="i2mC5TextField" id="message67" showDetail="false" showSummary="true" style="left: 480px; top: 912px; position: absolute; width: 142px"/>
                        <ui:message for="i3mC5TextField" id="message68" showDetail="false" showSummary="true" style="left: 480px; top: 936px; position: absolute; width: 142px"/>
                        <ui:message for="m_c_heptaneTextField" id="message69" showDetail="false" showSummary="true" style="left: 864px; top: 552px; position: absolute; width: 142px"/>
                        <ui:message for="c_octaneTextField" id="message70" showDetail="false" showSummary="true" style="left: 864px; top: 576px; position: absolute; width: 142px"/>
                        <ui:message for="nc11TextField" id="message71" showDetail="false" showSummary="true" style="left: 864px; top: 720px; position: absolute; width: 142px"/>
                        <ui:message for="nc12TextField" id="message72" showDetail="false" showSummary="true" style="left: 864px; top: 744px; position: absolute; width: 142px"/>
                        <ui:message for="nc13TextField" id="message73" showDetail="false" showSummary="true" style="left: 864px; top: 768px; position: absolute; width: 142px"/>
                        <ui:message for="nc14TextField" id="message74" showDetail="false" showSummary="true" style="left: 864px; top: 792px; position: absolute; width: 142px"/>
                        <ui:message for="nc15TextField" id="message75" showDetail="false" showSummary="true" style="left: 864px; top: 816px; position: absolute; width: 142px"/>
                        <ui:message for="nc16TextField" id="message76" showDetail="false" showSummary="true" style="left: 864px; top: 840px; position: absolute; width: 142px"/>
                        <ui:message for="nc17TextField" id="message77" showDetail="false" showSummary="true" style="left: 864px; top: 864px; position: absolute; width: 142px"/>
                        <ui:message for="nc18TextField" id="message78" showDetail="false" showSummary="true" style="left: 864px; top: 888px; position: absolute; width: 142px"/>
                        <ui:message for="nc19TextField" id="message79" showDetail="false" showSummary="true" style="left: 864px; top: 912px; position: absolute; width: 142px"/>
                        <ui:message for="nc20TextField" id="message80" showDetail="false" showSummary="true" style="left: 864px; top: 936px; position: absolute; width: 142px"/>
                        <ui:message for="c17TextField" id="message81" showDetail="false" showSummary="true" style="left: 1536px; top: 648px; position: absolute; width: 118px"/>
                        <ui:message for="c18TextField" id="message82" showDetail="false" showSummary="true" style="left: 1536px; top: 672px; position: absolute; width: 118px"/>
                        <ui:message for="c19TextField" id="message83" showDetail="false" showSummary="true" style="left: 1536px; top: 696px; position: absolute; width: 118px"/>
                        <ui:message for="c20TextField" id="message84" showDetail="false" showSummary="true" style="left: 1536px; top: 720px; position: absolute; width: 118px"/>
                        <ui:message for="c21TextField1" id="message85" showDetail="false" showSummary="true" style="left: 1536px; top: 744px; position: absolute; width: 118px"/>
                        <ui:message for="c22TextField2" id="message86" showDetail="false" showSummary="true" style="left: 1536px; top: 768px; position: absolute; width: 118px"/>
                        <ui:message for="c23TextField3" id="message87" showDetail="false" showSummary="true" style="left: 1536px; top: 792px; position: absolute; width: 118px"/>
                        <ui:message for="c24TextField4" id="message88" showDetail="false" showSummary="true" style="left: 1536px; top: 816px; position: absolute; width: 118px"/>
                        <ui:message for="c25TextField5" id="message89" showDetail="false" showSummary="true" style="left: 1536px; top: 840px; position: absolute; width: 118px"/>
                        <ui:message for="kplusTextField" id="message90" showDetail="false" showSummary="true" style="left: 1944px; top: 792px; position: absolute; width: 142px"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
