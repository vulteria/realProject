package org.cidrz.project.zeprs.valueobject.report.gen;

import org.cidrz.project.zeprs.valueobject.EncounterData;
import org.cidrz.webapp.dynasite.valueobject.Patient;
import java.sql.Date;
import java.util.Set;
import java.sql.Time;
import java.sql.Timestamp;
import org.cidrz.webapp.dynasite.valueobject.AuditInfo;
import java.util.TreeSet;

/**
 * JavaBean PuerperiumReport generated from database;
 * generated by DynasiteSourceGenerator, inspired by XslBeanGenerator by Klaus Berg.
 *
 * @author Chris Kelley
 *         Date: 2014-10-27
 *         Time: 17:44:31
 *         Form Name: Puerperium
 *         Form Id: 81
 */

/**
 * @hibernate.joined-subclass table="puerperium"
 * @hibernate.joined-subclass-key column="id"
 */
public class PuerperiumReport extends EncounterData {

private transient Integer visit_number;	//visit_number
private String visit_numberR;
private transient Time time_of_exam;	//time_of_exam
private String time_of_examR;
private transient Integer bp_systolic_224;	//bp_systolic_224
private String bp_systolic_224R;
private transient Integer bp_diastolic_225;	//bp_diastolic_225
private String bp_diastolic_225R;
private transient Float temperature_266;	//temperature_266
private String temperature_266R;
private transient Byte perineum_intact;	//perineum_intact
private String perineum_intactR;
private transient Byte perineum_swollen;	//perineum_swollen
private String perineum_swollenR;
private transient Byte perineum_hematoma;	//perineum_hematoma
private String perineum_hematomaR;
private transient Integer lochia_579;	//lochia_579
private String lochia_579R;
private transient Integer bowels_639;	//bowels_639
private String bowels_639R;
private transient Integer micturition_641;	//micturition_641
private String micturition_641R;
private transient Integer breasts_166;	//breasts_166
private String breasts_166R;
private transient Integer wound_643;	//wound_643
private String wound_643R;
private transient Integer hb_235;	//hb_235
private String hb_235R;
private transient Byte anti_d_given_621;	//anti_d_given_621
private String anti_d_given_621R;
private transient Integer general_condition_260;	//general_condition_260
private String general_condition_260R;
private transient Integer bleeding;	//bleeding
private String bleedingR;
private transient Integer pallor_193;	//pallor_193
private String pallor_193R;
private transient Integer uterus_187;	//uterus_187
private String uterus_187R;
private transient Byte bladder_emptied_437;	//bladder_emptied_437
private String bladder_emptied_437R;
private transient Boolean is_problem;	//is_problem
private String is_problemR;
private transient Integer postpartum_complications_584;	//postpartum_complications_584
private String postpartum_complications_584R;
private transient Integer disposition;	//disposition
private String dispositionR;
private transient String comments;	//comments
private String commentsR;




    public String getVisit_numberR() {
        return this.visit_numberR;
    }

    public void setVisit_numberR(String visit_numberR) {
        this.visit_numberR = visit_numberR;
    }



 /**
  * @return
  * @hibernate.property column="time_of_exam"
  */
    public Time getTime_of_exam() {
        return this.time_of_exam;
    }

    public void setTime_of_exam(Time time_of_exam) {
        this.time_of_exam = time_of_exam;
    }



    public String getTime_of_examR() {
        return this.time_of_examR;
    }

    public void setTime_of_examR(String time_of_examR) {
        this.time_of_examR = time_of_examR;
    }



 /**
  * @return
  * @hibernate.property column="bp_systolic_224"
  */
    public Integer getBp_systolic_224() {
        return this.bp_systolic_224;
    }

    public void setBp_systolic_224(Integer bp_systolic_224) {
        this.bp_systolic_224 = bp_systolic_224;
    }



    public String getBp_systolic_224R() {
        return this.bp_systolic_224R;
    }

    public void setBp_systolic_224R(String bp_systolic_224R) {
        this.bp_systolic_224R = bp_systolic_224R;
    }



 /**
  * @return
  * @hibernate.property column="bp_diastolic_225"
  */
    public Integer getBp_diastolic_225() {
        return this.bp_diastolic_225;
    }

    public void setBp_diastolic_225(Integer bp_diastolic_225) {
        this.bp_diastolic_225 = bp_diastolic_225;
    }



    public String getBp_diastolic_225R() {
        return this.bp_diastolic_225R;
    }

