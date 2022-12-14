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
 * JavaBean ProbPostnatal generated from database;
 * generated by DynasiteSourceGenerator, inspired by XslBeanGenerator by Klaus Berg.
 *
 * @author Chris Kelley
 *         Date: 2014-10-27
 *         Time: 17:44:30
 *         Form Name: Postnatal Maternal Problem Visit
 *         Form Id: 78
 */

/**
 * @hibernate.joined-subclass table="probpostnatal"
 * @hibernate.joined-subclass-key column="id"
 */
public class ProbPostnatal extends EncounterData {

private Byte field1308;	//lower_abdominal_pains
private Date field1311;	//lower_abdominal_pains_date_onset
private Byte field1254;	//vag_bleeding_1254
private Date field1255;	//bleeding_date_of_onset_1255
private Byte field1252;	//vag_discharge_1252
private Date field1253;	//vag_discharge_date_of_onset_1253
private Byte field1309;	//fever
private Date field1312;	//fever_date_onset
private Byte field1258;	//elevated_blood_pressure
private Byte field1313;	//swelling_edema
private Byte field1314;	//trauma
private Byte field1310;	//nausea_vomiting
private Byte field1315;	//diarrhea
private Date field1316;	//diarrhea_date_onset
private Byte field1318;	//shortness_of_breath
private Byte field1259;	//possible_infection
private Byte field1358;	//backache
private Integer field159;	//height_159
private Float field228;	//weight_228
private Integer field161;	//heent_161
private String field162;	//heent_abnorm_162
private Integer field165;	//thyroid_165
private Integer field166;	//breasts_166
private Integer field169;	//heart_169
private String field170;	//heart_other_170
private Integer field172;	//abdomen_172
private String field173;	//abdomen_abnormal_173
private Integer field176;	//skin_176
private String field177;	//skin_abnorm_177
private Integer field174;	//extremities_174
private String field175;	//extremities_abnormal_175
private Integer field178;	//lymph_nodes_178
private Integer field179;	//rectum_179
private String field180;	//rectum_abnormal_180
private Integer field181;	//vulva_181
private String field182;	//vulva_abnormal_182
private Integer field183;	//vagina_183
private String field184;	//vagina_abnormal_184
private Integer field185;	//cervix_185
private String field186;	//cervix_abnormal_186
private Integer field187;	//uterus_187
private Integer field189;	//adnexa_189
private String field190;	//adnexa_abnormal_190
private Integer field191;	//varicosities_191
private Integer field163;	//teeth_163
private String field164;	//teeth_other_164
private Integer field1356;	//cns_192
private Boolean field1497;	//malaria_diag
private Boolean field1499;	//high_bp_diag
private Boolean field1270;	//anaemia
private Boolean field1265;	//preeclamp_hypert_1265
private Boolean field1787;	//secondary_pph
private Byte field1756;	//eclampsia
private Boolean field1786;	//breast_engorgement
private Boolean field1784;	//broken_episiotomy
private Boolean field1788;	//mastitis
private Boolean field1777;	//episiotomy_infection
private Boolean field1789;	//breast_abscess
private Boolean field1775;	//sepsis
private Boolean field1502;	//uti_diag
private Boolean field1781;	//endometritis
private Boolean field1504;	//tb_diag
private Boolean field2150;	//maternal_death_postnatal
private String field1359;	//diag_other
private Date field1212;	//date_of_ultrasound_1212
private Integer field1473;	//diagnosis_ultrasound
private String field1474;	//describe_abnormalities
private Integer field1782;	//disposition
private Integer field1841;	//uth_ward
private Date field1783;	//date_of_admission
private Integer field1349;	//priority_of_referral
private Integer field1620;	//transport
private String field1463;	//treatment_1463
private String field1464;	//comments_ante_prob_1464


 /**
  * @return
  * @hibernate.property column="lower_abdominal_pains"
  */
    public Byte getField1308() {
        return this.field1308;
    }

    public void setField1308(Byte field1308) {
        this.field1308 = field1308;
    }





 /**
  * @return
  * @hibernate.property column="lower_abdominal_pains_date_onset"
  */
    public Date getField1311() {
        return this.field1311;
    }

    public void setField1311(Date field1311) {
        this.field1311 = field1311;
    }





 /**
  * @return
  * @hibernate.property column="vag_bleeding_1254"
  */
    public Byte getField1254() {
        return this.field1254;
    }

    public void setField1254(Byte field1254) {
        this.field1254 = field1254;
    }





 /**
  * @return
  * @hibernate.property column="bleeding_date_of_onset_1255"
  */
    public Date getField1255() {
        return this.field1255;
    }

    public void setField1255(Date field1255) {
        this.field1255 = field1255;
    }





 /**
  * @return
  * @hibernate.property column="vag_discharge_1252"
  */
    public Byte getField1252() {
        return this.field1252;
    }

