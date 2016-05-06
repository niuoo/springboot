package com.sneakerhead.boot.controller;

import com.sneakerhead.boot.dao.ShoeDao;
import com.sneakerhead.boot.model.Shoe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * Created by wanghuiwu on 2016/5/5.
 */
@RestController
@RequestMapping("/shoe")
public class ShoeController {
    @Autowired
    private ShoeDao shoeDao;

    @RequestMapping(method = RequestMethod.GET)
    public Shoe findBySku(@RequestParam("sku")Long sku){
        return shoeDao.findBySku(sku);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Shoe save(@RequestBody Shoe shoe){
        return shoeDao.save(shoe);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteBySku(@RequestParam("sku") Long sku){
        shoeDao.deleteBySku(sku);
    }

}
