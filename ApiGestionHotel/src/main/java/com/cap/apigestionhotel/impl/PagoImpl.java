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
		return pagoMapper.findPago(pag_id);
	}

	public void insert(Pago pago) {
		pagoMapper.insert(pago);		
	}


	public void update(int pag_id, int pag_re_id, float pag_total, Date pag_fecha_pago) {
		pagoMapper.update(pag_id, pag_re_id, pag_total, pag_fecha_pago);	
	}

	public void delete(int pag_id) {
		pagoMapper.delete(pag_id);		
	}

}
