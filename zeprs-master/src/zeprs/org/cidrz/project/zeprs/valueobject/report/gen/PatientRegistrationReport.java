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
 * JavaBean PatientRegistrationReport generated from database;
 * generated by DynasiteSourceGenerator, inspired by XslBeanGenerator by Klaus Berg.
 *
 * @author Chris Kelley
 *         Date: 2014-10-27
 *         Time: 17:44:31
 *         Form Name: Patient Registration and Identification
 *         Form Id: 1
 */

/**
 * @hibernate.joined-subclass table="patientregistration"
 * @hibernate.joined-subclass-key column="id"
 */
public class PatientRegistrationReport extends EncounterData {

private transient String surname_6;	//surname_6
private String surname_6R;
private transient String forenames_7;	//forenames_7
private String forenames_7R;
private transient Integer sex_490;	//sex_490
private String sex_490R;
private transient String nrc_no_9;	//nrc_no_9
private String nrc_no_9R;
private transient String obstetric_record_number_1134;	//obstetric_record_number_1134
private String obstetric_record_number_1134R;
private transient String alternate_id;	//alternate_id
private String alternate_idR;
private transient String firm;	//firm
private String firmR;
private transient Integer uth_referral_type;	//uth_referral_type
private String uth_referral_typeR;
private transient Byte disable_lab_import;	//disable_lab_import
private String disable_lab_importR;
private transient String district_pat_13;	//district_pat_13
private String district_pat_13R;
private transient String new_patient_site_id;	//new_patient_site_id
private String new_patient_site_idR;
private transient String patient_id_number;	//patient_id_number
private String patient_id_numberR;
private transient Date birth_date_17;	//birth_date_17
private String birth_date_17R;
private transient Integer age_at_first_attendence_1135;	//age_at_first_attendence_1135
private String age_at_first_attendence_1135R;
private transient Integer education_st_11;	//education_st_11
private String education_st_11R;
private transient Integer marital_stat_10;	//marital_stat_10
private String marital_stat_10R;
private transient String residential_19;	//residential_19
private String residential_19R;
private transient String residential_20;	//residential_20
private String residential_20R;
private transient String nearby_place_worship_39;	//nearby_place_worship_39
private String nearby_place_worship_39R;
private transient String phone;	//phone
private String phoneR;
private transient Integer occupation_12;	//occupation_12
private String occupation_12R;
private transient String occupation_other;	//occupation_other
private String occupation_otherR;
private transient Integer religion_1239;	//religion_1239
private String religion_1239R;
private transient String religion_other_1240;	//religion_other_1240
private String religion_other_1240R;
private transient String surname_p_father_24;	//surname_p_father_24
private String surname_p_father_24R;
private transient String forenames_p_father_25;	//forenames_p_father_25
private String forenames_p_father_25R;
private transient String surname_husband_26;	//surname_husband_26
private String surname_husband_26R;
private transient String forenames_husband_27;	//forenames_husband_27
private String forenames_husband_27R;
private transient Integer occupation_husband_28;	//occupation_husband_28
private String occupation_husband_28R;
private transient String tel_no_husband_32;	//tel_no_husband_32
private String tel_no_husband_32R;
private transient String surname_guardian_33;	//surname_guardian_33
private String surname_guardian_33R;
private transient String forenames_guardian_34;	//forenames_guardian_34
private String forenames_guardian_34R;
private transient String surname_emerg_contact_35;	//surname_emerg_contact_35
private String surname_emerg_contact_35R;
private transient String forenames_emerg_contact_36;	//forenames_emerg_contact_36
private String forenames_emerg_contact_36R;
private transient String address_emerg_contact_37;	//address_emerg_contact_37
private String address_emerg_contact_37R;
private transient String tel_no_emerg_contact_38;	//tel_no_emerg_contact_38
private String tel_no_emerg_contact_38R;


 /**
  * @return
  * @hibernate.property column="surname_6"
  */
    public String getSurname_6() {
        return this.surname_6;
    }

    public void setSurname_6(String surname_6) {
        this.surname_6 = surname_6;
    }



    public String getSurname_6R() {
        return this.surname_6R;
    }

    public void setSurname_6R(String surname_6R) {
        this.surname_6R = surname_6R;
    }



 /**
  * @return
  * @hibernate.property column="forenames_7"
  */
    public String getForenames_7() {
        return this.forenames_7;
    }

