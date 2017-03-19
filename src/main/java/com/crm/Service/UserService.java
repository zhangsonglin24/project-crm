package com.crm.Service;

import com.crm.dao.UserDao;
import com.crm.dao.UserlogDao;
import com.crm.pojo.User;
import com.crm.pojo.UserLog;
import com.crm.shiro.ShiroUtil;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;
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
    @Autowired
    private UserlogDao userlogDao;



    @Transactional(readOnly = true)
    public User findByUserName(String userName) {
        return userDao.findByUserName(userName);
    }

    public void saveUserLogin(String remoteAddr) {
        UserLog userLog=new UserLog();
        userLog.setLoginip(remoteAddr);
        userLog.setLogintime(DateTime.now().toString("YYYY-MM-DD:HH-mm"));
        userLog.setUserid(ShiroUtil.getCurrentUserId());
        userlogDao.save(userLog);
    }
}
