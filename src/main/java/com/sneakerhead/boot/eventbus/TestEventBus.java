package com.sneakerhead.boot.eventbus;

import com.google.common.eventbus.EventBus;
import org.junit.Test;

/**
 * Created by wanghuiwu on 2016/5/10.
 */
public class TestEventBus {
    @Test
    public void test1(){
        BuyEvent buyEvent = new BuyEvent("i am a buy json message");
        BuyEventListener listener = new BuyEventListener();
        BuyEventListener2 listener2 = new BuyEventListener2();
        BuyEventListener3 listener3 = new BuyEventListener3();
        EventBus eventBus = new EventBus("BUY");
        eventBus.register(listener);
        eventBus.register(listener3);
        eventBus.register(listener2);

        eventBus.post(new BuyEvent("i am a buy json message"));
        eventBus.post(new BuyEvent("i am another buy json message"));
//        eventBus.post(new BuyEvent("i am a good json message"));
    }
}
