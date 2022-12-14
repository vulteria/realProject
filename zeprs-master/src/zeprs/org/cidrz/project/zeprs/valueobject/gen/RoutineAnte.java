package org.cidrz.project.zeprs.valueobject.gen;

import org.cidrz.project.zeprs.valueobject.gen.*;
import org.cidrz.project.zeprs.valueobject.EncounterData;
import org.cidrz.webapp.dynasite.valueobject.Patient;
import java.sql.Date;
import java.util.Set;
import java.sql.Time;
import java.sql.Timestamp;
import org.cidrz.webapp.dynasite.valueobject.AuditInfo;
import java.util.TreeSet;

/**
 * JavaBean RoutineAnte generated from database;
 * generated by DynasiteSourceGenerator, inspired by XslBeanGenerator by Klaus Berg.
 *
 * @author Chris Kelley
 *         Date: 2014-10-27
 *         Time: 17:44:30
 *         Form Name: Routine Antenatal Visits
 *         Form Id: 80
 */

/**
 * @hibernate.joined-subclass table="routineante"
 * @hibernate.joined-subclass-key column="id"
 */
public class RoutineAnte extends EncounterData {

private Integer field129;	//ega_129
private Integer field232;	//fundal_height_232
private Integer field313;	//lie_313
private transient String field337;	//position_337
private Integer field314;	//presentation_314
private transient Integer field234;	//engaged_234
private Integer field315;	//descent_315
private Integer field231;	//oedema_231
private Integer field230;	//foetal_heart_rate_230
private Integer field229;	//foetal_heart_rhythm_229
private Integer field224;	//bp_systolic_224
private Integer field225;	//bp_diastolic_225
private Float field228;	//weight_228
private Integer field244;	//urinalysis_ace_244
private Integer field242;	//urinalysis_alb_242
private Integer field243;	//urinalysis_glu_243
private Integer field1357;	//pallor_193
private Byte field2005;	//deworming
private Byte field1963;	//folate
private Byte field1964;	//iron
private Integer field1965;	//malaria_sp_dosage
private Date field1762;	//date_next_appt
private Boolean field1616;	//is_problem


 /**
  * @return
  * @hibernate.property column="ega_129"
  */
    public Integer getField129() {
        return this.field129;
    }

    public void setField129(Integer field129) {
        this.field129 = field129;
    }





 /**
  * @return
  * @hibernate.property column="fundal_height_232"
  */
    public Integer getField232() {
        return this.field232;
    }

    public void setField232(Integer field232) {
        this.field232 = field232;
    }





 /**
  * @return
  * @hibernate.property column="lie_313"
  */
    public Integer getField313() {
        return this.field313;
    }

    public void setField313(Integer field313) {
        this.field313 = field313;
    }









 /**
  * @return
  * @hibernate.property column="presentation_314"
  */
    public Integer getField314() {
        return this.field314;
    }

    public void setField314(Integer field314) {
        this.field314 = field314;
    }









 /**
  * @return
  * @hibernate.property column="descent_315"
  */
    public Integer getField315() {
        return this.field315;
    }

    public void setField315(Integer field315) {
        this.field315 = field315;
    }





 /**
  * @return
  * @hibernate.property column="oedema_231"
  */
    public Integer getField231() {
        return this.field231;
    }

    public void setField231(Integer field231) {
        this.field231 = field231;
    }





 /**
  * @return
  * @hibernate.property column="foetal_heart_rate_230"
  */
    public Integer getField230() {
        return this.field230;
    }

    public void setField230(Integer field230) {
        this.field230 = field230;
    }





 /**
  * @return
  * @hibernate.property column="foetal_heart_rhythm_229"
  */
    public Integer getField229() {
        return this.field229;
    }

    public void setField229(Integer field229) {
        this.field229 = field229;
    }





 /**
  * @return
  * @hibernate.property column="bp_systolic_224"
  */
    public Integer getField224() {
        return this.field224;
    }

    public void setField224(Integer field224) {
        this.field224 = field224;
    }





 /**
  * @return
  * @hibernate.property column="bp_diastolic_225"
  */
    public Integer getField225() {
        return this.field225;
    }

    public void setField225(Integer field225) {
        this.field225 = field225;
    }





 /**
  * @return
  * @hibernate.property column="weight_228"
  */
    public Float getField228() {
        return this.field228;
    }

    public void setField228(Float field228) {
        this.field228 = field228;
    }





 /**
  * @return
  * @hibernate.property column="urinalysis_ace_244"
  */
    public Integer getField244() {
        return this.field244;
    }

    public void setField244(Integer field244) {
        this.field244 = field244;
    }





 /**
  * @return
  * @hibernate.property column="urinalysis_alb_242"
  */
    public Integer getField242() {
        return this.field242;
    }

    public void setField242(Integer field242) {
        this.field242 = field242;
    }





 /**
  * @return
  * @hibernate.property column="urinalysis_glu_243"
  */
    public Integer getField243() {
        return this.field243;
    }

    public void setField243(Integer field243) {
        this.field243 = field243;
    }





 /**
  * @return
  * @hibernate.property column="pallor_193"
  */
    public Integer getField1357() {
        return this.field1357;
    }

    public void setField1357(Integer field1357) {
        this.field1357 = field1357;
    }





 /**
  * @return
  * @hibernate.property column="deworming"
  */
    public Byte getField2005() {
        return this.field2005;
    }

    public void setField2005(Byte field2005) {
        this.field2005 = field2005;
    }





 /**
  * @return
  * @hibernate.property column="folate"
  */
    public Byte getField1963() {
        return this.field1963;
    }

    public void setField1963(Byte field1963) {
        this.field1963 = field1963;
    }





 /**
  * @return
  * @hibernate.property column="iron"
  */
    public Byte getField1964() {
        return this.field1964;
    }

    public void setField1964(Byte field1964) {
        this.field1964 = field1964;
    }





 /**
  * @return
  * @hibernate.property column="malaria_sp_dosage"
  */
    public Integer getField1965() {
        return this.field1965;
    }

    public void setField1965(Integer field1965) {
        this.field1965 = field1965;
    }





 /**
  * @return
  * @hibernate.property column="date_next_appt"
  */
    public Date getField1762() {
        return this.field1762;
    }

    public void setField1762(Date field1762) {
        this.field1762 = field1762;
    }





 /**
  * @return
  * @hibernate.property column="is_problem"
  */
    public Boolean getField1616() {
        return this.field1616;
    }

    public void setField1616(Boolean field1616) {
        this.field1616 = field1616;
    }





}
