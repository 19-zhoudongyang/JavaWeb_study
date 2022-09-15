package com.zdy.servlet;


import com.zdy.fruit.dao.FruitDAO;
import com.zdy.fruit.dao.impl.FruitDAOImpl;
import com.zdy.fruit.pojo.Fruit;
import com.zdy.myssm.myspringmvc.ViewBaseServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

//
@WebServlet("/index1")
public class SelectServlet extends ViewBaseServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        FruitDAO fruitDAO = new FruitDAOImpl();
        List<Fruit> fruitList = fruitDAO.getFruitList();
        //保存到session中
        HttpSession session = req.getSession();
        session.setAttribute("fruitList",fruitList);

        System.out.println(fruitList);

        super.processTemplate("index1",req,resp);
    }
}
