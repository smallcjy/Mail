package com.example.backend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.backend.entity.User;
import com.example.backend.mapper.UserMapper;
import com.example.backend.result.Result;
import com.example.backend.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService
{
    @Resource
    private UserMapper userMapper;
    @Override
    public Result<User> update(User user){
        Result<User> result = new Result<>();
        //修改用户
        userMapper.editorUser(user);
        return Result.success();
    }

    @Override
    public User getUserByEmail(String email){
        User getUser = userMapper.findUserByEmail(email);
        if(getUser == null) return null;
        return getUser;
    }
}
