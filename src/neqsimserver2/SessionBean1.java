/*
 * SessionBean1.java
 *
 * Created on 6. juli 2004, 10:01
 * Copyright Even Solbraa
 */
package neqsimserver2;

import javax.faces.*;
import com.sun.sql.rowset.CachedRowSetXImpl;
import com.sun.data.provider.impl.CachedRowSetDataProvider;
import org.jfree.chart.JFreeChart;
import com.sun.rave.web.ui.appbase.AbstractSessionBean;
import neqsimserver2.Thermo.ThermoSessionBean;

public class SessionBean1 extends AbstractSessionBean {
    // <editor-fold defaultstate="collapsed" desc="Creator-managed Component Definition">

    private int __placeholder;
    private static Integer numberOfStartPageViews = new Integer(0);
    private CachedRowSetXImpl analyserlocationviewRowSet = new CachedRowSetXImpl();
    private String activeSubject = new String("thermo");
    private Integer activeFieldID = new Integer(1);
    private Integer activePipePlantID = new Integer(1);

    public CachedRowSetXImpl getAnalyserlocationviewRowSet() {
        return analyserlocationviewRowSet;
    }

    public void setAnalyserlocationviewRowSet(CachedRowSetXImpl crsxi) {
        this.analyserlocationviewRowSet = crsxi;
    }
    private CachedRowSetXImpl LNGageingRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getLNGageingRowSet() {
        return LNGageingRowSet;
    }

    public void setLNGageingRowSet(CachedRowSetXImpl crsxi) {
        this.LNGageingRowSet = crsxi;
    }
    private CachedRowSetXImpl speccountryRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getSpeccountryRowSet() {
        return speccountryRowSet;
    }

    public void setSpeccountryRowSet(CachedRowSetXImpl crsxi) {
        this.speccountryRowSet = crsxi;
    }
    private CachedRowSetXImpl pipelineParameterRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getPipelineParameterRowSet() {
        return pipelineParameterRowSet;
    }

    public void setPipelineParameterRowSet(CachedRowSetXImpl crsxi) {
        this.pipelineParameterRowSet = crsxi;
    }
    private CachedRowSetXImpl lngShipRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getlngShipRowSet() {
        return lngShipRowSet;
    }

    public void setlngShipRowSet(CachedRowSetXImpl crsxi) {
        this.lngShipRowSet = crsxi;
    }
    private CachedRowSetXImpl entrypointsRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getEntrypointsRowSet() {
        return entrypointsRowSet;
    }

    public void setEntrypointsRowSet(CachedRowSetXImpl crsxi) {
        this.entrypointsRowSet = crsxi;
    }
    private CachedRowSetXImpl fieldDBRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getFieldDBRowSet() {
        return fieldDBRowSet;
    }

    public void setFieldDBRowSet(CachedRowSetXImpl crsxi) {
        this.fieldDBRowSet = crsxi;
    }
    private CachedRowSetXImpl pipePlantDBRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getPipePlantDBRowSet() {
        return pipePlantDBRowSet;
    }

    public void setPipePlantDBRowSet(CachedRowSetXImpl crsxi) {
        this.pipePlantDBRowSet = crsxi;
    }
    private CachedRowSetXImpl pipeDBRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getPipeDBRowSet() {
        return pipeDBRowSet;
    }

    public void setPipeDBRowSet(CachedRowSetXImpl crsxi) {
        this.pipeDBRowSet = crsxi;
    }
    private CachedRowSetXImpl pipePlantSumDBRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getPipePlantSumDBRowSet() {
        return pipePlantSumDBRowSet;
    }

    public void setPipePlantSumDBRowSet(CachedRowSetXImpl crsxi) {
        this.pipePlantSumDBRowSet = crsxi;
    }
    private CachedRowSetXImpl fieldDBRowSet2 = new CachedRowSetXImpl();

    public CachedRowSetXImpl getFieldDBRowSet2() {
        return fieldDBRowSet2;
    }

    public void setFieldDBRowSet2(CachedRowSetXImpl crsxi) {
        this.fieldDBRowSet2 = crsxi;
    }
    private CachedRowSetXImpl fieldDBNameRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getFieldDBNameRowSet() {
        return fieldDBNameRowSet;
    }

    public void setFieldDBNameRowSet(CachedRowSetXImpl crsxi) {
        this.fieldDBNameRowSet = crsxi;
    }
    private CachedRowSetXImpl fieldproductionDBRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getFieldproductionDBRowSet() {
        return fieldproductionDBRowSet;
    }

    public void setFieldproductionDBRowSet(CachedRowSetXImpl crsxi) {
        this.fieldproductionDBRowSet = crsxi;
    }
    private CachedRowSetXImpl analysertypeviewRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getAnalysertypeviewRowSet() {
        return analysertypeviewRowSet;
    }

    public void setAnalysertypeviewRowSet(CachedRowSetXImpl crsxi) {
        this.analysertypeviewRowSet = crsxi;
    }
    private CachedRowSetXImpl analysersRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getAnalysersRowSet() {
        return analysersRowSet;
    }

    public void setAnalysersRowSet(CachedRowSetXImpl crsxi) {
        this.analysersRowSet = crsxi;
    }

    public void setFluidinfoRowSet(CachedRowSetXImpl crsxi) {
        this.fluidinfoRowSet = crsxi;
    }
    private CachedRowSetXImpl fluidinfoRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getFluidinfoRowSet() {
        return fluidinfoRowSet;
    }

    public void setFluidinfoRowSetAddComp(CachedRowSetXImpl crsxi) {
        this.fluidinfoRowSetAddComp = crsxi;
    }
    private CachedRowSetXImpl fluidinfoRowSetAddComp = new CachedRowSetXImpl();

    public CachedRowSetXImpl getFluidinfoRowSetAddComp() {
        return fluidinfoRowSetAddComp;
    }
    private CachedRowSetXImpl fluidinfoFullTableRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getFluidinfoFullTableRowSet() {
        return fluidinfoFullTableRowSet;
    }

    public void setFluidinfoFullTableRowSet(CachedRowSetXImpl crsxi) {
        this.fluidinfoFullTableRowSet = crsxi;
    }
    private CachedRowSetDataProvider userdbDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getUserdbDataProvider() {
        return userdbDataProvider;
    }

    public void setUserdbDataProvider(CachedRowSetDataProvider crsdp) {
        this.userdbDataProvider = crsdp;
    }

     private CachedRowSetDataProvider companyDataProvider = new CachedRowSetDataProvider();

     public CachedRowSetDataProvider getCompanyDataProvider() {
        return companyDataProvider;
    }

    public void setCompanyDataProvider(CachedRowSetDataProvider crsdp) {
        this.companyDataProvider = crsdp;
    }
    private CachedRowSetXImpl userdbRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getUserdbRowSet() {
        return userdbRowSet;
    }

    public void setUserdbRowSet(CachedRowSetXImpl crsxi) {
        this.userdbRowSet = crsxi;
    }
    private CachedRowSetXImpl litteratureRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getLitteratureRowSet() {
        return litteratureRowSet;
    }

    public void setLitteratureRowSet(CachedRowSetXImpl crsxi) {
        this.litteratureRowSet = crsxi;
    }
    private CachedRowSetXImpl litteratureRowSetGetLitID = new CachedRowSetXImpl();

    public CachedRowSetXImpl getlitteratureRowSetGetLitID() {
        return litteratureRowSetGetLitID;
    }

    public void setlitteratureRowSetGetLitID(CachedRowSetXImpl crsxi) {
        this.litteratureRowSetGetLitID = crsxi;
    }
    private CachedRowSetXImpl experimentaldatatypeRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getExperimentaldatatypeRowSet() {
        return experimentaldatatypeRowSet;
    }

    public void setExperimentaldatatypeRowSet(CachedRowSetXImpl crsxi) {
        this.experimentaldatatypeRowSet = crsxi;
    }
    private CachedRowSetXImpl litteratureRowSetTable = new CachedRowSetXImpl();

    public CachedRowSetXImpl getLitteratureRowSetTable() {
        return litteratureRowSetTable;
    }

    public void setLitteratureRowSetTable(CachedRowSetXImpl crsxi) {
        this.litteratureRowSetTable = crsxi;
    }
    private CachedRowSetXImpl co2mdeaRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getCo2mdeaRowSet() {
        return co2mdeaRowSet;
    }

    public void setCo2mdeaRowSet(CachedRowSetXImpl crsxi) {
        this.co2mdeaRowSet = crsxi;
    }
    private CachedRowSetXImpl webcomponentsRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getWebcomponentsRowSet() {
        return webcomponentsRowSet;
    }

    public void setWebcomponentsRowSet(CachedRowSetXImpl crsxi) {
        this.webcomponentsRowSet = crsxi;
    }
    private CachedRowSetXImpl litteratureRowSetDataBase = new CachedRowSetXImpl();

    public CachedRowSetXImpl getLitteratureRowSetDataBase() {
        return litteratureRowSetDataBase;
    }

    public void setLitteratureRowSetDataBase(CachedRowSetXImpl crsxi) {
        this.litteratureRowSetDataBase = crsxi;
    }
    private CachedRowSetXImpl literatureandarticlestableRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getLiteratureandarticlestableRowSet() {
        return literatureandarticlestableRowSet;
    }

    public void setLiteratureandarticlestableRowSet(CachedRowSetXImpl crsxi) {
        this.literatureandarticlestableRowSet = crsxi;
    }
    private CachedRowSetXImpl literatureandarticlestableRowSetDelete = new CachedRowSetXImpl();

    public CachedRowSetXImpl getLiteratureandarticlestableRowSetDelete() {
        return literatureandarticlestableRowSetDelete;
    }

    public void setLiteratureandarticlestableRowSetDelete(CachedRowSetXImpl crsxi) {
        this.literatureandarticlestableRowSetDelete = crsxi;
    }
    private CachedRowSetXImpl literatureandarticlestableRowSetSetArtID = new CachedRowSetXImpl();

    public CachedRowSetXImpl getLiteratureandarticlestableRowSetSetArtID() {
        return literatureandarticlestableRowSetSetArtID;
    }

    public void setLiteratureandarticlestableRowSetSetArtID(CachedRowSetXImpl crsxi) {
        this.literatureandarticlestableRowSetSetArtID = crsxi;
    }
    private CachedRowSetXImpl documentsRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getDocumentsRowSet() {
        return documentsRowSet;
    }

    public void setDocumentsRowSet(CachedRowSetXImpl crsxi) {
        this.documentsRowSet = crsxi;
    }
    private CachedRowSetXImpl standardsRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getStandardsRowSet() {
        return standardsRowSet;
    }

    public void setStandardsRowSet(CachedRowSetXImpl crsxi) {
        this.standardsRowSet = crsxi;
    }
    private CachedRowSetXImpl standardsFullRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getStandardsFullRowSet() {
        return standardsFullRowSet;
    }

    public void setStandardsFullRowSet(CachedRowSetXImpl crsxi) {
        this.standardsFullRowSet = crsxi;
    }
    private CachedRowSetXImpl documentsRowSetWithInfo = new CachedRowSetXImpl();

    public CachedRowSetXImpl getDocumentsRowSetWithInfo() {
        return documentsRowSetWithInfo;
    }

    public void setDocumentsRowSetWithInfo(CachedRowSetXImpl crsxi) {
        this.documentsRowSetWithInfo = crsxi;
    }
    private CachedRowSetXImpl documenttypeRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getDocumenttypeRowSet() {
        return documenttypeRowSet;
    }

    public void setDocumenttypeRowSet(CachedRowSetXImpl crsxi) {
        this.documenttypeRowSet = crsxi;
    }
    private CachedRowSetXImpl analysertypesviewRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getAnalysertypesviewRowSet() {
        return analysertypesviewRowSet;
    }

    public void setAnalysertypesviewRowSet(CachedRowSetXImpl crsxi) {
        this.analysertypesviewRowSet = crsxi;
    }
    private CachedRowSetXImpl analyserlocationsRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getAnalyserlocationsRowSet() {
        return analyserlocationsRowSet;
    }

    public void setAnalyserlocationsRowSet(CachedRowSetXImpl crsxi) {
        this.analyserlocationsRowSet = crsxi;
    }
    private CachedRowSetXImpl analysertypesRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getAnalysertypesRowSet() {
        return analysertypesRowSet;
    }

    public void setAnalysertypesRowSet(CachedRowSetXImpl crsxi) {
        this.analysertypesRowSet = crsxi;
    }
    private CachedRowSetXImpl addAnalysersRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getAddAnalysersRowSet() {
        return addAnalysersRowSet;
    }

    public void setAddAnalysersRowSet(CachedRowSetXImpl crsxi) {
        this.addAnalysersRowSet = crsxi;
    }
    private CachedRowSetXImpl fluidinfoFullTableRowSet2 = new CachedRowSetXImpl();

    public CachedRowSetXImpl getFluidinfoFullTableRowSet2() {
        return fluidinfoFullTableRowSet2;
    }

    public void setFluidinfoFullTableRowSet2(CachedRowSetXImpl crsxi) {
        this.fluidinfoFullTableRowSet2 = crsxi;
    }
    private CachedRowSetXImpl litteratureRowSet1 = new CachedRowSetXImpl();

    public CachedRowSetXImpl getLitteratureRowSet1() {
        return litteratureRowSet1;
    }

    public void setLitteratureRowSet1(CachedRowSetXImpl crsxi) {
        this.litteratureRowSet1 = crsxi;
    }
    private CachedRowSetXImpl litteratureRowSet2 = new CachedRowSetXImpl();

    public CachedRowSetXImpl getLitteratureRowSet2() {
        return litteratureRowSet2;
    }

    public void setLitteratureRowSet2(CachedRowSetXImpl crsxi) {
        this.litteratureRowSet2 = crsxi;
    }
    private CachedRowSetXImpl compsaltRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getCompsaltRowSet() {
        return compsaltRowSet;
    }

    public void setCompsaltRowSet(CachedRowSetXImpl crsxi) {
        this.compsaltRowSet = crsxi;
    }
    private CachedRowSetXImpl compsaltRowSet1 = new CachedRowSetXImpl();

    public CachedRowSetXImpl getCompsaltRowSet1() {
        return compsaltRowSet1;
    }

    public void setCompsaltRowSet1(CachedRowSetXImpl crsxi) {
        this.compsaltRowSet1 = crsxi;
    }
    private CachedRowSetXImpl pipelineparametersRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getPipelineparametersRowSet() {
        return pipelineparametersRowSet;
    }

    public void setPipelineparametersRowSet(CachedRowSetXImpl crsxi) {
        this.pipelineparametersRowSet = crsxi;
    }
    private CachedRowSetXImpl fieldproductiondbRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getFieldproductiondbRowSet() {
        return fieldproductiondbRowSet;
    }

    public void setFieldproductiondbRowSet(CachedRowSetXImpl crsxi) {
        this.fieldproductiondbRowSet = crsxi;
    }
    private CachedRowSetXImpl fluidinfoRowSet1 = new CachedRowSetXImpl();

    public CachedRowSetXImpl getFluidinfoRowSet1() {
        return fluidinfoRowSet1;
    }

    public void setFluidinfoRowSet1(CachedRowSetXImpl crsxi) {
        this.fluidinfoRowSet1 = crsxi;
    }
    private CachedRowSetXImpl pvt_satptRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getPvt_satptRowSet() {
        return pvt_satptRowSet;
    }

