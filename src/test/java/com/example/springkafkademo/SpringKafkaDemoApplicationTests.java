package com.example.springkafkademo;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.test.EmbeddedKafkaBroker;
import org.springframework.kafka.test.context.EmbeddedKafka;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@DirtiesContext
@EmbeddedKafka()
class SpringKafkaDemoApplicationTests {

    @Autowired
    private EmbeddedKafkaBroker embeddedKafka;

    @Test
    void contextLoads() {
        assertNotNull(embeddedKafka);
    }

    @Test
    void contextLoads2() {
        assertNotNull(embeddedKafka);
    }

    @Test
    void contextLoads3() {
        assertNotNull(embeddedKafka);
    }

}
