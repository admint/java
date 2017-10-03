package database;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Arrays;

@Entity
@Table(name = "study", schema = "cloudpacs", catalog = "")
public class StudyEntity {
    private long pk;
    private String studyIuid;
    private String studyId;
    private Timestamp studyDatetime;
    private String accessionNo;
    private String refPhysician;
    private String refPhysFnSx;
    private String refPhysGnSx;
    private String refPhysIName;
    private String refPhysPName;
    private String studyDesc;
    private String studyCustom1;
    private String studyCustom2;
    private String studyCustom3;
    private String studyStatusId;
    private String modsInStudy;
    private String cuidsInStudy;
    private int numSeries;
    private int numInstances;
    private String extRetrAet;
    private String retrieveAets;
    private String filesetIuid;
    private String filesetId;
    private int availability;
    private int studyStatus;
    private Timestamp checkedTime;
    private Timestamp updatedTime;
    private Timestamp createdTime;
    private byte[] studyAttrs;

    @Id
    @Column(name = "pk")
    public long getPk() {
        return pk;
    }

    public void setPk(long pk) {
        this.pk = pk;
    }

    @Basic
    @Column(name = "study_iuid")
    public String getStudyIuid() {
        return studyIuid;
    }

    public void setStudyIuid(String studyIuid) {
        this.studyIuid = studyIuid;
    }

    @Basic
    @Column(name = "study_id")
    public String getStudyId() {
        return studyId;
    }

    public void setStudyId(String studyId) {
        this.studyId = studyId;
    }

    @Basic
    @Column(name = "study_datetime")
    public Timestamp getStudyDatetime() {
        return studyDatetime;
    }

    public void setStudyDatetime(Timestamp studyDatetime) {
        this.studyDatetime = studyDatetime;
    }

    @Basic
    @Column(name = "accession_no")
    public String getAccessionNo() {
        return accessionNo;
    }

    public void setAccessionNo(String accessionNo) {
        this.accessionNo = accessionNo;
    }

    @Basic
    @Column(name = "ref_physician")
    public String getRefPhysician() {
        return refPhysician;
    }

    public void setRefPhysician(String refPhysician) {
        this.refPhysician = refPhysician;
    }

    @Basic
    @Column(name = "ref_phys_fn_sx")
    public String getRefPhysFnSx() {
        return refPhysFnSx;
    }

    public void setRefPhysFnSx(String refPhysFnSx) {
        this.refPhysFnSx = refPhysFnSx;
    }

    @Basic
    @Column(name = "ref_phys_gn_sx")
    public String getRefPhysGnSx() {
        return refPhysGnSx;
    }

    public void setRefPhysGnSx(String refPhysGnSx) {
        this.refPhysGnSx = refPhysGnSx;
    }

    @Basic
    @Column(name = "ref_phys_i_name")
    public String getRefPhysIName() {
        return refPhysIName;
    }

    public void setRefPhysIName(String refPhysIName) {
        this.refPhysIName = refPhysIName;
    }

    @Basic
    @Column(name = "ref_phys_p_name")
    public String getRefPhysPName() {
        return refPhysPName;
    }

    public void setRefPhysPName(String refPhysPName) {
        this.refPhysPName = refPhysPName;
    }

    @Basic
    @Column(name = "study_desc")
    public String getStudyDesc() {
        return studyDesc;
    }

    public void setStudyDesc(String studyDesc) {
        this.studyDesc = studyDesc;
    }

    @Basic
    @Column(name = "study_custom1")
    public String getStudyCustom1() {
        return studyCustom1;
    }

    public void setStudyCustom1(String studyCustom1) {
        this.studyCustom1 = studyCustom1;
    }

    @Basic
    @Column(name = "study_custom2")
    public String getStudyCustom2() {
        return studyCustom2;
    }

    public void setStudyCustom2(String studyCustom2) {
        this.studyCustom2 = studyCustom2;
    }

    @Basic
    @Column(name = "study_custom3")
    public String getStudyCustom3() {
        return studyCustom3;
    }

    public void setStudyCustom3(String studyCustom3) {
        this.studyCustom3 = studyCustom3;
    }

    @Basic
    @Column(name = "study_status_id")
    public String getStudyStatusId() {
        return studyStatusId;
    }

