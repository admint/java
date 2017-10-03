package database;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "study_on_fs", schema = "cloudpacs", catalog = "")
public class StudyOnFsEntity {
    private long pk;
    private Timestamp accessTime;
    private boolean markToDelete;

    @Id
    @Column(name = "pk")
    public long getPk() {
        return pk;
    }

    public void setPk(long pk) {
        this.pk = pk;
    }

    @Basic
    @Column(name = "access_time")
    public Timestamp getAccessTime() {
        return accessTime;
    }

    public void setAccessTime(Timestamp accessTime) {
        this.accessTime = accessTime;
    }

    @Basic
    @Column(name = "mark_to_delete")
    public boolean isMarkToDelete() {
        return markToDelete;
    }

    public void setMarkToDelete(boolean markToDelete) {
        this.markToDelete = markToDelete;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudyOnFsEntity that = (StudyOnFsEntity) o;

        if (pk != that.pk) return false;
        if (markToDelete != that.markToDelete) return false;
        if (accessTime != null ? !accessTime.equals(that.accessTime) : that.accessTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (pk ^ (pk >>> 32));
        result = 31 * result + (accessTime != null ? accessTime.hashCode() : 0);
        result = 31 * result + (markToDelete ? 1 : 0);
        return result;
    }
}
