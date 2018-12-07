<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{GasQuality$AnalyserDB$AnalyseDB2.page1}" id="page1">
            <ui:html binding="#{GasQuality$AnalyserDB$AnalyseDB2.html1}" id="html1">
                <ui:head binding="#{GasQuality$AnalyserDB$AnalyseDB2.head1}" id="head1">
                    <ui:link binding="#{GasQuality$AnalyserDB$AnalyseDB2.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{GasQuality$AnalyserDB$AnalyseDB2.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{GasQuality$AnalyserDB$AnalyseDB2.form1}" id="form1">
                        <h:outputText binding="#{GasQuality$AnalyserDB$AnalyseDB2.topMenuText1}" id="topMenuText1"
                            style="font-size: 24; height: 23px; left: 264px; top: 24px; position: absolute; width: 408px" styleClass="/resources/stylesheet.css"
                            title="title1" value="Analyser DB"/>
                        <h:outputText binding="#{GasQuality$AnalyserDB$AnalyseDB2.outputText1}" id="outputText1"
                            style="font-weight: bold; height: 24px; left: 24px; top: 216px; position: absolute; width: 192px" value="Menu"/>
                        <h:commandLink action="#{GasQuality$AnalyserDB$AnalyseDB2.linkAction1_action}" binding="#{GasQuality$AnalyserDB$AnalyseDB2.linkAction1}"
                            id="linkAction1" style="height: 24px; left: 24px; top: 240px; position: absolute; width: 192px">
                            <h:outputText binding="#{GasQuality$AnalyserDB$AnalyseDB2.linkAction1Text1}" id="linkAction1Text1" value="Select Analyser"/>
                        </h:commandLink>
                        <h:graphicImage binding="#{GasQuality$AnalyserDB$AnalyseDB2.image1}" height="192" id="image1"
                            style="left: 24px; top: 24px; position: absolute" value="/resources/neqsim_logo.jpg" width="194"/>
                        <ui:table augmentTitle="false" binding="#{GasQuality$AnalyserDB$AnalyseDB2.table1}" id="table1"
                            style="position: absolute; left: 264px; top: 72px; height: 192px" title="Table" width="1800">
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
                            <ui:tableRowGroup binding="#{GasQuality$AnalyserDB$AnalyseDB2.tableRowGroup1}" id="tableRowGroup1" rows="10"
                                sourceData="#{GasQuality$AnalyserDB$AnalyseDB2.analysersDataProvider}" sourceVar="currentRow">
                                <ui:tableColumn binding="#{GasQuality$AnalyserDB$AnalyseDB2.tableColumn1}" headerText="ID" id="tableColumn1" sort="analysers.ID">
                                    <ui:staticText binding="#{GasQuality$AnalyserDB$AnalyseDB2.staticText1}" id="staticText1" text="#{currentRow.value['analysers.ID']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{GasQuality$AnalyserDB$AnalyseDB2.tableColumn2}" headerText="INSTRUMENTTYPE" id="tableColumn2" sort="analysers.INSTRUMENTTYPE">
                                    <ui:staticText binding="#{GasQuality$AnalyserDB$AnalyseDB2.staticText2}" id="staticText2" text="#{currentRow.value['analysers.INSTRUMENTTYPE']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{GasQuality$AnalyserDB$AnalyseDB2.tableColumn3}" headerText="STED" id="tableColumn3" sort="analysers.STED">
                                    <ui:staticText binding="#{GasQuality$AnalyserDB$AnalyseDB2.staticText3}" id="staticText3" text="#{currentRow.value['analysers.STED']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{GasQuality$AnalyserDB$AnalyseDB2.tableColumn4}" headerText="FORMAL" id="tableColumn4" sort="analysers.FORMAL">
                                    <ui:staticText binding="#{GasQuality$AnalyserDB$AnalyseDB2.staticText4}" id="staticText4" text="#{currentRow.value['analysers.FORMAL']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{GasQuality$AnalyserDB$AnalyseDB2.tableColumn5}" headerText="INSTRUMENT" id="tableColumn5" sort="analysers.INSTRUMENT">
                                    <ui:staticText binding="#{GasQuality$AnalyserDB$AnalyseDB2.staticText5}" id="staticText5" text="#{currentRow.value['analysers.INSTRUMENT']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{GasQuality$AnalyserDB$AnalyseDB2.tableColumn6}" headerText="ANTALL" id="tableColumn6" sort="analysers.ANTALL">
                                    <ui:staticText binding="#{GasQuality$AnalyserDB$AnalyseDB2.staticText6}" id="staticText6" text="#{currentRow.value['analysers.ANTALL']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{GasQuality$AnalyserDB$AnalyseDB2.tableColumn7}" headerText="PLASSERING" id="tableColumn7" sort="analysers.PLASSERING">
                                    <ui:staticText binding="#{GasQuality$AnalyserDB$AnalyseDB2.staticText7}" id="staticText7" text="#{currentRow.value['analysers.PLASSERING']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{GasQuality$AnalyserDB$AnalyseDB2.tableColumn8}" headerText="TAGNR" id="tableColumn8" sort="analysers.TAGNR">
                                    <ui:staticText binding="#{GasQuality$AnalyserDB$AnalyseDB2.staticText8}" id="staticText8" text="#{currentRow.value['analysers.TAGNR']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{GasQuality$AnalyserDB$AnalyseDB2.tableColumn9}" headerText="KALIBRERINGSRUTINER" id="tableColumn9" sort="analysers.KALIBRERINGSRUTINER">
                                    <ui:staticText binding="#{GasQuality$AnalyserDB$AnalyseDB2.staticText9}" id="staticText9" text="#{currentRow.value['analysers.KALIBRERINGSRUTINER']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{GasQuality$AnalyserDB$AnalyseDB2.tableColumn10}" headerText="VEDLIKEHOLDSRUTINER" id="tableColumn10" sort="analysers.VEDLIKEHOLDSRUTINER">
                                    <ui:staticText binding="#{GasQuality$AnalyserDB$AnalyseDB2.staticText10}" id="staticText10" text="#{currentRow.value['analysers.VEDLIKEHOLDSRUTINER']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{GasQuality$AnalyserDB$AnalyseDB2.tableColumn11}" headerText="ERFARING" id="tableColumn11" sort="analysers.ERFARING">
                                    <ui:staticText binding="#{GasQuality$AnalyserDB$AnalyseDB2.staticText11}" id="staticText11" text="#{currentRow.value['analysers.ERFARING']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{GasQuality$AnalyserDB$AnalyseDB2.tableColumn12}" headerText="ONLINEOFFLINE" id="tableColumn12" sort="analysers.ONLINEOFFLINE">
                                    <ui:staticText binding="#{GasQuality$AnalyserDB$AnalyseDB2.staticText12}" id="staticText12" text="#{currentRow.value['analysers.ONLINEOFFLINE']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{GasQuality$AnalyserDB$AnalyseDB2.tableColumn13}" headerText="KONTAKTPERSON" id="tableColumn13" sort="analysers.KONTAKTPERSON">
                                    <ui:staticText binding="#{GasQuality$AnalyserDB$AnalyseDB2.staticText13}" id="staticText13" text="#{currentRow.value['analysers.KONTAKTPERSON']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{GasQuality$AnalyserDB$AnalyseDB2.tableColumn14}" headerText="KOMMENTARER" id="tableColumn14" sort="analysers.KOMMENTARER">
                                    <ui:staticText binding="#{GasQuality$AnalyserDB$AnalyseDB2.staticText14}" id="staticText14" text="#{currentRow.value['analysers.KOMMENTARER']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{GasQuality$AnalyserDB$AnalyseDB2.tableColumn15}" headerText="INSTALLASJONAAR" id="tableColumn15" sort="analysers.INSTALLASJONAAR">
                                    <ui:staticText binding="#{GasQuality$AnalyserDB$AnalyseDB2.staticText15}" id="staticText15" text="#{currentRow.value['analysers.INSTALLASJONAAR']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{GasQuality$AnalyserDB$AnalyseDB2.tableColumn16}" headerText="EDIT" id="tableColumn16">
                                    <ui:button action="#{GasQuality$AnalyserDB$AnalyseDB2.button1_action}" binding="#{GasQuality$AnalyserDB$AnalyseDB2.button1}"
                                        id="button1" text="Edit"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{GasQuality$AnalyserDB$AnalyseDB2.tableColumn17}" headerText="DELETE" id="tableColumn17">
                                    <ui:button action="#{GasQuality$AnalyserDB$AnalyseDB2.button2_action}" binding="#{GasQuality$AnalyserDB$AnalyseDB2.button2}"
                                        id="button2" text="Delete"/>
                                </ui:tableColumn>
                            </ui:tableRowGroup>
                        </ui:table>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
