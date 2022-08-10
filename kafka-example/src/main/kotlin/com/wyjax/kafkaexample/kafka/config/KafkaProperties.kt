package com.wyjax.kafkaexample.kafka.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@ConfigurationProperties(prefix = "spring.kafka")
@Component
class KafkaProperties(
    val servers: List<String> = arrayListOf("localhost:9092"),
)
