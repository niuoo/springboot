package com.sneakerhead.boot.eventbus;

import com.google.common.eventbus.Subscribe;

/**
 * Created by wanghuiwu on 2016/5/10.
 */
public class BuyEventListener3 {
    private String lastBuyEventJson;
    @Subscribe
    public void listen(BuyEvent buyEvent) throws InterruptedException {
        lastBuyEventJson = buyEvent.getJsonMsg();
        System.out.println("==========listen3:"+buyEvent.getJsonMsg()+System.currentTimeMillis());
    }

    public String getLastBuyEventJson(){
        return lastBuyEventJson;
    }
}
