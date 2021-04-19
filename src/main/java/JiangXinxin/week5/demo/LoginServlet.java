package JiangXinxin.week5.demo;

import com.JiangXinxin.dao.UserDao;
import com.JiangXinxin.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.applet.Applet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(name = "LoginServlet",value = "/login")
public class LoginServlet extends HttpServlet {
    Connection con=null;
    @Override
    public void init() throws ServletException {
        super.init();

        con=(Connection)getServletContext().getAttribute("con");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/views/login.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        PrintWriter out = resp.getWriter();
        String username=req.getParameter("username");
        String password=req.getParameter("password");

        UserDao userDao=new UserDao();

        try {
            User user = (User) userDao.findByUsernamePassword(con,username,password);
            if (user!=null){
                req.setAttribute("user",user);
                req.getRequestDispatcher("WEB-INF/views/userinfo.jsp").forward(req,resp);
            }else {
                req.setAttribute("massage","username or Password Error!!!");
                req.getRequestDispatcher("WEB-INF/views/login.jsp").forward(req,resp);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
//catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
    }
}
