package com.wyjax.kafkaexample.kafka.publisher

import lombok.RequiredArgsConstructor
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Component

@Component
@RequiredArgsConstructor
class SimplePublisher(
    private val kafkaTemplate: KafkaTemplate<String, Any>
) {
}
