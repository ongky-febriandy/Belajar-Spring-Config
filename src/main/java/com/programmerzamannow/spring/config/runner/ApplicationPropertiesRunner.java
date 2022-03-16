package com.programmerzamannow.spring.config.runner;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import properties.ApplicationProperties;

@Component
@AllArgsConstructor
@Slf4j
public class ApplicationPropertiesRunner implements ApplicationRunner {

    //Inject pakai AllargsConstructor
    private ApplicationProperties properties;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info(properties.getName());
        log.info(String.valueOf(properties.getVersion()));
        log.info(String.valueOf(properties.isProductionMode()));

    }
}
