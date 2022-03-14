package com.programmerzamannow.spring.config.messagesource;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;

import java.util.Locale;

public class MessageSourceTest {

    private ApplicationContext applicationContext;
    private MessageSource messageSource;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(TestApplication.class);
        messageSource = applicationContext.getBean(MessageSource.class);
    }

    @Test
    void testDefaultLocal() {
        String message = messageSource.getMessage("hello", new Object[]{"Ongky"}, Locale.ENGLISH);
        Assertions.assertEquals("Hello Ongky", message);
    }

    @Test
    void testIndonesianLocal() {
        String message = messageSource.getMessage("hello", new Object[]{"Ongky"}, new Locale("in_ID"));
        Assertions.assertEquals("Halo Ongky", message);
    }

    @SpringBootApplication
    public static class TestApplication{

        @Bean
        public MessageSource messageSource(){
            ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
            messageSource.setBasenames("my");

            return messageSource;
        }
    }
}
