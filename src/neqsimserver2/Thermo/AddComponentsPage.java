/*
 * AddComponentsPage2.java
 *
 * Created on 05.jan.2008, 21:24:16
 */
package neqsimserver2.Thermo;

import com.sun.data.provider.RowKey;
import com.sun.data.provider.impl.CachedRowSetDataProvider;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Button;
import com.sun.rave.web.ui.component.Checkbox;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Hyperlink;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.Message;
import com.sun.rave.web.ui.component.Page;
import com.sun.rave.web.ui.component.RadioButtonGroup;
import com.sun.rave.web.ui.component.StaticText;
import com.sun.rave.web.ui.component.TextField;
import com.sun.rave.web.ui.model.SingleSelectOptionsList;
import javax.faces.FacesException;
import javax.faces.component.html.HtmlGraphicImage;
import javax.faces.component.html.HtmlInputText;
import javax.faces.component.html.HtmlInputTextarea;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.convert.DoubleConverter;
import javax.faces.event.ValueChangeEvent;
import javax.faces.validator.DoubleRangeValidator;
import neqsimserver2.SessionBean1;
import neqsimserver2.GasQuality.GasQualitySessionBean;
import neqsimserver2.ApplicationBean1;
import sun.net.www.content.text.plain;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @author ESOL
 */
public class AddComponentsPage extends AbstractPageBean {

