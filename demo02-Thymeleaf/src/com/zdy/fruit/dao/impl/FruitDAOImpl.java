package com.zdy.fruit.dao.impl;

import com.zdy.fruit.dao.FruitDAO;
import com.zdy.fruit.dao.base.BaseDAO;
import com.zdy.fruit.pojo.Fruit;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FruitDAOImpl extends BaseDAO implements FruitDAO {
    @Override
    public void addFruit(Fruit fruit){
        QueryRunner queryRunner = new QueryRunner();
        String sql = "insert into fruits(fname,price,fcount,remark) values(?,?,?,?)";
        try {
            String fname = fruit.getFname();
            Integer price = fruit.getPrice();
            Integer fcount = fruit.getFcount();
            String remark = fruit.getRemark();
            int i = queryRunner.update(super.getConnection(), sql, fname, price, fcount, remark);
            if (i == 0){
                System.out.println("添加失败");
            }else{
                System.out.println("成功添加"+i+"条数据");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (NoSuchMethodException e){
            e.printStackTrace();
        } catch (InvocationTargetException e){
            e.printStackTrace();
        } catch (IllegalAccessException e){
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<Fruit> getFruitList(){
        QueryRunner queryRunner = new QueryRunner();
        String sql = "select * from fruits";
        BeanListHandler<Fruit> beanListHandler = new BeanListHandler<>(Fruit.class);
        try {
            ArrayList<Fruit> query = (ArrayList<Fruit>)queryRunner.query(super.getConnection(), sql, beanListHandler);
            return query;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
