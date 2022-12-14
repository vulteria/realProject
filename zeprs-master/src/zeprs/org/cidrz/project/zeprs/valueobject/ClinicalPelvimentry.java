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

/**
 * JavaBean ClinicalPelvimentry generated from database;
 * generated by DynasiteSourceGenerator, inspired by XslBeanGenerator by Klaus Berg.
 *
 * @author Chris Kelley
 */

/**
 * @hibernate.joined-subclass table="clinicalpelvimentry"
 * @hibernate.joined-subclass-key column="id"
 */
public class ClinicalPelvimentry extends EncounterData {

private Integer field342;
private Integer field343;
private Integer field344;
private Integer field345;
private Integer field346;
private Integer field347;
private Integer field348;
private Integer field349;


 /**
  * @return
  * @hibernate.property column="diagonal_conjugate_342"
  */
    public Integer getfield342() {
        return this.field342;
    }

    public void setfield342(Integer field342) {
        this.field342 = field342;
    }



 /**
  * @return
  * @hibernate.property column="diagonal_conjugate_length_343"
  */
    public Integer getfield343() {
        return this.field343;
    }

    public void setfield343(Integer field343) {
        this.field343 = field343;
    }



 /**
  * @return
  * @hibernate.property column="ishcial_spines_344"
  */
    public Integer getfield344() {
        return this.field344;
    }

    public void setfield344(Integer field344) {
        this.field344 = field344;
    }



 /**
  * @return
  * @hibernate.property column="sub_pubic_arch_345"
  */
    public Integer getfield345() {
        return this.field345;
    }

    public void setfield345(Integer field345) {
        this.field345 = field345;
    }



 /**
  * @return
  * @hibernate.property column="curvature_of_sacrum_346"
  */
    public Integer getfield346() {
        return this.field346;
    }

    public void setfield346(Integer field346) {
        this.field346 = field346;
    }



 /**
  * @return
  * @hibernate.property column="intertuberous_diameter_347"
  */
    public Integer getfield347() {
        return this.field347;
    }

    public void setfield347(Integer field347) {
        this.field347 = field347;
    }



 /**
  * @return
  * @hibernate.property column="adequacy_of_pelvic_348"
  */
    public Integer getfield348() {
        return this.field348;
    }

    public void setfield348(Integer field348) {
        this.field348 = field348;
    }



 /**
  * @return
  * @hibernate.property column="pubic_arch_angle_349"
  */
    public Integer getfield349() {
        return this.field349;
    }

    public void setfield349(Integer field349) {
        this.field349 = field349;
    }



}
