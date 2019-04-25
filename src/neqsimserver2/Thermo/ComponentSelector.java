/*
 * ComponentSelector.java
 *
 * Created on 7. juli 2004, 22:27
 * Copyright Even Solbraa
 */
package neqsimserver2.Thermo;

import com.sun.data.provider.RowKey;

import javax.faces.*;

import com.sun.jsfcl.app.*;

import javax.faces.component.html.*;

import javax.faces.convert.*;

import javax.faces.validator.*;

import javax.faces.event.*;

import com.sun.rave.web.ui.component.TextField;

import com.sun.rave.web.ui.component.Message;

import com.sun.rave.web.ui.component.Button;

import com.sun.rave.web.ui.component.StaticText;

import com.sun.data.provider.impl.CachedRowSetDataProvider;

public class ComponentSelector extends AbstractPageBean {

    // <editor-fold defaultstate="collapsed" desc="Creator-managed Component
    // Definition">
    private int __placeholder;
    private HtmlOutputText methaneTextID = new HtmlOutputText();

    public HtmlOutputText getMethaneTextID() {

        return methaneTextID;

    }

    public void setMethaneTextID(HtmlOutputText hot) {

        this.methaneTextID = hot;

    }
    private HtmlOutputText ethaneTextID = new HtmlOutputText();

    public HtmlOutputText getEthaneTextID() {

        return ethaneTextID;

    }

    public void setEthaneTextID(HtmlOutputText hot) {

        this.ethaneTextID = hot;

    }
    private HtmlOutputText propaneTextID = new HtmlOutputText();

    public HtmlOutputText getPropaneTextID() {

        return propaneTextID;

    }

    public void setPropaneTextID(HtmlOutputText hot) {

        this.propaneTextID = hot;

    }
    private HtmlOutputText ibutaneTextID = new HtmlOutputText();

    public HtmlOutputText getIbutaneTextID() {

        return ibutaneTextID;

    }

    public void setIbutaneTextID(HtmlOutputText hot) {

        this.ibutaneTextID = hot;

    }
    private HtmlOutputText nbutaneTextID = new HtmlOutputText();

    public HtmlOutputText getNbutaneTextID() {

        return nbutaneTextID;

    }

    public void setNbutaneTextID(HtmlOutputText hot) {

        this.nbutaneTextID = hot;

    }
    private HtmlOutputText pentaneTextID = new HtmlOutputText();

    public HtmlOutputText getPentaneTextID() {

        return pentaneTextID;

    }

    public void setPentaneTextID(HtmlOutputText hot) {

        this.pentaneTextID = hot;

    }
    private HtmlOutputText waterTextID = new HtmlOutputText();

    public HtmlOutputText getWaterTextID() {

        return waterTextID;

    }

    public void setWaterTextID(HtmlOutputText hot) {

        this.waterTextID = hot;

    }
    private HtmlOutputText hexaneTextID = new HtmlOutputText();

    public HtmlOutputText getHexaneTextID() {

        return hexaneTextID;

    }

    public void setHexaneTextID(HtmlOutputText hot) {

        this.hexaneTextID = hot;

    }
    private HtmlInputText methaneTextField = new HtmlInputText();

    public HtmlInputText getMethaneTextField() {

        return methaneTextField;

    }

    public void setMethaneTextField(HtmlInputText hit) {

        this.methaneTextField = hit;

    }
    private HtmlInputText ethaneTextField = new HtmlInputText();

    public HtmlInputText getEthaneTextField() {

        return ethaneTextField;

    }

    public void setEthaneTextField(HtmlInputText hit) {

        this.ethaneTextField = hit;

    }
    private HtmlInputText propaneTextField = new HtmlInputText();

    public HtmlInputText getPropaneTextField() {

        return propaneTextField;

    }

    public void setPropaneTextField(HtmlInputText hit) {

        this.propaneTextField = hit;

    }
    private HtmlInputText nbutaneTextField = new HtmlInputText();

    public HtmlInputText getNbutaneTextField() {

        return nbutaneTextField;

    }

    public void setNbutaneTextField(HtmlInputText hit) {

        this.nbutaneTextField = hit;

    }
    private HtmlInputText pentaneTextField = new HtmlInputText();

    public HtmlInputText getPentaneTextField() {

        return pentaneTextField;

    }

    public void setPentaneTextField(HtmlInputText hit) {

        this.pentaneTextField = hit;

    }
    private HtmlInputText hexaneTextField = new HtmlInputText();

    public HtmlInputText getHexaneTextField() {

        return hexaneTextField;

    }

    public void setHexaneTextField(HtmlInputText hit) {

        this.hexaneTextField = hit;

    }
    private HtmlOutputText carbondioxTextID = new HtmlOutputText();

    public HtmlOutputText getCarbondioxTextID() {

        return carbondioxTextID;

    }

    public void setCarbondioxTextID(HtmlOutputText hot) {

        this.carbondioxTextID = hot;

    }
    private HtmlOutputText nitrogenTextID = new HtmlOutputText();

    public HtmlOutputText getNitrogenTextID() {

        return nitrogenTextID;

    }

    public void setNitrogenTextID(HtmlOutputText hot) {

        this.nitrogenTextID = hot;

    }
    private HtmlInputText carbonDioxideTextField = new HtmlInputText();

    public HtmlInputText getCarbonDioxideTextField() {

        return carbonDioxideTextField;

    }

    public void setCarbonDioxideTextField(HtmlInputText hit) {

        this.carbonDioxideTextField = hit;

    }
    private HtmlInputText nitrogenTextField = new HtmlInputText();

    public HtmlInputText getNitrogenTextField() {

        return nitrogenTextField;

    }

    public void setNitrogenTextField(HtmlInputText hit) {

        this.nitrogenTextField = hit;

    }
    private HtmlInputText waterTextField = new HtmlInputText();

    public HtmlInputText getWaterTextField() {

        return waterTextField;

    }

    public void setWaterTextField(HtmlInputText hit) {

        this.waterTextField = hit;

    }
    private HtmlInputText ibutaneTextField = new HtmlInputText();

    public HtmlInputText getIbutaneTextField() {

        return ibutaneTextField;

    }

    public void setIbutaneTextField(HtmlInputText hit) {

        this.ibutaneTextField = hit;

    }
    private HtmlCommandButton calculateButton = new HtmlCommandButton();

    public HtmlCommandButton getCalculateButton() {

        return calculateButton;

    }

    public void setCalculateButton(HtmlCommandButton hcb) {

        this.calculateButton = hcb;

    }
    private HtmlOutputText standardCompText = new HtmlOutputText();

    public HtmlOutputText getStandardCompText() {

        return standardCompText;

    }

    public void setStandardCompText(HtmlOutputText hot) {

        this.standardCompText = hot;

    }
    private HtmlOutputText polarComponentName = new HtmlOutputText();

    public HtmlOutputText getPolarComponentName() {

        return polarComponentName;

    }

    public void setPolarComponentName(HtmlOutputText hot) {

        this.polarComponentName = hot;

    }
    private HtmlOutputText megTextID = new HtmlOutputText();

    public HtmlOutputText getMegTextID() {

        return megTextID;

    }

    public void setMegTextID(HtmlOutputText hot) {

        this.megTextID = hot;

    }
    private HtmlInputText megTextField = new HtmlInputText();

    public HtmlInputText getMegTextField() {

        return megTextField;

    }

