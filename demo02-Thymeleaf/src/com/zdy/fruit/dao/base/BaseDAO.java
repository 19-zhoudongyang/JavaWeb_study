package com.zdy.fruit.dao.base;

import  com.zdy.DruidPool;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;

public class BaseDAO {
    public Connection getConnection() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ClassLoader loader = BaseDAO.class.getClassLoader();
        Class<?> clazz = loader.loadClass("com.zdy.DruidPool");

        Method method = clazz.getMethod("getConnection");
//        System.out.println(method);
        Connection connection = (Connection) method.invoke(null);
        return connection;
    }
}
