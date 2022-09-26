/*
 *    Copyright 2003, 2004, 2005, 2006 Research Triangle Institute
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 */

package org.cidrz.project.zeprs.valueobject;

import org.cidrz.project.zeprs.valueobject.*;
import org.cidrz.webapp.dynasite.valueobject.Patient;
import java.sql.Date;
import java.util.Set;
import java.sql.Time;
import org.cidrz.webapp.dynasite.valueobject.AuditInfo;
import java.util.TreeSet;

/**
 * JavaBean Form42 generated from database;
 * generated by DynasiteSourceGenerator, inspired by XslBeanGenerator by Klaus Berg.
 *
 * @author Chris Kelley
 */

/**
 * @hibernate.joined-subclass table="form42"
 * @hibernate.joined-subclass-key column="id"
 */
public class Form42 extends EncounterData {

private Integer field932;
private String field933;
private Integer field934;
private String field935;
private Integer field936;
private String field937;
private Integer field1956;
private Integer field1957;
private Integer field1958;


 /**
  * @return
  * @hibernate.property column="miscarriage"
  */
    public Integer getField932() {
        return this.field932;
    }

    public void setField932(Integer field932) {
        this.field932 = field932;
    }





 /**
  * @return
  * @hibernate.property column="diagnosis_on_933" type="text"
  */
    public String getField933() {
        return this.field933;
    }

    public void setField933(String field933) {
        this.field933 = field933;
    }





 /**
  * @return
  * @hibernate.property column="surgical_tre_934"
  */
    public Integer getField934() {
        return this.field934;
    }

    public void setField934(Integer field934) {
        this.field934 = field934;
    }





 /**
  * @return
  * @hibernate.property column="surgical_tre_935" type="text"
  */
    public String getField935() {
        return this.field935;
    }

    public void setField935(String field935) {
        this.field935 = field935;
    }





 /**
  * @return
  * @hibernate.property column="medical_trea_936"
  */
    public Integer getField936() {
        return this.field936;
    }

    public void setField936(Integer field936) {
        this.field936 = field936;
    }





 /**
  * @return
  * @hibernate.property column="medical_trea_937" type="text"
  */
    public String getField937() {
        return this.field937;
    }

    public void setField937(String field937) {
        this.field937 = field937;
    }





 /**
  * @return
  * @hibernate.property column="testValue1"
  */
    public Integer getField1956() {
        return this.field1956;
    }

    public void setField1956(Integer field1956) {
        this.field1956 = field1956;
    }





 /**
  * @return
  * @hibernate.property column="testValue2"
  */
    public Integer getField1957() {
        return this.field1957;
    }

    public void setField1957(Integer field1957) {
        this.field1957 = field1957;
    }





 /**
  * @return
  * @hibernate.property column="testValue3"
  */
    public Integer getField1958() {
        return this.field1958;
    }

    public void setField1958(Integer field1958) {
        this.field1958 = field1958;
    }





}