    public void setStudyStatusId(String studyStatusId) {
        this.studyStatusId = studyStatusId;
    }

    @Basic
    @Column(name = "mods_in_study")
    public String getModsInStudy() {
        return modsInStudy;
    }

    public void setModsInStudy(String modsInStudy) {
        this.modsInStudy = modsInStudy;
    }

    @Basic
    @Column(name = "cuids_in_study")
    public String getCuidsInStudy() {
        return cuidsInStudy;
    }

    public void setCuidsInStudy(String cuidsInStudy) {
        this.cuidsInStudy = cuidsInStudy;
    }

    @Basic
    @Column(name = "num_series")
    public int getNumSeries() {
        return numSeries;
    }

    public void setNumSeries(int numSeries) {
        this.numSeries = numSeries;
    }

    @Basic
    @Column(name = "num_instances")
    public int getNumInstances() {
        return numInstances;
    }

    public void setNumInstances(int numInstances) {
        this.numInstances = numInstances;
    }

    @Basic
    @Column(name = "ext_retr_aet")
    public String getExtRetrAet() {
        return extRetrAet;
    }

    public void setExtRetrAet(String extRetrAet) {
        this.extRetrAet = extRetrAet;
    }

    @Basic
    @Column(name = "retrieve_aets")
    public String getRetrieveAets() {
        return retrieveAets;
    }

    public void setRetrieveAets(String retrieveAets) {
        this.retrieveAets = retrieveAets;
    }

    @Basic
    @Column(name = "fileset_iuid")
    public String getFilesetIuid() {
        return filesetIuid;
    }

    public void setFilesetIuid(String filesetIuid) {
        this.filesetIuid = filesetIuid;
    }

    @Basic
    @Column(name = "fileset_id")
    public String getFilesetId() {
        return filesetId;
    }

    public void setFilesetId(String filesetId) {
        this.filesetId = filesetId;
    }

    @Basic
    @Column(name = "availability")
    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    @Basic
    @Column(name = "study_status")
    public int getStudyStatus() {
        return studyStatus;
    }

    public void setStudyStatus(int studyStatus) {
        this.studyStatus = studyStatus;
    }

    @Basic
    @Column(name = "checked_time")
    public Timestamp getCheckedTime() {
        return checkedTime;
    }

    public void setCheckedTime(Timestamp checkedTime) {
        this.checkedTime = checkedTime;
    }