    public void setPvt_satptRowSet(CachedRowSetXImpl crsxi) {
        this.pvt_satptRowSet = crsxi;
    }
    private CachedRowSetXImpl companyRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getCompanyRowSet() {
        return companyRowSet;
    }

    public void setCompanyRowSet(CachedRowSetXImpl crsxi) {
        this.companyRowSet = crsxi;
    }
    private CachedRowSetXImpl analysersRowSet1 = new CachedRowSetXImpl();

    public CachedRowSetXImpl getAnalysersRowSet1() {
        return analysersRowSet1;
    }

    public void setAnalysersRowSet1(CachedRowSetXImpl crsxi) {
        this.analysersRowSet1 = crsxi;
    }
    private CachedRowSetXImpl userdbRowSet1 = new CachedRowSetXImpl();

    public CachedRowSetXImpl getUserdbRowSet1() {
        return userdbRowSet1;
    }

    public void setUserdbRowSet1(CachedRowSetXImpl crsxi) {
        this.userdbRowSet1 = crsxi;
    }
    private CachedRowSetXImpl documentsRowSet1 = new CachedRowSetXImpl();

    public CachedRowSetXImpl getDocumentsRowSet1() {
        return documentsRowSet1;
    }

    public void setDocumentsRowSet1(CachedRowSetXImpl crsxi) {
        this.documentsRowSet1 = crsxi;
    }
    private CachedRowSetXImpl analyserlocationsRowSet1 = new CachedRowSetXImpl();

    public CachedRowSetXImpl getAnalyserlocationsRowSet1() {
        return analyserlocationsRowSet1;
    }

    public void setAnalyserlocationsRowSet1(CachedRowSetXImpl crsxi) {
        this.analyserlocationsRowSet1 = crsxi;
    }

