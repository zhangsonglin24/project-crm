package com.crm.service;


import com.crm.pojo.User;

public interface UserService {
    User findByUserName(String userName);

    void saveUserLogin(String IP);
}
