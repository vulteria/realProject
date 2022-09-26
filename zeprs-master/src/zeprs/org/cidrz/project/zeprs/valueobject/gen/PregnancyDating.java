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
 * JavaBean PregnancyDating generated from database;
 * generated by DynasiteSourceGenerator, inspired by XslBeanGenerator by Klaus Berg.
 *
 * @author Chris Kelley
 *         Date: 2014-10-27
 *         Time: 17:44:30
 *         Form Name: Pregnancy Dating
 *         Form Id: 82
 */

/**
 * @hibernate.joined-subclass table="pregnancydating"
 * @hibernate.joined-subclass-key column="id"
 */
public class PregnancyDating extends EncounterData {

private Byte field135;	//planned_preg_135
private Byte field136;	//contracept_practiced_136
private Integer field137;	//contraceptive_choice_137
private String field138;	//contraceptive_other_138
private Integer field126;	//lmp_reliability_126
private Date field127;	//lmp_127_calculated
private Date field128;	//edd_128
private Integer field129;	//ega_129
private Integer field130;	//quickening_130
private Integer field131;	//menstrual_history_131
private Integer field132;	//cycle_in_days_132
private Integer field188;	//uterus_size_in_days_188
private Integer field1615;	//dating_method
private Integer field1908;	//ega_ultrasound
private Date field1962;	//lmp_from_widget


 /**
  * @return
  * @hibernate.property column="planned_preg_135"
  */
    public Byte getField135() {
        return this.field135;
    }

    public void setField135(Byte field135) {
        this.field135 = field135;
    }





 /**
  * @return
  * @hibernate.property column="contracept_practiced_136"
  */
    public Byte getField136() {
        return this.field136;
    }

    public void setField136(Byte field136) {
        this.field136 = field136;
    }





 /**
  * @return
  * @hibernate.property column="contraceptive_choice_137"
  */
    public Integer getField137() {
        return this.field137;
    }

    public void setField137(Integer field137) {
        this.field137 = field137;
    }





 /**
  * @return
  * @hibernate.property column="contraceptive_other_138" type="text"
  */
    public String getField138() {
        return this.field138;
    }

    public void setField138(String field138) {
        this.field138 = field138;
    }





 /**
  * @return
  * @hibernate.property column="lmp_reliability_126"
  */
    public Integer getField126() {
        return this.field126;
    }

    public void setField126(Integer field126) {
        this.field126 = field126;
    }





 /**
  * @return
  * @hibernate.property column="lmp_127_calculated"
  */
    public Date getField127() {
        return this.field127;
    }

    public void setField127(Date field127) {
        this.field127 = field127;
    }





 /**
  * @return
  * @hibernate.property column="edd_128"
  */
    public Date getField128() {
        return this.field128;
    }

    public void setField128(Date field128) {
        this.field128 = field128;
    }





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
  * @hibernate.property column="quickening_130"
  */
    public Integer getField130() {
        return this.field130;
    }

    public void setField130(Integer field130) {
        this.field130 = field130;
    }





 /**
  * @return
  * @hibernate.property column="menstrual_history_131"
  */
    public Integer getField131() {
        return this.field131;
    }

    public void setField131(Integer field131) {
        this.field131 = field131;
    }





 /**
  * @return
  * @hibernate.property column="cycle_in_days_132"
  */
    public Integer getField132() {
        return this.field132;
    }

    public void setField132(Integer field132) {
        this.field132 = field132;
    }





 /**
  * @return
  * @hibernate.property column="uterus_size_in_days_188"
  */
    public Integer getField188() {
        return this.field188;
    }

    public void setField188(Integer field188) {
        this.field188 = field188;
    }





 /**
  * @return
  * @hibernate.property column="dating_method"
  */
    public Integer getField1615() {
        return this.field1615;
    }

    public void setField1615(Integer field1615) {
        this.field1615 = field1615;
    }





 /**
  * @return
  * @hibernate.property column="ega_ultrasound"
  */
    public Integer getField1908() {
        return this.field1908;
    }

    public void setField1908(Integer field1908) {
        this.field1908 = field1908;
    }





 /**
  * @return
  * @hibernate.property column="lmp_from_widget"
  */
    public Date getField1962() {
        return this.field1962;
    }

    public void setField1962(Date field1962) {
        this.field1962 = field1962;
    }





}
