package main.web.dao;

import main.web.database.Database;
import main.web.entity.Dashboad;


import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class DashboadDao extends Database {


    public List<Dashboad> showStudy(String text,String dateStart,String dateEnd ,String modality,String hospital) {

        String condition = "";



            condition += " where (p.pat_id COLLATE UTF8_GENERAL_CI like '%"+text+"%' or p.pat_name COLLATE UTF8_GENERAL_CI like '%"+text+"%' or s.accession_no COLLATE UTF8_GENERAL_CI like '%"+text+"%') ";




        if(dateStart!=""){
            if  (condition!="") condition += " AND ";

                condition += " (s.study_datetime BETWEEN cast('"+dateStart+" 00:00:00' as datetime) AND cast('"+dateEnd+" 23:59:50' as datetime)) ";


        }

        if(modality!=""){
            if  (condition!="") condition += " AND ";
            condition += " s.mods_in_study = '"+modality+"' ";
        }

        if(hospital!=""){
            if  (condition!="") condition += " AND ";
            condition += " se.institution like '%"+hospital+"%' ";
        }

        String sql = "SELECT s.pk,p.pat_id,p.pat_name,p.pat_sex,s.mods_in_study,s.accession_no,s.study_desc,s.study_datetime,\n" +
                "(select  GROUP_CONCAT(series_no  SEPARATOR '') as cont from series  se where se.study_fk =s.pk  ) \n" +
                "as series,(SELECT re.report_status FROM report as re WHERE re.study_pk=s.pk ) AS report_status,se.institution\n" +
                "FROM study s \n" +
                "INNER JOIN patient p on s.patient_fk = p.pk  \n" +
                "INNER JOIN series se on se.study_fk =s.pk " +condition;
        System.out.println(sql);
          List<Dashboad> study = new ArrayList<Dashboad>();
        try {

            Statement ps = connect.createStatement();

            ResultSet rs = ps.executeQuery(sql);


            while ( rs.next()){
                Dashboad p = new Dashboad();
                p.setpk(rs.getInt("pk"));
                p.setpat_id(rs.getString("pat_id"));
                p.setpat_name(rs.getString("pat_name"));
                p.setpat_sex(rs.getString("pat_sex"));
                p.setmods_in_study(rs.getString("mods_in_study"));
                p.setaccession_no(rs.getString("accession_no"));
                p.setstudy_desc(rs.getString("study_desc"));
                p.setstudy_datetime(rs.getString("study_datetime"));
                p.setseries(rs.getString("series"));
                p.setReportStatus(rs.getString("report_status"));
                study.add(p);
            }

            connect.close();
        } catch (Exception e) {

            e.printStackTrace();
        }
        return study;
    }



}
