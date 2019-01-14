package com.gcs.business.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gcs.service.UserService;
import common.Entity.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author cjw
 * @Date 2019/1/10 17:47
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<User> findAll() {
        List<User> userlist=new ArrayList<User>();
        User u=new User();
        for (int i=1;i<10;i++){
            u.setId(i);
            u.setMobile("123123");
            u.setUsername("aaaa");
            userlist.add(u);
        }
        return userlist;
    }
}
