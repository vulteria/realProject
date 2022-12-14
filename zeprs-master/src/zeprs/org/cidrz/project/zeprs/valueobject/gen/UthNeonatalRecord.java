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
 * JavaBean UthNeonatalRecord generated from database;
 * generated by DynasiteSourceGenerator, inspired by XslBeanGenerator by Klaus Berg.
 *
 * @author Chris Kelley
 *         Date: 2014-10-27
 *         Time: 17:44:30
 *         Form Name: UTH Neonatal Case Record
 *         Form Id: 33
 */

/**
 * @hibernate.joined-subclass table="uthneonatalrecord"
 * @hibernate.joined-subclass-key column="id"
 */
public class UthNeonatalRecord extends EncounterData {

private Time field727;	//time_of_admission_727
private Date field728;	//date_of_birth_728
private Time field1514;	//time_of_birth_1514
private Integer field732;	//infant_age_732
private Integer field490;	//sex_490
private Integer field730;	//age_of_mother_730
private Integer field731;	//age_of_father_731
private Integer field734;	//parity_734
private Date field735;	//mothers_lmp_735
private Integer field129;	//ega_129
private transient Integer field737;	//gestational_age_days_737
private Integer field738;	//abo_blood_group_mother_738
private Integer field739;	//rhesus_mother_739
private Integer field740;	//vdrl_mother_740
private Byte field741;	//attending_anc_741
private Integer field12;	//occupation_12
private String field743;	//intrapartum_history_743
private Integer field447;	//mode_of_delivery_447
private Integer field60;	//indication_CS_forcepts_60
private Integer field50;	//place_of_delivery_50
private String field1547;	//place_delivery_other
private Date field328;	//rupture_of_membranes_date_328
private Time field329;	//rupture_of_membranes_time_329
private Integer field748;	//duration_of_labour_1st_748
private Integer field749;	//duration_of_labour_2nd_749
private Integer field440;	//placenta_type_440
private Integer field441;	//weight_of_placenta_441
private Integer field63;	//number_of_fetuses_63
private Integer field753;	//if_multiple_753
private Integer field1542;	//maternal_risk_factor_1
private Integer field1543;	//maternal_risk_factor_2
private Integer field1544;	//maternal_risk_factor_3
private Integer field1545;	//maternal_risk_factor_4
private Integer field1546;	//maternal_risk_factor_5
private String field755;	//maternal_risk_other_755


 /**
  * @return
  * @hibernate.property column="time_of_admission_727"
  */
    public Time getField727() {
        return this.field727;
    }

    public void setField727(Time field727) {
        this.field727 = field727;
    }





 /**
  * @return
  * @hibernate.property column="date_of_birth_728"
  */
    public Date getField728() {
        return this.field728;
    }

    public void setField728(Date field728) {
        this.field728 = field728;
    }





 /**
  * @return
  * @hibernate.property column="time_of_birth_1514"
  */
    public Time getField1514() {
        return this.field1514;
    }

    public void setField1514(Time field1514) {
        this.field1514 = field1514;
    }





 /**
  * @return
  * @hibernate.property column="infant_age_732"
  */
    public Integer getField732() {
        return this.field732;
    }

    public void setField732(Integer field732) {
        this.field732 = field732;
    }





 /**
  * @return
  * @hibernate.property column="sex_490"
  */
    public Integer getField490() {
        return this.field490;
    }

    public void setField490(Integer field490) {
        this.field490 = field490;
    }





 /**
  * @return
  * @hibernate.property column="age_of_mother_730"
  */
    public Integer getField730() {
        return this.field730;
    }

    public void setField730(Integer field730) {
        this.field730 = field730;
    }





 /**
  * @return
  * @hibernate.property column="age_of_father_731"
  */
    public Integer getField731() {
        return this.field731;
    }

    public void setField731(Integer field731) {
        this.field731 = field731;
    }





 /**
  * @return
  * @hibernate.property column="parity_734"
  */
    public Integer getField734() {
        return this.field734;
    }

    public void setField734(Integer field734) {
        this.field734 = field734;
    }





 /**
  * @return
  * @hibernate.property column="mothers_lmp_735"
  */
    public Date getField735() {
        return this.field735;
    }

