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
 * JavaBean UpdateEGA generated from database;
 * generated by DynasiteSourceGenerator, inspired by XslBeanGenerator by Klaus Berg.
 *
 * @author Chris Kelley
 *         Date: 2014-10-27
 *         Time: 17:44:30
 *         Form Name: Update EGA
 *         Form Id: 73
 */

/**
 * @hibernate.joined-subclass table="updateega"
 * @hibernate.joined-subclass-key column="id"
 */
public class UpdateEGA extends EncounterData {

private Integer field129;	//ega_129


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





}
