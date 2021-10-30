package com.example.lab2;

import javax.print.attribute.standard.Fidelity;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

@WebServlet("/hitcounterServlet")
public class Bai4 extends HttpServlet {
    int count;
    Path path = Paths.get("c:/temp/count.txt");
    @Override
    public void init() throws ServletException {
        try {
            count =Integer.parseInt(Files.readAllLines(path).get(0));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        count++;
        req.setAttribute("count",count);
        req.getRequestDispatcher("/views/hit-counter.jsp").forward(req,resp);
     
    }

    @Override
    public void destroy() {
        try {
            Files.write(path,String.valueOf(count).getBytes(), StandardOpenOption.WRITE);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
