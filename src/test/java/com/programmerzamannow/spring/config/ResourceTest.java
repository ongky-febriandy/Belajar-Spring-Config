package com.programmerzamannow.spring.config;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@Slf4j

public class ResourceTest {

    @Test
    void testResource() throws IOException {
        ClassPathResource resource = new ClassPathResource("/text/sample.txt");

        Assertions.assertNotNull(resource);

        Assertions.assertTrue(resource.exists());
        assertNotNull(resource.getFile());
    }
}
