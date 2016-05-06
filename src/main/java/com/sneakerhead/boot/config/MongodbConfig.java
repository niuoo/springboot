package com.sneakerhead.boot.config;

import com.google.common.collect.Lists;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.UnknownHostException;
import java.util.List;

/**
 * Created by wanghuiwu on 2016/5/5.
 */
@Configuration
public class MongodbConfig {
    @Value("${mongodb.dbname}")
    private  String dbName;
    @Value("${mongodb.hosts}")
    private  String dbHosts;
    @Value("${mongodb.ports}")
    private  String dbPorts;

    @Bean(name="datastore",autowire= Autowire.BY_TYPE)
    public Datastore getDatastoreFactory() throws UnknownHostException {
        final Morphia morphia = new Morphia();
        morphia.mapPackage("com.sneakerhead.boot.model");
        String[] hosts=dbHosts.split(",");
        String[] ports=dbPorts.split(",");
        if(hosts.length!=ports.length){
            throw new IllegalArgumentException("配置错误，dbHosts与dbPorts数量不匹配");
        }
        List<ServerAddress> seeds= Lists.newArrayList();
        for(int i=0;i<hosts.length;i++){
            seeds.add(new ServerAddress(hosts[i], Integer.valueOf(ports[i])));
        }
        MongoClient mongoClient= new MongoClient(seeds);
        Datastore datastore = morphia.createDatastore(mongoClient, dbName);
        datastore.ensureIndexes();
        return datastore;
    }

}
