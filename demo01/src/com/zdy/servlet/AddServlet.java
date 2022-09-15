package com.zdy.servlet;

import com.zdy.fruit.dao.FruitDAO;
import com.zdy.fruit.dao.impl.FruitDAOImpl;
import com.zdy.fruit.pojo.Fruit;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String fname = request.getParameter("fname");
        Integer price = Integer.parseInt(request.getParameter("price"));
        Integer fcount = Integer.parseInt(request.getParameter("fcount"));
        String remark = request.getParameter("remark");
        FruitDAO fruitDAO = new FruitDAOImpl();
        fruitDAO.addFruit(new Fruit(fname,price,fcount,remark));
    }
}