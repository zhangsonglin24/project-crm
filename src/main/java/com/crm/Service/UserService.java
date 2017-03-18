package com.crm.Service;

import com.crm.dao.UserDao;
import com.crm.pojo.User;
import org.hibernate.annotations.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by Administrator on 2017/3/18.
 */
@Service
@Transactional
public class UserService {

    @Autowired
    private UserDao userDao;

    @Transactional(readOnly = true)
    public User findByUserName(String userName) {
        return userDao.findByUserName(userName);
    }
}
