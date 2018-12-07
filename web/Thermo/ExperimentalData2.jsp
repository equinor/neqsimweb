<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{Thermo$ExperimentalData2.page1}" id="page1">
            <ui:html binding="#{Thermo$ExperimentalData2.html1}" id="html1">
                <ui:head binding="#{Thermo$ExperimentalData2.head1}" id="head1">
                    <ui:link binding="#{Thermo$ExperimentalData2.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{Thermo$ExperimentalData2.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{Thermo$ExperimentalData2.form1}" id="form1" virtualFormsConfig="">
                        <h:graphicImage binding="#{Thermo$ExperimentalData2.image1}" height="192" id="image1" style="left: 24px; top: 24px; position: absolute"
                            value="/resources/neqsim_logo.jpg" width="192"/>
                        <ui:upload binding="#{Thermo$ExperimentalData2.fileUpload1}" id="fileUpload1" style="left: 264px; top: 120px; position: absolute" valueChangeListener="#{Thermo$ExperimentalData2.fileUpload1_processValueChange}"/>
                        <ui:button action="#{Thermo$ExperimentalData2.button1_action}" binding="#{Thermo$ExperimentalData2.button1}" id="button1"
                            style="height: 24px; left: 335px; top: 411px; position: absolute; width: 144px" text="Transfer File"/>
                        <ui:staticText binding="#{Thermo$ExperimentalData2.staticText2}" id="staticText2" style="left: 264px; top: 24px; position: absolute"
                            styleClass="title1" text="View/Add Experimental Data"/>
                        <ui:staticText binding="#{Thermo$ExperimentalData2.staticText3}" id="staticText3"
                            style="height: 24px; left: 264px; top: 96px; position: absolute; width: 336px" styleClass="body-text" text="Select file"/>
                        <ui:staticText binding="#{Thermo$ExperimentalData2.staticText4}" id="staticText4"
                            style="height: 24px; left: 264px; top: 192px; position: absolute; width: 336px" styleClass="body-text" text="Document name, key words and general information"/>
                        <ui:staticText binding="#{Thermo$ExperimentalData2.staticText7}" id="staticText7"
                            style="height: 24px; left: 264px; top: 144px; position: absolute; width: 336px" styleClass="body-text" text="Select experimental data type"/>
                        <ui:textArea binding="#{Thermo$ExperimentalData2.fileInformationTextArea}" id="fileInformationTextArea" style="height: 72px; left: 264px; top: 216px; position: absolute; width: 336px"/>
                        <ui:dropDown binding="#{Thermo$ExperimentalData2.expTypeDropDown}" converter="#{Thermo$ExperimentalData2.expTypeDropDownConverter}"
                            id="expTypeDropDown"
                            items="#{Thermo$ExperimentalData2.experimentaldatatypeDataProvider.options['experimentaldatatype.ID,experimentaldatatype.TYPE']}" style="left: 264px; top: 168px; position: absolute; width: 336px"/>
                        <ui:table augmentTitle="false" binding="#{Thermo$ExperimentalData2.table1}" id="table1"
                            style="left: 264px; top: 459px; position: absolute; width: 322px" title="Experimental Data" width="189">
                            <script><![CDATA[
/* ----- Functions for Table Preferences Panel ----- */
/*
 * Toggle the table preferences panel open or closed
 */
function togglePreferencesPanel() {
  var table = document.getElementById("form1:table1");
  table.toggleTblePreferencesPanel();
}
/* ----- Functions for Filter Panel ----- */
/*
 * Return true if the filter menu has actually changed,
 * so the corresponding event should be allowed to continue.
 */
function filterMenuChanged() {
  var table = document.getElementById("form1:table1");
  return table.filterMenuChanged();
}
/*
 * Toggle the custom filter panel (if any) open or closed.
 */
function toggleFilterPanel() {
  var table = document.getElementById("form1:table1");
  return table.toggleTableFilterPanel();
}
/* ----- Functions for Table Actions ----- */
/*
 * Initialize all rows of the table when the state
 * of selected rows changes.
 */
function initAllRows() {
  var table = document.getElementById("form1:table1");
  table.initAllRows();
}
/*
 * Set the selected state for the given row groups
 * displayed in the table.  This functionality requires
 * the 'selectId' of the tableColumn to be set.
 *
 * @param rowGroupId HTML element id of the tableRowGroup component
 * @param selected Flag indicating whether components should be selected
 */
function selectGroupRows(rowGroupId, selected) {
  var table = document.getElementById("form1:table1");
  table.selectGroupRows(rowGroupId, selected);
}
/*
 * Disable all table actions if no rows have been selected.
 */
function disableActions() {
  // Determine whether any rows are currently selected
  var table = document.getElementById("form1:table1");
  var disabled = (table.getAllSelectedRowsCount() > 0) ? false : true;
  // Set disabled state for top actions
  document.getElementById("form1:table1:tableActionsTop:deleteTop").setDisabled(disabled);
  // Set disabled state for bottom actions
  document.getElementById("form1:table1:tableActionsBottom:deleteBottom").setDisabled(disabled);
}]]></script>
                            <ui:tableRowGroup binding="#{Thermo$ExperimentalData2.tableRowGroup1}" id="tableRowGroup1" rows="10"
                                sourceData="#{Thermo$ExperimentalData2.litteratureDataProvider}" sourceVar="currentRow">
                                <ui:tableColumn binding="#{Thermo$ExperimentalData2.tableColumn1}" headerText="ID" id="tableColumn1" sort="litterature.ID">
                                    <ui:staticText binding="#{Thermo$ExperimentalData2.staticText1}" id="staticText1" text="#{currentRow.value['litterature.ID']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{Thermo$ExperimentalData2.tableColumn4}" headerText="DOCUMENT-INFO (NAME,KEYWORDS)" id="tableColumn4" sort="litterature.TEXT">
                                    <ui:staticText binding="#{Thermo$ExperimentalData2.staticText8}" id="staticText8" text="#{currentRow.value['litterature.TEXT']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{Thermo$ExperimentalData2.tableColumn2}" headerText="TYPE" id="tableColumn2" sort="experimentaldatatype.TYPE">
                                    <ui:staticText binding="#{Thermo$ExperimentalData2.staticText5}" id="staticText5" text="#{currentRow.value['experimentaldatatype.TYPE']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{Thermo$ExperimentalData2.tableColumn3}" headerText="FILE" id="tableColumn3" sort="litterature.NAME">
                                    <ui:staticText binding="#{Thermo$ExperimentalData2.staticText9}" id="staticText9" text="#{currentRow.value['litterature.NAME']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{Thermo$ExperimentalData2.tableColumn5}" headerText="EDIT" id="tableColumn5">
                                    <ui:button action="#{Thermo$ExperimentalData2.button4_action}" binding="#{Thermo$ExperimentalData2.button4}" id="button4" text="Edit"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{Thermo$ExperimentalData2.tableColumn7}" headerText="DELETE" id="tableColumn7" width="77">
                                    <ui:button action="#{Thermo$ExperimentalData2.button3_action}" binding="#{Thermo$ExperimentalData2.button3}" id="button3" text="Delete"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{Thermo$ExperimentalData2.tableColumn6}" headerText="OPEN" id="tableColumn6" width="74">
                                    <ui:button action="#{Thermo$ExperimentalData2.button2_action}" binding="#{Thermo$ExperimentalData2.button2}" id="button2" text="View"/>
                                </ui:tableColumn>
                            </ui:tableRowGroup>
                        </ui:table>
                        <div style="height: 144px; left: 24px; top: 216px; position: absolute; width: 192px">
                            <jsp:directive.include file="ThermoMenu.jspf"/>
                        </div>
                        <ui:panelLayout binding="#{Thermo$ExperimentalData2.detailsGridPanel}" id="detailsGridPanel"
                            style="height: 286px; left: 696px; top: 96px; position: absolute; width: 576px; -rave-layout: grid" styleClass="body-text">
                            <ui:staticText binding="#{Thermo$ExperimentalData2.staticText10}" id="staticText10" styleClass="body-text" text="Authors"/>
                            <ui:textField binding="#{Thermo$ExperimentalData2.authorTextField}" columns="50" id="authorTextField"
                                style="left: 1px; top: 25px; position: absolute; width: 456px" styleClass="textbox-normal"/>
                            <ui:staticText binding="#{Thermo$ExperimentalData2.staticText11}" id="staticText11"
                                style="position: absolute; left: 0px; top: 48px; width: 384px; height: 24px" styleClass="body-text" text="Title"/>
                            <ui:textField binding="#{Thermo$ExperimentalData2.articleTitleTextField}" id="articleTitleTextField"
                                style="left: 0px; top: 72px; position: absolute; width: 456px" styleClass="textbox-normal"/>
                            <ui:staticText binding="#{Thermo$ExperimentalData2.staticText6}" id="staticText6"
                                style="position: absolute; left: 0px; top: 96px; width: 96px; height: 24px" styleClass="body-text" text="Journal Name"/>
                            <ui:textField binding="#{Thermo$ExperimentalData2.journalNameTextField}" id="journalNameTextField"
                                style="left: 0px; top: 120px; position: absolute; width: 456px" styleClass="textbox-normal"/>
                            <ui:staticText binding="#{Thermo$ExperimentalData2.staticText12}" id="staticText12"
                                style="height: 24px; left: 0px; top: 144px; position: absolute; width: 216px" styleClass="body-text" text="Volume"/>
                            <ui:textField binding="#{Thermo$ExperimentalData2.volumeTextField}" columns="10" id="volumeTextField"
                                style="left: 0px; top: 168px; position: absolute; width: 216px" styleClass="textbox-normal"/>
                            <ui:staticText binding="#{Thermo$ExperimentalData2.staticText13}" id="staticText13"
                                style="position: absolute; left: 0px; top: 192px; width: 216px; height: 24px" styleClass="body-text" text="Pages"/>
                            <ui:textField binding="#{Thermo$ExperimentalData2.pageTextField}" id="pageTextField"
                                style="left: 0px; top: 216px; position: absolute; width: 216px" styleClass="textbox-normal"/>
                            <ui:staticText binding="#{Thermo$ExperimentalData2.staticText14}" id="staticText14"
                                style="position: absolute; left: 0px; top: 240px; width: 216px; height: 24px" styleClass="body-text" text="Year"/>
                            <ui:textField binding="#{Thermo$ExperimentalData2.yearTextField}" id="yearTextField"
                                style="left: 0px; top: 264px; position: absolute; width: 216px" styleClass="textbox-normal"/>
                        </ui:panelLayout>
                        <ui:staticText binding="#{Thermo$ExperimentalData2.staticText15}" id="staticText15"
                            style="height: 24px; left: 264px; top: 288px; position: absolute; width: 264px" styleClass="body-text" text="Temperature range"/>
                        <ui:textField binding="#{Thermo$ExperimentalData2.minTempTextField}" id="minTempTextField"
                            style="left: 264px; top: 312px; position: absolute; width: 120px" styleClass="textbox-normal" text="0"/>
                        <ui:staticText binding="#{Thermo$ExperimentalData2.staticText16}" id="staticText16"
                            style="height: 22px; left: 408px; top: 312px; position: absolute; width: 22px" styleClass="body-text" text="to"/>
                        <ui:textField binding="#{Thermo$ExperimentalData2.maxTempTextField}" id="maxTempTextField"
                            style="left: 456px; top: 312px; position: absolute; width: 120px" styleClass="textbox-normal" text="1000"/>
                        <ui:staticText binding="#{Thermo$ExperimentalData2.staticText17}" id="staticText17"
                            style="height: 22px; left: 600px; top: 312px; position: absolute; width: 46px" styleClass="body-text" text="[°C]"/>
                        <ui:staticText binding="#{Thermo$ExperimentalData2.staticText18}" id="staticText18"
                            style="height: 24px; left: 264px; top: 336px; position: absolute; width: 264px" styleClass="body-text" text="Pressure range"/>
                        <ui:staticText binding="#{Thermo$ExperimentalData2.staticText19}" id="staticText19"
                            style="height: 22px; left: 408px; top: 360px; position: absolute; width: 22px" styleClass="body-text" text="to"/>
                        <ui:textField binding="#{Thermo$ExperimentalData2.maxPresTextField}" id="maxPresTextField"
                            style="left: 456px; top: 360px; position: absolute; width: 120px" styleClass="textbox-normal" text="1000"/>
                        <ui:staticText binding="#{Thermo$ExperimentalData2.staticText20}" id="staticText20"
                            style="height: 22px; left: 600px; top: 360px; position: absolute; width: 22px" styleClass="body-text" text="[bara]"/>
                        <ui:textField binding="#{Thermo$ExperimentalData2.minPresTextField}" id="minPresTextField"
                            style="left: 264px; top: 360px; position: absolute; width: 120px" styleClass="textbox-normal" text="0"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
