package com.sneakerhead.boot.dao;

import com.sneakerhead.boot.model.Shoe;

import java.util.Date;
import java.util.List;

/**
 * Created by wanghuiwu on 2016/5/5.
 */
public interface ShoeDao {
    Shoe selectByPrimaryKey(String id);
    Shoe findBySku(Long sku);
    Shoe save(Shoe shoe);
    List<Shoe> getByCreateDate(Date createDate);
    void delete(String id);
    void deleteBySku(Long sku);
}
