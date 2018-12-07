<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{Thermo$testP.page1}" id="page1">
            <ui:html binding="#{Thermo$testP.html1}" id="html1">
                <ui:head binding="#{Thermo$testP.head1}" id="head1">
                    <ui:link binding="#{Thermo$testP.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{Thermo$testP.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{Thermo$testP.form1}" id="form1" virtualFormsConfig="">
                        <ui:table augmentTitle="false" binding="#{Thermo$testP.table1}" id="table1"
                            style="height: 552px; left: 48px; top: 48px; position: absolute; width: 1440px" title="Table" width="1440">
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
                            <ui:tableRowGroup binding="#{Thermo$testP.tableRowGroup1}" id="tableRowGroup1" rows="10"
                                sourceData="#{Thermo$testP.litteratureDataProvider1}" sourceVar="currentRow">
                                <ui:tableColumn binding="#{Thermo$testP.tableColumn1}" headerText="ID" id="tableColumn1" sort="litterature.ID">
                                    <ui:staticText binding="#{Thermo$testP.staticText1}" id="staticText1" text="#{currentRow.value['litterature.ID']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{Thermo$testP.tableColumn2}" headerText="FLUID_ID" id="tableColumn2" sort="litterature.FLUID_ID">
                                    <ui:staticText binding="#{Thermo$testP.staticText2}" id="staticText2" text="#{currentRow.value['litterature.FLUID_ID']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{Thermo$testP.tableColumn3}" headerText="FILE" id="tableColumn3" sort="litterature.FILE">
                                    <ui:staticText binding="#{Thermo$testP.staticText3}" id="staticText3" text="#{currentRow.value['litterature.FILE']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{Thermo$testP.tableColumn4}" headerText="NAME" id="tableColumn4" sort="litterature.NAME">
                                    <ui:staticText binding="#{Thermo$testP.staticText4}" id="staticText4" text="#{currentRow.value['litterature.NAME']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{Thermo$testP.tableColumn5}" headerText="TEXT" id="tableColumn5" sort="litterature.TEXT">
                                    <ui:staticText binding="#{Thermo$testP.staticText5}" id="staticText5" text="#{currentRow.value['litterature.TEXT']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{Thermo$testP.tableColumn6}" headerText="EXPTYPEID" id="tableColumn6" sort="litterature.EXPTYPEID">
                                    <ui:staticText binding="#{Thermo$testP.staticText6}" id="staticText6" text="#{currentRow.value['litterature.EXPTYPEID']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{Thermo$testP.tableColumn7}" headerText="TYPE" id="tableColumn7" sort="litterature.TYPE">
                                    <ui:staticText binding="#{Thermo$testP.staticText7}" id="staticText7" text="#{currentRow.value['litterature.TYPE']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{Thermo$testP.tableColumn8}" headerText="ARTICLEID" id="tableColumn8" sort="litterature.ARTICLEID">
                                    <ui:staticText binding="#{Thermo$testP.staticText8}" id="staticText8" text="#{currentRow.value['litterature.ARTICLEID']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{Thermo$testP.tableColumn9}" headerText="MINTEMPERATURE" id="tableColumn9" sort="litterature.MINTEMPERATURE">
                                    <ui:staticText binding="#{Thermo$testP.staticText9}" id="staticText9" text="#{currentRow.value['litterature.MINTEMPERATURE']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{Thermo$testP.tableColumn10}" headerText="MAXTEMPERATURE" id="tableColumn10" sort="litterature.MAXTEMPERATURE">
                                    <ui:staticText binding="#{Thermo$testP.staticText10}" id="staticText10" text="#{currentRow.value['litterature.MAXTEMPERATURE']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{Thermo$testP.tableColumn11}" headerText="MINPRESSURE" id="tableColumn11" sort="litterature.MINPRESSURE">
                                    <ui:staticText binding="#{Thermo$testP.staticText11}" id="staticText11" text="#{currentRow.value['litterature.MINPRESSURE']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{Thermo$testP.tableColumn12}" headerText="MAXPRESSURE" id="tableColumn12" sort="litterature.MAXPRESSURE">
                                    <ui:staticText binding="#{Thermo$testP.staticText12}" id="staticText12" text="#{currentRow.value['litterature.MAXPRESSURE']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{Thermo$testP.tableColumn13}" headerText="tableColumn13" id="tableColumn13">
                                    <ui:button action="#{Thermo$testP.button1_action}" binding="#{Thermo$testP.button1}" id="button1" text="text"/>
                                </ui:tableColumn>
                            </ui:tableRowGroup>
                        </ui:table>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
