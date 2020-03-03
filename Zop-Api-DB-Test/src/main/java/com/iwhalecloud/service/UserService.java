package com.iwhalecloud.service;

import com.iwhalecloud.entity.ApiPerformanceTesting;
import com.iwhalecloud.mapper.UserMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public ApiPerformanceTesting fetchApiPerformanceTestingByCode(String testCode) {
        testCode= StringUtils.isEmpty(testCode) ? "apiCode" : testCode;
        return userMapper.fetchApiPerformanceTestingByCode(testCode);
    }

    public ApiPerformanceTesting getApiPerformanceTestingById(@Param("id") String id) {
        if (StringUtils.isEmpty(id)) {
            return  null;
        }

        return userMapper.getApiPerformanceTestingById(id);

    }


    public int modifyApiPerformanceTesting(ApiPerformanceTesting apiPerformanceTesting) {
        apiPerformanceTesting.setTestCode("apiCode");
        return userMapper.modifyApiPerformanceTesting(apiPerformanceTesting);
    }
}
