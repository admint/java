package main.web.dao;

import main.web.database.Database;
import main.web.entity.Dashboad;
import main.web.entity.Hospital;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class HospitalDao extends Database {


    public List<Hospital> fideAlls() {


        String sql = "SELECT institution FROM  series GROUP BY institution";
        //System.out.println(sql);
          List<Hospital> hospital = new ArrayList<Hospital>();
        try {
            Statement ps = connect.createStatement();
            ResultSet rs = ps.executeQuery(sql);

            while ( rs.next()){
                Hospital p = new Hospital();
                p.setinstitution(rs.getString("institution"));
                hospital.add(p);
            }

            connect.close();
        } catch (Exception e) {

            e.printStackTrace();
        }
        return hospital;
    }
  /* public static void main(String[] args) {

        HospitalDao hos = new HospitalDao();
        List<Hospital> hList  = hos.fideAlls();



        for (Hospital p : hList) {

            System.out.println("สินค้า : " + p.getHostpitalName());

        }



    }*/


}
