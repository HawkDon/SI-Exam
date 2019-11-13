package com.oliverloenning.backend.bunny

import java.util.concurrent.CountDownLatch;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    private val latch = CountDownLatch(1)


    fun recieveMessage(msg: String) {
        println("Recieved < " + msg +" >")
        latch.countDown();
    }

    fun getLatch(): CountDownLatch {
        return latch
    }

}