    public void setMegTextField(HtmlInputText hit) {

        this.megTextField = hit;

    }
    private HtmlOutputText tegTextID = new HtmlOutputText();

    public HtmlOutputText getTegTextID() {

        return tegTextID;

    }

    public void setTegTextID(HtmlOutputText hot) {

        this.tegTextID = hot;

    }
    private HtmlInputText tegTextField = new HtmlInputText();

    public HtmlInputText getTegTextField() {

        return tegTextField;

    }

    public void setTegTextField(HtmlInputText hit) {

        this.tegTextField = hit;

    }
    private HtmlOutputText degTextID = new HtmlOutputText();

    public HtmlOutputText getDegTextID() {

        return degTextID;

    }

    public void setDegTextID(HtmlOutputText hot) {

        this.degTextID = hot;

    }
    private HtmlInputText degTextField = new HtmlInputText();

    public HtmlInputText getDegTextField() {

        return degTextField;

    }

    public void setDegTextField(HtmlInputText hit) {

        this.degTextField = hit;

    }
    private HtmlOutputText mdeaTextID = new HtmlOutputText();

    public HtmlOutputText getMdeaTextID() {

        return mdeaTextID;

    }

    public void setMdeaTextID(HtmlOutputText hot) {

        this.mdeaTextID = hot;

    }
    private HtmlInputText mdeaTextField = new HtmlInputText();

    public HtmlInputText getMdeaTextField() {

        return mdeaTextField;

    }

    public void setMdeaTextField(HtmlInputText hit) {

        this.mdeaTextField = hit;

    }
    private HtmlOutputText methanolTextID = new HtmlOutputText();

    public HtmlOutputText getMethanolTextID() {

        return methanolTextID;

    }

    public void setMethanolTextID(HtmlOutputText hot) {

        this.methanolTextID = hot;

    }
    private HtmlInputText methanolTextField = new HtmlInputText();

    public HtmlInputText getMethanolTextField() {

        return methanolTextField;

    }

    public void setMethanolTextField(HtmlInputText hit) {

        this.methanolTextField = hit;

    }
    private HtmlOutputText molprsectext = new HtmlOutputText();

    public HtmlOutputText getMolprsectext() {

        return molprsectext;

    }

    public void setMolprsectext(HtmlOutputText hot) {

        this.molprsectext = hot;

    }
    private HtmlOutputText molprsectext1 = new HtmlOutputText();

    public HtmlOutputText getMolprsectext1() {

        return molprsectext1;

    }

    public void setMolprsectext1(HtmlOutputText hot) {

        this.molprsectext1 = hot;

    }
    private HtmlOutputText heavyCompText = new HtmlOutputText();

    public HtmlOutputText getHeavyCompText() {

        return heavyCompText;

    }

    public void setHeavyCompText(HtmlOutputText hot) {

        this.heavyCompText = hot;

    }
    private HtmlOutputText molprsectext2 = new HtmlOutputText();

    public HtmlOutputText getMolprsectext2() {

        return molprsectext2;

    }

    public void setMolprsectext2(HtmlOutputText hot) {

        this.molprsectext2 = hot;

    }
    private HtmlOutputText c6TextID = new HtmlOutputText();

    public HtmlOutputText getC6TextID() {

        return c6TextID;

    }

    public void setC6TextID(HtmlOutputText hot) {

        this.c6TextID = hot;

    }
    private HtmlInputText c6TextField = new HtmlInputText();

    public HtmlInputText getC6TextField() {

        return c6TextField;

    }

    public void setC6TextField(HtmlInputText hit) {

        this.c6TextField = hit;

    }
    private HtmlOutputText molmasstext = new HtmlOutputText();

    public HtmlOutputText getMolmasstext() {

        return molmasstext;

    }

    public void setMolmasstext(HtmlOutputText hot) {

        this.molmasstext = hot;

    }
    private HtmlInputText molarMassC6TextField = new HtmlInputText();

    public HtmlInputText getMolarMassC6TextField() {

        return molarMassC6TextField;

    }

    public void setMolarMassC6TextField(HtmlInputText hit) {

        this.molarMassC6TextField = hit;

    }
    private HtmlOutputText densitytext = new HtmlOutputText();

    public HtmlOutputText getDensitytext() {

        return densitytext;

    }

    public void setDensitytext(HtmlOutputText hot) {

        this.densitytext = hot;

    }
    private HtmlInputText densityC6TextField = new HtmlInputText();

    public HtmlInputText getDensityC6TextField() {

        return densityC6TextField;

    }

    public void setDensityC6TextField(HtmlInputText hit) {

        this.densityC6TextField = hit;

    }
    private HtmlOutputText c7TextID = new HtmlOutputText();

    public HtmlOutputText getC7TextID() {

        return c7TextID;

    }

    public void setC7TextID(HtmlOutputText hot) {

        this.c7TextID = hot;

    }
    private HtmlInputText c7TextField = new HtmlInputText();

    public HtmlInputText getC7TextField() {

        return c7TextField;

    }

    public void setC7TextField(HtmlInputText hit) {

        this.c7TextField = hit;

    }
    private HtmlInputText molarMassC7TextField = new HtmlInputText();

    public HtmlInputText getMolarMassC7TextField() {

        return molarMassC7TextField;

    }

    public void setMolarMassC7TextField(HtmlInputText hit) {

        this.molarMassC7TextField = hit;

    }
    private HtmlInputText densityC7TextField = new HtmlInputText();

    public HtmlInputText getDensityC7TextField() {

        return densityC7TextField;

    }

    public void setDensityC7TextField(HtmlInputText hit) {

        this.densityC7TextField = hit;

    }
    private HtmlOutputText c8TextID = new HtmlOutputText();

    public HtmlOutputText getC8TextID() {

        return c8TextID;

    }

    public void setC8TextID(HtmlOutputText hot) {

        this.c8TextID = hot;

    }
    private HtmlInputText c8TextField = new HtmlInputText();

    public HtmlInputText getC8TextField() {

        return c8TextField;

    }

    public void setC8TextField(HtmlInputText hit) {

        this.c8TextField = hit;

    }
    private HtmlInputText molarMassC8TextField = new HtmlInputText();

    public HtmlInputText getMolarMassC8TextField() {

        return molarMassC8TextField;

    }

    public void setMolarMassC8TextField(HtmlInputText hit) {

        this.molarMassC8TextField = hit;

    }
    private HtmlInputText densityC8TextField = new HtmlInputText();

    public HtmlInputText getDensityC8TextField() {

        return densityC8TextField;

    }

    public void setDensityC8TextField(HtmlInputText hit) {

        this.densityC8TextField = hit;

    }
    private HtmlOutputText c9TextID = new HtmlOutputText();

    public HtmlOutputText getC9TextID() {

        return c9TextID;

    }

    public void setC9TextID(HtmlOutputText hot) {

        this.c9TextID = hot;

    }
    private HtmlInputText c9TextField = new HtmlInputText();

    public HtmlInputText getC9TextField() {

        return c9TextField;

    }

    public void setC9TextField(HtmlInputText hit) {

        this.c9TextField = hit;

    }
    private HtmlInputText molarMassC9TextField = new HtmlInputText();

    public HtmlInputText getMolarMassC9TextField() {

        return molarMassC9TextField;

    }

    public void setMolarMassC9TextField(HtmlInputText hit) {

        this.molarMassC9TextField = hit;

    }
    private HtmlInputText densityC9TextField = new HtmlInputText();

    public HtmlInputText getDensityC9TextField() {

        return densityC9TextField;

    }

