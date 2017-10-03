package database;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "report", schema = "cloudpacs", catalog = "")
public class ReportEntity {
    private int id;
    private long studyPk;
    private String reportHtml;
    private Integer reportStatus;
    private Integer radiology;
    private Timestamp readDate;
    private Timestamp signoffDate;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "study_pk")
    public long getStudyPk() {
        return studyPk;
    }

    public void setStudyPk(long studyPk) {
        this.studyPk = studyPk;
    }

    @Basic
    @Column(name = "report_html")
    public String getReportHtml() {
        return reportHtml;
    }

    public void setReportHtml(String reportHtml) {
        this.reportHtml = reportHtml;
    }

    @Basic
    @Column(name = "report_status")
    public Integer getReportStatus() {
        return reportStatus;
    }

    public void setReportStatus(Integer reportStatus) {
        this.reportStatus = reportStatus;
    }

    @Basic
    @Column(name = "radiology")
    public Integer getRadiology() {
        return radiology;
    }

    public void setRadiology(Integer radiology) {
        this.radiology = radiology;
    }

    @Basic
    @Column(name = "read_date")
    public Timestamp getReadDate() {
        return readDate;
    }

    public void setReadDate(Timestamp readDate) {
        this.readDate = readDate;
    }

    @Basic
    @Column(name = "signoff_date")
    public Timestamp getSignoffDate() {
        return signoffDate;
    }

    public void setSignoffDate(Timestamp signoffDate) {
        this.signoffDate = signoffDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ReportEntity that = (ReportEntity) o;

        if (id != that.id) return false;
        if (studyPk != that.studyPk) return false;
        if (reportHtml != null ? !reportHtml.equals(that.reportHtml) : that.reportHtml != null) return false;
        if (reportStatus != null ? !reportStatus.equals(that.reportStatus) : that.reportStatus != null) return false;
        if (radiology != null ? !radiology.equals(that.radiology) : that.radiology != null) return false;
        if (readDate != null ? !readDate.equals(that.readDate) : that.readDate != null) return false;
        if (signoffDate != null ? !signoffDate.equals(that.signoffDate) : that.signoffDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (int) (studyPk ^ (studyPk >>> 32));
        result = 31 * result + (reportHtml != null ? reportHtml.hashCode() : 0);
        result = 31 * result + (reportStatus != null ? reportStatus.hashCode() : 0);
        result = 31 * result + (radiology != null ? radiology.hashCode() : 0);
        result = 31 * result + (readDate != null ? readDate.hashCode() : 0);
        result = 31 * result + (signoffDate != null ? signoffDate.hashCode() : 0);
        return result;
    }
}