    public void setForenames_7(String forenames_7) {
        this.forenames_7 = forenames_7;
    }



    public String getForenames_7R() {
        return this.forenames_7R;
    }

    public void setForenames_7R(String forenames_7R) {
        this.forenames_7R = forenames_7R;
    }



 /**
  * @return
  * @hibernate.property column="sex_490"
  */
    public Integer getSex_490() {
        return this.sex_490;
    }

    public void setSex_490(Integer sex_490) {
        this.sex_490 = sex_490;
    }



    public String getSex_490R() {
        return this.sex_490R;
    }

    public void setSex_490R(String sex_490R) {
        this.sex_490R = sex_490R;
    }



 /**
  * @return
  * @hibernate.property column="nrc_no_9"
  */
    public String getNrc_no_9() {
        return this.nrc_no_9;
    }

    public void setNrc_no_9(String nrc_no_9) {
        this.nrc_no_9 = nrc_no_9;
    }



    public String getNrc_no_9R() {
        return this.nrc_no_9R;
    }

    public void setNrc_no_9R(String nrc_no_9R) {
        this.nrc_no_9R = nrc_no_9R;
    }



 /**
  * @return
  * @hibernate.property column="obstetric_record_number_1134"
  */
    public String getObstetric_record_number_1134() {
        return this.obstetric_record_number_1134;
    }

    public void setObstetric_record_number_1134(String obstetric_record_number_1134) {
        this.obstetric_record_number_1134 = obstetric_record_number_1134;
    }



    public String getObstetric_record_number_1134R() {
        return this.obstetric_record_number_1134R;
    }

    public void setObstetric_record_number_1134R(String obstetric_record_number_1134R) {
        this.obstetric_record_number_1134R = obstetric_record_number_1134R;
    }



 /**
  * @return
  * @hibernate.property column="alternate_id"
  */
    public String getAlternate_id() {
        return this.alternate_id;
    }

    public void setAlternate_id(String alternate_id) {
        this.alternate_id = alternate_id;
    }



    public String getAlternate_idR() {
        return this.alternate_idR;
    }

    public void setAlternate_idR(String alternate_idR) {
        this.alternate_idR = alternate_idR;
    }



 /**
  * @return
  * @hibernate.property column="firm"
  */
    public String getFirm() {
        return this.firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }



    public String getFirmR() {
        return this.firmR;
    }

    public void setFirmR(String firmR) {
        this.firmR = firmR;
    }



 /**
  * @return
  * @hibernate.property column="uth_referral_type"
  */
    public Integer getUth_referral_type() {
        return this.uth_referral_type;
    }

    public void setUth_referral_type(Integer uth_referral_type) {
        this.uth_referral_type = uth_referral_type;
    }



    public String getUth_referral_typeR() {
        return this.uth_referral_typeR;
    }

    public void setUth_referral_typeR(String uth_referral_typeR) {
        this.uth_referral_typeR = uth_referral_typeR;
    }



 /**
  * @return
  * @hibernate.property column="disable_lab_import"
  */
    public Byte getDisable_lab_import() {
        return this.disable_lab_import;
    }

    public void setDisable_lab_import(Byte disable_lab_import) {
        this.disable_lab_import = disable_lab_import;
    }



    public String getDisable_lab_importR() {
        return this.disable_lab_importR;
    }

    public void setDisable_lab_importR(String disable_lab_importR) {
        this.disable_lab_importR = disable_lab_importR;
    }



 /**
  * @return
  * @hibernate.property column="district_pat_13"
  */
    public String getDistrict_pat_13() {
        return this.district_pat_13;
    }

    public void setDistrict_pat_13(String district_pat_13) {
        this.district_pat_13 = district_pat_13;
    }



    public String getDistrict_pat_13R() {
        return this.district_pat_13R;
    }

    public void setDistrict_pat_13R(String district_pat_13R) {
        this.district_pat_13R = district_pat_13R;
    }



 /**
  * @return
  * @hibernate.property column="new_patient_site_id"
  */
    public String getNew_patient_site_id() {
        return this.new_patient_site_id;
    }

    public void setNew_patient_site_id(String new_patient_site_id) {
        this.new_patient_site_id = new_patient_site_id;
    }



