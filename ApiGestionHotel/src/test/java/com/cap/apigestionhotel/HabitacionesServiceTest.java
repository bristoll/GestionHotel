package com.cap.apigestionhotel;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.cap.apigestionhotel.dao.entity.Habitaciones;
import com.cap.apigestionhotel.service.HabitacionesService;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class HabitacionesServiceTest {

	@Autowired
	HabitacionesService habitacionesService;
	
	private Habitaciones habitacion;
	
	@Before
	public void HabitacionesServiceTest() {
		
		habitacion = new Habitaciones();
		
		habitacion.setHa_camas(1);
		habitacion.setHa_clase("Algo");
		habitacion.setHa_dis("Algo");
		habitacion.setHa_ho_id(1);
		habitacion.setHa_id(1);
		habitacion.setHa_numero(1);
		habitacion.setHa_personas(1);
		habitacion.setHa_piso(1);
		habitacion.setHa_precio(1);
		habitacion.setHa_vista("Algo");
		
	};
	
	@Test
	public void findAll() {
		Assert.assertEquals( HttpStatus.OK, habitacionesService.findAll().getStatusCode());
    }
	
	@Test
	public void findHabitacion() {
		Assert.assertEquals( HttpStatus.OK, habitacionesService.findHabitacion(1).getStatusCode());
    }
	
	@Test
	public void insert() {        
		Assert.assertEquals( HttpStatus.CREATED, habitacionesService.insert(habitacion).getStatusCode());
    }
	
	@Test
	public void update(Habitaciones habitacion) {
		Assert.assertEquals( HttpStatus.CREATED, habitacionesService.update(habitacion).getStatusCode());
	}
	
	@Test
	public void delete() {
		Assert.assertEquals( HttpStatus.CREATED, habitacionesService.delete(habitacion.getHa_id()).getStatusCode());
	}
	
}