    public void setDensityC9TextField(HtmlInputText hit) {

        this.densityC9TextField = hit;

    }
    private HtmlOutputText c10TextID = new HtmlOutputText();

    public HtmlOutputText getC10TextID() {

        return c10TextID;

    }

    public void setC10TextID(HtmlOutputText hot) {

        this.c10TextID = hot;

    }
    private HtmlInputText c10TextField = new HtmlInputText();

    public HtmlInputText getC10TextField() {

        return c10TextField;

    }

    public void setC10TextField(HtmlInputText hit) {

        this.c10TextField = hit;

    }
    private HtmlInputText molarMassC10TextField = new HtmlInputText();

    public HtmlInputText getMolarMassC10TextField() {

        return molarMassC10TextField;

    }

    public void setMolarMassC10TextField(HtmlInputText hit) {

        this.molarMassC10TextField = hit;

    }
    private HtmlInputText densityC10TextField = new HtmlInputText();

    public HtmlInputText getDensityC10TextField() {

        return densityC10TextField;

    }

    public void setDensityC10TextField(HtmlInputText hit) {

        this.densityC10TextField = hit;

    }
    private HtmlOutputText c11TextID = new HtmlOutputText();

    public HtmlOutputText getC11TextID() {

        return c11TextID;

    }

    public void setC11TextID(HtmlOutputText hot) {

        this.c11TextID = hot;

    }
    private HtmlInputText c11TextField = new HtmlInputText();

    public HtmlInputText getC11TextField() {

        return c11TextField;

    }

    public void setC11TextField(HtmlInputText hit) {

        this.c11TextField = hit;

    }
    private HtmlInputText molarMassC11TextField = new HtmlInputText();

    public HtmlInputText getMolarMassC11TextField() {

        return molarMassC11TextField;

    }

    public void setMolarMassC11TextField(HtmlInputText hit) {

        this.molarMassC11TextField = hit;

    }
    private HtmlInputText densityC11TextField = new HtmlInputText();

    public HtmlInputText getDensityC11TextField() {

        return densityC11TextField;

    }

    public void setDensityC11TextField(HtmlInputText hit) {

        this.densityC11TextField = hit;

    }
    private HtmlOutputText c12TextID = new HtmlOutputText();

    public HtmlOutputText getC12TextID() {

        return c12TextID;

    }

    public void setC12TextID(HtmlOutputText hot) {

        this.c12TextID = hot;

    }
    private HtmlInputText c12TextField = new HtmlInputText();

    public HtmlInputText getC12TextField() {

        return c12TextField;

    }

    public void setC12TextField(HtmlInputText hit) {

        this.c12TextField = hit;

    }
    private HtmlInputText molarMassC12TextField = new HtmlInputText();

    public HtmlInputText getMolarMassC12TextField() {

        return molarMassC12TextField;

    }

    public void setMolarMassC12TextField(HtmlInputText hit) {

        this.molarMassC12TextField = hit;

    }
    private HtmlInputText densityC12TextField = new HtmlInputText();

    public HtmlInputText getDensityC12TextField() {

        return densityC12TextField;

    }

    public void setDensityC12TextField(HtmlInputText hit) {

        this.densityC12TextField = hit;

    }
    private HtmlOutputText c13TextID = new HtmlOutputText();

    public HtmlOutputText getC13TextID() {

        return c13TextID;

    }

    public void setC13TextID(HtmlOutputText hot) {

        this.c13TextID = hot;

    }
    private HtmlInputText c13TextField = new HtmlInputText();

    public HtmlInputText getC13TextField() {

        return c13TextField;

    }

    public void setC13TextField(HtmlInputText hit) {

        this.c13TextField = hit;

    }
    private HtmlInputText molarMassC13TextField = new HtmlInputText();

    public HtmlInputText getMolarMassC13TextField() {

        return molarMassC13TextField;

    }

    public void setMolarMassC13TextField(HtmlInputText hit) {

        this.molarMassC13TextField = hit;

    }
    private HtmlInputText densityC13TextField = new HtmlInputText();

    public HtmlInputText getDensityC13TextField() {

        return densityC13TextField;

    }

    public void setDensityC13TextField(HtmlInputText hit) {

        this.densityC13TextField = hit;

    }
    private HtmlOutputText plusFracTextID = new HtmlOutputText();

    public HtmlOutputText getPlusFracTextID() {

        return plusFracTextID;

    }

    public void setPlusFracTextID(HtmlOutputText hot) {

        this.plusFracTextID = hot;

    }
    private HtmlInputText plusFractionTextField = new HtmlInputText();

    public HtmlInputText getPlusFractionTextField() {

        return plusFractionTextField;

    }

    public void setPlusFractionTextField(HtmlInputText hit) {

        this.plusFractionTextField = hit;

    }
    private HtmlInputText molarMassPlusFractionTextField = new HtmlInputText();

    public HtmlInputText getMolarMassPlusFractionTextField() {

        return molarMassPlusFractionTextField;

    }

    public void setMolarMassPlusFractionTextField(HtmlInputText hit) {

        this.molarMassPlusFractionTextField = hit;

    }
    private HtmlInputText densityPlusFractionTextField = new HtmlInputText();

    public HtmlInputText getDensityPlusFractionTextField() {

        return densityPlusFractionTextField;

    }

    public void setDensityPlusFractionTextField(HtmlInputText hit) {

        this.densityPlusFractionTextField = hit;

    }
    private TextField benzeneTextField = new TextField();

    public TextField getBenzeneTextField() {

        return benzeneTextField;

    }

    public void setBenzeneTextField(TextField tf) {

        this.benzeneTextField = tf;

    }
    private DoubleConverter doubleConverter1 = new DoubleConverter();

    public DoubleConverter getDoubleConverter1() {

        return doubleConverter1;

    }

    public void setDoubleConverter1(DoubleConverter dc) {

        this.doubleConverter1 = dc;

    }
    private HtmlOutputText armoathicHCText = new HtmlOutputText();

    public HtmlOutputText getArmoathicHCText() {

        return armoathicHCText;

    }

    public void setArmoathicHCText(HtmlOutputText hot) {

        this.armoathicHCText = hot;

    }
    private TextField tolueneTextField = new TextField();

    public TextField getTolueneTextField() {

        return tolueneTextField;

    }

    public void setTolueneTextField(TextField tf) {

        this.tolueneTextField = tf;

    }
    private Message message1 = new Message();

    public Message getMessage1() {

        return message1;

    }

    public void setMessage1(Message m) {

        this.message1 = m;

    }
    private Message message2 = new Message();

    public Message getMessage2() {

        return message2;

    }

    public void setMessage2(Message m) {

        this.message2 = m;

    }
    private TextField mxyleneTextField = new TextField();

    public TextField getMxyleneTextField() {

        return mxyleneTextField;

    }

    public void setMxyleneTextField(TextField tf) {

        this.mxyleneTextField = tf;

    }
    private DoubleRangeValidator doubleRangeValidator1 = new DoubleRangeValidator();

    public DoubleRangeValidator getDoubleRangeValidator1() {

        return doubleRangeValidator1;

    }

    public void setDoubleRangeValidator1(DoubleRangeValidator drv) {

        this.doubleRangeValidator1 = drv;

    }
    private HtmlOutputText componentTextID = new HtmlOutputText();

    public HtmlOutputText getComponentTextID() {

        return componentTextID;

    }

