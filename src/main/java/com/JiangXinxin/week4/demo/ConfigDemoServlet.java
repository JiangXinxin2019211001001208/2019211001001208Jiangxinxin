package com.JiangXinxin.week4.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
@WebServlet(value = "/config",initParams = {@WebInitParam(name = "name",value = "JiangXinxin"),@WebInitParam(name = "studentId",value = "2019211001001205")})
public class ConfigDemoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer=resp.getWriter();
        writer.println("name:"+getServletConfig().getInitParameter("name"));
        writer.println("studentId"+getServletConfig().getInitParameter("studentId"));
    }
}