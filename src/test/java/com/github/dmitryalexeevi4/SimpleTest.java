package com.github.dmitryalexeevi4;

import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@DisplayName("Простые тесты")
public class SimpleTest {
    private static final Logger LOG = LoggerFactory.getLogger(SimpleTest.class);

    @DisplayName("Первый простой тест")
    @Test
    void firstSimpleTest() {
        LOG.error("Error message!");
    }

    @DisplayName("Второй простой тест")
    @Test
    void secondSimpleTest() {
        LOG.warn("Warn message!");
    }

    @DisplayName("Третий простой тест")
    @Test
    void thirdSimpleTest() {
        LOG.info("Test complete!");
    }

    @DisplayName("Четвертый простой тест")
    @Test
    void fourthSimpleTest() {
        LOG.trace("Trace message!");
    }

}
