package com.iwhalecloud.mapper;

import com.iwhalecloud.entity.ApiPerformanceTesting;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    ApiPerformanceTesting fetchApiPerformanceTestingByCode(@Param("testCode") String testCode);

    ApiPerformanceTesting getApiPerformanceTestingById(@Param("id") String id);

    int modifyApiPerformanceTesting(ApiPerformanceTesting apiPerformanceTesting);
}
