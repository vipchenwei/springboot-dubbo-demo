package com.gcs.service;

import common.Entity.User;

import java.util.List;

/**
 * @Author cjw
 * @Date 2019/1/11 13:26
 */
public interface UserService {
    List<User> findAll();
}
