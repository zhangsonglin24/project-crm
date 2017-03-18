package com.crm.dao;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by Administrator on 2017/3/18.
 */
public class BaseDao<T,PK extends Serializable> {

    @Autowired
    private SessionFactory sessionFactory;
    private Class clazz;

    public BaseDao(){
        ParameterizedType type= (ParameterizedType) this.getClass().getGenericSuperclass();
        clazz= (Class) type.getActualTypeArguments()[0];
    }

    public Session getSession(){
        return  sessionFactory.getCurrentSession();
    }

    public void save(T entity){
        getSession().saveOrUpdate(entity);
    }

   public  T findById(PK id){
        return (T) getSession().get(clazz,id);
   }

   public void deleteById(PK id){
       getSession().delete(findById(id));
   }

   public List<T> findAll(){
       Criteria criteria=getSession().createCriteria(clazz);
       criteria.list();
   }
}
