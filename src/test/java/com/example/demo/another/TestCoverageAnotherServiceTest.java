package com.example.demo.another;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class TestCoverageAnotherServiceTest {

    @InjectMocks
    TestCoverageAnotherService testCoverageAnotherService;

    @Test
    void testCoverageMethod() {
        assertEquals("test", testCoverageAnotherService.testCoverageMethod("test"));
    }

    @Test
    void testCoverageMethod2() {
        assertEquals("not test", testCoverageAnotherService.testCoverageMethod("not test"));
    }

}