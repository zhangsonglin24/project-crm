package com.crm.dao;

import com.crm.pojo.User;
import org.hibernate.Query;

/**
 * Created by Administrator on 2017/3/18.
 */
public class UserDao extends BaseDao<User,Integer> {


    public User findByUserName(String userName) {
        String Hql=" from User where username=? ";
        Query query=  getSession().createQuery(Hql);
        query.setParameter(0,userName);
        return (User) query.uniqueResult();

    }
}
