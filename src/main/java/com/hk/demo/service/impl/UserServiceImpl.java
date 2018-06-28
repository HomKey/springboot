package com.hk.demo.service.impl;

import com.hk.demo.entity.User;
import com.hk.demo.mapper.UserMapper;
import com.hk.demo.service.IUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author HomKey123
 * @since 2018-06-26
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    public boolean save(User user){
        return insert(user);
    }
}
