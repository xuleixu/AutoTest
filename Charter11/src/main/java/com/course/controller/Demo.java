package com.course.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Log4j    //日志
@RestController
@Api(value = "v1",description = "第一个版本demo")
@RequestMapping("/v1")
public class Demo {
    //执行sql对象
    @Autowired
    private SqlSessionTemplate template;

    @RequestMapping(value = "/getUserCount",method = RequestMethod.GET)
    @ApiOperation(value = "获取用户数",httpMethod = "GET")
    public int userCount(){
        return template.selectOne("getUserCount");
    }
}
