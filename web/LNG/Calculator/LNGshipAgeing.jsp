<?xml version="1.0" encoding="windows-1252"?>
<!-- 
    Document   : LNGshipAgeing
    Created on : 16.mar.2009, 09:58:34
    Author     : esol
-->
<jsp:root version="1.2" xmlns:bp="http://java.sun.com/blueprints/ui/14" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html"
    xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
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
                        <div style="height: 96px; left: 24px; top: 216px; position: absolute; width: 144px">
                            <jsp:directive.include file="../LNGLeftMenuPage.jspf"/>
                        </div>
                        <h:outputText id="outputText1" style="left: 264px; top: 24px; position: absolute" styleClass="title1" title="title1" value="LNG ship ageing"/>
                        <ui:textField binding="#{LNG$Calculator$LNGshipAgeing.shipFillingVolumeField}"
                            converter="#{LNG$Calculator$LNGshipAgeing.doubleConverter1}" id="shipFillingVolumeField"
                            style="height: 24px; left: 408px; top: 240px; position: absolute; width: 190px" text="#{LNG$Calculator$LNGshipAgeing.lngShipDataProvider.value['lngship.VOLUME']}"/>
                        <ui:textField binding="#{LNG$Calculator$LNGshipAgeing.boilOffRateField}" converter="#{LNG$Calculator$LNGshipAgeing.doubleConverter1}"
                            id="boilOffRateField" style="height: 24px; left: 408px; top: 336px; position: absolute; width: 190px" text="#{LNG$Calculator$LNGshipAgeing.lngShipDataProvider.value['lngship.BOR']}"/>
                        <ui:staticText id="staticText1" style="height: 24px; left: 264px; top: 240px; position: absolute; width: 144px" text="Ship initial LNG volume"/>
                        <ui:staticText id="staticText2" style="height: 24px; left: 264px; top: 336px; position: absolute; width: 144px" text="Boil off rate"/>
                        <ui:staticText id="staticText4" style="height: 24px; left: 624px; top: 240px; position: absolute; width: 144px" text="m^3"/>
                        <ui:staticText id="staticText5" style="height: 24px; left: 624px; top: 336px; position: absolute; width: 144px" text="vol% pr day"/>
                        <ui:staticText id="staticText7" style="left: 264px; top: 384px; position: absolute; width: 120px" text="Simulation time"/>
                        <ui:textField binding="#{LNG$Calculator$LNGshipAgeing.simulationTimeField}" converter="#{LNG$Calculator$LNGshipAgeing.doubleConverter1}"
                            id="simulationTimeField" style="height: 24px; left: 408px; top: 384px; position: absolute; width: 190px" text="#{LNG$Calculator$LNGshipAgeing.lngShipDataProvider.value['lngship.TRANSTIME']}"/>
                        <ui:button action="#{LNG$Calculator$LNGshipAgeing.button1_action}" id="button1"
                            style="height: 24px; left: 407px; top: 504px; position: absolute; width: 72px" text="Calculate"/>
                        <ui:textField binding="#{LNG$Calculator$LNGshipAgeing.pressureField}" converter="#{LNG$Calculator$LNGshipAgeing.doubleConverter1}"
                            id="pressureField" style="height: 24px; left: 408px; top: 288px; position: absolute; width: 190px" text="#{LNG$Calculator$LNGshipAgeing.lngShipDataProvider.value['lngship.PRESSURE']}"/>
                        <ui:staticText id="staticText9" style="height: 24px; left: 264px; top: 288px; position: absolute; width: 144px" text="Transport pressure"/>
                        <ui:staticText id="staticText10" style="height: 24px; left: 624px; top: 288px; position: absolute; width: 144px" text="bara"/>
                        <ui:messageGroup id="messageGroup1" style="height: 72px; left: 792px; top: 240px; position: absolute; width: 72px"/>
                        <ui:staticText id="staticText3" style="height: 24px; left: 264px; top: 96px; position: absolute; width: 622px" text="Calculates LNG ageing during ship transport based on an accurate equation of state."/>
                        <ui:staticText id="staticText6" style="height: 24px; left: 264px; top: 120px; position: absolute; width: 622px" text="Energy calculations are  based on ISO6976"/>
                        <ui:staticText id="staticText12" style="height: 24px; left: 264px; top: 144px; position: absolute; width: 622px" text="LNG density calculations are done based on the Klosek-Mc Kinley method (ISO6578)"/>
                        <ui:dropDown binding="#{LNG$Calculator$LNGshipAgeing.combustionTemperatureDropDown}"
                            converter="#{LNG$Calculator$LNGshipAgeing.doubleConverter2}" id="combustionTemperatureDropDown"
                            items="#{LNG$Calculator$LNGshipAgeing.combustionTemperatureDropDownDefaultOptions.options}" style="height: 24px; left: 480px; top: 600px; position: absolute; width: 120px"/>
                        <ui:staticText id="staticText13" style="height: 22px; left: 264px; top: 600px; position: absolute; width: 190px" text="Combustion temperature "/>
                        <ui:staticText id="staticText14" style="height: 24px; left: 600px; top: 600px; position: absolute; width: 22px" text="C"/>
                        <ui:staticText id="staticText15" style="height: 22px; left: 264px; top: 624px; position: absolute; width: 190px" text="Measurement  temperature "/>
                        <ui:staticText id="staticText16" style="font-weight: bold; left: 264px; top: 552px; position: absolute; width: 310px" text="Output standards and reference conditions"/>
                        <ui:staticText id="staticText17" style="height: 22px; left: 264px; top: 576px; position: absolute; width: 190px" text="ISO 6976"/>
                        <ui:dropDown binding="#{LNG$Calculator$LNGshipAgeing.measurementTemperatureDropDown}"
                            converter="#{LNG$Calculator$LNGshipAgeing.doubleConverter2}" id="measurementTemperatureDropDown"
                            items="#{LNG$Calculator$LNGshipAgeing.measurementTemperatureDropDownDefaultOptions.options}" style="height: 24px; left: 480px; top: 624px; position: absolute; width: 120px"/>
                        <ui:staticText id="staticText18" style="height: 24px; left: 600px; top: 624px; position: absolute; width: 22px" text="C"/>
                        <ui:checkbox binding="#{LNG$Calculator$LNGshipAgeing.backCalcuationCheckbox}" id="backCalcuationCheckbox" label=" Backward calculation" style="height: 24px; left: 264px; top: 672px; position: absolute; width: 168px"/>
                        <ui:checkbox binding="#{LNG$Calculator$LNGshipAgeing.GERGEOSCheckbox}" id="GERGEOSCheckbox" label=" Use GERG-2004 EoS" style="height: 24px; left: 264px; top: 696px; position: absolute; width: 168px"/>
                        <ui:panelGroup binding="#{LNG$Calculator$LNGshipAgeing.initialTemperatureGroupPanel}" id="initialTemperatureGroupPanel" rendered="false" style="height: 46px; left: 408px; top: 432px; position: absolute; width: 358px">
                            <ui:textField binding="#{LNG$Calculator$LNGshipAgeing.initialTemperatureField}"
                                converter="#{LNG$Calculator$LNGshipAgeing.doubleConverter1}" id="initialTemperatureField" style="height: 24px; width: 190px" text="#{LNG$Calculator$LNGshipAgeing.lngShipDataProvider.value['lngship.INITTEMPERATURE']}"/>
                            <ui:staticText id="staticText19" style="height: 24px; width: 144px" text="Celsius"/>
                        </ui:panelGroup>
                        <ui:imageHyperlink action="#{LNG$Calculator$LNGshipAgeing.imageHyperlink1_action}" height="24" id="imageHyperlink1"
                            style="left: 264px; top: 432px; position: absolute" text="Set Initial Temperature" width="168"/>
                        <ui:dropDown binding="#{LNG$Calculator$LNGshipAgeing.timeDropDown}" id="timeDropDown"
                            items="#{LNG$Calculator$LNGshipAgeing.timeDropDownDefaultOptions.options}" style="height: 24px; left: 624px; top: 384px; position: absolute; width: 144px"/>
                        <ui:checkbox binding="#{LNG$Calculator$LNGshipAgeing.idealGasReferenceCheckbox}" id="idealGasReferenceCheckbox"
                            label="Ideal gas reference state" style="height: 24px; left: 624px; top: 624px; position: absolute; width: 168px"/>
                        <ui:checkbox binding="#{LNG$Calculator$LNGshipAgeing.ISO69862016Checkbox}" id="ISO69862016Checkbox" label=" Use ISO6976_2016" style="height: 24px; left: 264px; top: 720px; position: absolute; width: 168px"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
