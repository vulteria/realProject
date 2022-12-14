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
 * JavaBean PostUltrasound generated from database;
 * generated by DynasiteSourceGenerator, inspired by XslBeanGenerator by Klaus Berg.
 *
 * @author Chris Kelley
 *         Date: 2014-10-27
 *         Time: 17:44:30
 *         Form Name: Postnatal Ultrasound Evaluation
 *         Form Id: 75
 */

/**
 * @hibernate.joined-subclass table="postultrasound"
 * @hibernate.joined-subclass-key column="id"
 */
public class PostUltrasound extends EncounterData {

private Date field1212;	//date_of_ultrasound_1212
private Integer field1473;	//diagnosis_ultrasound
private String field1474;	//describe_abnormalities


 /**
  * @return
  * @hibernate.property column="date_of_ultrasound_1212"
  */
    public Date getField1212() {
        return this.field1212;
    }

    public void setField1212(Date field1212) {
        this.field1212 = field1212;
    }





 /**
  * @return
  * @hibernate.property column="diagnosis_ultrasound"
  */
    public Integer getField1473() {
        return this.field1473;
    }

    public void setField1473(Integer field1473) {
        this.field1473 = field1473;
    }





 /**
  * @return
  * @hibernate.property column="describe_abnormalities" type="text"
  */
    public String getField1474() {
        return this.field1474;
    }

    public void setField1474(String field1474) {
        this.field1474 = field1474;
    }





}
