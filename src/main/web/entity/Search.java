package main.web.entity;

public class Search {
    private int pk;
    private String pat_id,pat_name,pat_sex,mods_in_study,accession_no,study_desc,study_datetime,series;
    public Search() {
    }
    public int getpk() {
        return this.pk;
    }
    public void setpk(int pk) {
         this.pk = pk;
    }
    public void setpat_id(String pat_id) {
         this.pat_id = pat_id;
    }
    public String getpat_id() {
        return this.pat_id;
    }

    public void setpat_name(String pat_name) {
        this.pat_name = "name";
    }
    public String getpat_name() {
        return this.pat_name.replaceAll("[-+.^:,]","");
    }

    public void setpat_sex(String pat_sex) {
        this.pat_sex = pat_sex;
    }
    public String getpat_sex() {
        return this.pat_sex;
    }

    public void setmods_in_study(String mods_in_study) {
        this.mods_in_study = mods_in_study;
    }
    public String getmods_in_study() {
        return this.mods_in_study;
    }

    public void setaccession_no(String accession_no) {
        this.accession_no = accession_no;
    }
    public String getaccession_no() {
        return this.accession_no;
    }

    public void setstudy_desc(String study_desc) {
        this.study_desc = study_desc;
    }
    public String getstudy_desc() {
        return this.study_desc;
    }

    public void setstudy_datetime(String study_datetime) {
        this.study_datetime = study_datetime;
    }
    public String getstudy_datetime() {
        return this.study_datetime;
    }

    public void setseries(String series) {
        this.series = series;
    }
    public String getseries() {
        return this.series;
    }

    @Override
    public String toString() {
        return "study:{"+ "pk:"+ pk
                +",pat_id:"+pat_id
                +",pat_name:"+pat_name
                +",pat_sex:"+pat_sex
                +",mods_in_study:"+mods_in_study
                +",accession_no:"+accession_no
                +",study_descs:"+study_desc
                +",study_datetime:"+study_datetime
                +",series:"+series+"}";
    }
}
