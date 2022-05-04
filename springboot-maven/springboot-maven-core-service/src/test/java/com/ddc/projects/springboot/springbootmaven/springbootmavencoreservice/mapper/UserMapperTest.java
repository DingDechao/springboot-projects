package com.ddc.projects.springboot.springbootmaven.springbootmavencoreservice.mapper;

import com.ddc.projects.springboot.springbootmaven.springbootmavencoreservice.entity.User;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Handler;

import static org.junit.Assert.*;

@SpringBootTest
public class UserMapperTest {
    Logger logger = LoggerFactory.getLogger(UserMapperTest.class);

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testGetAllUser() {
        List<User> userList = userMapper.selectList(null);
        assertNotNull(userList);
        logger.debug("UserMapperTest>>>>>testGetAllUser User list size {}", userList.size());
        assertTrue(userList.size() > 0);
    }

    @Test
    @Ignore
    public void testInsertOneUser() {
        User user = new User();
        user.setName("zhangsan");
        user.setAge("31");
        user.setManagerId("1088248166370832385");
        user.setCreateTime("2022-05-03 08:35:22");
        int rows = userMapper.insert(user);
        logger.debug("UserMapperTest>>>>>testInsertOneUser Insert {} user", rows);
        assertTrue(rows == 1);
    }

    @Test
    public void testSelectById() {
        User user = userMapper.selectById(1087982257332887553l);
        assertNotNull(user);
        assertEquals("big boss", user.getName());
    }

    @Test
    public void testSelectIds() {
        List<User> userList = userMapper.selectBatchIds(Arrays.asList(1087982257332887553l,1088248166370832385l));
        assertNotNull(userList);
        assertTrue(userList.size() == 2);

        List<User> emptyUserList = userMapper.selectBatchIds(Arrays.asList(123456l));
        assertNotNull(userList);
        assertTrue(userList.size() == 2);
    }

    @Test
    public void selectByMap() {
        //map.put("column name1", value)
        //map.put("column name2", value)
        //where column 1 = value and column2 = value
        Map<String, Object> columnMap = new HashMap<>();
        columnMap.put("manager_id", "1087982257332887553");
        List<User> userList = userMapper.selectByMap(columnMap);
        assertNotNull(userList);
        assertTrue(userList.size() >= 1);
    }

    
}
