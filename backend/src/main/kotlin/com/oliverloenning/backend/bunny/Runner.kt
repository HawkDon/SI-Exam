package com.oliverloenning.backend.bunny


import java.util.concurrent.TimeUnit

import org.springframework.amqp.rabbit.core.RabbitTemplate
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class Runner(private val receiver: Receiver, private val rabbitTemplate: RabbitTemplate) : CommandLineRunner {

    @Throws(Exception::class)
    override fun run(vararg args: String) {
        println("Sending message...")

        rabbitTemplate.convertAndSend(Msgapplication.topicExchangeName, "foo.bar.baz", "Big dabby!")
        receiver.getLatch().await(10000, TimeUnit.MILLISECONDS)
    }

}
