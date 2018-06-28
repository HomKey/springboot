package com.hk.base.cache;

import redis.clients.jedis.Jedis;

/**
 * Created by LuHj on 2018/6/28.
 */
public interface IRedisService {

    public Jedis getResource();

    public void returnResource(Jedis jedis);

    public void set(String key, String value);

    public String get(String key);


}
