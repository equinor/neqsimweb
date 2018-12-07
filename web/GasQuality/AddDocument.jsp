<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{GasQuality$AddDocument.page1}" id="page1">
            <ui:html binding="#{GasQuality$AddDocument.html1}" id="html1">
                <ui:head binding="#{GasQuality$AddDocument.head1}" id="head1">
                    <ui:link binding="#{GasQuality$AddDocument.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{GasQuality$AddDocument.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{GasQuality$AddDocument.form1}" id="form1">
                        <h:graphicImage binding="#{GasQuality$AddDocument.image1}" height="192" id="image1" style="left: 24px; top: 24px; position: absolute"
                            value="/resources/neqsim_logo.jpg" width="192"/>
                        <h:outputText binding="#{GasQuality$AddDocument.logoOutputText1}" id="logoOutputText1"
                            style="font-size: 24; height: 25px; left: 264px; top: 24px; position: absolute; width: 214px" styleClass="/resources/stylesheet.css"
                            title="title1" value="Add Document"/>
                        <ui:dropDown binding="#{GasQuality$AddDocument.expTypeDropDown}" converter="#{GasQuality$AddDocument.expTypeDropDownConverter}"
                            id="expTypeDropDown" items="#{GasQuality$AddDocument.documenttypeDataProvider.options['documenttype.ID,documenttype.NAME']}" style="height: 24px; left: 360px; top: 144px; position: absolute; width: 216px"/>
                        <ui:staticText binding="#{GasQuality$AddDocument.staticText1}" id="staticText1"
                            style="position: absolute; left: 240px; top: 144px; width: 96px; height: 24px" text="Document type"/>
                        <ui:upload binding="#{GasQuality$AddDocument.fileUpload1}" id="fileUpload1" style="position: absolute; left: 240px; top: 96px; width: 336px; height: 24px"/>
                        <ui:button action="#{GasQuality$AddDocument.button1_action}" binding="#{GasQuality$AddDocument.button1}" id="button1"
                            style="height: 24px; left: 335px; top: 360px; position: absolute; width: 96px" text="Add"/>
                        <ui:staticText binding="#{GasQuality$AddDocument.staticText2}" id="staticText2"
                            style="height: 22px; left: 240px; top: 192px; position: absolute; width: 238px" text="Document information/key words:"/>
                        <ui:textField binding="#{GasQuality$AddDocument.fileInformationTextArea}" id="fileInformationTextArea" style="height: 96px; left: 240px; top: 216px; position: absolute; width: 336px"/>
                        <ui:messageGroup binding="#{GasQuality$AddDocument.messageGroup1}" id="messageGroup1" style="position: absolute; left: 600px; top: 96px; width: 336px; height: 216px"/>
                        <ui:table augmentTitle="false" binding="#{GasQuality$AddDocument.table1}" id="table1"
                            style="height: 240px; left: 240px; top: 432px; position: absolute; width: 314px" title="Table" width="314">
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
                            <ui:tableRowGroup binding="#{GasQuality$AddDocument.tableRowGroup1}" id="tableRowGroup1" rows="10"
                                sourceData="#{GasQuality$AddDocument.documentsDataProviderWithInfo}" sourceVar="currentRow">
                                <ui:tableColumn binding="#{GasQuality$AddDocument.tableColumn1}" headerText="ID" id="tableColumn1" sort="documents.ID">
                                    <ui:staticText binding="#{GasQuality$AddDocument.staticText3}" id="staticText3" text="#{currentRow.value['documents.ID']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{GasQuality$AddDocument.tableColumn2}" headerText="FILEID" id="tableColumn2" sort="documents.FILEID" width="70">
                                    <ui:staticText binding="#{GasQuality$AddDocument.staticText4}" id="staticText4" text="#{currentRow.value['documents.FILEID']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{GasQuality$AddDocument.tableColumn5}" headerText="TEXT" id="tableColumn5" sort="documents.TEXT">
                                    <ui:staticText binding="#{GasQuality$AddDocument.staticText5}" id="staticText5" text="#{currentRow.value['documents.TEXT']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{GasQuality$AddDocument.tableColumn3}" headerText="DELETE" id="tableColumn3">
                                    <ui:button binding="#{GasQuality$AddDocument.button2}" id="button2" text="Delete"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{GasQuality$AddDocument.tableColumn4}" headerText="OPEN" id="tableColumn4">
                                    <ui:button action="#{GasQuality$AddDocument.button3_action}" binding="#{GasQuality$AddDocument.button3}" id="button3" text="Open"/>
                                </ui:tableColumn>
                            </ui:tableRowGroup>
                        </ui:table>
                        <div style="position: absolute; left: 24px; top: 216px; width: 168px; height: 72px">
                            <jsp:directive.include file="GasQualityMenu.jspf"/>
                        </div>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
