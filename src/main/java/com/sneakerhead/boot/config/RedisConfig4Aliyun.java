package com.sneakerhead.boot.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Created by wanghuiwu on 2016/5/12.
 */
@Configuration
public class RedisConfig4Aliyun {
    @Value("${redis.hosts}")
    private static String redisHosts;
    @Value("${redis.ports}")
    private static String redisPorts;
    @Value("${redis.password}")
    private static String redisPassword;

    @Bean(name="jedisPoolConfig",autowire= Autowire.BY_TYPE)
    public JedisPoolConfig getJedisPoolConfig(){
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxWaitMillis(1000 * 10);
        config.setMaxTotal(20);
        config.setMaxIdle(8);
        config.setTestOnBorrow(true);
        config.setTestOnReturn(true);
        return config;
    }

    @Bean(name="jedisPool",autowire= Autowire.BY_TYPE)
    public JedisPool getJedisPool(){
        JedisPool pool = new JedisPool(getJedisPoolConfig(),redisHosts,Integer.parseInt(redisPorts),1000,redisPassword);
        return pool;
    }


}