    public void setField1252(Byte field1252) {
        this.field1252 = field1252;
    }





 /**
  * @return
  * @hibernate.property column="vag_discharge_date_of_onset_1253"
  */
    public Date getField1253() {
        return this.field1253;
    }

    public void setField1253(Date field1253) {
        this.field1253 = field1253;
    }





 /**
  * @return
  * @hibernate.property column="fever"
  */
    public Byte getField1309() {
        return this.field1309;
    }

    public void setField1309(Byte field1309) {
        this.field1309 = field1309;
    }





 /**
  * @return
  * @hibernate.property column="fever_date_onset"
  */
    public Date getField1312() {
        return this.field1312;
    }

    public void setField1312(Date field1312) {
        this.field1312 = field1312;
    }





 /**
  * @return
  * @hibernate.property column="elevated_blood_pressure"
  */
    public Byte getField1258() {
        return this.field1258;
    }

    public void setField1258(Byte field1258) {
        this.field1258 = field1258;
    }





 /**
  * @return
  * @hibernate.property column="swelling_edema"
  */
    public Byte getField1313() {
        return this.field1313;
    }

    public void setField1313(Byte field1313) {
        this.field1313 = field1313;
    }





 /**
  * @return
  * @hibernate.property column="trauma"
  */
    public Byte getField1314() {
        return this.field1314;
    }

    public void setField1314(Byte field1314) {
        this.field1314 = field1314;
    }





 /**
  * @return
  * @hibernate.property column="nausea_vomiting"
  */
    public Byte getField1310() {
        return this.field1310;
    }

    public void setField1310(Byte field1310) {
        this.field1310 = field1310;
    }





 /**
  * @return
  * @hibernate.property column="diarrhea"
  */
    public Byte getField1315() {
        return this.field1315;
    }

    public void setField1315(Byte field1315) {
        this.field1315 = field1315;
    }





 /**
  * @return
  * @hibernate.property column="diarrhea_date_onset"
  */
    public Date getField1316() {
        return this.field1316;
    }

    public void setField1316(Date field1316) {
        this.field1316 = field1316;
    }





 /**
  * @return
  * @hibernate.property column="shortness_of_breath"
  */
    public Byte getField1318() {
        return this.field1318;
    }

    public void setField1318(Byte field1318) {
        this.field1318 = field1318;
    }





 /**
  * @return
  * @hibernate.property column="possible_infection"
  */
    public Byte getField1259() {
        return this.field1259;
    }

    public void setField1259(Byte field1259) {
        this.field1259 = field1259;
    }





 /**
  * @return
  * @hibernate.property column="backache"
  */
    public Byte getField1358() {
        return this.field1358;
    }

    public void setField1358(Byte field1358) {
        this.field1358 = field1358;
    }





 /**
  * @return
  * @hibernate.property column="height_159"
  */
    public Integer getField159() {
        return this.field159;
    }

    public void setField159(Integer field159) {
        this.field159 = field159;
    }





 /**
  * @return
  * @hibernate.property column="weight_228"
  */
    public Float getField228() {
        return this.field228;
    }

    public void setField228(Float field228) {
        this.field228 = field228;
    }





 /**
  * @return
  * @hibernate.property column="heent_161"
  */
    public Integer getField161() {
        return this.field161;
    }

    public void setField161(Integer field161) {
        this.field161 = field161;
    }





 /**
  * @return
  * @hibernate.property column="heent_abnorm_162" type="text"
  */
    public String getField162() {
        return this.field162;
    }

    public void setField162(String field162) {
        this.field162 = field162;
    }





 /**
  * @return
  * @hibernate.property column="thyroid_165"
  */
    public Integer getField165() {
        return this.field165;
    }

    public void setField165(Integer field165) {
        this.field165 = field165;
    }





 /**
  * @return
  * @hibernate.property column="breasts_166"
  */
    public Integer getField166() {
        return this.field166;
    }

    public void setField166(Integer field166) {
        this.field166 = field166;
    }





 /**
  * @return
  * @hibernate.property column="heart_169"
  */
    public Integer getField169() {
        return this.field169;
    }

    public void setField169(Integer field169) {
        this.field169 = field169;
    }





 /**
  * @return
  * @hibernate.property column="heart_other_170" type="text"
  */
    public String getField170() {
        return this.field170;
    }

    public void setField170(String field170) {
        this.field170 = field170;
    }





 /**
  * @return
  * @hibernate.property column="abdomen_172"
  */
    public Integer getField172() {
        return this.field172;
    }

    public void setField172(Integer field172) {
        this.field172 = field172;
    }





 /**
  * @return
  * @hibernate.property column="abdomen_abnormal_173" type="text"
  */
    public String getField173() {
        return this.field173;
    }

