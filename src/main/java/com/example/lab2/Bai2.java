package com.example.lab2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet({"/dangki","/thongtindangki"})
public class Bai2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/views/dangki.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        boolean check = true;
        String name  = req.getParameter("name");
        String pass  = req.getParameter("pass");
        String gender =req.getParameter("gender");;
        boolean married = req.getParameter("married") != null;
        String country = req.getParameter("country");
        String note = req.getParameter("note");

        System.out.println(">>username : " + name);
        System.out.println(">>gender : " + gender);
        System.out.println(">>married : " + married);
        System.out.println(">>country : " + country);

       if(name.trim().equals("")){
           req.setAttribute("errName","Bạn chưa nhập Tên Đăng Nhập");
           check = false;
       }else {
           req.setAttribute("name",name);
       }
        if(pass.trim().equals("")){
            req.setAttribute("errPass","Bạn chưa nhập Mật Khẩu");
            check = false;
        }else{
            req.setAttribute("pass",pass);
        }
       if(gender==null){
           req.setAttribute("errGender","Bạn chưa Chọn Giới Tính");
           check = false;
       }else{
           boolean gioitinh = Boolean.parseBoolean(gender);
           if(gioitinh){
               req.setAttribute("gender","Nam");
           }else{
               req.setAttribute("gender","Nữ");
           }
       }
       if(married){
           req.setAttribute("married","Đã Kết Hôn");
       }else{
           req.setAttribute("married","Chưa Kết Hôn");
       }
       if(country.equals("vn")){
           req.setAttribute("country","Việt Nam");
       }else{
           req.setAttribute("country","Mỹ");
       }
       req.setAttribute("note",note);
        if(check==false){
            req.getRequestDispatcher("/views/dangki.jsp").forward(req,resp);
            return;
        }
        String uri = req.getRequestURI();
        if(uri.contains("/thongtindangki")) {
            req.getRequestDispatcher("/views/thongtindangki.jsp").forward(req, resp);
        }
    }
}
