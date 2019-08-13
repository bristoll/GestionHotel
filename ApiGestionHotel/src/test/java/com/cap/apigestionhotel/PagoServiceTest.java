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

import com.cap.apigestionhotel.dao.entity.Pago;
import com.cap.apigestionhotel.service.PagoService;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class PagoServiceTest {

	@Autowired
	private PagoService pagoService;
		
	Pago pago = new Pago();
	
    @Before
    public void PagoServiceTest() {
    	
    	pago.setPag_re_id(37);
    	pago.setPag_total(66);
    	pago.setPag_fecha_pago(Date.valueOf("2018-02-12"));	
    }
    
	
	

    @Test
    public void findAllTest() {
        Assert.assertEquals( HttpStatus.OK, pagoService.findAll().getStatusCode());
    }
    
    @Test
    public void findPagoTest() {
        Assert.assertEquals( HttpStatus.OK, pagoService.findPago(pago.getPag_id()).getStatusCode());
    }
    
    @Test
    public void insertTest() {
        Assert.assertEquals( HttpStatus.CREATED, pagoService.insert(pago).getStatusCode());
    }
    
    @Test
    public void updateTest() {
        Assert.assertEquals( HttpStatus.OK, pagoService.update(pago).getStatusCode());
    }
   
    @Test
    public void deleteTest() {
        Assert.assertEquals( HttpStatus.OK, pagoService.delete(6).getStatusCode());
    }
    
}
