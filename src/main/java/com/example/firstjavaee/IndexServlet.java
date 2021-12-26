package com.example.firstjavaee;

import kz.javaee.db.DBManager;
import kz.javaee.db.Items;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(value = "/index")
public class IndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ArrayList<Items> items = DBManager.getItems();
        PrintWriter out = response.getWriter();

        out.println("<h1>ITEMS LIST</h1>");
        for (Items item : items) {
            out.println("<h3>"+item.getId()+" "+item.getName()+" "+item.getPrice()+" "+item.getAmount()+" KZT </h3>");
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
