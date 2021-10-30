package com.example.lab2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URL;

@WebServlet({"/tamgiac", "/dientich", "/chuvi"})
public class Bai1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/views/tamgiac.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        boolean check = true;

        double a = 0, b = 0, c = 0;
        try {
            a = Double.parseDouble(req.getParameter("canhA"));
            b = Double.parseDouble(req.getParameter("canhB"));
            c = Double.parseDouble(req.getParameter("canhC"));
            if (a < 0 || b < 0 || c < 0) {
                check = false;
            }
        } catch (Exception e) {
            check = false;
        }
        if (check == false) {
            req.setAttribute("msg", "Cạnh nhập vào phải là số > 0");
            req.getRequestDispatcher("/views/tamgiac.jsp").forward(req, resp);
            return;
        }
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            double chuVi = a + b + c;
            String uri = req.getRequestURI();
            if (uri.contains("dientich")) {
                double dienTich = Math.sqrt(chuVi * (a + b - c) * (a + c - b) * (b + c - a));
                req.setAttribute("msg", "Diện tích hình tam giac là : " + dienTich);
            } else {
                req.setAttribute("msg", "Chu vi hình tam giac là : " + chuVi);
            }
        } else {
            req.setAttribute("msg", "Cạnh Nhập vào không thỏa mãn 1 tam giác");
        }
        req.getRequestDispatcher("/views/tamgiac.jsp").forward(req, resp);
    }
}
