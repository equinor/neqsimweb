<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{Thermo$ReadFluidDB.page1}" id="page1">
            <ui:html binding="#{Thermo$ReadFluidDB.html1}" id="html1">
                <ui:head binding="#{Thermo$ReadFluidDB.head1}" id="head1">
                    <ui:link binding="#{Thermo$ReadFluidDB.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{Thermo$ReadFluidDB.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{Thermo$ReadFluidDB.form1}" id="form1">
                        <h:graphicImage binding="#{Thermo$ReadFluidDB.image1}" height="192" id="image1" style="left: 24px; top: 24px; position: absolute"
                            value="/resources/neqsim_logo.jpg" width="192"/>
                        <h:outputText binding="#{Thermo$ReadFluidDB.outputText1}" id="outputText1"
                            style="height: 24px; left: 264px; top: 24px; position: absolute; width: 478px" styleClass="title1" value="Fluid Database"/>
                        <ui:table augmentTitle="false" binding="#{Thermo$ReadFluidDB.table1}" id="table1" paginateButton="true" paginationControls="true"
                            style="height: 236px; left: 264px; top: 120px; position: absolute; visibility: visible; display:inline" title="Fluids Overview" width="1103">
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
                            <ui:tableRowGroup binding="#{Thermo$ReadFluidDB.tableRowGroup1}" id="tableRowGroup1" rows="26"
                                sourceData="#{Thermo$ReadFluidDB.fluidinfoFullTableDataProvider}" sourceVar="currentRow">
                                <ui:tableColumn headerText="ID" id="tableColumn7" sort="fluidinfo.ID">
                                    <ui:staticText id="staticText6" text="#{currentRow.value['fluidinfo.ID']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{Thermo$ReadFluidDB.tableColumn1}" headerText="FIELD/PLANT" id="tableColumn1" sort="fluidinfo.FIELD">
                                    <ui:staticText binding="#{Thermo$ReadFluidDB.staticText1}" id="staticText1" text="#{currentRow.value['fluidinfo.FIELD']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{Thermo$ReadFluidDB.tableColumn2}" headerText="WELL/SYSTEM" id="tableColumn2" sort="fluidinfo.WELL">
                                    <ui:staticText binding="#{Thermo$ReadFluidDB.staticText2}" id="staticText2" text="#{currentRow.value['fluidinfo.WELL']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{Thermo$ReadFluidDB.tableColumn3}" headerText="TEST" id="tableColumn3" sort="fluidinfo.TEST">
                                    <ui:staticText binding="#{Thermo$ReadFluidDB.staticText3}" id="staticText3" text="#{currentRow.value['fluidinfo.TEST']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{Thermo$ReadFluidDB.tableColumn4}" headerText="SAMPLE" id="tableColumn4" sort="fluidinfo.SAMPLE">
                                    <ui:staticText binding="#{Thermo$ReadFluidDB.staticText4}" id="staticText4" text="#{currentRow.value['fluidinfo.SAMPLE']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{Thermo$ReadFluidDB.tableColumn9}" headerText="OWNER" id="tableColumn9" sort="userdb.USERNAME">
                                    <ui:staticText binding="#{Thermo$ReadFluidDB.staticText5}" id="staticText5" text="#{currentRow.value['userdb.USERNAME']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn align="center" binding="#{Thermo$ReadFluidDB.tableColumn10}" headerText="SHARED" id="tableColumn10" onClick=""
                                    sort="fluidinfo.SHARED" width="81">
                                    <ui:checkbox binding="#{Thermo$ReadFluidDB.checkbox2}" id="checkbox2" onChange=""
                                        selected="#{currentRow.value['fluidinfo.SHARED']}" toolTip="Mark to share fluid with other users" valueChangeListener="#{Thermo$ReadFluidDB.checkbox2_processValueChange}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{Thermo$ReadFluidDB.tableColumn8}" headerText="EXP. DATA" id="tableColumn8">
                                    <ui:button action="#{Thermo$ReadFluidDB.button4_action}" binding="#{Thermo$ReadFluidDB.button4}" id="button4" text="View/Add"/>
                                </ui:tableColumn>
                                <ui:tableColumn headerText="PVTdata" id="tableColumn12">
                                    <ui:button action="#{Thermo$ReadFluidDB.button3_action}" id="button3" text="View/Add"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{Thermo$ReadFluidDB.tableColumn5}" headerText="DELETE" id="tableColumn5" width="30">
                                    <ui:button action="#{Thermo$ReadFluidDB.button1_action}" binding="#{Thermo$ReadFluidDB.button1}" id="button1" text="Delete"/>
                                </ui:tableColumn>
                                <ui:tableColumn headerText="DUPLICATE" id="tableColumn11" width="30">
                                    <ui:button action="#{Thermo$ReadFluidDB.dupbutton_action}" id="dupbutton" text="Duplicate"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{Thermo$ReadFluidDB.tableColumn6}" headerText="OPEN" id="tableColumn6" width="30">
                                    <ui:button action="#{Thermo$ReadFluidDB.button2_action}" binding="#{Thermo$ReadFluidDB.button2}" id="button2" text="Open"/>
                                </ui:tableColumn>
                            </ui:tableRowGroup>
                        </ui:table>
                        <ui:messageGroup binding="#{Thermo$ReadFluidDB.messageGroup1}" id="messageGroup1" style="height: 94px; left: 1392px; top: 96px; position: absolute"/>
                        <ui:button action="#{Thermo$ReadFluidDB.button5_action}" binding="#{Thermo$ReadFluidDB.button5}" id="button5"
                            style="height: 24px; left: 263px; top: 72px; position: absolute; width: 120px" text="Create new fluid"/>
                        <div style="position: absolute; left: 24px; top: 216px; width: 168px; height: 120px">
                            <jsp:directive.include file="ThermoMenu.jspf"/>
                        </div>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
