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

import com.cap.apigestionhotel.dao.entity.Clientes;
import com.cap.apigestionhotel.dao.entity.Pago;
import com.cap.apigestionhotel.dao.entity.Productos;
import com.cap.apigestionhotel.service.ClientesService;
import com.cap.apigestionhotel.service.PagoService;
import com.cap.apigestionhotel.service.ProductosService;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class ClientesServiceTest {

	@Autowired
	private ClientesService clientesService;
		
	Clientes cliente = new Clientes();
	
    @Before
    public void PagoServiceTest() {
    	
    	cliente.setCli_nombre("Manolo");
    	cliente.setCli_apellido("Lama");
    	cliente.setCli_email("manuelito@gmail.com");
    	cliente.setCli_direccion("Pedro Pablo 31");
    	cliente.setCli_codigopos(33205);
    	cliente.setPassword("09696785");
    	cliente.setCli_ciudad("Mieres");
    }
    
	
	

    @Test
    public void findAllTest() {
        Assert.assertEquals( HttpStatus.OK, clientesService.findAll().getStatusCode());
    }
    
    @Test
    public void findPagoTest() {
        Assert.assertEquals( HttpStatus.OK, clientesService.findCliente(cliente.getCli_dni()).getStatusCode());
    }
    
    @Test
    public void insertTest() {
    	cliente.setCli_dni("234455984");
        Assert.assertEquals( HttpStatus.CREATED, clientesService.insert(cliente).getStatusCode());
    }
    
    @Test
    public void updateTest() {
        Assert.assertEquals( HttpStatus.OK, clientesService.update(cliente).getStatusCode());
    }
   
    @Test
    public void deleteTest() {
        Assert.assertEquals( HttpStatus.OK, clientesService.delete(cliente.getCli_dni()).getStatusCode());
    }
    
}