    @Basic
    @Column(name = "updated_time")
    public Timestamp getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Timestamp updatedTime) {
        this.updatedTime = updatedTime;
    }

    @Basic
    @Column(name = "created_time")
    public Timestamp getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Timestamp createdTime) {
        this.createdTime = createdTime;
    }

    @Basic
    @Column(name = "study_attrs")
    public byte[] getStudyAttrs() {
        return studyAttrs;
    }

    public void setStudyAttrs(byte[] studyAttrs) {
        this.studyAttrs = studyAttrs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudyEntity that = (StudyEntity) o;

        if (pk != that.pk) return false;
        if (numSeries != that.numSeries) return false;
        if (numInstances != that.numInstances) return false;
        if (availability != that.availability) return false;
        if (studyStatus != that.studyStatus) return false;
        if (studyIuid != null ? !studyIuid.equals(that.studyIuid) : that.studyIuid != null) return false;
        if (studyId != null ? !studyId.equals(that.studyId) : that.studyId != null) return false;
        if (studyDatetime != null ? !studyDatetime.equals(that.studyDatetime) : that.studyDatetime != null)
            return false;
        if (accessionNo != null ? !accessionNo.equals(that.accessionNo) : that.accessionNo != null) return false;
        if (refPhysician != null ? !refPhysician.equals(that.refPhysician) : that.refPhysician != null) return false;
        if (refPhysFnSx != null ? !refPhysFnSx.equals(that.refPhysFnSx) : that.refPhysFnSx != null) return false;
        if (refPhysGnSx != null ? !refPhysGnSx.equals(that.refPhysGnSx) : that.refPhysGnSx != null) return false;
        if (refPhysIName != null ? !refPhysIName.equals(that.refPhysIName) : that.refPhysIName != null) return false;
        if (refPhysPName != null ? !refPhysPName.equals(that.refPhysPName) : that.refPhysPName != null) return false;
        if (studyDesc != null ? !studyDesc.equals(that.studyDesc) : that.studyDesc != null) return false;
        if (studyCustom1 != null ? !studyCustom1.equals(that.studyCustom1) : that.studyCustom1 != null) return false;
        if (studyCustom2 != null ? !studyCustom2.equals(that.studyCustom2) : that.studyCustom2 != null) return false;
        if (studyCustom3 != null ? !studyCustom3.equals(that.studyCustom3) : that.studyCustom3 != null) return false;
        if (studyStatusId != null ? !studyStatusId.equals(that.studyStatusId) : that.studyStatusId != null)
            return false;
        if (modsInStudy != null ? !modsInStudy.equals(that.modsInStudy) : that.modsInStudy != null) return false;
        if (cuidsInStudy != null ? !cuidsInStudy.equals(that.cuidsInStudy) : that.cuidsInStudy != null) return false;
        if (extRetrAet != null ? !extRetrAet.equals(that.extRetrAet) : that.extRetrAet != null) return false;
        if (retrieveAets != null ? !retrieveAets.equals(that.retrieveAets) : that.retrieveAets != null) return false;
        if (filesetIuid != null ? !filesetIuid.equals(that.filesetIuid) : that.filesetIuid != null) return false;
        if (filesetId != null ? !filesetId.equals(that.filesetId) : that.filesetId != null) return false;
        if (checkedTime != null ? !checkedTime.equals(that.checkedTime) : that.checkedTime != null) return false;
        if (updatedTime != null ? !updatedTime.equals(that.updatedTime) : that.updatedTime != null) return false;
        if (createdTime != null ? !createdTime.equals(that.createdTime) : that.createdTime != null) return false;
        if (!Arrays.equals(studyAttrs, that.studyAttrs)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (pk ^ (pk >>> 32));
        result = 31 * result + (studyIuid != null ? studyIuid.hashCode() : 0);
        result = 31 * result + (studyId != null ? studyId.hashCode() : 0);
        result = 31 * result + (studyDatetime != null ? studyDatetime.hashCode() : 0);
        result = 31 * result + (accessionNo != null ? accessionNo.hashCode() : 0);
        result = 31 * result + (refPhysician != null ? refPhysician.hashCode() : 0);
        result = 31 * result + (refPhysFnSx != null ? refPhysFnSx.hashCode() : 0);
        result = 31 * result + (refPhysGnSx != null ? refPhysGnSx.hashCode() : 0);
        result = 31 * result + (refPhysIName != null ? refPhysIName.hashCode() : 0);
        result = 31 * result + (refPhysPName != null ? refPhysPName.hashCode() : 0);
        result = 31 * result + (studyDesc != null ? studyDesc.hashCode() : 0);
        result = 31 * result + (studyCustom1 != null ? studyCustom1.hashCode() : 0);
        result = 31 * result + (studyCustom2 != null ? studyCustom2.hashCode() : 0);
        result = 31 * result + (studyCustom3 != null ? studyCustom3.hashCode() : 0);
        result = 31 * result + (studyStatusId != null ? studyStatusId.hashCode() : 0);
        result = 31 * result + (modsInStudy != null ? modsInStudy.hashCode() : 0);
        result = 31 * result + (cuidsInStudy != null ? cuidsInStudy.hashCode() : 0);
        result = 31 * result + numSeries;
        result = 31 * result + numInstances;
        result = 31 * result + (extRetrAet != null ? extRetrAet.hashCode() : 0);
        result = 31 * result + (retrieveAets != null ? retrieveAets.hashCode() : 0);
        result = 31 * result + (filesetIuid != null ? filesetIuid.hashCode() : 0);
        result = 31 * result + (filesetId != null ? filesetId.hashCode() : 0);
        result = 31 * result + availability;
        result = 31 * result + studyStatus;
        result = 31 * result + (checkedTime != null ? checkedTime.hashCode() : 0);
        result = 31 * result + (updatedTime != null ? updatedTime.hashCode() : 0);
        result = 31 * result + (createdTime != null ? createdTime.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(studyAttrs);
        return result;
    }
}