    public String getNew_patient_site_idR() {
        return this.new_patient_site_idR;
    }

    public void setNew_patient_site_idR(String new_patient_site_idR) {
        this.new_patient_site_idR = new_patient_site_idR;
    }



 /**
  * @return
  * @hibernate.property column="patient_id_number"
  */
    public String getPatient_id_number() {
        return this.patient_id_number;
    }

    public void setPatient_id_number(String patient_id_number) {
        this.patient_id_number = patient_id_number;
    }



    public String getPatient_id_numberR() {
        return this.patient_id_numberR;
    }

    public void setPatient_id_numberR(String patient_id_numberR) {
        this.patient_id_numberR = patient_id_numberR;
    }



 /**
  * @return
  * @hibernate.property column="birth_date_17"
  */
    public Date getBirth_date_17() {
        return this.birth_date_17;
    }

    public void setBirth_date_17(Date birth_date_17) {
        this.birth_date_17 = birth_date_17;
    }



    public String getBirth_date_17R() {
        return this.birth_date_17R;
    }

    public void setBirth_date_17R(String birth_date_17R) {
        this.birth_date_17R = birth_date_17R;
    }



 /**
  * @return
  * @hibernate.property column="age_at_first_attendence_1135"
  */
    public Integer getAge_at_first_attendence_1135() {
        return this.age_at_first_attendence_1135;
    }

    public void setAge_at_first_attendence_1135(Integer age_at_first_attendence_1135) {
        this.age_at_first_attendence_1135 = age_at_first_attendence_1135;
    }



    public String getAge_at_first_attendence_1135R() {
        return this.age_at_first_attendence_1135R;
    }

    public void setAge_at_first_attendence_1135R(String age_at_first_attendence_1135R) {
        this.age_at_first_attendence_1135R = age_at_first_attendence_1135R;
    }



 /**
  * @return
  * @hibernate.property column="education_st_11"
  */
    public Integer getEducation_st_11() {
        return this.education_st_11;
    }

    public void setEducation_st_11(Integer education_st_11) {
        this.education_st_11 = education_st_11;
    }



    public String getEducation_st_11R() {
        return this.education_st_11R;
    }

    public void setEducation_st_11R(String education_st_11R) {
        this.education_st_11R = education_st_11R;
    }



 /**
  * @return
  * @hibernate.property column="marital_stat_10"
  */
    public Integer getMarital_stat_10() {
        return this.marital_stat_10;
    }

    public void setMarital_stat_10(Integer marital_stat_10) {
        this.marital_stat_10 = marital_stat_10;
    }



    public String getMarital_stat_10R() {
        return this.marital_stat_10R;
    }

    public void setMarital_stat_10R(String marital_stat_10R) {
        this.marital_stat_10R = marital_stat_10R;
    }



 /**
  * @return
  * @hibernate.property column="residential_19"
  */
    public String getResidential_19() {
        return this.residential_19;
    }

    public void setResidential_19(String residential_19) {
        this.residential_19 = residential_19;
    }



    public String getResidential_19R() {
        return this.residential_19R;
    }

    public void setResidential_19R(String residential_19R) {
        this.residential_19R = residential_19R;
    }



 /**
  * @return
  * @hibernate.property column="residential_20"
  */
    public String getResidential_20() {
        return this.residential_20;
    }

    public void setResidential_20(String residential_20) {
        this.residential_20 = residential_20;
    }



    public String getResidential_20R() {
        return this.residential_20R;
    }

    public void setResidential_20R(String residential_20R) {
        this.residential_20R = residential_20R;
    }



 /**
  * @return
  * @hibernate.property column="nearby_place_worship_39"
  */
    public String getNearby_place_worship_39() {
        return this.nearby_place_worship_39;
    }

    public void setNearby_place_worship_39(String nearby_place_worship_39) {
        this.nearby_place_worship_39 = nearby_place_worship_39;
    }



    public String getNearby_place_worship_39R() {
        return this.nearby_place_worship_39R;
    }

    public void setNearby_place_worship_39R(String nearby_place_worship_39R) {
        this.nearby_place_worship_39R = nearby_place_worship_39R;
    }



