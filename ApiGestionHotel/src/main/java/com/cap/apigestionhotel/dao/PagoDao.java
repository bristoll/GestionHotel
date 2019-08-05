package com.cap.apigestionhotel.dao;

import java.sql.Date;
import java.util.List;

import com.cap.apigestionhotel.dao.entity.Pago;

public interface PagoDao {
	
	public List<Pago> findAll();
	public Pago findPago(int pag_id);
	public void insert(Pago pago);
	public void update(Pago pago);
	public void delete(int pag_id);

}
