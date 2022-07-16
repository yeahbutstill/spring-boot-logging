package com.danisetiawan;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@Slf4j
@SpringBootTest(classes = LoggingTest.class)
@TestPropertySource("classpath:application-test.properties")
public class LoggingTest {

    @Test
    void testLog() {
        log.info("Log");
        log.debug("log1");
        log.error("log2");
        log.trace("log3");
        log.warn("log4");
    }

    @Test
    void testLogSize() {
        for (int i = 0; i < 100_000; i++) {
            log.warn("Hello World, I LOVE JAVA {}", i);
        }
    }
}

