package com.cap.apigestionhotel.impl;

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

}
