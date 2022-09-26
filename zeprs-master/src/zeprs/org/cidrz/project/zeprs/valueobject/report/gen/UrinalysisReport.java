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
 * JavaBean UrinalysisReport generated from database;
 * generated by DynasiteSourceGenerator, inspired by XslBeanGenerator by Klaus Berg.
 *
 * @author Chris Kelley
 *         Date: 2014-10-27
 *         Time: 17:44:31
 *         Form Name: Urinalysis
 *         Form Id: 104
 */

/**
 * @hibernate.joined-subclass table="urinalysis"
 * @hibernate.joined-subclass-key column="id"
 */
public class UrinalysisReport extends EncounterData {

private transient Integer leuk_est;	//leuk_est
private String leuk_estR;
private transient Integer nitrite;	//nitrite
private String nitriteR;
private transient Integer urinalysis_ace_244;	//urinalysis_ace_244
private String urinalysis_ace_244R;
private transient Integer urinalysis_alb_242;	//urinalysis_alb_242
private String urinalysis_alb_242R;
private transient Integer urinalysis_glu_243;	//urinalysis_glu_243
private String urinalysis_glu_243R;
private transient Integer wbc_urinalysis;	//wbc_urinalysis
private String wbc_urinalysisR;
private transient Integer bacteria;	//bacteria
private String bacteriaR;
private transient Long labtest_id;	//labtest_id
private String labtest_idR;


 /**
  * @return
  * @hibernate.property column="leuk_est"
  */
    public Integer getLeuk_est() {
        return this.leuk_est;
    }

    public void setLeuk_est(Integer leuk_est) {
        this.leuk_est = leuk_est;
    }



    public String getLeuk_estR() {
        return this.leuk_estR;
    }

    public void setLeuk_estR(String leuk_estR) {
        this.leuk_estR = leuk_estR;
    }



 /**
  * @return
  * @hibernate.property column="nitrite"
  */
    public Integer getNitrite() {
        return this.nitrite;
    }

    public void setNitrite(Integer nitrite) {
        this.nitrite = nitrite;
    }



    public String getNitriteR() {
        return this.nitriteR;
    }

    public void setNitriteR(String nitriteR) {
        this.nitriteR = nitriteR;
    }



 /**
  * @return
  * @hibernate.property column="urinalysis_ace_244"
  */
    public Integer getUrinalysis_ace_244() {
        return this.urinalysis_ace_244;
    }

    public void setUrinalysis_ace_244(Integer urinalysis_ace_244) {
        this.urinalysis_ace_244 = urinalysis_ace_244;
    }



    public String getUrinalysis_ace_244R() {
        return this.urinalysis_ace_244R;
    }

    public void setUrinalysis_ace_244R(String urinalysis_ace_244R) {
        this.urinalysis_ace_244R = urinalysis_ace_244R;
    }



 /**
  * @return
  * @hibernate.property column="urinalysis_alb_242"
  */
    public Integer getUrinalysis_alb_242() {
        return this.urinalysis_alb_242;
    }

    public void setUrinalysis_alb_242(Integer urinalysis_alb_242) {
        this.urinalysis_alb_242 = urinalysis_alb_242;
    }



    public String getUrinalysis_alb_242R() {
        return this.urinalysis_alb_242R;
    }

    public void setUrinalysis_alb_242R(String urinalysis_alb_242R) {
        this.urinalysis_alb_242R = urinalysis_alb_242R;
    }



 /**
  * @return
  * @hibernate.property column="urinalysis_glu_243"
  */
    public Integer getUrinalysis_glu_243() {
        return this.urinalysis_glu_243;
    }

    public void setUrinalysis_glu_243(Integer urinalysis_glu_243) {
        this.urinalysis_glu_243 = urinalysis_glu_243;
    }



    public String getUrinalysis_glu_243R() {
        return this.urinalysis_glu_243R;
    }

    public void setUrinalysis_glu_243R(String urinalysis_glu_243R) {
        this.urinalysis_glu_243R = urinalysis_glu_243R;
    }



 /**
  * @return
  * @hibernate.property column="wbc_urinalysis"
  */
    public Integer getWbc_urinalysis() {
        return this.wbc_urinalysis;
    }

    public void setWbc_urinalysis(Integer wbc_urinalysis) {
        this.wbc_urinalysis = wbc_urinalysis;
    }



    public String getWbc_urinalysisR() {
        return this.wbc_urinalysisR;
    }

    public void setWbc_urinalysisR(String wbc_urinalysisR) {
        this.wbc_urinalysisR = wbc_urinalysisR;
    }



 /**
  * @return
  * @hibernate.property column="bacteria"
  */
    public Integer getBacteria() {
        return this.bacteria;
    }

    public void setBacteria(Integer bacteria) {
        this.bacteria = bacteria;
    }



    public String getBacteriaR() {
        return this.bacteriaR;
    }

    public void setBacteriaR(String bacteriaR) {
        this.bacteriaR = bacteriaR;
    }



 /**
  * @return
  * @hibernate.property column="labtest_id"
  */
    public Long getLabtest_id() {
        return this.labtest_id;
    }

    public void setLabtest_id(Long labtest_id) {
        this.labtest_id = labtest_id;
    }



    public String getLabtest_idR() {
        return this.labtest_idR;
    }

    public void setLabtest_idR(String labtest_idR) {
        this.labtest_idR = labtest_idR;
    }



}