package com.example.demo.one;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class TestCoverageServiceTest {

    @InjectMocks
    TestCoverageService testCoverageService;

    @Test
    void testCoverageMethod() {
        assertEquals("test", testCoverageService.testCoverageMethod("test"));
    }

    @Test
    void testCoverageMethod2() {
        assertEquals("not test", testCoverageService.testCoverageMethod("not test"));
    }

}