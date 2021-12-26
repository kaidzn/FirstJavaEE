package com.example.firstjavaee;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(value = "/home")
public class HelloServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{

        String team = request.getParameter("team_name");
        String points = request.getParameter("team_points");

        System.out.println(team + " GOT " + points + " pts.");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {

        String name = request.getParameter("user_name");
        String surname = request.getParameter("user_surname");
        int age = Integer.parseInt(request.getParameter("user_age"));

        String result = "You are " + name + " " + surname + " " + age + " years old.";

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1 style = 'color:blue'>"+result+"</h1>");
        out.println("<img src='https://www.inform.kz/radmin/news/2020/08/30/200830010249662e.jpg'>");

//        System.out.printf("You are %s %s %d years old !\n",name,surname,age);
    }

}