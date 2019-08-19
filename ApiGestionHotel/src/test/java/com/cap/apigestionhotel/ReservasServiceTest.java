package com.cap.apigestionhotel;

import java.sql.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.cap.apigestionhotel.dao.entity.Reservas;
import com.cap.apigestionhotel.service.ReservasService;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional//hace rollback de los cambios que se hayan hecho durante la prueba
public class ReservasServiceTest {

	@Autowired
	private ReservasService reservasService;
		
	Reservas reserva ;
	
    @Before
    public void ReservasServiceTest() {
    	reserva = new Reservas();
    	reserva.setRe_cli_dni("12345678J");
    	reserva.setRe_coste_alojamiento(243.25F);
    	reserva.setRe_estado("reservado");
    	reserva.setRe_fecha_fin(Date.valueOf(("2019-09-10")));
    	reserva.setRe_fecha_ini(Date.valueOf(("2019-09-5")));
    	reserva.setRe_fecha_reserva(Date.valueOf(("2019-09-1")));
    	reserva.setRe_ha_id(12);
    	    }

    @Test
    public void findAllTest() {
        Assert.assertEquals( HttpStatus.OK, reservasService.findAll().getStatusCode());
    }
    
    @Test
    public void findPagoTest() {
        Assert.assertEquals( HttpStatus.OK, reservasService.findReserva(reserva.getRe_id()).getStatusCode());
    }
    
    @Test
    public void insertTest() {
        Assert.assertEquals( HttpStatus.CREATED, reservasService.insert(reserva).getStatusCode());
    }
    
    @Test
    public void updateTest() {
        Assert.assertEquals( HttpStatus.OK, reservasService.update(reserva).getStatusCode());
    }
   
    @Test
    public void deleteTest() {
        Assert.assertEquals( HttpStatus.OK, reservasService.delete(6).getStatusCode());
    }

}