 /**
  * @return
  * @hibernate.property column="phone"
  */
    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }



    public String getPhoneR() {
        return this.phoneR;
    }

    public void setPhoneR(String phoneR) {
        this.phoneR = phoneR;
    }



 /**
  * @return
  * @hibernate.property column="occupation_12"
  */
    public Integer getOccupation_12() {
        return this.occupation_12;
    }

    public void setOccupation_12(Integer occupation_12) {
        this.occupation_12 = occupation_12;
    }



    public String getOccupation_12R() {
        return this.occupation_12R;
    }

    public void setOccupation_12R(String occupation_12R) {
        this.occupation_12R = occupation_12R;
    }



 /**
  * @return
  * @hibernate.property column="occupation_other"
  */
    public String getOccupation_other() {
        return this.occupation_other;
    }

    public void setOccupation_other(String occupation_other) {
        this.occupation_other = occupation_other;
    }



    public String getOccupation_otherR() {
        return this.occupation_otherR;
    }

    public void setOccupation_otherR(String occupation_otherR) {
        this.occupation_otherR = occupation_otherR;
    }



 /**
  * @return
  * @hibernate.property column="religion_1239"
  */
    public Integer getReligion_1239() {
        return this.religion_1239;
    }

    public void setReligion_1239(Integer religion_1239) {
        this.religion_1239 = religion_1239;
    }



    public String getReligion_1239R() {
        return this.religion_1239R;
    }

    public void setReligion_1239R(String religion_1239R) {
        this.religion_1239R = religion_1239R;
    }



 /**
  * @return
  * @hibernate.property column="religion_other_1240"
  */
    public String getReligion_other_1240() {
        return this.religion_other_1240;
    }

    public void setReligion_other_1240(String religion_other_1240) {
        this.religion_other_1240 = religion_other_1240;
    }



    public String getReligion_other_1240R() {
        return this.religion_other_1240R;
    }

    public void setReligion_other_1240R(String religion_other_1240R) {
        this.religion_other_1240R = religion_other_1240R;
    }



 /**
  * @return
  * @hibernate.property column="surname_p_father_24"
  */
    public String getSurname_p_father_24() {
        return this.surname_p_father_24;
    }

    public void setSurname_p_father_24(String surname_p_father_24) {
        this.surname_p_father_24 = surname_p_father_24;
    }



    public String getSurname_p_father_24R() {
        return this.surname_p_father_24R;
    }

    public void setSurname_p_father_24R(String surname_p_father_24R) {
        this.surname_p_father_24R = surname_p_father_24R;
    }



 /**
  * @return
  * @hibernate.property column="forenames_p_father_25"
  */
    public String getForenames_p_father_25() {
        return this.forenames_p_father_25;
    }

    public void setForenames_p_father_25(String forenames_p_father_25) {
        this.forenames_p_father_25 = forenames_p_father_25;
    }



    public String getForenames_p_father_25R() {
        return this.forenames_p_father_25R;
    }

    public void setForenames_p_father_25R(String forenames_p_father_25R) {
        this.forenames_p_father_25R = forenames_p_father_25R;
    }



 /**
  * @return
  * @hibernate.property column="surname_husband_26"
  */
    public String getSurname_husband_26() {
        return this.surname_husband_26;
    }

    public void setSurname_husband_26(String surname_husband_26) {
        this.surname_husband_26 = surname_husband_26;
    }



    public String getSurname_husband_26R() {
        return this.surname_husband_26R;
    }

    public void setSurname_husband_26R(String surname_husband_26R) {
        this.surname_husband_26R = surname_husband_26R;
    }



 /**
  * @return
  * @hibernate.property column="forenames_husband_27"
  */
    public String getForenames_husband_27() {
        return this.forenames_husband_27;
    }

    public void setForenames_husband_27(String forenames_husband_27) {
        this.forenames_husband_27 = forenames_husband_27;
    }



    public String getForenames_husband_27R() {
        return this.forenames_husband_27R;
    }

    public void setForenames_husband_27R(String forenames_husband_27R) {
        this.forenames_husband_27R = forenames_husband_27R;
    }



 /**
  * @return
  * @hibernate.property column="occupation_husband_28"
  */
    public Integer getOccupation_husband_28() {
        return this.occupation_husband_28;
    }

    public void setOccupation_husband_28(Integer occupation_husband_28) {
        this.occupation_husband_28 = occupation_husband_28;
    }



    public String getOccupation_husband_28R() {
        return this.occupation_husband_28R;
    }

    public void setOccupation_husband_28R(String occupation_husband_28R) {
        this.occupation_husband_28R = occupation_husband_28R;
    }



 /**
  * @return
  * @hibernate.property column="tel_no_husband_32"
  */
    public String getTel_no_husband_32() {
        return this.tel_no_husband_32;
    }

    public void setTel_no_husband_32(String tel_no_husband_32) {
        this.tel_no_husband_32 = tel_no_husband_32;
    }



    public String getTel_no_husband_32R() {
        return this.tel_no_husband_32R;
    }

    public void setTel_no_husband_32R(String tel_no_husband_32R) {
        this.tel_no_husband_32R = tel_no_husband_32R;
    }



 /**
  * @return
  * @hibernate.property column="surname_guardian_33"
  */
    public String getSurname_guardian_33() {
        return this.surname_guardian_33;
    }

    public void setSurname_guardian_33(String surname_guardian_33) {
        this.surname_guardian_33 = surname_guardian_33;
    }



    public String getSurname_guardian_33R() {
        return this.surname_guardian_33R;
    }

    public void setSurname_guardian_33R(String surname_guardian_33R) {
        this.surname_guardian_33R = surname_guardian_33R;
    }



 /**
  * @return
  * @hibernate.property column="forenames_guardian_34"
  */
    public String getForenames_guardian_34() {
        return this.forenames_guardian_34;
    }

    public void setForenames_guardian_34(String forenames_guardian_34) {
        this.forenames_guardian_34 = forenames_guardian_34;
    }



    public String getForenames_guardian_34R() {
        return this.forenames_guardian_34R;
    }

    public void setForenames_guardian_34R(String forenames_guardian_34R) {
        this.forenames_guardian_34R = forenames_guardian_34R;
    }



 /**
  * @return
  * @hibernate.property column="surname_emerg_contact_35"
  */
    public String getSurname_emerg_contact_35() {
        return this.surname_emerg_contact_35;
    }

    public void setSurname_emerg_contact_35(String surname_emerg_contact_35) {
        this.surname_emerg_contact_35 = surname_emerg_contact_35;
    }



    public String getSurname_emerg_contact_35R() {
        return this.surname_emerg_contact_35R;
    }

    public void setSurname_emerg_contact_35R(String surname_emerg_contact_35R) {
        this.surname_emerg_contact_35R = surname_emerg_contact_35R;
    }



 /**
  * @return
  * @hibernate.property column="forenames_emerg_contact_36"
  */
    public String getForenames_emerg_contact_36() {
        return this.forenames_emerg_contact_36;
    }

    public void setForenames_emerg_contact_36(String forenames_emerg_contact_36) {
        this.forenames_emerg_contact_36 = forenames_emerg_contact_36;
    }



    public String getForenames_emerg_contact_36R() {
        return this.forenames_emerg_contact_36R;
    }

    public void setForenames_emerg_contact_36R(String forenames_emerg_contact_36R) {
        this.forenames_emerg_contact_36R = forenames_emerg_contact_36R;
    }



 /**
  * @return
  * @hibernate.property column="address_emerg_contact_37"
  */
    public String getAddress_emerg_contact_37() {
        return this.address_emerg_contact_37;
    }

    public void setAddress_emerg_contact_37(String address_emerg_contact_37) {
        this.address_emerg_contact_37 = address_emerg_contact_37;
    }



    public String getAddress_emerg_contact_37R() {
        return this.address_emerg_contact_37R;
    }

    public void setAddress_emerg_contact_37R(String address_emerg_contact_37R) {
        this.address_emerg_contact_37R = address_emerg_contact_37R;
    }



 /**
  * @return
  * @hibernate.property column="tel_no_emerg_contact_38"
  */
    public String getTel_no_emerg_contact_38() {
        return this.tel_no_emerg_contact_38;
    }

    public void setTel_no_emerg_contact_38(String tel_no_emerg_contact_38) {
        this.tel_no_emerg_contact_38 = tel_no_emerg_contact_38;
    }



    public String getTel_no_emerg_contact_38R() {
        return this.tel_no_emerg_contact_38R;
    }

    public void setTel_no_emerg_contact_38R(String tel_no_emerg_contact_38R) {
        this.tel_no_emerg_contact_38R = tel_no_emerg_contact_38R;
    }



}
