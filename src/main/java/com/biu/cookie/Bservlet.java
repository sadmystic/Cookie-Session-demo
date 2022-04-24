package com.biu.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/bServlet")
public class Bservlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取cookie

        //1. 获取cookie数组
        Cookie[] cookies=req.getCookies();

        //2. 遍历
        for (Cookie cookie : cookies) {
            String name = cookie.getName();
            if("username".equals(name)) {
                //3. 获取数据
                String value = cookie.getValue();
                System.out.println(name+":"+value);

                break;
            }
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
