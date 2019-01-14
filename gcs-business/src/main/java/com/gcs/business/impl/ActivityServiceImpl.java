package com.gcs.business.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gcs.service.ActivityService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author cjw
 * @Date 2019/1/11 17:19
 */
@Service
public class ActivityServiceImpl implements ActivityService {

    @Override
    public List findAll() {
        List activityList=new ArrayList();
        Map<String,String> activity=new HashMap<>();
        activity.put("name","腊八活动");
        activity.put("status","1");
        activity.put("date","2019-01-01");
        activityList.add(activity);
        return activityList;
    }
}
