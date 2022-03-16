package com.programmerzamannow.spring.config;

import com.programmerzamannow.spring.config.converter.StringtoDateConverter;
import com.programmerzamannow.spring.config.runner.ApplicationPropertiesRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.annotation.Bean;
import org.springframework.core.convert.ConversionService;
import properties.ApplicationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
		ApplicationProperties.class
})
public class BelajarSpringConfigPropertiesApplication {

	@Bean
	public ConversionService conversionService(StringtoDateConverter stringtoDateConverter){
		ApplicationConversionService conversionService = new ApplicationConversionService();
		conversionService.addConverter(stringtoDateConverter);
		return conversionService;
	}

	public static void main(String[] args) {
		SpringApplication.run(BelajarSpringConfigPropertiesApplication.class, args);
	}

}
