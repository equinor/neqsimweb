<?xml version="1.0" encoding="windows-1252"?>
<!-- 
    Document   : AddStandard
    Created on : 27.mai.2008, 15:10:14
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
                        <h:outputText id="topMenuText1" style="left: 264px; top: 24px; position: absolute; width: 672px" styleClass="title1" title="title1" value="Add document/standard"/>
                        <ui:staticText id="staticText1" style="height: 24px; left: 264px; top: 240px; position: absolute; width: 142px" text="Standard Type"/>
                        <ui:dropDown binding="#{PipeFlow$StandardDB$AddStandard.standardTypeDropDown}"
                            converter="#{PipeFlow$StandardDB$AddStandard.integerConverter1}" id="standardTypeDropDown"
                            items="#{PipeFlow$StandardDB$AddStandard.standardTypeDropDownDefaultOptions.options}" onChange=""
                            style="height: 24px; left: 408px; top: 240px; position: absolute; width: 312px" valueChangeListener="#{PipeFlow$StandardDB$AddStandard.standardTypeDropDown_processValueChange}"/>
                        <ui:staticText id="staticText2" style="height: 24px; left: 264px; top: 288px; position: absolute; width: 142px" text="Standard Subject"/>
                        <ui:dropDown binding="#{PipeFlow$StandardDB$AddStandard.standardSubjectDropDown1}"
                            converter="#{PipeFlow$StandardDB$AddStandard.integerConverter1}" id="standardSubjectDropDown1"
                            items="#{PipeFlow$StandardDB$AddStandard.standardSubjectDropDownDefaultOptions.options}" onChange=""
                            style="height: 24px; left: 408px; top: 288px; position: absolute; width: 312px" valueChangeListener="#{PipeFlow$StandardDB$AddStandard.standardSubjectDropDown_processValueChange}"/>
                        <ui:button action="#{PipeFlow$StandardDB$AddStandard.uploadButton_action}" id="uploadButton"
                            style="height: 24px; left: 407px; top: 456px; position: absolute; width: 73px" text="Upload"/>
                        <ui:textField binding="#{PipeFlow$StandardDB$AddStandard.documentNameTextField}" id="documentNameTextField" style="height: 24px; left: 408px; top: 96px; position: absolute; width: 312px"/>
                        <ui:staticText id="staticText3" style="height: 24px; left: 264px; top: 96px; position: absolute; width: 142px" text="Name"/>
                        <ui:staticText id="staticText4" style="height: 24px; left: 264px; top: 384px; position: absolute; width: 142px" text="Select file"/>
                        <ui:upload binding="#{PipeFlow$StandardDB$AddStandard.fileUpload1}" id="fileUpload1" style="height: 24px; left: 408px; top: 384px; position: absolute; width: 312px"/>
                        <ui:messageGroup id="messageGroup1" style="position: absolute; left: 768px; top: 72px; width: 240px; height: 120px"/>
                        <ui:staticText id="staticText5" style="height: 24px; left: 264px; top: 144px; position: absolute; width: 142px" text="Text"/>
                        <ui:textArea binding="#{PipeFlow$StandardDB$AddStandard.documentTextInfo}" id="documentTextInfo" style="position: absolute; left: 408px; top: 144px; width: 312px; height: 72px"/>
                        <ui:staticText id="staticText6" style="height: 24px; left: 264px; top: 336px; position: absolute; width: 142px" text="Link"/>
                        <ui:textField binding="#{PipeFlow$StandardDB$AddStandard.httpTextField}" id="httpTextField" style="position: absolute; left: 408px; top: 336px; width: 312px; height: 24px"/>
                        <div style="position: absolute; left: 24px; top: 216px; width: 192px; height: 72px">
                            <jsp:directive.include file="../PipeFlowLeftMenuPage.jspf"/>
                        </div>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