    private boolean doUsePlusFraction = false;
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        fieldsFluidDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.fluidinfoRowSetAddComp}"));
        doubleRangeValidator1.setMaximum(1.0E10);
        doubleRangeValidator1.setMinimum(-4.9E-324);
        fluidTypeRadioButtonGroupDefaultOptions.setOptions(new com.sun.rave.web.ui.model.Option[]{new com.sun.rave.web.ui.model.Option("No-Plus Fraction", "No-Plus Fraction"), new com.sun.rave.web.ui.model.Option("Plus Fraction", "Plus Fraction"), new com.sun.rave.web.ui.model.Option("Characterized", "Characterized")});
        fluidTypeRadioButtonGroupDefaultOptions.setSelectedValue("No-Plus Fraction");
        analyserlocationsDataProvider1.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.analyserlocationsRowSet1}"));
    }
    private Page page1 = new Page();

    public Page getPage1() {
        return page1;
    }

    public void setPage1(Page p) {
        this.page1 = p;
    }
    private Html html1 = new Html();

    public Html getHtml1() {
        return html1;
    }

    public void setHtml1(Html h) {
        this.html1 = h;
    }
    private Head head1 = new Head();

    public Head getHead1() {
        return head1;
    }

    public void setHead1(Head h) {
        this.head1 = h;
    }
    private Link link1 = new Link();

    public Link getLink1() {
        return link1;
    }

    public void setLink1(Link l) {
        this.link1 = l;
    }
    private Body body1 = new Body();

    public Body getBody1() {
        return body1;
    }

    public void setBody1(Body b) {
        this.body1 = b;
    }
    private Form form1 = new Form();

    public Form getForm1() {
        return form1;
    }

    public void setForm1(Form f) {
        this.form1 = f;
    }
    private HtmlGraphicImage imageNeqSIm1 = new HtmlGraphicImage();

    public HtmlGraphicImage getImageNeqSIm1() {
        return imageNeqSIm1;
    }

    public void setImageNeqSIm1(HtmlGraphicImage hgi) {
        this.imageNeqSIm1 = hgi;
    }
    private Message message1 = new Message();

    public Message getMessage1() {
        return message1;
    }

    public void setMessage1(Message m) {
        this.message1 = m;
    }
    private HtmlInputText molarMassC10TextField1 = new HtmlInputText();

    public HtmlInputText getMolarMassC10TextField1() {
        return molarMassC10TextField1;
    }

    public void setMolarMassC10TextField1(HtmlInputText hit) {
        this.molarMassC10TextField1 = hit;
    }
    private HtmlInputText fluidTextField1 = new HtmlInputText();

    public HtmlInputText getFluidTextField1() {
        return fluidTextField1;
    }

    public void setFluidTextField1(HtmlInputText hit) {
        this.fluidTextField1 = hit;
    }
    private HtmlOutputText methanolTextID1 = new HtmlOutputText();

    public HtmlOutputText getMethanolTextID1() {
        return methanolTextID1;
    }

    public void setMethanolTextID1(HtmlOutputText hot) {
        this.methanolTextID1 = hot;
    }
    private HtmlInputText caplusplusTextField1 = new HtmlInputText();

    public HtmlInputText getCaplusplusTextField1() {
        return caplusplusTextField1;
    }

    public void setCaplusplusTextField1(HtmlInputText hit) {
        this.caplusplusTextField1 = hit;
    }
    private HtmlOutputText mdeaTextID1 = new HtmlOutputText();

    public HtmlOutputText getMdeaTextID1() {
        return mdeaTextID1;
    }

    public void setMdeaTextID1(HtmlOutputText hot) {
        this.mdeaTextID1 = hot;
    }
    private HtmlOutputText componentTextID1 = new HtmlOutputText();

    public HtmlOutputText getComponentTextID1() {
        return componentTextID1;
    }

    public void setComponentTextID1(HtmlOutputText hot) {
        this.componentTextID1 = hot;
    }
    private HtmlOutputText outputText1 = new HtmlOutputText();

    public HtmlOutputText getOutputText1() {
        return outputText1;
    }

    public void setOutputText1(HtmlOutputText hot) {
        this.outputText1 = hot;
    }
    private HtmlInputText c8TextField1 = new HtmlInputText();

    public HtmlInputText getC8TextField1() {
        return c8TextField1;
    }

    public void setC8TextField1(HtmlInputText hit) {
        this.c8TextField1 = hit;
    }
    private HtmlOutputText hexaneTextID1 = new HtmlOutputText();

    public HtmlOutputText getHexaneTextID1() {
        return hexaneTextID1;
    }

    public void setHexaneTextID1(HtmlOutputText hot) {
        this.hexaneTextID1 = hot;
    }
    private HtmlOutputText c13TextID1 = new HtmlOutputText();

    public HtmlOutputText getC13TextID1() {
        return c13TextID1;
    }

    public void setC13TextID1(HtmlOutputText hot) {
        this.c13TextID1 = hot;
    }
    private Message message2 = new Message();

    public Message getMessage2() {
        return message2;
    }

    public void setMessage2(Message m) {
        this.message2 = m;
    }
    private HtmlInputText ibutaneTextField1 = new HtmlInputText();

    public HtmlInputText getIbutaneTextField1() {
        return ibutaneTextField1;
    }

    public void setIbutaneTextField1(HtmlInputText hit) {
        this.ibutaneTextField1 = hit;
    }
    private HtmlOutputText feTextID1 = new HtmlOutputText();

    public HtmlOutputText getFeTextID1() {
        return feTextID1;
    }

    public void setFeTextID1(HtmlOutputText hot) {
        this.feTextID1 = hot;
    }
    private HtmlOutputText ohTextID1 = new HtmlOutputText();

    public HtmlOutputText getOhTextID1() {
        return ohTextID1;
    }

    public void setOhTextID1(HtmlOutputText hot) {
        this.ohTextID1 = hot;
    }
    private Message message3 = new Message();

    public Message getMessage3() {
        return message3;
    }

    public void setMessage3(Message m) {
        this.message3 = m;
    }
    private HtmlInputText degTextField1 = new HtmlInputText();

    public HtmlInputText getDegTextField1() {
        return degTextField1;
    }

    public void setDegTextField1(HtmlInputText hit) {
        this.degTextField1 = hit;
    }
    private HtmlOutputText megTextID1 = new HtmlOutputText();

    public HtmlOutputText getMegTextID1() {
        return megTextID1;
    }

    public void setMegTextID1(HtmlOutputText hot) {
        this.megTextID1 = hot;
    }
    private HtmlInputText clMinusTextField1 = new HtmlInputText();

    public HtmlInputText getClMinusTextField1() {
        return clMinusTextField1;
    }

    public void setClMinusTextField1(HtmlInputText hit) {
        this.clMinusTextField1 = hit;
    }
    private HtmlInputText h2sTextField1 = new HtmlInputText();

    public HtmlInputText getH2sTextField1() {
        return h2sTextField1;
    }

    public void setH2sTextField1(HtmlInputText hit) {
        this.h2sTextField1 = hit;
    }
    private HtmlInputText wellTextField1 = new HtmlInputText();

    public HtmlInputText getWellTextField1() {
        return wellTextField1;
    }

    public void setWellTextField1(HtmlInputText hit) {
        this.wellTextField1 = hit;
    }
    private Message message4 = new Message();

    public Message getMessage4() {
        return message4;
    }

    public void setMessage4(Message m) {
        this.message4 = m;
    }
    private HtmlOutputText waterTextID1 = new HtmlOutputText();

    public HtmlOutputText getWaterTextID1() {
        return waterTextID1;
    }

    public void setWaterTextID1(HtmlOutputText hot) {
        this.waterTextID1 = hot;
    }
    private HtmlOutputText polarComponentName1 = new HtmlOutputText();

    public HtmlOutputText getPolarComponentName1() {
        return polarComponentName1;
    }

    public void setPolarComponentName1(HtmlOutputText hot) {
        this.polarComponentName1 = hot;
    }
    private HtmlOutputText acidsName1 = new HtmlOutputText();

    public HtmlOutputText getAcidsName1() {
        return acidsName1;
    }

    public void setAcidsName1(HtmlOutputText hot) {
        this.acidsName1 = hot;
    }
    private Message message5 = new Message();

    public Message getMessage5() {
        return message5;
    }

    public void setMessage5(Message m) {
        this.message5 = m;
    }
    private HtmlInputText waterTextField1 = new HtmlInputText();

    public HtmlInputText getWaterTextField1() {
        return waterTextField1;
    }

    public void setWaterTextField1(HtmlInputText hit) {
        this.waterTextField1 = hit;
    }
    private Message message6 = new Message();

    public Message getMessage6() {
        return message6;
    }

    public void setMessage6(Message m) {
        this.message6 = m;
    }
    private HtmlOutputText nbutaneTextID1 = new HtmlOutputText();

    public HtmlOutputText getNbutaneTextID1() {
        return nbutaneTextID1;
    }

    public void setNbutaneTextID1(HtmlOutputText hot) {
        this.nbutaneTextID1 = hot;
    }
    private HtmlInputText carbonDioxideTextField1 = new HtmlInputText();

    public HtmlInputText getCarbonDioxideTextField1() {
        return carbonDioxideTextField1;
    }

    public void setCarbonDioxideTextField1(HtmlInputText hit) {
        this.carbonDioxideTextField1 = hit;
    }
    private HtmlOutputText carbondioxTextID1 = new HtmlOutputText();

    public HtmlOutputText getCarbondioxTextID1() {
        return carbondioxTextID1;
    }

    public void setCarbondioxTextID1(HtmlOutputText hot) {
        this.carbondioxTextID1 = hot;
    }
    private HtmlInputText testTextField1 = new HtmlInputText();

    public HtmlInputText getTestTextField1() {
        return testTextField1;
    }

    public void setTestTextField1(HtmlInputText hit) {
        this.testTextField1 = hit;
    }
    private HtmlInputText ohMinusTexField1 = new HtmlInputText();

    public HtmlInputText getOhMinusTexField1() {
        return ohMinusTexField1;
    }

    public void setOhMinusTexField1(HtmlInputText hit) {
        this.ohMinusTexField1 = hit;
    }
    private HtmlInputText testTextField2 = new HtmlInputText();

    public HtmlInputText getTestTextField2() {
        return testTextField2;
    }

    public void setTestTextField2(HtmlInputText hit) {
        this.testTextField2 = hit;
    }
    private HtmlOutputText clTextID1 = new HtmlOutputText();

    public HtmlOutputText getClTextID1() {
        return clTextID1;
    }

    public void setClTextID1(HtmlOutputText hot) {
        this.clTextID1 = hot;
    }
    private HtmlOutputText componentTextID2 = new HtmlOutputText();

    public HtmlOutputText getComponentTextID2() {
        return componentTextID2;
    }

    public void setComponentTextID2(HtmlOutputText hot) {
        this.componentTextID2 = hot;
    }
    private HtmlOutputText clTextID2 = new HtmlOutputText();

    public HtmlOutputText getClTextID2() {
        return clTextID2;
    }

    public void setClTextID2(HtmlOutputText hot) {
        this.clTextID2 = hot;
    }
    private Message message7 = new Message();

    public Message getMessage7() {
        return message7;
    }

    public void setMessage7(Message m) {
        this.message7 = m;
    }
    private HtmlInputText c11TextField1 = new HtmlInputText();

    public HtmlInputText getC11TextField1() {
        return c11TextField1;
    }

    public void setC11TextField1(HtmlInputText hit) {
        this.c11TextField1 = hit;
    }
    private Message message8 = new Message();

    public Message getMessage8() {
        return message8;
    }

    public void setMessage8(Message m) {
        this.message8 = m;
    }
    private HtmlOutputText tegTextID1 = new HtmlOutputText();

    public HtmlOutputText getTegTextID1() {
        return tegTextID1;
    }

    public void setTegTextID1(HtmlOutputText hot) {
        this.tegTextID1 = hot;
    }
    private HtmlInputText propionicAcidTextField1 = new HtmlInputText();

    public HtmlInputText getPropionicAcidTextField1() {
        return propionicAcidTextField1;
    }

    public void setPropionicAcidTextField1(HtmlInputText hit) {
        this.propionicAcidTextField1 = hit;
    }
    private HtmlInputText megTextField1 = new HtmlInputText();

    public HtmlInputText getMegTextField1() {
        return megTextField1;
    }

    public void setMegTextField1(HtmlInputText hit) {
        this.megTextField1 = hit;
    }
    private Message message9 = new Message();

    public Message getMessage9() {
        return message9;
    }

    public void setMessage9(Message m) {
        this.message9 = m;
    }
    private HtmlOutputText c12TextID1 = new HtmlOutputText();

    public HtmlOutputText getC12TextID1() {
        return c12TextID1;
    }

    public void setC12TextID1(HtmlOutputText hot) {
        this.c12TextID1 = hot;
    }
    private HtmlOutputText c10TextID1 = new HtmlOutputText();

    public HtmlOutputText getC10TextID1() {
        return c10TextID1;
    }

    public void setC10TextID1(HtmlOutputText hot) {
        this.c10TextID1 = hot;
    }
    private HtmlInputText aceticAcidTextField1 = new HtmlInputText();

    public HtmlInputText getAceticAcidTextField1() {
        return aceticAcidTextField1;
    }

    public void setAceticAcidTextField1(HtmlInputText hit) {
        this.aceticAcidTextField1 = hit;
    }
    private HtmlOutputText c9TextID1 = new HtmlOutputText();

    public HtmlOutputText getC9TextID1() {
        return c9TextID1;
    }

    public void setC9TextID1(HtmlOutputText hot) {
        this.c9TextID1 = hot;
    }
    private Message message10 = new Message();

    public Message getMessage10() {
        return message10;
    }

    public void setMessage10(Message m) {
        this.message10 = m;
    }
    private HtmlOutputText aminesName1 = new HtmlOutputText();

    public HtmlOutputText getAminesName1() {
        return aminesName1;
    }

    public void setAminesName1(HtmlOutputText hot) {
        this.aminesName1 = hot;
    }
    private HtmlOutputText componentTextID3 = new HtmlOutputText();

    public HtmlOutputText getComponentTextID3() {
        return componentTextID3;
    }

    public void setComponentTextID3(HtmlOutputText hot) {
        this.componentTextID3 = hot;
    }
    private Message message11 = new Message();

    public Message getMessage11() {
        return message11;
    }

    public void setMessage11(Message m) {
        this.message11 = m;
    }
    private TextField ndecaneTextField1 = new TextField();

    public TextField getNdecaneTextField1() {
        return ndecaneTextField1;
    }

    public void setNdecaneTextField1(TextField tf) {
        this.ndecaneTextField1 = tf;
    }
    private HtmlOutputText c6TextID1 = new HtmlOutputText();

    public HtmlOutputText getC6TextID1() {
        return c6TextID1;
    }

    public void setC6TextID1(HtmlOutputText hot) {
        this.c6TextID1 = hot;
    }
    private Message message12 = new Message();

    public Message getMessage12() {
        return message12;
    }

    public void setMessage12(Message m) {
        this.message12 = m;
    }
    private HtmlOutputText standardCompText1 = new HtmlOutputText();

    public HtmlOutputText getStandardCompText1() {
        return standardCompText1;
    }

    public void setStandardCompText1(HtmlOutputText hot) {
        this.standardCompText1 = hot;
    }
    private HtmlInputText densityC8TextField1 = new HtmlInputText();

    public HtmlInputText getDensityC8TextField1() {
        return densityC8TextField1;
    }

    public void setDensityC8TextField1(HtmlInputText hit) {
        this.densityC8TextField1 = hit;
    }
    private HtmlInputText densityC12TextField1 = new HtmlInputText();

    public HtmlInputText getDensityC12TextField1() {
        return densityC12TextField1;
    }

    public void setDensityC12TextField1(HtmlInputText hit) {
        this.densityC12TextField1 = hit;
    }
    private TextField benzeneTextField1 = new TextField();

    public TextField getBenzeneTextField1() {
        return benzeneTextField1;
    }

    public void setBenzeneTextField1(TextField tf) {
        this.benzeneTextField1 = tf;
    }
    private HtmlInputText molarMassC13TextField1 = new HtmlInputText();

    public HtmlInputText getMolarMassC13TextField1() {
        return molarMassC13TextField1;
    }

    public void setMolarMassC13TextField1(HtmlInputText hit) {
        this.molarMassC13TextField1 = hit;
    }
    private Message message13 = new Message();

    public Message getMessage13() {
        return message13;
    }

    public void setMessage13(Message m) {
        this.message13 = m;
    }
    private Message message14 = new Message();

    public Message getMessage14() {
        return message14;
    }

    public void setMessage14(Message m) {
        this.message14 = m;
    }
    private HtmlInputText nbutaneTextField1 = new HtmlInputText();

    public HtmlInputText getNbutaneTextField1() {
        return nbutaneTextField1;
    }

    public void setNbutaneTextField1(HtmlInputText hit) {
        this.nbutaneTextField1 = hit;
    }
    private HtmlOutputText SO4TextID1 = new HtmlOutputText();

    public HtmlOutputText getSO4TextID1() {
        return SO4TextID1;
    }

    public void setSO4TextID1(HtmlOutputText hot) {
        this.SO4TextID1 = hot;
    }
    private HtmlOutputText slatsName1 = new HtmlOutputText();

    public HtmlOutputText getSlatsName1() {
        return slatsName1;
    }

    public void setSlatsName1(HtmlOutputText hot) {
        this.slatsName1 = hot;
    }
    private HtmlInputText co3MinusTextField1 = new HtmlInputText();

    public HtmlInputText getCo3MinusTextField1() {
        return co3MinusTextField1;
    }

    public void setCo3MinusTextField1(HtmlInputText hit) {
        this.co3MinusTextField1 = hit;
    }
    private HtmlInputText methanolTextField1 = new HtmlInputText();

    public HtmlInputText getMethanolTextField1() {
        return methanolTextField1;
    }

    public void setMethanolTextField1(HtmlInputText hit) {
        this.methanolTextField1 = hit;
    }
    private HtmlOutputText ibutaneTextID1 = new HtmlOutputText();

    public HtmlOutputText getIbutaneTextID1() {
        return ibutaneTextID1;
    }

    public void setIbutaneTextID1(HtmlOutputText hot) {
        this.ibutaneTextID1 = hot;
    }
    private HtmlOutputText propaneTextID1 = new HtmlOutputText();

    public HtmlOutputText getPropaneTextID1() {
        return propaneTextID1;
    }

    public void setPropaneTextID1(HtmlOutputText hot) {
        this.propaneTextID1 = hot;
    }
    private Message message15 = new Message();

    public Message getMessage15() {
        return message15;
    }

    public void setMessage15(Message m) {
        this.message15 = m;
    }
    private HtmlInputTextarea historyTextArea1 = new HtmlInputTextarea();

    public HtmlInputTextarea getHistoryTextArea1() {
        return historyTextArea1;
    }

    public void setHistoryTextArea1(HtmlInputTextarea hit) {
        this.historyTextArea1 = hit;
    }
    private HtmlOutputText componentTextID4 = new HtmlOutputText();

    public HtmlOutputText getComponentTextID4() {
        return componentTextID4;
    }

    public void setComponentTextID4(HtmlOutputText hot) {
        this.componentTextID4 = hot;
    }
    private HtmlOutputText componentTextID5 = new HtmlOutputText();

    public HtmlOutputText getComponentTextID5() {
        return componentTextID5;
    }

    public void setComponentTextID5(HtmlOutputText hot) {
        this.componentTextID5 = hot;
    }
    private TextField oxyleneTextField1 = new TextField();

    public TextField getOxyleneTextField1() {
        return oxyleneTextField1;
    }

    public void setOxyleneTextField1(TextField tf) {
        this.oxyleneTextField1 = tf;
    }
    private HtmlInputText SO4minusMinusTextField1 = new HtmlInputText();

    public HtmlInputText getSO4minusMinusTextField1() {
        return SO4minusMinusTextField1;
    }

    public void setSO4minusMinusTextField1(HtmlInputText hit) {
        this.SO4minusMinusTextField1 = hit;
    }
    private Message message16 = new Message();

    public Message getMessage16() {
        return message16;
    }

    public void setMessage16(Message m) {
        this.message16 = m;
    }
    private Message message17 = new Message();

    public Message getMessage17() {
        return message17;
    }

    public void setMessage17(Message m) {
        this.message17 = m;
    }
    private HtmlInputText densityC10TextField1 = new HtmlInputText();

    public HtmlInputText getDensityC10TextField1() {
        return densityC10TextField1;
    }

    public void setDensityC10TextField1(HtmlInputText hit) {
        this.densityC10TextField1 = hit;
    }
    private StaticText staticText3 = new StaticText();

    public StaticText getStaticText3() {
        return staticText3;
    }

    public void setStaticText3(StaticText st) {
        this.staticText3 = st;
    }
    private HtmlOutputText outputText2 = new HtmlOutputText();

    public HtmlOutputText getOutputText2() {
        return outputText2;
    }

    public void setOutputText2(HtmlOutputText hot) {
        this.outputText2 = hot;
    }
    private HtmlInputText densityC9TextField1 = new HtmlInputText();

    public HtmlInputText getDensityC9TextField1() {
        return densityC9TextField1;
    }

    public void setDensityC9TextField1(HtmlInputText hit) {
        this.densityC9TextField1 = hit;
    }
    private HtmlInputText tegTextField1 = new HtmlInputText();

    public HtmlInputText getTegTextField1() {
        return tegTextField1;
    }

    public void setTegTextField1(HtmlInputText hit) {
        this.tegTextField1 = hit;
    }
    private Message message18 = new Message();

    public Message getMessage18() {
        return message18;
    }

    public void setMessage18(Message m) {
        this.message18 = m;
    }
    private HtmlInputText densityC11TextField1 = new HtmlInputText();

    public HtmlInputText getDensityC11TextField1() {
        return densityC11TextField1;
    }

    public void setDensityC11TextField1(HtmlInputText hit) {
        this.densityC11TextField1 = hit;
    }
    private HtmlOutputText molprsectext1 = new HtmlOutputText();

    public HtmlOutputText getMolprsectext1() {
        return molprsectext1;
    }

    public void setMolprsectext1(HtmlOutputText hot) {
        this.molprsectext1 = hot;
    }
    private HtmlOutputText pentaneTextID1 = new HtmlOutputText();

    public HtmlOutputText getPentaneTextID1() {
        return pentaneTextID1;
    }

    public void setPentaneTextID1(HtmlOutputText hot) {
        this.pentaneTextID1 = hot;
    }
    private HtmlOutputText densitytext1 = new HtmlOutputText();

    public HtmlOutputText getDensitytext1() {
        return densitytext1;
    }

    public void setDensitytext1(HtmlOutputText hot) {
        this.densitytext1 = hot;
    }
    private HtmlInputText c13TextField1 = new HtmlInputText();

    public HtmlInputText getC13TextField1() {
        return c13TextField1;
    }

    public void setC13TextField1(HtmlInputText hit) {
        this.c13TextField1 = hit;
    }
    private HtmlInputText piperazineTextField1 = new HtmlInputText();

    public HtmlInputText getPiperazineTextField1() {
        return piperazineTextField1;
    }

    public void setPiperazineTextField1(HtmlInputText hit) {
        this.piperazineTextField1 = hit;
    }
    private HtmlOutputText componentTextID6 = new HtmlOutputText();

    public HtmlOutputText getComponentTextID6() {
        return componentTextID6;
    }

    public void setComponentTextID6(HtmlOutputText hot) {
        this.componentTextID6 = hot;
    }
    private Message message19 = new Message();

    public Message getMessage19() {
        return message19;
    }

    public void setMessage19(Message m) {
        this.message19 = m;
    }
    private TextField mxyleneTextField1 = new TextField();

    public TextField getMxyleneTextField1() {
        return mxyleneTextField1;
    }

    public void setMxyleneTextField1(TextField tf) {
        this.mxyleneTextField1 = tf;
    }
    private HtmlOutputText componentTextID7 = new HtmlOutputText();

    public HtmlOutputText getComponentTextID7() {
        return componentTextID7;
    }

    public void setComponentTextID7(HtmlOutputText hot) {
        this.componentTextID7 = hot;
    }
    private Message message20 = new Message();

    public Message getMessage20() {
        return message20;
    }

    public void setMessage20(Message m) {
        this.message20 = m;
    }
    private HtmlInputText molarMassC8TextField1 = new HtmlInputText();

    public HtmlInputText getMolarMassC8TextField1() {
        return molarMassC8TextField1;
    }

    public void setMolarMassC8TextField1(HtmlInputText hit) {
        this.molarMassC8TextField1 = hit;
    }
    private Message message21 = new Message();

    public Message getMessage21() {
        return message21;
    }

    public void setMessage21(Message m) {
        this.message21 = m;
    }
    private Message message22 = new Message();

    public Message getMessage22() {
        return message22;
    }

    public void setMessage22(Message m) {
        this.message22 = m;
    }
    private HtmlInputText pentaneTextField1 = new HtmlInputText();

    public HtmlInputText getPentaneTextField1() {
        return pentaneTextField1;
    }

    public void setPentaneTextField1(HtmlInputText hit) {
        this.pentaneTextField1 = hit;
    }
    private HtmlInputText propaneTextField1 = new HtmlInputText();

    public HtmlInputText getPropaneTextField1() {
        return propaneTextField1;
    }

    public void setPropaneTextField1(HtmlInputText hit) {
        this.propaneTextField1 = hit;
    }
    private HtmlInputText molarMassC9TextField1 = new HtmlInputText();

    public HtmlInputText getMolarMassC9TextField1() {
        return molarMassC9TextField1;
    }

    public void setMolarMassC9TextField1(HtmlInputText hit) {
        this.molarMassC9TextField1 = hit;
    }
    private Message message23 = new Message();

    public Message getMessage23() {
        return message23;
    }

    public void setMessage23(Message m) {
        this.message23 = m;
    }
    private HtmlInputText c12TextField1 = new HtmlInputText();

    public HtmlInputText getC12TextField1() {
        return c12TextField1;
    }

    public void setC12TextField1(HtmlInputText hit) {
        this.c12TextField1 = hit;
    }
    private Message message24 = new Message();

    public Message getMessage24() {
        return message24;
    }

    public void setMessage24(Message m) {
        this.message24 = m;
    }
    private HtmlInputText sampleTextField1 = new HtmlInputText();

    public HtmlInputText getSampleTextField1() {
        return sampleTextField1;
    }

    public void setSampleTextField1(HtmlInputText hit) {
        this.sampleTextField1 = hit;
    }
    private HtmlOutputText molprsectext2 = new HtmlOutputText();

    public HtmlOutputText getMolprsectext2() {
        return molprsectext2;
    }

    public void setMolprsectext2(HtmlOutputText hot) {
        this.molprsectext2 = hot;
    }
    private Message message25 = new Message();

    public Message getMessage25() {
        return message25;
    }

    public void setMessage25(Message m) {
        this.message25 = m;
    }
    private TextField noctaneTextField1 = new TextField();

    public TextField getNoctaneTextField1() {
        return noctaneTextField1;
    }

    public void setNoctaneTextField1(TextField tf) {
        this.noctaneTextField1 = tf;
    }
    private TextField nheptaneTextField1 = new TextField();

    public TextField getNheptaneTextField1() {
        return nheptaneTextField1;
    }

    public void setNheptaneTextField1(TextField tf) {
        this.nheptaneTextField1 = tf;
    }
    private Message message26 = new Message();

    public Message getMessage26() {
        return message26;
    }

    public void setMessage26(Message m) {
        this.message26 = m;
    }
    private HtmlOutputText outputText3 = new HtmlOutputText();

    public HtmlOutputText getOutputText3() {
        return outputText3;
    }

    public void setOutputText3(HtmlOutputText hot) {
        this.outputText3 = hot;
    }
    private HtmlInputText feplusplusTextField1 = new HtmlInputText();

    public HtmlInputText getFeplusplusTextField1() {
        return feplusplusTextField1;
    }

    public void setFeplusplusTextField1(HtmlInputText hit) {
        this.feplusplusTextField1 = hit;
    }
    private Message message27 = new Message();

    public Message getMessage27() {
        return message27;
    }

    public void setMessage27(Message m) {
        this.message27 = m;
    }
    private Message message28 = new Message();

    public Message getMessage28() {
        return message28;
    }

    public void setMessage28(Message m) {
        this.message28 = m;
    }
    private HtmlInputText mdeaTextField1 = new HtmlInputText();

    public HtmlInputText getMdeaTextField1() {
        return mdeaTextField1;
    }

    public void setMdeaTextField1(HtmlInputText hit) {
        this.mdeaTextField1 = hit;
    }
    private HtmlInputText molarMassC12TextField1 = new HtmlInputText();

    public HtmlInputText getMolarMassC12TextField1() {
        return molarMassC12TextField1;
    }

    public void setMolarMassC12TextField1(HtmlInputText hit) {
        this.molarMassC12TextField1 = hit;
    }
    private HtmlOutputText armoathicHCText1 = new HtmlOutputText();

    public HtmlOutputText getArmoathicHCText1() {
        return armoathicHCText1;
    }

    public void setArmoathicHCText1(HtmlOutputText hot) {
        this.armoathicHCText1 = hot;
    }
    private TextField cc6TextField1 = new TextField();

    public TextField getCc6TextField1() {
        return cc6TextField1;
    }

    public void setCc6TextField1(TextField tf) {
        this.cc6TextField1 = tf;
    }
    private HtmlInputText densityC13TextField1 = new HtmlInputText();

    public HtmlInputText getDensityC13TextField1() {
        return densityC13TextField1;
    }

    public void setDensityC13TextField1(HtmlInputText hit) {
        this.densityC13TextField1 = hit;
    }
    private HtmlInputText molarMassC7TextField1 = new HtmlInputText();

    public HtmlInputText getMolarMassC7TextField1() {
        return molarMassC7TextField1;
    }

    public void setMolarMassC7TextField1(HtmlInputText hit) {
        this.molarMassC7TextField1 = hit;
    }
    private Message message29 = new Message();

    public Message getMessage29() {
        return message29;
    }

    public void setMessage29(Message m) {
        this.message29 = m;
    }
    private HtmlOutputText methaneTextID1 = new HtmlOutputText();

    public HtmlOutputText getMethaneTextID1() {
        return methaneTextID1;
    }

    public void setMethaneTextID1(HtmlOutputText hot) {
        this.methaneTextID1 = hot;
    }
    private HtmlOutputText aceticAcidTextID1 = new HtmlOutputText();

    public HtmlOutputText getAceticAcidTextID1() {
        return aceticAcidTextID1;
    }

    public void setAceticAcidTextID1(HtmlOutputText hot) {
        this.aceticAcidTextID1 = hot;
    }
    private HtmlInputText naplusTextField1 = new HtmlInputText();

    public HtmlInputText getNaplusTextField1() {
        return naplusTextField1;
    }

    public void setNaplusTextField1(HtmlInputText hit) {
        this.naplusTextField1 = hit;
    }
    private Message message30 = new Message();

    public Message getMessage30() {
        return message30;
    }

    public void setMessage30(Message m) {
        this.message30 = m;
    }
    private HtmlOutputText c8TextID1 = new HtmlOutputText();

    public HtmlOutputText getC8TextID1() {
        return c8TextID1;
    }

    public void setC8TextID1(HtmlOutputText hot) {
        this.c8TextID1 = hot;
    }
    private HtmlOutputText testoutputText1 = new HtmlOutputText();

    public HtmlOutputText getTestoutputText1() {
        return testoutputText1;
    }

    public void setTestoutputText1(HtmlOutputText hot) {
        this.testoutputText1 = hot;
    }
    private Message message31 = new Message();

    public Message getMessage31() {
        return message31;
    }

    public void setMessage31(Message m) {
        this.message31 = m;
    }
    private StaticText staticText4 = new StaticText();

    public StaticText getStaticText4() {
        return staticText4;
    }

    public void setStaticText4(StaticText st) {
        this.staticText4 = st;
    }
    private Message message32 = new Message();

    public Message getMessage32() {
        return message32;
    }

    public void setMessage32(Message m) {
        this.message32 = m;
    }
    private HtmlOutputText molprsectext3 = new HtmlOutputText();

    public HtmlOutputText getMolprsectext3() {
        return molprsectext3;
    }

    public void setMolprsectext3(HtmlOutputText hot) {
        this.molprsectext3 = hot;
    }
    private Message message33 = new Message();

    public Message getMessage33() {
        return message33;
    }

    public void setMessage33(Message m) {
        this.message33 = m;
    }
    private HtmlOutputText c11TextID1 = new HtmlOutputText();

    public HtmlOutputText getC11TextID1() {
        return c11TextID1;
    }

    public void setC11TextID1(HtmlOutputText hot) {
        this.c11TextID1 = hot;
    }
    private TextField pxyleneTextField1 = new TextField();

    public TextField getPxyleneTextField1() {
        return pxyleneTextField1;
    }

    public void setPxyleneTextField1(TextField tf) {
        this.pxyleneTextField1 = tf;
    }
    private Message message34 = new Message();

    public Message getMessage34() {
        return message34;
    }

    public void setMessage34(Message m) {
        this.message34 = m;
    }
    private Message message35 = new Message();

    public Message getMessage35() {
        return message35;
    }

    public void setMessage35(Message m) {
        this.message35 = m;
    }
    private HtmlOutputText degTextID1 = new HtmlOutputText();

    public HtmlOutputText getDegTextID1() {
        return degTextID1;
    }

    public void setDegTextID1(HtmlOutputText hot) {
        this.degTextID1 = hot;
    }
    private Message message36 = new Message();

    public Message getMessage36() {
        return message36;
    }

    public void setMessage36(Message m) {
        this.message36 = m;
    }
    private Message message37 = new Message();

    public Message getMessage37() {
        return message37;
    }

    public void setMessage37(Message m) {
        this.message37 = m;
    }
    private HtmlInputText molarMassC11TextField1 = new HtmlInputText();

    public HtmlInputText getMolarMassC11TextField1() {
        return molarMassC11TextField1;
    }

    public void setMolarMassC11TextField1(HtmlInputText hit) {
        this.molarMassC11TextField1 = hit;
    }
    private HtmlInputText ethaneTextField1 = new HtmlInputText();

    public HtmlInputText getEthaneTextField1() {
        return ethaneTextField1;
    }

    public void setEthaneTextField1(HtmlInputText hit) {
        this.ethaneTextField1 = hit;
    }
    private Message message38 = new Message();

    public Message getMessage38() {
        return message38;
    }

    public void setMessage38(Message m) {
        this.message38 = m;
    }
    private HtmlOutputText molmasstext1 = new HtmlOutputText();

    public HtmlOutputText getMolmasstext1() {
        return molmasstext1;
    }

    public void setMolmasstext1(HtmlOutputText hot) {
        this.molmasstext1 = hot;
    }
    private HtmlOutputText nitrogenTextID1 = new HtmlOutputText();

    public HtmlOutputText getNitrogenTextID1() {
        return nitrogenTextID1;
    }

    public void setNitrogenTextID1(HtmlOutputText hot) {
        this.nitrogenTextID1 = hot;
    }
    private TextField cc5TextField1 = new TextField();

    public TextField getCc5TextField1() {
        return cc5TextField1;
    }

    public void setCc5TextField1(TextField tf) {
        this.cc5TextField1 = tf;
    }
    private Message message39 = new Message();

    public Message getMessage39() {
        return message39;
    }

    public void setMessage39(Message m) {
        this.message39 = m;
    }
    private HtmlOutputText pzTextID1 = new HtmlOutputText();

    public HtmlOutputText getPzTextID1() {
        return pzTextID1;
    }

    public void setPzTextID1(HtmlOutputText hot) {
        this.pzTextID1 = hot;
    }
    private Message message41 = new Message();

    public Message getMessage41() {
        return message41;
    }

    public void setMessage41(Message m) {
        this.message41 = m;
    }
    private HtmlOutputText c7TextID1 = new HtmlOutputText();

    public HtmlOutputText getC7TextID1() {
        return c7TextID1;
    }

    public void setC7TextID1(HtmlOutputText hot) {
        this.c7TextID1 = hot;
    }
    private TextField nnonaneTextField1 = new TextField();

    public TextField getNnonaneTextField1() {
        return nnonaneTextField1;
    }

    public void setNnonaneTextField1(TextField tf) {
        this.nnonaneTextField1 = tf;
    }
    private HtmlInputText c10TextField1 = new HtmlInputText();

    public HtmlInputText getC10TextField1() {
        return c10TextField1;
    }

    public void setC10TextField1(HtmlInputText hit) {
        this.c10TextField1 = hit;
    }
    private HtmlOutputText outputText4 = new HtmlOutputText();

    public HtmlOutputText getOutputText4() {
        return outputText4;
    }

    public void setOutputText4(HtmlOutputText hot) {
        this.outputText4 = hot;
    }
    private HtmlInputText nitrogenTextField1 = new HtmlInputText();

    public HtmlInputText getNitrogenTextField1() {
        return nitrogenTextField1;
    }

    public void setNitrogenTextField1(HtmlInputText hit) {
        this.nitrogenTextField1 = hit;
    }
    private HtmlInputText densityC7TextField1 = new HtmlInputText();

    public HtmlInputText getDensityC7TextField1() {
        return densityC7TextField1;
    }

    public void setDensityC7TextField1(HtmlInputText hit) {
        this.densityC7TextField1 = hit;
    }
    private HtmlInputText hexaneTextField1 = new HtmlInputText();

    public HtmlInputText getHexaneTextField1() {
        return hexaneTextField1;
    }

    public void setHexaneTextField1(HtmlInputText hit) {
        this.hexaneTextField1 = hit;
    }
    private HtmlOutputText heavyCompText1 = new HtmlOutputText();

    public HtmlOutputText getHeavyCompText1() {
        return heavyCompText1;
    }

    public void setHeavyCompText1(HtmlOutputText hot) {
        this.heavyCompText1 = hot;
    }
    private Button open1 = new Button();

    public Button getOpen1() {
        return open1;
    }

    public void setOpen1(Button b) {
        this.open1 = b;
    }
    private HtmlInputText densityC6TextField1 = new HtmlInputText();

    public HtmlInputText getDensityC6TextField1() {
        return densityC6TextField1;
    }

    public void setDensityC6TextField1(HtmlInputText hit) {
        this.densityC6TextField1 = hit;
    }
    private HtmlInputText methaneTextField1 = new HtmlInputText();

    public HtmlInputText getMethaneTextField1() {
        return methaneTextField1;
    }

    public void setMethaneTextField1(HtmlInputText hit) {
        this.methaneTextField1 = hit;
    }
    private HtmlInputText molarMassC6TextField1 = new HtmlInputText();

    public HtmlInputText getMolarMassC6TextField1() {
        return molarMassC6TextField1;
    }

    public void setMolarMassC6TextField1(HtmlInputText hit) {
        this.molarMassC6TextField1 = hit;
    }
    private HtmlOutputText ethaneTextID1 = new HtmlOutputText();

    public HtmlOutputText getEthaneTextID1() {
        return ethaneTextID1;
    }

    public void setEthaneTextID1(HtmlOutputText hot) {
        this.ethaneTextID1 = hot;
    }
    private HtmlInputText c9TextField1 = new HtmlInputText();

    public HtmlInputText getC9TextField1() {
        return c9TextField1;
    }

    public void setC9TextField1(HtmlInputText hit) {
        this.c9TextField1 = hit;
    }
    private HtmlOutputText naTextID1 = new HtmlOutputText();

    public HtmlOutputText getNaTextID1() {
        return naTextID1;
    }

    public void setNaTextID1(HtmlOutputText hot) {
        this.naTextID1 = hot;
    }
    private Message message42 = new Message();

    public Message getMessage42() {
        return message42;
    }

    public void setMessage42(Message m) {
        this.message42 = m;
    }
    private HtmlOutputText caTextID1 = new HtmlOutputText();

    public HtmlOutputText getCaTextID1() {
        return caTextID1;
    }

    public void setCaTextID1(HtmlOutputText hot) {
        this.caTextID1 = hot;
    }
    private TextField tolueneTextField1 = new TextField();

    public TextField getTolueneTextField1() {
        return tolueneTextField1;
    }

    public void setTolueneTextField1(TextField tf) {
        this.tolueneTextField1 = tf;
    }
    private Message message43 = new Message();

    public Message getMessage43() {
        return message43;
    }

    public void setMessage43(Message m) {
        this.message43 = m;
    }
    private Message message44 = new Message();

    public Message getMessage44() {
        return message44;
    }

    public void setMessage44(Message m) {
        this.message44 = m;
    }
    private Message message45 = new Message();

    public Message getMessage45() {
        return message45;
    }

    public void setMessage45(Message m) {
        this.message45 = m;
    }
    private Message message46 = new Message();

    public Message getMessage46() {
        return message46;
    }

    public void setMessage46(Message m) {
        this.message46 = m;
    }
    private HtmlOutputText propionicAcidTextID1 = new HtmlOutputText();

    public HtmlOutputText getPropionicAcidTextID1() {
        return propionicAcidTextID1;
    }

    public void setPropionicAcidTextID1(HtmlOutputText hot) {
        this.propionicAcidTextID1 = hot;
    }
    private HtmlOutputText outputText5 = new HtmlOutputText();

    public HtmlOutputText getOutputText5() {
        return outputText5;
    }

    public void setOutputText5(HtmlOutputText hot) {
        this.outputText5 = hot;
    }
    private HtmlOutputText gergWaterMenuText1 = new HtmlOutputText();

    public HtmlOutputText getGergWaterMenuText1() {
        return gergWaterMenuText1;
    }

    public void setGergWaterMenuText1(HtmlOutputText hot) {
        this.gergWaterMenuText1 = hot;
    }
    private CachedRowSetDataProvider fieldsFluidDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getFieldsFluidDataProvider() {
        return fieldsFluidDataProvider;
    }

    public void setFieldsFluidDataProvider(CachedRowSetDataProvider crsdp) {
        this.fieldsFluidDataProvider = crsdp;
    }
    private DoubleConverter doubleConverter1 = new DoubleConverter();

    public DoubleConverter getDoubleConverter1() {
        return doubleConverter1;
    }

    public void setDoubleConverter1(DoubleConverter dc) {
        this.doubleConverter1 = dc;
    }
    private HtmlOutputText pentaneTextID2 = new HtmlOutputText();

    public HtmlOutputText getPentaneTextID2() {
        return pentaneTextID2;
    }

    public void setPentaneTextID2(HtmlOutputText hot) {
        this.pentaneTextID2 = hot;
    }
    private HtmlInputText ipentaneTextField = new HtmlInputText();

    public HtmlInputText getIpentaneTextField() {
        return ipentaneTextField;
    }

    public void setIpentaneTextField(HtmlInputText hit) {
        this.ipentaneTextField = hit;
    }
    private Message message47 = new Message();

    public Message getMessage47() {
        return message47;
    }

    public void setMessage47(Message m) {
        this.message47 = m;
    }
    private Button button1 = new Button();

    public Button getButton1() {
        return button1;
    }

    public void setButton1(Button b) {
        this.button1 = b;
    }
    private StaticText staticText6 = new StaticText();

    public StaticText getStaticText6() {
        return staticText6;
    }

    public void setStaticText6(StaticText st) {
        this.staticText6 = st;
    }
    private StaticText staticText1 = new StaticText();

    public StaticText getStaticText1() {
        return staticText1;
    }

    public void setStaticText1(StaticText st) {
        this.staticText1 = st;
    }
    private StaticText staticText2 = new StaticText();

    public StaticText getStaticText2() {
        return staticText2;
    }

    public void setStaticText2(StaticText st) {
        this.staticText2 = st;
    }
    private HtmlOutputText c14TextID = new HtmlOutputText();

    public HtmlOutputText getC14TextID() {
        return c14TextID;
    }

    public void setC14TextID(HtmlOutputText hot) {
        this.c14TextID = hot;
    }
    private HtmlInputText c14TextField = new HtmlInputText();

    public HtmlInputText getC14TextField() {
        return c14TextField;
    }

    public void setC14TextField(HtmlInputText hit) {
        this.c14TextField = hit;
    }
    private HtmlInputText molarMassC14TextField = new HtmlInputText();

    public HtmlInputText getMolarMassC14TextField() {
        return molarMassC14TextField;
    }

    public void setMolarMassC14TextField(HtmlInputText hit) {
        this.molarMassC14TextField = hit;
    }
    private HtmlInputText densityC14TextField = new HtmlInputText();

    public HtmlInputText getDensityC14TextField() {
        return densityC14TextField;
    }

    public void setDensityC14TextField(HtmlInputText hit) {
        this.densityC14TextField = hit;
    }
    private Message message40 = new Message();

    public Message getMessage40() {
        return message40;
    }

    public void setMessage40(Message m) {
        this.message40 = m;
    }
    private HtmlOutputText c15TextID = new HtmlOutputText();

    public HtmlOutputText getC15TextID() {
        return c15TextID;
    }

    public void setC15TextID(HtmlOutputText hot) {
        this.c15TextID = hot;
    }
    private HtmlInputText c15TextField = new HtmlInputText();

    public HtmlInputText getC15TextField() {
        return c15TextField;
    }

    public void setC15TextField(HtmlInputText hit) {
        this.c15TextField = hit;
    }
    private HtmlInputText molarMassC15TextField = new HtmlInputText();

    public HtmlInputText getMolarMassC15TextField() {
        return molarMassC15TextField;
    }

    public void setMolarMassC15TextField(HtmlInputText hit) {
        this.molarMassC15TextField = hit;
    }
    private HtmlInputText densityC15TextField = new HtmlInputText();

    public HtmlInputText getDensityC15TextField() {
        return densityC15TextField;
    }

    public void setDensityC15TextField(HtmlInputText hit) {
        this.densityC15TextField = hit;
    }
    private Message message48 = new Message();

    public Message getMessage48() {
        return message48;
    }

    public void setMessage48(Message m) {
        this.message48 = m;
    }
    private HtmlOutputText c16TextID = new HtmlOutputText();

    public HtmlOutputText getC16TextID() {
        return c16TextID;
    }

    public void setC16TextID(HtmlOutputText hot) {
        this.c16TextID = hot;
    }
    private HtmlInputText c16TextField = new HtmlInputText();

    public HtmlInputText getC16TextField() {
        return c16TextField;
    }

    public void setC16TextField(HtmlInputText hit) {
        this.c16TextField = hit;
    }
    private HtmlInputText molarMassC16TextField = new HtmlInputText();

    public HtmlInputText getMolarMassC16TextField() {
        return molarMassC16TextField;
    }

    public void setMolarMassC16TextField(HtmlInputText hit) {
        this.molarMassC16TextField = hit;
    }
    private HtmlInputText densityC16TextField = new HtmlInputText();

    public HtmlInputText getDensityC16TextField() {
        return densityC16TextField;
    }

    public void setDensityC16TextField(HtmlInputText hit) {
        this.densityC16TextField = hit;
    }
    private HtmlOutputText c17TextID = new HtmlOutputText();

    public HtmlOutputText getC17TextID() {
        return c17TextID;
    }

    public void setC17TextID(HtmlOutputText hot) {
        this.c17TextID = hot;
    }
    private HtmlInputText c17TextField = new HtmlInputText();

    public HtmlInputText getC17TextField() {
        return c17TextField;
    }

    public void setC17TextField(HtmlInputText hit) {
        this.c17TextField = hit;
    }
    private HtmlInputText molarMassC17TextField = new HtmlInputText();

    public HtmlInputText getMolarMassC17TextField() {
        return molarMassC17TextField;
    }

    public void setMolarMassC17TextField(HtmlInputText hit) {
        this.molarMassC17TextField = hit;
    }
    private HtmlInputText densityC17TextField = new HtmlInputText();

    public HtmlInputText getDensityC17TextField() {
        return densityC17TextField;
    }

    public void setDensityC17TextField(HtmlInputText hit) {
        this.densityC17TextField = hit;
    }
    private HtmlOutputText c18TextID = new HtmlOutputText();

    public HtmlOutputText getC18TextID() {
        return c18TextID;
    }

    public void setC18TextID(HtmlOutputText hot) {
        this.c18TextID = hot;
    }
    private HtmlInputText c18TextField = new HtmlInputText();

    public HtmlInputText getC18TextField() {
        return c18TextField;
    }

    public void setC18TextField(HtmlInputText hit) {
        this.c18TextField = hit;
    }
    private HtmlInputText molarMassC18TextField = new HtmlInputText();

    public HtmlInputText getMolarMassC18TextField() {
        return molarMassC18TextField;
    }

    public void setMolarMassC18TextField(HtmlInputText hit) {
        this.molarMassC18TextField = hit;
    }
    private HtmlInputText densityC18TextField = new HtmlInputText();

    public HtmlInputText getDensityC18TextField() {
        return densityC18TextField;
    }

    public void setDensityC18TextField(HtmlInputText hit) {
        this.densityC18TextField = hit;
    }
    private HtmlOutputText c19TextID = new HtmlOutputText();

    public HtmlOutputText getC19TextID() {
        return c19TextID;
    }

    public void setC19TextID(HtmlOutputText hot) {
        this.c19TextID = hot;
    }
    private HtmlInputText c19TextField = new HtmlInputText();

    public HtmlInputText getC19TextField() {
        return c19TextField;
    }

    public void setC19TextField(HtmlInputText hit) {
        this.c19TextField = hit;
    }
    private HtmlInputText molarMassC19TextField = new HtmlInputText();

    public HtmlInputText getMolarMassC19TextField() {
        return molarMassC19TextField;
    }

    public void setMolarMassC19TextField(HtmlInputText hit) {
        this.molarMassC19TextField = hit;
    }
    private HtmlInputText densityC19TextField = new HtmlInputText();

    public HtmlInputText getDensityC19TextField() {
        return densityC19TextField;
    }

    public void setDensityC19TextField(HtmlInputText hit) {
        this.densityC19TextField = hit;
    }
    private HtmlOutputText c20TextID = new HtmlOutputText();

    public HtmlOutputText getC20TextID() {
        return c20TextID;
    }

    public void setC20TextID(HtmlOutputText hot) {
        this.c20TextID = hot;
    }
    private HtmlInputText c20TextField = new HtmlInputText();

    public HtmlInputText getC20TextField() {
        return c20TextField;
    }

    public void setC20TextField(HtmlInputText hit) {
        this.c20TextField = hit;
    }
    private HtmlInputText molarMassC20TextField = new HtmlInputText();

    public HtmlInputText getMolarMassC20TextField() {
        return molarMassC20TextField;
    }

    public void setMolarMassC20TextField(HtmlInputText hit) {
        this.molarMassC20TextField = hit;
    }
    private HtmlInputText densityC20TextField = new HtmlInputText();

    public HtmlInputText getDensityC20TextField() {
        return densityC20TextField;
    }

    public void setDensityC20TextField(HtmlInputText hit) {
        this.densityC20TextField = hit;
    }
    private TextField c7TextField1 = new TextField();

    public TextField getC7TextField1() {
        return c7TextField1;
    }

    public void setC7TextField1(TextField tf) {
        this.c7TextField1 = tf;
    }
    private TextField c6TextField1 = new TextField();

    public TextField getC6TextField1() {
        return c6TextField1;
    }

    public void setC6TextField1(TextField tf) {
        this.c6TextField1 = tf;
    }
    private HtmlInputText kplusTextField = new HtmlInputText();

    public HtmlInputText getKplusTextField() {
        return kplusTextField;
    }

    public void setKplusTextField(HtmlInputText hit) {
        this.kplusTextField = hit;
    }
    private HtmlInputText MG2plusTextField = new HtmlInputText();

    public HtmlInputText getMG2plusTextField() {
        return MG2plusTextField;
    }

    public void setMG2plusTextField(HtmlInputText hit) {
        this.MG2plusTextField = hit;
    }
    private HtmlInputText BAplusplusTextField = new HtmlInputText();

    public HtmlInputText getBAplusplusTextField() {
        return BAplusplusTextField;
    }

    public void setBAplusplusTextField(HtmlInputText hit) {
        this.BAplusplusTextField = hit;
    }
    private HtmlInputText SRlusplusTextField = new HtmlInputText();

    public HtmlInputText getSRlusplusTextField() {
        return SRlusplusTextField;
    }

    public void setSRlusplusTextField(HtmlInputText hit) {
        this.SRlusplusTextField = hit;
    }
    private HtmlInputText BRMinusTextField = new HtmlInputText();

    public HtmlInputText getBRMinusTextField() {
        return BRMinusTextField;
    }

    public void setBRMinusTextField(HtmlInputText hit) {
        this.BRMinusTextField = hit;
    }
    private HtmlInputText HCO3MinusTexField = new HtmlInputText();

    public HtmlInputText getHCO3MinusTexField() {
        return HCO3MinusTexField;
    }

    public void setHCO3MinusTexField(HtmlInputText hit) {
        this.HCO3MinusTexField = hit;
    }
    private HtmlInputText ethanolTextField = new HtmlInputText();

    public HtmlInputText getEthanolTextField() {
        return ethanolTextField;
    }

    public void setEthanolTextField(HtmlInputText hit) {
        this.ethanolTextField = hit;
    }
    private DoubleRangeValidator doubleRangeValidator1 = new DoubleRangeValidator();

    public DoubleRangeValidator getDoubleRangeValidator1() {
        return doubleRangeValidator1;
    }

    public void setDoubleRangeValidator1(DoubleRangeValidator drv) {
        this.doubleRangeValidator1 = drv;
    }
    private Hyperlink helpHyperlink = new Hyperlink();

    public Hyperlink getHelpHyperlink() {
        return helpHyperlink;
    }

    public void setHelpHyperlink(Hyperlink h) {
        this.helpHyperlink = h;
    }
    private SingleSelectOptionsList fluidTypeRadioButtonGroupDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getFluidTypeRadioButtonGroupDefaultOptions() {
        return fluidTypeRadioButtonGroupDefaultOptions;
    }

    public void setFluidTypeRadioButtonGroupDefaultOptions(SingleSelectOptionsList ssol) {
        this.fluidTypeRadioButtonGroupDefaultOptions = ssol;
    }
    private Checkbox waxCheckBox = new Checkbox();

    public Checkbox getWaxCheckBox() {
        return waxCheckBox;
    }

    public void setWaxCheckBox(Checkbox c) {
        this.waxCheckBox = c;
    }
    private RadioButtonGroup fluidTypeRadioButtonGroup = new RadioButtonGroup();

    public RadioButtonGroup getFluidTypeRadioButtonGroup() {
        return fluidTypeRadioButtonGroup;
    }

    public void setFluidTypeRadioButtonGroup(RadioButtonGroup rbg) {
        this.fluidTypeRadioButtonGroup = rbg;
    }
    private HtmlInputText c21TextField1 = new HtmlInputText();

    public HtmlInputText getC21TextField1() {
        return c21TextField1;
    }

    public void setC21TextField1(HtmlInputText hit) {
        this.c21TextField1 = hit;
    }
    private HtmlInputText molarMassC21TextField1 = new HtmlInputText();

    public HtmlInputText getMolarMassC21TextField1() {
        return molarMassC21TextField1;
    }

    public void setMolarMassC21TextField1(HtmlInputText hit) {
        this.molarMassC21TextField1 = hit;
    }
    private HtmlInputText densityC21TextField1 = new HtmlInputText();

    public HtmlInputText getDensityC21TextField1() {
        return densityC21TextField1;
    }

    public void setDensityC21TextField1(HtmlInputText hit) {
        this.densityC21TextField1 = hit;
    }
    private HtmlInputText c22TextField2 = new HtmlInputText();

    public HtmlInputText getC22TextField2() {
        return c22TextField2;
    }

    public void setC22TextField2(HtmlInputText hit) {
        this.c22TextField2 = hit;
    }
    private HtmlInputText molarMassC22TextField2 = new HtmlInputText();

    public HtmlInputText getMolarMassC22TextField2() {
        return molarMassC22TextField2;
    }

    public void setMolarMassC22TextField2(HtmlInputText hit) {
        this.molarMassC22TextField2 = hit;
    }
    private HtmlInputText densityC22TextField2 = new HtmlInputText();

    public HtmlInputText getDensityC22TextField2() {
        return densityC22TextField2;
    }

    public void setDensityC22TextField2(HtmlInputText hit) {
        this.densityC22TextField2 = hit;
    }
    private HtmlInputText c23TextField3 = new HtmlInputText();

    public HtmlInputText getC23TextField3() {
        return c23TextField3;
    }

    public void setC23TextField3(HtmlInputText hit) {
        this.c23TextField3 = hit;
    }
    private HtmlInputText molarMassC23TextField3 = new HtmlInputText();

    public HtmlInputText getMolarMassC23TextField3() {
        return molarMassC23TextField3;
    }

    public void setMolarMassC23TextField3(HtmlInputText hit) {
        this.molarMassC23TextField3 = hit;
    }
    private HtmlInputText densityC23TextField3 = new HtmlInputText();

    public HtmlInputText getDensityC23TextField3() {
        return densityC23TextField3;
    }

    public void setDensityC23TextField3(HtmlInputText hit) {
        this.densityC23TextField3 = hit;
    }
    private HtmlInputText c24TextField4 = new HtmlInputText();

    public HtmlInputText getC24TextField4() {
        return c24TextField4;
    }

    public void setC24TextField4(HtmlInputText hit) {
        this.c24TextField4 = hit;
    }
    private HtmlInputText molarMassC24TextField4 = new HtmlInputText();

    public HtmlInputText getMolarMassC24TextField4() {
        return molarMassC24TextField4;
    }

    public void setMolarMassC24TextField4(HtmlInputText hit) {
        this.molarMassC24TextField4 = hit;
    }
    private HtmlInputText densityC24TextField4 = new HtmlInputText();

    public HtmlInputText getDensityC24TextField4() {
        return densityC24TextField4;
    }

    public void setDensityC24TextField4(HtmlInputText hit) {
        this.densityC24TextField4 = hit;
    }
    private HtmlInputText c25TextField5 = new HtmlInputText();

    public HtmlInputText getC25TextField5() {
        return c25TextField5;
    }

    public void setC25TextField5(HtmlInputText hit) {
        this.c25TextField5 = hit;
    }
    private HtmlInputText molarMassC25TextField5 = new HtmlInputText();

    public HtmlInputText getMolarMassC25TextField5() {
        return molarMassC25TextField5;
    }

    public void setMolarMassC25TextField5(HtmlInputText hit) {
        this.molarMassC25TextField5 = hit;
    }
    private HtmlInputText densityC25TextField5 = new HtmlInputText();

    public HtmlInputText getDensityC25TextField5() {
        return densityC25TextField5;
    }

    public void setDensityC25TextField5(HtmlInputText hit) {
        this.densityC25TextField5 = hit;
    }
    private HtmlInputText mercuryTextField2 = new HtmlInputText();

    public HtmlInputText getMercuryTextField2() {
        return mercuryTextField2;
    }

    public void setMercuryTextField2(HtmlInputText hit) {
        this.mercuryTextField2 = hit;
    }
    private HtmlInputText hydrogenTextField = new HtmlInputText();

    public HtmlInputText getHydrogenTextField() {
        return hydrogenTextField;
    }

    public void setHydrogenTextField(HtmlInputText hit) {
        this.hydrogenTextField = hit;
    }
    private HtmlInputText i22dimC3TextField = new HtmlInputText();

    public HtmlInputText getI22dimC3TextField() {
        return i22dimC3TextField;
    }

    public void setI22dimC3TextField(HtmlInputText hit) {
        this.i22dimC3TextField = hit;
    }
    private TextField i22dimC4TextField2 = new TextField();

    public TextField getI22dimC4TextField2() {
        return i22dimC4TextField2;
    }

    public void setI22dimC4TextField2(TextField tf) {
        this.i22dimC4TextField2 = tf;
    }
    private TextField i2mC5TextField = new TextField();

    public TextField getI2mC5TextField() {
        return i2mC5TextField;
    }

    public void setI2mC5TextField(TextField tf) {
        this.i2mC5TextField = tf;
    }
    private TextField i3mC5TextField = new TextField();

    public TextField getI3mC5TextField() {
        return i3mC5TextField;
    }

    public void setI3mC5TextField(TextField tf) {
        this.i3mC5TextField = tf;
    }
    private TextField m_c_pentaneTextField = new TextField();

    public TextField getM_c_pentaneTextField() {
        return m_c_pentaneTextField;
    }

    public void setM_c_pentaneTextField(TextField tf) {
        this.m_c_pentaneTextField = tf;
    }
    private HtmlInputText cpropaneTextField = new HtmlInputText();

    public HtmlInputText getCpropaneTextField() {
        return cpropaneTextField;
    }

    public void setCpropaneTextField(HtmlInputText hit) {
        this.cpropaneTextField = hit;
    }
    private HtmlInputText cbutaneTextField = new HtmlInputText();

    public HtmlInputText getCbutaneTextField() {
        return cbutaneTextField;
    }

    public void setCbutaneTextField(HtmlInputText hit) {
        this.cbutaneTextField = hit;
    }
    private HtmlInputText oxygenTextField = new HtmlInputText();

    public HtmlInputText getOxygenTextField() {
        return oxygenTextField;
    }

    public void setOxygenTextField(HtmlInputText hit) {
        this.oxygenTextField = hit;
    }
    private HtmlInputText argonTextField = new HtmlInputText();

    public HtmlInputText getArgonTextField() {
        return argonTextField;
    }

    public void setArgonTextField(HtmlInputText hit) {
        this.argonTextField = hit;
    }
    private TextField i23dimC4TextField = new TextField();

    public TextField getI23dimC4TextField() {
        return i23dimC4TextField;
    }

    public void setI23dimC4TextField(TextField tf) {
        this.i23dimC4TextField = tf;
    }
    private TextField cheptaneTextField = new TextField();

    public TextField getCheptaneTextField() {
        return cheptaneTextField;
    }

    public void setCheptaneTextField(TextField tf) {
        this.cheptaneTextField = tf;
    }
    private TextField m_c_heptaneTextField = new TextField();

    public TextField getM_c_heptaneTextField() {
        return m_c_heptaneTextField;
    }

    public void setM_c_heptaneTextField(TextField tf) {
        this.m_c_heptaneTextField = tf;
    }
    private TextField c_octaneTextField = new TextField();

    public TextField getC_octaneTextField() {
        return c_octaneTextField;
    }

    public void setC_octaneTextField(TextField tf) {
        this.c_octaneTextField = tf;
    }
    private TextField nc11TextField = new TextField();

    public TextField getNc11TextField() {
        return nc11TextField;
    }

    public void setNc11TextField(TextField tf) {
        this.nc11TextField = tf;
    }
    private TextField nc12TextField = new TextField();

    public TextField getNc12TextField() {
        return nc12TextField;
    }

    public void setNc12TextField(TextField tf) {
        this.nc12TextField = tf;
    }
    private TextField nc13TextField = new TextField();

    public TextField getNc13TextField() {
        return nc13TextField;
    }

    public void setNc13TextField(TextField tf) {
        this.nc13TextField = tf;
    }
    private TextField nc14TextField = new TextField();

    public TextField getNc14TextField() {
        return nc14TextField;
    }

    public void setNc14TextField(TextField tf) {
        this.nc14TextField = tf;
    }
    private TextField nc15TextField = new TextField();

    public TextField getNc15TextField() {
        return nc15TextField;
    }

    public void setNc15TextField(TextField tf) {
        this.nc15TextField = tf;
    }
    private TextField nc16TextField = new TextField();

    public TextField getNc16TextField() {
        return nc16TextField;
    }

    public void setNc16TextField(TextField tf) {
        this.nc16TextField = tf;
    }
    private TextField nc17TextField = new TextField();

    public TextField getNc17TextField() {
        return nc17TextField;
    }

    public void setNc17TextField(TextField tf) {
        this.nc17TextField = tf;
    }
    private TextField nc18TextField = new TextField();

    public TextField getNc18TextField() {
        return nc18TextField;
    }

    public void setNc18TextField(TextField tf) {
        this.nc18TextField = tf;
    }
    private TextField nc19TextField = new TextField();

    public TextField getNc19TextField() {
        return nc19TextField;
    }

    public void setNc19TextField(TextField tf) {
        this.nc19TextField = tf;
    }
    private TextField nc20TextField = new TextField();

    public TextField getNc20TextField() {
        return nc20TextField;
    }

    public void setNc20TextField(TextField tf) {
        this.nc20TextField = tf;
    }
    private CachedRowSetDataProvider analyserlocationsDataProvider1 = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getAnalyserlocationsDataProvider1() {
        return analyserlocationsDataProvider1;
    }

    public void setAnalyserlocationsDataProvider1(CachedRowSetDataProvider crsdp) {
        this.analyserlocationsDataProvider1 = crsdp;
    }

    // </editor-fold>
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public AddComponentsPage() {
    }

    /**
     * <p>Callback method that is called whenever a page is navigated to,
     * either directly via a URL, or indirectly via page navigation.
     * Customize this method to acquire resources that will be needed
     * for event handlers and lifecycle methods, whether or not this
     * page is performing post back processing.</p>
     * 
     * <p>Note that, if the current request is a postback, the property
     * values of the components do <strong>not</strong> represent any
     * values submitted with this request.  Instead, they represent the
     * property values that were saved for this view when it was rendered.</p>
     */
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
            log("AddComponentsPage2 Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
        }

        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
        try {
            fieldsFluidDataProvider.getCachedRowSet().setInt(1, getSessionBean1().getActiveFluidID());
            fieldsFluidDataProvider.getCachedRowSet().execute();
            //   RowKey rk = fieldsFluidDataProvider.getCursorRow();
            //   String temp = new String(fieldsFluidDataProvider.getValue("FLUIDINFO.DATE", rk).toString());
            //   popupCalendar1.setSelectedDate(new java.util.Date(temp));

            int hasPlus = Integer.parseInt(fieldsFluidDataProvider.getValue("FLUIDINFO.HASPLUSFRACTION").toString());
            if (hasPlus == 1) {
                fluidTypeRadioButtonGroup.setValue("Plus Fraction");
            } else {
                fluidTypeRadioButtonGroup.setValue("No-Plus Fraction");
            }
            //
        } catch (Exception e) {
            log("EditExperimentalData Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
        }
        getThermo$ThermoSessionBean().setActiveWikiCategory("NeqSim_FAQ");
        helpHyperlink.setUrl("/../NeqSim_FAQ");
    }

    /**
     * <p>Callback method that is called after the component tree has been
     * restored, but before any event processing takes place.  This method
     * will <strong>only</strong> be called on a postback request that
     * is processing a form submit.  Customize this method to allocate
     * resources that will be required in your event handlers.</p>
     */
    @Override
    public void preprocess() {
    }

    /**
     * <p>Callback method that is called just before rendering takes place.
     * This method will <strong>only</strong> be called for the page that
     * will actually be rendered (and not, for example, on a page that
     * handled a postback and then navigated to a different page).  Customize
     * this method to allocate resources that will be required for rendering
     * this page.</p>
     */
    @Override
    public void prerender() {
    }

    /**
     * <p>Callback method that is called after rendering is completed for
     * this request, if <code>init()</code> was called (regardless of whether
     * or not this was the page that was actually rendered).  Customize this
     * method to release resources acquired in the <code>init()</code>,
     * <code>preprocess()</code>, or <code>prerender()</code> methods (or
     * acquired during execution of an event handler).</p>
     */
    @Override
    public void destroy() {
        fieldsFluidDataProvider.close();
        analyserlocationsDataProvider1.close();
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected SessionBean1 getSessionBean1() {
        return (SessionBean1) getBean("SessionBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected GasQualitySessionBean getGasQuality$GasQualitySessionBean() {
        return (GasQualitySessionBean) getBean("GasQuality$GasQualitySessionBean");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected ThermoSessionBean getThermo$ThermoSessionBean() {
        return (ThermoSessionBean) getBean("Thermo$ThermoSessionBean");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1) getBean("ApplicationBean1");
    }

    public void historyTextArea_processValueChange(ValueChangeEvent vce) {
    }

    public void saveFluid() {
        boolean plusFractionisChecked = false;
        try {
            RowKey rk = null;
            try {
                if (fluidTypeRadioButtonGroup.getValue().toString().equals("Plus Fraction")) {
                    plusFractionisChecked = true;
                    rk = fieldsFluidDataProvider.getCursorRow();
                    fieldsFluidDataProvider.setValue("FLUIDINFO.HASPLUSFRACTION", rk, "1");
                } else {
                    rk = fieldsFluidDataProvider.getCursorRow();
                    fieldsFluidDataProvider.setValue("FLUIDINFO.HASPLUSFRACTION", rk, "0");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            fieldsFluidDataProvider.commitChanges();
        } catch (Exception e) {
            error(e.toString());
        }

        try {

            java.text.DecimalFormat nf = new java.text.DecimalFormat();

            nf.setMaximumFractionDigits(5);

            nf.applyPattern("#.###E0");

            getThermo$ThermoSessionBean().resetThermoSystem();

            neqsim.thermo.system.SystemInterface thermoSystem = getThermo$ThermoSessionBean().getThermoSystem();


            if (java.lang.Double.parseDouble(getNitrogenTextField1().getValue().toString()) > 1.0E-50) {
                thermoSystem.addComponent("nitrogen", java.lang.Double.parseDouble(getNitrogenTextField1().getValue().toString()));
            }

            if (java.lang.Double.parseDouble(getOxygenTextField().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("oxygen", java.lang.Double.parseDouble(getOxygenTextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getArgonTextField().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("argon", java.lang.Double.parseDouble(getArgonTextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getMercuryTextField2().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("mercury", java.lang.Double.parseDouble(getMercuryTextField2().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getHydrogenTextField().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("hydrogen", java.lang.Double.parseDouble(getHydrogenTextField().getValue().toString()));

            }


            if (java.lang.Double.parseDouble(getCarbonDioxideTextField1().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("CO2", java.lang.Double.parseDouble(getCarbonDioxideTextField1().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getH2sTextField1().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("H2S", java.lang.Double.parseDouble(getH2sTextField1().getValue().toString()));

            }



            if (java.lang.Double.parseDouble(getMethaneTextField1().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("methane", java.lang.Double.parseDouble(getMethaneTextField1().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getEthaneTextField1().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("ethane",
                        java.lang.Double.parseDouble(getEthaneTextField1().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getPropaneTextField1().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("propane", java.lang.Double.parseDouble(getPropaneTextField1().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getCpropaneTextField().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("c-propane", java.lang.Double.parseDouble(getCpropaneTextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getIbutaneTextField1().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("i-butane", java.lang.Double.parseDouble(getIbutaneTextField1().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getCbutaneTextField().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("c-C4", java.lang.Double.parseDouble(getCbutaneTextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getNbutaneTextField1().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("n-butane", java.lang.Double.parseDouble(getNbutaneTextField1().getValue().toString()));

            }
            if (java.lang.Double.parseDouble(getIpentaneTextField().getValue().toString()) > 1.0E-50) {
                thermoSystem.addComponent("i-pentane", java.lang.Double.parseDouble(getIpentaneTextField().getValue().toString()));
            }

            if (java.lang.Double.parseDouble(getPentaneTextField1().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("n-pentane", java.lang.Double.parseDouble(getPentaneTextField1().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getCc5TextField1().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("c-C5", java.lang.Double.parseDouble(getCc5TextField1().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getI22dimC3TextField().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("22-dim-C3", java.lang.Double.parseDouble(getI22dimC3TextField().getValue().toString()));

            }



            if (java.lang.Double.parseDouble(getI22dimC4TextField2().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("22-dim-C4", java.lang.Double.parseDouble(getI22dimC4TextField2().getValue().toString()));

            }


            if (java.lang.Double.parseDouble(getI23dimC4TextField().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("23-dim-C4", java.lang.Double.parseDouble(getI23dimC4TextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getI2mC5TextField().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("2-m-C5", java.lang.Double.parseDouble(getI2mC5TextField().getValue().toString()));

            }


            if (java.lang.Double.parseDouble(getI3mC5TextField().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("3-m-C5", java.lang.Double.parseDouble(getI3mC5TextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getCc6TextField1().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("c-hexane", java.lang.Double.parseDouble(getCc6TextField1().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getHexaneTextField1().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("n-hexane",
                        java.lang.Double.parseDouble(getHexaneTextField1().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getCheptaneTextField().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("c-C7", java.lang.Double.parseDouble(getCheptaneTextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getM_c_heptaneTextField().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("ethylcyclohexane", java.lang.Double.parseDouble(getM_c_heptaneTextField().getValue().toString()));

            }
            
            if (java.lang.Double.parseDouble(getBenzeneTextField1().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("benzene", java.lang.Double.parseDouble(getBenzeneTextField1().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getNheptaneTextField1().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("n-heptane", java.lang.Double.parseDouble(getNheptaneTextField1().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getTolueneTextField1().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("toluene", java.lang.Double.parseDouble(getTolueneTextField1().getValue().toString()));

            }

              if (java.lang.Double.parseDouble(getC_octaneTextField().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("c-C8", java.lang.Double.parseDouble(getC_octaneTextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getNoctaneTextField1().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("n-octane", java.lang.Double.parseDouble(getNoctaneTextField1().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getMxyleneTextField1().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("m-Xylene", java.lang.Double.parseDouble(getMxyleneTextField1().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getPxyleneTextField1().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("p-Xylene", java.lang.Double.parseDouble(getPxyleneTextField1().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getOxyleneTextField1().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("o-Xylene", java.lang.Double.parseDouble(getOxyleneTextField1().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getNnonaneTextField1().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("n-nonane", java.lang.Double.parseDouble(getNnonaneTextField1().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getNdecaneTextField1().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("nC10", java.lang.Double.parseDouble(getNdecaneTextField1().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getNc11TextField().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("nC11", java.lang.Double.parseDouble(getNc11TextField().getValue().toString()));

            }


            if (java.lang.Double.parseDouble(getNc12TextField().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("nC12", java.lang.Double.parseDouble(getNc12TextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getNc13TextField().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("nC13", java.lang.Double.parseDouble(getNc13TextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getNc14TextField().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("nC14", java.lang.Double.parseDouble(getNc14TextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getNc16TextField().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("nC16", java.lang.Double.parseDouble(getNc16TextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getNc17TextField().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("nC17", java.lang.Double.parseDouble(getNc17TextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getNc18TextField().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("nC18", java.lang.Double.parseDouble(getNc18TextField().getValue().toString()));

            }


            if (java.lang.Double.parseDouble(getNc19TextField().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("nC19", java.lang.Double.parseDouble(getNc19TextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getNc20TextField().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("nC20", java.lang.Double.parseDouble(getNc20TextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getC6TextField1().getValue().toString()) > 1.0E-50) {

                thermoSystem.addTBPfraction("C6", java.lang.Double.parseDouble(getC6TextField1().getValue().toString()),
                        java.lang.Double.parseDouble(getMolarMassC6TextField1().getValue().toString()) / 1000.0,
                        java.lang.Double.parseDouble(getDensityC6TextField1().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getC7TextField1().getValue().toString()) > 1.0E-50) {

                thermoSystem.addTBPfraction("C7", java.lang.Double.parseDouble(getC7TextField1().getValue().toString()),
                        java.lang.Double.parseDouble(getMolarMassC7TextField1().getValue().toString()) / 1000.0,
                        java.lang.Double.parseDouble(getDensityC7TextField1().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getC8TextField1().getValue().toString()) > 1.0E-50) {

                thermoSystem.addTBPfraction("C8", java.lang.Double.parseDouble(getC8TextField1().getValue().toString()),
                        java.lang.Double.parseDouble(getMolarMassC8TextField1().getValue().toString()) / 1000.0,
                        java.lang.Double.parseDouble(getDensityC8TextField1().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getC9TextField1().getValue().toString()) > 1.0E-50) {

                thermoSystem.addTBPfraction("C9", java.lang.Double.parseDouble(getC9TextField1().getValue().toString()),
                        java.lang.Double.parseDouble(getMolarMassC9TextField1().getValue().toString()) / 1000.0,
                        java.lang.Double.parseDouble(getDensityC9TextField1().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getC10TextField1().getValue().toString()) > 1.0E-50) {

                thermoSystem.addTBPfraction("C10", java.lang.Double.parseDouble(getC10TextField1().getValue().toString()),
                        java.lang.Double.parseDouble(getMolarMassC10TextField1().getValue().toString()) / 1000.0,
                        java.lang.Double.parseDouble(getDensityC10TextField1().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getC11TextField1().getValue().toString()) > 1.0E-50) {

                thermoSystem.addTBPfraction("C11", java.lang.Double.parseDouble(getC11TextField1().getValue().toString()),
                        java.lang.Double.parseDouble(getMolarMassC11TextField1().getValue().toString()) / 1000.0,
                        java.lang.Double.parseDouble(getDensityC11TextField1().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getC12TextField1().getValue().toString()) > 1.0E-50) {

                thermoSystem.addTBPfraction("C12", java.lang.Double.parseDouble(getC12TextField1().getValue().toString()),
                        java.lang.Double.parseDouble(getMolarMassC12TextField1().getValue().toString()) / 1000.0,
                        java.lang.Double.parseDouble(getDensityC12TextField1().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getC13TextField1().getValue().toString()) > 1.0E-50) {

                thermoSystem.addTBPfraction("C13", java.lang.Double.parseDouble(getC13TextField1().getValue().toString()),
                        java.lang.Double.parseDouble(getMolarMassC13TextField1().getValue().toString()) / 1000.0,
                        java.lang.Double.parseDouble(getDensityC13TextField1().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getC14TextField().getValue().toString()) > 1.0E-50) {

                thermoSystem.addTBPfraction("C14", java.lang.Double.parseDouble(getC14TextField().getValue().toString()),
                        java.lang.Double.parseDouble(getMolarMassC14TextField().getValue().toString()) / 1000.0,
                        java.lang.Double.parseDouble(getDensityC14TextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getC15TextField().getValue().toString()) > 1.0E-50) {

                thermoSystem.addTBPfraction("C15", java.lang.Double.parseDouble(getC15TextField().getValue().toString()),
                        java.lang.Double.parseDouble(getMolarMassC15TextField().getValue().toString()) / 1000.0,
                        java.lang.Double.parseDouble(getDensityC15TextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getC16TextField().getValue().toString()) > 1.0E-50) {

                thermoSystem.addTBPfraction("C16", java.lang.Double.parseDouble(getC16TextField().getValue().toString()),
                        java.lang.Double.parseDouble(getMolarMassC16TextField().getValue().toString()) / 1000.0,
                        java.lang.Double.parseDouble(getDensityC16TextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getC17TextField().getValue().toString()) > 1.0E-50) {

                thermoSystem.addTBPfraction("C17", java.lang.Double.parseDouble(getC17TextField().getValue().toString()),
                        java.lang.Double.parseDouble(getMolarMassC17TextField().getValue().toString()) / 1000.0,
                        java.lang.Double.parseDouble(getDensityC17TextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getC18TextField().getValue().toString()) > 1.0E-50) {

                thermoSystem.addTBPfraction("C18", java.lang.Double.parseDouble(getC18TextField().getValue().toString()),
                        java.lang.Double.parseDouble(getMolarMassC18TextField().getValue().toString()) / 1000.0,
                        java.lang.Double.parseDouble(getDensityC18TextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getC19TextField().getValue().toString()) > 1.0E-50) {

                thermoSystem.addTBPfraction("C19", java.lang.Double.parseDouble(getC19TextField().getValue().toString()),
                        java.lang.Double.parseDouble(getMolarMassC19TextField().getValue().toString()) / 1000.0,
                        java.lang.Double.parseDouble(getDensityC19TextField().getValue().toString()));

            }
            if (java.lang.Double.parseDouble(getC20TextField().getValue().toString()) > 1.0E-50) {

                thermoSystem.addTBPfraction("C20", java.lang.Double.parseDouble(getC20TextField().getValue().toString()),
                        java.lang.Double.parseDouble(getMolarMassC20TextField().getValue().toString()) / 1000.0,
                        java.lang.Double.parseDouble(getDensityC20TextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getC21TextField1().getValue().toString()) > 1.0E-50) {

                thermoSystem.addTBPfraction("C21", java.lang.Double.parseDouble(getC21TextField1().getValue().toString()),
                        java.lang.Double.parseDouble(getMolarMassC21TextField1().getValue().toString()) / 1000.0,
                        java.lang.Double.parseDouble(getDensityC21TextField1().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getC22TextField2().getValue().toString()) > 1.0E-50) {

                thermoSystem.addTBPfraction("C22", java.lang.Double.parseDouble(getC22TextField2().getValue().toString()),
                        java.lang.Double.parseDouble(getMolarMassC22TextField2().getValue().toString()) / 1000.0,
                        java.lang.Double.parseDouble(getDensityC22TextField2().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getC23TextField3().getValue().toString()) > 1.0E-50) {

                thermoSystem.addTBPfraction("C23", java.lang.Double.parseDouble(getC23TextField3().getValue().toString()),
                        java.lang.Double.parseDouble(getMolarMassC23TextField3().getValue().toString()) / 1000.0,
                        java.lang.Double.parseDouble(getDensityC23TextField3().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getC24TextField4().getValue().toString()) > 1.0E-50) {

                thermoSystem.addTBPfraction("C24", java.lang.Double.parseDouble(getC24TextField4().getValue().toString()),
                        java.lang.Double.parseDouble(getMolarMassC24TextField4().getValue().toString()) / 1000.0,
                        java.lang.Double.parseDouble(getDensityC24TextField4().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getC25TextField5().getValue().toString()) > 1.0E-50) {

                thermoSystem.addTBPfraction("C25", java.lang.Double.parseDouble(getC25TextField5().getValue().toString()),
                        java.lang.Double.parseDouble(getMolarMassC25TextField5().getValue().toString()) / 1000.0,
                        java.lang.Double.parseDouble(getDensityC25TextField5().getValue().toString()));

            }

            try {
                if (plusFractionisChecked) {
                    boolean testIfTBP = thermoSystem.setHeavyTBPfractionAsPlusFraction();
                    if (testIfTBP) {
                        thermoSystem.getCharacterization().getLumpingModel().setNumberOfLumpedComponents(7);
                        thermoSystem.getCharacterization().characterisePlusFraction();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }


            if (java.lang.Double.parseDouble(getMethanolTextField1().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("methanol", java.lang.Double.parseDouble(getMethanolTextField1().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getEthanolTextField().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("ethanol", java.lang.Double.parseDouble(getEthanolTextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getMegTextField1().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("MEG", java.lang.Double.parseDouble(getMegTextField1().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getDegTextField1().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("DEG", java.lang.Double.parseDouble(getDegTextField1().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getTegTextField1().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("TEG", java.lang.Double.parseDouble(getTegTextField1().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getMdeaTextField1().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("MDEA", java.lang.Double.parseDouble(getMdeaTextField1().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getPiperazineTextField1().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("Piperazine", java.lang.Double.parseDouble(getPiperazineTextField1().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getAceticAcidTextField1().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("AceticAcid", java.lang.Double.parseDouble(getAceticAcidTextField1().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getPropionicAcidTextField1().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("AceticAcid", java.lang.Double.parseDouble(getPropionicAcidTextField1().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getNaplusTextField1().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("Na+", java.lang.Double.parseDouble(getNaplusTextField1().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getKplusTextField().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("K+", java.lang.Double.parseDouble(getKplusTextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getMG2plusTextField().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("Mg++", java.lang.Double.parseDouble(getMG2plusTextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getBAplusplusTextField().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("Ba++", java.lang.Double.parseDouble(getBAplusplusTextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getBAplusplusTextField().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("Ba++", java.lang.Double.parseDouble(getBAplusplusTextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getClMinusTextField1().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("Cl-", java.lang.Double.parseDouble(getClMinusTextField1().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getFeplusplusTextField1().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("Fe++", java.lang.Double.parseDouble(getFeplusplusTextField1().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getSRlusplusTextField().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("Sr++", java.lang.Double.parseDouble(getSRlusplusTextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getBRMinusTextField().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("Br-", java.lang.Double.parseDouble(getBRMinusTextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getOhMinusTexField1().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("OH-", java.lang.Double.parseDouble(getOhMinusTexField1().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getHCO3MinusTexField().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("HCO3-", java.lang.Double.parseDouble(getHCO3MinusTexField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getCo3MinusTextField1().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("CO3--", java.lang.Double.parseDouble(getCo3MinusTextField1().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getSO4minusMinusTextField1().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("SO4--", java.lang.Double.parseDouble(getSO4minusMinusTextField1().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getWaterTextField1().getValue().toString()) > 1.0E-50) {

                thermoSystem.addComponent("water", java.lang.Double.parseDouble(getWaterTextField1().getValue().toString()));

            }



            getThermo$ThermoSessionBean().setThermoSystem(
                    thermoSystem.autoSelectModel());
            getThermo$ThermoSessionBean().getThermodynamicOperation().setSystem(getThermo$ThermoSessionBean().getThermoSystem());

            if (waxCheckBox.isChecked()) {
                getThermo$ThermoSessionBean().getThermoSystem().getWaxModel().addTBPWax();
                getThermo$ThermoSessionBean().getThermoSystem().createDatabase(true);
                getThermo$ThermoSessionBean().getThermoSystem().setMixingRule(getThermo$ThermoSessionBean().getThermoSystem().getMixingRule());
                getThermo$ThermoSessionBean().getThermoSystem().addSolidComplexPhase("wax");
                getThermo$ThermoSessionBean().getThermoSystem().setMultiphaseWaxCheck(true);
            }
            //getThermo$ThermoSessionBean().getThermoSystem().getInterphaseProperties().setInterfacialTensionModel(2);
            getThermo$ThermoSessionBean().getThermoSystem().saveObject(getSessionBean1().getActiveFluidID(),"");
        } catch (Exception e) {

            e.printStackTrace();

        }
    }

    public String calculateButton_action() {
        saveFluid();
        if (getSessionBean1().getActiveSubject().equals("thermo")) {
            return "ToThermoMenuPage";
        } else if (getSessionBean1().getActiveSubject().equals("gasquality")) {
            return "ToGasQualityOperationPage";
        } else if (getSessionBean1().getActiveSubject().equals("LNG")) {
            return "ToLNGCalculatorOperations";
        } else if (getSessionBean1().getActiveSubject().equals("GasProcess")) {
            return "ToProcessOperationPage";
        } else {
            return "ToThermoMenuPage";
        }
    }

    public String saveButton_action() {

        try {

            fieldsFluidDataProvider.commitChanges();

        } catch (Exception e) {

            error(e.toString());

        }
        return null;
    }

    public void hexaneTextField_processValueChange(ValueChangeEvent vce) {
    }

    public String open_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.
        return "AddComponentToFluidDB";
    }

    public void densityC6TextField_processValueChange(ValueChangeEvent vce) {
    }

    public String button1_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.
        return null;
    }

    public boolean isDoUsePlusFraction() {
        RowKey rk = fieldsFluidDataProvider.getCursorRow();
        if (fieldsFluidDataProvider.getValue("FLUIDINFO.HASPLUSFRACTION", rk).toString().equals("1")) {
            return true;
        } else {
            return false;
        }
    }

    public void setDoUsePlusFraction(boolean usePlusFraction2) {
        if (usePlusFraction2) {
            RowKey rk = fieldsFluidDataProvider.getCursorRow();
            fieldsFluidDataProvider.setValue("FLUIDINFO.HASPLUSFRACTION", rk, "1");
        } else {
            RowKey rk = fieldsFluidDataProvider.getCursorRow();
            fieldsFluidDataProvider.setValue("FLUIDINFO.HASPLUSFRACTION", rk, "0");
        }
        fieldsFluidDataProvider.commitChanges();
        fieldsFluidDataProvider.refresh();
    }

    public String linkAction2_action() {
        saveFluid();
        return "ToFluidExperimentalData";
    }

    public String linkAction1_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.
        saveFluid();
        return "ToPVTdataPage";
    }

    public void nc11TextField_processValueChange(ValueChangeEvent event) {
    }

    public void c22TextField2_processValueChange(ValueChangeEvent vce) {
    }

    public void densityC23TextField3_processValueChange(ValueChangeEvent vce) {
    }
}