    public void setComponentTextID(HtmlOutputText hot) {

        this.componentTextID = hot;

    }
    private HtmlOutputText componentTextID1 = new HtmlOutputText();

    public HtmlOutputText getComponentTextID1() {

        return componentTextID1;

    }

    public void setComponentTextID1(HtmlOutputText hot) {

        this.componentTextID1 = hot;

    }
    private HtmlOutputText componentTextID2 = new HtmlOutputText();

    public HtmlOutputText getComponentTextID2() {

        return componentTextID2;

    }

    public void setComponentTextID2(HtmlOutputText hot) {

        this.componentTextID2 = hot;

    }
    private HtmlOutputText componentTextID3 = new HtmlOutputText();

    public HtmlOutputText getComponentTextID3() {

        return componentTextID3;

    }

    public void setComponentTextID3(HtmlOutputText hot) {

        this.componentTextID3 = hot;

    }
    private TextField pxyleneTextField = new TextField();

    public TextField getPxyleneTextField() {

        return pxyleneTextField;

    }

    public void setPxyleneTextField(TextField tf) {

        this.pxyleneTextField = tf;

    }
    private HtmlOutputText componentTextID4 = new HtmlOutputText();

    public HtmlOutputText getComponentTextID4() {

        return componentTextID4;

    }

    public void setComponentTextID4(HtmlOutputText hot) {

        this.componentTextID4 = hot;

    }
    private TextField oxyleneTextField = new TextField();

    public TextField getOxyleneTextField() {

        return oxyleneTextField;

    }

    public void setOxyleneTextField(TextField tf) {

        this.oxyleneTextField = tf;

    }
    private Message message3 = new Message();

    public Message getMessage3() {

        return message3;

    }

    public void setMessage3(Message m) {

        this.message3 = m;

    }
    private Message message4 = new Message();

    public Message getMessage4() {

        return message4;

    }

    public void setMessage4(Message m) {

        this.message4 = m;

    }
    private Message message5 = new Message();

    public Message getMessage5() {

        return message5;

    }

    public void setMessage5(Message m) {

        this.message5 = m;

    }
    private Message message6 = new Message();

    public Message getMessage6() {

        return message6;

    }

    public void setMessage6(Message m) {

        this.message6 = m;

    }
    private Message message7 = new Message();

    public Message getMessage7() {

        return message7;

    }

    public void setMessage7(Message m) {

        this.message7 = m;

    }
    private Message message8 = new Message();

    public Message getMessage8() {

        return message8;

    }

    public void setMessage8(Message m) {

        this.message8 = m;

    }
    private Message message9 = new Message();

    public Message getMessage9() {

        return message9;

    }

    public void setMessage9(Message m) {

        this.message9 = m;

    }
    private Message message10 = new Message();

    public Message getMessage10() {

        return message10;

    }

    public void setMessage10(Message m) {

        this.message10 = m;

    }
    private Message message11 = new Message();

    public Message getMessage11() {

        return message11;

    }

    public void setMessage11(Message m) {

        this.message11 = m;

    }
    private Message message12 = new Message();

    public Message getMessage12() {

        return message12;

    }