    public void setBp_diastolic_225R(String bp_diastolic_225R) {
        this.bp_diastolic_225R = bp_diastolic_225R;
    }



 /**
  * @return
  * @hibernate.property column="temperature_266"
  */
    public Float getTemperature_266() {
        return this.temperature_266;
    }

    public void setTemperature_266(Float temperature_266) {
        this.temperature_266 = temperature_266;
    }



    public String getTemperature_266R() {
        return this.temperature_266R;
    }

    public void setTemperature_266R(String temperature_266R) {
        this.temperature_266R = temperature_266R;
    }



 /**
  * @return
  * @hibernate.property column="perineum_intact"
  */
    public Byte getPerineum_intact() {
        return this.perineum_intact;
    }

    public void setPerineum_intact(Byte perineum_intact) {
        this.perineum_intact = perineum_intact;
    }



    public String getPerineum_intactR() {
        return this.perineum_intactR;
    }

    public void setPerineum_intactR(String perineum_intactR) {
        this.perineum_intactR = perineum_intactR;
    }



 /**
  * @return
  * @hibernate.property column="perineum_swollen"
  */
    public Byte getPerineum_swollen() {
        return this.perineum_swollen;
    }

    public void setPerineum_swollen(Byte perineum_swollen) {
        this.perineum_swollen = perineum_swollen;
    }



    public String getPerineum_swollenR() {
        return this.perineum_swollenR;
    }

    public void setPerineum_swollenR(String perineum_swollenR) {
        this.perineum_swollenR = perineum_swollenR;
    }



 /**
  * @return
  * @hibernate.property column="perineum_hematoma"
  */
    public Byte getPerineum_hematoma() {
        return this.perineum_hematoma;
    }

    public void setPerineum_hematoma(Byte perineum_hematoma) {
        this.perineum_hematoma = perineum_hematoma;
    }



    public String getPerineum_hematomaR() {
        return this.perineum_hematomaR;
    }

    public void setPerineum_hematomaR(String perineum_hematomaR) {
        this.perineum_hematomaR = perineum_hematomaR;
    }



 /**
  * @return
  * @hibernate.property column="lochia_579"
  */
    public Integer getLochia_579() {
        return this.lochia_579;
    }

    public void setLochia_579(Integer lochia_579) {
        this.lochia_579 = lochia_579;
    }



    public String getLochia_579R() {
        return this.lochia_579R;
    }

    public void setLochia_579R(String lochia_579R) {
        this.lochia_579R = lochia_579R;
    }



 /**
  * @return
  * @hibernate.property column="bowels_639"
  */
    public Integer getBowels_639() {
        return this.bowels_639;
    }

    public void setBowels_639(Integer bowels_639) {
        this.bowels_639 = bowels_639;
    }



    public String getBowels_639R() {
        return this.bowels_639R;
    }

    public void setBowels_639R(String bowels_639R) {
        this.bowels_639R = bowels_639R;
    }



 /**
  * @return
  * @hibernate.property column="micturition_641"
  */
    public Integer getMicturition_641() {
        return this.micturition_641;
    }

    public void setMicturition_641(Integer micturition_641) {
        this.micturition_641 = micturition_641;
    }



    public String getMicturition_641R() {
        return this.micturition_641R;
    }

    public void setMicturition_641R(String micturition_641R) {
        this.micturition_641R = micturition_641R;
    }



 /**
  * @return
  * @hibernate.property column="breasts_166"
  */
    public Integer getBreasts_166() {
        return this.breasts_166;
    }

    public void setBreasts_166(Integer breasts_166) {
        this.breasts_166 = breasts_166;
    }



    public String getBreasts_166R() {
        return this.breasts_166R;
    }

    public void setBreasts_166R(String breasts_166R) {
        this.breasts_166R = breasts_166R;
    }



 /**
  * @return
  * @hibernate.property column="wound_643"
  */
    public Integer getWound_643() {
        return this.wound_643;
    }

    public void setWound_643(Integer wound_643) {
        this.wound_643 = wound_643;
    }



    public String getWound_643R() {
        return this.wound_643R;
    }

    public void setWound_643R(String wound_643R) {
        this.wound_643R = wound_643R;
    }



 /**
  * @return
  * @hibernate.property column="hb_235"
  */
    public Integer getHb_235() {
        return this.hb_235;
    }

    public void setHb_235(Integer hb_235) {
        this.hb_235 = hb_235;
    }



    public String getHb_235R() {
        return this.hb_235R;
    }

    public void setHb_235R(String hb_235R) {
        this.hb_235R = hb_235R;
    }



