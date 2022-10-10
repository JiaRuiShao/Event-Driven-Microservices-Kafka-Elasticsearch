package com.microservices.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * We use @Configuration so that Spring creates a Spring bean in the application context.
 * Note: If we don't use @Configuration in the POJO, then we need to add @EnableConfigurationProperties(ConfigProperties.class) in the main Spring application class to bind the properties into the POJO.
 *
 * @ConfigurationProperties works best with hierarchical properties that all have the same prefix.
 * After Spring Boot 2.2, scanning of @ConfigurationProperties needs to be explicitly opted into by adding the @ConfigurationPropertiesScan annotation. Therefore, we don't have to annotate such classes with @Component (and other meta-annotations like @Configuration), or even use the @EnableConfigurationProperties
 * Reference: https://www.baeldung.com/configuration-properties-in-spring-boot
 */
@Data
// @Configuration
@ConfigurationProperties(prefix = "twitter-to-kafka-service") // this prefix name has to match with the property name in application.yml
public class TwitterToKafkaServiceConfigData {
	private List<String> twitterKeywords;
	private String welcomeMessage;
}

