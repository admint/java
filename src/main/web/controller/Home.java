/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.web.controller;

import database.SeriesEntity;
import main.web.dao.DashboadDao;
import main.web.dao.HospitalDao;
import main.web.dao.modalityDao;
import main.web.entity.Dashboad;
import main.web.entity.Hospital;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 *
 * @author Praew
 */

public class Home extends HttpServlet {

    public String text,startDate,endDate,modality,hospital;

    public Home() {
        this.text = "";
        this.startDate = "";
        this.endDate = "";
        this.modality = "";
        this.hospital = "";
    }
    public String  isNull(String obj) {
        if(obj==null) {
            obj = "";
        }

        return obj;
    }
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        this.text = request.getParameter("text");
        this.startDate = request.getParameter("startDate");
        this.endDate = request.getParameter("endDate");
        this.modality = request.getParameter("modality");
        this.hospital = request.getParameter("hospital");
        request.setAttribute("text",this.text);
        request.setAttribute("startDate",this.startDate);
        request.setAttribute("endDate",this.endDate);
        request.setAttribute("modality",this.modality);
        request.setAttribute("hospital",this.hospital);

        DashboadDao dao = new DashboadDao();
        List<Dashboad> dList = dao.showStudy(isNull(this.text),isNull(this.startDate),isNull(this.endDate),isNull(this.modality),isNull(this.hospital));
        HospitalDao hos = new HospitalDao();
        List<Hospital> hList  = hos.fideAlls();

        modalityDao m = new modalityDao();
        List<SeriesEntity> mList  = m.madalityList();


        RequestDispatcher rd = request.getRequestDispatcher("view/confirm.jsp");
        request.setAttribute("patientList",dList);
        request.setAttribute("hospitalList",hList);
        request.setAttribute("modalityList",mList);
        rd.forward(request, response);



    }


/*ublic static void main(String[] args) {

        DashboadDao dao = new DashboadDao();
        List<Dashboad> dList = dao.showStudy("s","2017-01-01","2017-10-01","CR","CARESTREAM");
    modalityDao m = new modalityDao();
    List<SeriesEntity> mList  = m.madalityList();


        for (Dashboad mm : dList) {

            System.out.println("สินค้า : " + mm.toString());

        }



    }*/

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }


    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