    public void setMessage12(Message m) {

        this.message12 = m;

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
    private Message message15 = new Message();

    public Message getMessage15() {

        return message15;

    }

    public void setMessage15(Message m) {

        this.message15 = m;

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
    private Message message18 = new Message();

    public Message getMessage18() {

        return message18;

    }

    public void setMessage18(Message m) {

        this.message18 = m;

    }
    private Message message19 = new Message();

    public Message getMessage19() {

        return message19;

    }

    public void setMessage19(Message m) {

        this.message19 = m;

    }
    private Message message20 = new Message();

    public Message getMessage20() {

        return message20;

    }

    public void setMessage20(Message m) {

        this.message20 = m;

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
    private Message message23 = new Message();

    public Message getMessage23() {

        return message23;

    }

    public void setMessage23(Message m) {

        this.message23 = m;

    }
    private Message message24 = new Message();

    public Message getMessage24() {

        return message24;

    }

    public void setMessage24(Message m) {

        this.message24 = m;

    }
    private Message message25 = new Message();

    public Message getMessage25() {

        return message25;

    }

    public void setMessage25(Message m) {

        this.message25 = m;

    }
    private Message message26 = new Message();

    public Message getMessage26() {

        return message26;

    }

    public void setMessage26(Message m) {

        this.message26 = m;

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
    private Message message29 = new Message();

    public Message getMessage29() {

        return message29;

    }

    public void setMessage29(Message m) {

        this.message29 = m;

    }
    private HtmlOutputText aminesName = new HtmlOutputText();

    public HtmlOutputText getAminesName() {

        return aminesName;

    }

    public void setAminesName(HtmlOutputText hot) {

        this.aminesName = hot;

    }
    private HtmlOutputText pzTextID = new HtmlOutputText();

    public HtmlOutputText getPzTextID() {

        return pzTextID;

    }

    public void setPzTextID(HtmlOutputText hot) {

        this.pzTextID = hot;

    }
    private HtmlInputText piperazineTextField = new HtmlInputText();

    public HtmlInputText getPiperazineTextField() {

        return piperazineTextField;

    }

    public void setPiperazineTextField(HtmlInputText hit) {

        this.piperazineTextField = hit;

    }
    private Message message30 = new Message();

    public Message getMessage30() {

        return message30;

    }

    public void setMessage30(Message m) {

        this.message30 = m;

    }
    private HtmlOutputText acidsName = new HtmlOutputText();

    public HtmlOutputText getAcidsName() {

        return acidsName;

    }

    public void setAcidsName(HtmlOutputText hot) {

        this.acidsName = hot;

    }
    private HtmlOutputText aceticAcidTextID = new HtmlOutputText();

    public HtmlOutputText getAceticAcidTextID() {

        return aceticAcidTextID;

    }

    public void setAceticAcidTextID(HtmlOutputText hot) {

        this.aceticAcidTextID = hot;

    }
    private HtmlInputText aceticAcidTextField = new HtmlInputText();

    public HtmlInputText getAceticAcidTextField() {

        return aceticAcidTextField;

    }

    public void setAceticAcidTextField(HtmlInputText hit) {

        this.aceticAcidTextField = hit;

    }
    private Message message31 = new Message();

    public Message getMessage31() {

        return message31;

    }

    public void setMessage31(Message m) {

        this.message31 = m;

    }
    private HtmlOutputText propionicAcidTextID = new HtmlOutputText();

    public HtmlOutputText getPropionicAcidTextID() {

        return propionicAcidTextID;

    }

    public void setPropionicAcidTextID(HtmlOutputText hot) {

        this.propionicAcidTextID = hot;

    }
    private HtmlInputText propionicAcidTextField = new HtmlInputText();

    public HtmlInputText getPropionicAcidTextField() {

        return propionicAcidTextField;

    }

    public void setPropionicAcidTextField(HtmlInputText hit) {

        this.propionicAcidTextField = hit;

    }
    private Message message32 = new Message();

    public Message getMessage32() {

        return message32;

    }

    public void setMessage32(Message m) {

        this.message32 = m;

    }
    private HtmlOutputText slatsName = new HtmlOutputText();

    public HtmlOutputText getSlatsName() {

        return slatsName;

    }

    public void setSlatsName(HtmlOutputText hot) {

        this.slatsName = hot;

    }
    private HtmlOutputText naTextID1 = new HtmlOutputText();

    public HtmlOutputText getNaTextID1() {

        return naTextID1;

    }

    public void setNaTextID1(HtmlOutputText hot) {

        this.naTextID1 = hot;

    }
    private HtmlInputText naplusTextField1 = new HtmlInputText();

    public HtmlInputText getNaplusTextField1() {

        return naplusTextField1;

    }

    public void setNaplusTextField1(HtmlInputText hit) {

        this.naplusTextField1 = hit;

    }
    private Message message33 = new Message();

    public Message getMessage33() {

        return message33;

    }

    public void setMessage33(Message m) {

        this.message33 = m;

    }
    private HtmlOutputText feTextID2 = new HtmlOutputText();

    public HtmlOutputText getFeTextID2() {

        return feTextID2;

    }

    public void setFeTextID2(HtmlOutputText hot) {

        this.feTextID2 = hot;

    }
    private HtmlInputText feplusplusTextField2 = new HtmlInputText();

    public HtmlInputText getFeplusplusTextField2() {

        return feplusplusTextField2;

    }

    public void setFeplusplusTextField2(HtmlInputText hit) {

        this.feplusplusTextField2 = hit;

    }
    private Message message34 = new Message();

    public Message getMessage34() {

        return message34;

    }

    public void setMessage34(Message m) {

        this.message34 = m;

    }
    private HtmlOutputText clTextID1 = new HtmlOutputText();

    public HtmlOutputText getClTextID1() {

        return clTextID1;

    }

    public void setClTextID1(HtmlOutputText hot) {

        this.clTextID1 = hot;

    }
    private HtmlInputText clMinusTextField1 = new HtmlInputText();

    public HtmlInputText getClMinusTextField1() {

        return clMinusTextField1;

    }

    public void setClMinusTextField1(HtmlInputText hit) {

        this.clMinusTextField1 = hit;

    }
    private Message message35 = new Message();

    public Message getMessage35() {

        return message35;

    }

    public void setMessage35(Message m) {

        this.message35 = m;

    }
    private HtmlOutputText caTextID1 = new HtmlOutputText();

    public HtmlOutputText getCaTextID1() {

        return caTextID1;

    }

    public void setCaTextID1(HtmlOutputText hot) {

        this.caTextID1 = hot;

    }
    private HtmlInputText caplusplusTextField1 = new HtmlInputText();

    public HtmlInputText getCaplusplusTextField1() {

        return caplusplusTextField1;

    }

    public void setCaplusplusTextField1(HtmlInputText hit) {

        this.caplusplusTextField1 = hit;

    }
    private Message message36 = new Message();

    public Message getMessage36() {

        return message36;

    }

    public void setMessage36(Message m) {

        this.message36 = m;

    }
    private HtmlOutputText clTextID2 = new HtmlOutputText();

    public HtmlOutputText getClTextID2() {

        return clTextID2;

    }

    public void setClTextID2(HtmlOutputText hot) {

        this.clTextID2 = hot;

    }
    private HtmlInputText co3MinusTextField2 = new HtmlInputText();

    public HtmlInputText getCo3MinusTextField2() {

        return co3MinusTextField2;

    }

    public void setCo3MinusTextField2(HtmlInputText hit) {

        this.co3MinusTextField2 = hit;

    }
    private Message message37 = new Message();

    public Message getMessage37() {

        return message37;

    }

    public void setMessage37(Message m) {

        this.message37 = m;

    }
    private HtmlOutputText ohTextID3 = new HtmlOutputText();

    public HtmlOutputText getOhTextID3() {

        return ohTextID3;

    }

    public void setOhTextID3(HtmlOutputText hot) {

        this.ohTextID3 = hot;

    }
    private HtmlInputText ohMinusTexField1 = new HtmlInputText();

    public HtmlInputText getOhMinusTexField1() {

        return ohMinusTexField1;

    }

    public void setOhMinusTexField1(HtmlInputText hit) {

        this.ohMinusTexField1 = hit;

    }
    private Message message39 = new Message();

    public Message getMessage39() {

        return message39;

    }

    public void setMessage39(Message m) {

        this.message39 = m;

    }
    private HtmlInputText fluidTextField1 = new HtmlInputText();

    public HtmlInputText getFluidTextField1() {

        return fluidTextField1;

    }

    public void setFluidTextField1(HtmlInputText hit) {

        this.fluidTextField1 = hit;

    }
    private HtmlInputText testTextField1 = new HtmlInputText();

    public HtmlInputText getTestTextField1() {

        return testTextField1;

    }

    public void setTestTextField1(HtmlInputText hit) {

        this.testTextField1 = hit;

    }
    private HtmlInputTextarea historyTextArea = new HtmlInputTextarea();

    public HtmlInputTextarea getHistoryTextArea() {

        return historyTextArea;

    }

    public void setHistoryTextArea(HtmlInputTextarea hit) {

        this.historyTextArea = hit;

    }
    private HtmlInputText testTextField2 = new HtmlInputText();

    public HtmlInputText getTestTextField2() {

        return testTextField2;

    }

    public void setTestTextField2(HtmlInputText hit) {

        this.testTextField2 = hit;

    }
    private HtmlInputText wellTextField1 = new HtmlInputText();

    public HtmlInputText getWellTextField1() {

        return wellTextField1;

    }

    public void setWellTextField1(HtmlInputText hit) {

        this.wellTextField1 = hit;

    }
    private HtmlOutputText outputText2 = new HtmlOutputText();

    public HtmlOutputText getOutputText2() {

        return outputText2;

    }

    public void setOutputText2(HtmlOutputText hot) {

        this.outputText2 = hot;

    }
    private HtmlOutputText outputText3 = new HtmlOutputText();

    public HtmlOutputText getOutputText3() {

        return outputText3;

    }

    public void setOutputText3(HtmlOutputText hot) {

        this.outputText3 = hot;

    }
    private HtmlOutputText outputText4 = new HtmlOutputText();

    public HtmlOutputText getOutputText4() {

        return outputText4;

    }

    public void setOutputText4(HtmlOutputText hot) {

        this.outputText4 = hot;

    }
    private HtmlOutputText outputText5 = new HtmlOutputText();

    public HtmlOutputText getOutputText5() {

        return outputText5;

    }

    public void setOutputText5(HtmlOutputText hot) {

        this.outputText5 = hot;

    }
    private HtmlInputText sampleTextField1 = new HtmlInputText();

    public HtmlInputText getSampleTextField1() {

        return sampleTextField1;

    }

    public void setSampleTextField1(HtmlInputText hit) {

        this.sampleTextField1 = hit;

    }
    private HtmlOutputText outputText6 = new HtmlOutputText();

    public HtmlOutputText getOutputText6() {

        return outputText6;

    }

    public void setOutputText6(HtmlOutputText hot) {

        this.outputText6 = hot;

    }
    private Button open = new Button();

    public Button getOpen() {

        return open;

    }

    public void setOpen(Button b) {

        this.open = b;

    }
    private Button saveButton = new Button();

    public Button getSaveButton() {

        return saveButton;

    }

    public void setSaveButton(Button b) {

        this.saveButton = b;

    }
    private HtmlCommandLink linkAction1 = new HtmlCommandLink();

    public HtmlCommandLink getLinkAction1() {

        return linkAction1;

    }

    public void setLinkAction1(HtmlCommandLink hcl) {

        this.linkAction1 = hcl;

    }
    private HtmlOutputText linkAction1Text = new HtmlOutputText();

    public HtmlOutputText getLinkAction1Text() {

        return linkAction1Text;

    }

    public void setLinkAction1Text(HtmlOutputText hot) {

        this.linkAction1Text = hot;

    }
    private HtmlOutputText testoutputText = new HtmlOutputText();

    public HtmlOutputText getTestoutputText() {

        return testoutputText;

    }

    public void setTestoutputText(HtmlOutputText hot) {

        this.testoutputText = hot;

    }
    private HtmlOutputText componentTextID5 = new HtmlOutputText();

    public HtmlOutputText getComponentTextID5() {

        return componentTextID5;

    }

    public void setComponentTextID5(HtmlOutputText hot) {

        this.componentTextID5 = hot;

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
    private StaticText staticText3 = new StaticText();

    public StaticText getStaticText3() {

        return staticText3;

    }

    public void setStaticText3(StaticText st) {

        this.staticText3 = st;

    }
    private StaticText staticText4 = new StaticText();

    public StaticText getStaticText4() {

        return staticText4;

    }

    public void setStaticText4(StaticText st) {

        this.staticText4 = st;

    }
    private TextField nheptaneTextField = new TextField();

    public TextField getNheptaneTextField() {

        return nheptaneTextField;

    }

    public void setNheptaneTextField(TextField tf) {

        this.nheptaneTextField = tf;

    }
    private TextField noctaneTextField = new TextField();

    public TextField getNoctaneTextField() {

        return noctaneTextField;

    }

    public void setNoctaneTextField(TextField tf) {

        this.noctaneTextField = tf;

    }
    private TextField nnonaneTextField = new TextField();

    public TextField getNnonaneTextField() {

        return nnonaneTextField;

    }

    public void setNnonaneTextField(TextField tf) {

        this.nnonaneTextField = tf;

    }
    private TextField ndecaneTextField = new TextField();

    public TextField getNdecaneTextField() {

        return ndecaneTextField;

    }

    public void setNdecaneTextField(TextField tf) {

        this.ndecaneTextField = tf;

    }
    private TextField cc5TextField = new TextField();

    public TextField getCc5TextField() {

        return cc5TextField;

    }

    public void setCc5TextField(TextField tf) {

        this.cc5TextField = tf;

    }
    private StaticText staticText5 = new StaticText();

    public StaticText getStaticText5() {

        return staticText5;

    }

    public void setStaticText5(StaticText st) {

        this.staticText5 = st;

    }
    private TextField cc6TextField = new TextField();

    public TextField getCc6TextField() {

        return cc6TextField;

    }

    public void setCc6TextField(TextField tf) {

        this.cc6TextField = tf;

    }
    private Message message40 = new Message();

    public Message getMessage40() {

        return message40;

    }

    public void setMessage40(Message m) {

        this.message40 = m;

    }
    private Message message41 = new Message();

    public Message getMessage41() {

        return message41;

    }

    public void setMessage41(Message m) {

        this.message41 = m;

    }
    private Message message42 = new Message();

    public Message getMessage42() {

        return message42;

    }

    public void setMessage42(Message m) {

        this.message42 = m;

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
    private HtmlOutputText componentTextID6 = new HtmlOutputText();

    public HtmlOutputText getComponentTextID6() {

        return componentTextID6;

    }

    public void setComponentTextID6(HtmlOutputText hot) {

        this.componentTextID6 = hot;

    }
    private HtmlInputText h2sTextField1 = new HtmlInputText();

    public HtmlInputText getH2sTextField1() {

        return h2sTextField1;

    }

    public void setH2sTextField1(HtmlInputText hit) {

        this.h2sTextField1 = hit;

    }
    private Message message46 = new Message();

    public Message getMessage46() {

        return message46;

    }

    public void setMessage46(Message m) {

        this.message46 = m;

    }
    private CachedRowSetDataProvider fieldfluidsDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getFieldfluidsDataProvider() {

        return fieldfluidsDataProvider;

    }

    public void setFieldfluidsDataProvider(CachedRowSetDataProvider crsdp) {

        this.fieldfluidsDataProvider = crsdp;

    }
    private CachedRowSetDataProvider cachedRowSetDataProvider1 = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getCachedRowSetDataProvider1() {

        return cachedRowSetDataProvider1;

    }

    public void setCachedRowSetDataProvider1(CachedRowSetDataProvider crsdp) {

        this.cachedRowSetDataProvider1 = crsdp;

    }
    private CachedRowSetDataProvider fluidinfoDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getFluidinfoDataProvider() {

        return fluidinfoDataProvider;

    }

    public void setFluidinfoDataProvider(CachedRowSetDataProvider crsdp) {

        this.fluidinfoDataProvider = crsdp;

    }
    private HtmlInputText SO4minusMinusTextField = new HtmlInputText();

    public HtmlInputText getSO4minusMinusTextField() {

        return SO4minusMinusTextField;

    }

    public void setSO4minusMinusTextField(HtmlInputText hit) {

        this.SO4minusMinusTextField = hit;

    }
    private HtmlOutputText SO4TextID = new HtmlOutputText();

    public HtmlOutputText getSO4TextID() {

        return SO4TextID;

    }

    public void setSO4TextID(HtmlOutputText hot) {

        this.SO4TextID = hot;

    }
    private Message message38 = new Message();

    public Message getMessage38() {

        return message38;

    }

    public void setMessage38(Message m) {

        this.message38 = m;

    }
    private CachedRowSetDataProvider cachedRowSetDataProvider2 = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getCachedRowSetDataProvider2() {
        return cachedRowSetDataProvider2;
    }

    public void setCachedRowSetDataProvider2(CachedRowSetDataProvider crsdp) {
        this.cachedRowSetDataProvider2 = crsdp;
    }
 @Override
    public void init() {
        // Perform initializations inherited from our superclass
        super.init();
        // Perform application initialization that must complete
        // *before* managed components are initialized
        // TODO - add your own initialiation code here
        
        
        // <editor-fold defaultstate="collapsed" desc="Visual-Web-managed Component Initialization">
        // Initialize automatically managed components
        // *Note* - this logic should NOT be modified
        try {
            _init();
        } catch (Exception e) {
            log("Page1 Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        
        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
    }
 
    private void _init() throws Exception {
        fieldfluidsDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.fluidinfoRowSet}"));
        fluidinfoDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.fluidinfoFullTableRowSet}"));
    }
    // </editor-fold>
    public ComponentSelector() {
        fieldfluidsDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.fluidinfoRowSet}"));

        // <editor-fold defaultstate="collapsed" desc="Creator-managed Component
        // Initialization">

        try {

            fluidinfoDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.fluidinfoFullTableRowSet}"));

        } catch (Exception e) {

            log("ComponentSelector Initialization Failure", e);

            throw e instanceof javax.faces.FacesException ? (FacesException) e
                    : new FacesException(e);

        }

        // </editor-fold>

        // Additional user provided initialization code

        try {

            getSessionBean1().getFluidinfoFullTableRowSet().setObject(
                    1,
                    Integer.toString(getSessionBean1().getLoginBean().getUserID()));

            fluidinfoDataProvider.refresh();

            if (getSessionBean1().getActiveFluidID() == 0) {

                int id = ((Integer) fluidinfoDataProvider.getValue("FLUIDINFO.ID")).intValue();

                // System.out.println("ID " + id);

                getSessionBean1().setActiveFluidID(id);

            }

            getSessionBean1().getFluidinfoRowSet().setObject(
                    1,
                    Integer.toString(getSessionBean1().getLoginBean().getUserID()));

            getSessionBean1().getFluidinfoRowSet().setObject(2,
                    Integer.toString(getSessionBean1().getActiveFluidID()));

        } catch (Exception e) {

            e.printStackTrace();

        }
        fieldfluidsDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.fluidinfoRowSet}"));
        fluidinfoDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.fluidinfoRowSet}"));
        fieldfluidsDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.fluidinfoRowSet}"));
        fieldfluidsDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.fluidinfoRowSet}"));
        fieldfluidsDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.fluidinfoRowSet}"));
    }

    protected neqsimserver2.GasQuality.GasQualitySessionBean getGasQuality$GasQualitySessionBean() {

        return (neqsimserver2.GasQuality.GasQualitySessionBean) getBean("GasQuality$GasQualitySessionBean");

    }

    protected neqsimserver2.ApplicationBean1 getApplicationBean1() {

        return (neqsimserver2.ApplicationBean1) getBean("ApplicationBean1");

    }

    protected neqsimserver2.SessionBean1 getSessionBean1() {

        return (neqsimserver2.SessionBean1) getBean("SessionBean1");

    }

    protected neqsimserver2.Thermo.ThermoSessionBean getThermo$ThermoSessionBean() {

        return (neqsimserver2.Thermo.ThermoSessionBean) getBean("Thermo$ThermoSessionBean");

    }

    /**
     * Bean cleanup.
     */
    protected void afterRenderResponse() {

        fluidinfoDataProvider.close();

        cachedRowSetDataProvider1.close();

        fieldfluidsDataProvider.close();
        cachedRowSetDataProvider2.close();

    }

    public String calculateButton_action() {

        try {

            fieldfluidsDataProvider.commitChanges();

        } catch (Exception e) {

            error(e.toString());

        }

        try {

            java.text.DecimalFormat nf = new java.text.DecimalFormat();

            nf.setMaximumFractionDigits(3);

            nf.applyPattern("#.###E0");

            getThermo$ThermoSessionBean().resetThermoSystem();

            neqsim.thermo.system.SystemInterface thermoSystem = getThermo$ThermoSessionBean().getThermoSystem();

            if (java.lang.Double.parseDouble(getCarbonDioxideTextField().getValue().toString()) > 1.0E-20) {

                thermoSystem.addComponent("CO2", java.lang.Double.parseDouble(getCarbonDioxideTextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getH2sTextField1().getValue().toString()) > 1.0E-20) {

                thermoSystem.addComponent("H2S", java.lang.Double.parseDouble(getH2sTextField1().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getNitrogenTextField().getValue().toString()) > 1.0E-20) {

                thermoSystem.addComponent("nitrogen", java.lang.Double.parseDouble(getNitrogenTextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getMethaneTextField().getValue().toString()) > 1.0E-20) {

                thermoSystem.addComponent("methane", java.lang.Double.parseDouble(getMethaneTextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getEthaneTextField().getValue().toString()) > 1.0E-20) {

                thermoSystem.addComponent("ethane",
                        java.lang.Double.parseDouble(getEthaneTextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getPropaneTextField().getValue().toString()) > 1.0E-20) {

                thermoSystem.addComponent("propane", java.lang.Double.parseDouble(getPropaneTextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getIbutaneTextField().getValue().toString()) > 1.0E-20) {

                thermoSystem.addComponent("i-butane", java.lang.Double.parseDouble(getIbutaneTextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getNbutaneTextField().getValue().toString()) > 1.0E-20) {

                thermoSystem.addComponent("n-butane", java.lang.Double.parseDouble(getNbutaneTextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getPentaneTextField().getValue().toString()) > 1.0E-20) {

                thermoSystem.addComponent("n-pentane", java.lang.Double.parseDouble(getPentaneTextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getHexaneTextField().getValue().toString()) > 1.0E-20) {

                thermoSystem.addComponent("n-hexane",
                        java.lang.Double.parseDouble(getHexaneTextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getCc5TextField().getValue().toString()) > 1.0E-20) {

                thermoSystem.addComponent("c-C5", java.lang.Double.parseDouble(getCc5TextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getCc6TextField().getValue().toString()) > 1.0E-20) {

                thermoSystem.addComponent("c-C6", java.lang.Double.parseDouble(getCc6TextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getNheptaneTextField().getValue().toString()) > 1.0E-20) {

                thermoSystem.addComponent("n-heptane", java.lang.Double.parseDouble(getNheptaneTextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getNoctaneTextField().getValue().toString()) > 1.0E-20) {

                thermoSystem.addComponent("n-octane", java.lang.Double.parseDouble(getNoctaneTextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getNnonaneTextField().getValue().toString()) > 1.0E-20) {

                thermoSystem.addComponent("n-nonane", java.lang.Double.parseDouble(getNnonaneTextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getNdecaneTextField().getValue().toString()) > 1.0E-20) {

                thermoSystem.addComponent("nC10", java.lang.Double.parseDouble(getNdecaneTextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getBenzeneTextField().getValue().toString()) > 1.0E-20) {

                thermoSystem.addComponent("benzene", java.lang.Double.parseDouble(getBenzeneTextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getTolueneTextField().getValue().toString()) > 1.0E-20) {

                thermoSystem.addComponent("toluene", java.lang.Double.parseDouble(getTolueneTextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getMxyleneTextField().getValue().toString()) > 1.0E-20) {

                thermoSystem.addComponent("m-Xylene", java.lang.Double.parseDouble(getMxyleneTextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getPxyleneTextField().getValue().toString()) > 1.0E-20) {

                thermoSystem.addComponent("p-Xylene", java.lang.Double.parseDouble(getPxyleneTextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getOxyleneTextField().getValue().toString()) > 1.0E-20) {

                thermoSystem.addComponent("o-Xylene", java.lang.Double.parseDouble(getOxyleneTextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getWaterTextField().getValue().toString()) > 1.0E-20) {

                thermoSystem.addComponent("water", java.lang.Double.parseDouble(getWaterTextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getMethanolTextField().getValue().toString()) > 1.0E-20) {

                thermoSystem.addComponent("methanol", java.lang.Double.parseDouble(getMethanolTextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getMegTextField().getValue().toString()) > 1.0E-20) {

                thermoSystem.addComponent("MEG", java.lang.Double.parseDouble(getMegTextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getDegTextField().getValue().toString()) > 1.0E-20) {

                thermoSystem.addComponent("DEG", java.lang.Double.parseDouble(getDegTextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getTegTextField().getValue().toString()) > 1.0E-20) {

                thermoSystem.addComponent("TEG", java.lang.Double.parseDouble(getTegTextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getMdeaTextField().getValue().toString()) > 1.0E-20) {

                thermoSystem.addComponent("MDEA", java.lang.Double.parseDouble(getMdeaTextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getPiperazineTextField().getValue().toString()) > 1.0E-20) {

                thermoSystem.addComponent("Piperazine", java.lang.Double.parseDouble(getPiperazineTextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getAceticAcidTextField().getValue().toString()) > 1.0E-20) {

                thermoSystem.addComponent("AceticAcid", java.lang.Double.parseDouble(getAceticAcidTextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getPropionicAcidTextField().getValue().toString()) > 1.0E-20) {

                thermoSystem.addComponent("AceticAcid", java.lang.Double.parseDouble(getPropionicAcidTextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getNaplusTextField1().getValue().toString()) > 1.0E-20) {

                thermoSystem.addComponent("Na+", java.lang.Double.parseDouble(getNaplusTextField1().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getClMinusTextField1().getValue().toString()) > 1.0E-20) {

                thermoSystem.addComponent("Cl-", java.lang.Double.parseDouble(getClMinusTextField1().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getFeplusplusTextField2().getValue().toString()) > 1.0E-20) {

                thermoSystem.addComponent("Fe++", java.lang.Double.parseDouble(getFeplusplusTextField2().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getCaplusplusTextField1().getValue().toString()) > 1.0E-20) {

                thermoSystem.addComponent("Ca++", java.lang.Double.parseDouble(getCaplusplusTextField1().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getOhMinusTexField1().getValue().toString()) > 1.0E-20) {

                thermoSystem.addComponent("OH-", java.lang.Double.parseDouble(getOhMinusTexField1().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getCo3MinusTextField2().getValue().toString()) > 1.0E-20) {

                thermoSystem.addComponent("CO3--", java.lang.Double.parseDouble(getCo3MinusTextField2().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getSO4minusMinusTextField().getValue().toString()) > 1.0E-20) {

                thermoSystem.addComponent("SO4--", java.lang.Double.parseDouble(getSO4minusMinusTextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getC6TextField().getValue().toString()) > 1.0E-20) {

                thermoSystem.addTBPfraction("C6", java.lang.Double.parseDouble(getC6TextField().getValue().toString()),
                        java.lang.Double.parseDouble(getMolarMassC6TextField().getValue().toString()) / 1000.0,
                        java.lang.Double.parseDouble(getDensityC6TextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getC7TextField().getValue().toString()) > 1.0E-20) {

                thermoSystem.addTBPfraction("C7", java.lang.Double.parseDouble(getC7TextField().getValue().toString()),
                        java.lang.Double.parseDouble(getMolarMassC7TextField().getValue().toString()) / 1000.0,
                        java.lang.Double.parseDouble(getDensityC7TextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getC8TextField().getValue().toString()) > 1.0E-20) {

                thermoSystem.addTBPfraction("C8", java.lang.Double.parseDouble(getC8TextField().getValue().toString()),
                        java.lang.Double.parseDouble(getMolarMassC8TextField().getValue().toString()) / 1000.0,
                        java.lang.Double.parseDouble(getDensityC8TextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getC9TextField().getValue().toString()) > 1.0E-20) {

                thermoSystem.addTBPfraction("C9", java.lang.Double.parseDouble(getC9TextField().getValue().toString()),
                        java.lang.Double.parseDouble(getMolarMassC9TextField().getValue().toString()) / 1000.0,
                        java.lang.Double.parseDouble(getDensityC9TextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getC10TextField().getValue().toString()) > 1.0E-20) {

                thermoSystem.addTBPfraction("C10", java.lang.Double.parseDouble(getC10TextField().getValue().toString()),
                        java.lang.Double.parseDouble(getMolarMassC10TextField().getValue().toString()) / 1000.0,
                        java.lang.Double.parseDouble(getDensityC10TextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getC11TextField().getValue().toString()) > 1.0E-20) {

                thermoSystem.addTBPfraction("C11", java.lang.Double.parseDouble(getC11TextField().getValue().toString()),
                        java.lang.Double.parseDouble(getMolarMassC11TextField().getValue().toString()) / 1000.0,
                        java.lang.Double.parseDouble(getDensityC11TextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getC12TextField().getValue().toString()) > 1.0E-20) {

                thermoSystem.addTBPfraction("C12", java.lang.Double.parseDouble(getC12TextField().getValue().toString()),
                        java.lang.Double.parseDouble(getMolarMassC12TextField().getValue().toString()) / 1000.0,
                        java.lang.Double.parseDouble(getDensityC12TextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getC13TextField().getValue().toString()) > 1.0E-20) {

                thermoSystem.addTBPfraction("C13", java.lang.Double.parseDouble(getC13TextField().getValue().toString()),
                        java.lang.Double.parseDouble(getMolarMassC13TextField().getValue().toString()) / 1000.0,
                        java.lang.Double.parseDouble(getDensityC13TextField().getValue().toString()));

            }

            if (java.lang.Double.parseDouble(getPlusFractionTextField().getValue().toString()) > 1.0E-20) {

                thermoSystem.addPlusFraction("C+", java.lang.Double.parseDouble(getPlusFractionTextField().getValue().toString()),
                        java.lang.Double.parseDouble(getMolarMassPlusFractionTextField().getValue().toString()) / 1000.0,
                        java.lang.Double.parseDouble(getDensityPlusFractionTextField().getValue().toString()));

            }

            // if (thermoSystem.characterizePlusFraction()){

            // thermoSystem.getCharacterization().setPseudocomponents(true);

            // thermoSystem.getCharacterization().setNumberOfPseudocomponents(5);

            // thermoSystem.getCharacterization().addCharacterizedPlusFraction();

            // }

            // thermoSystem.createDatabase(true);

            getThermo$ThermoSessionBean().setThermoSystem(
                    thermoSystem.autoSelectModel());

        // getThermo$ThermoSessionBean().getThermoSystem().autoSelectMixingRule();

        } catch (Exception e) {

            e.printStackTrace();

        }

        return "AddComponentToThermoMenuPage";

    }

    public void densityC6TextField_processValueChange(ValueChangeEvent vce) {

    // User event code here...

    }

    public String resetButton_action() {

        // TODO: Process the button click action. Return value is a navigation

        // case name where null will return to the same page.

        // this.init();

        error("reset function not yet implemented");

        return null;

    }

    public void hexaneTextField_processValueChange(ValueChangeEvent vce) {

    // TODO: Replace with your code

    }

    public String open_action() {

        // TODO: Process the button click action. Return value is a navigation

        // case name where null will return to the same page.

        return "AddComponentToFluidDB";

    }

    public String saveButton_action() {

        try {

            fieldfluidsDataProvider.commitChanges();

        } catch (Exception e) {

            error(e.toString());

        }

        // TODO: Process the button click action. Return value is a navigation

        // case name where null will return to the same page.

        return null;

    }

    public String newButton_action() {

        // TODO: Process the button click action. Return value is a navigation

        // case name where null will return to the same page.

        try {

            fluidinfoDataProvider.cursorLast();

            RowKey rowKey = fluidinfoDataProvider.appendRow();

            fluidinfoDataProvider.setValue("FLUIDINFO.USERID", rowKey, Integer.toString(getSessionBean1().getLoginBean().getUserID()));

            fluidinfoDataProvider.commitChanges();

            getSessionBean1().setActiveFluidID(
                    ((Integer) fluidinfoDataProvider.getValue("FLUIDINFO.ID")).intValue());

            getSessionBean1().getFluidinfoRowSet().setObject(
                    1,
                    Integer.toString(getSessionBean1().getLoginBean().getUserID()));

            getSessionBean1().getFluidinfoRowSet().setObject(2,
                    Integer.toString(getSessionBean1().getActiveFluidID()));

            fieldfluidsDataProvider.refresh();

            getSessionBean1().getFluidinfoFullTableRowSet().setObject(
                    1,
                    Integer.toString(getSessionBean1().getLoginBean().getUserID()));

            fluidinfoDataProvider.refresh();

            System.out.println("FLuid_ID " + getSessionBean1().getActiveFluidID());

        } catch (Exception e) {

            error(e.getMessage());

            log(e.getMessage());

            e.printStackTrace();

        }

        return null;

    }

    public void historyTextArea_processValueChange(ValueChangeEvent vce) {

    // TODO: Replace with your code

    }

    public String linkAction1_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.
        return null;
    }
}
