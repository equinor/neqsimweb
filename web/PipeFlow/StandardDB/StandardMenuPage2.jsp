<?xml version="1.0" encoding="windows-1252"?>
<!-- 
    Document   : StandardMenuPage2
    Created on : 27.mai.2008, 10:51:37
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
                        <h:outputText id="topMenuText1" style="left: 240px; top: 24px; position: absolute; width: 672px" styleClass="title1" title="title1" value="Pipeline Design Standard Database"/>
                        <h:outputText id="outputText1" style="height: 28px; left: 240px; top: 72px; position: absolute; width: 672px" styleClass="body-text" value="Select preferred link from the available menu.. "/>
                        <h:outputText id="outputText2" style="height: 26px; left: 240px; top: 96px; position: absolute; width: 670px" styleClass="body-text" value="If you have questions or suggestions - please go to the forum or documentation pages"/>
                        <ui:staticText id="staticText1" style="height: 24px; left: 240px; top: 144px; position: absolute; width: 142px" text="Standard Type"/>
                        <ui:staticText id="staticText2" style="height: 24px; left: 240px; top: 192px; position: absolute; width: 142px" text="Standard Subject"/>
                        <ui:dropDown binding="#{PipeFlow$StandardDB$StandardMenuPage2.standardTypeDropDown}" id="standardTypeDropDown"
                            items="#{PipeFlow$StandardDB$StandardMenuPage2.standardTypeDropDownDefaultOptions.options}"
                            onChange="common_timeoutSubmitForm(this.form, 'standardTypeDropDown');"
                            style="height: 24px; left: 384px; top: 144px; position: absolute; width: 240px" valueChangeListener="#{PipeFlow$StandardDB$StandardMenuPage2.standardTypeDropDown_processValueChange}"/>
                        <ui:hyperlink action="#{PipeFlow$StandardDB$StandardMenuPage2.hyperlink1_action}" id="hyperlink1"
                            style="height: 24px; left: 672px; top: 144px; position: absolute; width: 144px" text="Add new standard"/>
                        <ui:dropDown binding="#{PipeFlow$StandardDB$StandardMenuPage2.standardSubjectDropDown}" id="standardSubjectDropDown"
                            items="#{PipeFlow$StandardDB$StandardMenuPage2.standardSubjectDropDownDefaultOptions.options}"
                            onChange="common_timeoutSubmitForm(this.form, 'standardSubjectDropDown');"
                            style="height: 24px; left: 384px; top: 192px; position: absolute; width: 240px" valueChangeListener="#{PipeFlow$StandardDB$StandardMenuPage2.standardSubjectDropDown_processValueChange}"/>
                        <ui:table augmentTitle="false" id="table1" style="height: 260px; left: 240px; top: 240px; position: absolute" title="Table" width="438">
                            <ui:tableRowGroup binding="#{PipeFlow$StandardDB$StandardMenuPage2.tableRowGroup1}" id="tableRowGroup1" rows="10"
                                sourceData="#{PipeFlow$StandardDB$StandardMenuPage2.standardsDataProvider}" sourceVar="currentRow">
                                <ui:tableColumn headerText="ID" id="tableColumn1" sort="documents.ID">
                                    <ui:staticText id="staticText3" text="#{currentRow.value['documents.ID']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn headerText="NAME" id="tableColumn2" sort="documents.NAME">
                                    <ui:staticText id="staticText4" text="#{currentRow.value['documents.NAME']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn headerText="TYPE" id="tableColumn8" sort="documenttype.NAME">
                                    <ui:staticText id="staticText7" text="#{currentRow.value['documenttype.NAME']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn headerText="SUBJECT" id="tableColumn9" sort="documentsubjects.SUBJECT">
                                    <ui:staticText id="staticText8" text="#{currentRow.value['documentsubjects.SUBJECT']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn headerText="LINK" id="tableColumn4" sort="documents.LINK">
                                    <ui:hyperlink id="hyperlink3" target="_blank" text="#{currentRow.value['documents.LINK']}" url="#{PipeFlow$StandardDB$StandardMenuPage2.standardsDataProvider.value['documents.LINK']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn headerText="DELETE" id="tableColumn6">
                                    <ui:button action="#{PipeFlow$StandardDB$StandardMenuPage2.button2_action}" id="button2" text="Delete"/>
                                </ui:tableColumn>
                                <ui:tableColumn headerText="OPEN" id="tableColumn7" width="80">
                                    <ui:button action="#{PipeFlow$StandardDB$StandardMenuPage2.button3_action}"
                                        binding="#{PipeFlow$StandardDB$StandardMenuPage2.button3}" id="button3" text="Open"/>
                                </ui:tableColumn>
                            </ui:tableRowGroup>
                        </ui:table>
                        <ui:messageGroup id="messageGroup1" style="position: absolute; left: 840px; top: 144px; width: 192px; height: 192px"/>
                        <div style="position: absolute; left: 24px; top: 216px; width: 96px; height: 96px">
                            <jsp:directive.include file="../PipeFlowLeftMenuPage.jspf"/>
                        </div>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