    public void setField173(String field173) {
        this.field173 = field173;
    }





 /**
  * @return
  * @hibernate.property column="skin_176"
  */
    public Integer getField176() {
        return this.field176;
    }

    public void setField176(Integer field176) {
        this.field176 = field176;
    }





 /**
  * @return
  * @hibernate.property column="skin_abnorm_177" type="text"
  */
    public String getField177() {
        return this.field177;
    }

    public void setField177(String field177) {
        this.field177 = field177;
    }





 /**
  * @return
  * @hibernate.property column="extremities_174"
  */
    public Integer getField174() {
        return this.field174;
    }

    public void setField174(Integer field174) {
        this.field174 = field174;
    }





 /**
  * @return
  * @hibernate.property column="extremities_abnormal_175" type="text"
  */
    public String getField175() {
        return this.field175;
    }

    public void setField175(String field175) {
        this.field175 = field175;
    }





 /**
  * @return
  * @hibernate.property column="lymph_nodes_178"
  */
    public Integer getField178() {
        return this.field178;
    }

    public void setField178(Integer field178) {
        this.field178 = field178;
    }





 /**
  * @return
  * @hibernate.property column="rectum_179"
  */
    public Integer getField179() {
        return this.field179;
    }

    public void setField179(Integer field179) {
        this.field179 = field179;
    }





 /**
  * @return
  * @hibernate.property column="rectum_abnormal_180" type="text"
  */
    public String getField180() {
        return this.field180;
    }

    public void setField180(String field180) {
        this.field180 = field180;
    }





 /**
  * @return
  * @hibernate.property column="vulva_181"
  */
    public Integer getField181() {
        return this.field181;
    }

    public void setField181(Integer field181) {
        this.field181 = field181;
    }





 /**
  * @return
  * @hibernate.property column="vulva_abnormal_182" type="text"
  */
    public String getField182() {
        return this.field182;
    }

    public void setField182(String field182) {
        this.field182 = field182;
    }





 /**
  * @return
  * @hibernate.property column="vagina_183"
  */
    public Integer getField183() {
        return this.field183;
    }

    public void setField183(Integer field183) {
        this.field183 = field183;
    }





 /**
  * @return
  * @hibernate.property column="vagina_abnormal_184" type="text"
  */
    public String getField184() {
        return this.field184;
    }

    public void setField184(String field184) {
        this.field184 = field184;
    }





 /**
  * @return
  * @hibernate.property column="cervix_185"
  */
    public Integer getField185() {
        return this.field185;
    }

    public void setField185(Integer field185) {
        this.field185 = field185;
    }





 /**
  * @return
  * @hibernate.property column="cervix_abnormal_186" type="text"
  */
    public String getField186() {
        return this.field186;
    }

    public void setField186(String field186) {
        this.field186 = field186;
    }





 /**
  * @return
  * @hibernate.property column="uterus_187"
  */
    public Integer getField187() {
        return this.field187;
    }

    public void setField187(Integer field187) {
        this.field187 = field187;
    }





 /**
  * @return
  * @hibernate.property column="adnexa_189"
  */
    public Integer getField189() {
        return this.field189;
    }

    public void setField189(Integer field189) {
        this.field189 = field189;
    }





 /**
  * @return
  * @hibernate.property column="adnexa_abnormal_190" type="text"
  */
    public String getField190() {
        return this.field190;
    }

    public void setField190(String field190) {
        this.field190 = field190;
    }





 /**
  * @return
  * @hibernate.property column="varicosities_191"
  */
    public Integer getField191() {
        return this.field191;
    }

    public void setField191(Integer field191) {
        this.field191 = field191;
    }





 /**
  * @return
  * @hibernate.property column="teeth_163"
  */
    public Integer getField163() {
        return this.field163;
    }

    public void setField163(Integer field163) {
        this.field163 = field163;
    }





 /**
  * @return
  * @hibernate.property column="teeth_other_164" type="text"
  */
    public String getField164() {
        return this.field164;
    }

    public void setField164(String field164) {
        this.field164 = field164;
    }





 /**
  * @return
  * @hibernate.property column="cns_192"
  */
    public Integer getField1356() {
        return this.field1356;
    }

    public void setField1356(Integer field1356) {
        this.field1356 = field1356;
    }





 /**
  * @return
  * @hibernate.property column="malaria_diag"
  */
    public Boolean getField1497() {
        return this.field1497;
    }

    public void setField1497(Boolean field1497) {
        this.field1497 = field1497;
    }





 /**
  * @return
  * @hibernate.property column="high_bp_diag"
  */
    public Boolean getField1499() {
        return this.field1499;
    }

    public void setField1499(Boolean field1499) {
        this.field1499 = field1499;
    }





 /**
  * @return
  * @hibernate.property column="anaemia"
  */
    public Boolean getField1270() {
        return this.field1270;
    }

