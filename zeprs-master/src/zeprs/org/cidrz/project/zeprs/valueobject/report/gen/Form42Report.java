/*
 *    Copyright 2003, 2004, 2005, 2006 Research Triangle Institute
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 */

package org.cidrz.project.zeprs.valueobject.report.gen;

import org.cidrz.project.zeprs.valueobject.EncounterData;
import org.cidrz.webapp.dynasite.valueobject.Patient;
import java.sql.Date;
import java.util.Set;
import java.sql.Time;
import org.cidrz.webapp.dynasite.valueobject.AuditInfo;
import java.util.TreeSet;

/**
 * JavaBean Form42Report generated from database;
 * generated by DynasiteSourceGenerator, inspired by XslBeanGenerator by Klaus Berg.
 *
 * @author Chris Kelley
 */

/**
 * @hibernate.joined-subclass table="form42"
 * @hibernate.joined-subclass-key column="id"
 */
public class Form42Report extends EncounterData {

private transient Integer miscarriage;
private String miscarriageR;
private transient String diagnosis_on_933;
private String diagnosis_on_933R;
private transient Integer surgical_tre_934;
private String surgical_tre_934R;
private transient String surgical_tre_935;
private String surgical_tre_935R;
private transient Integer medical_trea_936;
private String medical_trea_936R;
private transient String medical_trea_937;
private String medical_trea_937R;
private transient Integer testValue1;
private String testValue1R;
private transient Integer testValue2;
private String testValue2R;
private transient Integer testValue3;
private String testValue3R;


 /**
  * @return
  * @hibernate.property column="miscarriage"
  */
    public Integer getMiscarriage() {
        return this.miscarriage;
    }

    public void setMiscarriage(Integer miscarriage) {
        this.miscarriage = miscarriage;
    }



    public String getMiscarriageR() {
        return this.miscarriageR;
    }

    public void setMiscarriageR(String miscarriageR) {
        this.miscarriageR = miscarriageR;
    }



 /**
  * @return
  * @hibernate.property column="diagnosis_on_933" type="text"
  */
    public String getDiagnosis_on_933() {
        return this.diagnosis_on_933;
    }

    public void setDiagnosis_on_933(String diagnosis_on_933) {
        this.diagnosis_on_933 = diagnosis_on_933;
    }



    public String getDiagnosis_on_933R() {
        return this.diagnosis_on_933R;
    }

    public void setDiagnosis_on_933R(String diagnosis_on_933R) {
        this.diagnosis_on_933R = diagnosis_on_933R;
    }



 /**
  * @return
  * @hibernate.property column="surgical_tre_934"
  */
    public Integer getSurgical_tre_934() {
        return this.surgical_tre_934;
    }

    public void setSurgical_tre_934(Integer surgical_tre_934) {
        this.surgical_tre_934 = surgical_tre_934;
    }



    public String getSurgical_tre_934R() {
        return this.surgical_tre_934R;
    }

    public void setSurgical_tre_934R(String surgical_tre_934R) {
        this.surgical_tre_934R = surgical_tre_934R;
    }



 /**
  * @return
  * @hibernate.property column="surgical_tre_935" type="text"
  */
    public String getSurgical_tre_935() {
        return this.surgical_tre_935;
    }

    public void setSurgical_tre_935(String surgical_tre_935) {
        this.surgical_tre_935 = surgical_tre_935;
    }



    public String getSurgical_tre_935R() {
        return this.surgical_tre_935R;
    }

    public void setSurgical_tre_935R(String surgical_tre_935R) {
        this.surgical_tre_935R = surgical_tre_935R;
    }



 /**
  * @return
  * @hibernate.property column="medical_trea_936"
  */
    public Integer getMedical_trea_936() {
        return this.medical_trea_936;
    }

    public void setMedical_trea_936(Integer medical_trea_936) {
        this.medical_trea_936 = medical_trea_936;
    }



    public String getMedical_trea_936R() {
        return this.medical_trea_936R;
    }

    public void setMedical_trea_936R(String medical_trea_936R) {
        this.medical_trea_936R = medical_trea_936R;
    }



 /**
  * @return
  * @hibernate.property column="medical_trea_937" type="text"
  */
    public String getMedical_trea_937() {
        return this.medical_trea_937;
    }

    public void setMedical_trea_937(String medical_trea_937) {
        this.medical_trea_937 = medical_trea_937;
    }



    public String getMedical_trea_937R() {
        return this.medical_trea_937R;
    }

    public void setMedical_trea_937R(String medical_trea_937R) {
        this.medical_trea_937R = medical_trea_937R;
    }



 /**
  * @return
  * @hibernate.property column="testValue1"
  */
    public Integer getTestValue1() {
        return this.testValue1;
    }

    public void setTestValue1(Integer testValue1) {
        this.testValue1 = testValue1;
    }



    public String getTestValue1R() {
        return this.testValue1R;
    }

    public void setTestValue1R(String testValue1R) {
        this.testValue1R = testValue1R;
    }



 /**
  * @return
  * @hibernate.property column="testValue2"
  */
    public Integer getTestValue2() {
        return this.testValue2;
    }

    public void setTestValue2(Integer testValue2) {
        this.testValue2 = testValue2;
    }



    public String getTestValue2R() {
        return this.testValue2R;
    }

    public void setTestValue2R(String testValue2R) {
        this.testValue2R = testValue2R;
    }



 /**
  * @return
  * @hibernate.property column="testValue3"
  */
    public Integer getTestValue3() {
        return this.testValue3;
    }

    public void setTestValue3(Integer testValue3) {
        this.testValue3 = testValue3;
    }



    public String getTestValue3R() {
        return this.testValue3R;
    }

    public void setTestValue3R(String testValue3R) {
        this.testValue3R = testValue3R;
    }



}
