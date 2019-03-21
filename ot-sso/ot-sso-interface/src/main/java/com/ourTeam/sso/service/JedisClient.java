package com.ourTeam.sso.service;

public interface JedisClient {

    //jedis的相关操作，其中分为单机版和集群版，在两个不同类里面实现单机版和集群版

    //对于String的相关操作
    String set(String key, String value);
    String get(String key);
    Boolean exists(String key);
    Long incr(String key);
    Long del(String key);


    //对于Hash的相关操作
    String hget(String key, String field);
    Long hset(String key, String field, String value);
    Long hdel(String key, String... field);


    //设置过期时间
    Long expire(String key, int seconds);
    //查看剩余时间
    Long ttl(String key);
}
