package com.hk.demo.service;

import com.hk.demo.entity.User;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author HomKey123
 * @since 2018-06-26
 */
public interface IUserService extends IService<User> {
    boolean save(User user);
}
