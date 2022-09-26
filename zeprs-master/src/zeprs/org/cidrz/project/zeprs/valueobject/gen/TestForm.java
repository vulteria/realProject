/*
 *    Copyright 2003, 2004, 2005, 2006 Research Triangle Institute
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 */

package org.cidrz.project.zeprs.valueobject.gen;

import org.cidrz.project.zeprs.valueobject.gen.*;
import org.cidrz.project.zeprs.valueobject.EncounterData;
import org.cidrz.webapp.dynasite.valueobject.Patient;
import java.sql.Date;
import java.util.Set;
import java.sql.Time;
import org.cidrz.webapp.dynasite.valueobject.AuditInfo;
import java.util.TreeSet;

/**
 * JavaBean TestForm generated from database;
 * generated by DynasiteSourceGenerator, inspired by XslBeanGenerator by Klaus Berg.
 *
 * @author Chris Kelley
 *         Date: 2006-05-07
 *         Time: 21:19:20
 */

/**
 * @hibernate.joined-subclass table="testform"
 * @hibernate.joined-subclass-key column="id"
 */
public class TestForm extends EncounterData {

private String field1988;
private Integer field1999;
private Integer field1959;
private Integer field1989;
private Integer field1990;
private Integer field1993;
private String field1992;
private Integer field1994;
private Integer field1991;
private Integer field2000;
private Integer field2003;
private Integer field2002;
private Integer field1995;
private Integer field2001;


 /**
  * @return
  * @hibernate.property column="test2"
  */
    public String getField1988() {
        return this.field1988;
    }

    public void setField1988(String field1988) {
        this.field1988 = field1988;
    }





 /**
  * @return
  * @hibernate.property column="enumerama"
  */
    public Integer getField1999() {
        return this.field1999;
    }

    public void setField1999(Integer field1999) {
        this.field1999 = field1999;
    }





 /**
  * @return
  * @hibernate.property column="deleteme"
  */
    public Integer getField1959() {
        return this.field1959;
    }

    public void setField1959(Integer field1959) {
        this.field1959 = field1959;
    }





 /**
  * @return
  * @hibernate.property column="test3"
  */
    public Integer getField1989() {
        return this.field1989;
    }

    public void setField1989(Integer field1989) {
        this.field1989 = field1989;
    }





 /**
  * @return
  * @hibernate.property column="test4"
  */
    public Integer getField1990() {
        return this.field1990;
    }

    public void setField1990(Integer field1990) {
        this.field1990 = field1990;
    }





 /**
  * @return
  * @hibernate.property column="test7"
  */
    public Integer getField1993() {
        return this.field1993;
    }

    public void setField1993(Integer field1993) {
        this.field1993 = field1993;
    }





 /**
  * @return
  * @hibernate.property column="test6"
  */
    public String getField1992() {
        return this.field1992;
    }

    public void setField1992(String field1992) {
        this.field1992 = field1992;
    }





 /**
  * @return
  * @hibernate.property column="testa"
  */
    public Integer getField1994() {
        return this.field1994;
    }

    public void setField1994(Integer field1994) {
        this.field1994 = field1994;
    }





 /**
  * @return
  * @hibernate.property column="test5"
  */
    public Integer getField1991() {
        return this.field1991;
    }

    public void setField1991(Integer field1991) {
        this.field1991 = field1991;
    }





 /**
  * @return
  * @hibernate.property column="anotherenum"
  */
    public Integer getField2000() {
        return this.field2000;
    }

    public void setField2000(Integer field2000) {
        this.field2000 = field2000;
    }





 /**
  * @return
  * @hibernate.property column="thrombo"
  */
    public Integer getField2003() {
        return this.field2003;
    }

    public void setField2003(Integer field2003) {
        this.field2003 = field2003;
    }





 /**
  * @return
  * @hibernate.property column="teflon"
  */
    public Integer getField2002() {
        return this.field2002;
    }

    public void setField2002(Integer field2002) {
        this.field2002 = field2002;
    }





 /**
  * @return
  * @hibernate.property column="enumfield"
  */
    public Integer getField1995() {
        return this.field1995;
    }

    public void setField1995(Integer field1995) {
        this.field1995 = field1995;
    }





 /**
  * @return
  * @hibernate.property column="testRow"
  */
    public Integer getField2001() {
        return this.field2001;
    }

    public void setField2001(Integer field2001) {
        this.field2001 = field2001;
    }





}
