<?xml version="1.0" encoding="windows-1252"?>
<!-- 
    Document   : PipeLine
    Created on : 13.jul.2009, 21:46:56
    Author     : ESOL
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
                        <h:outputText id="logoOutputText1" style="height: 25px; left: 264px; top: 24px; position: absolute; width: 552px" styleClass="title1" value="Pipeline"/>
                        <ui:button action="#{Process$calculator$PipeLine.button1_action}" id="button1"
                            style="height: 24px; left: 671px; top: 576px; position: absolute; width: 96px" text="Calculate"/>
                        <ui:table augmentTitle="false" binding="#{Process$calculator$PipeLine.pipelineTable}" id="pipelineTable"
                            style="height: 192px; left: 264px; top: 648px; position: absolute; width: 863px" title="Pipeline data" width="863">
                            <ui:tableRowGroup binding="#{Process$calculator$PipeLine.tableRowGroup1}" id="tableRowGroup1" rows="10"
                                sourceData="#{Process$calculator$PipeLine.pipelineParameterRowSetDataProvider}" sourceVar="currentRow">
                                <ui:tableColumn headerText="POSITION" id="tableColumn1" sort="pipelineparameters.POSITION">
                                    <ui:staticText id="staticText1" text="#{currentRow.value['pipelineparameters.POSITION']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn headerText="HEIGHT" id="tableColumn2" sort="pipelineparameters.HEIGHT">
                                    <ui:staticText id="staticText2" text="#{currentRow.value['pipelineparameters.HEIGHT']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn headerText="DIAMETER" id="tableColumn3" sort="pipelineparameters.DIAMETER">
                                    <ui:staticText id="staticText3" text="#{currentRow.value['pipelineparameters.DIAMETER']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn headerText="ROUGHNESS" id="tableColumn5" sort="pipelineparameters.WALLROUGHN">
                                    <ui:staticText id="staticText19" text="#{currentRow.value['pipelineparameters.WALLROUGHN']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn headerText="WALL HEAT TRANSF COEFF" id="tableColumn8" sort="pipelineparameters.WALLHEATTRANSFCOEFF" width="120">
                                    <ui:staticText id="staticText30" text="#{currentRow.value['pipelineparameters.WALLHEATTRANSFCOEFF']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn headerText="OUT HEAT TRANS COEF" id="tableColumn6" sort="pipelineparameters.HEATTRANSFCOEFF" width="113">
                                    <ui:staticText id="staticText20" text="#{currentRow.value['pipelineparameters.HEATTRANSFCOEFF']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn headerText="OUT TEMPERATURE" id="tableColumn7" sort="pipelineparameters.OUTTEMPERATURE">
                                    <ui:staticText id="staticText27" text="#{currentRow.value['pipelineparameters.OUTTEMPERATURE']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn headerText="Delete" id="tableColumn4">
                                    <ui:button action="#{Process$calculator$PipeLine.button3_action}" id="button3" text="Delete"/>
                                </ui:tableColumn>
                            </ui:tableRowGroup>
                        </ui:table>
                        <ui:button action="#{Process$calculator$PipeLine.button2_action}" id="button2"
                            style="height: 24px; left: 431px; top: 576px; position: absolute; width: 96px" text="Add row"/>
                        <ui:staticText id="staticText4" style="height: 24px; left: 264px; top: 240px; position: absolute; width: 166px" text="Pipe leg start/end position"/>
                        <ui:textField binding="#{Process$calculator$PipeLine.positionTextField}" converter="#{Process$calculator$PipeLine.doubleConverter1}"
                            id="positionTextField" style="height: 24px; left: 432px; top: 240px; position: absolute; width: 120px" text="0"/>
                        <ui:staticText id="staticText5" style="height: 24px; left: 264px; top: 288px; position: absolute; width: 166px" text="Pipe leg start/end elevation"/>
                        <ui:textField binding="#{Process$calculator$PipeLine.heightTextField}" converter="#{Process$calculator$PipeLine.doubleConverter1}"
                            id="heightTextField" style="height: 24px; left: 432px; top: 288px; position: absolute; width: 120px" text="0"/>
                        <ui:staticText id="staticText6" style="height: 24px; left: 264px; top: 336px; position: absolute; width: 166px" text="Pipe leg inner diameter"/>
                        <ui:textField binding="#{Process$calculator$PipeLine.diameterTextField}" converter="#{Process$calculator$PipeLine.doubleConverter1}"
                            id="diameterTextField" style="height: 24px; left: 432px; top: 336px; position: absolute; width: 120px" text="1.0"/>
                        <ui:staticText id="staticText7" style="height: 24px; left: 264px; top: 192px; position: absolute; width: 358px" text="Add pipe leg information by inserting data and press add row"/>
                        <ui:staticText id="staticText8" style="position: absolute; left: 264px; top: 96px; width: 144px; height: 24px" text="Inlet temperature"/>
                        <ui:staticText id="staticText9" style="height: 24px; left: 264px; top: 144px; position: absolute; width: 144px" text="Inlet pressure"/>
                        <ui:textField binding="#{Process$calculator$PipeLine.temperatureTextField}" converter="#{Process$calculator$PipeLine.doubleConverter1}"
                            id="temperatureTextField" style="height: 24px; left: 432px; top: 96px; position: absolute; width: 120px" text="25"/>
                        <ui:textField binding="#{Process$calculator$PipeLine.pressureTextField1}" converter="#{Process$calculator$PipeLine.doubleConverter1}"
                            id="pressureTextField1" style="height: 24px; left: 432px; top: 144px; position: absolute; width: 120px" text="100.0"/>
                        <ui:staticText id="staticText10" style="height: 24px; left: 672px; top: 528px; position: absolute; width: 120px" text="Pressure out"/>
                        <ui:staticText binding="#{Process$calculator$PipeLine.pressureOutText}" id="pressureOutText" style="height: 24px; left: 792px; top: 528px; position: absolute; width: 144px"/>
                        <ui:staticText binding="#{Process$calculator$PipeLine.temperatureOutText}" id="temperatureOutText" style="height: 24px; left: 792px; top: 480px; position: absolute; width: 144px"/>
                        <ui:staticText id="staticText11" style="height: 24px; left: 672px; top: 480px; position: absolute; width: 120px" text="Temperature out"/>
                        <ui:staticText id="staticText12" style="position: absolute; left: 576px; top: 96px; width: 24px; height: 24px" text="[C]"/>
                        <ui:staticText id="staticText13" style="height: 24px; left: 576px; top: 144px; position: absolute; width: 24px" text="[bar]"/>
                        <ui:staticText id="staticText14" style="height: 24px; left: 576px; top: 240px; position: absolute; width: 24px" text="[meter]"/>
                        <ui:staticText id="staticText15" style="height: 24px; left: 576px; top: 288px; position: absolute; width: 24px" text="[meter]"/>
                        <ui:staticText id="staticText16" style="height: 24px; left: 576px; top: 336px; position: absolute; width: 24px" text="[meter]"/>
                        <ui:staticText id="staticText17" style="height: 24px; left: 936px; top: 480px; position: absolute; width: 24px" text="[C]"/>
                        <ui:staticText id="staticText18" style="height: 24px; left: 936px; top: 528px; position: absolute; width: 24px" text="[bar]"/>
                        <ui:staticText id="staticText21" style="height: 24px; left: 264px; top: 384px; position: absolute; width: 166px" text="Pipe leg inner wall roghness"/>
                        <ui:textField binding="#{Process$calculator$PipeLine.roughnessTextField}" converter="#{Process$calculator$PipeLine.doubleConverter1}"
                            id="roughnessTextField" style="height: 24px; left: 432px; top: 384px; position: absolute; width: 120px" text="10.0"/>
                        <ui:staticText id="staticText22" style="height: 24px; left: 576px; top: 384px; position: absolute; width: 118px" text="[micro meter]"/>
                        <ui:staticText id="staticText23" style="height: 24px; left: 264px; top: 432px; position: absolute; width: 166px" text="Leg outer temperature"/>
                        <ui:textField binding="#{Process$calculator$PipeLine.outerTemperatureTextField}"
                            converter="#{Process$calculator$PipeLine.doubleConverter1}" id="outerTemperatureTextField"
                            style="height: 24px; left: 432px; top: 432px; position: absolute; width: 120px" text="25.0"/>
                        <ui:staticText id="staticText24" style="height: 24px; left: 576px; top: 432px; position: absolute; width: 24px" text="[C]"/>
                        <ui:staticText id="staticText25" style="height: 24px; left: 264px; top: 480px; position: absolute; width: 166px" text="Leg  pipe wall heat transfer coefficient"/>
                        <ui:textField binding="#{Process$calculator$PipeLine.wallHeatTransferCoeffTextField}"
                            converter="#{Process$calculator$PipeLine.doubleConverter1}" id="wallHeatTransferCoeffTextField"
                            style="height: 24px; left: 432px; top: 480px; position: absolute; width: 120px" text="5.0"/>
                        <ui:staticText id="staticText26" style="height: 24px; left: 576px; top: 480px; position: absolute; width: 24px" text="[W/m^2K]"/>
                        <ui:staticText id="staticText28" style="height: 24px; left: 264px; top: 528px; position: absolute; width: 166px" text="Leg  outer heat transfer coefficient"/>
                        <ui:textField binding="#{Process$calculator$PipeLine.outerHeatTransferCoeffTextField}"
                            converter="#{Process$calculator$PipeLine.doubleConverter1}" id="outerHeatTransferCoeffTextField"
                            style="height: 24px; left: 432px; top: 528px; position: absolute; width: 120px" text="5.0"/>
                        <ui:staticText id="staticText29" style="height: 24px; left: 576px; top: 528px; position: absolute; width: 24px" text="[W/m^2K]"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