    public void setField735(Date field735) {
        this.field735 = field735;
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
  * @hibernate.property column="abo_blood_group_mother_738"
  */
    public Integer getField738() {
        return this.field738;
    }

    public void setField738(Integer field738) {
        this.field738 = field738;
    }





 /**
  * @return
  * @hibernate.property column="rhesus_mother_739"
  */
    public Integer getField739() {
        return this.field739;
    }

    public void setField739(Integer field739) {
        this.field739 = field739;
    }





 /**
  * @return
  * @hibernate.property column="vdrl_mother_740"
  */
    public Integer getField740() {
        return this.field740;
    }

    public void setField740(Integer field740) {
        this.field740 = field740;
    }





 /**
  * @return
  * @hibernate.property column="attending_anc_741"
  */
    public Byte getField741() {
        return this.field741;
    }

    public void setField741(Byte field741) {
        this.field741 = field741;
    }





 /**
  * @return
  * @hibernate.property column="occupation_12"
  */
    public Integer getField12() {
        return this.field12;
    }

    public void setField12(Integer field12) {
        this.field12 = field12;
    }





 /**
  * @return
  * @hibernate.property column="intrapartum_history_743" type="text"
  */
    public String getField743() {
        return this.field743;
    }

    public void setField743(String field743) {
        this.field743 = field743;
    }





 /**
  * @return
  * @hibernate.property column="mode_of_delivery_447"
  */
    public Integer getField447() {
        return this.field447;
    }

    public void setField447(Integer field447) {
        this.field447 = field447;
    }





 /**
  * @return
  * @hibernate.property column="indication_CS_forcepts_60"
  */
    public Integer getField60() {
        return this.field60;
    }

    public void setField60(Integer field60) {
        this.field60 = field60;
    }





 /**
  * @return
  * @hibernate.property column="place_of_delivery_50"
  */
    public Integer getField50() {
        return this.field50;
    }

    public void setField50(Integer field50) {
        this.field50 = field50;
    }





 /**
  * @return
  * @hibernate.property column="place_delivery_other"
  */
    public String getField1547() {
        return this.field1547;
    }

    public void setField1547(String field1547) {
        this.field1547 = field1547;
    }





 /**
  * @return
  * @hibernate.property column="rupture_of_membranes_date_328"
  */
    public Date getField328() {
        return this.field328;
    }

    public void setField328(Date field328) {
        this.field328 = field328;
    }





 /**
  * @return
  * @hibernate.property column="rupture_of_membranes_time_329"
  */
    public Time getField329() {
        return this.field329;
    }

    public void setField329(Time field329) {
        this.field329 = field329;
    }





 /**
  * @return
  * @hibernate.property column="duration_of_labour_1st_748"
  */
    public Integer getField748() {
        return this.field748;
    }

    public void setField748(Integer field748) {
        this.field748 = field748;
    }





 /**
  * @return
  * @hibernate.property column="duration_of_labour_2nd_749"
  */
    public Integer getField749() {
        return this.field749;
    }

    public void setField749(Integer field749) {
        this.field749 = field749;
    }





 /**
  * @return
  * @hibernate.property column="placenta_type_440"
  */
    public Integer getField440() {
        return this.field440;
    }

    public void setField440(Integer field440) {
        this.field440 = field440;
    }





 /**
  * @return
  * @hibernate.property column="weight_of_placenta_441"
  */
    public Integer getField441() {
        return this.field441;
    }

    public void setField441(Integer field441) {
        this.field441 = field441;
    }





 /**
  * @return
  * @hibernate.property column="number_of_fetuses_63"
  */
    public Integer getField63() {
        return this.field63;
    }

    public void setField63(Integer field63) {
        this.field63 = field63;
    }





 /**
  * @return
  * @hibernate.property column="if_multiple_753"
  */
    public Integer getField753() {
        return this.field753;
    }

    public void setField753(Integer field753) {
        this.field753 = field753;
    }





 /**
  * @return
  * @hibernate.property column="maternal_risk_factor_1"
  */
    public Integer getField1542() {
        return this.field1542;
    }

    public void setField1542(Integer field1542) {
        this.field1542 = field1542;
    }





 /**
  * @return
  * @hibernate.property column="maternal_risk_factor_2"
  */
    public Integer getField1543() {
        return this.field1543;
    }

    public void setField1543(Integer field1543) {
        this.field1543 = field1543;
    }





 /**
  * @return
  * @hibernate.property column="maternal_risk_factor_3"
  */
    public Integer getField1544() {
        return this.field1544;
    }

    public void setField1544(Integer field1544) {
        this.field1544 = field1544;
    }





 /**
  * @return
  * @hibernate.property column="maternal_risk_factor_4"
  */
    public Integer getField1545() {
        return this.field1545;
    }

    public void setField1545(Integer field1545) {
        this.field1545 = field1545;
    }





 /**
  * @return
  * @hibernate.property column="maternal_risk_factor_5"
  */
    public Integer getField1546() {
        return this.field1546;
    }

    public void setField1546(Integer field1546) {
        this.field1546 = field1546;
    }





 /**
  * @return
  * @hibernate.property column="maternal_risk_other_755" type="text"
  */
    public String getField755() {
        return this.field755;
    }

    public void setField755(String field755) {
        this.field755 = field755;
    }





}
