package main.web.dao;

import database.SeriesEntity;
import main.web.database.Database;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class modalityDao extends Database {


    public List<SeriesEntity> madalityList(){
        String sql = "SELECT modality FROM series group by modality;";
        //System.out.println(sql);
        List<SeriesEntity> study = new ArrayList<>();
        try {

            Statement ps = connect.createStatement();

            ResultSet rs = ps.executeQuery(sql);
            while ( rs.next()) {
                SeriesEntity p = new SeriesEntity();
                p.setModality(rs.getString("modality"));
                study.add(p);
            }
            connect.close();
        } catch (Exception e) {

            e.printStackTrace();
        }
        return study;
    }
}