 /**
  * @return
  * @hibernate.property column="anti_d_given_621"
  */
    public Byte getAnti_d_given_621() {
        return this.anti_d_given_621;
    }

    public void setAnti_d_given_621(Byte anti_d_given_621) {
        this.anti_d_given_621 = anti_d_given_621;
    }



    public String getAnti_d_given_621R() {
        return this.anti_d_given_621R;
    }

    public void setAnti_d_given_621R(String anti_d_given_621R) {
        this.anti_d_given_621R = anti_d_given_621R;
    }



 /**
  * @return
  * @hibernate.property column="general_condition_260"
  */
    public Integer getGeneral_condition_260() {
        return this.general_condition_260;
    }

    public void setGeneral_condition_260(Integer general_condition_260) {
        this.general_condition_260 = general_condition_260;
    }



    public String getGeneral_condition_260R() {
        return this.general_condition_260R;
    }

    public void setGeneral_condition_260R(String general_condition_260R) {
        this.general_condition_260R = general_condition_260R;
    }



 /**
  * @return
  * @hibernate.property column="bleeding"
  */
    public Integer getBleeding() {
        return this.bleeding;
    }

    public void setBleeding(Integer bleeding) {
        this.bleeding = bleeding;
    }



    public String getBleedingR() {
        return this.bleedingR;
    }

    public void setBleedingR(String bleedingR) {
        this.bleedingR = bleedingR;
    }



 /**
  * @return
  * @hibernate.property column="pallor_193"
  */
    public Integer getPallor_193() {
        return this.pallor_193;
    }

    public void setPallor_193(Integer pallor_193) {
        this.pallor_193 = pallor_193;
    }



    public String getPallor_193R() {
        return this.pallor_193R;
    }

    public void setPallor_193R(String pallor_193R) {
        this.pallor_193R = pallor_193R;
    }



 /**
  * @return
  * @hibernate.property column="uterus_187"
  */
    public Integer getUterus_187() {
        return this.uterus_187;
    }

    public void setUterus_187(Integer uterus_187) {
        this.uterus_187 = uterus_187;
    }



    public String getUterus_187R() {
        return this.uterus_187R;
    }

    public void setUterus_187R(String uterus_187R) {
        this.uterus_187R = uterus_187R;
    }



 /**
  * @return
  * @hibernate.property column="bladder_emptied_437"
  */
    public Byte getBladder_emptied_437() {
        return this.bladder_emptied_437;
    }

    public void setBladder_emptied_437(Byte bladder_emptied_437) {
        this.bladder_emptied_437 = bladder_emptied_437;
    }



    public String getBladder_emptied_437R() {
        return this.bladder_emptied_437R;
    }

    public void setBladder_emptied_437R(String bladder_emptied_437R) {
        this.bladder_emptied_437R = bladder_emptied_437R;
    }



 /**
  * @return
  * @hibernate.property column="is_problem"
  */
    public Boolean getIs_problem() {
        return this.is_problem;
    }

    public void setIs_problem(Boolean is_problem) {
        this.is_problem = is_problem;
    }



    public String getIs_problemR() {
        return this.is_problemR;
    }

    public void setIs_problemR(String is_problemR) {
        this.is_problemR = is_problemR;
    }



 /**
  * @return
  * @hibernate.property column="postpartum_complications_584"
  */
    public Integer getPostpartum_complications_584() {
        return this.postpartum_complications_584;
    }

    public void setPostpartum_complications_584(Integer postpartum_complications_584) {
        this.postpartum_complications_584 = postpartum_complications_584;
    }



    public String getPostpartum_complications_584R() {
        return this.postpartum_complications_584R;
    }

    public void setPostpartum_complications_584R(String postpartum_complications_584R) {
        this.postpartum_complications_584R = postpartum_complications_584R;
    }



 /**
  * @return
  * @hibernate.property column="disposition"
  */
    public Integer getDisposition() {
        return this.disposition;
    }

    public void setDisposition(Integer disposition) {
        this.disposition = disposition;
    }



    public String getDispositionR() {
        return this.dispositionR;
    }

    public void setDispositionR(String dispositionR) {
        this.dispositionR = dispositionR;
    }



 /**
  * @return
  * @hibernate.property column="comments" type="text"
  */
    public String getComments() {
        return this.comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }



    public String getCommentsR() {
        return this.commentsR;
    }

    public void setCommentsR(String commentsR) {
        this.commentsR = commentsR;
    }



}
