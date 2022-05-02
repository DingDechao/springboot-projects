package com.ddc.projects.springboot.springbootmaven.springbootmavencoreservice.mapper;

import com.ddc.projects.springboot.springbootmaven.springbootmavencoreservice.entity.User;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

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
}
