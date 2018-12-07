<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{Login.page1}" id="page1">
            <ui:html binding="#{Login.html1}" id="html1">
                <ui:head binding="#{Login.head1}" id="head1">
                    <ui:link binding="#{Login.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{Login.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{Login.form1}" id="form1" virtualFormsConfig="resetForm | | reset">
                        <ui:textField binding="#{Login.userName}" columns="25" id="userName" label="Username" required="true"
                            style="left: 240px; top: 168px; position: absolute; width: 334px" styleClass="" tabIndex="2"
                            text="#{Login.loginDP.value['username']}" toolTip="Please type in your username" trim="false" valueChangeListener="#{Login.userName_processValueChange}"/>
                        <ui:passwordField binding="#{Login.password}" columns="25" id="password" label="Password" password="#{Login.loginDP.value['password']}"
                            style="left: 240px; top: 216px; position: absolute; width: 336px" tabIndex="3" toolTip="Please type your password"/>
                        <ui:button action="#{Login.login_action}" binding="#{Login.login}" id="login"
                            style="height: 24px; left: 335px; top: 288px; position: absolute; width: 72px" tabIndex="4" text="Login" toolTip="Click to validate"/>
                        <ui:button action="#{Login.reset_action}" binding="#{Login.reset}" id="reset"
                            style="height: 24px; left: 431px; top: 288px; position: absolute; width: 72px" tabIndex="5" text="Reset" toolTip="Click to reset"/>
                        <ui:message binding="#{Login.message1}" for="userName" id="message1" showDetail="false" showSummary="true" style="left: 600px; top: 168px; position: absolute"/>
                        <ui:message binding="#{Login.message2}" for="password" id="message2" showDetail="false" showSummary="true" style="left: 600px; top: 216px; position: absolute"/>
                        <ui:staticText binding="#{Login.wrongPassword}" id="wrongPassword" style="color: red; height: 24px; left: -96px; top: -24px; position: absolute; width: 216px"/>
                        <h:outputText id="topMenuText1" style="left: 240px; top: 24px; position: absolute; width: 672px" styleClass="title1" title="title1" value="NeqSim Web Login"/>
                        <h:graphicImage height="192" id="image1" style="left: 24px; top: 24px; position: absolute" value="/resources/neqsim_logo.jpg" width="192"/>
                        <ui:hyperlink id="hyperlink1" style="height: 22px; left: 24px; top: 240px; position: absolute; width: 190px" text="Create new user" url="mailto:esol@statoil.com?subject=Request%20for%20access%20to%20NeqSim%20Web"/>
                        <ui:staticText id="staticText1" style="position: absolute; left: 240px; top: 72px; width: 456px; height: 24px" text="Type in username and password to log on to server."/>
                        <ui:dropDown binding="#{Login.companyDropDown}" converter="#{Login.companyDropDownConverter}" id="companyDropDown"
                            items="#{Login.companyDataProvider.options['company.ID,company.NAME']}"
                            style="height: 24px; left: 312px; top: 120px; position: absolute; width: 168px" tabIndex="1" toolTip="Select your company"/>
                        <ui:staticText id="staticText2" style="font-weight: bold; height: 24px; left: 240px; top: 120px; position: absolute; width: 72px" text="  Company   "/>
                        <ui:staticText id="staticText3" style="height: 24px; left: 24px; top: 216px; position: absolute; width: 190px" text="Version: NeqSim 2014.1"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
