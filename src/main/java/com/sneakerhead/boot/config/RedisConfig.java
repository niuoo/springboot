package com.sneakerhead.boot.config;

import com.sneakerhead.boot.util.redis.ByteJedisCluster;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.HostAndPort;

import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.Set;

/**
 * User: huiwu.wang
 * Date: 16/4/16
 * Time: 上午11:38
 */

@Configuration
public class RedisConfig {

    @Value("${redis.hosts}")
    private  String redisHosts;
    @Value("${redis.ports}")
    private  String redisPorts;

    @Bean(name="redisstore",autowire= Autowire.BY_TYPE)
    public ByteJedisCluster getRedisstoreFactory() throws UnknownHostException {
        String[] hosts=redisHosts.split(",");
        String[] ports=redisPorts.split(",");
        if(hosts.length!=ports.length){
            throw new IllegalArgumentException("配置错误，redisHosts与redisPorts数量不匹配");
        }
        Set<HostAndPort> nodes = new HashSet<HostAndPort>();
        for(int i=0;i<hosts.length;i++){
            nodes.add(new HostAndPort(hosts[i],Integer.parseInt(ports[i])));
        }
        GenericObjectPoolConfig config=new GenericObjectPoolConfig();
        config.setMaxTotal(20);
        config.setMaxIdle(8);
        config.setMinIdle(0);
        config.setBlockWhenExhausted(true);
        config.setMaxWaitMillis(1000*10);
        ByteJedisCluster redisstore= new ByteJedisCluster(nodes,config);
        return redisstore;
    }
}