    /**
     * Holds value of property numberOfStartPageViews.
     */
    // </editor-fold>
    public SessionBean1() {
        // <editor-fold defaultstate="collapsed" desc="Creator-managed Component Initialization">
        try {
        } catch (Exception e) {
            log("SessionBean1 Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
        }
        // </editor-fold>
        // Additional user provided initialization code
        int tot = getNumberOfStartPageViews().intValue() + 1;
        setNumberOfStartPageViews(new Integer(tot));
        loginBean = new neqsimserver2.Util.LoginBean(this);
    }

    protected neqsimserver2.ApplicationBean1 getApplicationBean1() {
        return (neqsimserver2.ApplicationBean1) getBean("ApplicationBean1");
    }

    private void _init() throws Exception {
        pipelineParameterRowSet.setDataSourceName("java:comp/env/jdbc/NeqsimDataSource");
        pipelineParameterRowSet.setCommand("SELECT ALL pipelineparameters.`ID`, pipelineparameters.`POSITION`, pipelineparameters.`HEIGHT`, pipelineparameters.`DIAMETER`, pipelineparameters.`HEATTRANSFCOEFF`, pipelineparameters.`WALLROUGHN`, pipelineparameters.`PIPEID`, pipelineparameters.`OUTTEMPERATURE`, pipelineparameters.`WALLHEATTRANSFCOEFF`  FROM pipelineparameters");
        pipelineParameterRowSet.setTableName("pipelineparameters");

        lngShipRowSet.setDataSourceName("java:comp/env/jdbc/NeqsimDataSource");
        lngShipRowSet.setCommand("SELECT DISTINCT lngship.`ID`, lngship.`SHIPNAME`, lngship.`VOLUME`, lngship.`BOR`, lngship.`PRESSURE`, lngship.`TRANSTIME`, lngship.`FLUIDREF`, lngship.`INITTEMPERATURE`  FROM lngship WHERE lngship.`FLUIDREF` = ?");
        lngShipRowSet.setTableName("analyserlocationview");

        speccountryRowSet.setDataSourceName("java:comp/env/jdbc/NeqsimDataSource");
        speccountryRowSet.setCommand("SELECT DISTINCT gascontractspecifications.`COUNTRY`  FROM gascontractspecifications");
        speccountryRowSet.setTableName("analyserlocationview");

        entrypointsRowSet.setDataSourceName("java:comp/env/jdbc/NeqsimDataSource");
        entrypointsRowSet.setCommand("SELECT DISTINCT gascontractspecifications.`TERMINAL`  FROM gascontractspecifications WHERE gascontractspecifications.`COUNTRY` = ?");
        entrypointsRowSet.setTableName("analyserlocationview");

        analyserlocationviewRowSet.setDataSourceName("java:comp/env/jdbc/NeqsimDataSource");
        analyserlocationviewRowSet.setCommand("SELECT ALL analyserlocations.`STED`, \n                    analyserlocations.`ID1` \nFROM analyserlocations");
        analyserlocationviewRowSet.setTableName("analyserlocationview");

        LNGageingRowSet.setDataSourceName("java:comp/env/jdbc/NeqsimDataSource");
        LNGageingRowSet.setCommand("SELECT ALL lngageingtable.`ID`, lngageingtable.`TIME`, lngageingtable.`TEMPERATURE`, lngageingtable.`WI`, lngageingtable.`GCV`, lngageingtable.`DENSITY`, lngageingtable.`VOLUME`, lngageingtable.`XMETHANE`, lngageingtable.`XETHANE`, lngageingtable.`XPROPANE`, lngageingtable.`xiC4`, lngageingtable.`xiC5`, lngageingtable.`xnC5`, lngageingtable.`xnC6`, lngageingtable.`xnC4`, lngageingtable.`xNITROGEN`, lngageingtable.`ENERGY`, lngageingtable.`GCVmass`,lngageingtable.`YMETHANE`, lngageingtable.`YETHANE`, lngageingtable.`YPROPANE`, lngageingtable.`yiC4`, lngageingtable.`ynC4`, lngageingtable.`yiC5`, lngageingtable.`ynC5`, lngageingtable.`ynC6`, lngageingtable.`yNITROGEN` FROM lngageingtable");
        LNGageingRowSet.setTableName("analyserlocationview");

        fieldDBRowSet.setDataSourceName("java:comp/env/jdbc/NeqsimDataSource");
        fieldDBRowSet.setCommand("SELECT ALL fielddb.`ID`, fielddb.`NAME`, pipeplantdb.`ID`, pipeplantdb.`NAME`, pipeplantdb.`LENGTH`, pipeplantdb.`PROCESSID`, dieliverypointdb.`ID`, dieliverypointdb.`NAME`, dieliverypointdb.`COORINATE`, dieliverypointdb.`PIPEPLANTID`, fieldproductiondb.`ID`, fieldproductiondb.`FIELDID`, fieldproductiondb.`YEAR`, fieldproductiondb.`Production`, fieldproductiondb.`FLUIDID`, fieldproductiondb.`DELIVERYPOINTID`, pipeplantdb.`NAME`  FROM fielddb, pipeplantdb, dieliverypointdb, fieldproductiondb WHERE fielddb.`ID` = fieldproductiondb.`FIELDID`          AND fieldproductiondb.`DELIVERYPOINTID` = dieliverypointdb.`ID`          AND pipeplantdb.`ID` = dieliverypointdb.`PIPEPLANTID`");
        fieldDBRowSet.setTableName("fieldDBRowSet");

        pipePlantDBRowSet.setDataSourceName("java:comp/env/jdbc/NeqsimDataSource");
        pipePlantDBRowSet.setCommand("SELECT ALL fielddb.`ID`, fielddb.`NAME`, pipeplantdb.`ID`, pipeplantdb.`NAME`, pipeplantdb.`LENGTH`, pipeplantdb.`PROCESSID`, dieliverypointdb.`ID`, dieliverypointdb.`NAME`, dieliverypointdb.`COORINATE`, dieliverypointdb.`PIPEPLANTID`, fieldproductiondb.`ID`, fieldproductiondb.`FIELDID`, fieldproductiondb.`YEAR`, fieldproductiondb.`Production`, fieldproductiondb.`FLUIDID`, fieldproductiondb.`DELIVERYPOINTID`, pipeplantdb.`NAME`  FROM fielddb, pipeplantdb, dieliverypointdb, fieldproductiondb WHERE dieliverypointdb.`PIPEPLANTID` = ?          AND fielddb.`ID` = fieldproductiondb.`FIELDID`          AND fieldproductiondb.`DELIVERYPOINTID` = dieliverypointdb.`ID`          AND pipeplantdb.`ID` = dieliverypointdb.`PIPEPLANTID`");
        pipePlantDBRowSet.setTableName("pipePlantDBRowSet");

        pipePlantSumDBRowSet.setDataSourceName("java:comp/env/jdbc/NeqsimDataSource");
        pipePlantSumDBRowSet.setCommand("SELECT ALL SUM(fieldproductiondb.`Production`)  FROM fielddb, pipeplantdb, dieliverypointdb, fieldproductiondb WHERE pipeplantdb.`ID` = ?          AND dieliverypointdb.`PIPEPLANTID` = 1          AND fielddb.`ID` = fieldproductiondb.`FIELDID`          AND fieldproductiondb.`DELIVERYPOINTID` = dieliverypointdb.`ID`          AND pipeplantdb.`ID` = dieliverypointdb.`PIPEPLANTID`");
        pipePlantSumDBRowSet.setTableName("pipePlantDBRowSet");

        pipeDBRowSet.setDataSourceName("java:comp/env/jdbc/NeqsimDataSource");
        pipeDBRowSet.setCommand("SELECT ALL pipeplantdb.`ID`, pipeplantdb.`NAME`, pipeplantdb.`LENGTH`, pipeplantdb.`PROCESSID`, pipeplantdb.`NAME`  FROM pipeplantdb");
        pipeDBRowSet.setTableName("pipePlantDBRowSet");

        fieldproductionDBRowSet.setDataSourceName("java:comp/env/jdbc/NeqsimDataSource");
        fieldproductionDBRowSet.setCommand("SELECT ALL fieldproductiondb.`ID`, fieldproductiondb.`FIELDID`, fieldproductiondb.`YEAR`, fieldproductiondb.`Production`, fieldproductiondb.`FLUIDID`, fieldproductiondb.`DELIVERYPOINTID`  FROM fieldproductiondb");
        fieldproductionDBRowSet.setTableName("fieldproductionDBRowSet");

        fieldDBNameRowSet.setDataSourceName("java:comp/env/jdbc/NeqsimDataSource");
        fieldDBNameRowSet.setCommand("SELECT ALL fielddb.`NAME`, fielddb.`ID`  FROM fielddb");
        fieldDBNameRowSet.setTableName("fieldDBRowSet");

        fieldDBRowSet2.setDataSourceName("java:comp/env/jdbc/NeqsimDataSource");
        fieldDBRowSet2.setCommand("SELECT ALL fielddb.`NAME`, pipeplantdb.`ID`, pipeplantdb.`NAME`, pipeplantdb.`LENGTH`, pipeplantdb.`PROCESSID`, dieliverypointdb.`ID`, dieliverypointdb.`NAME`, dieliverypointdb.`COORINATE`, dieliverypointdb.`PIPEPLANTID`, fieldproductiondb.`ID`, fieldproductiondb.`FIELDID`, fieldproductiondb.`YEAR`, fieldproductiondb.`Production`, fieldproductiondb.`FLUIDID`, fieldproductiondb.`DELIVERYPOINTID`, pipeplantdb.`NAME`, fielddb.`ID`  FROM fielddb, pipeplantdb, dieliverypointdb, fieldproductiondb WHERE fieldproductiondb.`FIELDID` = ?          AND fielddb.`ID` = fieldproductiondb.`FIELDID`          AND dieliverypointdb.`ID` = fieldproductiondb.`DELIVERYPOINTID`          AND pipeplantdb.`ID` = dieliverypointdb.`PIPEPLANTID`");
        fieldDBRowSet2.setTableName("fieldDBRowSet2");

        analysertypeviewRowSet.setDataSourceName("java:comp/env/jdbc/NeqsimDataSource");
        analysertypeviewRowSet.setCommand("SELECT ALL analysertypes.ID1, \n                    analysertypes.INSTTYPES \nFROM analysertypes ");
        analysertypeviewRowSet.setTableName("analysertypeview");
        analysersRowSet.setDataSourceName("java:comp/env/jdbc/NeqsimDataSource");
        analysersRowSet.setCommand("SELECT ALL analysers.ID, \n                    analysers.INSTRUMENTTYPE, \n                    analysers.STED, \n                    analysers.FORMAL, \n                    analysers.INSTRUMENT, \n                    analysers.ANTALL, \n                    analysers.PLASSERING, \n                    analysers.TAGNR, \n                    analysers.KALIBRERINGSRUTINER, \n                    analysers.VEDLIKEHOLDSRUTINER, \n                    analysers.ERFARING, \n                    analysers.ONLINEOFFLINE, \n                    analysers.KONTAKTPERSON, \n                    analysers.KOMMENTARER, \n                    analysers.INSTALLASJONAAR \nFROM analysers\nWHERE analysers.INSTRUMENTTYPE = ?\n          AND analysers.STED = ?\nGROUP BY analysers.ID, analysers.INSTRUMENTTYPE, analysers.STED, analysers.FORMAL, analysers.INSTRUMENT, analysers.ANTALL, analysers.PLASSERING, analysers.TAGNR, analysers.KALIBRERINGSRUTINER, analysers.VEDLIKEHOLDSRUTINER, analysers.ERFARING, analysers.ONLINEOFFLINE, analysers.KONTAKTPERSON, analysers.KOMMENTARER, analysers.INSTALLASJONAAR ");
        analysersRowSet.setTableName("analysers");
        fluidinfoRowSet.setDataSourceName("java:comp/env/jdbc/NeqsimDataSource");
        fluidinfoRowSet.setCommand("SELECT ALL fluidinfo.`ID`, fluidinfo.`FIELD`, fluidinfo.`WELL`, fluidinfo.`TEST`, fluidinfo.`SAMPLE`, fluidinfo.`TEXT`, fluidinfo.`HISTORY`, fluidinfo.`METHANE`, fluidinfo.`ETHANE`, fluidinfo.`PROPANE`, fluidinfo.`WATER`, fluidinfo.`USERID`, userdb.`ID`, userdb.`USERNAME`, userdb.`PASSWORD`, userdb.`EMAIL`, userdb.`FORNAME`, userdb.`SURENAME`, fluidinfo.`CO2`, fluidinfo.`H2S`, fluidinfo.`NITROGEN`, fluidinfo.`IBUTANE`, fluidinfo.`NBUTANE`, fluidinfo.`PENTANE`, fluidinfo.`NHEXANE`, fluidinfo.`CYCPENTANE`, fluidinfo.`CYCHEXANE`, fluidinfo.`NHEPTANE`, fluidinfo.`NOCTANE`, fluidinfo.`NDECANE`, fluidinfo.`BENZENE`, fluidinfo.`TOLUENE`, fluidinfo.`MXYLENE`, fluidinfo.`PXYLENE`, fluidinfo.`TEG`, fluidinfo.`DEG`, fluidinfo.`MDEA`, fluidinfo.`PIPERAZINE`, fluidinfo.`ACETICACID`, fluidinfo.`PROPIONICACID`, fluidinfo.`NAPLUS`, fluidinfo.`FEPLUS`, fluidinfo.`CAPLUS`, fluidinfo.`MEG`, fluidinfo.`METHANOL`, fluidinfo.`OXYLENE`, fluidinfo.`NNONANE`, fluidinfo.`H3OPLUS`, fluidinfo.`OHMINUS`, fluidinfo.`CO3MINUS`, fluidinfo.`CLMINUS`, fluidinfo.`CPLUSDENSITY`, fluidinfo.`CPLUSMOLARMASS`, fluidinfo.`CPLUS`, fluidinfo.`C13DENSITY`, fluidinfo.`C13MOLARMASS`, fluidinfo.`C13`, fluidinfo.`C12DENSITY`, fluidinfo.`C12MOLARMASS`, fluidinfo.`C12`, fluidinfo.`C11DENSITY`, fluidinfo.`C11MOLARMASS`, fluidinfo.`C11`, fluidinfo.`C10DENSITY`, fluidinfo.`C10MOLARMASS`, fluidinfo.`C10`, fluidinfo.`C9DENSITY`, fluidinfo.`C9MOLARMASS`, fluidinfo.`C9`, fluidinfo.`C8DENSITY`, fluidinfo.`C8MOLARMASS`, fluidinfo.`C8`, fluidinfo.`C7DENSITY`, fluidinfo.`C7MOLARMASS`, fluidinfo.`C7`, fluidinfo.`C6DENSITY`, fluidinfo.`C6MOLARMASS`, fluidinfo.`C6`, fluidinfo.`SHARED`, fluidinfo.`C20DENSITY`, fluidinfo.`C19DENSITY`, fluidinfo.`HASPLUSFRACTION`, fluidinfo.`C18DENSITY`, fluidinfo.`C17DENSITY`, fluidinfo.`C16DENSITY`, fluidinfo.`C15DENSITY`, fluidinfo.`C14DENSITY`, fluidinfo.`C20MOLARMASS`, fluidinfo.`C19MOLARMASS`, fluidinfo.`C18MOLARMASS`, fluidinfo.`C17MOLARMASS`, fluidinfo.`C16MOLARMASS`, fluidinfo.`C15MOLARMASS`, fluidinfo.`C14MOLARMASS`, fluidinfo.`C20`, fluidinfo.`C19`, fluidinfo.`C18`, fluidinfo.`C17`, fluidinfo.`C16`, fluidinfo.`C15`, fluidinfo.`C14`, fluidinfo.`SO4MINUS`, fluidinfo.`iPENTANE`  FROM fluidinfo, userdb WHERE  ( fluidinfo.`USERID` = ? OR fluidinfo.`SHARED` = 1 )           AND fluidinfo.`USERID` = userdb.`ID`");
        fluidinfoRowSetAddComp.setTableName("fluidinfo");
        fluidinfoRowSetAddComp.setDataSourceName("java:comp/env/jdbc/NeqsimDataSource");
        fluidinfoRowSetAddComp.setCommand("SELECT ALL fluidinfo.`ID`, fluidinfo.`FIELD`, fluidinfo.`WELL`, fluidinfo.`TEST`, fluidinfo.`SAMPLE`, fluidinfo.`TEXT`, fluidinfo.`HISTORY`, fluidinfo.`METHANE`, fluidinfo.`ETHANE`, fluidinfo.`PROPANE`, fluidinfo.`WATER`, fluidinfo.`CO2`, fluidinfo.`H2S`, fluidinfo.`NITROGEN`, fluidinfo.`IBUTANE`, fluidinfo.`NBUTANE`, fluidinfo.`PENTANE`, fluidinfo.`NHEXANE`, fluidinfo.`CYCPENTANE`, fluidinfo.`CYCHEXANE`, fluidinfo.`NHEPTANE`, fluidinfo.`NOCTANE`, fluidinfo.`NDECANE`, fluidinfo.`BENZENE`, fluidinfo.`TOLUENE`, fluidinfo.`MXYLENE`, fluidinfo.`PXYLENE`, fluidinfo.`TEG`, fluidinfo.`DEG`, fluidinfo.`MDEA`, fluidinfo.`PIPERAZINE`, fluidinfo.`ACETICACID`, fluidinfo.`PROPIONICACID`, fluidinfo.`NAPLUS`, fluidinfo.`FEPLUS`, fluidinfo.`CAPLUS`, fluidinfo.`MEG`, fluidinfo.`METHANOL`, fluidinfo.`OXYLENE`, fluidinfo.`NNONANE`, fluidinfo.`H3OPLUS`, fluidinfo.`OHMINUS`, fluidinfo.`CO3MINUS`, fluidinfo.`CLMINUS`, fluidinfo.`CPLUSDENSITY`, fluidinfo.`CPLUSMOLARMASS`, fluidinfo.`CPLUS`, fluidinfo.`C13DENSITY`, fluidinfo.`C13MOLARMASS`, fluidinfo.`C13`, fluidinfo.`C12DENSITY`, fluidinfo.`C12MOLARMASS`, fluidinfo.`C12`, fluidinfo.`C11DENSITY`, fluidinfo.`C11MOLARMASS`, fluidinfo.`C11`, fluidinfo.`C10DENSITY`, fluidinfo.`C10MOLARMASS`, fluidinfo.`C10`, fluidinfo.`C9DENSITY`, fluidinfo.`C9MOLARMASS`, fluidinfo.`C9`, fluidinfo.`C8DENSITY`, fluidinfo.`C8MOLARMASS`, fluidinfo.`C8`, fluidinfo.`C7DENSITY`, fluidinfo.`C7MOLARMASS`, fluidinfo.`C7`, fluidinfo.`C6DENSITY`, fluidinfo.`C6MOLARMASS`, fluidinfo.`C6`, fluidinfo.`SHARED`, fluidinfo.`USERID`, userdb.`ID`, userdb.`USERNAME`, userdb.`PASSWORD`, userdb.`EMAIL`, userdb.`FORNAME`, userdb.`SURENAME`, fluidinfo.`iPENTANE`, fluidinfo.`SO4MINUS`, fluidinfo.`C20`, fluidinfo.`C19`, fluidinfo.`C18`, fluidinfo.`C17`, fluidinfo.`C16`, fluidinfo.`C15`, fluidinfo.`C14`, fluidinfo.`C14MOLARMASS`, fluidinfo.`C15MOLARMASS`, fluidinfo.`C16MOLARMASS`, fluidinfo.`C16MOLARMASS`, fluidinfo.`C17MOLARMASS`, fluidinfo.`C18MOLARMASS`, fluidinfo.`C19MOLARMASS`, fluidinfo.`HASPLUSFRACTION`, fluidinfo.`C20DENSITY`, fluidinfo.`C19DENSITY`, fluidinfo.`C18DENSITY`, fluidinfo.`C17DENSITY`, fluidinfo.`C16DENSITY`, fluidinfo.`C15DENSITY`, fluidinfo.`C14DENSITY`, fluidinfo.`C20MOLARMASS`, fluidinfo.`DATE`, fluidinfo.`ETHANOL`, fluidinfo.`cpropane`, fluidinfo.`i22dimC3`, fluidinfo.`cbutane`, fluidinfo.`i22dimC4`,fluidinfo.`i23dimC4`,fluidinfo.`i2mC5`,fluidinfo.`i3mC5`,fluidinfo.`mcpentane`,fluidinfo.`cheptane`,fluidinfo.`mcheptane`,fluidinfo.`coctane`,fluidinfo.`nc11`,fluidinfo.`nc12`,fluidinfo.`nc13`,fluidinfo.`nc14`,fluidinfo.`nc15`,fluidinfo.`nc16`,fluidinfo.`nc17`,fluidinfo.`nc18`,fluidinfo.`nc19`,fluidinfo.`nc20`,fluidinfo.`oxygen`,fluidinfo.`argon`,fluidinfo.`mercury`,fluidinfo.`hydrogen`,fluidinfo.`C21`,fluidinfo.`C22`,fluidinfo.`C23`,fluidinfo.`C24`,fluidinfo.`C25`,fluidinfo.`C21MOLARMASS`,fluidinfo.`C22MOLARMASS`,fluidinfo.`C23MOLARMASS`,fluidinfo.`C24MOLARMASS`,fluidinfo.`C25MOLARMASS`,fluidinfo.`C21DENSITY`,fluidinfo.`C22DENSITY`,fluidinfo.`C23DENSITY`,fluidinfo.`C24DENSITY`,fluidinfo.`C25DENSITY` FROM fluidinfo, userdb WHERE fluidinfo.`ID` = ?          AND fluidinfo.`USERID` = userdb.`ID`");
        fluidinfoRowSetAddComp.setTableName("fluidinfo");

        fluidinfoFullTableRowSet.setDataSourceName("java:comp/env/jdbc/NeqsimDataSource");
        fluidinfoFullTableRowSet.setCommand("SELECT ALL fluidinfo.`ID`, fluidinfo.`USERID`, fluidinfo.`FIELD`, fluidinfo.`WELL`, fluidinfo.`TEST`, fluidinfo.`SAMPLE`, fluidinfo.`TEXT`, fluidinfo.`HISTORY`, fluidinfo.`WATER`, fluidinfo.`METHANE`, fluidinfo.`ETHANE`, fluidinfo.`PROPANE`, fluidinfo.`CO2`, fluidinfo.`H2S`, fluidinfo.`NITROGEN`, fluidinfo.`IBUTANE`, fluidinfo.`NBUTANE`, fluidinfo.`PENTANE`, fluidinfo.`NHEXANE`, fluidinfo.`CYCPENTANE`, fluidinfo.`CYCHEXANE`, fluidinfo.`NHEPTANE`, fluidinfo.`NOCTANE`, fluidinfo.`NNONANE`, fluidinfo.`NDECANE`, fluidinfo.`BENZENE`, fluidinfo.`TOLUENE`, fluidinfo.`MXYLENE`, fluidinfo.`PXYLENE`, fluidinfo.`OXYLENE`, fluidinfo.`METHANOL`, fluidinfo.`MEG`, fluidinfo.`TEG`, fluidinfo.`DEG`, fluidinfo.`MDEA`, fluidinfo.`PIPERAZINE`, fluidinfo.`ACETICACID`, fluidinfo.`PROPIONICACID`, fluidinfo.`NAPLUS`, fluidinfo.`FEPLUS`, fluidinfo.`CAPLUS`, fluidinfo.`H3OPLUS`, fluidinfo.`OHMINUS`, fluidinfo.`CO3MINUS`, fluidinfo.`CLMINUS`, fluidinfo.`C6`, fluidinfo.`C6MOLARMASS`, fluidinfo.`C6DENSITY`, fluidinfo.`C7`, fluidinfo.`C7MOLARMASS`, fluidinfo.`C7DENSITY`, fluidinfo.`C8`, fluidinfo.`C8MOLARMASS`, fluidinfo.`C8DENSITY`, fluidinfo.`C9`, fluidinfo.`C9MOLARMASS`, fluidinfo.`C9DENSITY`, fluidinfo.`C10`, fluidinfo.`C10MOLARMASS`, fluidinfo.`C10DENSITY`, fluidinfo.`C11`, fluidinfo.`C11MOLARMASS`, fluidinfo.`C11DENSITY`, fluidinfo.`C12`, fluidinfo.`C12MOLARMASS`, fluidinfo.`C12DENSITY`, fluidinfo.`C13`, fluidinfo.`C13MOLARMASS`, fluidinfo.`C13DENSITY`, fluidinfo.`CPLUSDENSITY`, fluidinfo.`CPLUSMOLARMASS`, fluidinfo.`CPLUS`, fluidinfo.`SHARED`, userdb.`ID`, userdb.`USERNAME`, fluidinfo.`iPENTANE`, fluidinfo.`HASPLUSFRACTION`, fluidinfo.`C20DENSITY`, fluidinfo.`C19DENSITY`, fluidinfo.`C18DENSITY`, fluidinfo.`C17DENSITY`, fluidinfo.`C16DENSITY`, fluidinfo.`C15DENSITY`, fluidinfo.`C14DENSITY`, fluidinfo.`C20MOLARMASS`, fluidinfo.`C19MOLARMASS`, fluidinfo.`C18MOLARMASS`, fluidinfo.`C17MOLARMASS`, fluidinfo.`C16MOLARMASS`, fluidinfo.`C15MOLARMASS`, fluidinfo.`C14MOLARMASS`, fluidinfo.`C20`, fluidinfo.`C19`, fluidinfo.`C18`, fluidinfo.`C17`, fluidinfo.`C16`, fluidinfo.`C15`, fluidinfo.`C14`, fluidinfo.`SO4MINUS`, fluidinfo.`DATE`  FROM fluidinfo, userdb WHERE  ( fluidinfo.`USERID` = ? OR fluidinfo.`SHARED` = 1 )           AND fluidinfo.`USERID` = userdb.`ID` ORDER BY fluidinfo.`ID` DESC,                     fluidinfo.`USERID` ASC");
        fluidinfoFullTableRowSet.setTableName("fluidinfo");
        userdbRowSet.setDataSourceName("java:comp/env/jdbc/NeqsimDataSource");
        userdbRowSet.setCommand("SELECT ALL userdb.`ID`, userdb.`USERNAME`, userdb.`PASSWORD`, userdb.`EMAIL`, userdb.`FORNAME`, userdb.`SURENAME`,userdb.`SURENAME`, userdb.`COMPANYID`  FROM userdb");
        userdbRowSet.setTableName("userdb");
        userdbDataProvider.setCachedRowSet(userdbRowSet);
        litteratureRowSet.setDataSourceName("java:comp/env/jdbc/NeqsimDataSource");
        litteratureRowSet.setCommand("SELECT ALL litterature.`ID`, \n                    litterature.`FLUID_ID`, \n                    litterature.`FILE`, \n                    litterature.`TYPE`, \n                    litterature.`NAME`, \n                    litterature.`TEXT`, \n                    litterature.`EXPTYPEID`, \n                    experimentaldatatype.`ID` AS `EXPID`, \n                    experimentaldatatype.`TYPE`, \n                    userdb.`ID` AS `USERID`, \n                    userdb.`USERNAME`, \n                    userdb.`PASSWORD`, \n                    userdb.`EMAIL`, \n                    userdb.`FORNAME`, \n                    userdb.`SURENAME`, \n                    fluidinfo.`ID` AS `FLUIDID`, \n                    fluidinfo.`USERID`, \n                    fluidinfo.`FIELD`, \n                    fluidinfo.`WELL`, \n                    fluidinfo.`TEST`, \n                    fluidinfo.`SAMPLE`, \n                    fluidinfo.`TEXT`, \n                    fluidinfo.`HISTORY`, \n                    fluidinfo.`METHANE`, \n                    fluidinfo.`ETHANE`, \n                    fluidinfo.`PROPANE`, \n                    fluidinfo.`CO2`, \n                    fluidinfo.`H2S`, \n                    fluidinfo.`NITROGEN`, \n                    fluidinfo.`IBUTANE`, \n                    fluidinfo.`NBUTANE`, \n                    fluidinfo.`PENTANE`, \n                    fluidinfo.`NHEXANE`, \n                    fluidinfo.`CYCPENTANE`, \n                    fluidinfo.`CYCHEXANE`, \n                    fluidinfo.`NHEPTANE`, \n                    fluidinfo.`NOCTANE`, \n                    fluidinfo.`NNONANE`, \n                    fluidinfo.`NDECANE`, \n                    fluidinfo.`BENZENE`, \n                    fluidinfo.`TOLUENE`, \n                    fluidinfo.`MXYLENE`, \n                    fluidinfo.`PXYLENE`, \n                    fluidinfo.`OXYLENE`, \n                    fluidinfo.`WATER`, \n                    fluidinfo.`METHANOL`, \n                    fluidinfo.`MEG`, \n                    fluidinfo.`TEG`, \n                    fluidinfo.`DEG`, \n                    fluidinfo.`MDEA`, \n                    fluidinfo.`PIPERAZINE`, \n                    fluidinfo.`ACETICACID`, \n                    fluidinfo.`PROPIONICACID`, \n                    fluidinfo.`NAPLUS`, \n                    fluidinfo.`FEPLUS`, \n                    fluidinfo.`CAPLUS`, \n                    fluidinfo.`H3OPLUS`, \n                    fluidinfo.`OHMINUS`, \n                    fluidinfo.`CO3MINUS`, \n                    fluidinfo.`CLMINUS`, \n                    fluidinfo.`C6`, \n                    fluidinfo.`C6MOLARMASS`, \n                    fluidinfo.`C6DENSITY`, \n                    fluidinfo.`C7`, \n                    fluidinfo.`C7MOLARMASS`, \n                    fluidinfo.`C7DENSITY`, \n                    fluidinfo.`C8`, \n                    fluidinfo.`C8MOLARMASS`, \n                    fluidinfo.`C8DENSITY`, \n                    fluidinfo.`C9`, \n                    fluidinfo.`C9MOLARMASS`, \n                    fluidinfo.`C9DENSITY`, \n                    fluidinfo.`C10`, \n                    fluidinfo.`C10MOLARMASS`, \n                    fluidinfo.`C10DENSITY`, \n                    fluidinfo.`C11`, \n                    fluidinfo.`C11MOLARMASS`, \n                    fluidinfo.`C11DENSITY`, \n                    fluidinfo.`C12`, \n                    fluidinfo.`C12MOLARMASS`, \n                    fluidinfo.`C12DENSITY`, \n                    fluidinfo.`C13`, \n                    fluidinfo.`C13MOLARMASS`, \n                    fluidinfo.`C13DENSITY`, \n                    fluidinfo.`CPLUS`, \n                    fluidinfo.`CPLUSMOLARMASS`, \n                    fluidinfo.`CPLUSDENSITY`, \n                    literatureandarticlestable.`ID` AS `LITID`, \n                    literatureandarticlestable.`AUTHOR`, \n                    literatureandarticlestable.`NAME` AS `LITNAME`, \n                    literatureandarticlestable.`JOURNAL`, \n                    literatureandarticlestable.`VOLUME`, \n                    literatureandarticlestable.`PAGES`, \n                    literatureandarticlestable.`YEAR`, \n                    literatureandarticlestable.`REFERENCEID`, \n                    litterature.`ARTICLEID`, \n                    litterature.`MAXPRESSURE`, \n                    litterature.`MINPRESSURE`, \n                    litterature.`MAXTEMPERATURE`, \n                    litterature.`MINTEMPERATURE`, \n                    fluidinfo.`SHARED` \nFROM litterature, experimentaldatatype, userdb, fluidinfo, literatureandarticlestable\nWHERE fluidinfo.`ID` = ?\n          AND litterature.`EXPTYPEID` = experimentaldatatype.`ID`\n          AND litterature.`FLUID_ID` = fluidinfo.`ID`\n          AND fluidinfo.`USERID` = userdb.`ID`\n          AND litterature.`ARTICLEID` = literatureandarticlestable.`ID`");
        litteratureRowSet.setTableName("litterature");
        litteratureRowSetGetLitID.setDataSourceName("java:comp/env/jdbc/NeqsimDataSource");
        litteratureRowSetGetLitID.setCommand("SELECT ALL litterature.`ID`, \n                    litterature.`FLUID_ID`, \n                    litterature.`NAME`, \n                    litterature.`TEXT`, \n                    litterature.`EXPTYPEID`, \n                    litterature.`TYPE`, \n                    litterature.`ARTICLEID`, \n                    litterature.`MINTEMPERATURE`, \n                    litterature.`MAXTEMPERATURE`, \n                    litterature.`MINPRESSURE`, \n                    litterature.`MAXPRESSURE`, \n                    experimentaldatatype.`TYPE` \nFROM litterature, experimentaldatatype\nWHERE litterature.`ID` = ?\n          AND litterature.`EXPTYPEID` = experimentaldatatype.`ID`");
        litteratureRowSetGetLitID.setTableName("litterature");
        experimentaldatatypeRowSet.setDataSourceName("java:comp/env/jdbc/NeqsimDataSource");
        experimentaldatatypeRowSet.setCommand("SELECT ALL experimentaldatatype.`ID`, \n                    experimentaldatatype.`TYPE` \nFROM experimentaldatatype\nORDER BY experimentaldatatype.`TYPE` ASC");
        experimentaldatatypeRowSet.setTableName("experimentaldatatype");
        litteratureRowSetTable.setDataSourceName("java:comp/env/jdbc/NeqsimDataSource");
        litteratureRowSetTable.setCommand("SELECT ALL litterature.`ID`, litterature.`FLUID_ID`, litterature.`FILE`, litterature.`TYPE`, litterature.`NAME`, litterature.`EXPTYPEID`, litterature.`ARTICLEID`, litterature.`MAXPRESSURE`, litterature.`MINPRESSURE`, litterature.`MAXTEMPERATURE`, litterature.`MINTEMPERATURE`, litterature.`TEXT`  FROM litterature");
        litteratureRowSetTable.setTableName("litterature");
        System.out.println("rowsets created ok in SessionBean 1");
        co2mdeaRowSet.setDataSourceName("java:comp/env/jdbc/NeqsimDataSource");
        co2mdeaRowSet.setCommand("SELECT * FROM co2mdea");
        co2mdeaRowSet.setTableName("co2mdea");
        webcomponentsRowSet.setDataSourceName("java:comp/env/jdbc/NeqsimDataSource");
        webcomponentsRowSet.setCommand("SELECT ALL webcomponents.`ID`, \n                    webcomponents.`NAME`, \n                    webcomponents.`TABLEROWNAME` \nFROM webcomponents");
        webcomponentsRowSet.setTableName("webcomponents");
        litteratureRowSetDataBase.setDataSourceName("java:comp/env/jdbc/NeqsimDataSource");
        litteratureRowSetDataBase.setCommand("SELECT ALL litterature.`ID`, \n                    litterature.`FLUID_ID`, \n                    litterature.`FILE`, \n                    litterature.`NAME`, \n                    litterature.`TEXT`, \n                    litterature.`EXPTYPEID`, \n                    litterature.`TYPE`, \n                    experimentaldatatype.`ID` AS `EXPID`, \n                    experimentaldatatype.`TYPE` AS `EXPTYPE`, \n                    userdb.`ID` AS `USERID`, \n                    userdb.`USERNAME`, \n                    userdb.`PASSWORD`, \n                    userdb.`EMAIL`, \n                    userdb.`FORNAME`, \n                    userdb.`SURENAME`, \n                    fluidinfo.`ID` AS `FLUIDID`, \n                    fluidinfo.`USERID`, \n                    fluidinfo.`FIELD`, \n                    fluidinfo.`WELL`, \n                    fluidinfo.`TEST`, \n                    fluidinfo.`SAMPLE`, \n                    fluidinfo.`TEXT`, \n                    fluidinfo.`HISTORY`, \n                    fluidinfo.`METHANE`, \n                    fluidinfo.`ETHANE`, \n                    fluidinfo.`PROPANE`, \n                    fluidinfo.`CO2`, \n                    fluidinfo.`H2S`, \n                    fluidinfo.`NITROGEN`, \n                    fluidinfo.`IBUTANE`, \n                    fluidinfo.`NBUTANE`, \n                    fluidinfo.`PENTANE`, \n                    fluidinfo.`NHEXANE`, \n                    fluidinfo.`CYCPENTANE`, \n                    fluidinfo.`CYCHEXANE`, \n                    fluidinfo.`NHEPTANE`, \n                    fluidinfo.`NOCTANE`, \n                    fluidinfo.`NNONANE`, \n                    fluidinfo.`NDECANE`, \n                    fluidinfo.`BENZENE`, \n                    fluidinfo.`TOLUENE`, \n                    fluidinfo.`MXYLENE`, \n                    fluidinfo.`PXYLENE`, \n                    fluidinfo.`OXYLENE`, \n                    fluidinfo.`WATER`, \n                    fluidinfo.`METHANOL`, \n                    fluidinfo.`MEG`, \n                    fluidinfo.`TEG`, \n                    fluidinfo.`DEG`, \n                    fluidinfo.`MDEA`, \n                    fluidinfo.`PIPERAZINE`, \n                    fluidinfo.`ACETICACID`, \n                    fluidinfo.`PROPIONICACID`, \n                    fluidinfo.`NAPLUS`, \n                    fluidinfo.`FEPLUS`, \n                    fluidinfo.`CAPLUS`, \n                    fluidinfo.`H3OPLUS`, \n                    fluidinfo.`OHMINUS`, \n                    fluidinfo.`CO3MINUS`, \n                    fluidinfo.`CLMINUS`, \n                    fluidinfo.`C6`, \n                    fluidinfo.`C6MOLARMASS`, \n                    fluidinfo.`C6DENSITY`, \n                    fluidinfo.`C7`, \n                    fluidinfo.`C7MOLARMASS`, \n                    fluidinfo.`C7DENSITY`, \n                    fluidinfo.`C8`, \n                    fluidinfo.`C8MOLARMASS`, \n                    fluidinfo.`C8DENSITY`, \n                    fluidinfo.`C9`, \n                    fluidinfo.`C9MOLARMASS`, \n                    fluidinfo.`C9DENSITY`, \n                    fluidinfo.`C10`, \n                    fluidinfo.`C10MOLARMASS`, \n                    fluidinfo.`C10DENSITY`, \n                    fluidinfo.`C11`, \n                    fluidinfo.`C11MOLARMASS`, \n                    fluidinfo.`C11DENSITY`, \n                    fluidinfo.`C12`, \n                    fluidinfo.`C12MOLARMASS`, \n                    fluidinfo.`C12DENSITY`, \n                    fluidinfo.`C13`, \n                    fluidinfo.`C13MOLARMASS`, \n                    fluidinfo.`C13DENSITY`, \n                    fluidinfo.`CPLUS`, \n                    fluidinfo.`CPLUSMOLARMASS`, \n                    fluidinfo.`CPLUSDENSITY`, \n                    litterature.`FLUID_ID`, \n                    litterature.`MAXPRESSURE`, \n                    litterature.`MINPRESSURE`, \n                    litterature.`MAXTEMPERATURE`, \n                    litterature.`MINTEMPERATURE`, \n                    litterature.`ARTICLEID` \nFROM litterature, experimentaldatatype, userdb, fluidinfo\nWHERE litterature.`EXPTYPEID` = experimentaldatatype.`ID`\n          AND litterature.`FLUID_ID` = fluidinfo.`ID`\n          AND fluidinfo.`USERID` = userdb.`ID`\nGROUP BY litterature.`ID`, litterature.`FLUID_ID`, litterature.`FILE`, litterature.`NAME`, litterature.`TEXT`, litterature.`EXPTYPEID`, litterature.`TYPE`, experimentaldatatype.`ID`, experimentaldatatype.`TYPE`, userdb.`ID`, userdb.`USERNAME`, userdb.`PASSWORD`, userdb.`EMAIL`, userdb.`FORNAME`, userdb.`SURENAME`, fluidinfo.`ID`, fluidinfo.`USERID`, fluidinfo.`FIELD`, fluidinfo.`WELL`, fluidinfo.`TEST`, fluidinfo.`SAMPLE`, fluidinfo.`TEXT`, fluidinfo.`HISTORY`, fluidinfo.`METHANE`, fluidinfo.`ETHANE`, fluidinfo.`PROPANE`, fluidinfo.`CO2`, fluidinfo.`H2S`, fluidinfo.`NITROGEN`, fluidinfo.`IBUTANE`, fluidinfo.`NBUTANE`, fluidinfo.`PENTANE`, fluidinfo.`NHEXANE`, fluidinfo.`CYCPENTANE`, fluidinfo.`CYCHEXANE`, fluidinfo.`NHEPTANE`, fluidinfo.`NOCTANE`, fluidinfo.`NNONANE`, fluidinfo.`NDECANE`, fluidinfo.`BENZENE`, fluidinfo.`TOLUENE`, fluidinfo.`MXYLENE`, fluidinfo.`PXYLENE`, fluidinfo.`OXYLENE`, fluidinfo.`WATER`, fluidinfo.`METHANOL`, fluidinfo.`MEG`, fluidinfo.`TEG`, fluidinfo.`DEG`, fluidinfo.`MDEA`, fluidinfo.`PIPERAZINE`, fluidinfo.`ACETICACID`, fluidinfo.`PROPIONICACID`, fluidinfo.`NAPLUS`, fluidinfo.`FEPLUS`, fluidinfo.`CAPLUS`, fluidinfo.`H3OPLUS`, fluidinfo.`OHMINUS`, fluidinfo.`CO3MINUS`, fluidinfo.`CLMINUS`, fluidinfo.`C6`, fluidinfo.`C6MOLARMASS`, fluidinfo.`C6DENSITY`, fluidinfo.`C7`, fluidinfo.`C7MOLARMASS`, fluidinfo.`C7DENSITY`, fluidinfo.`C8`, fluidinfo.`C8MOLARMASS`, fluidinfo.`C8DENSITY`, fluidinfo.`C9`, fluidinfo.`C9MOLARMASS`, fluidinfo.`C9DENSITY`, fluidinfo.`C10`, fluidinfo.`C10MOLARMASS`, fluidinfo.`C10DENSITY`, fluidinfo.`C11`, fluidinfo.`C11MOLARMASS`, fluidinfo.`C11DENSITY`, fluidinfo.`C12`, fluidinfo.`C12MOLARMASS`, fluidinfo.`C12DENSITY`, fluidinfo.`C13`, fluidinfo.`C13MOLARMASS`, fluidinfo.`C13DENSITY`, fluidinfo.`CPLUS`, fluidinfo.`CPLUSMOLARMASS`, fluidinfo.`CPLUSDENSITY`, litterature.`FLUID_ID`, litterature.`MAXPRESSURE`, litterature.`MINPRESSURE`, litterature.`MAXTEMPERATURE`, litterature.`MINTEMPERATURE`, litterature.`ARTICLEID`");
        litteratureRowSetDataBase.setTableName("litterature");
        literatureandarticlestableRowSet.setDataSourceName("java:comp/env/jdbc/NeqsimDataSource");
        literatureandarticlestableRowSet.setCommand("SELECT ALL literatureandarticlestable.`ID`, literatureandarticlestable.`AUTHOR`, literatureandarticlestable.`NAME`, literatureandarticlestable.`JOURNAL`, literatureandarticlestable.`VOLUME`, literatureandarticlestable.`PAGES`, literatureandarticlestable.`YEAR`, literatureandarticlestable.`REFERENCEID`  FROM literatureandarticlestable");
        literatureandarticlestableRowSet.setTableName("literatureandarticlestable");
        literatureandarticlestableRowSetSetArtID.setDataSourceName("java:comp/env/jdbc/NeqsimDataSource");
        literatureandarticlestableRowSetSetArtID.setCommand("SELECT ALL literatureandarticlestable.`ID`, \n                    literatureandarticlestable.`AUTHOR`, \n                    literatureandarticlestable.`NAME`, \n                    literatureandarticlestable.`JOURNAL`, \n                    literatureandarticlestable.`VOLUME`, \n                    literatureandarticlestable.`PAGES`, \n                    literatureandarticlestable.`YEAR`, \n                    literatureandarticlestable.`REFERENCEID` \nFROM literatureandarticlestable\nWHERE literatureandarticlestable.`ID` = ?");
        literatureandarticlestableRowSetSetArtID.setTableName("literatureandarticlestable");
        literatureandarticlestableRowSetDelete.setDataSourceName("java:comp/env/jdbc/NeqsimDataSource");
        literatureandarticlestableRowSetDelete.setCommand("SELECT ALL literatureandarticlestable.`ID`, literatureandarticlestable.`AUTHOR`, literatureandarticlestable.`NAME`, literatureandarticlestable.`JOURNAL`, literatureandarticlestable.`VOLUME`, literatureandarticlestable.`PAGES`, literatureandarticlestable.`YEAR`, literatureandarticlestable.`REFERENCEID`, litterature.`ID`, litterature.`FLUID_ID`, litterature.`FILE`, litterature.`NAME`, litterature.`TEXT`, litterature.`EXPTYPEID`, litterature.`TYPE`, litterature.`ARTICLEID`, litterature.`MINTEMPERATURE`, litterature.`MAXTEMPERATURE`, litterature.`MINPRESSURE`, litterature.`MAXPRESSURE`  FROM literatureandarticlestable, litterature WHERE literatureandarticlestable.`ID` = ?");
        literatureandarticlestableRowSetDelete.setTableName("literatureandarticlestable");

        documentsRowSet.setDataSourceName("java:comp/env/jdbc/NeqsimDataSource");
        documentsRowSet.setCommand("SELECT ALL documents.`ID`, documents.`FILEID`, documents.`FILETYPE`, documents.`TEXT`, documents.`ARTICLEID`, documents.`ARTICLETYPE`, documents.`NAME`, documents.`SUBJECT`, documents.`FILE`, documents.`LINK`  FROM documents");
        documentsRowSet.setTableName("documents");

        standardsRowSet.setDataSourceName("java:comp/env/jdbc/NeqsimDataSource");
        standardsRowSet.setCommand("SELECT ALL documents.`ID`, documents.`FILEID`, documents.`FILETYPE`, documents.`TEXT`, documents.`ARTICLEID`, documents.`ARTICLETYPE`, documents.`NAME`, documents.`SUBJECT`, documentsubjects.`SUBJECT`, documenttype.`NAME`, documents.`LINK`  FROM documents, documentsubjects, documenttype WHERE documentsubjects.`ID` = ?          AND documenttype.`ID` = ?          AND documents.`SUBJECT` = documentsubjects.`ID`          AND documents.`ARTICLEID` = documenttype.`ID`");
        standardsRowSet.setTableName("standards");

        standardsFullRowSet.setDataSourceName("java:comp/env/jdbc/NeqsimDataSource");
        standardsFullRowSet.setCommand("SELECT ALL documents.`ID`, documents.`FILEID`, documents.`FILETYPE`, documents.`TEXT`, documents.`ARTICLEID`, documents.`ARTICLETYPE`, documents.`NAME`, documents.`SUBJECT`, documents.`LINK`, documents.`FILE`  FROM documents");

        documentsRowSetWithInfo.setDataSourceName("java:comp/env/jdbc/NeqsimDataSource");
        documentsRowSetWithInfo.setCommand("SELECT ALL documents.`ID`, documents.`FILEID`, documents.`FILETYPE`, documents.`FILE`, documents.`TEXT`, documents.`ARTICLEID`, documents.`ARTICLETYPE`, documenttype.`ID` AS `DOCTYPEID`, documenttype.`NAME` AS `DOCTYPENAME`, literatureandarticlestable.`ID` AS `LITID`, literatureandarticlestable.`AUTHOR`, literatureandarticlestable.`NAME`, literatureandarticlestable.`JOURNAL`, literatureandarticlestable.`VOLUME`, literatureandarticlestable.`PAGES`, literatureandarticlestable.`YEAR`, literatureandarticlestable.`REFERENCEID`  FROM documents, documenttype, literatureandarticlestable WHERE documents.`ARTICLETYPE` = documenttype.`ID`          AND documents.`ARTICLEID` = literatureandarticlestable.`ID`");
        documentsRowSetWithInfo.setTableName("documents");
        documenttypeRowSet.setDataSourceName("java:comp/env/jdbc/NeqsimDataSource");
        documenttypeRowSet.setCommand("SELECT ALL documenttype.`ID`, documenttype.`NAME`  FROM documenttype");
        documenttypeRowSet.setTableName("documenttype");
        analysertypesviewRowSet.setDataSourceName("java:comp/env/jdbc/NeqsimDataSource");
        analysertypesviewRowSet.setCommand("SELECT ALL analysertypesview.`ID1`, \n                    analysertypesview.`INSTTYPES` \nFROM analysertypesview");
        analysertypesviewRowSet.setTableName("analysertypesview");
        analyserlocationsRowSet.setDataSourceName("java:comp/env/jdbc/NeqsimDataSource");
        analyserlocationsRowSet.setCommand("SELECT ALL analyserlocations.`ID1`, analyserlocations.`STED`  FROM analyserlocations");
        analyserlocationsRowSet.setTableName("analyserlocations");
        analysertypesRowSet.setDataSourceName("java:comp/env/jdbc/NeqsimDataSource");
        analysertypesRowSet.setCommand("SELECT ALL analysertypes.`ID1`, \n                    analysertypes.`INSTTYPES` \nFROM analysertypes");
        analysertypesRowSet.setTableName("analysertypes");
        addAnalysersRowSet.setDataSourceName("java:comp/env/jdbc/NeqsimDataSource");
        addAnalysersRowSet.setCommand("SELECT ALL analysers.`ID`, analysers.`INSTRUMENTTYPE`, analysers.`STED`, analysers.`FORMAL`, analysers.`INSTRUMENT`, analysers.`ANTALL`, analysers.`PLASSERING`, analysers.`TAGNR`, analysers.`KALIBRERINGSRUTINER`, analysers.`VEDLIKEHOLDSRUTINER`, analysers.`ERFARING`, analysers.`ONLINEOFFLINE`, analysers.`KONTAKTPERSON`, analysers.`KOMMENTARER`, analysers.`INSTALLASJONAAR`  FROM analysers WHERE analysers.`ID` = ?");
        addAnalysersRowSet.setTableName("analysers");
        fluidinfoFullTableRowSet2.setDataSourceName("java:comp/env/jdbc/NeqsimDataSource");
        fluidinfoFullTableRowSet2.setCommand("SELECT ALL fluidinfo.`ID`, fluidinfo.`USERID`, fluidinfo.`FIELD`, fluidinfo.`WELL`, fluidinfo.`TEST`, fluidinfo.`SAMPLE`, fluidinfo.`TEXT`, fluidinfo.`HISTORY`, fluidinfo.`METHANE`, fluidinfo.`ETHANE`, fluidinfo.`PROPANE`, fluidinfo.`CO2`, fluidinfo.`H2S`, fluidinfo.`NITROGEN`, fluidinfo.`IBUTANE`, fluidinfo.`NBUTANE`, fluidinfo.`PENTANE`, fluidinfo.`NHEXANE`, fluidinfo.`CYCPENTANE`, fluidinfo.`CYCHEXANE`, fluidinfo.`NHEPTANE`, fluidinfo.`NOCTANE`, fluidinfo.`NNONANE`, fluidinfo.`NDECANE`, fluidinfo.`BENZENE`, fluidinfo.`TOLUENE`, fluidinfo.`MXYLENE`, fluidinfo.`PXYLENE`, fluidinfo.`OXYLENE`, fluidinfo.`WATER`, fluidinfo.`METHANOL`, fluidinfo.`MEG`, fluidinfo.`TEG`, fluidinfo.`DEG`, fluidinfo.`MDEA`, fluidinfo.`PIPERAZINE`, fluidinfo.`ACETICACID`, fluidinfo.`PROPIONICACID`, fluidinfo.`NAPLUS`, fluidinfo.`FEPLUS`, fluidinfo.`CAPLUS`, fluidinfo.`H3OPLUS`, fluidinfo.`OHMINUS`, fluidinfo.`CO3MINUS`, fluidinfo.`CLMINUS`, fluidinfo.`C6`, fluidinfo.`C7`, fluidinfo.`C8`, fluidinfo.`C9`, fluidinfo.`C10`, fluidinfo.`C11`, fluidinfo.`C12`, fluidinfo.`C13`, fluidinfo.`CPLUS`, fluidinfo.`CPLUSMOLARMASS`, fluidinfo.`CPLUSDENSITY`, fluidinfo.`C20`, fluidinfo.`C19`, fluidinfo.`C18`, fluidinfo.`C16`, fluidinfo.`C15`, fluidinfo.`C17`, fluidinfo.`C14`, fluidinfo.`SO4MINUS`, fluidinfo.`iPENTANE`  FROM fluidinfo ORDER BY fluidinfo.`ID` DESC");
        fluidinfoFullTableRowSet2.setTableName("fluidinfo");
        litteratureRowSet1.setDataSourceName("java:comp/env/jdbc/NeqsimDataSource");
        litteratureRowSet1.setCommand("SELECT ALL litterature.`ID`, litterature.`FLUID_ID`, litterature.`NAME`, litterature.`TEXT`, litterature.`EXPTYPEID`, litterature.`TYPE`, litterature.`ARTICLEID`, litterature.`MINTEMPERATURE`, litterature.`MAXTEMPERATURE`, litterature.`MINPRESSURE`, litterature.`MAXPRESSURE`  FROM litterature");
        litteratureRowSet1.setTableName("litterature");
        litteratureRowSet2.setDataSourceName("java:comp/env/jdbc/NeqsimDataSource");
        litteratureRowSet2.setCommand("SELECT ALL litterature.`ID`, \n                    litterature.`FLUID_ID`, \n                    litterature.`FILE`, \n                    litterature.`TYPE`, \n                    litterature.`NAME`, \n                    litterature.`TEXT`, \n                    litterature.`EXPTYPEID`, \n                    experimentaldatatype.`ID` AS `EXPID`, \n                    experimentaldatatype.`TYPE` AS `EXPTYPE`, \n                    userdb.`ID` AS `USERID`, \n                    userdb.`USERNAME`, \n                    userdb.`PASSWORD`, \n                    userdb.`EMAIL`, \n                    userdb.`FORNAME`, \n                    userdb.`SURENAME`, \n                    fluidinfo.`ID` AS `FLUIDID`, \n                    fluidinfo.`USERID`, \n                    fluidinfo.`FIELD`, \n                    fluidinfo.`WELL`, \n                    fluidinfo.`TEST`, \n                    fluidinfo.`SAMPLE`, \n                    fluidinfo.`TEXT`, \n                    fluidinfo.`HISTORY`, \n                    fluidinfo.`METHANE`, \n                    fluidinfo.`ETHANE`, \n                    fluidinfo.`PROPANE`, \n                    fluidinfo.`CO2`, \n                    fluidinfo.`H2S`, \n                    fluidinfo.`NITROGEN`, \n                    fluidinfo.`IBUTANE`, \n                    fluidinfo.`NBUTANE`, \n                    fluidinfo.`PENTANE`, \n                    fluidinfo.`NHEXANE`, \n                    fluidinfo.`CYCPENTANE`, \n                    fluidinfo.`CYCHEXANE`, \n                    fluidinfo.`NHEPTANE`, \n                    fluidinfo.`NOCTANE`, \n                    fluidinfo.`NNONANE`, \n                    fluidinfo.`NDECANE`, \n                    fluidinfo.`BENZENE`, \n                    fluidinfo.`TOLUENE`, \n                    fluidinfo.`MXYLENE`, \n                    fluidinfo.`PXYLENE`, \n                    fluidinfo.`OXYLENE`, \n                    fluidinfo.`WATER`, \n                    fluidinfo.`METHANOL`, \n                    fluidinfo.`MEG`, \n                    fluidinfo.`TEG`, \n                    fluidinfo.`DEG`, \n                    fluidinfo.`MDEA`, \n                    fluidinfo.`PIPERAZINE`, \n                    fluidinfo.`ACETICACID`, \n                    fluidinfo.`PROPIONICACID`, \n                    fluidinfo.`NAPLUS`, \n                    fluidinfo.`FEPLUS`, \n                    fluidinfo.`CAPLUS`, \n                    fluidinfo.`H3OPLUS`, \n                    fluidinfo.`OHMINUS`, \n                    fluidinfo.`CO3MINUS`, \n                    fluidinfo.`CLMINUS`, \n                    fluidinfo.`C6`, \n                    fluidinfo.`C6MOLARMASS`, \n                    fluidinfo.`C6DENSITY`, \n                    fluidinfo.`C7`, \n                    fluidinfo.`C7MOLARMASS`, \n                    fluidinfo.`C7DENSITY`, \n                    fluidinfo.`C8`, \n                    fluidinfo.`C8MOLARMASS`, \n                    fluidinfo.`C8DENSITY`, \n                    fluidinfo.`C9`, \n                    fluidinfo.`C9MOLARMASS`, \n                    fluidinfo.`C9DENSITY`, \n                    fluidinfo.`C10`, \n                    fluidinfo.`C10MOLARMASS`, \n                    fluidinfo.`C10DENSITY`, \n                    fluidinfo.`C11`, \n                    fluidinfo.`C11MOLARMASS`, \n                    fluidinfo.`C11DENSITY`, \n                    fluidinfo.`C12`, \n                    fluidinfo.`C12MOLARMASS`, \n                    fluidinfo.`C12DENSITY`, \n                    fluidinfo.`C13`, \n                    fluidinfo.`C13MOLARMASS`, \n                    fluidinfo.`C13DENSITY`, \n                    fluidinfo.`CPLUS`, \n                    fluidinfo.`CPLUSMOLARMASS`, \n                    fluidinfo.`CPLUSDENSITY`, \n                    literatureandarticlestable.`ID` AS `LITID`, \n                    literatureandarticlestable.`AUTHOR`, \n                    literatureandarticlestable.`NAME`, \n                    literatureandarticlestable.`JOURNAL`, \n                    literatureandarticlestable.`VOLUME`, \n                    literatureandarticlestable.`PAGES`, \n                    literatureandarticlestable.`YEAR`, \n                    literatureandarticlestable.`REFERENCEID`, \n                    litterature.`ARTICLEID`, \n                    litterature.`MAXPRESSURE`, \n                    litterature.`MINPRESSURE`, \n                    litterature.`MAXTEMPERATURE`, \n                    litterature.`MINTEMPERATURE`, \n                    fluidinfo.`SHARED` \nFROM litterature, experimentaldatatype, userdb, fluidinfo, literatureandarticlestable\nWHERE fluidinfo.`ID` = ?\n          AND litterature.`EXPTYPEID` = experimentaldatatype.`ID`\n          AND litterature.`FLUID_ID` = fluidinfo.`ID`\n          AND fluidinfo.`USERID` = userdb.`ID`\n          AND litterature.`ARTICLEID` = literatureandarticlestable.`ID`");
        litteratureRowSet2.setTableName("litterature");
        pipelineparametersRowSet.setDataSourceName("java:comp/env/jdbc/NeqsimDataSource");
        pipelineparametersRowSet.setCommand("SELECT * FROM pipelineparameters");
        pipelineparametersRowSet.setTableName("pipelineparameters");
        fieldproductiondbRowSet.setDataSourceName("java:comp/env/jdbc/NeqsimDataSource");
        fieldproductiondbRowSet.setCommand("SELECT ALL fieldproductiondb.`ID`, fieldproductiondb.`FIELDID`, fieldproductiondb.`YEAR`, fieldproductiondb.`Production`, fieldproductiondb.`FLUIDID`, fieldproductiondb.`DELIVERYPOINTID`  FROM fieldproductiondb");
        fieldproductiondbRowSet.setTableName("fieldproductiondb");
        fluidinfoRowSet1.setDataSourceName("java:comp/env/jdbc/NeqsimDataSource");
        fluidinfoRowSet1.setCommand("SELECT * FROM fluidinfo");
        fluidinfoRowSet1.setTableName("fluidinfo");
        pvt_satptRowSet.setDataSourceName("java:comp/env/jdbc/NeqsimDataSource");
        pvt_satptRowSet.setCommand("SELECT ALL pvt_satpt.`ID`, pvt_satpt.`Pressure`, pvt_satpt.`Temperature`, pvt_satpt.`Text`, pvt_satpt.`Weight`, pvt_satpt.`FLUID_ID`  FROM pvt_satpt WHERE pvt_satpt.`FLUID_ID`=?");
        pvt_satptRowSet.setTableName("pvt_satpt");
        companyRowSet.setDataSourceName("java:comp/env/jdbc/NeqsimDataSource");
        companyRowSet.setCommand("SELECT * FROM company");
        companyRowSet.setTableName("company");
        companyDataProvider.setCachedRowSet(companyRowSet);
        analysersRowSet1.setDataSourceName("java:comp/env/jdbc/NeqsimDataSource");
        analysersRowSet1.setCommand("SELECT * FROM analysers");
        analysersRowSet1.setTableName("analysers");
        userdbRowSet1.setDataSourceName("java:comp/env/jdbc/NeqsimDataSource");
        userdbRowSet1.setCommand("SELECT * FROM userdb");
        userdbRowSet1.setTableName("userdb");
        analyserlocationsRowSet1.setDataSourceName("java:comp/env/jdbc/NeqsimDataSource");
        analyserlocationsRowSet1.setCommand("SELECT * FROM analyserlocations");
        analyserlocationsRowSet1.setTableName("analyserlocations");

    }

    /**
     * Bean cleanup.
     */
    protected void afterRenderResponse() {
    }

    /**
     * Getter for property numberOfStartPageViews.
     * @return Value of property numberOfStartPageViews.
     */
    public Integer getNumberOfStartPageViews() {
        return this.numberOfStartPageViews;
    }

    /**
     * Setter for property numberOfStartPageViews.
     * @param numberOfStartPageViews New value of property numberOfStartPageViews.
     */
    public void setNumberOfStartPageViews(Integer numberOfStartPageViews) {
        this.numberOfStartPageViews = numberOfStartPageViews;
    }
    /**
     * Holds value of property loginBean.
     */
    private neqsimserver2.Util.LoginBean loginBean;

    /**
     * Getter for property loginBean.
     * @return Value of property loginBean.
     */
    public neqsimserver2.Util.LoginBean getLoginBean() {

        return this.loginBean;
    }

    /**
     * Setter for property loginBean.
     * @param loginBean New value of property loginBean.
     */
    public void setLoginBean(neqsimserver2.Util.LoginBean loginBean) {

        this.loginBean = loginBean;
    }

    @Override
    public void init() {
        // Perform initializations inherited from our superclass
        super.init();
        // Perform application initialization that must complete
        // *before* managed components are initialized
        // TODO - add your own initialiation code here

        // <editor-fold defaultstate="collapsed" desc="Managed Component Initialization">
        // Initialize automatically managed components
        // *Note* - this logic should NOT be modified
        try {
            _init();
        } catch (Exception e) {
            log("SessionBean1 Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
        }
    }
    /**
     * Holds value of property activeFluid.
     */
    private int activeFluidID = 0;

    /**
     * Getter for property activeFluid.
     * @return Value of property activeFluid.
     */
    public int getActiveFluidID() {

        return this.activeFluidID;
    }

    /**
     * Setter for property activeFluid.
     * @param activeFluid New value of property activeFluid.
     */
    public void setActiveFluidID(int activeFluid) {

        this.activeFluidID = activeFluid;
    }
    /**
     * Holds value of property litteratureID.
     */
    private int litteratureID;

    /**
     * Getter for property litteratureID.
     * @return Value of property litteratureID.
     */
    public int getLitteratureID() {

        return this.litteratureID;
    }

    /**
     * Setter for property litteratureID.
     * @param litteratureID New value of property litteratureID.
     */
    public void setLitteratureID(int litteratureID) {

        this.litteratureID = litteratureID;
    }
    /**
     * Holds value of property jFreeChartObject.
     */
    private JFreeChart jFreeChartObject;

    /**
     * Getter for property jFreeChartObject.
     * @return Value of property jFreeChartObject.
     */
    public JFreeChart getJFreeChartObject() {

        return this.jFreeChartObject;
    }

    /**
     * Setter for property jFreeChartObject.
     * @param jFreeChartObject New value of property jFreeChartObject.
     */
    public void setJFreeChartObject(JFreeChart jFreeChartObject) {

        this.jFreeChartObject = jFreeChartObject;
    }
    /**
     * Holds value of property expTypreChoices.
     */
    private String[] expTypeChoices = new String[]{};

    /**
     * Getter for property expTypreChoices.
     * @return Value of property expTypreChoices.
     */
    public String[] getExpTypeChoices() {

        return this.expTypeChoices;
    }

    /**
     * Setter for property expTypreChoices.
     * @param expTypreChoices New value of property expTypreChoices.
     */
    public void setExpTypeChoices(String[] expTypeChoices) {

        this.expTypeChoices = expTypeChoices;
    }
    /**
     * Holds value of property documentName.
     */
    private String documentName;

    /**
     * Getter for property documentName.
     * @return Value of property documentName.
     */
    public String getDocumentName() {

        return this.documentName;
    }

    /**
     * Setter for property documentName.
     * @param documentName New value of property documentName.
     */
    public void setDocumentName(String documentName) {

        this.documentName = documentName;
    }
    /**
     * Holds value of property documentID.
     */
    private int documentID;

    /**
     * Getter for property documentID.
     * @return Value of property documentID.
     */
    public int getDocumentID() {

        return this.documentID;
    }

    /**
     * Setter for property documentID.
     * @param documentID New value of property documentID.
     */
    public void setDocumentID(int documentID) {

        this.documentID = documentID;
    }

    public String getActiveSubject() {
        return activeSubject;
    }

    public void setActiveSubject(String activeSubject) {
        this.activeSubject = activeSubject;
    }

    public Integer getActiveFieldID() {
        return activeFieldID;
    }

    public void setActiveFieldID(Integer activeField) {
        this.activeFieldID = activeField;
    }

    public Integer getActivePipePlantID() {
        return activePipePlantID;
    }

    public void setActivePipePlantID(Integer activePipePlant) {
        this.activePipePlantID = activePipePlant;
    }

    /**
     * <p>This method is called when the session containing it is about to be
     * passivated.  Typically, this occurs in a distributed servlet container
     * when the session is about to be transferred to a different
     * container instance, after which the <code>activate()</code> method
     * will be called to indicate that the transfer is complete.</p>
     *
     * <p>You may customize this method to release references to session data
     * or resources that can not be serialized with the session itself.</p>
     */
    public void passivate() {
    }

    /**
     * <p>This method is called when the session containing it was
     * reactivated.</p>
     *
     * <p>You may customize this method to reacquire references to session
     * data or resources that could not be serialized with the
     * session itself.</p>
     */
    public void activate() {
    }

    /**
     * <p>This method is called when this bean is removed from
     * session scope.  Typically, this occurs as a result of
     * the session timing out or being terminated by the application.</p>
     *
     * <p>You may customize this method to clean up resources allocated
     * during the execution of the <code>init()</code> method, or
     * at any later time during the lifetime of the application.</p>
     */
    public void destroy() {
    }

    public String getSQLdata(String expType) {
        if(expType.equals("")) expType=((ThermoSessionBean) getBean("Thermo$ThermoSessionBean")).getActiveExperimentType();
        String andor = "AND";
        String temp1 = "";
        if (!expType.equals("*")) {
            temp1 += "AND experimentaldatatype.TYPE='" + expType + "'\n";
        }

        String compSQL = "AND (";
        for (int i = 0; i < ((ThermoSessionBean) getBean("Thermo$ThermoSessionBean")).getThermoSystem().getCompNames().length - 1; i++) {
            compSQL += "fluidinfo." + ((ThermoSessionBean) getBean("Thermo$ThermoSessionBean")).getThermoSystem().getCompNames()[i] + ">1e-30\n " + andor + " ";
        }
        compSQL += "fluidinfo." + ((ThermoSessionBean) getBean("Thermo$ThermoSessionBean")).getThermoSystem().getCompNames()[((ThermoSessionBean) getBean("Thermo$ThermoSessionBean")).getThermoSystem().getCompNames().length - 1] + ">1e-30\n";
        compSQL += ")\n";
        try {
            log("SELECT ALL litterature.ID, \n                    litterature.FLUID_ID, \n                    litterature.FILE, \n                    litterature.TYPE, \n                    litterature.NAME, \n                    litterature.TEXT, \n                    litterature.EXPTYPEID, \n                    experimentaldatatype.ID AS EXPID, \n                    experimentaldatatype.TYPE, \n                    userdb.ID AS USERID, \n                    userdb.USERNAME, \n                    userdb.PASSWORD, \n                    userdb.EMAIL, \n                    userdb.FORNAME, \n                    userdb.SURENAME, \n                    fluidinfo.ID AS FLUIDID, \n                    fluidinfo.USERID, \n                    fluidinfo.FIELD, \n                    fluidinfo.WELL, \n                    fluidinfo.TEST, \n                    fluidinfo.SAMPLE, \n                    fluidinfo.TEXT, \n                    fluidinfo.HISTORY, \n                    fluidinfo.METHANE, \n                    fluidinfo.ETHANE, \n                    fluidinfo.PROPANE, \n                    fluidinfo.CO2, \n                    fluidinfo.H2S, \n                    fluidinfo.NITROGEN, \n                    fluidinfo.IBUTANE, \n                    fluidinfo.NBUTANE, \n                    fluidinfo.PENTANE, \n                    fluidinfo.NHEXANE, \n                    fluidinfo.CYCPENTANE, \n                    fluidinfo.CYCHEXANE, \n                    fluidinfo.NHEPTANE, \n                    fluidinfo.NOCTANE, \n                    fluidinfo.NNONANE, \n                    fluidinfo.NDECANE, \n                    fluidinfo.BENZENE, \n                    fluidinfo.TOLUENE, \n                    fluidinfo.MXYLENE, \n                    fluidinfo.PXYLENE, \n                    fluidinfo.OXYLENE, \n                    fluidinfo.WATER, \n                    fluidinfo.METHANOL, \n                    fluidinfo.MEG, \n                    fluidinfo.TEG, \n                    fluidinfo.DEG, \n                    fluidinfo.MDEA, \n                    fluidinfo.PIPERAZINE, \n                    fluidinfo.ACETICACID, \n                    fluidinfo.PROPIONICACID, \n                    fluidinfo.NAPLUS, \n                    fluidinfo.FEPLUS, \n                    fluidinfo.CAPLUS, \n                    fluidinfo.H3OPLUS, \n                    fluidinfo.OHMINUS, \n                    fluidinfo.CO3MINUS, \n                    fluidinfo.CLMINUS, \n                    fluidinfo.C6, \n                    fluidinfo.C6MOLARMASS, \n                    fluidinfo.C6DENSITY, \n                    fluidinfo.C7, \n                    fluidinfo.C7MOLARMASS, \n                    fluidinfo.C7DENSITY, \n                    fluidinfo.C8, \n                    fluidinfo.C8MOLARMASS, \n                    fluidinfo.C8DENSITY, \n                    fluidinfo.C9, \n                    fluidinfo.C9MOLARMASS, \n                    fluidinfo.C9DENSITY, \n                    fluidinfo.C10, \n                    fluidinfo.C10MOLARMASS, \n                    fluidinfo.C10DENSITY, \n                    fluidinfo.C11, \n                    fluidinfo.C11MOLARMASS, \n                    fluidinfo.C11DENSITY, \n                    fluidinfo.C12, \n                    fluidinfo.C12MOLARMASS, \n                    fluidinfo.C12DENSITY, \n                    fluidinfo.C13, \n                    fluidinfo.C13MOLARMASS, \n                    fluidinfo.C13DENSITY, \n                    fluidinfo.CPLUS, \n                    fluidinfo.CPLUSMOLARMASS, \n                    fluidinfo.CPLUSDENSITY, \n                    literatureandarticlestable.ID AS LITID, \n                    literatureandarticlestable.AUTHOR, \n                    literatureandarticlestable.NAME AS LITNAME, \n                    literatureandarticlestable.JOURNAL, \n                    literatureandarticlestable.VOLUME, \n                    literatureandarticlestable.PAGES, \n                    literatureandarticlestable.YEAR, \n                    literatureandarticlestable.REFERENCEID, \n                    litterature.ARTICLEID, \n                    litterature.MAXPRESSURE, \n                    litterature.MINPRESSURE, \n                    litterature.MAXTEMPERATURE, \n                    litterature.MINTEMPERATURE, \n                    fluidinfo.SHARED \nFROM litterature, experimentaldatatype, userdb, fluidinfo, literatureandarticlestable\nWHERE litterature.EXPTYPEID = experimentaldatatype.ID\n          AND litterature.FLUID_ID = fluidinfo.ID\n          AND fluidinfo.USERID = userdb.ID\n  AND litterature.ARTICLEID = literatureandarticlestable.ID\n" +
                    temp1 + compSQL +
                    "GROUP BY litterature.ID, litterature.FLUID_ID, litterature.FILE, litterature.NAME, litterature.TEXT, litterature.EXPTYPEID, litterature.TYPE, experimentaldatatype.ID, experimentaldatatype.TYPE, userdb.ID, userdb.USERNAME, userdb.PASSWORD, userdb.EMAIL, userdb.FORNAME, userdb.SURENAME, fluidinfo.ID, fluidinfo.USERID, fluidinfo.FIELD, fluidinfo.WELL, fluidinfo.TEST, fluidinfo.SAMPLE, fluidinfo.TEXT, fluidinfo.HISTORY, fluidinfo.METHANE, fluidinfo.ETHANE, fluidinfo.PROPANE, fluidinfo.CO2, fluidinfo.H2S, fluidinfo.NITROGEN, fluidinfo.IBUTANE, fluidinfo.NBUTANE, fluidinfo.PENTANE, fluidinfo.NHEXANE, fluidinfo.CYCPENTANE, fluidinfo.CYCHEXANE, fluidinfo.NHEPTANE, fluidinfo.NOCTANE, fluidinfo.NNONANE, fluidinfo.NDECANE, fluidinfo.BENZENE, fluidinfo.TOLUENE, fluidinfo.MXYLENE, fluidinfo.PXYLENE, fluidinfo.OXYLENE, fluidinfo.WATER, fluidinfo.METHANOL, fluidinfo.MEG, fluidinfo.TEG, fluidinfo.DEG, fluidinfo.MDEA, fluidinfo.PIPERAZINE, fluidinfo.ACETICACID, fluidinfo.PROPIONICACID, fluidinfo.NAPLUS, fluidinfo.FEPLUS, fluidinfo.CAPLUS, fluidinfo.H3OPLUS, fluidinfo.OHMINUS, fluidinfo.CO3MINUS, fluidinfo.CLMINUS, fluidinfo.C6, fluidinfo.C6MOLARMASS, fluidinfo.C6DENSITY, fluidinfo.C7, fluidinfo.C7MOLARMASS, fluidinfo.C7DENSITY, fluidinfo.C8, fluidinfo.C8MOLARMASS, fluidinfo.C8DENSITY, fluidinfo.C9, fluidinfo.C9MOLARMASS, fluidinfo.C9DENSITY, fluidinfo.C10, fluidinfo.C10MOLARMASS, fluidinfo.C10DENSITY, fluidinfo.C11, fluidinfo.C11MOLARMASS, fluidinfo.C11DENSITY, fluidinfo.C12, fluidinfo.C12MOLARMASS, fluidinfo.C12DENSITY, fluidinfo.C13, fluidinfo.C13MOLARMASS, fluidinfo.C13DENSITY, fluidinfo.CPLUS, fluidinfo.CPLUSMOLARMASS, fluidinfo.CPLUSDENSITY, litterature.FLUID_ID, litterature.MAXPRESSURE, litterature.MINPRESSURE, litterature.MAXTEMPERATURE, litterature.MINTEMPERATURE, litterature.ARTICLEID");

            getLitteratureRowSet2().setCommand("SELECT ALL litterature.ID, \n                    litterature.FLUID_ID, \n                     litterature.TYPE, \n                    litterature.NAME, \n                    litterature.TEXT, \n                    litterature.EXPTYPEID, \n                    experimentaldatatype.ID AS EXPID, \n                    experimentaldatatype.TYPE, \n                    userdb.ID AS USERID, \n                    userdb.USERNAME, \n                    userdb.PASSWORD, \n                    userdb.EMAIL, \n                    userdb.FORNAME, \n                    userdb.SURENAME, \n                    fluidinfo.ID AS FLUIDID, \n                    fluidinfo.USERID, \n                    fluidinfo.FIELD, \n                    fluidinfo.WELL, \n                    fluidinfo.TEST, \n                    fluidinfo.SAMPLE, \n                    fluidinfo.TEXT, \n                    fluidinfo.HISTORY, \n                    fluidinfo.METHANE, \n                    fluidinfo.ETHANE, \n                    fluidinfo.PROPANE, \n                    fluidinfo.CO2, \n                    fluidinfo.H2S, \n                    fluidinfo.NITROGEN, \n                    fluidinfo.IBUTANE, \n                    fluidinfo.NBUTANE, \n                    fluidinfo.PENTANE, \n                    fluidinfo.NHEXANE, \n                    fluidinfo.CYCPENTANE, \n                    fluidinfo.CYCHEXANE, \n                    fluidinfo.NHEPTANE, \n                    fluidinfo.NOCTANE, \n                    fluidinfo.NNONANE, \n                    fluidinfo.NDECANE, \n                    fluidinfo.BENZENE, \n                    fluidinfo.TOLUENE, \n                    fluidinfo.MXYLENE, \n                    fluidinfo.PXYLENE, \n                    fluidinfo.OXYLENE, \n                    fluidinfo.WATER, \n                    fluidinfo.METHANOL, \n                    fluidinfo.MEG, \n                    fluidinfo.TEG, \n                    fluidinfo.DEG, \n                    fluidinfo.MDEA, \n                    fluidinfo.PIPERAZINE, \n                    fluidinfo.ACETICACID, \n                    fluidinfo.PROPIONICACID, \n                    fluidinfo.NAPLUS, \n                    fluidinfo.FEPLUS, \n                    fluidinfo.CAPLUS, \n                    fluidinfo.H3OPLUS, \n                    fluidinfo.OHMINUS, \n                    fluidinfo.CO3MINUS, \n                    fluidinfo.CLMINUS, \n                    fluidinfo.C6, \n                    fluidinfo.C6MOLARMASS, \n                    fluidinfo.C6DENSITY, \n                    fluidinfo.C7, \n                    fluidinfo.C7MOLARMASS, \n                    fluidinfo.C7DENSITY, \n                    fluidinfo.C8, \n                    fluidinfo.C8MOLARMASS, \n                    fluidinfo.C8DENSITY, \n                    fluidinfo.C9, \n                    fluidinfo.C9MOLARMASS, \n                    fluidinfo.C9DENSITY, \n                    fluidinfo.C10, \n                    fluidinfo.C10MOLARMASS, \n                    fluidinfo.C10DENSITY, \n                    fluidinfo.C11, \n                    fluidinfo.C11MOLARMASS, \n                    fluidinfo.C11DENSITY, \n                    fluidinfo.C12, \n                    fluidinfo.C12MOLARMASS, \n                    fluidinfo.C12DENSITY, \n                    fluidinfo.C13, \n                    fluidinfo.C13MOLARMASS, \n                    fluidinfo.C13DENSITY, \n                    fluidinfo.CPLUS, \n                    fluidinfo.CPLUSMOLARMASS, \n                    fluidinfo.CPLUSDENSITY, \n                    literatureandarticlestable.ID AS LITID, \n                    literatureandarticlestable.AUTHOR, \n                    literatureandarticlestable.NAME AS LITNAME, \n                    literatureandarticlestable.JOURNAL, \n                    literatureandarticlestable.VOLUME, \n                    literatureandarticlestable.PAGES, \n                    literatureandarticlestable.YEAR, \n                    literatureandarticlestable.REFERENCEID, \n                    litterature.ARTICLEID, \n                    litterature.MAXPRESSURE, \n                    litterature.MINPRESSURE, \n                    litterature.MAXTEMPERATURE, \n                    litterature.MINTEMPERATURE, \n                    fluidinfo.SHARED \nFROM litterature, experimentaldatatype, userdb, fluidinfo, literatureandarticlestable\nWHERE litterature.EXPTYPEID = experimentaldatatype.ID\n          AND litterature.FLUID_ID = fluidinfo.ID\n          AND fluidinfo.USERID = userdb.ID\n  AND litterature.ARTICLEID = literatureandarticlestable.ID\n" +
                    temp1 + compSQL +
                  //  "GROUP BY litterature.ID, litterature.FLUID_ID, litterature.FILE, litterature.NAME, litterature.TEXT, litterature.EXPTYPEID, litterature.TYPE, experimentaldatatype.ID, experimentaldatatype.TYPE, userdb.ID, userdb.USERNAME, userdb.PASSWORD, userdb.EMAIL, userdb.FORNAME, userdb.SURENAME, fluidinfo.ID, fluidinfo.USERID, fluidinfo.FIELD, fluidinfo.WELL, fluidinfo.TEST, fluidinfo.SAMPLE, fluidinfo.TEXT, fluidinfo.HISTORY, fluidinfo.METHANE, fluidinfo.ETHANE, fluidinfo.PROPANE, fluidinfo.CO2, fluidinfo.H2S, fluidinfo.NITROGEN, fluidinfo.IBUTANE, fluidinfo.NBUTANE, fluidinfo.PENTANE, fluidinfo.NHEXANE, fluidinfo.CYCPENTANE, fluidinfo.CYCHEXANE, fluidinfo.NHEPTANE, fluidinfo.NOCTANE, fluidinfo.NNONANE, fluidinfo.NDECANE, fluidinfo.BENZENE, fluidinfo.TOLUENE, fluidinfo.MXYLENE, fluidinfo.PXYLENE, fluidinfo.OXYLENE, fluidinfo.WATER, fluidinfo.METHANOL, fluidinfo.MEG, fluidinfo.TEG, fluidinfo.DEG, fluidinfo.MDEA, fluidinfo.PIPERAZINE, fluidinfo.ACETICACID, fluidinfo.PROPIONICACID, fluidinfo.NAPLUS, fluidinfo.FEPLUS, fluidinfo.CAPLUS, fluidinfo.H3OPLUS, fluidinfo.OHMINUS, fluidinfo.CO3MINUS, fluidinfo.CLMINUS, fluidinfo.C6, fluidinfo.C6MOLARMASS, fluidinfo.C6DENSITY, fluidinfo.C7, fluidinfo.C7MOLARMASS, fluidinfo.C7DENSITY, fluidinfo.C8, fluidinfo.C8MOLARMASS, fluidinfo.C8DENSITY, fluidinfo.C9, fluidinfo.C9MOLARMASS, fluidinfo.C9DENSITY, fluidinfo.C10, fluidinfo.C10MOLARMASS, fluidinfo.C10DENSITY, fluidinfo.C11, fluidinfo.C11MOLARMASS, fluidinfo.C11DENSITY, fluidinfo.C12, fluidinfo.C12MOLARMASS, fluidinfo.C12DENSITY, fluidinfo.C13, fluidinfo.C13MOLARMASS, fluidinfo.C13DENSITY, fluidinfo.CPLUS, fluidinfo.CPLUSMOLARMASS, fluidinfo.CPLUSDENSITY, litterature.FLUID_ID, litterature.MAXPRESSURE, litterature.MINPRESSURE, litterature.MAXTEMPERATURE, litterature.MINTEMPERATURE, litterature.ARTICLEID");
         "GROUP BY litterature.ID, litterature.FLUID_ID, litterature.NAME, litterature.TEXT, litterature.EXPTYPEID, litterature.TYPE, experimentaldatatype.ID, experimentaldatatype.TYPE, userdb.ID, userdb.USERNAME, userdb.PASSWORD, userdb.EMAIL, userdb.FORNAME, userdb.SURENAME, fluidinfo.ID, fluidinfo.USERID, fluidinfo.FIELD, fluidinfo.WELL, fluidinfo.TEST, fluidinfo.SAMPLE, fluidinfo.TEXT, fluidinfo.HISTORY, fluidinfo.METHANE, fluidinfo.ETHANE, fluidinfo.PROPANE, fluidinfo.CO2, fluidinfo.H2S, fluidinfo.NITROGEN, fluidinfo.IBUTANE, fluidinfo.NBUTANE, fluidinfo.PENTANE, fluidinfo.NHEXANE, fluidinfo.CYCPENTANE, fluidinfo.CYCHEXANE, fluidinfo.NHEPTANE, fluidinfo.NOCTANE, fluidinfo.NNONANE, fluidinfo.NDECANE, fluidinfo.BENZENE, fluidinfo.TOLUENE, fluidinfo.MXYLENE, fluidinfo.PXYLENE, fluidinfo.OXYLENE, fluidinfo.WATER, fluidinfo.METHANOL, fluidinfo.MEG, fluidinfo.TEG, fluidinfo.DEG, fluidinfo.MDEA, fluidinfo.PIPERAZINE, fluidinfo.ACETICACID, fluidinfo.PROPIONICACID, fluidinfo.NAPLUS, fluidinfo.FEPLUS, fluidinfo.CAPLUS, fluidinfo.H3OPLUS, fluidinfo.OHMINUS, fluidinfo.CO3MINUS, fluidinfo.CLMINUS, fluidinfo.C6, fluidinfo.C6MOLARMASS, fluidinfo.C6DENSITY, fluidinfo.C7, fluidinfo.C7MOLARMASS, fluidinfo.C7DENSITY, fluidinfo.C8, fluidinfo.C8MOLARMASS, fluidinfo.C8DENSITY, fluidinfo.C9, fluidinfo.C9MOLARMASS, fluidinfo.C9DENSITY, fluidinfo.C10, fluidinfo.C10MOLARMASS, fluidinfo.C10DENSITY, fluidinfo.C11, fluidinfo.C11MOLARMASS, fluidinfo.C11DENSITY, fluidinfo.C12, fluidinfo.C12MOLARMASS, fluidinfo.C12DENSITY, fluidinfo.C13, fluidinfo.C13MOLARMASS, fluidinfo.C13DENSITY, fluidinfo.CPLUS, fluidinfo.CPLUSMOLARMASS, fluidinfo.CPLUSDENSITY, litterature.FLUID_ID, litterature.MAXPRESSURE, litterature.MINPRESSURE, litterature.MAXTEMPERATURE, litterature.MINTEMPERATURE, litterature.ARTICLEID");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "ToThermoMeasurementDB";
    }

    public int getCountSQLdata(String expType) {
        if(expType.equals("")) expType=((ThermoSessionBean) getBean("Thermo$ThermoSessionBean")).getActiveExperimentType();
        int rowNumber = 0;
        String andor = "AND";
        String temp1 ="";
        if (!expType.equals("*")) {
             temp1 += "AND experimentaldatatype.TYPE='" + expType + "'\n";
        }

        String compSQL = "AND (";
        for (int i = 0; i < ((ThermoSessionBean) getBean("Thermo$ThermoSessionBean")).getThermoSystem().getCompNames().length - 1; i++) {
            compSQL += "fluidinfo." + ((ThermoSessionBean) getBean("Thermo$ThermoSessionBean")).getThermoSystem().getCompNames()[i] + ">1e-30\n " + andor + " ";
        }
        compSQL += "fluidinfo." + ((ThermoSessionBean) getBean("Thermo$ThermoSessionBean")).getThermoSystem().getCompNames()[((ThermoSessionBean) getBean("Thermo$ThermoSessionBean")).getThermoSystem().getCompNames().length - 1] + ">1e-30\n";
        compSQL += ")\n";
        try {
            log("SELECT ALL litterature.ID, \n                    litterature.FLUID_ID, \n                    litterature.FILE, \n                    litterature.TYPE, \n                    litterature.NAME, \n                    litterature.TEXT, \n                    litterature.EXPTYPEID, \n                    experimentaldatatype.ID AS EXPID, \n                    experimentaldatatype.TYPE, \n                    userdb.ID AS USERID, \n                    userdb.USERNAME, \n                    userdb.PASSWORD, \n                    userdb.EMAIL, \n                    userdb.FORNAME, \n                    userdb.SURENAME, \n                    fluidinfo.ID AS FLUIDID, \n                    fluidinfo.USERID, \n                    fluidinfo.FIELD, \n                    fluidinfo.WELL, \n                    fluidinfo.TEST, \n                    fluidinfo.SAMPLE, \n                    fluidinfo.TEXT, \n                    fluidinfo.HISTORY, \n                    fluidinfo.METHANE, \n                    fluidinfo.ETHANE, \n                    fluidinfo.PROPANE, \n                    fluidinfo.CO2, \n                    fluidinfo.H2S, \n                    fluidinfo.NITROGEN, \n                    fluidinfo.IBUTANE, \n                    fluidinfo.NBUTANE, \n                    fluidinfo.PENTANE, \n                    fluidinfo.NHEXANE, \n                    fluidinfo.CYCPENTANE, \n                    fluidinfo.CYCHEXANE, \n                    fluidinfo.NHEPTANE, \n                    fluidinfo.NOCTANE, \n                    fluidinfo.NNONANE, \n                    fluidinfo.NDECANE, \n                    fluidinfo.BENZENE, \n                    fluidinfo.TOLUENE, \n                    fluidinfo.MXYLENE, \n                    fluidinfo.PXYLENE, \n                    fluidinfo.OXYLENE, \n                    fluidinfo.WATER, \n                    fluidinfo.METHANOL, \n                    fluidinfo.MEG, \n                    fluidinfo.TEG, \n                    fluidinfo.DEG, \n                    fluidinfo.MDEA, \n                    fluidinfo.PIPERAZINE, \n                    fluidinfo.ACETICACID, \n                    fluidinfo.PROPIONICACID, \n                    fluidinfo.NAPLUS, \n                    fluidinfo.FEPLUS, \n                    fluidinfo.CAPLUS, \n                    fluidinfo.H3OPLUS, \n                    fluidinfo.OHMINUS, \n                    fluidinfo.CO3MINUS, \n                    fluidinfo.CLMINUS, \n                    fluidinfo.C6, \n                    fluidinfo.C6MOLARMASS, \n                    fluidinfo.C6DENSITY, \n                    fluidinfo.C7, \n                    fluidinfo.C7MOLARMASS, \n                    fluidinfo.C7DENSITY, \n                    fluidinfo.C8, \n                    fluidinfo.C8MOLARMASS, \n                    fluidinfo.C8DENSITY, \n                    fluidinfo.C9, \n                    fluidinfo.C9MOLARMASS, \n                    fluidinfo.C9DENSITY, \n                    fluidinfo.C10, \n                    fluidinfo.C10MOLARMASS, \n                    fluidinfo.C10DENSITY, \n                    fluidinfo.C11, \n                    fluidinfo.C11MOLARMASS, \n                    fluidinfo.C11DENSITY, \n                    fluidinfo.C12, \n                    fluidinfo.C12MOLARMASS, \n                    fluidinfo.C12DENSITY, \n                    fluidinfo.C13, \n                    fluidinfo.C13MOLARMASS, \n                    fluidinfo.C13DENSITY, \n                    fluidinfo.CPLUS, \n                    fluidinfo.CPLUSMOLARMASS, \n                    fluidinfo.CPLUSDENSITY, \n                    literatureandarticlestable.ID AS LITID, \n                    literatureandarticlestable.AUTHOR, \n                    literatureandarticlestable.NAME AS LITNAME, \n                    literatureandarticlestable.JOURNAL, \n                    literatureandarticlestable.VOLUME, \n                    literatureandarticlestable.PAGES, \n                    literatureandarticlestable.YEAR, \n                    literatureandarticlestable.REFERENCEID, \n                    litterature.ARTICLEID, \n                    litterature.MAXPRESSURE, \n                    litterature.MINPRESSURE, \n                    litterature.MAXTEMPERATURE, \n                    litterature.MINTEMPERATURE, \n                    fluidinfo.SHARED \nFROM litterature, experimentaldatatype, userdb, fluidinfo, literatureandarticlestable\nWHERE litterature.EXPTYPEID = experimentaldatatype.ID\n          AND litterature.FLUID_ID = fluidinfo.ID\n          AND fluidinfo.USERID = userdb.ID\n  AND litterature.ARTICLEID = literatureandarticlestable.ID\n" +
                    temp1 + compSQL +
                    "GROUP BY litterature.ID, litterature.FLUID_ID, litterature.FILE, litterature.NAME, litterature.TEXT, litterature.EXPTYPEID, litterature.TYPE, experimentaldatatype.ID, experimentaldatatype.TYPE, userdb.ID, userdb.USERNAME, userdb.PASSWORD, userdb.EMAIL, userdb.FORNAME, userdb.SURENAME, fluidinfo.ID, fluidinfo.USERID, fluidinfo.FIELD, fluidinfo.WELL, fluidinfo.TEST, fluidinfo.SAMPLE, fluidinfo.TEXT, fluidinfo.HISTORY, fluidinfo.METHANE, fluidinfo.ETHANE, fluidinfo.PROPANE, fluidinfo.CO2, fluidinfo.H2S, fluidinfo.NITROGEN, fluidinfo.IBUTANE, fluidinfo.NBUTANE, fluidinfo.PENTANE, fluidinfo.NHEXANE, fluidinfo.CYCPENTANE, fluidinfo.CYCHEXANE, fluidinfo.NHEPTANE, fluidinfo.NOCTANE, fluidinfo.NNONANE, fluidinfo.NDECANE, fluidinfo.BENZENE, fluidinfo.TOLUENE, fluidinfo.MXYLENE, fluidinfo.PXYLENE, fluidinfo.OXYLENE, fluidinfo.WATER, fluidinfo.METHANOL, fluidinfo.MEG, fluidinfo.TEG, fluidinfo.DEG, fluidinfo.MDEA, fluidinfo.PIPERAZINE, fluidinfo.ACETICACID, fluidinfo.PROPIONICACID, fluidinfo.NAPLUS, fluidinfo.FEPLUS, fluidinfo.CAPLUS, fluidinfo.H3OPLUS, fluidinfo.OHMINUS, fluidinfo.CO3MINUS, fluidinfo.CLMINUS, fluidinfo.C6, fluidinfo.C6MOLARMASS, fluidinfo.C6DENSITY, fluidinfo.C7, fluidinfo.C7MOLARMASS, fluidinfo.C7DENSITY, fluidinfo.C8, fluidinfo.C8MOLARMASS, fluidinfo.C8DENSITY, fluidinfo.C9, fluidinfo.C9MOLARMASS, fluidinfo.C9DENSITY, fluidinfo.C10, fluidinfo.C10MOLARMASS, fluidinfo.C10DENSITY, fluidinfo.C11, fluidinfo.C11MOLARMASS, fluidinfo.C11DENSITY, fluidinfo.C12, fluidinfo.C12MOLARMASS, fluidinfo.C12DENSITY, fluidinfo.C13, fluidinfo.C13MOLARMASS, fluidinfo.C13DENSITY, fluidinfo.CPLUS, fluidinfo.CPLUSMOLARMASS, fluidinfo.CPLUSDENSITY, litterature.FLUID_ID, litterature.MAXPRESSURE, litterature.MINPRESSURE, litterature.MAXTEMPERATURE, litterature.MINTEMPERATURE, litterature.ARTICLEID");

            getLitteratureRowSet2().setCommand("SELECT ALL litterature.ID, \n                    litterature.FLUID_ID, \n      litterature.TYPE, \n                    litterature.NAME, \n                    litterature.TEXT, \n                    litterature.EXPTYPEID, \n                    experimentaldatatype.ID AS EXPID, \n                    experimentaldatatype.TYPE, \n                    userdb.ID AS USERID, \n                    userdb.USERNAME, \n                    userdb.PASSWORD, \n                    userdb.EMAIL, \n                    userdb.FORNAME, \n                    userdb.SURENAME, \n                    fluidinfo.ID AS FLUIDID, \n                    fluidinfo.USERID, \n                    fluidinfo.FIELD, \n                    fluidinfo.WELL, \n                    fluidinfo.TEST, \n                    fluidinfo.SAMPLE, \n                    fluidinfo.TEXT, \n                    fluidinfo.HISTORY, \n                    fluidinfo.METHANE, \n                    fluidinfo.ETHANE, \n                    fluidinfo.PROPANE, \n                    fluidinfo.CO2, \n                    fluidinfo.H2S, \n                    fluidinfo.NITROGEN, \n                    fluidinfo.IBUTANE, \n                    fluidinfo.NBUTANE, \n                    fluidinfo.PENTANE, \n                    fluidinfo.NHEXANE, \n                    fluidinfo.CYCPENTANE, \n                    fluidinfo.CYCHEXANE, \n                    fluidinfo.NHEPTANE, \n                    fluidinfo.NOCTANE, \n                    fluidinfo.NNONANE, \n                    fluidinfo.NDECANE, \n                    fluidinfo.BENZENE, \n                    fluidinfo.TOLUENE, \n                    fluidinfo.MXYLENE, \n                    fluidinfo.PXYLENE, \n                    fluidinfo.OXYLENE, \n                    fluidinfo.WATER, \n                    fluidinfo.METHANOL, \n                    fluidinfo.MEG, \n                    fluidinfo.TEG, \n                    fluidinfo.DEG, \n                    fluidinfo.MDEA, \n                    fluidinfo.PIPERAZINE, \n                    fluidinfo.ACETICACID, \n                    fluidinfo.PROPIONICACID, \n                    fluidinfo.NAPLUS, \n                    fluidinfo.FEPLUS, \n                    fluidinfo.CAPLUS, \n                    fluidinfo.H3OPLUS, \n                    fluidinfo.OHMINUS, \n                    fluidinfo.CO3MINUS, \n                    fluidinfo.CLMINUS, \n                    fluidinfo.C6, \n                    fluidinfo.C6MOLARMASS, \n                    fluidinfo.C6DENSITY, \n                    fluidinfo.C7, \n                    fluidinfo.C7MOLARMASS, \n                    fluidinfo.C7DENSITY, \n                    fluidinfo.C8, \n                    fluidinfo.C8MOLARMASS, \n                    fluidinfo.C8DENSITY, \n                    fluidinfo.C9, \n                    fluidinfo.C9MOLARMASS, \n                    fluidinfo.C9DENSITY, \n                    fluidinfo.C10, \n                    fluidinfo.C10MOLARMASS, \n                    fluidinfo.C10DENSITY, \n                    fluidinfo.C11, \n                    fluidinfo.C11MOLARMASS, \n                    fluidinfo.C11DENSITY, \n                    fluidinfo.C12, \n                    fluidinfo.C12MOLARMASS, \n                    fluidinfo.C12DENSITY, \n                    fluidinfo.C13, \n                    fluidinfo.C13MOLARMASS, \n                    fluidinfo.C13DENSITY, \n                    fluidinfo.CPLUS, \n                    fluidinfo.CPLUSMOLARMASS, \n                    fluidinfo.CPLUSDENSITY, \n                    literatureandarticlestable.ID AS LITID, \n                    literatureandarticlestable.AUTHOR, \n                    literatureandarticlestable.NAME AS LITNAME, \n                    literatureandarticlestable.JOURNAL, \n                    literatureandarticlestable.VOLUME, \n                    literatureandarticlestable.PAGES, \n                    literatureandarticlestable.YEAR, \n                    literatureandarticlestable.REFERENCEID, \n                    litterature.ARTICLEID, \n                    litterature.MAXPRESSURE, \n                    litterature.MINPRESSURE, \n                    litterature.MAXTEMPERATURE, \n                    litterature.MINTEMPERATURE, \n                    fluidinfo.SHARED \nFROM litterature, experimentaldatatype, userdb, fluidinfo, literatureandarticlestable\nWHERE litterature.EXPTYPEID = experimentaldatatype.ID\n          AND litterature.FLUID_ID = fluidinfo.ID\n          AND fluidinfo.USERID = userdb.ID\n  AND litterature.ARTICLEID = literatureandarticlestable.ID\n" +
                    temp1 + compSQL +
                    "GROUP BY litterature.ID, litterature.FLUID_ID, litterature.NAME, litterature.TEXT, litterature.EXPTYPEID, litterature.TYPE, experimentaldatatype.ID, experimentaldatatype.TYPE, userdb.ID, userdb.USERNAME, userdb.PASSWORD, userdb.EMAIL, userdb.FORNAME, userdb.SURENAME, fluidinfo.ID, fluidinfo.USERID, fluidinfo.FIELD, fluidinfo.WELL, fluidinfo.TEST, fluidinfo.SAMPLE, fluidinfo.TEXT, fluidinfo.HISTORY, fluidinfo.METHANE, fluidinfo.ETHANE, fluidinfo.PROPANE, fluidinfo.CO2, fluidinfo.H2S, fluidinfo.NITROGEN, fluidinfo.IBUTANE, fluidinfo.NBUTANE, fluidinfo.PENTANE, fluidinfo.NHEXANE, fluidinfo.CYCPENTANE, fluidinfo.CYCHEXANE, fluidinfo.NHEPTANE, fluidinfo.NOCTANE, fluidinfo.NNONANE, fluidinfo.NDECANE, fluidinfo.BENZENE, fluidinfo.TOLUENE, fluidinfo.MXYLENE, fluidinfo.PXYLENE, fluidinfo.OXYLENE, fluidinfo.WATER, fluidinfo.METHANOL, fluidinfo.MEG, fluidinfo.TEG, fluidinfo.DEG, fluidinfo.MDEA, fluidinfo.PIPERAZINE, fluidinfo.ACETICACID, fluidinfo.PROPIONICACID, fluidinfo.NAPLUS, fluidinfo.FEPLUS, fluidinfo.CAPLUS, fluidinfo.H3OPLUS, fluidinfo.OHMINUS, fluidinfo.CO3MINUS, fluidinfo.CLMINUS, fluidinfo.C6, fluidinfo.C6MOLARMASS, fluidinfo.C6DENSITY, fluidinfo.C7, fluidinfo.C7MOLARMASS, fluidinfo.C7DENSITY, fluidinfo.C8, fluidinfo.C8MOLARMASS, fluidinfo.C8DENSITY, fluidinfo.C9, fluidinfo.C9MOLARMASS, fluidinfo.C9DENSITY, fluidinfo.C10, fluidinfo.C10MOLARMASS, fluidinfo.C10DENSITY, fluidinfo.C11, fluidinfo.C11MOLARMASS, fluidinfo.C11DENSITY, fluidinfo.C12, fluidinfo.C12MOLARMASS, fluidinfo.C12DENSITY, fluidinfo.C13, fluidinfo.C13MOLARMASS, fluidinfo.C13DENSITY, fluidinfo.CPLUS, fluidinfo.CPLUSMOLARMASS, fluidinfo.CPLUSDENSITY, litterature.FLUID_ID, litterature.MAXPRESSURE, litterature.MINPRESSURE, litterature.MAXTEMPERATURE, litterature.MINTEMPERATURE, litterature.ARTICLEID");


         //   getLitteratureRowSet2().setCommand("SELECT COUNT(litterature.ID) FROM litterature, experimentaldatatype, userdb, fluidinfo, literatureandarticlestable\nWHERE litterature.EXPTYPEID = experimentaldatatype.ID\n          AND litterature.FLUID_ID = fluidinfo.ID\n          AND fluidinfo.USERID = userdb.ID\n  AND litterature.ARTICLEID = literatureandarticlestable.ID\n" +
         //           temp1 + compSQL);

            getLitteratureRowSet2().execute();
            getLitteratureRowSet2().last();
        //    System.out.println("number articles "+ getLitteratureRowSet2().getInt(2));
        //    rowNumber=getLitteratureRowSet2().getInt(2);
            //getLitteratureRowSet2().last();
            rowNumber = getLitteratureRowSet2().getRow();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return rowNumber;
    }
}
