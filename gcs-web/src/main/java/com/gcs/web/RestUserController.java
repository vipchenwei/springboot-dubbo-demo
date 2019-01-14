package com.gcs.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.gcs.service.UserService;
import common.Entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @Author cjw
 * @Date 2019/1/11 16:42
 */
@RestController
public class RestUserController {
    @Reference
    private UserService userService;

    @RequestMapping("/user")
    public String findAll(@RequestParam("type") String type){
        if(type.equals("1")) {
            List<User> userList = userService.findAll();
            return JSON.toJSONString(userList);
        }else
            return "fail";
    }
}
