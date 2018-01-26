package com.h.service.impl;

import com.h.service.IUserService;
import org.springframework.stereotype.Service;


/**
 *
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Override
    public boolean login(String username, String password) {

        if (null != username && null != password) {
            System.out.println("用户校验通过。username: " + username);
            return true;
        }

        System.out.println("*** 用户校验失败");

        return false;
    }
}
