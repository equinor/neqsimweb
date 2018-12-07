<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <html lang="no-NO" xml:lang="no-NO">
            <head>
                <meta content="no-cache" http-equiv="Cache-Control"/>
                <meta content="no-cache" http-equiv="Pragma"/>
                <title>Process$StatoilProcessSimulation$snohvitCO2Removal Title</title>
                <link href="../../resources/stylesheet.css" rel="stylesheet" type="text/css"/>
            </head>
            <body style="-rave-layout: grid">
                <h:form binding="#{Process$StatoilProcessSimulation$snohvitCO2Removal.form1}" id="form1">
                    <h:graphicImage binding="#{Process$StatoilProcessSimulation$snohvitCO2Removal.image1}" height="192" id="image1"
                        style="left: 24px; top: 24px; position: absolute" value="/resources/neqsim_logo.jpg" width="192"/>
                    <h:outputText binding="#{Process$StatoilProcessSimulation$snohvitCO2Removal.topMenuText}" id="topMenuText"
                        style="font-size: 24; height: 23px; left: 264px; top: 24px; position: absolute; width: 408px" styleClass="/resources/stylesheet.css"
                        title="title1" value="Snohvit CO2/MEG Removal Plant"/>
                    <h:graphicImage binding="#{Process$StatoilProcessSimulation$snohvitCO2Removal.image2}" height="384" id="image2"
                        style="left: 264px; top: 264px; position: absolute; z-index: 500" value="resources/image002.jpg" width="530"/>
                    <h:outputText binding="#{Process$StatoilProcessSimulation$snohvitCO2Removal.outputText1}" id="outputText1"
                        style="height: 24px; left: 264px; top: 648px; position: absolute; width: 144px" value="Gas Rate [Sm3/hr]"/>
                    <h:inputText binding="#{Process$StatoilProcessSimulation$snohvitCO2Removal.textField1}" id="textField1" style="height: 24px; left: 264px; top: 672px; position: absolute; width: 120px"/>
                    <h:inputText binding="#{Process$StatoilProcessSimulation$snohvitCO2Removal.textField2}" id="textField2" style="height: 24px; left: 264px; top: 216px; position: absolute; width: 120px"/>
                    <h:outputText binding="#{Process$StatoilProcessSimulation$snohvitCO2Removal.outputText2}" id="outputText2"
                        style="height: 24px; left: 264px; top: 192px; position: absolute; width: 192px" value="Lean Amine Temperature [C]"/>
                    <h:outputText binding="#{Process$StatoilProcessSimulation$snohvitCO2Removal.outputText3}" id="outputText3"
                        style="height: 24px; left: 264px; top: 696px; position: absolute; width: 144px" value="CO2-content [%]"/>
                    <h:inputText binding="#{Process$StatoilProcessSimulation$snohvitCO2Removal.textField3}" id="textField3" style="height: 24px; left: 264px; top: 720px; position: absolute; width: 120px"/>
                    <h:commandButton binding="#{Process$StatoilProcessSimulation$snohvitCO2Removal.button1}" id="button1"
                        style="height: 24px; left: 456px; top: 792px; position: absolute; width: 120px" value="Evauate"/>
                    <h:inputText binding="#{Process$StatoilProcessSimulation$snohvitCO2Removal.textField4}" id="textField4" style="height: 24px; left: 264px; top: 168px; position: absolute; width: 120px"/>
                    <h:outputText binding="#{Process$StatoilProcessSimulation$snohvitCO2Removal.outputText4}" id="outputText4"
                        style="height: 24px; left: 264px; top: 144px; position: absolute; width: 192px" value="Lean Amine Rate [m3/hr]"/>
                    <h:dataTable binding="#{Process$StatoilProcessSimulation$snohvitCO2Removal.dataTable1}" headerClass="list-header" id="dataTable1"
                        rowClasses="list-row-even,list-row-odd" style="height: 216px; left: 264px; top: 888px; position: absolute"
                        value="#{Process$StatoilProcessSimulation$snohvitCO2Removal.dataTable1Model}" var="currentRow" width="648">
                        <h:column binding="#{Process$StatoilProcessSimulation$snohvitCO2Removal.column1}" id="column1">
                            <h:outputText binding="#{Process$StatoilProcessSimulation$snohvitCO2Removal.outputText5}" id="outputText5" value="#{currentRow['COLUMN1']}"/>
                            <f:facet name="header">
                                <h:outputText binding="#{Process$StatoilProcessSimulation$snohvitCO2Removal.outputText6}" id="outputText6" value="column1"/>
                            </f:facet>
                        </h:column>
                        <h:column binding="#{Process$StatoilProcessSimulation$snohvitCO2Removal.column2}" id="column2">
                            <h:outputText binding="#{Process$StatoilProcessSimulation$snohvitCO2Removal.outputText7}" id="outputText7" value="#{currentRow['COLUMN2']}"/>
                            <f:facet name="header">
                                <h:outputText binding="#{Process$StatoilProcessSimulation$snohvitCO2Removal.outputText8}" id="outputText8" value="column2"/>
                            </f:facet>
                        </h:column>
                        <h:column binding="#{Process$StatoilProcessSimulation$snohvitCO2Removal.column3}" id="column3">
                            <h:outputText binding="#{Process$StatoilProcessSimulation$snohvitCO2Removal.outputText9}" id="outputText9" value="#{currentRow['COLUMN3']}"/>
                            <f:facet name="header">
                                <h:outputText binding="#{Process$StatoilProcessSimulation$snohvitCO2Removal.outputText10}" id="outputText10" value="column3"/>
                            </f:facet>
                        </h:column>
                    </h:dataTable>
                    <h:outputText binding="#{Process$StatoilProcessSimulation$snohvitCO2Removal.topMenuText1}" id="topMenuText1"
                        style="font-size: 20; height: 27px; left: 264px; top: 864px; position: absolute; width: 240px" styleClass="/resources/stylesheet.css"
                        title="title1" value="Simulation Results"/>
                    <h:inputText binding="#{Process$StatoilProcessSimulation$snohvitCO2Removal.textField5}" id="textField5" style="height: 24px; left: 264px; top: 768px; position: absolute; width: 120px"/>
                    <h:outputText binding="#{Process$StatoilProcessSimulation$snohvitCO2Removal.outputText11}" id="outputText11"
                        style="height: 24px; left: 264px; top: 744px; position: absolute; width: 144px" value="Gas Temperature [C]"/>
                    <h:inputText binding="#{Process$StatoilProcessSimulation$snohvitCO2Removal.textField7}" id="textField7" style="height: 24px; left: 624px; top: 672px; position: absolute; width: 120px"/>
                    <h:outputText binding="#{Process$StatoilProcessSimulation$snohvitCO2Removal.outputText13}" id="outputText13"
                        style="height: 24px; left: 624px; top: 648px; position: absolute; width: 192px" value="Stripper Temperature [C]"/>
                    <h:outputLink binding="#{Process$StatoilProcessSimulation$snohvitCO2Removal.hyperlink1}" id="hyperlink1"
                        style="height: 26px; left: 24px; top: 216px; position: absolute; width: 192px" value="http://www.stud.ntnu.no/~solbraa/neqsim/NeqSim.htm">
                        <h:outputText binding="#{Process$StatoilProcessSimulation$snohvitCO2Removal.hyperlink1Text}" id="hyperlink1Text" value="Home"/>
                    </h:outputLink>
                    <h:outputText binding="#{Process$StatoilProcessSimulation$snohvitCO2Removal.outputText12}" id="outputText12"
                        style="font-style: italic; height: 28px; left: 264px; top: 72px; position: absolute; width: 672px" value="Insert amine rates and temperatures in the text fields. Push evaluate button to start simulation."/>
                    <h:outputText binding="#{Process$StatoilProcessSimulation$snohvitCO2Removal.outputText14}" id="outputText14"
                        style="height: 26px; left: 504px; top: 144px; position: absolute; width: 240px" value="Lean Amine Composition [wt%]"/>
                    <h:inputText binding="#{Process$StatoilProcessSimulation$snohvitCO2Removal.textField6}" id="textField6" style="height: 24px; left: 576px; top: 168px; position: absolute; width: 120px"/>
                    <h:outputText binding="#{Process$StatoilProcessSimulation$snohvitCO2Removal.outputText15}" id="outputText15"
                        style="height: 24px; left: 504px; top: 168px; position: absolute; width: 74px" value="MDEA"/>
                    <h:inputText binding="#{Process$StatoilProcessSimulation$snohvitCO2Removal.textField8}" id="textField8" style="height: 24px; left: 576px; top: 192px; position: absolute; width: 120px"/>
                    <h:outputText binding="#{Process$StatoilProcessSimulation$snohvitCO2Removal.outputText16}" id="outputText16"
                        style="height: 24px; left: 504px; top: 192px; position: absolute; width: 74px" value="Piperazine"/>
                    <h:outputText binding="#{Process$StatoilProcessSimulation$snohvitCO2Removal.outputText17}" id="outputText17"
                        style="height: 24px; left: 504px; top: 216px; position: absolute; width: 74px" value="Acids"/>
                    <h:inputText binding="#{Process$StatoilProcessSimulation$snohvitCO2Removal.textField9}" id="textField9" style="height: 24px; left: 576px; top: 216px; position: absolute; width: 120px"/>
                </h:form>
            </body>
        </html>
    </f:view>
</jsp:root>
