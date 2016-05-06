package com.sneakerhead.boot.dao.impl;

import com.sneakerhead.boot.dao.ShoeDao;
import com.sneakerhead.boot.model.Shoe;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * Created by wanghuiwu on 2016/5/5.
 */
@Component
public class ShoeDaoImpl implements ShoeDao {
    @Autowired
    private Datastore datastore;

    private Query<Shoe> beforeQueryBuild(){
        return datastore.createQuery(Shoe.class);
    }

    @Override
    public Shoe selectByPrimaryKey(String id) {
        return beforeQueryBuild().field("id").equal(new ObjectId(id)).get();
    }

    @Override
    public Shoe findBySku(Long sku) {
        return beforeQueryBuild().field("sku").equal(sku).get();
    }

    @Override
    public Shoe save(Shoe shoe) {
        datastore.save(shoe);
        return shoe;
    }

    @Override
    public List<Shoe> getByCreateDate(Date createDate) {
        return beforeQueryBuild().field("createDate").lessThanOrEq(createDate).asList();
    }

    @Override
    public void delete(String id) {
        datastore.delete(Shoe.class,id);
    }

    @Override
    public void deleteBySku(Long sku) {
        datastore.delete(beforeQueryBuild().field("sku").equal(sku));
    }
}
