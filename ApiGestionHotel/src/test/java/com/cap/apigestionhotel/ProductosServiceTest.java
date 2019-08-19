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
import com.cap.apigestionhotel.dao.entity.Productos;
import com.cap.apigestionhotel.service.PagoService;
import com.cap.apigestionhotel.service.ProductosService;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class ProductosServiceTest {

	@Autowired
	private ProductosService productosService;
		
	Productos producto = new Productos();
	
    @Before
    public void ProductosServiceTest() {
    	
    	producto.setPro_nombre("Vodka");
    	producto.setPro_precio_venta(20);
    	producto.setPro_unidad_medida("Litros");
    }
    
	
	

    @Test
    public void findAllTest() {
        Assert.assertEquals( HttpStatus.OK, productosService.findAll().getStatusCode());
    }
    
    @Test
    public void findPagoTest() {
        Assert.assertEquals( HttpStatus.OK, productosService.findProductos(producto.getPro_id()).getStatusCode());
    }
    
    @Test
    public void insertTest() {
        Assert.assertEquals( HttpStatus.CREATED, productosService.insert(producto).getStatusCode());
    }
    
    @Test
    public void updateTest() {
        Assert.assertEquals( HttpStatus.OK, productosService.update(producto).getStatusCode());
    }
   
    @Test
    public void deleteTest() {
        Assert.assertEquals( HttpStatus.OK, productosService.delete(producto.getPro_id()).getStatusCode());
    }
    
}
