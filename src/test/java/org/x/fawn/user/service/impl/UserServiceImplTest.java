package org.x.fawn.user.service.impl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.x.fawn.user.entity.User;
import org.x.fawn.user.service.IUserService;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceImplTest {

    @Autowired
    private IUserService userService;

    @Test
    void testFindUser() {
        User user = userService.getById(1);
        assertNotNull(user);
        assertEquals(1, user.getId());
    }
}