package com.cap.apigestionhotel.impl;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cap.apigestionhotel.dao.PagoDao;
import com.cap.apigestionhotel.dao.entity.Pago;
import com.cap.apigestionhotel.dao.mapper.PagoMapper;

@Component
public class PagoImpl implements PagoDao {

	private final PagoMapper pagoMapper;
	
	public PagoImpl(PagoMapper pagoMapper) {
		this.pagoMapper = pagoMapper;
	}

	@Override
	public List<Pago> findAll() {
		return pagoMapper.findAll();
	}

	public Pago findPago(int pag_id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void insert(Pago pago) {
		// TODO Auto-generated method stub
		
	}


	public void update(int pag_id, int pag_re_id, float pag_total, Date pag_fecha_pago) {
		// TODO Auto-generated method stub
		
	}

	public void delete(int pag_id) {
		// TODO Auto-generated method stub
		
	}

}
