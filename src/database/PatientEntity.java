package database;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Arrays;

@Entity
@Table(name = "patient", schema = "cloudpacs", catalog = "")
public class PatientEntity {
    private long pk;
    private String patId;
    private String patIdIssuer;
    private String patName;
    private String patFnSx;
    private String patGnSx;
    private String patIName;
    private String patPName;
    private String patBirthdate;
    private String patSex;
    private String patCustom1;
    private String patCustom2;
    private String patCustom3;
    private Timestamp updatedTime;
    private Timestamp createdTime;
    private byte[] patAttrs;

    @Id
    @Column(name = "pk")
    public long getPk() {
        return pk;
    }

    public void setPk(long pk) {
        this.pk = pk;
    }

    @Basic
    @Column(name = "pat_id")
    public String getPatId() {
        return patId;
    }

    public void setPatId(String patId) {
        this.patId = patId;
    }

    @Basic
    @Column(name = "pat_id_issuer")
    public String getPatIdIssuer() {
        return patIdIssuer;
    }

    public void setPatIdIssuer(String patIdIssuer) {
        this.patIdIssuer = patIdIssuer;
    }

    @Basic
    @Column(name = "pat_name")
    public String getPatName() {
        return patName;
    }

    public void setPatName(String patName) {
        this.patName = patName;
    }

    @Basic
    @Column(name = "pat_fn_sx")
    public String getPatFnSx() {
        return patFnSx;
    }

    public void setPatFnSx(String patFnSx) {
        this.patFnSx = patFnSx;
    }

    @Basic
    @Column(name = "pat_gn_sx")
    public String getPatGnSx() {
        return patGnSx;
    }

    public void setPatGnSx(String patGnSx) {
        this.patGnSx = patGnSx;
    }

    @Basic
    @Column(name = "pat_i_name")
    public String getPatIName() {
        return patIName;
    }

    public void setPatIName(String patIName) {
        this.patIName = patIName;
    }

    @Basic
    @Column(name = "pat_p_name")
    public String getPatPName() {
        return patPName;
    }

    public void setPatPName(String patPName) {
        this.patPName = patPName;
    }

    @Basic
    @Column(name = "pat_birthdate")
    public String getPatBirthdate() {
        return patBirthdate;
    }

    public void setPatBirthdate(String patBirthdate) {
        this.patBirthdate = patBirthdate;
    }

    @Basic
    @Column(name = "pat_sex")
    public String getPatSex() {
        return patSex;
    }

    public void setPatSex(String patSex) {
        this.patSex = patSex;
    }

    @Basic
    @Column(name = "pat_custom1")
    public String getPatCustom1() {
        return patCustom1;
    }

    public void setPatCustom1(String patCustom1) {
        this.patCustom1 = patCustom1;
    }

    @Basic
    @Column(name = "pat_custom2")
    public String getPatCustom2() {
        return patCustom2;
    }

    public void setPatCustom2(String patCustom2) {
        this.patCustom2 = patCustom2;
    }

    @Basic
    @Column(name = "pat_custom3")
    public String getPatCustom3() {
        return patCustom3;
    }

    public void setPatCustom3(String patCustom3) {
        this.patCustom3 = patCustom3;
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
    @Column(name = "pat_attrs")
    public byte[] getPatAttrs() {
        return patAttrs;
    }

    public void setPatAttrs(byte[] patAttrs) {
        this.patAttrs = patAttrs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PatientEntity that = (PatientEntity) o;

        if (pk != that.pk) return false;
        if (patId != null ? !patId.equals(that.patId) : that.patId != null) return false;
        if (patIdIssuer != null ? !patIdIssuer.equals(that.patIdIssuer) : that.patIdIssuer != null) return false;
        if (patName != null ? !patName.equals(that.patName) : that.patName != null) return false;
        if (patFnSx != null ? !patFnSx.equals(that.patFnSx) : that.patFnSx != null) return false;
        if (patGnSx != null ? !patGnSx.equals(that.patGnSx) : that.patGnSx != null) return false;
        if (patIName != null ? !patIName.equals(that.patIName) : that.patIName != null) return false;
        if (patPName != null ? !patPName.equals(that.patPName) : that.patPName != null) return false;
        if (patBirthdate != null ? !patBirthdate.equals(that.patBirthdate) : that.patBirthdate != null) return false;
        if (patSex != null ? !patSex.equals(that.patSex) : that.patSex != null) return false;
        if (patCustom1 != null ? !patCustom1.equals(that.patCustom1) : that.patCustom1 != null) return false;
        if (patCustom2 != null ? !patCustom2.equals(that.patCustom2) : that.patCustom2 != null) return false;
        if (patCustom3 != null ? !patCustom3.equals(that.patCustom3) : that.patCustom3 != null) return false;
        if (updatedTime != null ? !updatedTime.equals(that.updatedTime) : that.updatedTime != null) return false;
        if (createdTime != null ? !createdTime.equals(that.createdTime) : that.createdTime != null) return false;
        if (!Arrays.equals(patAttrs, that.patAttrs)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (pk ^ (pk >>> 32));
        result = 31 * result + (patId != null ? patId.hashCode() : 0);
        result = 31 * result + (patIdIssuer != null ? patIdIssuer.hashCode() : 0);
        result = 31 * result + (patName != null ? patName.hashCode() : 0);
        result = 31 * result + (patFnSx != null ? patFnSx.hashCode() : 0);
        result = 31 * result + (patGnSx != null ? patGnSx.hashCode() : 0);
        result = 31 * result + (patIName != null ? patIName.hashCode() : 0);
        result = 31 * result + (patPName != null ? patPName.hashCode() : 0);
        result = 31 * result + (patBirthdate != null ? patBirthdate.hashCode() : 0);
        result = 31 * result + (patSex != null ? patSex.hashCode() : 0);
        result = 31 * result + (patCustom1 != null ? patCustom1.hashCode() : 0);
        result = 31 * result + (patCustom2 != null ? patCustom2.hashCode() : 0);
        result = 31 * result + (patCustom3 != null ? patCustom3.hashCode() : 0);
        result = 31 * result + (updatedTime != null ? updatedTime.hashCode() : 0);
        result = 31 * result + (createdTime != null ? createdTime.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(patAttrs);
        return result;
    }
}
