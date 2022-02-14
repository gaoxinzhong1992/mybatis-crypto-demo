package com.mybatis.crypto.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mybatis.crypto.entity.User;
import com.mybatis.crypto.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
 * UserServiceImpl
 *
 * @author gaoxinzhong
 * @date 2022/2/14 14:11
 **/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> {

}
