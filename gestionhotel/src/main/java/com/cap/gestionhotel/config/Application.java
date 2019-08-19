package com.cap.gestionhotel.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.client.RestTemplate;

import com.cap.gestionhotel.model.ClienteLoginDto;

@Configuration
@ComponentScan(basePackages = "com.cap.gestionhotel")
@ComponentScan(basePackages = "com.cap.gestionhotel.hotel")
@Import({BeanConfig.class, WebConfig.class})
@EnableAutoConfiguration
public class Application extends SpringBootServletInitializer{

	private static Class<Application> applicationClass = Application.class;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(applicationClass);
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	@Bean
    public ClienteLoginDto clienteLoginDto() {
        return ClienteLoginDto.getInstance();
    }

}