package database;

import javax.persistence.*;

@Entity
@Table(name = "study_permission", schema = "cloudpacs", catalog = "")
public class StudyPermissionEntity {
    private long pk;
    private String studyIuid;
    private String action;
    private String roles;

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
    @Column(name = "action")
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Basic
    @Column(name = "roles")
    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudyPermissionEntity that = (StudyPermissionEntity) o;

        if (pk != that.pk) return false;
        if (studyIuid != null ? !studyIuid.equals(that.studyIuid) : that.studyIuid != null) return false;
        if (action != null ? !action.equals(that.action) : that.action != null) return false;
        if (roles != null ? !roles.equals(that.roles) : that.roles != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (pk ^ (pk >>> 32));
        result = 31 * result + (studyIuid != null ? studyIuid.hashCode() : 0);
        result = 31 * result + (action != null ? action.hashCode() : 0);
        result = 31 * result + (roles != null ? roles.hashCode() : 0);
        return result;
    }
}
