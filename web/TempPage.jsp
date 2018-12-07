<?xml version="1.0" encoding="windows-1252"?>
<!-- 
    Document   : TempPage
    Created on : 18.sep.2015, 12:00:26
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
                        <ui:table id="table1" style="height: 264px; left: 144px; top: 96px; position: absolute; width: 100%" width="750">
                            <ui:tableRowGroup id="tableRowGroup1" rows="10" sourceData="#{TempPage.companyDataProvider}" sourceVar="currentRow">
                                <ui:tableColumn headerText="ID" id="tableColumn1" sort="company.ID">
                                    <ui:staticText id="staticText1" text="#{currentRow.value['company.ID']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn headerText="NAME" id="tableColumn2" sort="company.NAME" width="101">
                                    <ui:staticText id="staticText2" text="#{currentRow.value['company.NAME']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn headerText="LICENCETYPE" id="tableColumn3" sort="company.LICENCETYPE">
                                    <ui:staticText id="staticText3" text="#{currentRow.value['company.LICENCETYPE']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn headerText="LICENCEEXPDATE" id="tableColumn4" sort="company.LICENCEEXPDATE">
                                    <ui:staticText id="staticText4" text="#{currentRow.value['company.LICENCEEXPDATE']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn headerText="NUMBEROFUSERS" id="tableColumn5" sort="company.NUMBEROFUSERS">
                                    <ui:staticText id="staticText5" text="#{currentRow.value['company.NUMBEROFUSERS']}"/>
                                </ui:tableColumn>
                            </ui:tableRowGroup>
                        </ui:table>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
