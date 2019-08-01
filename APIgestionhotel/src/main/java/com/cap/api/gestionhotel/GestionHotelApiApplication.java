package com.cap.api.gestionhotel;

import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cap.gestionhotel.dao.entitys.Hotel;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
@EnableSwagger2
@MappedTypes(Hotel.class)
@MapperScan("com.cap.gestionhotel.dao.mapper")
@SpringBootApplication
public class GestionHotelApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionHotelApiApplication.class, args);
	}

}
