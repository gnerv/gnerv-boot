package com.gnerv.management.platform.controller;


import com.gnerv.management.common.R;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 平台用户表 前端控制器
 * </p>
 *
 * @author gnerv
 * @since 2018-05-09
 */
@RestController
@RequestMapping("/platform/user")
public class UserController {

    @RequestMapping(value = "/createUser", method = RequestMethod.POST)
    public R createUser(){
        return R.ok();
    }

}

