package com.len.chessdemo.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Run with ./mvnw spring-boot:run
@SpringBootApplication
public class ChessDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChessDemoApplication.class, args);
	}

//	@Bean
//	public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter() {
//		ObjectMapper mapper = new ObjectMapper();
//		mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
//		MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter(mapper);
//
//		return converter;
//	}
}
