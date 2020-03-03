package com.iwhalecloud.controller;

import com.iwhalecloud.common.ResponseData;
import com.iwhalecloud.entity.ApiPerformanceTesting;
import com.iwhalecloud.entity.Order;
import com.iwhalecloud.entity.User;
import com.iwhalecloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ApiController {
    private final static String YES_FLAG = "Y";

    @Autowired
    private UserService userService;

    // http://127.0.0.1:9090/index
    @RequestMapping(value = "/index")
    public ResponseData index() throws InterruptedException {
        ResponseData responseData = new ResponseData();
        responseData.setResCode("0000");
        responseData.setResMessage("zop api test success");
        ApiPerformanceTesting apiPerformanceTesting = userService.fetchApiPerformanceTestingByCode(null);
        if (apiPerformanceTesting != null) {
            String ifSleep = apiPerformanceTesting.getIfSleep();
            if (YES_FLAG.equals(ifSleep)) {
                if (apiPerformanceTesting.getSleepTime() != null) {
                    long sleepTime = (long) apiPerformanceTesting.getSleepTime();
                    Thread.sleep(sleepTime);
                }
            }

            String ifUseResponse = apiPerformanceTesting.getIfUseResponse();
            if (YES_FLAG.equals(ifUseResponse)) {
                String responseBody = apiPerformanceTesting.getResponseBody();
                if (!StringUtils.isEmpty(responseBody)) {
                    responseData.setData(responseBody);
                    return responseData;
                }
            }
        }

        List<String> list = new ArrayList<String>(4);
        list.add("武汉");
        list.add("安庆");
        list.add("南京");
        responseData.setData(list);
        return responseData;
    }

    @RequestMapping(value = "/indexApi")
    public ResponseData indexApi() {
        ResponseData responseData = new ResponseData();
        responseData.setResCode("0000");
        responseData.setResMessage("zop api test success");
        User user = new User(11, "zhangsan ");
        responseData.setData(user);
        return responseData;
    }

    // http://127.0.0.1:9090/apiTest
    @RequestMapping(value = "/apiTest")
    public ResponseData apiTest(@RequestBody Order order) {
        ResponseData responseData = new ResponseData();
        responseData.setResCode("0000");
        responseData.setResMessage("zop api success");
        Map<String, String> map = new HashMap<String, String>(4);
        map.put("ASA_Name", order.getUserName());
        map.put("ASA_Id", "11");
        responseData.setData(map);
        return responseData;
    }

    @RequestMapping(value = "/apiOrder")
    public ResponseData apiTest(@RequestBody User user) throws InterruptedException {
        ResponseData responseData = new ResponseData();
        responseData.setResCode("200");
        responseData.setResMessage("apiOrder success");

        ApiPerformanceTesting apiPerformanceTesting = userService.fetchApiPerformanceTestingByCode(user.getTestCode());
        if (apiPerformanceTesting != null) {
            String ifSleep = apiPerformanceTesting.getIfSleep();
            if (YES_FLAG.equals(ifSleep)) {
                if (apiPerformanceTesting.getSleepTime() != null) {
                    long sleepTime = (long) apiPerformanceTesting.getSleepTime();
                    Thread.sleep(sleepTime);
                }
            }

            String ifUseResponse = apiPerformanceTesting.getIfUseResponse();
            if (YES_FLAG.equals(ifUseResponse)) {
                String responseBody = apiPerformanceTesting.getResponseBody();
                if (!StringUtils.isEmpty(responseBody)) {
                    responseData.setData(responseBody);
                    return responseData;
                }
            }
        }

        Order order = new Order(user.getUserId(), "静静的顿河", new Date());
        order.setUserName(user.getUserName());
        responseData.setData(order);
        return responseData;
    }



    @RequestMapping(value = "/getApiPerformanceTestingByCode")
    public ResponseData getApiPerformanceTestingByCode() {
        ResponseData responseData = new ResponseData();
        responseData.setResCode("200");
        responseData.setResMessage("operator success");

        ApiPerformanceTesting apiPerformanceTesting = userService.fetchApiPerformanceTestingByCode(null);

        responseData.setData(apiPerformanceTesting);
        return responseData;
    }

    @RequestMapping(value = "/modifyApiPerformanceTesting")
    public ResponseData modifyApiPerformanceTesting(@RequestBody ApiPerformanceTesting apiPerformanceTesting) {
        ResponseData responseData = new ResponseData();
        responseData.setResCode("200");
        responseData.setResMessage("operator success");

        userService.modifyApiPerformanceTesting(apiPerformanceTesting);

        return responseData;
    }



}