    public void setField1270(Boolean field1270) {
        this.field1270 = field1270;
    }





 /**
  * @return
  * @hibernate.property column="preeclamp_hypert_1265"
  */
    public Boolean getField1265() {
        return this.field1265;
    }

    public void setField1265(Boolean field1265) {
        this.field1265 = field1265;
    }





 /**
  * @return
  * @hibernate.property column="secondary_pph"
  */
    public Boolean getField1787() {
        return this.field1787;
    }

    public void setField1787(Boolean field1787) {
        this.field1787 = field1787;
    }





 /**
  * @return
  * @hibernate.property column="eclampsia"
  */
    public Byte getField1756() {
        return this.field1756;
    }

    public void setField1756(Byte field1756) {
        this.field1756 = field1756;
    }





 /**
  * @return
  * @hibernate.property column="breast_engorgement"
  */
    public Boolean getField1786() {
        return this.field1786;
    }

    public void setField1786(Boolean field1786) {
        this.field1786 = field1786;
    }





 /**
  * @return
  * @hibernate.property column="broken_episiotomy"
  */
    public Boolean getField1784() {
        return this.field1784;
    }

    public void setField1784(Boolean field1784) {
        this.field1784 = field1784;
    }





 /**
  * @return
  * @hibernate.property column="mastitis"
  */
    public Boolean getField1788() {
        return this.field1788;
    }

    public void setField1788(Boolean field1788) {
        this.field1788 = field1788;
    }





 /**
  * @return
  * @hibernate.property column="episiotomy_infection"
  */
    public Boolean getField1777() {
        return this.field1777;
    }

    public void setField1777(Boolean field1777) {
        this.field1777 = field1777;
    }





 /**
  * @return
  * @hibernate.property column="breast_abscess"
  */
    public Boolean getField1789() {
        return this.field1789;
    }

    public void setField1789(Boolean field1789) {
        this.field1789 = field1789;
    }





 /**
  * @return
  * @hibernate.property column="sepsis"
  */
    public Boolean getField1775() {
        return this.field1775;
    }

    public void setField1775(Boolean field1775) {
        this.field1775 = field1775;
    }





 /**
  * @return
  * @hibernate.property column="uti_diag"
  */
    public Boolean getField1502() {
        return this.field1502;
    }

    public void setField1502(Boolean field1502) {
        this.field1502 = field1502;
    }





 /**
  * @return
  * @hibernate.property column="endometritis"
  */
    public Boolean getField1781() {
        return this.field1781;
    }

    public void setField1781(Boolean field1781) {
        this.field1781 = field1781;
    }





 /**
  * @return
  * @hibernate.property column="tb_diag"
  */
    public Boolean getField1504() {
        return this.field1504;
    }

    public void setField1504(Boolean field1504) {
        this.field1504 = field1504;
    }





 /**
  * @return
  * @hibernate.property column="maternal_death_postnatal"
  */
    public Boolean getField2150() {
        return this.field2150;
    }

    public void setField2150(Boolean field2150) {
        this.field2150 = field2150;
    }





 /**
  * @return
  * @hibernate.property column="diag_other" type="text"
  */
    public String getField1359() {
        return this.field1359;
    }

    public void setField1359(String field1359) {
        this.field1359 = field1359;
    }





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





 /**
  * @return
  * @hibernate.property column="disposition"
  */
    public Integer getField1782() {
        return this.field1782;
    }

    public void setField1782(Integer field1782) {
        this.field1782 = field1782;
    }





 /**
  * @return
  * @hibernate.property column="uth_ward"
  */
    public Integer getField1841() {
        return this.field1841;
    }

    public void setField1841(Integer field1841) {
        this.field1841 = field1841;
    }





 /**
  * @return
  * @hibernate.property column="date_of_admission"
  */
    public Date getField1783() {
        return this.field1783;
    }

    public void setField1783(Date field1783) {
        this.field1783 = field1783;
    }





 /**
  * @return
  * @hibernate.property column="priority_of_referral"
  */
    public Integer getField1349() {
        return this.field1349;
    }

    public void setField1349(Integer field1349) {
        this.field1349 = field1349;
    }





 /**
  * @return
  * @hibernate.property column="transport"
  */
    public Integer getField1620() {
        return this.field1620;
    }

    public void setField1620(Integer field1620) {
        this.field1620 = field1620;
    }





 /**
  * @return
  * @hibernate.property column="treatment_1463" type="text"
  */
    public String getField1463() {
        return this.field1463;
    }

    public void setField1463(String field1463) {
        this.field1463 = field1463;
    }





 /**
  * @return
  * @hibernate.property column="comments_ante_prob_1464" type="text"
  */
    public String getField1464() {
        return this.field1464;
    }

    public void setField1464(String field1464) {
        this.field1464 = field1464;
    }





}
