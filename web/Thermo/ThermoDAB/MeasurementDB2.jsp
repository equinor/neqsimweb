<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{Thermo$ThermoDAB$MeasurementDB2.page1}" id="page1">
            <ui:html binding="#{Thermo$ThermoDAB$MeasurementDB2.html1}" id="html1">
                <ui:head binding="#{Thermo$ThermoDAB$MeasurementDB2.head1}" id="head1">
                    <ui:link binding="#{Thermo$ThermoDAB$MeasurementDB2.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{Thermo$ThermoDAB$MeasurementDB2.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{Thermo$ThermoDAB$MeasurementDB2.form1}" id="form1">
                        <h:graphicImage binding="#{Thermo$ThermoDAB$MeasurementDB2.image1}" height="192" id="image1"
                            style="left: 24px; top: 24px; position: absolute" value="/resources/neqsim_logo.jpg" width="194"/>
                        <h:outputText binding="#{Thermo$ThermoDAB$MeasurementDB2.topMenuText1}" id="topMenuText1"
                            style="font-size: 24px; height: 23px; left: 264px; top: 24px; position: absolute; width: 408px"
                            styleClass="title1 resources/stylesheet.css" title="title1" value="Measurement Database"/>
                        <ui:table augmentTitle="false" binding="#{Thermo$ThermoDAB$MeasurementDB2.table1}" id="table1"
                            style="position: absolute; left: 264px; top: 72px; height: 216px;display: inline" title="Table" width="214">
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
                            <ui:tableRowGroup binding="#{Thermo$ThermoDAB$MeasurementDB2.tableRowGroup1}" id="tableRowGroup1" rows="10"
                                sourceData="#{Thermo$ThermoDAB$MeasurementDB2.litteratureDataProvider}" sourceVar="currentRow">
                                <ui:tableColumn binding="#{Thermo$ThermoDAB$MeasurementDB2.tableColumn1}" headerText="ID" id="tableColumn1"
                                    sort="litterature.ID" width="46">
                                    <ui:staticText binding="#{Thermo$ThermoDAB$MeasurementDB2.staticText1}" id="staticText1" text="#{currentRow.value['litterature.ID']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{Thermo$ThermoDAB$MeasurementDB2.tableColumn2}" headerText="NAME" id="tableColumn2" sort="litterature.NAME">
                                    <ui:staticText binding="#{Thermo$ThermoDAB$MeasurementDB2.staticText2}" id="staticText2" text="#{currentRow.value['litterature.NAME']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{Thermo$ThermoDAB$MeasurementDB2.tableColumn5}" headerText="DOCUMENT-INFO (NAME,KEYWORDS)"
                                    id="tableColumn5" sort="litterature.TEXT">
                                    <ui:staticText binding="#{Thermo$ThermoDAB$MeasurementDB2.staticText3}" id="staticText3" text="#{currentRow.value['litterature.TEXT']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{Thermo$ThermoDAB$MeasurementDB2.tableColumn6}" headerText="TYPE" id="tableColumn6" sort="experimentaldatatype.TYPE">
                                    <ui:staticText binding="#{Thermo$ThermoDAB$MeasurementDB2.staticText4}" id="staticText4" text="#{currentRow.value['experimentaldatatype.TYPE']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{Thermo$ThermoDAB$MeasurementDB2.tableColumn3}" headerText="FIELD" id="tableColumn3" sort="fluidinfo.FIELD">
                                    <ui:staticText binding="#{Thermo$ThermoDAB$MeasurementDB2.staticText6}" id="staticText6" text="#{currentRow.value['fluidinfo.FIELD']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{Thermo$ThermoDAB$MeasurementDB2.tableColumn7}" headerText="AUTHOR" id="tableColumn7" sort="literatureandarticlestable.AUTHOR">
                                    <ui:staticText binding="#{Thermo$ThermoDAB$MeasurementDB2.staticText5}" id="staticText5" text="#{currentRow.value['literatureandarticlestable.AUTHOR']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{Thermo$ThermoDAB$MeasurementDB2.tableColumn10}" headerText="JOURNAL" id="tableColumn10" sort="literatureandarticlestable.JOURNAL">
                                    <ui:staticText binding="#{Thermo$ThermoDAB$MeasurementDB2.staticText9}" id="staticText9" text="#{currentRow.value['literatureandarticlestable.JOURNAL']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{Thermo$ThermoDAB$MeasurementDB2.tableColumn11}" headerText="VOLUME" id="tableColumn11" sort="literatureandarticlestable.VOLUME">
                                    <ui:staticText binding="#{Thermo$ThermoDAB$MeasurementDB2.staticText10}" id="staticText10" text="#{currentRow.value['literatureandarticlestable.VOLUME']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{Thermo$ThermoDAB$MeasurementDB2.tableColumn12}" headerText="PAGES" id="tableColumn12" sort="literatureandarticlestable.PAGES">
                                    <ui:staticText binding="#{Thermo$ThermoDAB$MeasurementDB2.staticText11}" id="staticText11" text="#{currentRow.value['literatureandarticlestable.PAGES']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{Thermo$ThermoDAB$MeasurementDB2.tableColumn13}" headerText="YEAR" id="tableColumn13" sort="literatureandarticlestable.YEAR">
                                    <ui:staticText binding="#{Thermo$ThermoDAB$MeasurementDB2.staticText12}" id="staticText12" text="#{currentRow.value['literatureandarticlestable.YEAR']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{Thermo$ThermoDAB$MeasurementDB2.tableColumn9}" headerText="OWNER" id="tableColumn9" sort="userdb.USERNAME">
                                    <ui:staticText binding="#{Thermo$ThermoDAB$MeasurementDB2.staticText7}" id="staticText7" text="#{currentRow.value['userdb.USERNAME']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{Thermo$ThermoDAB$MeasurementDB2.tableColumn8}" headerText="EDIT" id="tableColumn8">
                                    <ui:button action="#{Thermo$ThermoDAB$MeasurementDB2.button1_action}" binding="#{Thermo$ThermoDAB$MeasurementDB2.button1}"
                                        id="button1" text="Edit"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{Thermo$ThermoDAB$MeasurementDB2.tableColumn4}" headerText="OPEN" id="tableColumn4">
                                    <ui:button action="#{Thermo$ThermoDAB$MeasurementDB2.button2_action}" binding="#{Thermo$ThermoDAB$MeasurementDB2.button2}"
                                        id="button2" text="Open"/>
                                </ui:tableColumn>
                            </ui:tableRowGroup>
                        </ui:table>
                        <div style="position: absolute; left: 24px; top: 216px; width: 192px; height: 216px">
                            <jsp:directive.include file="DatabaseMenu.jspf"/>
                        </div>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
