package com.sneakerhead.boot.eventbus;

/**
 * Created by wanghuiwu on 2016/5/10.
 */
public class BuyEvent {
    private String jsonMsg;

    public BuyEvent(String jsonMsg) {
        this.jsonMsg = jsonMsg;
    }

    public String getJsonMsg() {
        return jsonMsg;
    }
}
