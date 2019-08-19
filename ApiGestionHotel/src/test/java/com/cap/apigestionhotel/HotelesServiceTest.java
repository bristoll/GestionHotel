package com.cap.apigestionhotel;

import java.sql.Date;

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

import com.cap.apigestionhotel.dao.entity.Pago;
import com.cap.apigestionhotel.dao.entity.Hoteles;
import com.cap.apigestionhotel.service.HotelesService;
import com.cap.apigestionhotel.service.PagoService;
import com.cap.apigestionhotel.service.ProductosService;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class HotelesServiceTest {

	@Autowired
	private HotelesService hotelesService;
		
	Hoteles hotel = new Hoteles();
	
    @Before
    public void HotelesServiceTest() {
    	
    	hotel.setHo_nombre("Hotel el Picador");
    	hotel.setHo_categoria("5 estrellas");
    	hotel.setHo_zona("Zona Oeste");
    	hotel.setHo_direccion("Calle del Picador");
    }
    
	
	

    @Test
    public void findAllTest() {
        Assert.assertEquals( HttpStatus.OK, hotelesService.findAll().getStatusCode());
    }
    
    @Test
    public void findPagoTest() {
        Assert.assertEquals( HttpStatus.OK, hotelesService.findHotel(hotel.getHo_id()).getStatusCode());
    }
    
    @Test
    public void insertTest() {
        Assert.assertEquals( HttpStatus.CREATED, hotelesService.insert(hotel).getStatusCode());
    }
    
    @Test
    public void updateTest() {
        Assert.assertEquals( HttpStatus.OK, hotelesService.update(hotel).getStatusCode());
    }
   
    @Test
    public void deleteTest() {
        Assert.assertEquals( HttpStatus.OK, hotelesService.delete(hotel.getHo_id()).getStatusCode());
    }
    
}
